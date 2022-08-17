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

#include "include/nativehelper/JNIHelp.h"

#include <stdarg.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include <jni.h>

#define LOG_TAG "JNIHelp"
#include "ALog-priv.h"

#include "ExpandableString.h"

//
// Helper methods
//

static const char* platformStrError(int errnum, char* buf, size_t buflen) {
#ifdef _WIN32
    strerror_s(buf, buflen, errnum);
    return buf;
#elif defined(__USE_GNU) && __ANDROID_API__ >= 23
    // char *strerror_r(int errnum, char *buf, size_t buflen);  /* GNU-specific */
    return strerror_r(errnum, buf, buflen);
#else
    // int strerror_r(int errnum, char *buf, size_t buflen);    /* XSI-compliant */
    int rc = strerror_r(errnum, buf, buflen);
    if (rc != 0) {
        snprintf(buf, buflen, "errno %d", errnum);
    }
    return buf;
#endif
}

static jmethodID FindMethod(JNIEnv* env,
                            const char* className,
                            const char* methodName,
                            const char* descriptor) {
    // This method is only valid for classes in the core library which are
    // not unloaded during the lifetime of managed code execution.
    jclass clazz = (*env)->FindClass(env, className);
    jmethodID methodId = (*env)->GetMethodID(env, clazz, methodName, descriptor);
    (*env)->DeleteLocalRef(env, clazz);
    return methodId;
}

static bool AppendJString(JNIEnv* env, jstring text, struct ExpandableString* dst) {
    const char* utfText = (*env)->GetStringUTFChars(env, text, NULL);
    if (utfText == NULL) {
        return false;
    }
    bool success = ExpandableStringAppend(dst, utfText);
    (*env)->ReleaseStringUTFChars(env, text, utfText);
    return success;
}

/*
 * Returns a human-readable summary of an exception object.  The buffer will
 * be populated with the "binary" class name and, if present, the
 * exception message.
 */
static bool GetExceptionSummary(JNIEnv* env, jthrowable thrown, struct ExpandableString* dst) {
    // Summary is <exception_class_name> ": " <exception_message>
    jclass exceptionClass = (*env)->GetObjectClass(env, thrown);  // Always succeeds
    jmethodID getName = FindMethod(env, "java/lang/Class", "getName", "()Ljava/lang/String;");
    jstring className = (jstring) (*env)->CallObjectMethod(env, exceptionClass, getName);
    if (className == NULL) {
        ExpandableStringAssign(dst, "<error getting class name>");
        (*env)->ExceptionClear(env);
        (*env)->DeleteLocalRef(env, exceptionClass);
        return false;
    }
    (*env)->DeleteLocalRef(env, exceptionClass);
    exceptionClass = NULL;

    if (!AppendJString(env, className, dst)) {
        ExpandableStringAssign(dst,  "<error getting class name UTF-8>");
        (*env)->ExceptionClear(env);
        (*env)->DeleteLocalRef(env, className);
        return false;
    }
    (*env)->DeleteLocalRef(env, className);
    className = NULL;

    jmethodID getMessage =
        FindMethod(env, "java/lang/Throwable", "getMessage", "()Ljava/lang/String;");
    jstring message = (jstring) (*env)->CallObjectMethod(env, thrown, getMessage);
    if (message == NULL) {
        return true;
    }

    bool success = (ExpandableStringAppend(dst, ": ") && AppendJString(env, message, dst));
    if (!success) {
        // Two potential reasons for reaching here:
        //
        // 1. managed heap allocation failure (OOME).
        // 2. native heap allocation failure for the storage in |dst|.
        //
        // Attempt to append failure notification, okay to fail, |dst| contains the class name
        // of |thrown|.
        ExpandableStringAppend(dst, "<error getting message>");
        // Clear OOME if present.
        (*env)->ExceptionClear(env);
    }
    (*env)->DeleteLocalRef(env, message);
    message = NULL;
    return success;
}

static jobject NewStringWriter(JNIEnv* env) {
    jclass clazz = (*env)->FindClass(env, "java/io/StringWriter");
    jmethodID init = (*env)->GetMethodID(env, clazz, "<init>", "()V");
    jobject instance = (*env)->NewObject(env, clazz, init);
    (*env)->DeleteLocalRef(env, clazz);
    return instance;
}

static jstring StringWriterToString(JNIEnv* env, jobject stringWriter) {
    jmethodID toString =
        FindMethod(env, "java/io/StringWriter", "toString", "()Ljava/lang/String;");
    return (jstring) (*env)->CallObjectMethod(env, stringWriter, toString);
}

