project(android-external-zlib)

set(LIB_PATH "${ANDROID_RT_PATH}/external/zlib")
include_directories(${LIB_PATH})
add_definitions(-DUSE_MMAP -DZLIB_CONST)
add_compile_options(-O3)
add_compile_options(-Wall)
add_compile_options(-Werror)
add_compile_options(-Wno-unused-function)
add_compile_options(-Wno-unused-variable)

set(SRC
  ${LIB_PATH}/adler32.c
  ${LIB_PATH}/compress.c
  ${LIB_PATH}/cpu_features.c
  ${LIB_PATH}/crc32.c
  ${LIB_PATH}/deflate.c
  ${LIB_PATH}/gzclose.c
  ${LIB_PATH}/gzlib.c
  ${LIB_PATH}/gzread.c
  ${LIB_PATH}/gzwrite.c
  ${LIB_PATH}/infback.c
  ${LIB_PATH}/inffast.c
  ${LIB_PATH}/inflate.c
  ${LIB_PATH}/inftrees.c
  ${LIB_PATH}/trees.c
  ${LIB_PATH}/uncompr.c
  ${LIB_PATH}/zutil.c
)


add_library(android-external-zlib OBJECT ${SRC})
set(EXTERNAL_ZLIB_OBJECTS $<TARGET_OBJECTS:android-external-zlib> PARENT_SCOPE)