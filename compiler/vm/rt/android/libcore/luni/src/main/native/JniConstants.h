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

#ifndef JNI_CONSTANTS_H_included
#define JNI_CONSTANTS_H_included

#include <jni.h>

/**
 * A cache to avoid calling FindClass at runtime.
 */
struct JniConstants {
    // Initialized cached heap objects. This should be called in JNI_OnLoad.
    static void Initialize(JNIEnv* env);

    // Invalidate cached heap objects. This should be called in JNI_OnUnload.
    static void Invalidate();

    static jclass GetBooleanClass(JNIEnv* env);
    static jclass GetCharsetICUClass(JNIEnv* env);
    static jclass GetDoubleClass(JNIEnv* env);
    static jclass GetErrnoExceptionClass(JNIEnv* env);
    static jclass GetFileDescriptorClass(JNIEnv* env);
    static jclass GetGaiExceptionClass(JNIEnv* env);
    static jclass GetInet6AddressClass(JNIEnv* env);
    static jclass GetInet6AddressHolderClass(JNIEnv* env);
    static jclass GetInetAddressClass(JNIEnv* env);
    static jclass GetInetAddressHolderClass(JNIEnv* env);
    static jclass GetInetSocketAddressClass(JNIEnv* env);
    static jclass GetInetSocketAddressHolderClass(JNIEnv* env);
    static jclass GetIntegerClass(JNIEnv* env);
    static jclass GetLocaleDataClass(JNIEnv* env);
    static jclass GetLongClass(JNIEnv* env);
    static jclass GetNetlinkSocketAddressClass(JNIEnv* env);
    static jclass GetPacketSocketAddressClass(JNIEnv* env);
    static jclass GetPatternSyntaxExceptionClass(JNIEnv* env);
    static jclass GetStringClass(JNIEnv* env);
    static jclass GetStructAddrinfoClass(JNIEnv* env);
    static jclass GetStructFlockClass(JNIEnv* env);
    static jclass GetStructGroupReqClass(JNIEnv* env);
    static jclass GetStructIfaddrsClass(JNIEnv* env);
    static jclass GetStructLingerClass(JNIEnv* env);
    static jclass GetStructPasswdClass(JNIEnv* env);
    static jclass GetStructPollfdClass(JNIEnv* env);
    static jclass GetStructStatClass(JNIEnv* env);
    static jclass GetStructStatVfsClass(JNIEnv* env);
    static jclass GetStructTimespecClass(JNIEnv* env);
    static jclass GetStructTimevalClass(JNIEnv* env);
    static jclass GetStructUcredClass(JNIEnv* env);
    static jclass GetStructUtsnameClass(JNIEnv* env);
    static jclass GetUnixSocketAddressClass(JNIEnv* env);
};

#endif  // JNI_CONSTANTS_H_included
