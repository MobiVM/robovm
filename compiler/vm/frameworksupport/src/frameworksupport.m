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

static JNIEnv *env;
const char* __attribute__ ((weak)) _bcFrameworkPreloadClasses = NULL;

__attribute__((constructor))
static void initializer(int argc, char** argv, char** envp) {
	static dispatch_once_t createVmOnce;
    dispatch_once(&createVmOnce, ^ {
        JavaVMInitArgs vm_args;
        JavaVM *vm;
        jint res;

        /*
         * Create the RoboVM "VM" using standard the JNI JNI_CreateJavaVM() function
         * which is exported by our framework.
         */
        vm_args.version = JNI_VERSION_1_2;
        vm_args.nOptions = argc;
        JavaVMOption options[argc];
        if (argc) {
        	for (int idx = 0; idx < argc; idx++) {
				options[idx].optionString = argv[idx];
				options[idx].extraInfo = NULL;
        	}
        	vm_args.options = options;
        } else {
        	vm_args.options = NULL;
        }

        res = JNI_CreateJavaVM(&vm, &env, &vm_args);
        if (res != JNI_OK) {
            [NSException raise:@"JNI_CreateJavaVM() failed" format:@"%d", res];
        }

        // preload classes needed for framework
        // _bcFrameworkPreloadClasses contains zero terminated strings of classes to preload
        // it finishes with zero length string
        if (_bcFrameworkPreloadClasses) {
        	const char* className = _bcFrameworkPreloadClasses;
        	while (*className) {
				jclass cls = (*env)->FindClass(env, className);
				if (!cls) {
					[NSException raise:@"Failed to preload class for framework" format:@"classname = %s", className];
				}
        		className += strlen(className) + 1;
        	}
        }
    });
}

// deprecated, for compatibility with old code
NSObject* rvmInstantiateFramework(const char *className) {
	static dispatch_once_t createFrameworkInstanceOnce;
	static id instance;
    dispatch_once(&createFrameworkInstanceOnce, ^ {
        // Lookup the root framework Java class that and call its instantiate() method to obtain Object instance
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
        
        // lookup and call instantiate method to receive instance of framework class
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
        
        // fetch pointer to objc object from java, calling NSObject.getHandle() for this
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

