DESCRIPTION = "LimeSuite"
HOMEPAGE = "https://myriadrf.org/projects/lime-suite/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=e287d48f90a07ef5e3d407e59af2282b"

SRC_URI = "git://github.com/myriadrf/LimeSuite.git;protocol=git;branch=stable;destsuffix=git"
SRCREV = "d6bc28fdf6cbbf26b7ef4b03d617925d5f878a78"
PV = "18.04.0+git${SRCPV}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/builddir"

DEPENDS = "sqlite3 libusb" 

inherit pkgconfig cmake
