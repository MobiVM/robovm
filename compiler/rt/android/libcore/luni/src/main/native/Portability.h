/*
 * Copyright (C) 2012 The Android Open Source Project
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

#ifndef PORTABILITY_H_included
#define PORTABILITY_H_included

#include <byteswap.h>
#include <sys/sendfile.h>
#include <sys/statvfs.h>

#include <netdb.h>
#if defined(__BIONIC__)
extern "C" int android_getaddrinfofornet(const char*, const char*, const struct addrinfo*, unsigned, unsigned, struct addrinfo**);
#else
static inline int android_getaddrinfofornet(const char* hostname, const char* servname,
    const struct addrinfo* hints, unsigned /*netid*/, unsigned /*mark*/, struct addrinfo** res) {
  return getaddrinfo(hostname, servname, hints, res);
}
#endif

#if __has_include(<linux/vm_sockets.h>)
#include <linux/vm_sockets.h>
#else  // __has_include(<linux/vm_sockets.h>)
// the platform does not support virtio-vsock
#define AF_VSOCK (-1)
#define VMADDR_PORT_ANY (-1)
#define VMADDR_CID_ANY (-1)
#define VMADDR_CID_LOCAL (-1)
#define VMADDR_CID_HOST (-1)
#endif  // __has_include(<linux/vm_sockets.h>)

#if defined(__GLIBC__) && !defined(__LP64__)

#include <unistd.h>

// 32 bit GLIBC hardcodes a "long int" as the return type for
// TEMP_FAILURE_RETRY so the return value here gets truncated for
// functions that return 64 bit types.
#undef TEMP_FAILURE_RETRY
#define TEMP_FAILURE_RETRY(exp) ({         \
    __typeof__(exp) _rc;                   \
    do {                                   \
        _rc = (exp);                       \
    } while (_rc == -1 && errno == EINTR); \
    _rc; })

#endif  // __GLIBC__ && !__LP64__

#endif  // PORTABILITY_H_included
