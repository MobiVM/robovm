/* Copyright (C) 2014 The Android Open Source Project
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file implements interfaces from the file jvm.h. This implementation
 * is licensed under the same terms as the file jvm.h.  The
 * copyright and license information for the file jvm.h follows.
 *
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * Services that OpenJDK expects the VM to provide.
 */
#include <dlfcn.h>
#include <limits.h>
#include <stdio.h>
#include <sys/ioctl.h>
#include <sys/socket.h>
#include <sys/time.h>
#include <unistd.h>

#include <android-base/logging.h>

#include "../../libcore/ojluni/src/main/native/jvm.h"  // TODO(narayan): fix it

#include "base/macros.h"
#include "common_throws.h"
#include "gc/heap.h"
#include "handle_scope-inl.h"
#include "jni/java_vm_ext.h"
#include "jni/jni_internal.h"
#include "mirror/class_loader.h"
#include "mirror/string-inl.h"
#include "monitor.h"
#include "native/scoped_fast_native_object_access-inl.h"
#include "nativehelper/scoped_local_ref.h"
#include "nativehelper/scoped_utf_chars.h"
#include "runtime.h"
#include "scoped_thread_state_change-inl.h"
#include "thread.h"
#include "thread_list.h"
#include "verify_object.h"

#undef LOG_TAG
#define LOG_TAG "artopenjdk"

/* posix open() with extensions; used by e.g. ZipFile */
JNIEXPORT jint JVM_Open(const char* fname, jint flags, jint mode) {
    /*
     * Some code seems to want the special return value JVM_EEXIST if the
     * file open fails due to O_EXCL.
     */
    // Don't use JVM_O_DELETE, it's problematic with FUSE, see b/28901232.
    if (flags & JVM_O_DELETE) {
        LOG(FATAL) << "JVM_O_DELETE option is not supported (while opening: '"
                   << fname << "')";
    }

    flags |= O_CLOEXEC;
    int fd = TEMP_FAILURE_RETRY(open(fname, flags & ~JVM_O_DELETE, mode));
    if (fd < 0) {
        int err = errno;
        if (err == EEXIST) {
            return JVM_EEXIST;
        } else {
            return -1;
        }
    }

    return fd;
}

/* posix close() */
JNIEXPORT jint JVM_Close(jint fd) {
    // don't want TEMP_FAILURE_RETRY here -- file is closed even if EINTR
    return close(fd);
}

/* posix read() */
JNIEXPORT jint JVM_Read(jint fd, char* buf, jint nbytes) {
    return TEMP_FAILURE_RETRY(read(fd, buf, nbytes));
}

/* posix write(); is used to write messages to stderr */
JNIEXPORT jint JVM_Write(jint fd, char* buf, jint nbytes) {
    return TEMP_FAILURE_RETRY(write(fd, buf, nbytes));
}

/* posix lseek() */
JNIEXPORT jlong JVM_Lseek(jint fd, jlong offset, jint whence) {
#if !defined(__APPLE__)
    // NOTE: Using TEMP_FAILURE_RETRY here is busted for LP32 on glibc - the return
    // value will be coerced into an int32_t.
    //
    // lseek64 isn't specified to return EINTR so it shouldn't be necessary
    // anyway.
    return lseek64(fd, offset, whence);
#else
    // NOTE: This code is compiled for Mac OS but isn't ever run on that
    // platform.
    return lseek(fd, offset, whence);
#endif
}

/*
 * "raw monitors" seem to be expected to behave like non-recursive pthread
 * mutexes.  They're used by ZipFile.
 */
JNIEXPORT void* JVM_RawMonitorCreate(void) {
    pthread_mutex_t* mutex =
        reinterpret_cast<pthread_mutex_t*>(malloc(sizeof(pthread_mutex_t)));
    CHECK(mutex != nullptr);
    CHECK_PTHREAD_CALL(pthread_mutex_init, (mutex, nullptr), "JVM_RawMonitorCreate");
    return mutex;
}

JNIEXPORT void JVM_RawMonitorDestroy(void* mon) {
    CHECK_PTHREAD_CALL(pthread_mutex_destroy,
                       (reinterpret_cast<pthread_mutex_t*>(mon)),
                       "JVM_RawMonitorDestroy");
    free(mon);
}

JNIEXPORT jint JVM_RawMonitorEnter(void* mon) {
    return pthread_mutex_lock(reinterpret_cast<pthread_mutex_t*>(mon));
}

