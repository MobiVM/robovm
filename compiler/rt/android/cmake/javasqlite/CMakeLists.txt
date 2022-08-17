project(android-external-javasqlite)

set(LIB_PATH "${ANDROID_RT_PATH}/external/javasqlite")

include_directories(
  ${ANDROID_RT_PATH}/external/sqlite/dist
)

add_definitions(
  -DDONT_USE_JNI_ONLOAD
)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wno-error=sign-compare -Wno-unused-parameter")

set(SRC
  ${LIB_PATH}/src/main/native/sqlite_jni.c
)

add_library(android-external-javasqlite OBJECT ${SRC})
set(EXTERNAL_JAVASQLITE_OBJECTS $<TARGET_OBJECTS:android-external-javasqlite> PARENT_SCOPE)