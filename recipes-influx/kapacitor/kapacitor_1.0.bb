DESCRIPTION = "KAPACITOR 1.5.3"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/kapacitor/releases/kapacitor-1.5.3_linux_armhf.tar.gz \
          file://LICENSE \
          "

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

INSANE_SKIP_${PN}_append = "already-stripped"

S = "${WORKDIR}/kapacitor-1.5.3-1"

do_install() {
    
}