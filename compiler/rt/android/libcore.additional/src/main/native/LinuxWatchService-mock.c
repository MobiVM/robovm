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
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    eventSize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxWatchService_eventSize(JNIEnv *env, jclass clazz)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    eventOffsets
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL
Java_sun_nio_fs_LinuxWatchService_eventOffsets(JNIEnv *env, jclass clazz)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return NULL;
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    inotifyInit
 * Signature: ()I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxWatchService_inotifyInit
    (JNIEnv* env, jclass clazz)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    inotifyAddWatch
 * Signature: (IJI)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxWatchService_inotifyAddWatch
    (JNIEnv* env, jclass clazz, jint fd, jlong address, jint mask)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    inotifyRmWatch
 * Signature: (II)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxWatchService_inotifyRmWatch
    (JNIEnv* env, jclass clazz, jint fd, jint wd)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    configureBlocking
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxWatchService_configureBlocking
    (JNIEnv* env, jclass clazz, jint fd, jboolean blocking)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    socketpair
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxWatchService_socketpair
    (JNIEnv* env, jclass clazz, jintArray sv)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxWatchService
 * Method:    poll
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxWatchService_poll
    (JNIEnv* env, jclass clazz, jint fd1, jint fd2)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}
