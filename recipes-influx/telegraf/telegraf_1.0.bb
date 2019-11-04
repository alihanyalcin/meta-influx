DESCRIPTION = "TELEGRAF 1.12.4"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.12.4_linux_armhf.tar.gz \
          "
SRC_URI[sha256sum] = " ff66b5920e660ec538853c0be42b3d53dfdb06e889c6da0dfc667d90766c4f6e"

#INSANE_SKIP_${PN}_append = "already-stripped" # try it

S = "${WORKDIR}/telegraf"

do_install() {

}