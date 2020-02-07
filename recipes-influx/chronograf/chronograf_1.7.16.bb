require chronograf.inc

DESCRIPTION = "Chronograf 1.7.16"
SUMMARY = "Chronograf is the complete interface for the InfluxDB 1.x Platform"
HOMEPAGE = "https://www.influxdata.com/time-series-platform/chronograf/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/chronograf/releases/chronograf-1.7.16_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "2cf1d24c8736e6ef82065841ce3179ae03a00575937084e984c048cb20021910"


S = "${WORKDIR}/chronograf-1.7.16-1"