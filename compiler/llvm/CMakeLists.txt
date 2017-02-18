cmake_minimum_required(VERSION 2.8)

# The Mac OS X SDK version required when building the VM libs
set(MACOSX_SDK_VERSION 10.12)
set(LLVM_VERSION 3.9.1)

set(CMAKE_MACOSX_RPATH 1)

## ATTENTION: needed to add this to the llvm CMakeLists.txt of llvm on MacOS 10.12
## Taken from /Applications/CMake.app/Contents/share/cmake-3.5/Modules/Platform/Darwin.cmake
#set(CMAKE_SHARED_LIBRARY_RUNTIME_C_FLAG "-Wl,-rpath,")

include(ExternalProject)

if(OS STREQUAL "linux")
  set(LINUX YES)
elseif(OS STREQUAL "macosx")
  set(MACOSX YES)
endif()

project(LLVM)

set(INSTALL_DIR ${CMAKE_SOURCE_DIR}/src/main/resources/org/robovm/llvm/binding/${OS}-${ARCH})

if (ARCH STREQUAL "x86")
  set(X86 YES)
elseif (ARCH STREQUAL "x86_64")
  set(X86_64 YES)
endif()

set(C_CXX_FLAGS "${C_CXX_FLAGS}")
if(MACOSX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -arch x86_64")
  set(LD_FLAGS "${LD_FLAGS} -arch x86_64")
elseif(LINUX AND X86)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m32")
  set(LD_FLAGS "${LD_FLAGS} -m64")
elseif(LINUX AND X86_64)
  set(C_CXX_FLAGS "${C_CXX_FLAGS} -m64")
  set(LD_FLAGS "${LD_FLAGS} -m64")
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
#set(LLVM_C_FLAGS "${C_CXX_FLAGS} -fdata-sections -ffunction-sections")
#set(LLVM_CXX_FLAGS "${C_CXX_FLAGS} -fdata-sections -ffunction-sections")

ExternalProject_Add(extllvm
  DEPENDS extclang
  URL "http://llvm.org/releases/${LLVM_VERSION}/llvm-${LLVM_VERSION}.src.tar.xz"
  PATCH_COMMAND bash -c "rm -rf tools/clang && ln -s ../../../../extclang-prefix/src/extclang tools/clang"
  LIST_SEPARATOR ^^
  CONFIGURE_COMMAND cmake -DLLVM_BUILD_TOOLS=OFF -DBUILD_SHARED_LIBS=OFF -DDLIBCLANG_BUILD_STATIC=YES -DCMAKE_BUILD_TYPE=${CMAKE_BUILD_TYPE} -DLLVM_ENABLE_THREADS=YES "-DCMAKE_INSTALL_PREFIX=${CMAKE_BINARY_DIR}/llvm" "-DLLVM_TARGETS_TO_BUILD=${LLVM_ARCHS}" "-DCMAKE_C_FLAGS=${LLVM_C_FLAGS}" "-DCMAKE_CXX_FLAGS=${LLVM_CXX_FLAGS}" ../extllvm/
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

add_definitions(-D__STDC_LIMIT_MACROS -D__STDC_CONSTANT_MACROS)

# This was generated using -all flag for llvm-config
set(LLVM_LIBS
    -lLLVMLTO -lLLVMObjCARCOpts -lLLVMSymbolize -lLLVMDebugInfoPDB
    -lLLVMDebugInfoDWARF -lLLVMTableGen -lLLVMLineEditor -lLLVMOrcJIT
    -lLLVMCoverage -lLLVMMIRParser -lLLVMAArch64Disassembler -lLLVMAArch64CodeGen
    -lLLVMGlobalISel -lLLVMAArch64AsmParser -lLLVMAArch64Desc -lLLVMAArch64Info
    -lLLVMAArch64AsmPrinter -lLLVMAArch64Utils -lLLVMARMDisassembler -lLLVMARMCodeGen
    -lLLVMARMAsmParser -lLLVMARMDesc -lLLVMARMInfo -lLLVMARMAsmPrinter -lLLVMObjectYAML
    -lLLVMLibDriver -lLLVMOption -lLLVMX86Disassembler
    -lLLVMX86AsmParser -lLLVMX86CodeGen -lLLVMSelectionDAG -lLLVMAsmPrinter
    -lLLVMDebugInfoCodeView -lLLVMX86Desc -lLLVMMCDisassembler -lLLVMX86Info
    -lLLVMX86AsmPrinter -lLLVMX86Utils -lLLVMMCJIT -lLLVMPasses -lLLVMipo -lLLVMVectorize
    -lLLVMLinker -lLLVMIRReader -lLLVMAsmParser -lLLVMInterpreter -lLLVMExecutionEngine
    -lLLVMRuntimeDyld -lLLVMObject -lLLVMMCParser -lLLVMCodeGen -lLLVMTarget -lLLVMScalarOpts
    -lLLVMInstCombine -lLLVMInstrumentation -lLLVMTransformUtils -lLLVMMC -lLLVMBitWriter
    -lLLVMBitReader -lLLVMAnalysis -lLLVMProfileData -lLLVMCore -lLLVMSupport
)

# Required clang libs
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
     ${LLVM_LIBS}
    -L"${CMAKE_BINARY_DIR}/llvm/lib"
    -Wl,-rpath,@loader_path/.
    -lcurses -lpthread -lz
  )
endif()

add_library(LLVM SHARED ${SRC})
add_dependencies(LLVM extllvm)
target_link_libraries(LLVM ${LLVM_LDFLAGS})
set_target_properties(LLVM PROPERTIES LINKER_LANGUAGE CXX)

if(LINUX)
  #set_target_properties(robovm-llvm PROPERTIES LINK_FLAGS "-Wl,--gc-sections -Wl,--version-script=${CMAKE_SOURCE_DIR}/src/main/native/exports_linux.sym")
elseif(MACOSX)
  set_target_properties(LLVM PROPERTIES LINK_FLAGS "-Wl,-exported_symbols_list -Wl,${CMAKE_SOURCE_DIR}/src/main/native/exports_macosx.sym")
  #set_target_properties(LLVM PROPERTIES LINK_FLAGS "-Wl,-dead_strip -Wl,-exported_symbols_list -Wl,${CMAKE_SOURCE_DIR}/src/main/native/exports_macosx.sym")
endif()
set(CMAKE_INSTALL_DO_STRIP FALSE)
set(CMAKE_STRIP echo)
install(TARGETS LLVM LIBRARY DESTINATION ${INSTALL_DIR})

add_custom_command(TARGET LLVM POST_BUILD
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/llvm ${CMAKE_SOURCE_DIR}/src/main/native/include/llvm
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/llvm-c ${CMAKE_SOURCE_DIR}/src/main/native/include/llvm-c
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/clang ${CMAKE_SOURCE_DIR}/src/main/native/include/clang
    COMMAND cmake -E copy_directory ${CMAKE_BINARY_DIR}/llvm/include/clang-c ${CMAKE_SOURCE_DIR}/src/main/native/include/clang-c

    #COMMAND cmake -E copy ${CMAKE_BINARY_DIR}/llvm/lib/${LLVM_LIB_SO} ${INSTALL_DIR}
    #COMMAND cmake -E copy ${CMAKE_BINARY_DIR}/llvm/lib/${LTO_LIB_SO} ${INSTALL_DIR}
    #COMMAND cmake -E copy ${CMAKE_BINARY_DIR}/llvm/lib/${CLANG_LIB_SO} ${INSTALL_DIR}
)
