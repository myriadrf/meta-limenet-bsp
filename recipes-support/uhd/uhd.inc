SUMMARY = "Universal Hardware Driver for Ettus Research products."
HOMEPAGE = "http://www.ettus.com"
LICENSE = "GPLv3+"

DEPENDS = "git-native python-mako-native boost \
           ncurses udev python-requests"
RDEPENDS_${PN} += "python-requests"

inherit cmake pythonnative

#PACKAGES =+ "${PN}-tests ${PN}-examples ${PN}-e1xx"

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += "${libdir}/libuhd.so \
                ${libdir}/uhd/utils/*"
FILES_${PN}-tests += "${datadir}/uhd/tests/*"
FILES_${PN}-dev += "${libdir}/cmake/*"
FILES_${PN}-dbg += "${libdir}/uhd/examples/.debug/* \
                    ${libdir}/uhd/utils/.debug/* \
                    ${libdir}/uhd/utils/latency/.debug/* \
                    ${libdir}/uhd/tests/.debug/* \
                    ${libdir}/uhd/usrp_e_utils/.debug/*"
FILES_${PN}-examples = "${libdir}/uhd/examples/*"

#PACKAGECONFIG ??= "e100 e300 b100 b200 usrp1 usrp2 x300"

EXTRA_OECMAKE = "-DENABLE_LIBUHD=ON -DENABLE_RFNOC=OFF -DENABLE_TESTS=OFF \
                 -DENABLE_EXAMPLES=OFF -DENABLE_USRP2=OFF -DENABLE_N230=OFF \
                 -DENABLE_OCTOCLOCK=OFF -DENABLE_X300=OFF -DENABLE_USRP1=OFF \
                 -DENABLE_E300=OFF -DENABLE_E100=OFF -DENABLE_B100=OFF \
                 -DENABLE_B200=OFF -DENABLE_GPSD=OFF -DENABLE_USB=OFF"
