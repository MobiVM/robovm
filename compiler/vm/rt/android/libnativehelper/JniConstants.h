/*
 * Copyright 2018 The Android Open Source Project
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

#include "jni.h"

struct JniConstants {
    // Global reference to java.io.FileDescriptor.
    static jclass GetFileDescriptorClass(JNIEnv* env);

    // java.io.FileDescriptor.descriptor.
    static jfieldID GetFileDescriptorDescriptorField(JNIEnv* env);

    // java.io.FileDescriptor.ownerId.
    static jfieldID GetFileDescriptorOwnerIdField(JNIEnv* env);

    // void java.io.FileDescriptor.<init>().
    static jmethodID GetFileDescriptorInitMethod(JNIEnv* env);

    // Global reference to java.nio.NIOAccess.
    static jclass GetNioAccessClass(JNIEnv* env);

    // Object java.nio.NIOAccess.getBaseArray(Buffer);
    static jmethodID GetNioAccessGetBaseArrayMethod(JNIEnv* env);

    // int java.nio.NIOAccess.getBaseArrayOffset(Buffer);
    static jmethodID GetNioAccessGetBaseArrayOffsetMethod(JNIEnv* env);

    // Global reference to java.nio.Buffer.
    static jclass GetNioBufferClass(JNIEnv* env);

    // long java.nio.Buffer.address
    static jfieldID GetNioBufferAddressField(JNIEnv* env);

    // int java.nio.Buffer._elementSizeShift
    static jfieldID GetNioBufferElementSizeShiftField(JNIEnv* env);

    // int java.nio.Buffer.limit;
    static jfieldID GetNioBufferLimitField(JNIEnv* env);

    // int java.nio.Buffer.position;
    static jfieldID GetNioBufferPositionField(JNIEnv* env);

    // Object java.nio.Buffer.array()
    static jmethodID GetNioBufferArrayMethod(JNIEnv* env);

    // int java.nio.Buffer.arrayOffset()
    static jmethodID GetNioBufferArrayOffsetMethod(JNIEnv* env);

    // Global reference to java.lang.ref.Reference.
    static jclass GetReferenceClass(JNIEnv* env);

    // Object java.lang.ref.Reference.get()
    static jmethodID GetReferenceGetMethod(JNIEnv* env);

    // Global reference to java.lang.String.
    static jclass GetStringClass(JNIEnv* env);

    // Ensure class constants are initialized before use. Field and method
    // constants are lazily initialized via getters.
    static void EnsureClassReferencesInitialized(JNIEnv* env);

    // Ensure any cached heap objects from previous VM instances are
    // invalidated. There is no notification here that a VM is destroyed so this
    // method must be called when a new VM is created (and calls from any
    // earlier VM's are completed). The caching of heap objects in this class is
    // one reason why there is a limit of VM instance per process.
    static void Uninitialize();
};
