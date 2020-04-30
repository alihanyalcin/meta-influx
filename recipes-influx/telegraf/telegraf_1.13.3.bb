require telegraf.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.13.3_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "e069dd404b20a16a05f11cfca1eda0e8f3206cfc1255225166a1611776f36a79"

S = "${WORKDIR}/telegraf"