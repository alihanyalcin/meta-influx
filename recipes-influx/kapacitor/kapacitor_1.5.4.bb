require kapacitor.inc

DESCRIPTION = "Kapacitor 1.5.4"
SUMMARY = "Kapacitor is a real-time streaming data processing engine."
HOMEPAGE = "https://www.influxdata.com/time-series-platform/kapacitor/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.4_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "82d62f354042c50d97c6edcd992a32dac07f9db4a267464bb293d031966655f1"

S = "${WORKDIR}/kapacitor-1.5.4-1"