static jobject NewPrintWriter(JNIEnv* env, jobject writer) {
    jclass clazz = (*env)->FindClass(env, "java/io/PrintWriter");
    jmethodID init = (*env)->GetMethodID(env, clazz, "<init>", "(Ljava/io/Writer;)V");
    jobject instance = (*env)->NewObject(env, clazz, init, writer);
    (*env)->DeleteLocalRef(env, clazz);
    return instance;
}

static bool GetStackTrace(JNIEnv* env, jthrowable thrown, struct ExpandableString* dst) {
    // This function is equivalent to the following Java snippet:
    //   StringWriter sw = new StringWriter();
    //   PrintWriter pw = new PrintWriter(sw);
    //   thrown.printStackTrace(pw);
    //   String trace = sw.toString();
    //   return trace;
    jobject sw = NewStringWriter(env);
    if (sw == NULL) {
        return false;
    }

    jobject pw = NewPrintWriter(env, sw);
    if (pw == NULL) {
        (*env)->DeleteLocalRef(env, sw);
        return false;
    }

    jmethodID printStackTrace =
        FindMethod(env, "java/lang/Throwable", "printStackTrace", "(Ljava/io/PrintWriter;)V");
    (*env)->CallVoidMethod(env, thrown, printStackTrace, pw);

    jstring trace = StringWriterToString(env, sw);

    (*env)->DeleteLocalRef(env, pw);
    pw = NULL;
    (*env)->DeleteLocalRef(env, sw);
    sw = NULL;

    if (trace == NULL) {
        return false;
    }

    bool success = AppendJString(env, trace, dst);
    (*env)->DeleteLocalRef(env, trace);
    return success;
}

static void GetStackTraceOrSummary(JNIEnv* env, jthrowable thrown, struct ExpandableString* dst) {
    // This method attempts to get a stack trace or summary info for an exception.
    // The exception may be provided in the |thrown| argument to this function.
    // If |thrown| is NULL, then any pending exception is used if it exists.

    // Save pending exception, callees may raise other exceptions. Any pending exception is
    // rethrown when this function exits.
    jthrowable pendingException = (*env)->ExceptionOccurred(env);
    if (pendingException != NULL) {
        (*env)->ExceptionClear(env);
    }

    if (thrown == NULL) {
        if (pendingException == NULL) {
            ExpandableStringAssign(dst,  "<no pending exception>");
            return;
        }
        thrown = pendingException;
    }

    if (!GetStackTrace(env, thrown, dst)) {
        // GetStackTrace may have raised an exception, clear it since it's not for the caller.
        (*env)->ExceptionClear(env);
        GetExceptionSummary(env, thrown, dst);
    }

    if (pendingException != NULL) {
        // Re-throw the pending exception present when this method was called.
        (*env)->Throw(env, pendingException);
        (*env)->DeleteLocalRef(env, pendingException);
    }
}

static void DiscardPendingException(JNIEnv* env, const char* className) {
    jthrowable exception = (*env)->ExceptionOccurred(env);
    (*env)->ExceptionClear(env);
    if (exception == NULL) {
        return;
    }

    struct ExpandableString summary;
    ExpandableStringInitialize(&summary);
    GetExceptionSummary(env, exception, &summary);
    const char* details = (summary.data != NULL) ? summary.data : "Unknown";
    ALOGW("Discarding pending exception (%s) to throw %s", details, className);
    ExpandableStringRelease(&summary);
    (*env)->DeleteLocalRef(env, exception);
}

static int ThrowException(JNIEnv* env, const char* className, const char* ctorSig, ...) {
    int status = -1;
    jclass exceptionClass = NULL;

    va_list args;
    va_start(args, ctorSig);

    DiscardPendingException(env, className);

    {
        /* We want to clean up local references before returning from this function, so,
         * regardless of return status, the end block must run. Have the work done in a
         * nested block to avoid using any uninitialized variables in the end block. */
        exceptionClass = (*env)->FindClass(env, className);
        if (exceptionClass == NULL) {
            ALOGE("Unable to find exception class %s", className);
            /* an exception, most likely ClassNotFoundException, will now be pending */
            goto end;
        }

        jmethodID init = (*env)->GetMethodID(env, exceptionClass, "<init>", ctorSig);
        if(init == NULL) {
            ALOGE("Failed to find constructor for '%s' '%s'", className, ctorSig);
            goto end;
        }

        jobject instance = (*env)->NewObjectV(env, exceptionClass, init, args);
        if (instance == NULL) {
            ALOGE("Failed to construct '%s'", className);
            goto end;
        }

        if ((*env)->Throw(env, (jthrowable)instance) != JNI_OK) {
            ALOGE("Failed to throw '%s'", className);
            /* an exception, most likely OOM, will now be pending */
            goto end;
        }

        /* everything worked fine, just update status to success and clean up */
        status = 0;
    }

end:
    va_end(args);
    if (exceptionClass != NULL) {
        (*env)->DeleteLocalRef(env, exceptionClass);
    }
    return status;
}

