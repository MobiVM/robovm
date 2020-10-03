cmake_minimum_required(VERSION 2.8)
project(robovm-libimobiledevice)
include(ExternalProject)

find_package(JNI REQUIRED)

if(OS STREQUAL "linux")
  set(LINUX YES)
elseif(OS STREQUAL "macosx")
  set(MACOSX YES)
endif()

if (ARCH STREQUAL "x86")
  set(X86 YES)
elseif (ARCH STREQUAL "x86_64")
  set(X86_64 YES)
endif()

set(C_CXX_FLAGS "${C_CXX_FLAGS} -fdata-sections -ffunction-sections -Wno-unused")
if(MACOSX AND X86)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -arch i386 -mmacosx-version-min=10.6")
  set(LD_FLAGS "${LD_FLAGS} -arch i386 -mmacosx-version-min=10.6")
elseif(MACOSX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -arch x86_64 -mmacosx-version-min=10.6")
  set(LD_FLAGS "${LD_FLAGS} -arch x86_64 -mmacosx-version-min=10.6")
elseif(LINUX AND X86)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m32 -fPIC")
  set(LD_FLAGS "${LD_FLAGS} -m32")
elseif(LINUX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m64 -fPIC")
  set(LD_FLAGS "${LD_FLAGS} -m64")
endif()

set(EXTPREFIX "${CMAKE_BINARY_DIR}/ext")
set(C_CXX_FLAGS "${C_CXX_FLAGS} -I${EXTPREFIX}/include -I/usr/local/include")
set(EXTCFLAGS "-I${EXTPREFIX}/include/libusb-1.0 -I${EXTPREFIX}/include/libxml2 ${C_CXX_FLAGS}")
set(LDFLAGS "-L${EXTPREFIX}/lib")

if(MACOSX)
  exec_program(xcode-select ARGS --print-path OUTPUT_VARIABLE XCODE_PATH)
  set(SYSROOT "${XCODE_PATH}/Platforms/MacOSX.platform/Developer/SDKs/MacOSX10.14.sdk")
  if(NOT IS_DIRECTORY ${SYSROOT})
    set(SYSROOT "${XCODE_PATH}/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk")
  endif()
  if(NOT IS_DIRECTORY ${SYSROOT})
    message(FATAL_ERROR "No supported MacOSX SDK found")
  endif()
  if(NOT IS_DIRECTORY "/usr/local/opt/openssl/include")
    message(FATAL_ERROR "No OpenSSL found")
  endif()
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -isysroot ${SYSROOT}")
  set(EXTCFLAGS "${EXTCFLAGS} -I/usr/local/opt/openssl/include -isysroot ${SYSROOT}")
  set(LDFLAGS "${LDFLAGS} -L/usr/local/opt/openssl/lib")
endif()

if (LINUX)
  # some linuxes ship old version of openssl which will cause library not found so it is better to link it staticaly
  ExternalProject_Add(extopenssl
    URL https://github.com/openssl/openssl/archive/OpenSSL_1_1_1g.zip
    CONFIGURE_COMMAND bash -c "./Configure linux-${ARCH} no-shared no-capieng no-dso --prefix=${EXTPREFIX} --openssldir=${EXTPREFIX}"
    BUILD_IN_SOURCE 1
  )
elseif (MACOSX)
  # starting 10.13 macosx ships libressl instead of openssl. which will cause library not found so it is better to link it staticaly
  ExternalProject_Add(extopenssl
    URL https://github.com/openssl/openssl/archive/OpenSSL_1_1_1g.zip
    CONFIGURE_COMMAND bash -c "./Configure darwin64-x86_64-cc no-shared no-capieng --prefix=${EXTPREFIX} --openssldir=${EXTPREFIX}"
    BUILD_IN_SOURCE 1
  )
endif()
ExternalProject_Add(extlibusbx
  URL https://github.com/libusb/libusb/archive/v1.0.23.zip
  CONFIGURE_COMMAND bash -c "CC=${CMAKE_C_COMPILER} CFLAGS='${EXTCFLAGS}' ./autogen.sh --enable-shared=no --prefix=${EXTPREFIX} --without-cython"
  BUILD_IN_SOURCE 1
)
ExternalProject_Add(extlibplist
  URL https://github.com/libimobiledevice/libplist/archive/2.0.0.tar.gz
  CONFIGURE_COMMAND bash -c "CC=${CMAKE_C_COMPILER} CFLAGS='${EXTCFLAGS}' PKG_CONFIG_PATH='${EXTPREFIX}/lib/pkgconfig' ./autogen.sh --enable-shared=no --enable-udev=no --prefix=${EXTPREFIX} --without-cython"
  BUILD_IN_SOURCE 1
)
ExternalProject_Add(extlibusbmuxd
  GIT_REPOSITORY https://github.com/libimobiledevice/libusbmuxd.git
  GIT_TAG c2db27c92341e1ba257102f6fb29a61f66c2fb6d
  CONFIGURE_COMMAND bash -c "CFLAGS='${EXTCFLAGS}' PKG_CONFIG_PATH='${EXTPREFIX}/lib/pkgconfig' ac_cv_func_realloc_0_nonnull=yes ac_cv_func_malloc_0_nonnull=yes ./autogen.sh ${TENTATIVE_CROSS_COMPILE_HOST} --enable-shared=no --prefix=${EXTPREFIX}"
  BUILD_IN_SOURCE 1
  DEPENDS extlibusbx extlibplist
)
set(LIBIMOBILEDEVICE_CFLAGS "${EXTCFLAGS}")
if(MACOSX)
  set(LIBIMOBILEDEVICE_CFLAGS "${EXTCFLAGS} -std=gnu89")
endif()
ExternalProject_Add(extlibimobiledevice
  GIT_REPOSITORY https://github.com/libimobiledevice/libimobiledevice.git
  GIT_TAG 60823f9eeb3f09cd8083f613522d01e21d2f6d2d
  CONFIGURE_COMMAND bash -c "PKG_CONFIG_PATH='${EXTPREFIX}/lib/pkgconfig' CFLAGS='${LIBIMOBILEDEVICE_CFLAGS}' LDFLAGS='${LDFLAGS}' ./autogen.sh --prefix=${EXTPREFIX} --enable-debug-code --enable-shared=no --without-cython"
  UPDATE_COMMAND ""
  PATCH_COMMAND bash -c "${CMAKE_SOURCE_DIR}/patches/apply-patches"
  BUILD_IN_SOURCE 1
  DEPENDS extlibplist extlibusbmuxd extopenssl
)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} ${C_CXX_FLAGS}")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} ${C_CXX_FLAGS} -fno-rtti")
set(CMAKE_INSTALL_DO_STRIP YES)

