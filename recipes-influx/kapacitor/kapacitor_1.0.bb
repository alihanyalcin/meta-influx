DESCRIPTION = "KAPACITOR 1.5.3"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.3_linux_armhf.tar.gz \
          file://LICENSE \
          "

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

INSANE_SKIP_${PN}_append = "already-stripped"

S = "${WORKDIR}/kapacitor-1.5.3-1"

do_install() {
    #${sysconfdir} = /etc
    #${bindir} = /usr/bin
    #${libdir} = /usr/lib
    #${datadir} = /usr/share
    #${localstatedir} = /var

    # /etc
    install -d ${D}${sysconfdir}/kapacitor
    install -d ${D}${sysconfdir}/logrotate.d

    install -m 0644 ${S}/etc/kapacitor/kapacitor.conf ${D}${sysconfdir}/kapacitor/
    install -m 0644 ${S}/etc/logrotate.d/kapacitor ${D}${sysconfdir}/logrotate.d

    # /usr/bin
    install -d ${D}${bindir}

    install -m 0755 ${S}/usr/bin/kapacitor ${D}${bindir}/
    install -m 0755 ${S}/usr/bin/kapacitord ${D}${bindir}/
    install -m 0755 ${S}/usr/bin/tickfmt ${D}${bindir}/

    # /usr/lib
    install -d ${D}${libdir}/kapacitor/scripts

    install -m 0755 ${S}/usr/lib/kapacitor/scripts/init.sh ${D}${libdir}/kapacitor/scripts/
    install -m 0644 ${S}/usr/lib/kapacitor/scripts/kapacitor.service ${D}${libdir}/kapacitor/scripts/

    # /usr/share
    install -d ${D}${datadir}/bash-completion/completions

    install -m 0644 ${S}/usr/share/bash-completion/completions/kapacitor ${D}${datadir}/bash-completion/completions/

    # /var/lib
    install -d ${D}${localstatedir}/lib/kapacitor
    install -d ${D}${localstatedir}/log/kapacitor

    rm -rf ${S}/*
}