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

#pragma once

#include <nativehelper/JNIHelp.h>
#include <nativehelper/ScopedUtfChars.h>

#include <unicode/uloc.h>


static void getLocale(const char* localeName, std::string& locale, UErrorCode* status) {
    int length;
    {
        // Most common locale name should fit the max capacity.
        char buffer[ULOC_FULLNAME_CAPACITY];
        UErrorCode err = U_ZERO_ERROR;

        length = uloc_getName(localeName, buffer, ULOC_FULLNAME_CAPACITY, &err);
        if (U_SUCCESS(err)) {
            locale = buffer;
            *status = err;
            return;
        } else if (err != U_BUFFER_OVERFLOW_ERROR) {
            *status = err;
            return;
        }
    }

    // Case U_BUFFER_OVERFLOW_ERROR
    std::unique_ptr<char[]> buffer(new char[length+1]);
    UErrorCode err = U_ZERO_ERROR;
    uloc_getName(localeName, buffer.get(), length+1, &err);
    if (U_SUCCESS(err)) {
        locale = buffer.get();
    }
    *status = err;
    return;
}

class ScopedIcuULoc {
 public:
  ScopedIcuULoc(JNIEnv* env, jstring javaLocaleName) {
    isValid = false;

    if (javaLocaleName == NULL) {
      jniThrowNullPointerException(env, "javaLocaleName == null");
      return;
    }

    const ScopedUtfChars localeName(env, javaLocaleName);
    if (localeName.c_str() == NULL) {
      return;
    }

    UErrorCode status = U_ZERO_ERROR;
    getLocale(localeName.c_str(), mLocale, &status);
    isValid = U_SUCCESS(status);
  }

  ~ScopedIcuULoc() {
  }

  bool valid() const {
    return isValid;
  }

  const char* locale() const {
    return mLocale.c_str();
  }

  int32_t locale_length() const {
    return mLocale.length();
  }

 private:
  bool isValid;
  std::string mLocale;

  // Disallow copy and assignment.
  ScopedIcuULoc(const ScopedIcuULoc&);
  void operator=(const ScopedIcuULoc&);
};