JNIEXPORT void JVM_RawMonitorExit(void* mon) {
    CHECK_PTHREAD_CALL(pthread_mutex_unlock,
                       (reinterpret_cast<pthread_mutex_t*>(mon)),
                       "JVM_RawMonitorExit");
}

JNIEXPORT char* JVM_NativePath(char* path) {
    return path;
}

JNIEXPORT jint JVM_GetLastErrorString(char* buf, int len) {
#if defined(__GLIBC__) || defined(__BIONIC__)
  if (len == 0) {
    return 0;
  }

  const int err = errno;
  char* result = strerror_r(err, buf, len);
  if (result != buf) {
    strncpy(buf, result, len);
    buf[len - 1] = '\0';
  }

  return strlen(buf);
#else
  UNUSED(buf);
  UNUSED(len);
  return -1;
#endif
}

JNIEXPORT int jio_fprintf(FILE* fp, const char* fmt, ...) {
    va_list args;

    va_start(args, fmt);
    int len = jio_vfprintf(fp, fmt, args);
    va_end(args);

    return len;
}

JNIEXPORT int jio_vfprintf(FILE* fp, const char* fmt, va_list args) {
    assert(fp != nullptr);
    return vfprintf(fp, fmt, args);
}

/* posix fsync() */
JNIEXPORT jint JVM_Sync(jint fd) {
    return TEMP_FAILURE_RETRY(fsync(fd));
}

JNIEXPORT void* JVM_FindLibraryEntry(void* handle, const char* name) {
    return dlsym(handle, name);
}

JNIEXPORT jlong JVM_CurrentTimeMillis(JNIEnv* env ATTRIBUTE_UNUSED,
                                      jclass clazz ATTRIBUTE_UNUSED) {
    struct timeval tv;
    gettimeofday(&tv, (struct timezone *) nullptr);
    jlong when = tv.tv_sec * 1000LL + tv.tv_usec / 1000;
    return when;
}

JNIEXPORT jint JVM_Socket(jint domain, jint type, jint protocol) {
    return TEMP_FAILURE_RETRY(socket(domain, type, protocol));
}

JNIEXPORT jint JVM_InitializeSocketLibrary() {
  return 0;
}

int jio_vsnprintf(char *str, size_t count, const char *fmt, va_list args) {
  if ((intptr_t)count <= 0) return -1;
  return vsnprintf(str, count, fmt, args);
}

int jio_snprintf(char *str, size_t count, const char *fmt, ...) {
  va_list args;
  int len;
  va_start(args, fmt);
  len = jio_vsnprintf(str, count, fmt, args);
  va_end(args);
  return len;
}

JNIEXPORT jint JVM_SetSockOpt(jint fd, int level, int optname,
    const char* optval, int optlen) {
  return TEMP_FAILURE_RETRY(setsockopt(fd, level, optname, optval, optlen));
}

JNIEXPORT jint JVM_SocketShutdown(jint fd, jint howto) {
  return TEMP_FAILURE_RETRY(shutdown(fd, howto));
}

JNIEXPORT jint JVM_GetSockOpt(jint fd, int level, int optname, char* optval,
  int* optlen) {
  socklen_t len = *optlen;
  int cc = TEMP_FAILURE_RETRY(getsockopt(fd, level, optname, optval, &len));
  *optlen = len;
  return cc;
}

JNIEXPORT jint JVM_GetSockName(jint fd, struct sockaddr* addr, int* addrlen) {
  socklen_t len = *addrlen;
  int cc = TEMP_FAILURE_RETRY(getsockname(fd, addr, &len));
  *addrlen = len;
  return cc;
}

JNIEXPORT jint JVM_SocketAvailable(jint fd, jint* result) {
  if (TEMP_FAILURE_RETRY(ioctl(fd, FIONREAD, result)) < 0) {
      return JNI_FALSE;
  }

  return JNI_TRUE;
}

JNIEXPORT jint JVM_Send(jint fd, char* buf, jint nBytes, jint flags) {
  return TEMP_FAILURE_RETRY(send(fd, buf, nBytes, flags));
}

JNIEXPORT jint JVM_SocketClose(jint fd) {
  // Don't want TEMP_FAILURE_RETRY here -- file is closed even if EINTR.
  return close(fd);
}

