SUMMARY = "setup directories startup service"
DESCRIPTION = "Installs the setup-directories.service file. \
               This service calls /usr/bin/setup_directories \
               on every startup. \
"

SECTION = "base"
LICENSE = "MIT"
SRC_URI = "\
    file://setup-directories.service \
    file://setup_directories \
"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}/data
    install -d ${D}/logs

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${UNPACKDIR}/setup-directories.service ${D}${systemd_system_unitdir}

    install -d -m 755 ${D}${bindir}
    install -m 755 ${UNPACKDIR}/setup_directories ${D}${bindir}/setup_directories
    sed "s%#MENDER_DEVICE_TYPE#%${MENDER_DEVICE_TYPE}%g" -i ${D}${bindir}/setup_directories
}

inherit systemd

SYSTEMD_SERVICE:${PN} = "setup-directories.service"
FILES:${PN} += "/data /logs ${bindir}/setup_directories"

BBCLASSEXTEND = "native nativesdk"
