/*
 * Copyright (C) 2010 The Android Open Source Project
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

#define LOG_TAG "NetworkUtilities"

#include "NetworkUtilities.h"

#include <arpa/inet.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/un.h>

#include <nativehelper/JNIHelp.h>
#include <nativehelper/ScopedLocalRef.h>

#include "JniConstants.h"

#include <log/log.h>


jobject sockaddrToInetAddress(JNIEnv* env, const sockaddr_storage& ss, jint* port) {
    // Convert IPv4-mapped IPv6 addresses to IPv4 addresses.
    // The RI states "Java will never return an IPv4-mapped address".
    const sockaddr_in6& sin6 = reinterpret_cast<const sockaddr_in6&>(ss);
    if (ss.ss_family == AF_INET6 && IN6_IS_ADDR_V4MAPPED(&sin6.sin6_addr)) {
        // Copy the IPv6 address into the temporary sockaddr_storage.
        sockaddr_storage tmp;
        memset(&tmp, 0, sizeof(tmp));
        memcpy(&tmp, &ss, sizeof(sockaddr_in6));
        // Unmap it into an IPv4 address.
        sockaddr_in& sin = reinterpret_cast<sockaddr_in&>(tmp);
        sin.sin_family = AF_INET;
        sin.sin_port = sin6.sin6_port;
        memcpy(&sin.sin_addr.s_addr, &sin6.sin6_addr.s6_addr[12], 4);
        // Do the regular conversion using the unmapped address.
        return sockaddrToInetAddress(env, tmp, port);
    }

    const void* rawAddress;
    size_t addressLength;
    int sin_port = 0;
    int scope_id = 0;
    if (ss.ss_family == AF_INET) {
        const sockaddr_in& sin = reinterpret_cast<const sockaddr_in&>(ss);
        rawAddress = &sin.sin_addr.s_addr;
        addressLength = 4;
        sin_port = ntohs(sin.sin_port);
    } else if (ss.ss_family == AF_INET6) {
        const sockaddr_in6& sin6 = reinterpret_cast<const sockaddr_in6&>(ss);
        rawAddress = &sin6.sin6_addr.s6_addr;
        addressLength = 16;
        sin_port = ntohs(sin6.sin6_port);
        scope_id = sin6.sin6_scope_id;
    } else {
        // We can't throw SocketException. We aren't meant to see bad addresses, so seeing one
        // really does imply an internal error.
        jniThrowExceptionFmt(env, "java/lang/IllegalArgumentException",
                             "sockaddrToInetAddress unsupported ss_family: %i", ss.ss_family);
        return NULL;
    }
    if (port != NULL) {
        *port = sin_port;
    }

    ScopedLocalRef<jbyteArray> byteArray(env, env->NewByteArray(addressLength));
    if (byteArray.get() == NULL) {
        return NULL;
    }
    env->SetByteArrayRegion(byteArray.get(), 0, addressLength,
            reinterpret_cast<const jbyte*>(rawAddress));

    static jmethodID getByAddressMethod = env->GetStaticMethodID(JniConstants::GetInetAddressClass(env),
            "getByAddress", "(Ljava/lang/String;[BI)Ljava/net/InetAddress;");
    if (getByAddressMethod == NULL) {
        return NULL;
    }
    return env->CallStaticObjectMethod(JniConstants::GetInetAddressClass(env), getByAddressMethod,
            NULL, byteArray.get(), scope_id);
}

static bool inetAddressToSockaddr(JNIEnv* env, jobject inetAddress, int port, sockaddr_storage& ss, socklen_t& sa_len, bool map) {
    memset(&ss, 0, sizeof(ss));
    sa_len = 0;

    if (inetAddress == NULL) {
        jniThrowNullPointerException(env, NULL);
        return false;
    }

    // Get holder.
    static jfieldID holderFid = env->GetFieldID(JniConstants::GetInetAddressClass(env), "holder", "Ljava/net/InetAddress$InetAddressHolder;");
    if (holderFid == NULL) {
        return false;
    }
    ScopedLocalRef<jobject> holder(env, env->GetObjectField(inetAddress, holderFid));
    // Get the address family.
    static jfieldID familyFid = env->GetFieldID(JniConstants::GetInetAddressHolderClass(env), "family", "I");
    if (familyFid == NULL) {
        return false;
    }
    ss.ss_family = env->GetIntField(holder.get(), familyFid);
    if (ss.ss_family == AF_UNSPEC) {
        sa_len = sizeof(ss.ss_family);
        return true; // Job done!
    }

    // Check this is an address family we support.
    if (ss.ss_family != AF_INET && ss.ss_family != AF_INET6) {
        jniThrowExceptionFmt(env, "java/lang/IllegalArgumentException",
                "inetAddressToSockaddr bad family: %i", ss.ss_family);
        return false;
    }

    // Get the byte array that stores the IP address bytes in the InetAddress.
    static jmethodID bytesMid = env->GetMethodID(JniConstants::GetInetAddressClass(env), "getAddress", "()[B");
    if (bytesMid == NULL) {
        return false;
    }
    ScopedLocalRef<jbyteArray> addressBytes(env, reinterpret_cast<jbyteArray>(env->CallObjectMethod(inetAddress, bytesMid)));
    if (env->ExceptionCheck()) {
        return false;
    }
    if (addressBytes.get() == NULL) {
        jniThrowNullPointerException(env, NULL);
        return false;
    }

    // TODO: bionic's getnameinfo(3) seems to want its length parameter to be exactly
    // sizeof(sockaddr_in) for an IPv4 address and sizeof (sockaddr_in6) for an
    // IPv6 address. Fix getnameinfo so it accepts sizeof(sockaddr_storage), and
    // then unconditionally set sa_len to sizeof(sockaddr_storage) instead of having
    // to deal with this case by case.

    // We use AF_INET6 sockets, so we want an IPv6 address (which may be a IPv4-mapped address).
    sockaddr_in6& sin6 = reinterpret_cast<sockaddr_in6&>(ss);
    sin6.sin6_port = htons(port);
    if (ss.ss_family == AF_INET6) {
        // IPv6 address. Copy the bytes...
        jbyte* dst = reinterpret_cast<jbyte*>(&sin6.sin6_addr.s6_addr);
        env->GetByteArrayRegion(addressBytes.get(), 0, 16, dst);
        // ...and set the scope id...
        static jfieldID holder6Fid = env->GetFieldID(JniConstants::GetInet6AddressClass(env),
                                                     "holder6",
                                                     "Ljava/net/Inet6Address$Inet6AddressHolder;");
        if (holder6Fid == NULL) {
            return false;
        }
        ScopedLocalRef<jobject> holder6(env, env->GetObjectField(inetAddress, holder6Fid));
        static jfieldID scopeFid = env->GetFieldID(JniConstants::GetInet6AddressHolderClass(env),
                                                   "scope_id",
                                                   "I");
        sin6.sin6_scope_id = env->GetIntField(holder6.get(), scopeFid);
        sa_len = sizeof(sockaddr_in6);
        return true;
    }

    // Deal with Inet4Address instances.
    if (map) {
        // We should represent this Inet4Address as an IPv4-mapped IPv6 sockaddr_in6.
        // Change the family...
        sin6.sin6_family = AF_INET6;
        // Copy the bytes...
        jbyte* dst = reinterpret_cast<jbyte*>(&sin6.sin6_addr.s6_addr[12]);
        env->GetByteArrayRegion(addressBytes.get(), 0, 4, dst);
        // INADDR_ANY and in6addr_any are both all-zeros...
        if (!IN6_IS_ADDR_UNSPECIFIED(&sin6.sin6_addr)) {
            // ...but all other IPv4-mapped addresses are ::ffff:a.b.c.d, so insert the ffff...
            memset(&(sin6.sin6_addr.s6_addr[10]), 0xff, 2);
        }
        sa_len = sizeof(sockaddr_in6);
    } else {
        // We should represent this Inet4Address as an IPv4 sockaddr_in.
        sockaddr_in& sin = reinterpret_cast<sockaddr_in&>(ss);
        sin.sin_port = htons(port);
        jbyte* dst = reinterpret_cast<jbyte*>(&sin.sin_addr.s_addr);
        env->GetByteArrayRegion(addressBytes.get(), 0, 4, dst);
        sa_len = sizeof(sockaddr_in);
    }
    return true;
}

bool inetAddressToSockaddrVerbatim(JNIEnv* env, jobject inetAddress, int port, sockaddr_storage& ss, socklen_t& sa_len) {
    return inetAddressToSockaddr(env, inetAddress, port, ss, sa_len, false);
}

bool inetAddressToSockaddr(JNIEnv* env, jobject inetAddress, int port, sockaddr_storage& ss, socklen_t& sa_len) {
    return inetAddressToSockaddr(env, inetAddress, port, ss, sa_len, true);
}

/*
 * Fill msg_contrl data from structCmsghdr[]
 */
