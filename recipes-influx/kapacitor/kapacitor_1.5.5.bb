require kapacitor.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.5_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "d27920191402ad2dcb0445dc9b47a3a6387ec7316c834719bb2471740cf5e339"

S = "${WORKDIR}/kapacitor-1.5.5-1"