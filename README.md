meta-zturn
==========

This layer is a crude first stab at creating OpenEmbedded/Angstrom support for the Myir Z-Turn 7020 board. The purpose was for me to get to know the chip, but hey, maybe someone could also find it useful.

For more information see:
https://wiki.hackerspace.pl/projects:zturn-hackers
https://github.com/q3k/zturn-stuff
(Thanks guys!)

Based on the above the information, ZTurn support was added to newer versions of u-boot-xlnx and linux-xlnx, much newer than what Myir was running.

This repository does not (as yet) supply any bitstreams. The original bitstreams released by MYIR should work (7z020-hdmi.bit was tested), which can be extracted from MYIR supplied CD (also available via links in the zturn-stuff repo listed above). Compiling the mys-xc7z020-trd project also resulted in a working bitstream.

To create a custom bitstream from scratch, start with https://wiki.hackerspace.pl/projects:zturn-hackers:helloworld as the resulting bitstream boots just fine, albeit without the LED, accelerometer and temperature sensor.

Tweaks
------
The MYIR images/bitstreams included support vir xylonfb. To enable kernel support for zturn modified linux-xlnx, uncomment the lines indicated at the bottom of meta-zturn/recipes-kernel/linux/linux-xlnx_4.6.bb.

Known issues:
------------
Connman takes ages to initialise, apparantly because it is blocking on "random: nonblocking pool is initialized". Added haveged to the image, and tweaked connman.service to at least not block log-in.
