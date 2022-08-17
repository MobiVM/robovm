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

package libcore.math;

/**
 * @hide
 */
public final class NativeBN {

    public static native long BN_new();
    // BIGNUM *BN_new(void);

    public static native void BN_free(long a);
    // void BN_free(BIGNUM *a);

    public static native void litEndInts2bn(int[] ints, int len, boolean neg, long ret);

    // Generates a minimal length representation of |a| in a sequence of integers, least-significant
    // word at index 0.
    public static native int[] bn2litEndInts(long a);

    public static native void BN_mul(long r, long a, long b);
    // int BN_mul(BIGNUM *r, const BIGNUM *a, const BIGNUM *b, BN_CTX *ctx);

    public static native void BN_div(long dv, long rem, long num, long divisor);
    // int BN_div(BIGNUM *dv, BIGNUM *rem, const BIGNUM *num, const BIGNUM *divisor, BN_CTX *ctx);

    public static native void BN_mod_exp(long r, long a, long p, long m);
    // int BN_mod_exp(BIGNUM *r, const BIGNUM *a, const BIGNUM *p, const BIGNUM *m, BN_CTX *ctx);
}
