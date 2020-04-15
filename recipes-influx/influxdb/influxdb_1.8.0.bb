require influxdb.inc

DESCRIPTION = "InfluxDB 1.8.0"
SUMMARY = "InfluxDB is a time series database designed to handle high write and query loads."
HOMEPAGE = "https://www.influxdata.com/products/influxdb-overview/"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/influxdb/releases/influxdb-1.8.0_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "fdac157f02e8231e1925d8e9bc325c88b7ba55ebab2340c549ef10640dbd0cba"

LICENSE = "CLOSED"

S = "${WORKDIR}/influxdb-1.8.0-1"