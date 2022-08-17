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
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    setmntent0
 * Signature: (JJ)J
 */
JNIEXPORT jlong JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_setmntent0(JNIEnv* env, jclass this, jlong pathAddress,
                                                 jlong modeAddress)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    getmntent
 * Signature: (JLsun/nio/fs/UnixMountEntry;)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_getmntent(JNIEnv* env, jclass this,
    jlong value, jobject entry)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    endmntent
 * Signature: (J)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_endmntent(JNIEnv* env, jclass this, jlong stream)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    fgetxattr0
 * Signature: (IJJI)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_fgetxattr0(JNIEnv* env, jclass clazz,
    jint fd, jlong nameAddress, jlong valueAddress, jint valueLen)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    fsetxattr0
 * Signature: (IJJI)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_fsetxattr0(JNIEnv* env, jclass clazz,
    jint fd, jlong nameAddress, jlong valueAddress, jint valueLen)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    fremovexattr0
 * Signature: (IJ)V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_fremovexattr0(JNIEnv* env, jclass clazz,
    jint fd, jlong nameAddress)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    flistxattr
 * Signature: (IJI)I
 */
JNIEXPORT jint JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_flistxattr(JNIEnv* env, jclass clazz,
    jint fd, jlong listAddress, jint size)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
    return 0;
}

/*
 * Class:     sun_nio_fs_LinuxNativeDispatcher
 * Method:    init
 * Signature: ()V
 */
JNIEXPORT void JNICALL
Java_sun_nio_fs_LinuxNativeDispatcher_init(JNIEnv *env, jclass clazz)
{
    jniThrowException(env, "java/lang/UnsupportedOperationException",
            "Available only on Linux");
}
