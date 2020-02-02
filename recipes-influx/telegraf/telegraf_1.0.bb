DESCRIPTION = "TELEGRAF 1.13.0"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.13.0_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "fceeeba915e462b1559eb1ebe287dfa293e96c33b4c181f6328e9775e6d5ecbc"

LICENSE = "CLOSED"

INSANE_SKIP_${PN}_append = "already-stripped"

S = "${WORKDIR}/telegraf"

do_install() {
    #${sysconfdir} = /etc
    #${bindir} = /usr/bin
    #${libdir} = /usr/lib
    #${localstatedir} = /var

    # /etc
    install -d ${D}${sysconfdir}/logrotate.d
    install -d ${D}${sysconfdir}/telegraf
    install -d ${D}${sysconfdir}/telegraf/telegraf.d

    install -m 0644 ${S}/etc/logrotate.d/telegraf ${D}${sysconfdir}/logrotate.d/
    install -m 0644 ${S}/etc/telegraf/telegraf.conf ${D}${sysconfdir}/telegraf/

    # /usr/bin
    install -d ${D}${bindir}

    install -m 0755 ${S}/usr/bin/telegraf ${D}${bindir}/

    # /usr/lib
    install -d ${D}${systemd_unitdir}/system
    sed -i 's/User=telegraf/User=root/g' ${S}/usr/lib/telegraf/scripts/telegraf.service
    install -m 0644 ${S}/usr/lib/telegraf/scripts/telegraf.service ${D}${systemd_unitdir}/system

    #install -m 0644 ${S}/usr/lib/telegraf/scripts/init.sh ${D}${libdir}/telegraf/scripts/
    #install -m 0644 ${S}/usr/lib/telegraf/scripts/telegraf.service ${D}${libdir}/telegraf/scripts/

    # /var
    install -d ${D}${localstatedir}/log/telegraf
    
}

inherit systemd
SYSTEMD_SERVICE_${PN} = "telegraf.service"