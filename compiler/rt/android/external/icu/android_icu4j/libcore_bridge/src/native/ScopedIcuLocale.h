/*
 * Copyright (C) 2014 The Android Open Source Project
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

#ifndef SCOPED_ICU_LOCALE_H_included
#define SCOPED_ICU_LOCALE_H_included

#include <nativehelper/JNIHelp.h>
#include <nativehelper/ScopedUtfChars.h>
#include "unicode/locid.h"

class ScopedIcuLocale {
 public:
  ScopedIcuLocale(JNIEnv* env, jstring javaLanguageTag) : mEnv(env) {
    mLocale.setToBogus();

    if (javaLanguageTag == NULL) {
      jniThrowNullPointerException(mEnv, "javaLanguageTag == null");
      return;
    }

    const ScopedUtfChars languageTag(env, javaLanguageTag);
    if (languageTag.c_str() == NULL) {
      return;
    }

    UErrorCode err;
    icu::Locale locale = icu::Locale::forLanguageTag(languageTag.c_str(), err);
    if (U_FAILURE(err)) {
      return;
    }

    mLocale = locale;
  }

  ~ScopedIcuLocale() {
  }

  bool valid() const {
    return !mLocale.isBogus();
  }

  icu::Locale& locale() {
    return mLocale;
  }

 private:
  JNIEnv* const mEnv;
  icu::Locale mLocale;

  // Disallow copy and assignment.
  ScopedIcuLocale(const ScopedIcuLocale&);
  void operator=(const ScopedIcuLocale&);
};

#endif  // SCOPED_ICU_LOCALE_H_included
