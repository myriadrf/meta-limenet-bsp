DESCRIPTION = "SoapySDR"
HOMEPAGE = "https://github.com/pothosware/SoapySDR/wiki"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/pothosware/SoapySDR.git;protocol=git;branch=master;destsuffix=git"
SRCREV = "824d83e858076fae8ff2ac839e5039c66cf45f26"
PV = "soapy-sdr-0.6.1+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS = "python python-numpy swig" 

inherit pkgconfig cmake
