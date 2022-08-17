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
 * Class:     sun_nio_ch_EPoll
 * Method:    eventSize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_eventSize(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_ch_EPoll
 * Method:    eventsOffset
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_eventsOffset(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_ch_EPoll
 * Method:    dataOffset
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_dataOffset(JNIEnv* env, jclass this)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_ch_EPoll
 * Method:    epollCreate
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_epollCreate(JNIEnv *env, jclass c) 
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_ch_EPoll
 * Method:    epollCtl
 * Signature: (IIII)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_epollCtl(JNIEnv *env, jclass c, jint epfd,
                                   jint opcode, jint fd, jint events)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_ch_EPoll
 * Method:    epollWait
 * Signature: (IJI)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_ch_EPoll_epollWait(JNIEnv *env, jclass c,
                                    jint epfd, jlong address, jint numfds)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}
