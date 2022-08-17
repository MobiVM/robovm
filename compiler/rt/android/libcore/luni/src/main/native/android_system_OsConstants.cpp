/*
 * Copyright (C) 2011 The Android Open Source Project
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

#define LOG_TAG "OsConstants"

#include <errno.h>
#include <fcntl.h>
#include <netdb.h>
#include <netinet/icmp6.h>
#include <netinet/in.h>
#include <netinet/ip_icmp.h>
#include <netinet/tcp.h>
#include <poll.h>
#include <signal.h>
#include <stdlib.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#if defined(__linux__) // RoboVM Note: not available on Darwin
#include <sys/prctl.h>
#endif // RoboVM Note: end of changes
#include <sys/resource.h>
#include <sys/socket.h>
#include <sys/stat.h>
#include <sys/un.h>
#include <sys/wait.h>
#include <sys/xattr.h>
#include <unistd.h>

#if defined(__linux__) // RoboVM Note: not available on Darwin
#include <net/if_arp.h>
#include <linux/if_ether.h>

// After the others because these are not necessarily self-contained in glibc.
#include <linux/if_addr.h>
#include <linux/rtnetlink.h>

// Include linux socket constants for setting sockopts
#include <linux/udp.h>
#endif // RoboVM Note: end of changes

#include <net/if.h> // After <sys/socket.h> to work around a Mac header file bug.

#if defined(__BIONIC__)
#include <linux/capability.h>
#endif

#include <nativehelper/JNIHelp.h>
#include <nativehelper/jni_macros.h>

#include "Portability.h"

static int ThrowUnsupportedOperation(JNIEnv* env) {
    jniThrowExceptionFmt(env, "java/lang/UnsupportedOperationException", "Constant is not available");
    return 0;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1INET(JNIEnv* env, jclass) {
    return AF_INET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1INET6(JNIEnv* env, jclass) {
    return AF_INET6;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1PACKET(JNIEnv* env, jclass) {
#if defined(AF_PACKET)
    return AF_PACKET;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1NETLINK(JNIEnv* env, jclass) {
#if defined(AF_NETLINK)
    return AF_NETLINK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1UNIX(JNIEnv* env, jclass) {
    return AF_UNIX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1VSOCK(JNIEnv* env, jclass) {
    return AF_VSOCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AF_1UNSPEC(JNIEnv* env, jclass) {
    return AF_UNSPEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1ADDRCONFIG(JNIEnv* env, jclass) {
    return AI_ADDRCONFIG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1ALL(JNIEnv* env, jclass) {
    return AI_ALL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1CANONNAME(JNIEnv* env, jclass) {
    return AI_CANONNAME;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1NUMERICHOST(JNIEnv* env, jclass) {
    return AI_NUMERICHOST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1NUMERICSERV(JNIEnv* env, jclass) {
#if defined(AI_NUMERICSERV)
    return AI_NUMERICSERV;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1PASSIVE(JNIEnv* env, jclass) {
    return AI_PASSIVE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_AI_1V4MAPPED(JNIEnv* env, jclass) {
    return AI_V4MAPPED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ARPHRD_1ETHER(JNIEnv* env, jclass) {
#if defined(ARPHRD_ETHER)
    return ARPHRD_ETHER;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_VMADDR_1PORT_1ANY(JNIEnv* env, jclass) {
#if defined(VMADDR_PORT_ANY)
    return VMADDR_PORT_ANY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_VMADDR_1CID_1ANY(JNIEnv* env, jclass) {
#if defined(VMADDR_CID_ANY)
    return VMADDR_CID_ANY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_VMADDR_1CID_1LOCAL(JNIEnv* env, jclass) {
#if defined(VMADDR_CID_LOCAL)
    return VMADDR_CID_LOCAL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_VMADDR_1CID_1HOST(JNIEnv* env, jclass) {
#if defined(VMADDR_CID_HOST)
    return VMADDR_CID_HOST;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ARPHRD_1LOOPBACK(JNIEnv* env, jclass) {
#if defined(ARPHRD_LOOPBACK)
    return ARPHRD_LOOPBACK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1AUDIT_1CONTROL(JNIEnv* env, jclass) {
#if defined(CAP_LAST_CAP)
    return CAP_AUDIT_CONTROL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1AUDIT_1WRITE(JNIEnv* env, jclass) {
#if defined(CAP_AUDIT_WRITE)
    return CAP_AUDIT_WRITE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1BLOCK_1SUSPEND(JNIEnv* env, jclass) {
#if defined(CAP_BLOCK_SUSPEND)
    return CAP_BLOCK_SUSPEND;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1CHOWN(JNIEnv* env, jclass) {
#if defined(CAP_CHOWN)
    return CAP_CHOWN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1DAC_1OVERRIDE(JNIEnv* env, jclass) {
#if defined(CAP_DAC_OVERRIDE)
    return CAP_DAC_OVERRIDE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1DAC_1READ_1SEARCH(JNIEnv* env, jclass) {
#if defined(CAP_DAC_READ_SEARCH)
    return CAP_DAC_READ_SEARCH;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1FOWNER(JNIEnv* env, jclass) {
#if defined(CAP_FOWNER)
    return CAP_FOWNER;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1FSETID(JNIEnv* env, jclass) {
#if defined(CAP_FSETID)
    return CAP_FSETID;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1IPC_1LOCK(JNIEnv* env, jclass) {
#if defined(CAP_IPC_LOCK)
    return CAP_IPC_LOCK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1IPC_1OWNER(JNIEnv* env, jclass) {
#if defined(CAP_IPC_OWNER)
    return CAP_IPC_OWNER;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1KILL(JNIEnv* env, jclass) {
#if defined(CAP_KILL)
    return CAP_KILL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1LAST_1CAP(JNIEnv* env, jclass) {
#if defined(CAP_LAST_CAP)
    return CAP_LAST_CAP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1LEASE(JNIEnv* env, jclass) {
#if defined(CAP_LEASE)
    return CAP_LEASE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1LINUX_1IMMUTABLE(JNIEnv* env, jclass) {
#if defined(CAP_LINUX_IMMUTABLE)
    return CAP_LINUX_IMMUTABLE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1MAC_1ADMIN(JNIEnv* env, jclass) {
#if defined(CAP_MAC_ADMIN)
    return CAP_MAC_ADMIN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1MAC_1OVERRIDE(JNIEnv* env, jclass) {
#if defined(CAP_MAC_OVERRIDE)
    return CAP_MAC_OVERRIDE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1MKNOD(JNIEnv* env, jclass) {
#if defined(CAP_MKNOD)
    return CAP_MKNOD;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1NET_1ADMIN(JNIEnv* env, jclass) {
#if defined(CAP_NET_ADMIN)
    return CAP_NET_ADMIN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1NET_1BIND_1SERVICE(JNIEnv* env, jclass) {
#if defined(CAP_NET_BIND_SERVICE)
    return CAP_NET_BIND_SERVICE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1NET_1BROADCAST(JNIEnv* env, jclass) {
#if defined(CAP_NET_BROADCAST)
    return CAP_NET_BROADCAST;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1NET_1RAW(JNIEnv* env, jclass) {
#if defined(CAP_NET_RAW)
    return CAP_NET_RAW;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SETFCAP(JNIEnv* env, jclass) {
#if defined(CAP_SETFCAP)
    return CAP_SETFCAP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SETGID(JNIEnv* env, jclass) {
#if defined(CAP_SETGID)
    return CAP_SETGID;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SETPCAP(JNIEnv* env, jclass) {
#if defined(CAP_SETPCAP)
    return CAP_SETPCAP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SETUID(JNIEnv* env, jclass) {
#if defined(CAP_SETUID)
    return CAP_SETUID;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1ADMIN(JNIEnv* env, jclass) {
#if defined(CAP_SYS_ADMIN)
    return CAP_SYS_ADMIN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1BOOT(JNIEnv* env, jclass) {
#if defined(CAP_SYS_BOOT)
    return CAP_SYS_BOOT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1CHROOT(JNIEnv* env, jclass) {
#if defined(CAP_SYS_CHROOT)
    return CAP_SYS_CHROOT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYSLOG(JNIEnv* env, jclass) {
#if defined(CAP_SYSLOG)
    return CAP_SYSLOG;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1MODULE(JNIEnv* env, jclass) {
#if defined(CAP_SYS_MODULE)
    return CAP_SYS_MODULE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1NICE(JNIEnv* env, jclass) {
#if defined(CAP_SYS_NICE)
    return CAP_SYS_NICE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1PACCT(JNIEnv* env, jclass) {
#if defined(CAP_SYS_PACCT)
    return CAP_SYS_PACCT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1PTRACE(JNIEnv* env, jclass) {
#if defined(CAP_SYS_PTRACE)
    return CAP_SYS_PTRACE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1RAWIO(JNIEnv* env, jclass) {
#if defined(CAP_SYS_RAWIO)
    return CAP_SYS_RAWIO;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1RESOURCE(JNIEnv* env, jclass) {
#if defined(CAP_SYS_RESOURCE)
    return CAP_SYS_RESOURCE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1TIME(JNIEnv* env, jclass) {
#if defined(CAP_SYS_TIME)
    return CAP_SYS_TIME;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1SYS_1TTY_1CONFIG(JNIEnv* env, jclass) {
#if defined(CAP_SYS_TTY_CONFIG)
    return CAP_SYS_TTY_CONFIG;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_CAP_1WAKE_1ALARM(JNIEnv* env, jclass) {
#if defined(CAP_WAKE_ALARM)
    return CAP_WAKE_ALARM;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_E2BIG(JNIEnv* env, jclass) {
    return E2BIG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EACCES(JNIEnv* env, jclass) {
    return EACCES;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EADDRINUSE(JNIEnv* env, jclass) {
    return EADDRINUSE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EADDRNOTAVAIL(JNIEnv* env, jclass) {
    return EADDRNOTAVAIL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAFNOSUPPORT(JNIEnv* env, jclass) {
    return EAFNOSUPPORT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAGAIN(JNIEnv* env, jclass) {
    return EAGAIN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1AGAIN(JNIEnv* env, jclass) {
    return EAI_AGAIN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1BADFLAGS(JNIEnv* env, jclass) {
    return EAI_BADFLAGS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1FAIL(JNIEnv* env, jclass) {
    return EAI_FAIL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1FAMILY(JNIEnv* env, jclass) {
    return EAI_FAMILY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1MEMORY(JNIEnv* env, jclass) {
    return EAI_MEMORY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1NODATA(JNIEnv* env, jclass) {
    return EAI_NODATA;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1NONAME(JNIEnv* env, jclass) {
    return EAI_NONAME;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1OVERFLOW(JNIEnv* env, jclass) {
#if defined(EAI_OVERFLOW)
    return EAI_OVERFLOW;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1SERVICE(JNIEnv* env, jclass) {
    return EAI_SERVICE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1SOCKTYPE(JNIEnv* env, jclass) {
    return EAI_SOCKTYPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EAI_1SYSTEM(JNIEnv* env, jclass) {
    return EAI_SYSTEM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EALREADY(JNIEnv* env, jclass) {
    return EALREADY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EBADF(JNIEnv* env, jclass) {
    return EBADF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EBADMSG(JNIEnv* env, jclass) {
    return EBADMSG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EBUSY(JNIEnv* env, jclass) {
    return EBUSY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ECANCELED(JNIEnv* env, jclass) {
    return ECANCELED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ECHILD(JNIEnv* env, jclass) {
    return ECHILD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ECONNABORTED(JNIEnv* env, jclass) {
    return ECONNABORTED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ECONNREFUSED(JNIEnv* env, jclass) {
    return ECONNREFUSED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ECONNRESET(JNIEnv* env, jclass) {
    return ECONNRESET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EDEADLK(JNIEnv* env, jclass) {
    return EDEADLK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EDESTADDRREQ(JNIEnv* env, jclass) {
    return EDESTADDRREQ;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EDOM(JNIEnv* env, jclass) {
    return EDOM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EDQUOT(JNIEnv* env, jclass) {
    return EDQUOT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EEXIST(JNIEnv* env, jclass) {
    return EEXIST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EFAULT(JNIEnv* env, jclass) {
    return EFAULT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EFBIG(JNIEnv* env, jclass) {
    return EFBIG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EHOSTUNREACH(JNIEnv* env, jclass) {
    return EHOSTUNREACH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EIDRM(JNIEnv* env, jclass) {
    return EIDRM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EILSEQ(JNIEnv* env, jclass) {
    return EILSEQ;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EINPROGRESS(JNIEnv* env, jclass) {
    return EINPROGRESS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EINTR(JNIEnv* env, jclass) {
    return EINTR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EINVAL(JNIEnv* env, jclass) {
    return EINVAL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EIO(JNIEnv* env, jclass) {
    return EIO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EISCONN(JNIEnv* env, jclass) {
    return EISCONN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EISDIR(JNIEnv* env, jclass) {
    return EISDIR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ELOOP(JNIEnv* env, jclass) {
    return ELOOP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EMFILE(JNIEnv* env, jclass) {
    return EMFILE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EMLINK(JNIEnv* env, jclass) {
    return EMLINK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EMSGSIZE(JNIEnv* env, jclass) {
    return EMSGSIZE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EMULTIHOP(JNIEnv* env, jclass) {
    return EMULTIHOP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENAMETOOLONG(JNIEnv* env, jclass) {
    return ENAMETOOLONG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENETDOWN(JNIEnv* env, jclass) {
    return ENETDOWN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENETRESET(JNIEnv* env, jclass) {
    return ENETRESET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENETUNREACH(JNIEnv* env, jclass) {
    return ENETUNREACH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENFILE(JNIEnv* env, jclass) {
    return ENFILE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOBUFS(JNIEnv* env, jclass) {
    return ENOBUFS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENODATA(JNIEnv* env, jclass) {
    return ENODATA;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENODEV(JNIEnv* env, jclass) {
    return ENODEV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOENT(JNIEnv* env, jclass) {
    return ENOENT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOEXEC(JNIEnv* env, jclass) {
    return ENOEXEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOLCK(JNIEnv* env, jclass) {
    return ENOLCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOLINK(JNIEnv* env, jclass) {
    return ENOLINK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOMEM(JNIEnv* env, jclass) {
    return ENOMEM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOMSG(JNIEnv* env, jclass) {
    return ENOMSG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENONET(JNIEnv* env, jclass) {
#if defined(ENONET)
    return ENONET;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOPROTOOPT(JNIEnv* env, jclass) {
    return ENOPROTOOPT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOSPC(JNIEnv* env, jclass) {
    return ENOSPC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOSR(JNIEnv* env, jclass) {
    return ENOSR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOSTR(JNIEnv* env, jclass) {
    return ENOSTR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOSYS(JNIEnv* env, jclass) {
    return ENOSYS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTCONN(JNIEnv* env, jclass) {
    return ENOTCONN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTDIR(JNIEnv* env, jclass) {
    return ENOTDIR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTEMPTY(JNIEnv* env, jclass) {
    return ENOTEMPTY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTSOCK(JNIEnv* env, jclass) {
    return ENOTSOCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTSUP(JNIEnv* env, jclass) {
    return ENOTSUP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENOTTY(JNIEnv* env, jclass) {
    return ENOTTY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ENXIO(JNIEnv* env, jclass) {
    return ENXIO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EOPNOTSUPP(JNIEnv* env, jclass) {
    return EOPNOTSUPP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EOVERFLOW(JNIEnv* env, jclass) {
    return EOVERFLOW;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EPERM(JNIEnv* env, jclass) {
    return EPERM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EPIPE(JNIEnv* env, jclass) {
    return EPIPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EPROTO(JNIEnv* env, jclass) {
    return EPROTO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EPROTONOSUPPORT(JNIEnv* env, jclass) {
    return EPROTONOSUPPORT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EPROTOTYPE(JNIEnv* env, jclass) {
    return EPROTOTYPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ERANGE(JNIEnv* env, jclass) {
    return ERANGE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EROFS(JNIEnv* env, jclass) {
    return EROFS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ESPIPE(JNIEnv* env, jclass) {
    return ESPIPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ESRCH(JNIEnv* env, jclass) {
    return ESRCH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ESTALE(JNIEnv* env, jclass) {
    return ESTALE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETH_1P_1ALL(JNIEnv* env, jclass) {
#if defined(ETH_P_ALL)
    return ETH_P_ALL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETH_1P_1ARP(JNIEnv* env, jclass) {
#if defined(ETH_P_ARP)
    return ETH_P_ARP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETH_1P_1IP(JNIEnv* env, jclass) {
#if defined(ETH_P_IP)
    return ETH_P_IP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETH_1P_1IPV6(JNIEnv* env, jclass) {
#if defined(ETH_P_IPV6)
    return ETH_P_IPV6;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETIME(JNIEnv* env, jclass) {
    return ETIME;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETIMEDOUT(JNIEnv* env, jclass) {
    return ETIMEDOUT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ETXTBSY(JNIEnv* env, jclass) {
    return ETXTBSY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EUSERS(JNIEnv* env, jclass) {
    return EUSERS;
}

#if EWOULDBLOCK != EAGAIN
#error EWOULDBLOCK != EAGAIN
#endif
extern "C" JNIEXPORT jint Java_android_system_OsConstants_EXDEV(JNIEnv* env, jclass) {
    return EXDEV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EXIT_1FAILURE(JNIEnv* env, jclass) {
    return EXIT_FAILURE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_EXIT_1SUCCESS(JNIEnv* env, jclass) {
    return EXIT_SUCCESS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_FD_1CLOEXEC(JNIEnv* env, jclass) {
    return FD_CLOEXEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_FIONREAD(JNIEnv* env, jclass) {
    return FIONREAD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1DUPFD(JNIEnv* env, jclass) {
    return F_DUPFD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1DUPFD_1CLOEXEC(JNIEnv* env, jclass) {
    return F_DUPFD_CLOEXEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1GETFD(JNIEnv* env, jclass) {
    return F_GETFD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1GETFL(JNIEnv* env, jclass) {
    return F_GETFL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1GETLK(JNIEnv* env, jclass) {
    return F_GETLK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1GETLK64(JNIEnv* env, jclass) {
#if defined(F_GETLK64)
    return F_GETLK64;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1GETOWN(JNIEnv* env, jclass) {
    return F_GETOWN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1OK(JNIEnv* env, jclass) {
    return F_OK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1RDLCK(JNIEnv* env, jclass) {
    return F_RDLCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETFD(JNIEnv* env, jclass) {
    return F_SETFD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETFL(JNIEnv* env, jclass) {
    return F_SETFL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETLK(JNIEnv* env, jclass) {
    return F_SETLK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETLK64(JNIEnv* env, jclass) {
#if defined(F_SETLK64)
    return F_SETLK64;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETLKW(JNIEnv* env, jclass) {
    return F_SETLKW;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETLKW64(JNIEnv* env, jclass) {
#if defined(F_SETLKW64)
    return F_SETLKW64;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1SETOWN(JNIEnv* env, jclass) {
    return F_SETOWN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1UNLCK(JNIEnv* env, jclass) {
    return F_UNLCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_F_1WRLCK(JNIEnv* env, jclass) {
    return F_WRLCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ICMP_1ECHO(JNIEnv* env, jclass) {
    return ICMP_ECHO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ICMP_1ECHOREPLY(JNIEnv* env, jclass) {
    return ICMP_ECHOREPLY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ICMP6_1ECHO_1REQUEST(JNIEnv* env, jclass) {
    return ICMP6_ECHO_REQUEST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ICMP6_1ECHO_1REPLY(JNIEnv* env, jclass) {
    return ICMP6_ECHO_REPLY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1DADFAILED(JNIEnv* env, jclass) {
#if defined(IFA_F_DADFAILED)
    return IFA_F_DADFAILED;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1DEPRECATED(JNIEnv* env, jclass) {
#if defined(IFA_F_DEPRECATED)
    return IFA_F_DEPRECATED;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1HOMEADDRESS(JNIEnv* env, jclass) {
#if defined(IFA_F_HOMEADDRESS)
    return IFA_F_HOMEADDRESS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1NODAD(JNIEnv* env, jclass) {
#if defined(IFA_F_NODAD)
    return IFA_F_NODAD;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1OPTIMISTIC(JNIEnv* env, jclass) {
#if defined(IFA_F_OPTIMISTIC)
    return IFA_F_OPTIMISTIC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1PERMANENT(JNIEnv* env, jclass) {
#if defined(IFA_F_PERMANENT)
    return IFA_F_PERMANENT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1SECONDARY(JNIEnv* env, jclass) {
#if defined(IFA_F_SECONDARY)
    return IFA_F_SECONDARY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1TEMPORARY(JNIEnv* env, jclass) {
#if defined(IFA_F_TEMPORARY)
    return IFA_F_TEMPORARY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFA_1F_1TENTATIVE(JNIEnv* env, jclass) {
#if defined(IFA_F_TENTATIVE)
    return IFA_F_TENTATIVE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1ALLMULTI(JNIEnv* env, jclass) {
    return IFF_ALLMULTI;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1AUTOMEDIA(JNIEnv* env, jclass) {
#if defined(IFF_AUTOMEDIA)
    return IFF_AUTOMEDIA;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1BROADCAST(JNIEnv* env, jclass) {
    return IFF_BROADCAST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1DEBUG(JNIEnv* env, jclass) {
    return IFF_DEBUG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1DYNAMIC(JNIEnv* env, jclass) {
#if defined(IFF_DYNAMIC)
    return IFF_DYNAMIC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1LOOPBACK(JNIEnv* env, jclass) {
    return IFF_LOOPBACK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1MASTER(JNIEnv* env, jclass) {
#if defined(IFF_MASTER)
    return IFF_MASTER;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1MULTICAST(JNIEnv* env, jclass) {
    return IFF_MULTICAST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1NOARP(JNIEnv* env, jclass) {
    return IFF_NOARP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1NOTRAILERS(JNIEnv* env, jclass) {
    return IFF_NOTRAILERS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1POINTOPOINT(JNIEnv* env, jclass) {
    return IFF_POINTOPOINT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1PORTSEL(JNIEnv* env, jclass) {
#if defined(IFF_PORTSEL)
    return IFF_PORTSEL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1PROMISC(JNIEnv* env, jclass) {
    return IFF_PROMISC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1RUNNING(JNIEnv* env, jclass) {
    return IFF_RUNNING;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1SLAVE(JNIEnv* env, jclass) {
#if defined(IFF_SLAVE)
    return IFF_SLAVE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IFF_1UP(JNIEnv* env, jclass) {
    return IFF_UP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1ICMP(JNIEnv* env, jclass) {
    return IPPROTO_ICMP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1ICMPV6(JNIEnv* env, jclass) {
    return IPPROTO_ICMPV6;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1IP(JNIEnv* env, jclass) {
    return IPPROTO_IP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1IPV6(JNIEnv* env, jclass) {
    return IPPROTO_IPV6;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1RAW(JNIEnv* env, jclass) {
    return IPPROTO_RAW;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1TCP(JNIEnv* env, jclass) {
    return IPPROTO_TCP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPPROTO_1UDP(JNIEnv* env, jclass) {
    return IPPROTO_UDP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1CHECKSUM(JNIEnv* env, jclass) {
    return IPV6_CHECKSUM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1MULTICAST_1HOPS(JNIEnv* env, jclass) {
    return IPV6_MULTICAST_HOPS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1MULTICAST_1IF(JNIEnv* env, jclass) {
    return IPV6_MULTICAST_IF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1MULTICAST_1LOOP(JNIEnv* env, jclass) {
    return IPV6_MULTICAST_LOOP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVDSTOPTS(JNIEnv* env, jclass) {
#if defined(IPV6_RECVDSTOPTS)
    return IPV6_RECVDSTOPTS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVHOPLIMIT(JNIEnv* env, jclass) {
#if defined(IPV6_RECVHOPLIMIT)
    return IPV6_RECVHOPLIMIT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVHOPOPTS(JNIEnv* env, jclass) {
#if defined(IPV6_RECVHOPOPTS)
    return IPV6_RECVHOPOPTS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVPKTINFO(JNIEnv* env, jclass) {
#if defined(IPV6_RECVPKTINFO)
    return IPV6_RECVPKTINFO;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVRTHDR(JNIEnv* env, jclass) {
#if defined(IPV6_RECVRTHDR)
    return IPV6_RECVRTHDR;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1RECVTCLASS(JNIEnv* env, jclass) {
#if defined(IPV6_RECVTCLASS)
    return IPV6_RECVTCLASS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1TCLASS(JNIEnv* env, jclass) {
#if defined(IPV6_TCLASS)
    return IPV6_TCLASS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1UNICAST_1HOPS(JNIEnv* env, jclass) {
    return IPV6_UNICAST_HOPS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IPV6_1V6ONLY(JNIEnv* env, jclass) {
    return IPV6_V6ONLY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1MULTICAST_1ALL(JNIEnv* env, jclass) {
#if defined(IP_MULTICAST_ALL)
    return IP_MULTICAST_ALL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1MULTICAST_1IF(JNIEnv* env, jclass) {
    return IP_MULTICAST_IF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1MULTICAST_1LOOP(JNIEnv* env, jclass) {
    return IP_MULTICAST_LOOP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1MULTICAST_1TTL(JNIEnv* env, jclass) {
    return IP_MULTICAST_TTL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1RECVTOS(JNIEnv* env, jclass) {
    return IP_RECVTOS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1TOS(JNIEnv* env, jclass) {
    return IP_TOS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_IP_1TTL(JNIEnv* env, jclass) {
    return IP_TTL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1LINUX_1CAPABILITY_1VERSION_13(JNIEnv* env, jclass) {
#if defined(_LINUX_CAPABILITY_VERSION_3)
    return _LINUX_CAPABILITY_VERSION_3;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MAP_1ANONYMOUS(JNIEnv* env, jclass) {
    return MAP_ANONYMOUS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MAP_1FIXED(JNIEnv* env, jclass) {
    return MAP_FIXED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MAP_1POPULATE(JNIEnv* env, jclass) {
#if defined(MAP_POPULATE)
    return MAP_POPULATE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MAP_1PRIVATE(JNIEnv* env, jclass) {
    return MAP_PRIVATE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MAP_1SHARED(JNIEnv* env, jclass) {
    return MAP_SHARED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1JOIN_1GROUP(JNIEnv* env, jclass) {
#if defined(MCAST_JOIN_GROUP)
    return MCAST_JOIN_GROUP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1LEAVE_1GROUP(JNIEnv* env, jclass) {
#if defined(MCAST_LEAVE_GROUP)
    return MCAST_LEAVE_GROUP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1JOIN_1SOURCE_1GROUP(JNIEnv* env, jclass) {
#if defined(MCAST_JOIN_SOURCE_GROUP)
    return MCAST_JOIN_SOURCE_GROUP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1LEAVE_1SOURCE_1GROUP(JNIEnv* env, jclass) {
#if defined(MCAST_LEAVE_SOURCE_GROUP)
    return MCAST_LEAVE_SOURCE_GROUP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1BLOCK_1SOURCE(JNIEnv* env, jclass) {
#if defined(MCAST_BLOCK_SOURCE)
    return MCAST_BLOCK_SOURCE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCAST_1UNBLOCK_1SOURCE(JNIEnv* env, jclass) {
#if defined(MCAST_UNBLOCK_SOURCE)
    return MCAST_UNBLOCK_SOURCE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCL_1CURRENT(JNIEnv* env, jclass) {
    return MCL_CURRENT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MCL_1FUTURE(JNIEnv* env, jclass) {
    return MCL_FUTURE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MFD_1CLOEXEC(JNIEnv* env, jclass) {
#if defined(MFD_CLOEXEC)
    return MFD_CLOEXEC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1CTRUNC(JNIEnv* env, jclass) {
    return MSG_CTRUNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1DONTROUTE(JNIEnv* env, jclass) {
    return MSG_DONTROUTE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1EOR(JNIEnv* env, jclass) {
    return MSG_EOR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1OOB(JNIEnv* env, jclass) {
    return MSG_OOB;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1PEEK(JNIEnv* env, jclass) {
    return MSG_PEEK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1TRUNC(JNIEnv* env, jclass) {
    return MSG_TRUNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MSG_1WAITALL(JNIEnv* env, jclass) {
    return MSG_WAITALL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MS_1ASYNC(JNIEnv* env, jclass) {
    return MS_ASYNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MS_1INVALIDATE(JNIEnv* env, jclass) {
    return MS_INVALIDATE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_MS_1SYNC(JNIEnv* env, jclass) {
    return MS_SYNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NETLINK_1NETFILTER(JNIEnv* env, jclass) {
#if defined(NETLINK_NETFILTER)
    return NETLINK_NETFILTER;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NETLINK_1ROUTE(JNIEnv* env, jclass) {
#if defined(NETLINK_ROUTE)
    return NETLINK_ROUTE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NETLINK_1INET_1DIAG(JNIEnv* env, jclass) {
#if defined(NETLINK_INET_DIAG)
    return NETLINK_INET_DIAG;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NI_1DGRAM(JNIEnv* env, jclass) {
    return NI_DGRAM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NI_1NAMEREQD(JNIEnv* env, jclass) {
    return NI_NAMEREQD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NI_1NOFQDN(JNIEnv* env, jclass) {
    return NI_NOFQDN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NI_1NUMERICHOST(JNIEnv* env, jclass) {
    return NI_NUMERICHOST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_NI_1NUMERICSERV(JNIEnv* env, jclass) {
    return NI_NUMERICSERV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1ACCMODE(JNIEnv* env, jclass) {
    return O_ACCMODE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1APPEND(JNIEnv* env, jclass) {
    return O_APPEND;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1CLOEXEC(JNIEnv* env, jclass) {
    return O_CLOEXEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1CREAT(JNIEnv* env, jclass) {
    return O_CREAT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1DIRECT(JNIEnv* env, jclass) {
#if defined(O_DIRECT)
    return O_DIRECT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1EXCL(JNIEnv* env, jclass) {
    return O_EXCL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1NOCTTY(JNIEnv* env, jclass) {
    return O_NOCTTY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1NOFOLLOW(JNIEnv* env, jclass) {
    return O_NOFOLLOW;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1NONBLOCK(JNIEnv* env, jclass) {
    return O_NONBLOCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1RDONLY(JNIEnv* env, jclass) {
    return O_RDONLY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1RDWR(JNIEnv* env, jclass) {
    return O_RDWR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1SYNC(JNIEnv* env, jclass) {
    return O_SYNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1DSYNC(JNIEnv* env, jclass) {
    return O_DSYNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1TRUNC(JNIEnv* env, jclass) {
    return O_TRUNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_O_1WRONLY(JNIEnv* env, jclass) {
    return O_WRONLY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLERR(JNIEnv* env, jclass) {
    return POLLERR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLHUP(JNIEnv* env, jclass) {
    return POLLHUP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLIN(JNIEnv* env, jclass) {
    return POLLIN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLNVAL(JNIEnv* env, jclass) {
    return POLLNVAL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLOUT(JNIEnv* env, jclass) {
    return POLLOUT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLPRI(JNIEnv* env, jclass) {
    return POLLPRI;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLRDBAND(JNIEnv* env, jclass) {
    return POLLRDBAND;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLRDNORM(JNIEnv* env, jclass) {
    return POLLRDNORM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLWRBAND(JNIEnv* env, jclass) {
    return POLLWRBAND;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_POLLWRNORM(JNIEnv* env, jclass) {
    return POLLWRNORM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PR_1CAP_1AMBIENT(JNIEnv* env, jclass) {
#if defined(PR_CAP_AMBIENT)
    return PR_CAP_AMBIENT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PR_1CAP_1AMBIENT_1RAISE(JNIEnv* env, jclass) {
#if defined(PR_CAP_AMBIENT_RAISE)
    return PR_CAP_AMBIENT_RAISE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PR_1GET_1DUMPABLE(JNIEnv* env, jclass) {
#if defined(PR_GET_DUMPABLE)
    return PR_GET_DUMPABLE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PR_1SET_1DUMPABLE(JNIEnv* env, jclass) {
#if defined(PR_SET_DUMPABLE)
    return PR_SET_DUMPABLE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PR_1SET_1NO_1NEW_1PRIVS(JNIEnv* env, jclass) {
#if defined(PR_SET_NO_NEW_PRIVS)
    return PR_SET_NO_NEW_PRIVS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PROT_1EXEC(JNIEnv* env, jclass) {
    return PROT_EXEC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PROT_1NONE(JNIEnv* env, jclass) {
    return PROT_NONE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PROT_1READ(JNIEnv* env, jclass) {
    return PROT_READ;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_PROT_1WRITE(JNIEnv* env, jclass) {
    return PROT_WRITE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_R_1OK(JNIEnv* env, jclass) {
    return R_OK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RLIMIT_1NOFILE(JNIEnv* env, jclass) {
    return RLIMIT_NOFILE;
}

// NOTE: The RT_* constants are not preprocessor defines, they're enum
// members. The best we can do (barring UAPI / kernel version checks) is
// to hope they exist on all host linuxes we're building on. These
// constants have been around since 2.6.35 at least, so we should be ok.
extern "C" JNIEXPORT jint Java_android_system_OsConstants_RT_1SCOPE_1HOST(JNIEnv* env, jclass) {
#if defined(RT_SCOPE_HOST)
    return RT_SCOPE_HOST;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RT_1SCOPE_1LINK(JNIEnv* env, jclass) {
#if defined(RT_SCOPE_LINK)
    return RT_SCOPE_LINK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RT_1SCOPE_1NOWHERE(JNIEnv* env, jclass) {
#if defined(RT_SCOPE_NOWHERE)
    return RT_SCOPE_NOWHERE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RT_1SCOPE_1SITE(JNIEnv* env, jclass) {
#if defined(RT_SCOPE_SITE)
    return RT_SCOPE_SITE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RT_1SCOPE_1UNIVERSE(JNIEnv* env, jclass) {
#if defined(RT_SCOPE_UNIVERSE)
    return RT_SCOPE_UNIVERSE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV4_1IFADDR(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV4_IFADDR)
    return RTMGRP_IPV4_IFADDR;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV4_1MROUTE(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV4_MROUTE)
    return RTMGRP_IPV4_MROUTE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV4_1ROUTE(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV4_ROUTE)
    return RTMGRP_IPV4_ROUTE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV4_1RULE(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV4_RULE)
    return RTMGRP_IPV4_RULE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV6_1IFADDR(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV6_IFADDR)
    return RTMGRP_IPV6_IFADDR;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV6_1IFINFO(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV6_IFINFO)
    return RTMGRP_IPV6_IFINFO;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV6_1MROUTE(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV6_MROUTE)
    return RTMGRP_IPV6_MROUTE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV6_1PREFIX(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV6_PREFIX)
    return RTMGRP_IPV6_PREFIX;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1IPV6_1ROUTE(JNIEnv* env, jclass) {
#if defined(RTMGRP_IPV6_ROUTE)
    return RTMGRP_IPV6_ROUTE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1LINK(JNIEnv* env, jclass) {
#if defined(RTMGRP_LINK)
    return RTMGRP_LINK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1NEIGH(JNIEnv* env, jclass) {
#if defined(RTMGRP_NEIGH)
    return RTMGRP_NEIGH;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1NOTIFY(JNIEnv* env, jclass) {
#if defined(RTMGRP_NOTIFY)
    return RTMGRP_NOTIFY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_RTMGRP_1TC(JNIEnv* env, jclass) {
#if defined(RTMGRP_TC)
    return RTMGRP_TC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SEEK_1CUR(JNIEnv* env, jclass) {
    return SEEK_CUR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SEEK_1END(JNIEnv* env, jclass) {
    return SEEK_END;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SEEK_1SET(JNIEnv* env, jclass) {
    return SEEK_SET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SHUT_1RD(JNIEnv* env, jclass) {
    return SHUT_RD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SHUT_1RDWR(JNIEnv* env, jclass) {
    return SHUT_RDWR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SHUT_1WR(JNIEnv* env, jclass) {
    return SHUT_WR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGABRT(JNIEnv* env, jclass) {
    return SIGABRT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGALRM(JNIEnv* env, jclass) {
    return SIGALRM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGBUS(JNIEnv* env, jclass) {
    return SIGBUS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGCHLD(JNIEnv* env, jclass) {
    return SIGCHLD;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGCONT(JNIEnv* env, jclass) {
    return SIGCONT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGFPE(JNIEnv* env, jclass) {
    return SIGFPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGHUP(JNIEnv* env, jclass) {
    return SIGHUP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGILL(JNIEnv* env, jclass) {
    return SIGILL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGINT(JNIEnv* env, jclass) {
    return SIGINT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGIO(JNIEnv* env, jclass) {
    return SIGIO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGKILL(JNIEnv* env, jclass) {
    return SIGKILL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGPIPE(JNIEnv* env, jclass) {
    return SIGPIPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGPROF(JNIEnv* env, jclass) {
    return SIGPROF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGPWR(JNIEnv* env, jclass) {
#if defined(SIGPWR)
    return SIGPWR;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGQUIT(JNIEnv* env, jclass) {
    return SIGQUIT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGRTMAX(JNIEnv* env, jclass) {
#if defined(SIGRTMAX)
    return SIGRTMAX;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGRTMIN(JNIEnv* env, jclass) {
#if defined(SIGRTMIN)
    return SIGRTMIN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGSEGV(JNIEnv* env, jclass) {
    return SIGSEGV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGSTKFLT(JNIEnv* env, jclass) {
#if defined(SIGSTKFLT)
    return SIGSTKFLT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGSTOP(JNIEnv* env, jclass) {
    return SIGSTOP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGSYS(JNIEnv* env, jclass) {
    return SIGSYS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGTERM(JNIEnv* env, jclass) {
    return SIGTERM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGTRAP(JNIEnv* env, jclass) {
    return SIGTRAP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGTSTP(JNIEnv* env, jclass) {
    return SIGTSTP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGTTIN(JNIEnv* env, jclass) {
    return SIGTTIN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGTTOU(JNIEnv* env, jclass) {
    return SIGTTOU;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGURG(JNIEnv* env, jclass) {
    return SIGURG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGUSR1(JNIEnv* env, jclass) {
    return SIGUSR1;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGUSR2(JNIEnv* env, jclass) {
    return SIGUSR2;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGVTALRM(JNIEnv* env, jclass) {
    return SIGVTALRM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGWINCH(JNIEnv* env, jclass) {
    return SIGWINCH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGXCPU(JNIEnv* env, jclass) {
    return SIGXCPU;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIGXFSZ(JNIEnv* env, jclass) {
    return SIGXFSZ;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIOCGIFADDR(JNIEnv* env, jclass) {
    return SIOCGIFADDR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIOCGIFBRDADDR(JNIEnv* env, jclass) {
    return SIOCGIFBRDADDR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIOCGIFDSTADDR(JNIEnv* env, jclass) {
    return SIOCGIFDSTADDR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SIOCGIFNETMASK(JNIEnv* env, jclass) {
    return SIOCGIFNETMASK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1CLOEXEC(JNIEnv* env, jclass) {
#if defined(SOCK_CLOEXEC)
    return SOCK_CLOEXEC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1DGRAM(JNIEnv* env, jclass) {
    return SOCK_DGRAM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1NONBLOCK(JNIEnv* env, jclass) {
#if defined(SOCK_NONBLOCK)
    return SOCK_NONBLOCK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1RAW(JNIEnv* env, jclass) {
    return SOCK_RAW;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1SEQPACKET(JNIEnv* env, jclass) {
    return SOCK_SEQPACKET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOCK_1STREAM(JNIEnv* env, jclass) {
    return SOCK_STREAM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOL_1SOCKET(JNIEnv* env, jclass) {
    return SOL_SOCKET;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SOL_1UDP(JNIEnv* env, jclass) {
#if defined(SOL_UDP)
    return SOL_UDP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1BINDTODEVICE(JNIEnv* env, jclass) {
#if defined(SO_BINDTODEVICE)
    return SO_BINDTODEVICE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1BROADCAST(JNIEnv* env, jclass) {
    return SO_BROADCAST;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1DEBUG(JNIEnv* env, jclass) {
    return SO_DEBUG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1DOMAIN(JNIEnv* env, jclass) {
#if defined(SO_DOMAIN)
    return SO_DOMAIN;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1DONTROUTE(JNIEnv* env, jclass) {
    return SO_DONTROUTE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1ERROR(JNIEnv* env, jclass) {
    return SO_ERROR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1KEEPALIVE(JNIEnv* env, jclass) {
    return SO_KEEPALIVE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1LINGER(JNIEnv* env, jclass) {
    return SO_LINGER;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1OOBINLINE(JNIEnv* env, jclass) {
    return SO_OOBINLINE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1PASSCRED(JNIEnv* env, jclass) {
#if defined(SO_PASSCRED)
    return SO_PASSCRED;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1PEERCRED(JNIEnv* env, jclass) {
#if defined(SO_PEERCRED)
    return SO_PEERCRED;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1PROTOCOL(JNIEnv* env, jclass) {
#if defined(SO_PROTOCOL)
    return SO_PROTOCOL;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1RCVBUF(JNIEnv* env, jclass) {
    return SO_RCVBUF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1RCVLOWAT(JNIEnv* env, jclass) {
    return SO_RCVLOWAT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1RCVTIMEO(JNIEnv* env, jclass) {
    return SO_RCVTIMEO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1REUSEADDR(JNIEnv* env, jclass) {
    return SO_REUSEADDR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1SNDBUF(JNIEnv* env, jclass) {
    return SO_SNDBUF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1SNDLOWAT(JNIEnv* env, jclass) {
    return SO_SNDLOWAT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1SNDTIMEO(JNIEnv* env, jclass) {
    return SO_SNDTIMEO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SO_1TYPE(JNIEnv* env, jclass) {
    return SO_TYPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SPLICE_1F_1MOVE(JNIEnv* env, jclass) {
#if defined(SPLICE_F_MOVE)
    return SPLICE_F_MOVE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SPLICE_1F_1NONBLOCK(JNIEnv* env, jclass) {
#if defined(SPLICE_F_NONBLOCK)
    return SPLICE_F_NONBLOCK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_SPLICE_1F_1MORE(JNIEnv* env, jclass) {
#if defined(SPLICE_F_MORE)
    return SPLICE_F_MORE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_STDERR_1FILENO(JNIEnv* env, jclass) {
    return STDERR_FILENO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_STDIN_1FILENO(JNIEnv* env, jclass) {
    return STDIN_FILENO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_STDOUT_1FILENO(JNIEnv* env, jclass) {
    return STDOUT_FILENO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1MANDLOCK(JNIEnv* env, jclass) {
#if defined(ST_MANDLOCK)
    return ST_MANDLOCK;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1NOATIME(JNIEnv* env, jclass) {
#if defined(ST_NOATIME)
    return ST_NOATIME;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1NODEV(JNIEnv* env, jclass) {
#if defined(ST_NODEV)
    return ST_NODEV;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1NODIRATIME(JNIEnv* env, jclass) {
#if defined(ST_NODIRATIME)
    return ST_NODIRATIME;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1NOEXEC(JNIEnv* env, jclass) {
#if defined(ST_NOEXEC)
    return ST_NOEXEC;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1NOSUID(JNIEnv* env, jclass) {
#if defined(ST_NOSUID)
    return ST_NOSUID;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1RDONLY(JNIEnv* env, jclass) {
#if defined(ST_RDONLY)
    return ST_RDONLY;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1RELATIME(JNIEnv* env, jclass) {
#if defined(ST_RELATIME)
    return ST_RELATIME;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_ST_1SYNCHRONOUS(JNIEnv* env, jclass) {
#if defined(ST_SYNCHRONOUS)
    return ST_SYNCHRONOUS;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFBLK(JNIEnv* env, jclass) {
    return S_IFBLK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFCHR(JNIEnv* env, jclass) {
    return S_IFCHR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFDIR(JNIEnv* env, jclass) {
    return S_IFDIR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFIFO(JNIEnv* env, jclass) {
    return S_IFIFO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFLNK(JNIEnv* env, jclass) {
    return S_IFLNK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFMT(JNIEnv* env, jclass) {
    return S_IFMT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFREG(JNIEnv* env, jclass) {
    return S_IFREG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IFSOCK(JNIEnv* env, jclass) {
    return S_IFSOCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IRGRP(JNIEnv* env, jclass) {
    return S_IRGRP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IROTH(JNIEnv* env, jclass) {
    return S_IROTH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IRUSR(JNIEnv* env, jclass) {
    return S_IRUSR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IRWXG(JNIEnv* env, jclass) {
    return S_IRWXG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IRWXO(JNIEnv* env, jclass) {
    return S_IRWXO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IRWXU(JNIEnv* env, jclass) {
    return S_IRWXU;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1ISGID(JNIEnv* env, jclass) {
    return S_ISGID;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1ISUID(JNIEnv* env, jclass) {
    return S_ISUID;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1ISVTX(JNIEnv* env, jclass) {
    return S_ISVTX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IWGRP(JNIEnv* env, jclass) {
    return S_IWGRP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IWOTH(JNIEnv* env, jclass) {
    return S_IWOTH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IWUSR(JNIEnv* env, jclass) {
    return S_IWUSR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IXGRP(JNIEnv* env, jclass) {
    return S_IXGRP;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IXOTH(JNIEnv* env, jclass) {
    return S_IXOTH;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_S_1IXUSR(JNIEnv* env, jclass) {
    return S_IXUSR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_TCP_1NODELAY(JNIEnv* env, jclass) {
    return TCP_NODELAY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_TCP_1USER_1TIMEOUT(JNIEnv* env, jclass) {
#if defined(TCP_USER_TIMEOUT)
    return TCP_USER_TIMEOUT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_TIOCOUTQ(JNIEnv* env, jclass) {
    return TIOCOUTQ;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_UDP_1ENCAP(JNIEnv* env, jclass) {
#if defined(UDP_ENCAP)
    return UDP_ENCAP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_UDP_1ENCAP_1ESPINUDP_1NON_1IKE(JNIEnv* env, jclass) {
#if defined(UDP_ENCAP_ESPINUDP_NON_IKE)
    return UDP_ENCAP_ESPINUDP_NON_IKE;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_UDP_1ENCAP_1ESPINUDP(JNIEnv* env, jclass) {
#if defined(UDP_ENCAP_ESPINUDP)
    return UDP_ENCAP_ESPINUDP;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_UDP_1GRO(JNIEnv* env, jclass) {
#if defined(UDP_GRO)
    return UDP_GRO;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_UDP_1SEGMENT(JNIEnv* env, jclass) {
#if defined(UDP_SEGMENT)
    return UDP_SEGMENT;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

// UNIX_PATH_MAX is mentioned in some versions of unix(7), but not actually declared.
extern "C" JNIEXPORT jint Java_android_system_OsConstants_UNIX_1PATH_1MAX(JNIEnv* env, jclass) {
    return sizeof(sockaddr_un::sun_path);
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WCONTINUED(JNIEnv* env, jclass) {
    return WCONTINUED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WEXITED(JNIEnv* env, jclass) {
    return WEXITED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WNOHANG(JNIEnv* env, jclass) {
    return WNOHANG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WNOWAIT(JNIEnv* env, jclass) {
    return WNOWAIT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WSTOPPED(JNIEnv* env, jclass) {
    return WSTOPPED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_WUNTRACED(JNIEnv* env, jclass) {
    return WUNTRACED;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_W_1OK(JNIEnv* env, jclass) {
    return W_OK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_XATTR_1CREATE(JNIEnv* env, jclass) {
    return XATTR_CREATE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_XATTR_1REPLACE(JNIEnv* env, jclass) {
    return XATTR_REPLACE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants_X_1OK(JNIEnv* env, jclass) {
    return X_OK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1CHAR_1TERM(JNIEnv* env, jclass) {
    return _SC_2_CHAR_TERM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1C_1BIND(JNIEnv* env, jclass) {
    return _SC_2_C_BIND;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1C_1DEV(JNIEnv* env, jclass) {
    return _SC_2_C_DEV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1C_1VERSION(JNIEnv* env, jclass) {
#if defined(_SC_2_C_VERSION)
    return _SC_2_C_VERSION;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1FORT_1DEV(JNIEnv* env, jclass) {
    return _SC_2_FORT_DEV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1FORT_1RUN(JNIEnv* env, jclass) {
    return _SC_2_FORT_RUN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1LOCALEDEF(JNIEnv* env, jclass) {
    return _SC_2_LOCALEDEF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1SW_1DEV(JNIEnv* env, jclass) {
    return _SC_2_SW_DEV;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1UPE(JNIEnv* env, jclass) {
    return _SC_2_UPE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_12_1VERSION(JNIEnv* env, jclass) {
    return _SC_2_VERSION;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1AIO_1LISTIO_1MAX(JNIEnv* env, jclass) {
    return _SC_AIO_LISTIO_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1AIO_1MAX(JNIEnv* env, jclass) {
    return _SC_AIO_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1AIO_1PRIO_1DELTA_1MAX(JNIEnv* env, jclass) {
    return _SC_AIO_PRIO_DELTA_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1ARG_1MAX(JNIEnv* env, jclass) {
    return _SC_ARG_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1ASYNCHRONOUS_1IO(JNIEnv* env, jclass) {
    return _SC_ASYNCHRONOUS_IO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1ATEXIT_1MAX(JNIEnv* env, jclass) {
    return _SC_ATEXIT_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1AVPHYS_1PAGES(JNIEnv* env, jclass) {
#if defined(_SC_AVPHYS_PAGES)
    return _SC_AVPHYS_PAGES;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1BC_1BASE_1MAX(JNIEnv* env, jclass) {
    return _SC_BC_BASE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1BC_1DIM_1MAX(JNIEnv* env, jclass) {
    return _SC_BC_DIM_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1BC_1SCALE_1MAX(JNIEnv* env, jclass) {
    return _SC_BC_SCALE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1BC_1STRING_1MAX(JNIEnv* env, jclass) {
    return _SC_BC_STRING_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1CHILD_1MAX(JNIEnv* env, jclass) {
    return _SC_CHILD_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1CLK_1TCK(JNIEnv* env, jclass) {
    return _SC_CLK_TCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1COLL_1WEIGHTS_1MAX(JNIEnv* env, jclass) {
    return _SC_COLL_WEIGHTS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1DELAYTIMER_1MAX(JNIEnv* env, jclass) {
    return _SC_DELAYTIMER_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1EXPR_1NEST_1MAX(JNIEnv* env, jclass) {
    return _SC_EXPR_NEST_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1FSYNC(JNIEnv* env, jclass) {
    return _SC_FSYNC;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1GETGR_1R_1SIZE_1MAX(JNIEnv* env, jclass) {
    return _SC_GETGR_R_SIZE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1GETPW_1R_1SIZE_1MAX(JNIEnv* env, jclass) {
    return _SC_GETPW_R_SIZE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1IOV_1MAX(JNIEnv* env, jclass) {
    return _SC_IOV_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1JOB_1CONTROL(JNIEnv* env, jclass) {
    return _SC_JOB_CONTROL;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1LINE_1MAX(JNIEnv* env, jclass) {
    return _SC_LINE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1LOGIN_1NAME_1MAX(JNIEnv* env, jclass) {
    return _SC_LOGIN_NAME_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MAPPED_1FILES(JNIEnv* env, jclass) {
    return _SC_MAPPED_FILES;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MEMLOCK(JNIEnv* env, jclass) {
    return _SC_MEMLOCK;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MEMLOCK_1RANGE(JNIEnv* env, jclass) {
    return _SC_MEMLOCK_RANGE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MEMORY_1PROTECTION(JNIEnv* env, jclass) {
    return _SC_MEMORY_PROTECTION;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MESSAGE_1PASSING(JNIEnv* env, jclass) {
    return _SC_MESSAGE_PASSING;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MQ_1OPEN_1MAX(JNIEnv* env, jclass) {
    return _SC_MQ_OPEN_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1MQ_1PRIO_1MAX(JNIEnv* env, jclass) {
    return _SC_MQ_PRIO_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1NGROUPS_1MAX(JNIEnv* env, jclass) {
    return _SC_NGROUPS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1NPROCESSORS_1CONF(JNIEnv* env, jclass) {
    return _SC_NPROCESSORS_CONF;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1NPROCESSORS_1ONLN(JNIEnv* env, jclass) {
    return _SC_NPROCESSORS_ONLN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1OPEN_1MAX(JNIEnv* env, jclass) {
    return _SC_OPEN_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PAGESIZE(JNIEnv* env, jclass) {
    return _SC_PAGESIZE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PAGE_1SIZE(JNIEnv* env, jclass) {
    return _SC_PAGE_SIZE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PASS_1MAX(JNIEnv* env, jclass) {
    return _SC_PASS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PHYS_1PAGES(JNIEnv* env, jclass) {
#if defined(_SC_PHYS_PAGES)
    return _SC_PHYS_PAGES;
#else
    return ThrowUnsupportedOperation(env);
#endif
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PRIORITIZED_1IO(JNIEnv* env, jclass) {
    return _SC_PRIORITIZED_IO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1PRIORITY_1SCHEDULING(JNIEnv* env, jclass) {
    return _SC_PRIORITY_SCHEDULING;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1REALTIME_1SIGNALS(JNIEnv* env, jclass) {
    return _SC_REALTIME_SIGNALS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1RE_1DUP_1MAX(JNIEnv* env, jclass) {
    return _SC_RE_DUP_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1RTSIG_1MAX(JNIEnv* env, jclass) {
    return _SC_RTSIG_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SAVED_1IDS(JNIEnv* env, jclass) {
    return _SC_SAVED_IDS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SEMAPHORES(JNIEnv* env, jclass) {
    return _SC_SEMAPHORES;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SEM_1NSEMS_1MAX(JNIEnv* env, jclass) {
    return _SC_SEM_NSEMS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SEM_1VALUE_1MAX(JNIEnv* env, jclass) {
    return _SC_SEM_VALUE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SHARED_1MEMORY_1OBJECTS(JNIEnv* env, jclass) {
    return _SC_SHARED_MEMORY_OBJECTS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SIGQUEUE_1MAX(JNIEnv* env, jclass) {
    return _SC_SIGQUEUE_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1STREAM_1MAX(JNIEnv* env, jclass) {
    return _SC_STREAM_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1SYNCHRONIZED_1IO(JNIEnv* env, jclass) {
    return _SC_SYNCHRONIZED_IO;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREADS(JNIEnv* env, jclass) {
    return _SC_THREADS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1ATTR_1STACKADDR(JNIEnv* env, jclass) {
    return _SC_THREAD_ATTR_STACKADDR;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1ATTR_1STACKSIZE(JNIEnv* env, jclass) {
    return _SC_THREAD_ATTR_STACKSIZE;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1DESTRUCTOR_1ITERATIONS(JNIEnv* env, jclass) {
    return _SC_THREAD_DESTRUCTOR_ITERATIONS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1KEYS_1MAX(JNIEnv* env, jclass) {
    return _SC_THREAD_KEYS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1PRIORITY_1SCHEDULING(JNIEnv* env, jclass) {
    return _SC_THREAD_PRIORITY_SCHEDULING;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1PRIO_1INHERIT(JNIEnv* env, jclass) {
    return _SC_THREAD_PRIO_INHERIT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1PRIO_1PROTECT(JNIEnv* env, jclass) {
    return _SC_THREAD_PRIO_PROTECT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1SAFE_1FUNCTIONS(JNIEnv* env, jclass) {
    return _SC_THREAD_SAFE_FUNCTIONS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1STACK_1MIN(JNIEnv* env, jclass) {
    return _SC_THREAD_STACK_MIN;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1THREAD_1THREADS_1MAX(JNIEnv* env, jclass) {
    return _SC_THREAD_THREADS_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1TIMERS(JNIEnv* env, jclass) {
    return _SC_TIMERS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1TIMER_1MAX(JNIEnv* env, jclass) {
    return _SC_TIMER_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1TTY_1NAME_1MAX(JNIEnv* env, jclass) {
    return _SC_TTY_NAME_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1TZNAME_1MAX(JNIEnv* env, jclass) {
    return _SC_TZNAME_MAX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1VERSION(JNIEnv* env, jclass) {
    return _SC_VERSION;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XBS5_1ILP32_1OFF32(JNIEnv* env, jclass) {
    return _SC_XBS5_ILP32_OFF32;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XBS5_1ILP32_1OFFBIG(JNIEnv* env, jclass) {
    return _SC_XBS5_ILP32_OFFBIG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XBS5_1LP64_1OFF64(JNIEnv* env, jclass) {
    return _SC_XBS5_LP64_OFF64;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XBS5_1LPBIG_1OFFBIG(JNIEnv* env, jclass) {
    return _SC_XBS5_LPBIG_OFFBIG;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1CRYPT(JNIEnv* env, jclass) {
    return _SC_XOPEN_CRYPT;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1ENH_1I18N(JNIEnv* env, jclass) {
    return _SC_XOPEN_ENH_I18N;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1LEGACY(JNIEnv* env, jclass) {
    return _SC_XOPEN_LEGACY;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1REALTIME(JNIEnv* env, jclass) {
    return _SC_XOPEN_REALTIME;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1REALTIME_1THREADS(JNIEnv* env, jclass) {
    return _SC_XOPEN_REALTIME_THREADS;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1SHM(JNIEnv* env, jclass) {
    return _SC_XOPEN_SHM;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1UNIX(JNIEnv* env, jclass) {
    return _SC_XOPEN_UNIX;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1VERSION(JNIEnv* env, jclass) {
    return _SC_XOPEN_VERSION;
}

extern "C" JNIEXPORT jint Java_android_system_OsConstants__1SC_1XOPEN_1XCU_1VERSION(JNIEnv* env, jclass) {
    return _SC_XOPEN_XCU_VERSION;
}

extern "C" JNIEXPORT jstring Java_android_system_OsConstants_gaiName(JNIEnv* env, jclass, jint error) {
    switch(error) {
        case EAI_AGAIN: return env->NewStringUTF("EAI_AGAIN");
        case EAI_BADFLAGS: return env->NewStringUTF("EAI_BADFLAGS");
        case EAI_FAIL: return env->NewStringUTF("EAI_FAIL");
        case EAI_FAMILY: return env->NewStringUTF("EAI_FAMILY");
        case EAI_MEMORY: return env->NewStringUTF("EAI_MEMORY");
        case EAI_NODATA: return env->NewStringUTF("EAI_NODATA");
        case EAI_NONAME: return env->NewStringUTF("EAI_NONAME");
        case EAI_OVERFLOW: return env->NewStringUTF("EAI_OVERFLOW");
        case EAI_SERVICE: return env->NewStringUTF("EAI_SERVICE");
        case EAI_SOCKTYPE: return env->NewStringUTF("EAI_SOCKTYPE");
        case EAI_SYSTEM: return env->NewStringUTF("EAI_SYSTEM");
    }
    return nullptr;
}

extern "C" JNIEXPORT jstring Java_android_system_OsConstants_errnoName(JNIEnv* env, jclass, jint error) {
    switch(error) {
        case E2BIG: return env->NewStringUTF("E2BIG");
        case EACCES: return env->NewStringUTF("EACCES");
        case EADDRINUSE: return env->NewStringUTF("EADDRINUSE");
        case EADDRNOTAVAIL: return env->NewStringUTF("EADDRNOTAVAIL");
        case EAFNOSUPPORT: return env->NewStringUTF("EAFNOSUPPORT");
        case EAGAIN: return env->NewStringUTF("EAGAIN");
        case EALREADY: return env->NewStringUTF("EALREADY");
        case EBADF: return env->NewStringUTF("EBADF");
        case EBADMSG: return env->NewStringUTF("EBADMSG");
        case EBUSY: return env->NewStringUTF("EBUSY");
        case ECANCELED: return env->NewStringUTF("ECANCELED");
        case ECHILD: return env->NewStringUTF("ECHILD");
        case ECONNABORTED: return env->NewStringUTF("ECONNABORTED");
        case ECONNREFUSED: return env->NewStringUTF("ECONNREFUSED");
        case ECONNRESET: return env->NewStringUTF("ECONNRESET");
        case EDEADLK: return env->NewStringUTF("EDEADLK");
        case EDESTADDRREQ: return env->NewStringUTF("EDESTADDRREQ");
        case EDOM: return env->NewStringUTF("EDOM");
        case EDQUOT: return env->NewStringUTF("EDQUOT");
        case EEXIST: return env->NewStringUTF("EEXIST");
        case EFAULT: return env->NewStringUTF("EFAULT");
        case EFBIG: return env->NewStringUTF("EFBIG");
        case EHOSTUNREACH: return env->NewStringUTF("EHOSTUNREACH");
        case EIDRM: return env->NewStringUTF("EIDRM");
        case EILSEQ: return env->NewStringUTF("EILSEQ");
        case EINPROGRESS: return env->NewStringUTF("EINPROGRESS");
        case EINTR: return env->NewStringUTF("EINTR");
        case EINVAL: return env->NewStringUTF("EINVAL");
        case EIO: return env->NewStringUTF("EIO");
        case EISCONN: return env->NewStringUTF("EISCONN");
        case EISDIR: return env->NewStringUTF("EISDIR");
        case ELOOP: return env->NewStringUTF("ELOOP");
        case EMFILE: return env->NewStringUTF("EMFILE");
        case EMLINK: return env->NewStringUTF("EMLINK");
        case EMSGSIZE: return env->NewStringUTF("EMSGSIZE");
        case EMULTIHOP: return env->NewStringUTF("EMULTIHOP");
        case ENAMETOOLONG: return env->NewStringUTF("ENAMETOOLONG");
        case ENETDOWN: return env->NewStringUTF("ENETDOWN");
        case ENETRESET: return env->NewStringUTF("ENETRESET");
        case ENETUNREACH: return env->NewStringUTF("ENETUNREACH");
        case ENFILE: return env->NewStringUTF("ENFILE");
        case ENOBUFS: return env->NewStringUTF("ENOBUFS");
        case ENODATA: return env->NewStringUTF("ENODATA");
        case ENODEV: return env->NewStringUTF("ENODEV");
        case ENOENT: return env->NewStringUTF("ENOENT");
        case ENOEXEC: return env->NewStringUTF("ENOEXEC");
        case ENOLCK: return env->NewStringUTF("ENOLCK");
        case ENOLINK: return env->NewStringUTF("ENOLINK");
        case ENOMEM: return env->NewStringUTF("ENOMEM");
        case ENOMSG: return env->NewStringUTF("ENOMSG");
#if defined(ENONET)
        case ENONET: return env->NewStringUTF("ENONET");
#endif
        case ENOPROTOOPT: return env->NewStringUTF("ENOPROTOOPT");
        case ENOSPC: return env->NewStringUTF("ENOSPC");
        case ENOSR: return env->NewStringUTF("ENOSR");
        case ENOSTR: return env->NewStringUTF("ENOSTR");
        case ENOSYS: return env->NewStringUTF("ENOSYS");
        case ENOTCONN: return env->NewStringUTF("ENOTCONN");
        case ENOTDIR: return env->NewStringUTF("ENOTDIR");
        case ENOTEMPTY: return env->NewStringUTF("ENOTEMPTY");
        case ENOTSOCK: return env->NewStringUTF("ENOTSOCK");
        case ENOTSUP: return env->NewStringUTF("ENOTSUP");
        case ENOTTY: return env->NewStringUTF("ENOTTY");
        case ENXIO: return env->NewStringUTF("ENXIO");
        case EOPNOTSUPP: return env->NewStringUTF("EOPNOTSUPP");
        case EOVERFLOW: return env->NewStringUTF("EOVERFLOW");
        case EPERM: return env->NewStringUTF("EPERM");
        case EPIPE: return env->NewStringUTF("EPIPE");
        case EPROTO: return env->NewStringUTF("EPROTO");
        case EPROTONOSUPPORT: return env->NewStringUTF("EPROTONOSUPPORT");
        case EPROTOTYPE: return env->NewStringUTF("EPROTOTYPE");
        case ERANGE: return env->NewStringUTF("ERANGE");
        case EROFS: return env->NewStringUTF("EROFS");
        case ESPIPE: return env->NewStringUTF("ESPIPE");
        case ESRCH: return env->NewStringUTF("ESRCH");
        case ESTALE: return env->NewStringUTF("ESTALE");
        case ETIME: return env->NewStringUTF("ETIME");
        case ETIMEDOUT: return env->NewStringUTF("ETIMEDOUT");
        case ETXTBSY: return env->NewStringUTF("ETXTBSY");
        case EXDEV: return env->NewStringUTF("EXDEV");
    }
    return nullptr;
}
