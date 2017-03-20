require recipes-images/angstrom/console-image.bb

IMAGE_FEATURES += " debug-tweaks"

IMAGE_INSTALL += " \
	mc \
	haveged \
	kernel-modules \
	"

export IMAGE_BASENAME = "zturn-image"
