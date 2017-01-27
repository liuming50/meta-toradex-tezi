SUMMARY="Toradex Tester initramfs"

# We are using the rootfs as initramfs
IMAGE_FSTYPES="cpio.gz squashfs"
IMAGE_FEATURES+="debug-tweaks read-only-rootfs"

IMAGE_INSTALL += " \
    ${CORE_IMAGE_BASE_INSTALL} \
    dosfstools \
    mmc-utils \
    spitools \
    tester-scripts \
    util-linux \
    util-linux-sfdisk \
    ldd \
    strace \
"

LICENSE="MIT"

BBMASK="qt4-embedded_%.bbappend"

inherit core-image

# Never deploy kernel for RAM based file systems
RDEPENDS_kernel-base = ""
