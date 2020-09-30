/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  The Android Open Source
 * Project designates this particular file as subject to the "Classpath"
 * exception as provided by The Android Open Source Project in the LICENSE
 * file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

#define LOG_TAG "JniConstants"

#include "JniConstants.h"

#include <atomic>
#include <mutex>

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
jclass g_socket_tagger_class;

// EnsureJniConstantsInitialized initializes cache constants. It should be
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

    g_socket_tagger_class = findClass(env, "dalvik/system/SocketTagger");
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

jclass JniConstants::GetSocketTaggerClass(JNIEnv* env) {
    EnsureJniConstantsInitialized(env);
    return g_socket_tagger_class;
}
