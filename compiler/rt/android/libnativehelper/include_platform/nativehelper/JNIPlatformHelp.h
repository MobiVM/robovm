/*
 * Copyright (C) 2007 The Android Open Source Project
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

/*
 * JNI helper functions.
 *
 * This file may be included by C or C++ code, which is trouble because jni.h
 * uses different typedefs for JNIEnv in each language.
 */
#pragma once

#include <sys/cdefs.h>

#include <jni.h>

#include <nativehelper/JNIHelp.h>

__BEGIN_DECLS

/*
 * Gets the managed heap array backing a java.nio.Buffer instance.
 *
 * Returns nullptr if there is no array backing.
 *
 * This method performs a JNI call to java.nio.NIOAccess.getBaseArray().
 */
jarray jniGetNioBufferBaseArray(C_JNIEnv* env, jobject nioBuffer);

/*
 * Gets the offset of the current buffer position in bytes from the start of the managed heap
 * array backing the buffer.
 *
 * Returns 0 if there is no array backing.
 *
 * This method performs a JNI call to java.nio.NIOAccess.getBaseArrayOffset().
 */
jint jniGetNioBufferBaseArrayOffset(C_JNIEnv* env, jobject nioBuffer);

/*
 * Gets field information from a java.nio.Buffer instance.
 *
 * Reads the |position|, |limit|, and |elementSizeShift| fields from the buffer instance.
 *
 * Returns the |address| field of the java.nio.Buffer instance which is only valid (non-zero) when
 * the buffer is backed by a direct buffer.
 */
jlong jniGetNioBufferFields(C_JNIEnv* env,
                            jobject nioBuffer,
                            /*out*/jint* position,
                            /*out*/jint* limit,
                            /*out*/jint* elementSizeShift);

/*
 * Gets the current position from a java.nio.Buffer as a pointer to memory in a fixed buffer.
 *
 * Returns 0 if |nioBuffer| is not backed by a direct buffer.
 *
 * This method reads the |address|, |position|, and |elementSizeShift| fields from the
 * java.nio.Buffer instance to calculate the pointer address for the current position.
 */
jlong jniGetNioBufferPointer(C_JNIEnv* env, jobject nioBuffer);

/*
 * Clear the cache of constants libnativehelper is using.
 */
void jniUninitializeConstants();

__END_DECLS

/*
 * For C++ code, we provide inlines that map to the C functions.  g++ always
 * inlines these, even on non-optimized builds.
 */

#if defined(__cplusplus)

#include <android/file_descriptor_jni.h>

inline jobject jniCreateFileDescriptor(JNIEnv* env, int fd) {
    jobject fileDescriptor = AFileDescriptor_create(env);
    if (fileDescriptor != nullptr) {
      AFileDescriptor_setFd(env, fileDescriptor, fd);
    }
    return fileDescriptor;
}

inline int jniGetFDFromFileDescriptor(JNIEnv* env, jobject fileDescriptor) {
    if (fileDescriptor == nullptr) {
      return -1;
    }
    return AFileDescriptor_getFd(env, fileDescriptor);
}

inline void jniSetFileDescriptorOfFD(JNIEnv* env, jobject fileDescriptor, int value) {
    if (fileDescriptor == nullptr) {
        jniThrowNullPointerException(env, "fileDescriptor is null");
        return;
    }
    AFileDescriptor_setFd(env, fileDescriptor, value);
}

inline jarray jniGetNioBufferBaseArray(JNIEnv* env, jobject nioBuffer) {
    return jniGetNioBufferBaseArray(&env->functions, nioBuffer);
}

inline jint jniGetNioBufferBaseArrayOffset(JNIEnv* env, jobject nioBuffer) {
    return jniGetNioBufferBaseArrayOffset(&env->functions, nioBuffer);
}

inline jlong jniGetNioBufferFields(JNIEnv* env, jobject nioBuffer,
                                   jint* position, jint* limit, jint* elementSizeShift) {
    return jniGetNioBufferFields(&env->functions, nioBuffer,
                                 position, limit, elementSizeShift);
}

inline jlong jniGetNioBufferPointer(JNIEnv* env, jobject nioBuffer) {
    return jniGetNioBufferPointer(&env->functions, nioBuffer);
}

#endif  // defined(__cplusplus)
