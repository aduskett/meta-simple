DISTRO_FEATURES:append = " systemd"

IMAGE_INSTALL:append = " systemd"

# Use systemd with journald for logging.
INIT_MANAGER = "systemd"
VIRTUAL-RUNTIME_syslog ?= ""
VIRTUAL-RUNTIME_base-utils-syslog ?= ""
