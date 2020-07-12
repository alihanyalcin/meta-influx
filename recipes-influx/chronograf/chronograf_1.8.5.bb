require chronograf.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/chronograf/releases/chronograf-1.8.5_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "098ec84eb36de45cd2a789316845e7e615f43df4b4937d6a9ac9ea832d46b7a2"


S = "${WORKDIR}/chronograf-1.8.5-1"