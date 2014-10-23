#!/bin/sh
#
# Monitors CPU, Memory, Network and Disks on Linux
#
# version 1.3
#
# rewrite using only:
# date, vmstat, awk, cat, sleep, tr, /proc/net/dev, /proc/diskstats, /proc/meminfo
#########################################

MOUNTS=
# uncomment the next line to enable custom metrics for mounted filesystems
#MOUNTS=`mount| awk '/^\/dev/ {sub("/dev/","",$1);printf("%s:%s;",$1, $3)}'`
# uncomment the next line to enable custom metrics for swap
#MOUNTS+=`awk '/\/dev/ {sub("/dev/","",$1);printf("%s:swap;",$1)}'< /proc/swaps`

# interval between reads of network and disk numbers
SAMPLE=10

PATH=$PATH:/bin:/usr/sbin:/sbin:/usr/bin:/usr/local/sbin:/usr/local/bin

while [ 1 ]; do
NEXTSECONDS=`date +%s | awk '{print $1 + 60}'`

# cpu stats
vmstat | awk -v OFS="" '
	END {
		idle = $15;
print "name=Hardware Resources|CPU|%Idle,value=", idle;
print "name=Hardware Resources|CPU|%Busy,value=", 100 - idle;
	}
'

# memory statistics
cat /proc/meminfo | awk -v OFS="" '
	/^MemTotal/ { MEM_TOTAL_MB = int($2 / 1024); }
	/^MemFree/ { MEM_FREE_MB = int($2 / 1024); }
	/^Cached/ { MEM_CACHE_MB = int($2 / 1024); }
	END {
		MEM_USED_MB = MEM_TOTAL_MB - MEM_FREE_MB;
print "name=Hardware Resources|Memory|Total (MB),value=", MEM_TOTAL_MB;
print "name=Hardware Resources|Memory|Used (MB),value=", MEM_USED_MB;
print "name=Hardware Resources|Memory|Free (MB),value=", MEM_FREE_MB;
print "name=Hardware Resources|Memory|Used %,value=", 
	int((MEM_USED_MB / MEM_TOTAL_MB) * 100);
print "name=Hardware Resources|Memory|Free %,value=", 
	100 - int((MEM_USED_MB / MEM_TOTAL_MB) * 100);
	}
'

# net statistics
(cat /proc/net/dev ; sleep $SAMPLE; cat /proc/net/dev) | tr ':' ' ' | 
	awk -v interval=$SAMPLE -v OFS="" '
	NF == 17 {
		dev = $1;
		if (seen[dev]) {
			bread[dev] = $2 - bread[dev];
			pread[dev] = $3 - pread[dev];
			bwrite[dev] = $10 - bwrite[dev];
			pwrite[dev] = $11 - pwrite[dev];
		} else {
			bread[dev] = $2;
			pread[dev] = $3;
			bwrite[dev] = $10;
			pwrite[dev] = $11;
		}
		seen[dev] = 1;	
	}
	END {
		for (dev in seen) {
			readk += bread[dev];
			writek += bwrite[dev];
			preads += pread[dev];
			pwrites += pwrite[dev];

		}
		NET_KBYTES_IN = int((readk / 1024) / interval);
		NET_KBYTES_OUT = int((writek / 1024) / interval);
		NET_PACKETS_IN = int(preads / interval);
		NET_PACKETS_OUT = int(pwrites / interval);

print "name=Hardware Resources|Network|Incoming packets/sec,value=", NET_PACKETS_IN;
print "name=Hardware Resources|Network|Outgoing packets/sec,value=", NET_PACKETS_OUT
print "name=Hardware Resources|Network|Incoming KB/sec,value=", NET_KBYTES_IN
print "name=Hardware Resources|Network|Outgoing KB/sec,value=", NET_KBYTES_OUT
	}
'

# disk statistics
(cat /proc/diskstats ; sleep $SAMPLE; cat /proc/diskstats) | 
	awk -v interval=$SAMPLE -v mounts=$MOUNTS -v OFS="" '
	BEGIN {
		fss = split(mounts, fslist, ";");
		for (f = 1; f < fss; f++) {
			split(fslist[f], fe, ":");
			fs[fe[1]] = fe[2];
		}
	}
	NF == 14 { 
		dev = $3; 
		if (seen[dev]) {
			r[dev] = $4 - r[dev];
			rsec[dev] = $6 - rsec[dev];
			w[dev] = $8 - w[dev];
			wsec[dev] = $10 - wsec[dev];
		} else {
			r[dev] = $4;
			rsec[dev] = $6;
			w[dev] = $8;
			wsec[dev] = $10;
		}
		seen[dev] = 1;
	}
	END {
		/* dont sum devices ending in digits, they are partitions */
		for (dev in seen) {
			if (match(dev, "[0-9]$") != 0) {
				continue;
			}
			reads += r[dev];
			readsk += rsec[dev] / 2;
			writes += w[dev];
			writesk += wsec[dev] / 2;
		}

		if (reads < 0) reads = 0;
		if (readsk < 0) readsk = 0;
		if (writes < 0) writes = 0;
		if (writesk < 0) writesk = 0;

print "name=Hardware Resources|Disks|Reads/sec,value=", int(reads/interval);
print "name=Hardware Resources|Disks|Writes/sec,value=", int(writes/interval);
print "name=Hardware Resources|Disks|KB read/sec,value=", int(readsk/interval);
print "name=Hardware Resources|Disks|KB written/sec,value=", int(writesk/interval);
		for (dev in fs) {
			reads = r[dev];
			readsk = rsec[dev] / 2;
			writes = w[dev];
			writesk = wsec[dev] / 2;
			if (reads < 0) reads = 0;
			if (readsk < 0) readsk = 0;
			if (writes < 0) writes = 0;
			if (writesk < 0) writesk = 0;

printf("name=Custom Metrics|Disks %s|Reads/sec,value=%d\n", fs[dev], int(reads/interval));
printf("name=Custom Metrics|Disks %s|Writes/sec,value=%d\n", fs[dev], int(writes/interval));
printf("name=Custom Metrics|Disks %s|KB read/sec,value=%d\n", fs[dev], int(readsk/interval));
printf("name=Custom Metrics|Disks %s|KB written/sec,value=%d\n", fs[dev], int(writesk/interval));
		}
	}
'

SLEEPTIME=`date +"$NEXTSECONDS %s" | awk '{if ($1 > $2) print $1 - $2; else print 0;}'`
sleep $SLEEPTIME

done