bool structCmsghdrArrayToMsgcontrol(JNIEnv* env, jobjectArray cmsgArray, struct msghdr& mhdr) {
    struct cmsghdr *cm = NULL;
    int i = 0;
    jclass structCmsghdrClass = JniConstants::GetStructCmsghdrClass(env);
    static jfieldID cmsgDataFid = env->GetFieldID(structCmsghdrClass, "cmsg_data", "[B");
    if (!cmsgDataFid) {
        return false;
    }
    static jfieldID cmsgLevelFid = env->GetFieldID(structCmsghdrClass, "cmsg_level", "I");
    if (!cmsgLevelFid) {
        return false;
    }
    static jfieldID cmsgTypeFid = env->GetFieldID(structCmsghdrClass, "cmsg_type", "I");
    if (!cmsgTypeFid) {
        return false;
    }

    int cmsgArrayize = env->GetArrayLength(cmsgArray);
    if (!cmsgArrayize) {
        // Return true since msg_control is optional parameter.
        return true;
    }

    for (int i = 0; i < cmsgArrayize; ++i) {
        ScopedLocalRef<jobject> cmsg(env, env->GetObjectArrayElement(cmsgArray, i));
        ScopedLocalRef<jbyteArray> cmsgData(env, reinterpret_cast<jbyteArray>(
                env->GetObjectField(cmsg.get(), cmsgDataFid)));

        mhdr.msg_controllen += CMSG_SPACE(env->GetArrayLength(cmsgData.get()));
    }

    mhdr.msg_control = (unsigned char*)malloc(mhdr.msg_controllen);
    if (mhdr.msg_control == NULL) {
        jniThrowException(env, "java/lang/OutOfMemoryError", "Out of memory");
        return false;
    }
    memset(mhdr.msg_control, 0, mhdr.msg_controllen);

    // Loop over each cmsghdr header and set data.
    for (cm = CMSG_FIRSTHDR(&mhdr), i = 0; (cm != NULL); cm = CMSG_NXTHDR(&mhdr, cm), ++i)
    {
        size_t data_len = 0;
        ScopedLocalRef<jobject> cmsg(env, env->GetObjectArrayElement(cmsgArray, i));
        ScopedLocalRef<jbyteArray> cmsgData(env, reinterpret_cast<jbyteArray>(
                env->GetObjectField(cmsg.get(), cmsgDataFid)));

        cm->cmsg_level = env->GetIntField(cmsg.get(), cmsgLevelFid);
        cm->cmsg_type  = env->GetIntField(cmsg.get(), cmsgTypeFid);
        data_len = env->GetArrayLength(cmsgData.get());
        cm->cmsg_len   = CMSG_LEN(data_len);
        env->GetByteArrayRegion(cmsgData.get(), 0,
                data_len, reinterpret_cast<jbyte*>CMSG_DATA(cm));
    }
    return true;
}

