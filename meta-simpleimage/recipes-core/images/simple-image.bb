SUMMARY = "Simple testing image"

IMAGE_FEATURES = " \
  allow-empty-password \
  allow-root-login \
  empty-root-password \
  package-management \
  ssh-server-openssh \
"

IMAGE_INSTALL = " \
  busybox \
  dnf \
"

IMAGE_INIT_MANAGER  = "systemd"

inherit core-image
