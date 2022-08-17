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

namespace {

jclass findClass(JNIEnv* env, const char* name) {
    jclass result = reinterpret_cast<jclass>(env->NewGlobalRef(env->FindClass(name)));
    if (result == NULL) {
        ALOGE("failed to find class '%s'", name);
        abort();
    }
    return result;
}

static std::mutex g_constants_mutex;

// Flag indicating whether cached constants are valid
static bool g_constants_valid = false;

jclass charsetICUClass;
jclass patternSyntaxExceptionClass;
jclass stringClass;

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

    charsetICUClass = findClass(env, "com/android/icu/charset/CharsetICU");
    patternSyntaxExceptionClass = findClass(env, "java/util/regex/PatternSyntaxException");
    stringClass = findClass(env, "java/lang/String");

    g_constants_valid = true;
}

}  // namespace

void JniConstants::Initialize(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
}

jclass JniConstants::GetCharsetICUClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return charsetICUClass;
}

jclass JniConstants::GetPatternSyntaxExceptionClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return patternSyntaxExceptionClass;
}

jclass JniConstants::GetStringClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return stringClass;
}

void JniConstants::Invalidate() {
    // Clean shutdown would require calling DeleteGlobalRef() for each of the
    // class references. However, JavaVM can't be used for cleanup during
    // JNI_OnUnload because ART only calls this once all threads are
    // unregistered.
    std::lock_guard guard(g_constants_mutex);
    g_constants_valid = false;
}