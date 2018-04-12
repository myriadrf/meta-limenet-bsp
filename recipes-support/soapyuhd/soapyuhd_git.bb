DESCRIPTION = "SoapyUHD"
HOMEPAGE = "https://github.com/pothosware/SoapyUHD/wiki"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/pothosware/SoapyUHD.git;protocol=git;branch=master;destsuffix=git"
SRCREV = "55da7dad46e38066a04df7b06707c5184148c50b"
PV = "soapy-uhd-0.3.4+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS = "soapysdr uhd" 

inherit pkgconfig cmake

FILES_${PN} += "${libdir}/uhd/modules/libsoapySupport.so \
                ${libdir}/SoapySDR/modules0.7/libuhdSupport.so"
