cmake_minimum_required(VERSION 2.8)

# The Mac OS X SDK version required when building the VM libs
set(MACOSX_SDK_VERSION 10.12)
set(LLVM_VERSION 3.9.1)

## ATTENTION: needed to add this to the llvm CMakeLists.txt of llvm on MacOS 10.12
## Taken from /Applications/CMake.app/Contents/share/cmake-3.5/Modules/Platform/Darwin.cmake
#set(CMAKE_SHARED_LIBRARY_RUNTIME_C_FLAG "-Wl,-rpath,")

include(ExternalProject)

if(OS STREQUAL "linux")
  set(LINUX YES)
elseif(OS STREQUAL "macosx")
  set(MACOSX YES)
endif()

project(LLVMExtra)

set(INSTALL_DIR ${CMAKE_SOURCE_DIR}/src/main/resources/org/robovm/llvm/binding/${OS}-${ARCH})

if (ARCH STREQUAL "x86")
  set(X86 YES)
elseif (ARCH STREQUAL "x86_64")
  set(X86_64 YES)
endif()

set(C_CXX_FLAGS "${C_CXX_FLAGS}")
if(MACOSX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -arch x86_64 -mmacosx-version-min=10.8")
  set(LD_FLAGS "${LD_FLAGS} -arch x86_64 -mmacosx-version-min=10.8")
elseif(LINUX AND X86)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m32")
  set(LD_FLAGS "${LD_FLAGS} -m64")
elseif(LINUX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m64")
  set(LD_FLAGS "${LD_FLAGS} -m64")
endif()

if(MACOSX)
    if(NOT SYSROOT)
      exec_program(xcode-select ARGS --print-path OUTPUT_VARIABLE XCODE_PATH)
      if(MACOSX)
        set(SYSROOT "${XCODE_PATH}/Platforms/MacOSX.platform/Developer/SDKs/MacOSX${MACOSX_SDK_VERSION}.sdk")
        if(NOT IS_DIRECTORY ${SYSROOT})
          message(WARNING "Failed to locate MacOSX SDK ${MACOSX_SDK_VERSION}! Fallback to default version")
          set(SYSROOT "${XCODE_PATH}/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk")
          if(NOT IS_DIRECTORY ${SYSROOT})
            set(SYSROOT "${XCODE_PATH}/Platforms/MacOSX.platform/Developer/SDKs/MacOSX10.11.sdk")
            if(NOT IS_DIRECTORY ${SYSROOT})
              message(FATAL_ERROR "Failed to locate MacOSX SDK")
            endif()
          endif()
        endif()
      endif()
    endif()
    set(C_CXX_FLAGS "${C_CXX_FLAGS} -isysroot ${SYSROOT}")
endif()

ExternalProject_Add(extclang
  URL "http://llvm.org/releases/${LLVM_VERSION}/cfe-${LLVM_VERSION}.src.tar.xz"
  #those two tests fail to compile on linux, so empty them
  PATCH_COMMAND echo "int main(int argc, const char **argv) {}" > tools/c-index-test/c-index-test.c && echo "int main(int argc, const char **argv) {}" > tools/c-arcmt-test/c-arcmt-test.c
  UPDATE_COMMAND ""
  CONFIGURE_COMMAND ""
  BUILD_COMMAND ""
  INSTALL_COMMAND ""
  BUILD_IN_SOURCE 1
)

#Archs to build
set(LLVM_ARCHS "X86^^ARM^^AArch64")
#Removed -fvisibility=hidden because libLTO wont build then
set(LLVM_C_FLAGS "${C_CXX_FLAGS} -fdata-sections -ffunction-sections")
set(LLVM_CXX_FLAGS "${C_CXX_FLAGS} -fdata-sections -ffunction-sections")

ExternalProject_Add(extllvm
  DEPENDS extclang
  URL "http://llvm.org/releases/${LLVM_VERSION}/llvm-${LLVM_VERSION}.src.tar.xz"
  PATCH_COMMAND bash -c "rm -rf tools/clang && ln -s ../../../../extclang-prefix/src/extclang tools/clang"
  LIST_SEPARATOR ^^
  CONFIGURE_COMMAND cmake -DCMAKE_CXX_COMPILER=${CMAKE_CXX_COMPILER} -DDLLVM_BUILD_LLVM_DYLIB=ON -DLLVM_LINK_LLVM_DYLIB=ON -DCMAKE_C_COMPILER=${CMAKE_C_COMPILER} -DCMAKE_RC_COMPILER=${CMAKE_RC_COMPILER} -DCMAKE_SYSTEM_NAME=${CMAKE_SYSTEM_NAME} -DCMAKE_BUILD_TYPE=${CMAKE_BUILD_TYPE} -DLLVM_ENABLE_THREADS=YES "-DCMAKE_INSTALL_PREFIX=${CMAKE_BINARY_DIR}/llvm" "-DLLVM_TARGETS_TO_BUILD=${LLVM_ARCHS}" "-DCMAKE_C_FLAGS=${LLVM_C_FLAGS}" "-DCMAKE_CXX_FLAGS=${LLVM_CXX_FLAGS}" ../extllvm/
)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} ${C_CXX_FLAGS}")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} ${C_CXX_FLAGS} -fno-rtti -std=c++11")

