require telegraf.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.14.1_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "f2f55f98fa5a8a95605812c4d6dfdd16c1e0cbc5ceba6848d5eb4c6f50ad188c"

S = "${WORKDIR}/telegraf"