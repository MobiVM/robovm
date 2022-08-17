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

#pragma once

#include <jni.h>

/**
 * A cache to avoid calling FindClass at runtime.
 */
struct JniConstants {
    // Initialized cached heap objects. This should be called in JNI_OnLoad.
    static void Initialize(JNIEnv* env);

    // Invalidate cached heap objects. This should be called in JNI_OnUnload.
    static void Invalidate();

    static jclass GetCharsetICUClass(JNIEnv* env);
    static jclass GetPatternSyntaxExceptionClass(JNIEnv* env);
    static jclass GetStringClass(JNIEnv* env);
};