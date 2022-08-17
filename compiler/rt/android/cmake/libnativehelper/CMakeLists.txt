project(android-libnativehelper)

set(LIB_PATH "${ANDROID_RT_PATH}/libnativehelper")

set(SRC
  ${LIB_PATH}/ExpandableString.c
  ${LIB_PATH}/JNIPlatformHelp.c
  ${LIB_PATH}/JniConstants.c
  ${LIB_PATH}/JNIHelp.c
  ${LIB_PATH}/file_descriptor_jni.c
)

add_library(android-libnativehelper OBJECT ${SRC})
set(LIBNATIVEHELPER_OBJECTS $<TARGET_OBJECTS:android-libnativehelper> PARENT_SCOPE)