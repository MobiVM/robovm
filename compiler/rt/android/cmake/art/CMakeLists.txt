project(android-art)

set(LIB_PATH "${ANDROID_RT_PATH}/art")

set(SRC
  ${LIB_PATH}/openjdkjvm/OpenjdkJvm.cc
)

add_library(android-art OBJECT ${SRC})
set(ART_OBJECTS $<TARGET_OBJECTS:android-art> PARENT_SCOPE)