SUMMARY = "Simple testing image"

IMAGE_FEATURES = " \
  allow-empty-password \
  allow-root-login \
  empty-root-password \
  ssh-server-openssh \
"

IMAGE_INSTALL = " \
  packagegroup-core-boot \
  util-linux-agetty \
  kmscon \
"

inherit core-image
