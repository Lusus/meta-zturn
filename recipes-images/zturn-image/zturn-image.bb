require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += " debug-tweaks"

IMAGE_INSTALL += " \
	mc \
	haveged \
	kernel-modules \
	"

export IMAGE_BASENAME = "zturn-image"
