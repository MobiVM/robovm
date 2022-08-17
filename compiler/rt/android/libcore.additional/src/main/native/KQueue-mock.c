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
 * Class:     sun_nio_ch_KQueue
 * Method:    keventSize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_keventSize(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    identOffset
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_identOffset(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    filterOffset
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_filterOffset(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    flagsOffset
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_flagsOffset(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    kqueue
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_kqueue(JNIEnv *env, jclass c)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    keventRegister
 * Signature: (IIII)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_keventRegister(JNIEnv *env, jclass c, jint kqfd,
                                      jint fd, jint filter, jint flags)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}

/*
 * Class:     sun_nio_ch_KQueue
 * Method:    keventPoll
 * Signature: (IJI)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_KQueue_keventPoll(JNIEnv *env, jclass c,
                                  jint kqfd, jlong address, jint nevents)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Darwin");
    return 0;
}
