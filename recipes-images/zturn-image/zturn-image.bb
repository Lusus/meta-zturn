require recipes-images/angstrom/console-image.bb

IMAGE_FEATURES += " debug-tweaks"

IMAGE_INSTALL += " \
	mc \
	haveged \
	"

export IMAGE_BASENAME = "zturn-image"
