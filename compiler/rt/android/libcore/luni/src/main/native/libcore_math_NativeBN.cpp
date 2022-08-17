/*
 * Copyright (C) 2008 The Android Open Source Project
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

#define LOG_TAG "NativeBN"

#include <stdio.h>
#include <algorithm>
#include <memory>

#include <openssl/bn.h>
#include <openssl/crypto.h>
#include <openssl/err.h>

#include <nativehelper/JNIHelp.h>
#include <nativehelper/ScopedPrimitiveArray.h>
#include <nativehelper/ScopedUtfChars.h>
#include <nativehelper/jni_macros.h>

#include "JniException.h"

struct BN_CTX_Deleter {
  void operator()(BN_CTX* p) const {
    BN_CTX_free(p);
  }
};
typedef std::unique_ptr<BN_CTX, BN_CTX_Deleter> Unique_BN_CTX;

static BIGNUM* toBigNum(jlong address) {
  return reinterpret_cast<BIGNUM*>(static_cast<uintptr_t>(address));
}

// Exception handling: We follow the usual JNI convention of "throwing" an
// exception if anything goes wrong, and returning junk, typically null.
// The NativeBN_ routines should only be called from Java, or from code
// that immediately returns the result to Java, and thus the
// Java exception should be thrown before we ever see the junk.
// This null BNs should never become visible, and we do not have to deal with
// junk (nulls) as input.
static void throwException(JNIEnv* env) {
  long error = ERR_get_error();
  // OpenSSL's error queue may contain multiple errors. Clean up after them.
  ERR_clear_error();

  if (error == 0) {
    // An operation failed but did not push to the error queue. Throw a default
    // exception.
    jniThrowException(env, "java/lang/ArithmeticException", "Operation failed");
    return;
  }

  char message[256];
  ERR_error_string_n(error, message, sizeof(message));
  int reason = ERR_GET_REASON(error);
  if (reason == BN_R_DIV_BY_ZERO) {
    jniThrowException(env, "java/lang/ArithmeticException", "BigInteger division by zero");
  } else if (reason == BN_R_NO_INVERSE) {
    jniThrowException(env, "java/lang/ArithmeticException", "BigInteger not invertible");
  } else if (reason == ERR_R_MALLOC_FAILURE) {
    jniThrowOutOfMemoryError(env, message);
  } else {
    jniThrowException(env, "java/lang/ArithmeticException", message);
  }
}

static jlong NativeBN_BN_new(JNIEnv* env, jclass) {
  jlong result = static_cast<jlong>(reinterpret_cast<uintptr_t>(BN_new()));
  if (!result) {
    throwException(env);
  }
  return result;
}

static void NativeBN_BN_free(JNIEnv*, jclass, jlong a) {
  // Do nothing on a zero argument.
  BN_free(toBigNum(a));
}

static void NativeBN_litEndInts2bn(JNIEnv* env, jclass, jintArray arr, int len, jboolean neg, jlong ret0) {
  BIGNUM* ret = toBigNum(ret0);

  ScopedIntArrayRO scopedArray(env, arr);

  if (scopedArray.get() == NULL) {
    return;
  }

  // We can simply interpret the little-endian integer stream as a
  // little-endian byte stream and use BN_le2bn.
  const uint8_t* tmpBytes = reinterpret_cast<const uint8_t *>(scopedArray.get());
  size_t numBytes = len * sizeof(int);

  if (!BN_le2bn(tmpBytes, numBytes, ret)) {
    throwException(env);
  }

  BN_set_negative(ret, neg);
}

static jintArray NativeBN_bn2litEndInts(JNIEnv* env, jclass, jlong a0) {
  BIGNUM* a = toBigNum(a0);

  // The number of integers we need is BN_num_bytes(a) / sizeof(int), rounded up
  int intLen = (BN_num_bytes(a) + sizeof(int) - 1) / sizeof(int);

  // Allocate our result with the JNI boilerplate
  jintArray result = env->NewIntArray(intLen);

  if (result == NULL) {
    throwException(env);
    return NULL;
  }

  ScopedIntArrayRW ints(env, result);

  unsigned int* uints = reinterpret_cast<unsigned int*>(ints.get());
  if (uints == NULL) {
    throwException(env);
    return NULL;
  }

  // We can simply interpret a little-endian byte stream as a little-endian integer stream.
  if (!BN_bn2le_padded(reinterpret_cast<uint8_t*>(uints), intLen * sizeof(int), a)) {
    throwException(env);
    return NULL;
  }

  return result;
}

static void NativeBN_BN_mul(JNIEnv* env, jclass, jlong r, jlong a, jlong b) {
  Unique_BN_CTX ctx(BN_CTX_new());
  BN_CTX* ctxp = ctx.get();
  if (!ctxp || !BN_mul(toBigNum(r), toBigNum(a), toBigNum(b), ctxp)) {
    throwException(env);
  }
}

static void NativeBN_BN_div(JNIEnv* env, jclass, jlong q, jlong rem, jlong num, jlong divisor) {
  Unique_BN_CTX ctx(BN_CTX_new());
  BN_CTX* ctxp = ctx.get();
  if (!ctxp || !BN_div(toBigNum(q), toBigNum(rem), toBigNum(num), toBigNum(divisor), ctxp)) {
    throwException(env);
  }
}

static void NativeBN_BN_mod_exp(JNIEnv* env, jclass, jlong r, jlong a, jlong p, jlong m) {
  Unique_BN_CTX ctx(BN_CTX_new());
  BN_CTX* ctxp = ctx.get();
  if (!ctxp || !BN_mod_exp(toBigNum(r), toBigNum(a), toBigNum(p), toBigNum(m), ctxp)) {
    throwException(env);
  }
}

static JNINativeMethod gMethods[] = {
   NATIVE_METHOD(NativeBN, BN_div, "(JJJJ)V"),
   NATIVE_METHOD(NativeBN, BN_free, "(J)V"),
   NATIVE_METHOD(NativeBN, BN_mod_exp, "(JJJJ)V"),
   NATIVE_METHOD(NativeBN, BN_mul, "(JJJ)V"),
   NATIVE_METHOD(NativeBN, BN_new, "()J"),
   NATIVE_METHOD(NativeBN, bn2litEndInts, "(J)[I"),
   NATIVE_METHOD(NativeBN, litEndInts2bn, "([IIZJ)V"),
};
void register_libcore_math_NativeBN(JNIEnv* env) {
    jniRegisterNativeMethods(env, "libcore/math/NativeBN", gMethods, NELEM(gMethods));
}