/*
 * Fill structCmsghdr[] data per msgcontrol data, used when recvmsg
 */
bool msgcontrolToStructCmsghdrArray(JNIEnv* env, jobject structMsghdr, struct msghdr& mhdr) {
    struct cmsghdr *cm = NULL;
    int i = 0;

    static jfieldID msgControlFid = env->GetFieldID(JniConstants::GetStructMsghdrClass(env),
                                                 "msg_control", "[Landroid/system/StructCmsghdr;");
    if (!msgControlFid) {
        return false;
    }

    static jmethodID cmsgInitMid = env->GetMethodID(JniConstants::GetStructCmsghdrClass(env),
                                                    "<init>", "(II[B)V");
    if (!cmsgInitMid) {
        return false;
    }

    int cmsghdrNumber = 0;
    for (cm = CMSG_FIRSTHDR(&mhdr); (cm != NULL); cm = CMSG_NXTHDR(&mhdr, cm)) {
        cmsghdrNumber++;
    }
    if (!cmsghdrNumber)
        return true;

    jobjectArray structCmsghdrArray = env->NewObjectArray(cmsghdrNumber,
                                          JniConstants::GetStructCmsghdrClass(env), NULL);
    if (!structCmsghdrArray) {
        return false;
    }

    // Loop over each cmsghdr header and set data.
    for (cm = CMSG_FIRSTHDR(&mhdr),i=0; (cm!=NULL); cm = CMSG_NXTHDR(&mhdr, cm),i++) {
        // copy out cmsg_data
        ScopedLocalRef<jbyteArray> msgData(env,
            env->NewByteArray(cm->cmsg_len - sizeof(struct cmsghdr)));
        env->SetByteArrayRegion(msgData.get(),
                                0,
                                env->GetArrayLength(msgData.get()),
                                reinterpret_cast<jbyte*>CMSG_DATA(cm));

        ScopedLocalRef<jobject> objItem(env, env->NewObject(
                JniConstants::GetStructCmsghdrClass(env),
                cmsgInitMid, cm->cmsg_level, cm->cmsg_type, msgData.get()));

        env->SetObjectArrayElement(structCmsghdrArray, i, objItem.get());
    }

    env->SetObjectField(structMsghdr, msgControlFid, structCmsghdrArray);

    return true;
}

