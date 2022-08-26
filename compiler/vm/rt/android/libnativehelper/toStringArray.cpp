/*
 * Copyright (C) 2011 The Android Open Source Project
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

#include <nativehelper/toStringArray.h>

#include "JniConstants.h"

namespace {

struct ArrayCounter {
    const char* const* strings;
    explicit ArrayCounter(const char* const* strings) : strings(strings) {}
    size_t operator()() {
        size_t count = 0;
        while (strings[count] != nullptr) {
            ++count;
        }
        return count;
    }
};

struct ArrayGetter {
    const char* const* strings;
    explicit ArrayGetter(const char* const* strings) : strings(strings) {}
    const char* operator()(size_t i) {
        return strings[i];
    }
};

}  // namespace

MODULE_API jobjectArray newStringArray(JNIEnv* env, size_t count) {
    return env->NewObjectArray(count, JniConstants::GetStringClass(env), nullptr);
}

MODULE_API jobjectArray toStringArray(JNIEnv* env, const char* const* strings) {
    ArrayCounter counter(strings);
    ArrayGetter getter(strings);
    return toStringArray(env, &counter, &getter);
}
