require kapacitor.inc

DESCRIPTION = "Kapacitor 1.5.3"
SUMMARY = "Kapacitor is a real-time streaming data processing engine."
HOMEPAGE = "https://www.influxdata.com/time-series-platform/kapacitor/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.3_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "5ee8c333299f25e56c5b65953e0f1fc22c452d3c2782cc3c41db6cb59ef3ff4c"

S = "${WORKDIR}/kapacitor-1.5.3-1"