project(robovm-rt-core)

include_directories(../../vm/core/include ${CMAKE_BINARY_DIR}/gc/include)

set(SRC
  src/main/native/rt.c
  src/main/native/reflection_helpers.c 
  src/main/native/java_lang_Class.c 
  src/main/native/java_lang_ClassCache.c 
  src/main/native/java_lang_Object.c 
  src/main/native/java_lang_Thread.c 
  src/main/native/java_lang_Throwable.c 
  src/main/native/java_lang_Runtime.c 
  src/main/native/java_lang_String.c 
  src/main/native/java_lang_System.c 
  src/main/native/java_lang_VMClassLoader.c 
  src/main/native/java_lang_ref_Reference.c 
  src/main/native/java_lang_reflect_AccessibleObject.c 
  src/main/native/java_lang_reflect_Array.c 
  src/main/native/java_lang_reflect_Constructor.c 
  src/main/native/java_lang_reflect_Field.c 
  src/main/native/java_lang_reflect_Method.c 
  src/main/native/java_lang_reflect_Proxy.c 
  src/main/native/java_net_NetworkInterface.c 
  src/main/native/org_robovm_rt_Signals.c 
  src/main/native/org_robovm_rt_GC.c 
  src/main/native/org_robovm_rt_VM.c 
  src/main/native/sun_misc_Unsafe.cpp
)

if(DARWIN)
  add_definitions(-DNOUNCRYPT)
  set(OBJC_SRC src/main/native/darwin.m)
  set(SRC ${SRC} ${OBJC_SRC})
  set(OBJC_FLAGS "-x objective-c")
  if(IOS)
    set(OBJC_FLAGS "${OBJC_FLAGS} -fobjc-abi-version=2")
  endif()
  # disable errors on clang clang-1500.3.9.4
  set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wno-error=incompatible-function-pointer-types -Wno-error=int-conversion")
  set_property(SOURCE ${OBJC_SRC} PROPERTY LANGUAGE C)
  set_property(SOURCE ${OBJC_SRC} PROPERTY COMPILE_FLAGS ${OBJC_FLAGS})
endif()

add_library(robovm-rt-core OBJECT ${SRC})
add_dependencies(robovm-rt-core extgc)
set(ROBOVM_RT_CORE_OBJECTS $<TARGET_OBJECTS:robovm-rt-core> PARENT_SCOPE)