JNIEXPORT jint JVM_Listen(jint fd, jint count) {
  return TEMP_FAILURE_RETRY(listen(fd, count));
}

JNIEXPORT jint JVM_Connect(jint fd, struct sockaddr* addr, jint addrlen) {
  return TEMP_FAILURE_RETRY(connect(fd, addr, addrlen));
}

JNIEXPORT int JVM_GetHostName(char* name, int namelen) {
  return TEMP_FAILURE_RETRY(gethostname(name, namelen));
}

JNIEXPORT jstring JVM_InternString(JNIEnv* env, jstring jstr) {
  art::ScopedFastNativeObjectAccess soa(env);
  art::ObjPtr<art::mirror::String> s = soa.Decode<art::mirror::String>(jstr);
  return soa.AddLocalReference<jstring>(s->Intern());
}

JNIEXPORT jlong JVM_FreeMemory(void) {
  return art::Runtime::Current()->GetHeap()->GetFreeMemory();
}

JNIEXPORT jlong JVM_TotalMemory(void) {
  return art::Runtime::Current()->GetHeap()->GetTotalMemory();
}

JNIEXPORT jlong JVM_MaxMemory(void) {
  return art::Runtime::Current()->GetHeap()->GetMaxMemory();
}

JNIEXPORT void JVM_GC(void) {
  if (art::Runtime::Current()->IsExplicitGcDisabled()) {
      LOG(INFO) << "Explicit GC skipped.";
      return;
  }
  art::Runtime::Current()->GetHeap()->CollectGarbage(/* clear_soft_references */ false);
}

JNIEXPORT __attribute__((noreturn)) void JVM_Exit(jint status) {
  LOG(INFO) << "System.exit called, status: " << status;
  art::Runtime::Current()->CallExitHook(status);
  exit(status);
}

JNIEXPORT jstring JVM_NativeLoad(JNIEnv* env,
                                 jstring javaFilename,
                                 jobject javaLoader,
                                 jclass caller) {
  ScopedUtfChars filename(env, javaFilename);
  if (filename.c_str() == nullptr) {
    return nullptr;
  }

  std::string error_msg;
  {
    art::JavaVMExt* vm = art::Runtime::Current()->GetJavaVM();
    bool success = vm->LoadNativeLibrary(env,
                                         filename.c_str(),
                                         javaLoader,
                                         caller,
                                         &error_msg);
    if (success) {
      return nullptr;
    }
  }

  // Don't let a pending exception from JNI_OnLoad cause a CheckJNI issue with NewStringUTF.
  env->ExceptionClear();
  return env->NewStringUTF(error_msg.c_str());
}

JNIEXPORT void JVM_StartThread(JNIEnv* env, jobject jthread, jlong stack_size, jboolean daemon) {
  art::Thread::CreateNativeThread(env, jthread, stack_size, daemon == JNI_TRUE);
}

JNIEXPORT void JVM_SetThreadPriority(JNIEnv* env, jobject jthread, jint prio) {
  art::ScopedObjectAccess soa(env);
  art::MutexLock mu(soa.Self(), *art::Locks::thread_list_lock_);
  art::Thread* thread = art::Thread::FromManagedThread(soa, jthread);
  if (thread != nullptr) {
    thread->SetNativePriority(prio);
  }
}

JNIEXPORT void JVM_Yield(JNIEnv* env ATTRIBUTE_UNUSED, jclass threadClass ATTRIBUTE_UNUSED) {
  sched_yield();
}

JNIEXPORT void JVM_Sleep(JNIEnv* env, jclass threadClass ATTRIBUTE_UNUSED,
                         jobject java_lock, jlong millis) {
  art::ScopedFastNativeObjectAccess soa(env);
  art::ObjPtr<art::mirror::Object> lock = soa.Decode<art::mirror::Object>(java_lock);
  art::Monitor::Wait(art::Thread::Current(), lock.Ptr(), millis, 0, true, art::kSleeping);
}

JNIEXPORT jobject JVM_CurrentThread(JNIEnv* env, jclass unused ATTRIBUTE_UNUSED) {
  art::ScopedFastNativeObjectAccess soa(env);
  return soa.AddLocalReference<jobject>(soa.Self()->GetPeer());
}

JNIEXPORT void JVM_Interrupt(JNIEnv* env, jobject jthread) {
  art::ScopedFastNativeObjectAccess soa(env);
  art::MutexLock mu(soa.Self(), *art::Locks::thread_list_lock_);
  art::Thread* thread = art::Thread::FromManagedThread(soa, jthread);
  if (thread != nullptr) {
    thread->Interrupt(soa.Self());
  }
}

