project(android-system-libbase)

set(LIBBASE_PATH "${ANDROID_RT_PATH}/system/libbase")
set(SRC
    ${LIBBASE_PATH}/logging.cpp
    ${LIBBASE_PATH}/threads.cpp
    ${LIBBASE_PATH}/stringprintf.cpp 
    ${LIBBASE_PATH}/file.cpp
    ${LIBBASE_PATH}/strings.cpp
# FIXME: keep it empty for now as we don't need base code from Android core in robovm. Probably printf would be enough
# FIXME: fix on final linkage stage
)

add_library(android-system-libbase OBJECT ${SRC})
set(SYSTEM_LIBBASE_OBJECTS $<TARGET_OBJECTS:android-system-libbase> PARENT_SCOPE)