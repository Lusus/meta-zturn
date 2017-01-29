meta-zturn
==========

This layer is a crude first stab at creating OpenEmbedded/Angstrom support for the Myir Z-Turn 7020 board. The purpose was for me to get to know the chip, but hey, maybe someone could also find it useful.

For more information see:
https://wiki.hackerspace.pl/projects:zturn-hackers
https://github.com/q3k/zturn-stuff
(Thanks guys!)

Based on the above the information, ZTurn support was added to newer versions of u-boot-xlnx and linux-xlnx, much newer than what Myir was running.

Known issues:

Connman takes ages to initialise, apparantly because it is blocking on "random: nonblocking pool is initialized". Added haveged to the image, and tweaked connman.service to at least not block log-in.
