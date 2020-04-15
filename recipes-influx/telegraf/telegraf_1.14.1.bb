require telegraf.inc

DESCRIPTION = "Telegraf 1.14.1"
SUMMARY = "Telegraf is the open source server agent to help you collect metrics from your stacks, sensors and systems."
HOMEPAGE = "https://www.influxdata.com/time-series-platform/telegraf/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.14.1_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "f2f55f98fa5a8a95605812c4d6dfdd16c1e0cbc5ceba6848d5eb4c6f50ad188c"

S = "${WORKDIR}/telegraf"