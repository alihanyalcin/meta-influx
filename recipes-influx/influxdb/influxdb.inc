DESCRIPTION = "InfluxDB"
SUMMARY = "InfluxDB is a time series database designed to handle high write and query loads."
HOMEPAGE = "https://www.influxdata.com/products/influxdb-overview/"

INSANE_SKIP_${PN}_append = "already-stripped"

do_install() {
    #${sysconfdir} = /etc
    #${bindir} = /usr/bin
    #${libdir} = /usr/lib
    #${datadir} = /usr/share
    #${localstatedir} = /var

    # /etc
    install -d ${D}${sysconfdir}/influxdb
    install -d ${D}${sysconfdir}/logrotate.d

    install -m 0644 ${S}/etc/influxdb/influxdb.conf ${D}${sysconfdir}/influxdb/
    install -m 0644 ${S}/etc/logrotate.d/influxdb ${D}${sysconfdir}/logrotate.d/

    # /usr/bin
    install -d ${D}${bindir}

    install -m 0755 ${S}/usr/bin/* ${D}${bindir}/

    # /usr/lib
    install -d ${D}${systemd_unitdir}/system
    sed -i 's/User=influxdb/User=root/g' ${S}/usr/lib/influxdb/scripts/influxdb.service
    sed -i 's/Group=influxdb/Group=root/g' ${S}/usr/lib/influxdb/scripts/influxdb.service
    install -m 0644 ${S}/usr/lib/influxdb/scripts/influxdb.service ${D}${systemd_unitdir}/system
    #install -m 0644 ${S}/usr/lib/influxdb/scripts/influxdb.service ${D}${libdir}/influxdb/scripts/
    #install -m 0644 ${S}/usr/lib/influxdb/scripts/init.sh ${D}${libdir}/influxdb/scripts/

    # /usr/share
    install -d ${D}${datadir}/man/man1
    install -m 0644 ${S}/usr/share/man/man1/* ${D}${datadir}/man/man1/

    # /var/lib
    install -d ${D}${localstatedir}/lib/influxdb
    install -d ${D}${localstatedir}/log/influxdb

}
inherit systemd
SYSTEMD_SERVICE_${PN} = "influxdb.service"