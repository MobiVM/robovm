/*
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

#include <nativehelper/JNIHelp.h>

//
//
//  RoboVM note:
//  Mock for function that are not available on target platform. Allows
//  to have these symbols in RT native library and compare it against 
//  java native methods to detect missing or extra ones.  
//
//

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    init
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueueArrayWrapper_init(JNIEnv *env, jobject this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    initStructSizes
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_KQueueArrayWrapper_initStructSizes(JNIEnv *env, jclass clazz)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
}

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    register0
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_KQueueArrayWrapper_register0(JNIEnv *env, jobject this,
                                             jint kq, jint fd, jint r, jint w)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
}

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    kevent0
 * Signature: (IJIJ)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueueArrayWrapper_kevent0(JNIEnv *env, jobject this, jint kq,
                                           jlong kevAddr, jint kevCount,
                                           jlong timeout)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    interrupt
 * Signature: (I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_KQueueArrayWrapper_interrupt(JNIEnv *env, jclass cls, jint fd)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}