static jstring CreateExceptionMsg(JNIEnv* env, const char* msg) {
    jstring detailMessage = (*env)->NewStringUTF(env, msg);
    if (detailMessage == NULL) {
        /* Not really much we can do here. We're probably dead in the water,
           but let's try to stumble on... */
        (*env)->ExceptionClear(env);
    }
    return detailMessage;
}

/* Helper macro to deal with conversion of the exception message from a C string
 * to jstring.
 *
 * This is useful because most exceptions have a message as the first parameter
 * and delegating the conversion to all the callers of ThrowException results in
 * code duplication. However, since we try to allow variable number of arguments
 * for the exception constructor we'd either need to do the conversion inside
 * the macro, or manipulate the va_list to replace the C string to a jstring.
 * This seems like the cleaner solution.
 */
#define THROW_EXCEPTION_WITH_MESSAGE(env, className, ctorSig, msg, ...) ({                 \
    jstring _detailMessage = CreateExceptionMsg(env, msg);                                 \
    int _status = ThrowException(env, className, ctorSig, _detailMessage, ## __VA_ARGS__); \
    if (_detailMessage != NULL) {                                                          \
        (*env)->DeleteLocalRef(env, _detailMessage);                                       \
    }                                                                                      \
    _status; })

//
// JNIHelp external API
//

int jniRegisterNativeMethods(JNIEnv* env, const char* className,
    const JNINativeMethod* methods, int numMethods)
{
    ALOGV("Registering %s's %d native methods...", className, numMethods);
    jclass clazz = (*env)->FindClass(env, className);
    ALOG_ALWAYS_FATAL_IF(clazz == NULL,
                         "Native registration unable to find class '%s'; aborting...",
                         className);
    int result = (*env)->RegisterNatives(env, clazz, methods, numMethods);
    (*env)->DeleteLocalRef(env, clazz);
    if (result == 0) {
        return 0;
    }

    // Failure to register natives is fatal. Try to report the corresponding exception,
    // otherwise abort with generic failure message.
    jthrowable thrown = (*env)->ExceptionOccurred(env);
    if (thrown != NULL) {
        struct ExpandableString summary;
        ExpandableStringInitialize(&summary);
        if (GetExceptionSummary(env, thrown, &summary)) {
            ALOGF("%s", summary.data);
        }
        ExpandableStringRelease(&summary);
        (*env)->DeleteLocalRef(env, thrown);
    }
    ALOGF("RegisterNatives failed for '%s'; aborting...", className);
    return result;
}

void jniLogException(JNIEnv* env, int priority, const char* tag, jthrowable thrown) {
    struct ExpandableString summary;
    ExpandableStringInitialize(&summary);
    GetStackTraceOrSummary(env, thrown, &summary);
    const char* details = (summary.data != NULL) ? summary.data : "No memory to report exception";
    __android_log_write(priority, tag, details);
    ExpandableStringRelease(&summary);
}

int jniThrowException(JNIEnv* env, const char* className, const char* message) {
    return THROW_EXCEPTION_WITH_MESSAGE(env, className, "(Ljava/lang/String;)V", message);
}

int jniThrowExceptionFmt(JNIEnv* env, const char* className, const char* fmt, va_list args) {
    char msgBuf[512];
    vsnprintf(msgBuf, sizeof(msgBuf), fmt, args);
    return jniThrowException(env, className, msgBuf);
}

int jniThrowNullPointerException(JNIEnv* env, const char* msg) {
    return jniThrowException(env, "java/lang/NullPointerException", msg);
}

int jniThrowRuntimeException(JNIEnv* env, const char* msg) {
    return jniThrowException(env, "java/lang/RuntimeException", msg);
}

int jniThrowIOException(JNIEnv* env, int errno_value) {
    char buffer[80];
    const char* message = platformStrError(errno_value, buffer, sizeof(buffer));
    return jniThrowException(env, "java/io/IOException", message);
}

int jniThrowErrnoException(JNIEnv* env, const char* functionName, int errno_value) {
    return THROW_EXCEPTION_WITH_MESSAGE(env, "android/system/ErrnoException",
            "(Ljava/lang/String;I)V", functionName, errno_value);
}

jstring jniCreateString(JNIEnv* env, const jchar* unicodeChars, jsize len) {
    return (*env)->NewString(env, unicodeChars, len);
}
