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

#include "ScopedIcuLocale.h"
#include "ScopedJavaUnicodeString.h"

#include "unicode/locid.h"
#include "unicode/unistr.h"


static jstring CaseMapperNative_toLowerCase(JNIEnv* env, jclass, jstring javaString, jstring javaLanguageTag) {
  ScopedJavaUnicodeString scopedString(env, javaString);
  if (!scopedString.valid()) {
    return NULL;
  }
  ScopedIcuLocale icuLocale(env, javaLanguageTag);
  if (!icuLocale.valid()) {
    return NULL;
  }
  icu::UnicodeString& s(scopedString.unicodeString());
  icu::UnicodeString original(s);
  s.toLower(icuLocale.locale());
  return s == original ? javaString : jniCreateString(env, s.getBuffer(), s.length());
}

static jstring CaseMapperNative_toUpperCase(JNIEnv* env, jclass, jstring javaString, jstring javaLanguageTag) {
  ScopedJavaUnicodeString scopedString(env, javaString);
  if (!scopedString.valid()) {
    return NULL;
  }
  ScopedIcuLocale icuLocale(env, javaLanguageTag);
  if (!icuLocale.valid()) {
    return NULL;
  }
  icu::UnicodeString& s(scopedString.unicodeString());
  icu::UnicodeString original(s);
  s.toUpper(icuLocale.locale());
  return s == original ? javaString : jniCreateString(env, s.getBuffer(), s.length());
}

static JNINativeMethod gMethods[] = {
    NATIVE_METHOD(CaseMapperNative, toLowerCase, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"),
    NATIVE_METHOD(CaseMapperNative, toUpperCase, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"),
};

void register_com_android_icu_util_CaseMapperNative(JNIEnv* env) {
  jniRegisterNativeMethods(env, "com/android/icu/util/CaseMapperNative", gMethods, NELEM(gMethods));
}