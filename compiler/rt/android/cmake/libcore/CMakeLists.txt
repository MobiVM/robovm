project(android-libcore)

message(STATUS "ANDROID_RT_PATH: ${ANDROID_RT_PATH}")

set(LUNI_PATH "${ANDROID_RT_PATH}/libcore/luni/src/main/native")
set(OJLUNI_PATH "${ANDROID_RT_PATH}/libcore/ojluni/src/main/native")
set(LUNI4_PATH "${ANDROID_RT_PATH}/libcore.luni4/src/main/native")
set(ADDED_PATH "${ANDROID_RT_PATH}/libcore.additional/src/main/native")

include_directories(
  "${ANDROID_RT_PATH}/external/icu/icu4c/source/common"
  "${ANDROID_RT_PATH}/external/icu/icu4c/source/i18n"
  "${ANDROID_RT_PATH}/external/boringssl/src/include"
  "${LUNI_PATH}"
  "${OJLUNI_PATH}"
)

add_definitions(-DBORINGSSL_IMPLEMENTATION)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Wextra -Wno-unused-parameter")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DU_USING_ICU_NAMESPACE=0")

# luni files
set(SRC
  ${LUNI_PATH}/ExecStrings.cpp
  ${LUNI_PATH}/IcuUtilities.cpp
  ${LUNI_PATH}/JniException.cpp
  ${LUNI_PATH}/NetworkUtilities.cpp
  ${LUNI_PATH}/Register.cpp
  ${LUNI_PATH}/ZipUtilities.cpp
  ${LUNI_PATH}/android_system_OsConstants.cpp
  ${LUNI_PATH}/cbigint.cpp
  ${LUNI_PATH}/java_lang_StringToReal.cpp
  ${LUNI_PATH}/libcore_icu_ICU.cpp
  ${LUNI_PATH}/libcore_io_AsynchronousCloseMonitor.cpp
  ${LUNI_PATH}/libcore_io_Memory.cpp
  ${LUNI_PATH}/libcore_math_NativeBN.cpp
  ${LUNI_PATH}/libcore_util_NativeAllocationRegistry.cpp
  ${LUNI_PATH}/org_apache_harmony_xml_ExpatParser.cpp
  ${LUNI_PATH}/valueOf.cpp
  ${LUNI_PATH}/AsynchronousCloseMonitor.cpp
  # files from luni4
  ${LUNI4_PATH}/libcore_io_Posix.cpp
  ${LUNI4_PATH}/java_nio_charset_Charsets.cpp
  ${LUNI4_PATH}/android_icu_impl_ICUBinary.cpp
  ${LUNI4_PATH}/java_util_concurrent_atomic_AtomicLong.cpp
)
if(LINUX)
  set(SRC
    ${SRC}
    ${LUNI_PATH}/libcore_io_Linux.cpp
  )
endif()


# ojluni files
set(SRC
  ${SRC}
  ${OJLUNI_PATH}/ZipFile.c
  ${OJLUNI_PATH}/Inflater.c
  ${OJLUNI_PATH}/Deflater.c
  ${OJLUNI_PATH}/CRC32.c
  ${OJLUNI_PATH}/Adler32.c
  ${OJLUNI_PATH}/zip_util.c
  ${OJLUNI_PATH}/jni_util.c
  ${OJLUNI_PATH}/jni_util_md.c
  ${OJLUNI_PATH}/io_util.c
  ${OJLUNI_PATH}/canonicalize_md.c
  ${OJLUNI_PATH}/FileDescriptor_md.c
  ${OJLUNI_PATH}/DatagramChannelImpl.c
  ${OJLUNI_PATH}/DatagramDispatcher.c
  ${OJLUNI_PATH}/Console_md.c
  ${OJLUNI_PATH}/IOUtil.c
  ${OJLUNI_PATH}/PollArrayWrapper.c
  ${OJLUNI_PATH}/SocketChannelImpl.c
  ${OJLUNI_PATH}/FileChannelImpl.c
  ${OJLUNI_PATH}/FileDispatcherImpl.c
  ${OJLUNI_PATH}/FileInputStream.c
  ${OJLUNI_PATH}/FileSystemPreferences.c
  ${OJLUNI_PATH}/UnixAsynchronousServerSocketChannelImpl.c
  ${OJLUNI_PATH}/UnixAsynchronousSocketChannelImpl.c
  ${OJLUNI_PATH}/io_util_md.c
  ${OJLUNI_PATH}/NativeThread.c
  ${OJLUNI_PATH}/FileKey.c
  ${OJLUNI_PATH}/UnixFileSystem_md.c
  ${OJLUNI_PATH}/ObjectStreamClass.c
  ${OJLUNI_PATH}/ObjectOutputStream.c
  ${OJLUNI_PATH}/ObjectInputStream.c
  ${OJLUNI_PATH}/UnixCopyFile.c
  ${OJLUNI_PATH}/UnixNativeDispatcher.c
  ${OJLUNI_PATH}/InetAddress.c
  ${OJLUNI_PATH}/net_util.c
  ${OJLUNI_PATH}/net_util_md.c
  ${OJLUNI_PATH}/Net.c
  ${OJLUNI_PATH}/MappedByteBuffer.c
  ${OJLUNI_PATH}/Inet6Address.c
  ${OJLUNI_PATH}/Inet4Address.c
  ${OJLUNI_PATH}/linux_close.cpp
  ${OJLUNI_PATH}/ServerSocketChannelImpl.c
  ${OJLUNI_PATH}/SocketInputStream.c
  ${OJLUNI_PATH}/SocketOutputStream.c
  ${OJLUNI_PATH}/Float.c
  ${OJLUNI_PATH}/Double.c
  ${OJLUNI_PATH}/StrictMath.c
  ${OJLUNI_PATH}/Math.c
  ${OJLUNI_PATH}/ProcessEnvironment_md.c
  ${OJLUNI_PATH}/System.c
  ${OJLUNI_PATH}/Runtime.c
  ${OJLUNI_PATH}/UNIXProcess_md.c
  ${OJLUNI_PATH}/Character.cpp
  ${OJLUNI_PATH}/socket_tagger_util.cpp
  ${OJLUNI_PATH}/OnLoad.cpp
)

if(LINUX)
  set(SRC
    ${SRC}
    ${OJLUNI_PATH}/EPoll.c
    ${OJLUNI_PATH}/EPollPort.c
    ${OJLUNI_PATH}/LinuxNativeDispatcher.c
    ${OJLUNI_PATH}/LinuxWatchService.c
  )
endif()


if(DARWIN)
  set(SRC
    ${SRC}
    ${ADDED_PATH}/KQueue.c
    ${ADDED_PATH}/KQueueArrayWrapper.c
    ${ADDED_PATH}/KQueuePort.c
  )
endif()

add_library(android-libcore OBJECT ${SRC})
set(LIBCORE_OBJECTS $<TARGET_OBJECTS:android-libcore> PARENT_SCOPE)