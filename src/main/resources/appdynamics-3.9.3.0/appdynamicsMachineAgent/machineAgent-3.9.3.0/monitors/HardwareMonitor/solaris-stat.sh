#!/usr/bin/env bash
#
# Monitors CPU, Memory, Network and Disks on Solaris
#
# version 2.2
#########################################
#
# depends on /usr/bin/awk /usr/bin/kstat /usr/bin/iostat /usr/sbin/prtconf
#            /usr/bin/expr
#
# produce a report, once per minute, which contains lots of machine statistics
# this is how long we wait between network samples to calculate a delta.
TIME=60
SAMPLE=50

# this magic 3 is a fudge factor to try to make the program always take $TIME
# seconds. this is not always successful, being dependent on load. 
# the definitive fix for this is to sleep for a variable amount of time,
# depending on the start second count.  I've written a marvelous implementation
# of this, but it won't fit on the page.
SLEEPTIME=`/usr/bin/expr $TIME - $SAMPLE - 3`

# this does not vary per run, so it is factored out of the loop
MEM_TOTAL_MB=`/usr/sbin/prtconf 2>/dev/null | /usr/bin/awk '/^Memory size/ { print $3 }'`

# forever
while [ 1 ]; do

#
# this code works as follows: the first time we see a network interface 
# or disk, we set seen to 2. the next time, we set it to 4.
# then, whenever we see a statistic, we subtract 3 from this magic number.
# this gives us a -1 or a 1.  this is what we multiply the statistic by
# and accumulate it.  given exactly two samples, this means that it is a
# delta between the two samples.
#
# furthermore, we iterate over all the interfaces we have, so that we sum all 
# the interface rates for our final output.
#
# any network interface not having a ierror is ignored, being some kind
# of virtual tunnel or something. we only report real_interface[] stats.
#
# finally, we divide by the number of seconds between samples
#
eval `/usr/bin/kstat -T u -c "/net|disk/" $SAMPLE 2 | /usr/bin/awk '
	/^[0-9]+/ { if (seconds) { seconds += $1; } else { seconds = - $1; } }
	/^module:/ { next; }
	/^name:/ { 
		name=$2; 
		type = $4;
		if (type == "net") {
			netseen[name] += 2; 
		} else {
			diskseen[name] += 2;
		}
	}
	$1 == "ierrors" && name != "mac" { real_interface[name] = 1; }

	$1 == "opackets" { np_out[name] += $2 * (netseen[name] - 3);}
	$1 == "ipackets" { np_in[name] += $2 * (netseen[name] - 3);}
	$1 == "obytes" { nb_out[name] += $2 * (netseen[name] - 3);}
	$1 == "rbytes" { nb_in[name] += $2 * (netseen[name] - 3);}

	$1 == "nread" { din[name] += $2 * (diskseen[name] - 3);}
	$1 == "nwritten" { dout[name] += $2 * (diskseen[name] - 3);}
	$1 == "writes" { dwrites[name] += $2 * (diskseen[name] - 3);}
	$1 == "reads" { dreads[name] += $2 * (diskseen[name] - 3);}

	END {
		for (ifname in netseen) {
			if (real_interface[ifname] == 0) {
				continue;
			}
			kb_in += nb_in[ifname];
			kb_out += nb_out[ifname];
			pkt_out += np_out[ifname];
			pkt_in += np_in[ifname];
		}	
		for (disk in diskseen) {
			disk_in += din[disk];
			disk_out += dout[disk];
			disk_writes += dwrites[disk];
			disk_reads += dreads[disk];
		}	

		kb_in = ((kb_in / seconds) + 1023) / 1024;
		kb_out = ((kb_out / seconds) + 1023) / 1024;
		disk_in = ((disk_in / seconds) + 1023) / 1024;
		disk_out = ((disk_out / seconds) + 1023) / 1024;

		pkt_in /= seconds;
		pkt_out /= seconds;
		disk_reads /= seconds;
		disk_writes /= seconds;

		printf("NET_KBYTES_IN=%d\n", kb_in);
		printf("NET_KBYTES_OUT=%d\n", kb_out);
		printf("NET_PACKETS_IN=%d\n", pkt_in);
		printf("NET_PACKETS_OUT=%d\n", pkt_out);

		printf("READS=%d\n", disk_reads);
		printf("WRITES=%d\n", disk_writes);
		printf("READS_KB=%d\n", disk_in);
		printf("WRITES_KB=%d\n", disk_out);
	}
'`

# CPU

#
# Check if the zonename(1) utility exists.  If not, this system is likely running
# Solaris 8 or 9, so use vmstat(1m) to gather the CPU utilization.
#
ZONENAME=$(which zonename)

if [[ -x "${ZONENAME}" ]]; then
    zone=`${ZONENAME}`
    CPU_BUSY_TEMP=`prstat -Z 1 1 | grep $zone | awk ' { print $7 } ' | sed 's/%//'`
    CPU_BUSY=`printf "%0.f\n" $CPU_BUSY_TEMP`
    CPU_IDLE=`expr 100 - $CPU_BUSY`
else
    CPU_IDLE_TEMP=`vmstat 1 2 | tail -1 | awk '{print $22}'`
    CPU_IDLE=${CPU_IDLE_TEMP}
    CPU_BUSY=`expr 100 - $CPU_IDLE`
fi


# MEMORY usage

 MEM_FREE_MB=`/usr/bin/kstat -p unix::system_pages:freemem | /usr/bin/awk '{printf("%d",$2/1024);}'`

 MEM_USED_MB=`/usr/bin/expr $MEM_TOTAL_MB - $MEM_FREE_MB`

 MEM_USED_PC=`/usr/bin/expr $MEM_USED_MB \* 100 / $MEM_TOTAL_MB`
 MEM_FREE_PC=`/usr/bin/expr 100 - $MEM_USED_PC`
 
# Output area
 echo "name=Hardware Resources|CPU|%Idle,value="$CPU_IDLE
 echo "name=Hardware Resources|CPU|%Busy,value="$CPU_BUSY
 echo "name=Hardware Resources|Memory|Total (MB),value="$MEM_TOTAL_MB
 echo "name=Hardware Resources|Memory|Used (MB),value="$MEM_USED_MB
 echo "name=Hardware Resources|Memory|Free (MB),value="$MEM_FREE_MB
 echo "name=Hardware Resources|Memory|Used %,value="$MEM_USED_PC
 echo "name=Hardware Resources|Memory|Free %,value="$MEM_FREE_PC
 echo "name=Hardware Resources|Network|Incoming packets/sec,value="$NET_PACKETS_IN
 echo "name=Hardware Resources|Network|Outgoing packets/sec,value="$NET_PACKETS_OUT
 echo "name=Hardware Resources|Network|Incoming KB/sec,value="$NET_KBYTES_IN
 echo "name=Hardware Resources|Network|Outgoing KB/sec,value="$NET_KBYTES_OUT
 echo "name=Hardware Resources|Disks|Reads/sec,value="$READS
 echo "name=Hardware Resources|Disks|Writes/sec,value="$WRITES
 echo "name=Hardware Resources|Disks|KB read/sec,value="$READS_KB
 echo "name=Hardware Resources|Disks|KB written/sec,value="$WRITES_KB

/usr/bin/sleep $SLEEPTIME

done
