DESCRIPTION = "Chronograf 1.7.16"
SUMMARY = "Chronograf is the complete interface for the InfluxDB 1.x Platform"
HOMEPAGE = "https://www.influxdata.com/time-series-platform/chronograf/"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/chronograf/releases/chronograf-1.7.16_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "2cf1d24c8736e6ef82065841ce3179ae03a00575937084e984c048cb20021910"

LICENSE = "CLOSED"

INSANE_SKIP_${PN}_append = "already-stripped"

S = "${WORKDIR}/chronograf-1.7.16-1"

do_install() {
    #${sysconfdir} = /etc
    #${bindir} = /usr/bin
    #${libdir} = /usr/lib
    #${localstatedir} = /var
    #${datadir} = /usr/share

    # /etc
    install -d ${D}${sysconfdir}/logrotate.d
    install -m 0644 ${S}/etc/logrotate.d/chronograf ${D}${sysconfdir}/logrotate.d

    # /usr/bin
    install -d ${D}${bindir}
    install -m 0755 ${S}/usr/bin/* ${D}${bindir}

    # /usr/lib
    #install -d ${D}${libdir}/chronograf/scripts
    #install -m 0644 ${S}/usr/lib/chronograf/scripts/* ${D}${libdir}/chronograf/scripts
    install -d ${D}${systemd_unitdir}/system
    sed -i 's/User=chronograf/User=root/g' ${S}/usr/lib/chronograf/scripts/chronograf.service
    sed -i 's/Group=chronograf/Group=root/g' ${S}/usr/lib/chronograf/scripts/chronograf.service
    install -m 0644 ${S}/usr/lib/chronograf/scripts/chronograf.service ${D}${systemd_unitdir}/system


    # /usr/share
    install -d ${D}${datadir}/chronograf/canned
    install -m 0644 ${S}/usr/share/chronograf/canned/* ${D}${datadir}/chronograf/canned
    install -d ${D}${datadir}/chronograf/protoboards
    install -m 0644 ${S}/usr/share/chronograf/protoboards/* ${D}${datadir}/chronograf/protoboards
    install -d ${D}${datadir}/chronograf/resources

    # /var/lib
    install -d ${D}${localstatedir}/lib/chronograf
    install -d ${D}${localstatedir}/log/chronograf

}
inherit systemd
SYSTEMD_SERVICE_${PN} = "chronograf.service"