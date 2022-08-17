/*
 * Copyright (C) 2008 The Android Open Source Project
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

#include <nativehelper/JNIHelp.h>
#include <nativehelper/jni_macros.h>

#include "IcuUtilities.h"

#include "unicode/uchar.h"
#include "unicode/ulocdata.h"
#include "unicode/uversion.h"
#include "unicode/timezone.h"

static jstring versionString(JNIEnv* env, const UVersionInfo& version) {
    char versionString[U_MAX_VERSION_STRING_LENGTH];
    u_versionToString(const_cast<UVersionInfo&>(version), &versionString[0]);
    return env->NewStringUTF(versionString);
}

static jstring Icu4cMetadata_getCldrVersion(JNIEnv* env, jclass) {
    UErrorCode status = U_ZERO_ERROR;
    UVersionInfo cldrVersion;
    ulocdata_getCLDRVersion(cldrVersion, &status);
    return versionString(env, cldrVersion);
}

static jstring Icu4cMetadata_getIcuVersion(JNIEnv* env, jclass) {
    UVersionInfo icuVersion;
    u_getVersion(icuVersion);
    return versionString(env, icuVersion);
}

static jstring Icu4cMetadata_getUnicodeVersion(JNIEnv* env, jclass) {
    UVersionInfo unicodeVersion;
    u_getUnicodeVersion(unicodeVersion);
    return versionString(env, unicodeVersion);
}

static jstring Icu4cMetadata_getTzdbVersion(JNIEnv* env, jclass) {
   UErrorCode status = U_ZERO_ERROR;
   const char* version = icu::TimeZone::getTZDataVersion(status);
   if (maybeThrowIcuException(env, "icu::TimeZone::getTZDataVersion", status)) {
     return NULL;
   }
   return env->NewStringUTF(version);
}

static JNINativeMethod gMethods[] = {
    NATIVE_METHOD(Icu4cMetadata, getCldrVersion, "()Ljava/lang/String;"),
    NATIVE_METHOD(Icu4cMetadata, getIcuVersion, "()Ljava/lang/String;"),
    NATIVE_METHOD(Icu4cMetadata, getUnicodeVersion, "()Ljava/lang/String;"),
    NATIVE_METHOD(Icu4cMetadata, getTzdbVersion, "()Ljava/lang/String;"),
};

void register_com_android_icu_util_Icu4cMetadata(JNIEnv* env) {
    jniRegisterNativeMethods(env, "com/android/icu/util/Icu4cMetadata", gMethods, NELEM(gMethods));
}
