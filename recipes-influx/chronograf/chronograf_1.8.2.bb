require chronograf.inc

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/chronograf/releases/chronograf-1.8.2_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "bbf16bed3944acec57bd19f8109695247d1c52bd7cfda01d46c644c22a9d9cec"


S = "${WORKDIR}/chronograf-1.8.2-1"