if(MACOSX)
  set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -stdlib=libc++")
endif()

include_directories(${CMAKE_SOURCE_DIR}/src/main/native/include ${CMAKE_BINARY_DIR}/llvm/include)

set(SRC
 src/main/native/LLVMExtra.cpp
 src/main/native/ClangExtra.cpp
)

set(LLVM_LIBS -lLLVM-3.9 -lLTO)
add_definitions(-D__STDC_LIMIT_MACROS -D__STDC_CONSTANT_MACROS)

# Required clang libs, clang needs to be linked static
if(LINUX)
  # With the GNU linker library order is important and some libraries have
  # to be repeated in order to resolve all symbols properly.
   set(LLVM_LIBS
     -lclangBasic -lclangDriver -lclangFrontend -lclangCodeGen
     -lclangFrontend -lclangDriver -lclangParse -lclangSerialization
     -lclangSema -lclangEdit -lclangAnalysis -lclangAST -lclangLex
     -lclangBasic ${LLVM_LIBS}
   )
elseif(MACOSX)
  set(LLVM_LIBS ${LLVM_LIBS}
    -lclangFrontend -lclangAST -lclangBasic -lclangLex -lclangSerialization
    -lclangSema -lclangEdit -lclangCodeGen -lclangParse -lclangAnalysis
    -lclangDriver
  )
endif()

if(LINUX)
  set(LLVM_LDFLAGS
    -L"${CMAKE_BINARY_DIR}/llvm/lib"
    -Wl,-rpath,$ORIGIN/
    -lrt -ldl -lpthread ${LLVM_LIBS}
  )
elseif(MACOSX)
  set(LLVM_LDFLAGS
    -L"${CMAKE_BINARY_DIR}/llvm/lib"
    -lcurses -lpthread -lz ${LLVM_LIBS}
  )
endif()

add_library(LLVMExtra SHARED ${SRC})
add_dependencies(LLVMExtra extllvm)
target_link_libraries(LLVMExtra ${LLVM_LDFLAGS})
set_target_properties(LLVMExtra PROPERTIES LINKER_LANGUAGE CXX)

if(WINDOWS)
 install(TARGETS LLVMExtra RUNTIME DESTINATION ${INSTALL_DIR})
else()
 install(TARGETS LLVMExtra LIBRARY DESTINATION ${INSTALL_DIR})
endif()

add_custom_command(TARGET LLVMExtra POST_BUILD
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/llvm ${CMAKE_SOURCE_DIR}/src/main/native/include/llvm
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/llvm-c ${CMAKE_SOURCE_DIR}/src/main/native/include/llvm-c
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/clang ${CMAKE_SOURCE_DIR}/src/main/native/include/clang
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/clang-c ${CMAKE_SOURCE_DIR}/src/main/native/include/clang-c

    COMMAND cmake -E copy ${CMAKE_BINARY_DIR}/llvm/lib/libLLVM-3.9.so ${INSTALL_DIR}
    COMMAND cmake -E copy ${CMAKE_BINARY_DIR}/llvm/lib/libLTO.so ${INSTALL_DIR}
)
