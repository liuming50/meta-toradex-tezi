LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    qjson \
    libusbgx \
    rapidjson-dev \
"
