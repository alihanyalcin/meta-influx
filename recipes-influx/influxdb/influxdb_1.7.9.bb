require influxdb.inc

DESCRIPTION = "InfluxDB 1.7.9"
SUMMARY = "InfluxDB is a time series database designed to handle high write and query loads."
HOMEPAGE = "https://www.influxdata.com/products/influxdb-overview/"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/influxdb/releases/influxdb-1.7.9_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "c3f87938f8349649bf51db0a23683c06515548f6a84a9bcf0068a095e539e99e"

LICENSE = "CLOSED"

S = "${WORKDIR}/influxdb-1.7.9-1"