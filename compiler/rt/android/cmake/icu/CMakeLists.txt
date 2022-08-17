project(android-external-icu4c)

set(ICU_PATH "${ANDROID_RT_PATH}/external/icu/icu4c/source")
set(COMMON_PATH "${ICU_PATH}/common")
set(I18N_PATH "${ICU_PATH}/i18n")

include_directories("${COMMON_PATH}" "${I18N_PATH}")

add_definitions(-D_REENTRANT)
add_definitions(-DU_COMMON_IMPLEMENTATION)
add_definitions(-DU_I18N_IMPLEMENTATION)
# add_definitions(-DUDATA_DEBUG)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -O3 -fvisibility=hidden -Wall -Werror -Wno-unused-parameter -Wno-missing-field-initializers")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wno-sign-compare -Wno-deprecated-declarations")

file(GLOB SRC_COMMON "${COMMON_PATH}/*.cpp")
file(GLOB SRC_I18N   "${I18N_PATH}/*.cpp")
set(SRC
  ${SRC_COMMON}
  ${SRC_I18N}
  ${ICU_PATH}/stubdata/stubdata.cpp
)


add_library(android-external-icu4c OBJECT ${SRC})
set(EXTERNAL_ICU4C_OBJECTS $<TARGET_OBJECTS:android-external-icu4c> PARENT_SCOPE)