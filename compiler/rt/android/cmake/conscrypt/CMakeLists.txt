project(android-conscrypt)

set(LIB_PATH "${ANDROID_RT_PATH}/conscrypt/common/src/jni/main")
set(BORINGSSL_PATH "${ANDROID_RT_PATH}/external/boringssl")

include_directories(
  ${LIB_PATH}/include
  ${BORINGSSL_PATH}/src/include
)

add_definitions(-DANDROID -DJNI_JARJAR_PREFIX=com/android/)


set(SRC
  ${LIB_PATH}/cpp/conscrypt/compatibility_close_monitor.cc
  ${LIB_PATH}/cpp/conscrypt/jniload.cc
  ${LIB_PATH}/cpp/conscrypt/jniutil.cc
  ${LIB_PATH}/cpp/conscrypt/native_crypto.cc
  ${LIB_PATH}/cpp/conscrypt/netutil.cc
  ${LIB_PATH}/cpp/conscrypt/trace.cc
)

add_library(android-conscrypt OBJECT ${SRC})
set(LIBCONSCRYPT_OBJECTS $<TARGET_OBJECTS:android-conscrypt> PARENT_SCOPE)
