/* GENERATED SOURCE. DO NOT MODIFY. */
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

package com.android.org.bouncycastle.crypto.digests;

import com.android.org.bouncycastle.crypto.Digest;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class AndroidDigestFactoryBouncyCastle implements AndroidDigestFactoryInterface {
    public Digest getMD5() {
        return new MD5Digest();
    }
    public Digest getSHA1() {
        return new SHA1Digest();
    }
    public Digest getSHA224() {
        return new SHA224Digest();
    }
    public Digest getSHA256() {
        return new SHA256Digest();
    }
    public Digest getSHA384() {
        return new SHA384Digest();
    }
    public Digest getSHA512() {
        return new SHA512Digest();
    }
}