JNIEXPORT jboolean JVM_IsInterrupted(JNIEnv* env, jobject jthread, jboolean clearInterrupted) {
  if (clearInterrupted) {
    return static_cast<art::JNIEnvExt*>(env)->GetSelf()->Interrupted() ? JNI_TRUE : JNI_FALSE;
  } else {
    art::ScopedFastNativeObjectAccess soa(env);
    art::MutexLock mu(soa.Self(), *art::Locks::thread_list_lock_);
    art::Thread* thread = art::Thread::FromManagedThread(soa, jthread);
    return (thread != nullptr) ? thread->IsInterrupted() : JNI_FALSE;
  }
}

JNIEXPORT jboolean JVM_HoldsLock(JNIEnv* env, jclass unused ATTRIBUTE_UNUSED, jobject jobj) {
  art::ScopedObjectAccess soa(env);
  art::ObjPtr<art::mirror::Object> object = soa.Decode<art::mirror::Object>(jobj);
  if (object == nullptr) {
    art::ThrowNullPointerException("object == null");
    return JNI_FALSE;
  }
  return soa.Self()->HoldsLock(object);
}

JNIEXPORT void JVM_SetNativeThreadName(JNIEnv* env, jobject jthread, jstring java_name) {
  ScopedUtfChars name(env, java_name);
  {
    art::ScopedObjectAccess soa(env);
    if (soa.Decode<art::mirror::Object>(jthread) == soa.Self()->GetPeer()) {
      soa.Self()->SetThreadName(name.c_str());
      return;
    }
  }
  // Suspend thread to avoid it from killing itself while we set its name. We don't just hold the
  // thread list lock to avoid this, as setting the thread name causes mutator to lock/unlock
  // in the DDMS send code.
  art::ThreadList* thread_list = art::Runtime::Current()->GetThreadList();
  bool timed_out;
  // Take suspend thread lock to avoid races with threads trying to suspend this one.
  art::Thread* thread;
  {
    thread = thread_list->SuspendThreadByPeer(jthread,
                                              true,
                                              art::SuspendReason::kInternal,
                                              &timed_out);
  }
  if (thread != nullptr) {
    {
      art::ScopedObjectAccess soa(env);
      thread->SetThreadName(name.c_str());
    }
    bool resumed = thread_list->Resume(thread, art::SuspendReason::kInternal);
    DCHECK(resumed);
  } else if (timed_out) {
    LOG(ERROR) << "Trying to set thread name to '" << name.c_str() << "' failed as the thread "
        "failed to suspend within a generous timeout.";
  }
}

JNIEXPORT __attribute__((noreturn)) jint JVM_IHashCode(JNIEnv* env ATTRIBUTE_UNUSED,
                             jobject javaObject ATTRIBUTE_UNUSED) {
  UNIMPLEMENTED(FATAL) << "JVM_IHashCode is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn)) jlong JVM_NanoTime(JNIEnv* env ATTRIBUTE_UNUSED, jclass unused ATTRIBUTE_UNUSED) {
  UNIMPLEMENTED(FATAL) << "JVM_NanoTime is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn)) void JVM_ArrayCopy(JNIEnv* /* env */, jclass /* unused */, jobject /* javaSrc */,
                             jint /* srcPos */, jobject /* javaDst */, jint /* dstPos */,
                             jint /* length */) {
  UNIMPLEMENTED(FATAL) << "JVM_ArrayCopy is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn)) jint JVM_FindSignal(const char* name ATTRIBUTE_UNUSED) {
  LOG(FATAL) << "JVM_FindSignal is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn)) void* JVM_RegisterSignal(jint signum ATTRIBUTE_UNUSED, void* handler ATTRIBUTE_UNUSED) {
  LOG(FATAL) << "JVM_RegisterSignal is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn)) jboolean JVM_RaiseSignal(jint signum ATTRIBUTE_UNUSED) {
  LOG(FATAL) << "JVM_RaiseSignal is not implemented";
  UNREACHABLE();
}

JNIEXPORT __attribute__((noreturn))  void JVM_Halt(jint code) {
  exit(code);
}

JNIEXPORT jboolean JVM_IsNaN(jdouble d) {
  return isnan(d);
}
