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

#define LOG_NDEBUG 1
#define LOG_TAG "ICU"

#include <memory>
#include <vector>

#include <log/log.h>
#include <nativehelper/JNIHelp.h>
#include <nativehelper/ScopedUtfChars.h>
#include <nativehelper/jni_macros.h>
#include <nativehelper/toStringArray.h>

#include "IcuUtilities.h"
#include "JniException.h"
#include "ScopedIcuULoc.h"
#include "unicode/char16ptr.h"
#include "unicode/uchar.h"
#include "unicode/uloc.h"
#include "unicode/ulocdata.h"
#include "unicode/ustring.h"
#include "unicode/uversion.h"

#define U_ICUDATA_CURR U_ICUDATA_NAME "-" "curr"

static jstring ICU_getScript(JNIEnv* env, jclass, jstring javaLocaleName) {
  ScopedIcuULoc icuLocale(env, javaLocaleName);
  if (!icuLocale.valid()) {
    return NULL;
  }
  // Normal script part is 4-char long. Being conservative for allocation size
  // because if the locale contains script part, it should not be longer than the locale itself.
  int32_t capacity = std::max(ULOC_SCRIPT_CAPACITY, icuLocale.locale_length() + 1);
  auto buffer = std::make_unique<char[]>(capacity);
  UErrorCode status = U_ZERO_ERROR;
  uloc_getScript(icuLocale.locale(), buffer.get(), capacity, &status);
  if (U_FAILURE(status)) {
    return NULL;
  }
  return env->NewStringUTF(buffer.get());
}

static jstring ICU_getISO3Country(JNIEnv* env, jclass, jstring javaLanguageTag) {
  ScopedIcuULoc icuLocale(env, javaLanguageTag);
  if (!icuLocale.valid()) {
    return NULL;
  }
  return env->NewStringUTF(uloc_getISO3Country(icuLocale.locale()));
}

static jstring ICU_getISO3Language(JNIEnv* env, jclass, jstring javaLanguageTag) {
  ScopedIcuULoc icuLocale(env, javaLanguageTag);
  if (!icuLocale.valid()) {
    return NULL;
  }
  return env->NewStringUTF(uloc_getISO3Language(icuLocale.locale()));
}

static jobjectArray ICU_getISOCountriesNative(JNIEnv* env, jclass) {
    return toStringArray(env, uloc_getISOCountries());
}

static jobjectArray ICU_getISOLanguagesNative(JNIEnv* env, jclass) {
    return toStringArray(env, uloc_getISOLanguages());
}

static jobjectArray ICU_getAvailableLocalesNative(JNIEnv* env, jclass) {
    return toStringArray(env, uloc_countAvailable, uloc_getAvailable);
}

static jstring ICU_getDefaultLocale(JNIEnv* env, jclass) {
  return env->NewStringUTF(uloc_getDefault());
}

static jstring versionString(JNIEnv* env, const UVersionInfo& version) {
    char versionString[U_MAX_VERSION_STRING_LENGTH];
    u_versionToString(const_cast<UVersionInfo&>(version), &versionString[0]);
    return env->NewStringUTF(versionString);
}

static jstring ICU_getCldrVersion(JNIEnv* env, jclass) {
  UErrorCode status = U_ZERO_ERROR;
  UVersionInfo cldrVersion;
  ulocdata_getCLDRVersion(cldrVersion, &status);
  return versionString(env, cldrVersion);
}

static jstring ICU_getIcuVersion(JNIEnv* env, jclass) {
    UVersionInfo icuVersion;
    u_getVersion(icuVersion);
    return versionString(env, icuVersion);
}

static jstring ICU_getUnicodeVersion(JNIEnv* env, jclass) {
    UVersionInfo unicodeVersion;
    u_getUnicodeVersion(unicodeVersion);
    return versionString(env, unicodeVersion);
}

static JNINativeMethod gMethods[] = {
    NATIVE_METHOD(ICU, getAvailableLocalesNative, "()[Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getCldrVersion, "()Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getDefaultLocale, "()Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getIcuVersion, "()Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getISO3Country, "(Ljava/lang/String;)Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getISO3Language, "(Ljava/lang/String;)Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getISOCountriesNative, "()[Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getISOLanguagesNative, "()[Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getScript, "(Ljava/lang/String;)Ljava/lang/String;"),
    NATIVE_METHOD(ICU, getUnicodeVersion, "()Ljava/lang/String;"),
};

void register_libcore_icu_ICU(JNIEnv* env) {
  jniRegisterNativeMethods(env, "libcore/icu/ICU", gMethods, NELEM(gMethods));
}

void unregister_libcore_icu_ICU() {
  // Skip unregistering JNI methods explicitly, class unloading takes care of
  // it.
}