/*
 * generate ScopedBytes object per ByteBuffer.isDirect
 * if ByteBuffer.isDirect, generate ScopedBytes object by ByteBuffer itself;
 * else,  generate ScopedBytes object by ByteBuffer.array;
 *
 * Input:  ByteBuffer object, isRW(R only or RW)
 * Output: byte_len, length of the byte data per ByteBuffer.remaining;
 * return value: pointer of new ScopedBytesRW or ScopedBytesRO
 */
static void* getScopedBytesFromByteBuffer(JNIEnv* env,
                                          jobject byteBuffer, int& byteLen, bool isRW) {

    jclass byteBufferClass = JniConstants::GetByteBufferClass(env);
    static jmethodID isDirectMid = env->GetMethodID(byteBufferClass, "isDirect", "()Z");
    static jmethodID remainingMid = env->GetMethodID(byteBufferClass, "remaining", "()I");
    static jmethodID arrayMid = env->GetMethodID(byteBufferClass, "array", "()[B");

    if (!isDirectMid || !remainingMid || !arrayMid) {
        return NULL;
    }

    byteLen = env->CallIntMethod(byteBuffer, remainingMid);
    bool isDirect = env->CallBooleanMethod(byteBuffer, isDirectMid);
    jobject objBuff;
    if (isDirect == true) {
        objBuff = env->NewLocalRef(byteBuffer); // Add LocalRef to align with CallObjectMethod
    } else {
        // return array
        objBuff = env->CallObjectMethod(byteBuffer, arrayMid);
    }

    if (isRW) {
        return (void*)(new ScopedBytesRW(env, objBuff));
    } else {
        return (void*)(new ScopedBytesRO(env, objBuff));
    }

}

