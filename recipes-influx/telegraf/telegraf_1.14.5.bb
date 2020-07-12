require telegraf.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.14.5_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "cf1333eebb6b4c330f59b7e2a251e7b00e891eed7670c794a142a70c1712760f"

S = "${WORKDIR}/telegraf"