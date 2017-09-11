include recipes-bsp/u-boot/u-boot-toradex.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PV = "2016.11"

PR = "${TDX_VER_INT}-gitr${@d.getVar("SRCREV", False)[0:7]}"
LOCALVERSION ?= "-${TDX_VER_INT}"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

SRCREV = "1c83a29a76782c061e38fca7faab35f14a5507ad"
SRCBRANCH = "2016.11-toradex-next"
COMPATIBLE_MACHINE = "(mx6|mx7|vf)"

SRC_URI_append = "\
    file://0001-apalis_imx6-add-configuration-for-Tezi.patch \
    file://0002-colibri_imx6-add-configuration-for-Tezi.patch \
    file://0003-mtest-disable-physical-memory-cell-test.patch \
    file://0001-colibri_imx7-add-configuration-for-Tezi.patch \
    file://0002-colibri_imx7_emmc-add-configuration-for-Tezi.patch \
    file://0003-colibri_imx7-add-configuration-for-Tezi-recovery.patch \
"
