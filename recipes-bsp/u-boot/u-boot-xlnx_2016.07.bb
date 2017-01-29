include u-boot-xlnx.inc
include u-boot-spl-zynq-init.inc

XILINX_RELEASE_VERSION = "v2016.3"
# this matches u-boot-xlnx 'xilinx-v2016.3' release tag
SRCREV = "95e11f6eb4bc07bbee12a4217c58146bddac61b2"
PV = "v2016.07-xilinx-${XILINX_RELEASE_VERSION}+git${SRCPV}"

FILESEXTRAPATHS_prepend := "${THISDIR}/u-boot-xlnx:"
FILESEXTRAPATHS_prepend := "${THISDIR}/u-boot:"

SRC_URI_append = " \
                file://0001-fdt-add-memory-bank-decoding-functions-for-board-set.patch \
                file://0002-ARM-zynq-Replace-board-specific-with-generic-memory-.patch \
                file://0003-ARM64-zynqmp-Replace-board-specific-with-generic-mem.patch \
                "

SRC_URI_append_kc705-microblazeel = " file://microblaze-kc705-Convert-microblaze-generic-to-k.patch"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=6;md5=157ab8408beab40cd8ce1dc69f702a6c"

UBOOT_ENV_zc702-zynq7 = "uEnv"
UBOOT_ENV_zedboard-zynq7 = "uEnv"

SRC_URI_append_zc702-zynq7 = " file://uEnv.txt"
SRC_URI_append_zedboard-zynq7 = " file://uEnv.txt"

SRC_URI_append = " file://u-boot-xlnx-zturn.patch \
	file://zturn-ps7_init_gpl.patch"
#	file://u-boot-xlnx-zturn-redund.patch \
# The redund patch contains stuff Myir put in which appears to be redundant now

# u-boot 2016.07 has support for these
HAS_PS7INIT ?= " \
		zynq_microzed_config \
		zynq_zed_config \
		zynq_zc702_config \
		zynq_zc706_config \
		zynq_zybo_config \
		zynq_zturn_config \
		"

