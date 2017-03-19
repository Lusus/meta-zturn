LINUX_VERSION = "4.6"
XILINX_RELEASE_VERSION = "v2016.3"
SRCREV ?="0e4e4071493171bbac37bf60709022f49171c813"

include linux-xlnx.inc

SRC_URI_append_zybo-linux-bd-zynq7 = " \
	file://0001-drm-xilinx-Add-encoder-for-Digilent-boards.patch \
	file://0002-clk-Add-driver-for-axi_dynclk-IP-Core.patch \
	file://0003-drm-xilinx-Fix-DPMS-transition-to-on.patch \
	"

SRC_URI_append = " file://linux-xlnx-zturn.patch \
	file://defconfig"

KERNEL_DEVICETREE = "zynq-zturn.dtb"

# If xylonfb support is desired, uncomment the following lines:
#SRC_URI_append += " file://linux-xlnx-zturn-xylon.patch"
#KERNEL_DEVICETREE += " zynq-zturn-xylon.dtb"
