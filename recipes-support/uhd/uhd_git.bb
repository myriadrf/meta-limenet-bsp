require recipes-support/uhd/uhd.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=8255adf1069294c928e0e18b01a16282"

PV = "3.10.0"

SRC_URI = "git://github.com/EttusResearch/uhd.git;branch=maint"

SRCREV = "2c9087d120f0cb5ede1436cd0508cf92c3bcd68e"

S = "${WORKDIR}/git/host"
