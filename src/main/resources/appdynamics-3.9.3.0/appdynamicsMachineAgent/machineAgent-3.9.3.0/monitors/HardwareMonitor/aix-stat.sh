#!/usr/bin/bash
#
# Monitors CPU, Memory, Network and Disks on aix
#
# version 1.2
#
# rewrite using only:
# vmstat, awk, sleep, iostat and netstat
# tested on aix7
#########################################

# Set unspecified system commands
SAMPLE=10
LOOPTIME=60

PATH=/usr/bin

while [ 1 ]; do

	NOW=`date +%s`
	NEXTSECONDS=`expr $NOW + $LOOPTIME`

# disk statistics
iostat -D 1 1 | awk -v OFS="" '
	function units(arg) {
		val = arg + 0;
		if (arg ~ "K$") val *= 1000;
		if (arg ~ "M$") val *= 1000000;
		return int(val);
	}
	$2 == "xfer:" { state = 1; next; }
	NF == 5 && state == 1 {
		rk += units($4);
		wk += units($5);
		next;
	}
	$1 == "read:" { state = 2; next; }
	NF == 6 && state == 2 {
		reads += $1;
	}
	$1 == "write:" { state = 3; next; }
	NF == 6 && state == 3 {
		writes += $1;
	}
	END {
print "name=Hardware Resources|Disks|KB read/sec,value=", int(rk/1000);
print "name=Hardware Resources|Disks|KB written/sec,value=", int(wk/1000);
print "name=Hardware Resources|Disks|Reads/sec,value=", int(reads);
print "name=Hardware Resources|Disks|Writes/sec,value=", int(writes);
	}
'

# net statistics
(netstat -v ; sleep $SAMPLE; netstat -v) | 
	awk -v interval=$SAMPLE -v OFS="" '
	/^ETHERNET STATISTICS/ {
		dev = $3;
		seen[dev]++;
	}
	/^Packets:/ {
		if (seen[dev] == 2) {
			inpkts[dev] = $4 - inpkts[dev];
			outpkts[dev] = $2 - outpkts[dev];
		} else {
			inpkts[dev] = $4;
			outpkts[dev] = $2;
		}
	}
	/^Bytes:/ {
		if (seen[dev] == 2) {
			inbytes[dev] = $4 - inbytes[dev];
			outbytes[dev] = $2 - outbytes[dev];
		} else {
			inbytes[dev] = $4;
			outbytes[dev] = $2;
		}
	}
	END {
		for (i in seen) {
			ipkts += inpkts[i];
			opkts += outpkts[i];
			ibytes += inbytes[i];
			obytes += outbytes[i];
		}
		NET_PACKETS_IN = int(ipkts / interval);
		NET_PACKETS_OUT = int(opkts / interval);
		NET_KBYTES_IN = int((ibytes / 1024) / interval);
		NET_KBYTES_OUT = int((obytes / 1024) / interval);

print "name=Hardware Resources|Network|Incoming packets/sec,value=", NET_PACKETS_IN;
print "name=Hardware Resources|Network|Outgoing packets/sec,value=", NET_PACKETS_OUT
print "name=Hardware Resources|Network|Incoming KB/sec,value=", NET_KBYTES_IN
print "name=Hardware Resources|Network|Outgoing KB/sec,value=", NET_KBYTES_OUT
	}
'

# cpu and memory statistics

vmstat 1 1 | awk -v OFS="" '
	/^System/ {
		for (p=3; p<=NF; p++) {
			if (split($p, kv,"=") == 2) {
				v = kv[2];
				sub("KB", "", v);
				if (sub("MB", "", v)) {
					v *= 1024;
				}
				if (sub("GB", "", v)) {
					v *= 1024 * 1024;
				}
				c[kv[1]] = v;
			}
		}
	}
	{
		MEM_FREE_KB = $4 * 4;
		idle = $16;
	}
	END {
		MEM_TOTAL_KB = c["mem"];
		MEM_USED_KB = MEM_TOTAL_KB - MEM_FREE_KB;
print "name=Hardware Resources|CPU|%Idle,value=", idle;
print "name=Hardware Resources|CPU|%Busy,value=", 100 - idle;

print "name=Hardware Resources|Memory|Total (MB),value=", int(MEM_TOTAL_KB / 1024);
print "name=Hardware Resources|Memory|Used (MB),value=", int(MEM_USED_KB / 1024);
print "name=Hardware Resources|Memory|Free (MB),value=", int(MEM_FREE_KB / 1024);
print "name=Hardware Resources|Memory|Used %,value=", 
	int((MEM_USED_KB / MEM_TOTAL_KB) * 100);
print "name=Hardware Resources|Memory|Free %,value=", 
	int((MEM_FREE_KB / MEM_TOTAL_KB) * 100);
	}
'

	NOW=`date +%s`
        SLEEPTIME=`expr $NEXTSECONDS - $NOW`
        if [ $SLEEPTIME -gt 0 ] ; then
                sleep $SLEEPTIME
        fi

done
