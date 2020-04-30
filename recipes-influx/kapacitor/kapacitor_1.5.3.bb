require kapacitor.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.3_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "5ee8c333299f25e56c5b65953e0f1fc22c452d3c2782cc3c41db6cb59ef3ff4c"

S = "${WORKDIR}/kapacitor-1.5.3-1"