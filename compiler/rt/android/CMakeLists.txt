project(android)

set(ANDROID_RT_PATH "${CMAKE_CURRENT_LIST_DIR}")
add_definitions(-D__ROBOVM__)

include_directories(
  # system/core/liblog
  system/logging/include
  system/libbase/include

  # native helper
  libnativehelper/
  libnativehelper/include/
  libnativehelper/include_jni/
  libnativehelper/include_platform/
  libnativehelper/include_platform_header_only/
  libnativehelper/header_only_include
)

if(DARWIN)
  # this will enables BSD path of code instead of linux one that will allow lot of sources
  # to be compilable without changing sources
  add_definitions(-D_ALLBSD_SOURCE)
endif()

add_subdirectory(cmake/libcore)
add_subdirectory(cmake/libbase)
add_subdirectory(cmake/libnativehelper)
add_subdirectory(cmake/expat)
add_subdirectory(cmake/fdlibm)
add_subdirectory(cmake/icu)
add_subdirectory(cmake/javasqlite)
if(NOT DARWIN)
  # Mac OS X and iOS ships with sqlite so we'll just use that
  add_subdirectory(cmake/sqlite)
endif()
add_subdirectory(cmake/zlib)
add_subdirectory(cmake/boringssl)
add_subdirectory(cmake/art)
add_subdirectory(cmake/conscrypt)

set(ANDROID_OBJECTS
  ${LIBCORE_OBJECTS}
  ${SYSTEM_LIBBASE_OBJECTS}
  ${LIBNATIVEHELPER_OBJECTS}
  ${EXTERNAL_EXPAT_OBJECTS}
  ${EXTERNAL_FDLIBM_OBJECTS}
  ${EXTERNAL_ICU4C_OBJECTS}
  ${EXTERNAL_JAVASQLITE_OBJECTS}
  ${EXTERNAL_SQLITE_OBJECTS}
  ${EXTERNAL_ZLIB_OBJECTS}
  ${EXTERNAL_BORINGSSL_OBJECTS}
  ${ART_OBJECTS}
  ${LIBCONSCRYPT_OBJECTS}

  PARENT_SCOPE
)
