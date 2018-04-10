DESCRIPTION = "LimeNET OsmoBTS"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "git://git.osmocom.org/osmo-bts.git;protocol=git;branch=master;destsuffix=git"
SRCREV = "ec674ac74591e8f63bdb388affdef9eb782e8aaf"
PV = "0.7.0+git${SRCPV}"
PR = "r0.${META_TELEPHONY_OSMO_INC}"
S = "${WORKDIR}/git"

DEPENDS = "libosmocore libosmo-abisd"

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

CONFFILES_${PN} = "${sysconfdir}/osmocom/osmo-bts.cfg"
