DISTRO_FEATURES:append = " efi systemd"
IMAGE_INSTALL:append = " systemd"
INIT_MANAGER = "none"

INITRAMFS_IMAGE_BUNDLE = "0"
INITRAMFS_IMAGE = "simple-initramfs-systemd-dracut"

#256M
INITRAMFS_MAXSIZE = "262144"

IMAGE_FSTYPES = "wic"
WKS_FILE = "simple-image-with-dracut-initramfs.wks"
