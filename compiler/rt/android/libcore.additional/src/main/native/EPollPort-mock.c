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
 * Class:     sun_nio_ch_EPollPort
 * Method:    socketpair
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_EPollPort_socketpair(JNIEnv* env, jclass clazz, jintArray sv) 
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_ch_EPollPort
 * Method:    interrupt
 * Signature: (I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_EPollPort_interrupt(JNIEnv *env, jclass c, jint fd) 
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_ch_EPollPort
 * Method:    drain1
 * Signature: (I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_EPollPort_drain1(JNIEnv *env, jclass cl, jint fd) 
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_ch_EPollPort
 * Method:    close0
 * Signature: (I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_ch_EPollPort_close0(JNIEnv *env, jclass c, jint fd) 
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

