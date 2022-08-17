/*
 * Copyright (C) 2006 The Android Open Source Project
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

#include "include_platform/nativehelper/JNIPlatformHelp.h"

#include <stddef.h>

#include "JniConstants.h"

static int GetBufferPosition(JNIEnv* env, jobject nioBuffer) {
    return(*env)->GetIntField(env, nioBuffer, JniConstants_NioBuffer_position(env));
}

static int GetBufferLimit(JNIEnv* env, jobject nioBuffer) {
    return(*env)->GetIntField(env, nioBuffer, JniConstants_NioBuffer_limit(env));
}

static int GetBufferElementSizeShift(JNIEnv* env, jobject nioBuffer) {
    return(*env)->GetIntField(env, nioBuffer, JniConstants_NioBuffer__elementSizeShift(env));
}

jarray jniGetNioBufferBaseArray(JNIEnv* env, jobject nioBuffer) {
    jclass nioAccessClass = JniConstants_NIOAccessClass(env);
    jmethodID getBaseArrayMethod = JniConstants_NIOAccess_getBaseArray(env);
    jobject object = (*env)->CallStaticObjectMethod(env,
                                                    nioAccessClass, getBaseArrayMethod, nioBuffer);
    return (jarray) object;
}

int jniGetNioBufferBaseArrayOffset(JNIEnv* env, jobject nioBuffer) {
    jclass nioAccessClass = JniConstants_NIOAccessClass(env);
    jmethodID getBaseArrayOffsetMethod = JniConstants_NIOAccess_getBaseArrayOffset(env);
    return (*env)->CallStaticIntMethod(env, nioAccessClass, getBaseArrayOffsetMethod, nioBuffer);
}

jlong jniGetNioBufferPointer(JNIEnv* env, jobject nioBuffer) {
    jlong baseAddress = (*env)->GetLongField(env, nioBuffer, JniConstants_NioBuffer_address(env));
    if (baseAddress != 0) {
        const int position = GetBufferPosition(env, nioBuffer);
        const int shift = GetBufferElementSizeShift(env, nioBuffer);
        baseAddress += position << shift;
    }
    return baseAddress;
}

jlong jniGetNioBufferFields(JNIEnv* env, jobject nioBuffer,
                            jint* position, jint* limit, jint* elementSizeShift) {
    *position = GetBufferPosition(env, nioBuffer);
    *limit = GetBufferLimit(env, nioBuffer);
    *elementSizeShift = GetBufferElementSizeShift(env, nioBuffer);
    return (*env)->GetLongField(env, nioBuffer, JniConstants_NioBuffer_address(env));
}
