SUMMARY = "Simple testing image"

IMAGE_FEATURES = " \
  allow-empty-password \
  allow-root-login \
  empty-root-password \
  ssh-server-openssh \
"

IMAGE_INSTALL = " \
  busybox \
  e2fsprogs-resize2fs \
  packagegroup-core-boot \
  parted \
  setup-directories \
"

inherit core-image
