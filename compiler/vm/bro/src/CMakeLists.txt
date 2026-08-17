project(bro)

include_directories(../../core/include)

set(SRC
  org_robovm_rt_bro_Dl.c
)

add_library(robovm-bro STATIC ${SRC})
set_target_properties(robovm-bro PROPERTIES SUFFIX "${LIB_SUFFIX}")
install(TARGETS robovm-bro DESTINATION ${INSTALL_DIR})