include_directories(${JAVA_INCLUDE_PATH} ${JAVA_INCLUDE_PATH2} ${EXTPREFIX}/include)

set(LIBS -limobiledevice -lusbmuxd -lplist -lssl -lcrypto)

if(MACOSX)
  set(LIBS ${LIBS} -liconv)
endif()

set(SRC
  src/main/native/libimobiledevice_wrap.c
)

add_library(robovm-libimobiledevice SHARED ${SRC})
add_dependencies(robovm-libimobiledevice extlibimobiledevice)
target_link_libraries(robovm-libimobiledevice ${LIBS} ${LDFLAGS})
if(LINUX)
  set_target_properties(robovm-libimobiledevice PROPERTIES LINK_FLAGS "-Wl,--gc-sections -Wl,--version-script=${CMAKE_SOURCE_DIR}/src/main/native/exports_linux.sym")
elseif(MACOSX)
  set_target_properties(robovm-libimobiledevice PROPERTIES LINK_FLAGS "-Wl,-dead_strip -Wl,-exported_symbols_list -Wl,${CMAKE_SOURCE_DIR}/src/main/native/exports_macosx.sym")
endif()
  set(INSTALL_DIR ${CMAKE_SOURCE_DIR}/src/main/resources/org/robovm/libimobiledevice/binding/${OS}/${ARCH})
install(TARGETS robovm-libimobiledevice DESTINATION ${INSTALL_DIR})
