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

#ifndef JNI_CONSTANTS_H_included
#define JNI_CONSTANTS_H_included

#include <jni.h>

/**
 * A cache to avoid calling FindClass at runtime.
 */
struct JniConstants {
    // Initialized cached heap objects. This should be called in JNI_OnLoad.
    static void Initialize(JNIEnv* env);

    // Invalidate cached heap objects. This should be called in JNI_OnUnload.
    static void Invalidate();

    // Gets class representing SocketTagger from cache.
    static jclass GetSocketTaggerClass(JNIEnv* env);
};

#endif  // JNI_CONSTANTS_H_included
