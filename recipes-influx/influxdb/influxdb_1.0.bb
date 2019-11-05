DESCRIPTION = "INFLUXDB 1.7.9"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

PR = "r1"

SRC_URI = "https://dl.influxdata.com/influxdb/releases/influxdb-1.7.9_linux_armhf.tar.gz \
          "
SRC_URI[sha256sum] = " c3f87938f8349649bf51db0a23683c06515548f6a84a9bcf0068a095e539e99e"

S = "${WORKDIR}/influxdb-1.7.9-1"

do_install() {
    
}