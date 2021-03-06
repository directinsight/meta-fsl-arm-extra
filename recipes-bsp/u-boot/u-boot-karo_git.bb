require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "Das U-Boot for Ka-Ro electronics TX Computer-On-Modules."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

PROVIDES = "u-boot-karo"

PV = "v2015.10-rc2+git${SRCPV}"

SRCREV = "9c867060812647af60840df7caf78f6567b2bd29"
SRCBRANCH = "master"
SRC_URI = "git://git.karo-electronics.de/karo-tx-uboot.git;branch=${SRCBRANCH} \
	   file://mx6-soc-l2en.patch \
	   file://mx6-clock-div.patch \
	  "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE  = "(tx6[qsu]-.*|txul-.*)"