/*
 *  Convert ByteBuffer[] to mhdr.msg_iov/msg_iovlen
 */
bool byteBufferArrayToIOV(JNIEnv* env, jobjectArray msgiovArray, struct msghdr& mhdr,
                         ScopedByteBufferArray& scopeBufArray) {
    int msgIovArraySize = env->GetArrayLength(msgiovArray);
    if (!msgIovArraySize) {
        /* would not happen since msg_iov is marked as NonNull */
        mhdr.msg_iov = NULL;
        mhdr.msg_iovlen = 0;
    }

    struct iovec* iovarr = (struct iovec*)malloc(sizeof(iovec)*msgIovArraySize);
    if (!iovarr) {
        jniThrowException(env, "java/lang/OutOfMemoryError", "Out of memory");
        return false;
    }

    if (scopeBufArray.initArray(msgIovArraySize) == false) {
        jniThrowException(env, "java/lang/OutOfMemoryError", "Out of memory");
        return false;
    }

    // Set memory of each msg_iov item by the original bytes address.
    for (int i=0; i<msgIovArraySize; i++)
    {
        jobject msgiovItem = env->GetObjectArrayElement(msgiovArray, i);
        int byteLen = 0;
        void* ptr = getScopedBytesFromByteBuffer(env, msgiovItem, byteLen, scopeBufArray.isRW());
        if (!ptr) {
            jniThrowException(env, "java/lang/OutOfMemoryError", "Out of memory");
            return false;
        }

        scopeBufArray.setArrayItem(i, ptr);

        if (scopeBufArray.isRW()) {
            iovarr[i].iov_base = (unsigned char*)(((ScopedBytesRW*)ptr)->get());
        }
        else {
            iovarr[i].iov_base = (unsigned char*)(((ScopedBytesRO*)ptr)->get());
        }

        iovarr[i].iov_len  = byteLen;
    }

    mhdr.msg_iov = iovarr;
    mhdr.msg_iovlen = msgIovArraySize;

    return true;
}

/*
 * Function: convertStructMsghdrAndmsghdr
 * Description: convert between Java#StructMsghdr and C#msghdr for sendmsg/recvmsg
 *
 * Function Parameters:
 *   StructMsghdr, input, StructMsghdr
 *                 for sendmsg,
 *                   StructMsghdr.msg_name       input(mandatory),
 *                   StructMsghdr.msg_iov        iput(mandatory)
 *                   StructMsghdr.msg_control    input(optional)
 *                   StructMsghdr.msg_flags      input(mandatory)
 *                 for recvmsg,
 *                   StructMsghdr.msg_name       input/output(optional),
 *                   StructMsghdr.msg_iov        input/output(mandatory)
 *                   StructMsghdr.msg_control    input/output(optional)
 *                   StructMsghdr.msg_flags      input
 *   mhdr, input, struct msghdr
 *   scopeBufArray, output, store buffer array of ScopedBytesRW or ScopedBytesRO
 *   isFromStructCMsghdrTomsghdr, input,  indicate StructMsghdr->msghdr or msghdr->StructMsghdr
 *
 * then in sendmsg scenario, call sequence will be:
 *             1. convert(StructMsg->msghdr)
 *             2. sendmsg
 *      in recvmsg scenario, call sequence will be:
 *             1. convert(StructMsg->msghdr)
 *             2. recvmsg
 *             3. convert again(msghdr->StructMsg)
 */
