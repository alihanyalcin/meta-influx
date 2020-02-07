require chronograf.inc

DESCRIPTION = "Chronograf 1.7.17"
SUMMARY = "Chronograf is the complete interface for the InfluxDB 1.x Platform"
HOMEPAGE = "https://www.influxdata.com/time-series-platform/chronograf/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/chronograf/releases/chronograf-1.7.17_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "668af068b16e0c172ac9d7ccb32b417f60214eb227228872de9f7760a17972fb"


S = "${WORKDIR}/chronograf-1.7.17-1"