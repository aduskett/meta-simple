IMAGE_INSTALL:append = " coreutils"

PREFERRED_PROVIDER_coreutils = "coreutils"
PREFERRED_PROVIDER_virtual/base-utils = "packagegroup-core-base-utils"
SKIP_RECIPE[uutils-coreutils] = "Don't build this"
VIRTUAL-RUNTIME_base-utils-hwclock = "util-linux-hwclock"
VIRTUAL-RUNTIME_base-utils = "packagegroup-core-base-utils"
