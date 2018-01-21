/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#import <Foundation/Foundation.h>
#import "jni.h"

static dispatch_once_t once;
static id instance;
NSObject* rvmInstantiateFramework(const char *className) {
    dispatch_once(&once, ^ {
        JavaVMInitArgs vm_args;
        JavaVM *vm;
        JNIEnv *env;
        jint res;

        /*
         * Create the RoboVM "VM" using standard the JNI JNI_CreateJavaVM() function
         * which is exported by our framework.
         */
        vm_args.version = JNI_VERSION_1_2;
        vm_args.nOptions = 0;
        vm_args.options = NULL;
        res = JNI_CreateJavaVM(&vm, &env, &vm_args);
        if (res != JNI_OK) {
            [NSException raise:@"JNI_CreateJavaVM() failed" format:@"%d", res];
        }
        
        /*
         * Lookup the root framework Java class that and call its initantiate() method to obtain Object instance
         */
        char *jvmClassName = strdup(className);
        for (char *p = jvmClassName; *p; p++) {
            if (*p == '.')
                *p = '/';
        }
        jclass cls = (*env)->FindClass(env, jvmClassName);
        free(jvmClassName);
        if (!cls) {
            [NSException raise:@"Failed to find class" format:@"classname = %s", className];
        }
        
        /*
         * Now lookup and call instantiate method to receive instance of framework class
         */
        jmethodID mid = (*env)->GetStaticMethodID(env, cls, "instantiate", "()Lorg/robovm/apple/foundation/NSObject;");
        if (!mid) {
            [NSException raise:@"Failed to find method initialize()" format:@"classname = %s", className];
        }
        jobject jentry = (*env)->CallStaticObjectMethod(env, cls, mid);
        if ((*env)->ExceptionOccurred(env)) {
            [NSException raise:@"Call to initialize() failed" format:@"classname = %s", className];
        }
        if (jentry == NULL) {
            [NSException raise:@"Call to method initialize() returned NULL object" format:@"classname = %s", className];
        }
        
        /*
         * Now fetch pointer to objc object from java, calling NSObject.getHandle() for this
         */
        cls = (*env)->FindClass(env, "org/robovm/apple/foundation/NSObject");
        if (!cls) {
            [NSException raise:@"Failed to find class NSObject" format:@""];
        }
        mid = (*env)->GetMethodID(env, cls, "getHandle", "()J");
        if (!mid) {
            [NSException raise:@"Failed to find method getHandle()" format:@""];
        }
        
        jlong ptr = (*env)->CallLongMethod(env, jentry, mid);
        instance = (__bridge id)(void*)ptr;
    });

    return instance;
}