bool convertStructMsghdrAndmsghdr(JNIEnv* env, jobject structMsghdr, struct msghdr& mhdr,
                                  ScopedByteBufferArray& scopeBufArray,
                                  bool isFromStructCMsghdrTomsghdr) {
    if (!structMsghdr) {
        jniThrowNullPointerException(env, "missing structMsghdr");
        return false;
    }

    jclass StructMsghdrClass = JniConstants::GetStructMsghdrClass(env);

    // Get fieldID of each item in StructMsghdr.
    static jfieldID msgIovFid = env->GetFieldID(StructMsghdrClass,
                                                 "msg_iov",
                                                 "[Ljava/nio/ByteBuffer;");
    if (!msgIovFid) {
        return false;
    }
    static jfieldID msgControlFid = env->GetFieldID(StructMsghdrClass,
                                                    "msg_control",
                                                    "[Landroid/system/StructCmsghdr;");
    if (!msgControlFid) {
        return false;
    }
    static jfieldID msgFlagsFid = env->GetFieldID(StructMsghdrClass,
                                                  "msg_flags",
                                                  "I");
    if (!msgFlagsFid) {
        return false;
    }

    if (isFromStructCMsghdrTomsghdr) {
        // Pick StructMsghdr.msg_iov[].
        jobjectArray msgIovArray = reinterpret_cast<jobjectArray>(
                                        env->GetObjectField(structMsghdr, msgIovFid));
        if (!msgIovArray) {
            jniThrowNullPointerException(env, "null StructMsghdr.msg_iov");
            return false;
        }
        // In case sendmsg, IOV buffer are RO to send data,
        // in case recvmsg, IOV buffer are RW to store received data.
        if (byteBufferArrayToIOV(env, msgIovArray, mhdr, scopeBufArray) == false) {
            return false;
        }

        if (!scopeBufArray.isRW()) {
            jobjectArray structCmsghdrObjArray = reinterpret_cast<jobjectArray>(
                                               env->GetObjectField(structMsghdr, msgControlFid));
            if (structCmsghdrObjArray != NULL) {
                // convert StrucCmsg[] <-> msghdr.msgcontrl
                if (structCmsghdrArrayToMsgcontrol(env, structCmsghdrObjArray, mhdr) == false) {
                    return false;
                }
            }
        } else {
            // hardcode 512 for recvmsg/msg_controllen, it should be enough for recvmsg
            mhdr.msg_controllen = 512;
            mhdr.msg_control = (unsigned char*)malloc(mhdr.msg_controllen);
        }

        mhdr.msg_flags = env->GetIntField(structMsghdr, msgFlagsFid);
    } else {
        // StructMsghdr.msg_iov[]/msg_control[] are output paramenter.
        // StructMsghdr.msg_iov[] data are already updated by recvmsg syscall directly.
        // StructMsghdr.msg_control[] are set below.
        if (msgcontrolToStructCmsghdrArray(env, structMsghdr, mhdr) == false)
            return false;
        env->SetIntField(structMsghdr, msgFlagsFid, mhdr.msg_flags);
    }

    return true;

}

// Convert Java StructMsghdr to C msghdr.
bool msghdrJavaToC(JNIEnv* env, jobject structMsghdr, struct msghdr& mhdr,
                          ScopedByteBufferArray& scopedBufArray) {
    return convertStructMsghdrAndmsghdr(env, structMsghdr, mhdr,
                                             scopedBufArray, true);
}

// Convert C msghdr to Java StructMsghdr.
bool msghdrCToJava(JNIEnv* env, jobject structMsghdr, struct msghdr& mhdr,
                          ScopedByteBufferArray& scopedBufArray) {
    return convertStructMsghdrAndmsghdr(env, structMsghdr, mhdr,
                                             scopedBufArray, false);
}

bool setBlocking(int fd, bool blocking) {
    int flags = fcntl(fd, F_GETFL);
    if (flags == -1) {
        return false;
    }

    if (!blocking) {
        flags |= O_NONBLOCK;
    } else {
        flags &= ~O_NONBLOCK;
    }

    int rc = fcntl(fd, F_SETFL, flags);
    return (rc != -1);
}
