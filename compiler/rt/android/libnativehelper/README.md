# libnativehelper

libnativehelper is a collection of JNI related utilities used in Android.

There are several header and binary libraries here and not all of the
functionality fits together well. The header libraries are mostly C++
based. The binary libraries are entirely written in C with no C++
dependencies. This is by design as the code here can be distributed in
multiple ways, including mainline modules, so keeping the size down
benefits everyone with smaller downloads and a stable ABI.

## Header Libraries

### jni_headers

This is a header library that contains provides the API represented in
the JNI Specification 1.6. Any project in Android that depends on
`jni.h` should depend on this.

See:

* [jni.h](include_jni/jni.h)

### libnativehelper_header_only

These headers provide utilities that defined entirely within the
headers. There are scoped resource classes that make common JNI
patterns of acquiring and releasing resources safer to use than the
JNI specification equivalents. Examples being `ScopedLocalRef` to
manage the lifetime of local references and `ScopedUtfChars` to manage
the lifetime of Java strings in native code and provide access to utf8
characters.

See:

* [nativehelper/nativehelper_utils.h](header_only_include/nativehelper/nativehelper_utils.h)
* [nativehelper/scoped_utf_chars.h](header_only_include/nativehelper/scoped_utf_chars.h)
* [nativehelper/scoped_bytes.h](header_only_include/nativehelper/scoped_bytes.h)
* [nativehelper/scoped_string_chars.h](header_only_include/nativehelper/scoped_string_chars.h)
* [nativehelper/scoped_primitive_array.h](header_only_include/nativehelper/scoped_primitive_array.h)
* [nativehelper/scoped_local_ref.h](header_only_include/nativehelper/scoped_local_ref.h)
* [nativehelper/scoped_local_frame.h](header_only_include/nativehelper/scoped_local_frame.h)

### jni_platform_headers

The `jni_macros.h` header provide compile time checking of JNI methods
implemented in C++. They ensure the C++ method declaration match the
Java signature they are associated with.

See:

* [nativehelper/jni_macros.h](include_platform_header_only/nativehelper/jni_macros.h)

## Libraries

### libnativehelper

A shared library distributed in the ART module that provides helper
routines built on Java APIs. This library depends on details that are
private to libcore and use should be restricted to platform code and
within the ART module.

This library also contains the JNI invocation API from the JNI
Specification and the glue that connects the ART runtime to the API
implementation. The glue logic is platform only as it is used with the
Zygote and the standalone dalvikvm.

See:
* [nativehelper/JNIHelp.h](include/nativehelper/JNIHelp.h)
* [nativehelper/JniInvocation.h](include_platform/nativehelper/JniInvocation.h)
* [nativehelper/JNIPlatformHelp.h](include_platform/nativehelper/JNIPlatformHelp.h)
* [nativehelper/ScopedBytes.h](include/nativehelper/ScopedBytes.h)
* [nativehelper/ScopedUtfChars.h](include/nativehelper/ScopedUtfChars.h)
* [nativehelper/ScopedLocalFrame.h](include/nativehelper/ScopedLocalFrame.h)
* [nativehelper/ScopedLocalRef.h](include/nativehelper/ScopedLocalRef.h)
* [nativehelper/ScopedPrimitiveArray.h](include/nativehelper/ScopedPrimitiveArray.h)
* [nativehelper/ScopedStringChars.h](include/nativehelper/ScopedStringChars.h)
* [nativehelper/toStringArray.h](include/nativehelper/toStringArray.h)

### libnativehelper_compat_libc++

This shared and static library contains a subset of the helper
routines in libnativehelper based on public Java API. This code can be
statically linked as the Java APIs it depends on are considered
stable. The name of this library is a misnomer since it contains no
C++ code.

See:

* [nativehelper/JNIHelp.h](include/nativehelper/JNIHelp.h)
* [nativehelper/ScopedBytes.h](include/nativehelper/ScopedBytes.h)
* [nativehelper/ScopedUtfChars.h](include/nativehelper/ScopedUtfChars.h)
* [nativehelper/ScopedLocalFrame.h](include/nativehelper/ScopedLocalFrame.h)
* [nativehelper/ScopedLocalRef.h](include/nativehelper/ScopedLocalRef.h)
* [nativehelper/ScopedPrimitiveArray.h](include/nativehelper/ScopedPrimitiveArray.h)
* [nativehelper/ScopedStringChars.h](include/nativehelper/ScopedStringChars.h)
* [nativehelper/toStringArray.h](include/nativehelper/toStringArray.h)
