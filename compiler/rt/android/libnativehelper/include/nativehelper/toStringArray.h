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

#pragma once

#ifdef __cplusplus

#include <string>
#include <vector>

#include "JNIHelp.h"
#include "ScopedLocalRef.h"

template <typename StringVisitor>
jobjectArray toStringArray(JNIEnv* env, size_t count, StringVisitor&& visitor) {
    jclass stringClass = env->FindClass("java/lang/String");
    ScopedLocalRef<jobjectArray> result(env, env->NewObjectArray(count, stringClass, NULL));
    env->DeleteLocalRef(stringClass);
    if (result == nullptr) {
        return nullptr;
    }
    for (size_t i = 0; i < count; ++i) {
        ScopedLocalRef<jstring> s(env, env->NewStringUTF(visitor(i)));
        if (env->ExceptionCheck()) {
            return nullptr;
        }
        env->SetObjectArrayElement(result.get(), i, s.get());
        if (env->ExceptionCheck()) {
            return nullptr;
        }
    }
    return result.release();
}

inline jobjectArray toStringArray(JNIEnv* env, const std::vector<std::string>& strings) {
    return toStringArray(env, strings.size(), [&strings](size_t i) { return strings[i].c_str(); });
}

inline jobjectArray toStringArray(JNIEnv* env, const char* const* strings) {
    size_t count = 0;
    for (; strings[count] != nullptr; ++count) {}
    return toStringArray(env, count, [&strings](size_t i) { return strings[i]; });
}

template <typename Counter, typename Getter>
jobjectArray toStringArray(JNIEnv* env, Counter* counter, Getter* getter) {
    return toStringArray(env, counter(), [getter](size_t i) { return getter(i); });
}

#endif  // __cplusplus

