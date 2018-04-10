DESCRIPTION = "LimeNET OsmoTRX"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=647de2934abd8dbfc2a22bb66a604418"

SRC_URI = "git://git.osmocom.org/osmo-trx.git;protocol=git;branch=master;destsuffix=git"
SRCREV = "20259cb30700353ba26fd983538e7f3d8f9d4f83"
PV = "0.2.0+git${SRCPV}"
PR = "r0.${META_TELEPHONY_OSMO_INC}"
S = "${WORKDIR}/git"

DEPENDS = "fftw libosmocore libusb uhd libosmo-abis"

RDEPENDS_${PN} += "coreutils"

#EXTRA_OECONF = ""

inherit autotools pkgconfig systemd

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_AUTO_ENABLE_${PN}="enable"

do_configure_prepend() {
	ln -sf ../openbsc openbsc || true
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -d ${D}/${systemd_system_unitdir}
}

CONFFILES_${PN} = "${sysconfdir}/osmocom/osmo-trx.cfg"
