inherit image

PREFERRED_PROVIDER_coreutils = "coreutils"
PREFERRED_PROVIDER_virtual/base-utils = "packagegroup-core-base-utils"
SKIP_RECIPE[uutils-coreutils] = "Don't build this"
VIRTUAL-RUNTIME_base-utils-hwclock = "util-linux-hwclock"
VIRTUAL-RUNTIME_base-utils = "packagegroup-core-base-utils"

# Don't allow the initramfs to contain a kernel
INIT_MANAGER = "systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
VIRTUAL-RUNTIME_syslog ?= ""
VIRTUAL-RUNTIME_base-utils-syslog ?= ""

PACKAGE_EXCLUDE = "kernel-image-*"
IMAGE_NAME_SUFFIX ?= ""
IMAGE_LINGUAS = ""
IMAGE_FSTYPES = "cpio"
INITRAMFS_IMAGE_NAME = "simple-initramfs-${MACHINE}"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-meta-initramfs \
    systemd \
"

PACKAGE_INSTALL = " \
    dracut \
    ${VIRTUAL-RUNTIME_base-utils} \
    base-files \
    coreutils \
    e2fsprogs-mke2fs \
    os-release-initrd \
    util-linux-blkid \
    util-linux-mount \
    util-linux-umount \
    ${VIRTUAL-RUNTIME_init_manager} \
    ${VIRTUAL-RUNTIME_dev_manager} \
    base-passwd \
"

# Save space.
# Do not automatically install recommendations
# as they take up quite a bit of extra space.
# and are unecessary.
NO_RECOMMENDATIONS = "1"
MACHINE_EXTRA_RDEPENDS = ""
MACHINE_EXTRA_RRECOMMENDS = ""
