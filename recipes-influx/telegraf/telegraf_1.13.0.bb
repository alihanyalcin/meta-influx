DESCRIPTION = "Telegraf 1.13.0"
SUMMARY = "Telegraf is the open source server agent to help you collect metrics from your stacks, sensors and systems."
HOMEPAGE = "https://www.influxdata.com/time-series-platform/telegraf/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.13.0_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "fceeeba915e462b1559eb1ebe287dfa293e96c33b4c181f6328e9775e6d5ecbc"

S = "${WORKDIR}/telegraf"