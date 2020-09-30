/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#define LOG_TAG "JniConstants"

#include "JniConstants.h"

#include <atomic>
#include <mutex>
#include <stdlib.h>

#include <log/log.h>
#include <nativehelper/ScopedLocalRef.h>

namespace {

jclass findClass(JNIEnv* env, const char* name) {
    ScopedLocalRef<jclass> localClass(env, env->FindClass(name));
    jclass result = reinterpret_cast<jclass>(env->NewGlobalRef(localClass.get()));
    if (result == NULL) {
        ALOGE("failed to find class '%s'", name);
        abort();
    }
    return result;
}

// Mutex protecting static variables
static std::mutex g_constants_mutex;

// Flag indicating whether cached constants are valid
static bool g_constants_valid = false;

// Constants
jclass booleanClass;
jclass charsetICUClass;
jclass doubleClass;
jclass errnoExceptionClass;
jclass fileDescriptorClass;
jclass gaiExceptionClass;
jclass inet6AddressClass;
jclass inet6AddressHolderClass;
jclass inetAddressClass;
jclass inetAddressHolderClass;
jclass inetSocketAddressClass;
jclass inetSocketAddressHolderClass;
jclass integerClass;
jclass localeDataClass;
jclass longClass;
jclass netlinkSocketAddressClass;
jclass packetSocketAddressClass;
jclass patternSyntaxExceptionClass;
jclass stringClass;
jclass structAddrinfoClass;
jclass structFlockClass;
jclass structGroupReqClass;
jclass structIfaddrsClass;
jclass structLingerClass;
jclass structPasswdClass;
jclass structPollfdClass;
jclass structStatClass;
jclass structStatVfsClass;
jclass structTimespecClass;
jclass structTimevalClass;
jclass structUcredClass;
jclass structUtsnameClass;
jclass unixSocketAddressClass;

// EnsureJniConstantsInitialized initializes cached constants. It should be
// called before returning a heap object from the cache to ensure cache is
// initialized. This pattern is only necessary because if a process finishes one
// runtime and starts another then JNI_OnLoad may not be called.
void EnsureJniConstantsInitialized(JNIEnv* env) {
    if (g_constants_valid) {
        return;
    }

    std::lock_guard guard(g_constants_mutex);
    if (g_constants_valid) {
        return;
    }

    booleanClass = findClass(env, "java/lang/Boolean");
    charsetICUClass = findClass(env, "java/nio/charset/CharsetICU");
    doubleClass = findClass(env, "java/lang/Double");
    errnoExceptionClass = findClass(env, "android/system/ErrnoException");
    fileDescriptorClass = findClass(env, "java/io/FileDescriptor");
    gaiExceptionClass = findClass(env, "android/system/GaiException");
    inet6AddressClass = findClass(env, "java/net/Inet6Address");
    inet6AddressHolderClass = findClass(env, "java/net/Inet6Address$Inet6AddressHolder");
    inetAddressClass = findClass(env, "java/net/InetAddress");
    inetAddressHolderClass = findClass(env, "java/net/InetAddress$InetAddressHolder");
    inetSocketAddressClass = findClass(env, "java/net/InetSocketAddress");
    inetSocketAddressHolderClass = findClass(env, "java/net/InetSocketAddress$InetSocketAddressHolder");
    integerClass = findClass(env, "java/lang/Integer");
    localeDataClass = findClass(env, "libcore/icu/LocaleData");
    longClass = findClass(env, "java/lang/Long");
    netlinkSocketAddressClass = findClass(env, "android/system/NetlinkSocketAddress");
    packetSocketAddressClass = findClass(env, "android/system/PacketSocketAddress");
    patternSyntaxExceptionClass = findClass(env, "java/util/regex/PatternSyntaxException");
    stringClass = findClass(env, "java/lang/String");
    structAddrinfoClass = findClass(env, "android/system/StructAddrinfo");
    structFlockClass = findClass(env, "android/system/StructFlock");
    structGroupReqClass = findClass(env, "android/system/StructGroupReq");
    structIfaddrsClass = findClass(env, "android/system/StructIfaddrs");
    structLingerClass = findClass(env, "android/system/StructLinger");
    structPasswdClass = findClass(env, "android/system/StructPasswd");
    structPollfdClass = findClass(env, "android/system/StructPollfd");
    structStatClass = findClass(env, "android/system/StructStat");
    structStatVfsClass = findClass(env, "android/system/StructStatVfs");
    structTimevalClass = findClass(env, "android/system/StructTimeval");
    structTimespecClass = findClass(env, "android/system/StructTimespec");
    structUcredClass = findClass(env, "android/system/StructUcred");
    structUtsnameClass = findClass(env, "android/system/StructUtsname");
    unixSocketAddressClass = findClass(env, "android/system/UnixSocketAddress");

    g_constants_valid = true;
}

}  // namespace

void JniConstants::Initialize(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
}

void JniConstants::Invalidate() {
    std::lock_guard guard(g_constants_mutex);
    g_constants_valid = false;
}

jclass JniConstants::GetBooleanClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return booleanClass;
}

jclass JniConstants::GetCharsetICUClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return charsetICUClass;
}

jclass JniConstants::GetDoubleClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return doubleClass;
}

jclass JniConstants::GetErrnoExceptionClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return errnoExceptionClass;
}

jclass JniConstants::GetFileDescriptorClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return fileDescriptorClass;
}

jclass JniConstants::GetGaiExceptionClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return gaiExceptionClass;
}

jclass JniConstants::GetInet6AddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inet6AddressClass;
}

jclass JniConstants::GetInet6AddressHolderClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inet6AddressHolderClass;
}

jclass JniConstants::GetInetAddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inetAddressClass;
}

jclass JniConstants::GetInetAddressHolderClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inetAddressHolderClass;
}

jclass JniConstants::GetInetSocketAddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inetSocketAddressClass;
}

jclass JniConstants::GetInetSocketAddressHolderClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return inetSocketAddressHolderClass;
}

jclass JniConstants::GetIntegerClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return integerClass;
}

jclass JniConstants::GetLocaleDataClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return localeDataClass;
}

jclass JniConstants::GetLongClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return longClass;
}

jclass JniConstants::GetNetlinkSocketAddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return netlinkSocketAddressClass;
}

jclass JniConstants::GetPacketSocketAddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return packetSocketAddressClass;
}

jclass JniConstants::GetPatternSyntaxExceptionClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return patternSyntaxExceptionClass;
}

jclass JniConstants::GetStringClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return stringClass;
}

jclass JniConstants::GetStructAddrinfoClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structAddrinfoClass;
}

jclass JniConstants::GetStructFlockClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structFlockClass;
}

jclass JniConstants::GetStructGroupReqClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structGroupReqClass;
}

jclass JniConstants::GetStructIfaddrsClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structIfaddrsClass;
}

jclass JniConstants::GetStructLingerClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structLingerClass;
}

jclass JniConstants::GetStructPasswdClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structPasswdClass;
}

jclass JniConstants::GetStructPollfdClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structPollfdClass;
}

jclass JniConstants::GetStructStatClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structStatClass;
}

jclass JniConstants::GetStructStatVfsClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structStatVfsClass;
}

jclass JniConstants::GetStructTimespecClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structTimespecClass;
}

jclass JniConstants::GetStructTimevalClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structTimevalClass;
}

jclass JniConstants::GetStructUcredClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structUcredClass;
}

jclass JniConstants::GetStructUtsnameClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return structUtsnameClass;
}

jclass JniConstants::GetUnixSocketAddressClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return unixSocketAddressClass;
}
