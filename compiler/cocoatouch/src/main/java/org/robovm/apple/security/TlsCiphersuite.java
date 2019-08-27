/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedShortMarshaler.class)/*</annotations>*/
public enum /*<name>*/TlsCiphersuite/*</name>*/ implements ValuedEnum {
    /*<values>*/
    RSA_WITH_3DES_EDE_CBC_SHA(10L),
    RSA_WITH_AES_128_CBC_SHA(47L),
    RSA_WITH_AES_256_CBC_SHA(53L),
    RSA_WITH_AES_128_GCM_SHA256(156L),
    RSA_WITH_AES_256_GCM_SHA384(157L),
    RSA_WITH_AES_128_CBC_SHA256(60L),
    RSA_WITH_AES_256_CBC_SHA256(61L),
    ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA(49160L),
    ECDHE_ECDSA_WITH_AES_128_CBC_SHA(49161L),
    ECDHE_ECDSA_WITH_AES_256_CBC_SHA(49162L),
    ECDHE_RSA_WITH_3DES_EDE_CBC_SHA(49170L),
    ECDHE_RSA_WITH_AES_128_CBC_SHA(49171L),
    ECDHE_RSA_WITH_AES_256_CBC_SHA(49172L),
    ECDHE_ECDSA_WITH_AES_128_CBC_SHA256(49187L),
    ECDHE_ECDSA_WITH_AES_256_CBC_SHA384(49188L),
    ECDHE_RSA_WITH_AES_128_CBC_SHA256(49191L),
    ECDHE_RSA_WITH_AES_256_CBC_SHA384(49192L),
    ECDHE_ECDSA_WITH_AES_128_GCM_SHA256(49195L),
    ECDHE_ECDSA_WITH_AES_256_GCM_SHA384(49196L),
    ECDHE_RSA_WITH_AES_128_GCM_SHA256(49199L),
    ECDHE_RSA_WITH_AES_256_GCM_SHA384(49200L),
    ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256(52392L),
    ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256(52393L),
    AES_128_GCM_SHA256(4865L),
    AES_256_GCM_SHA384(4866L),
    CHACHA20_POLY1305_SHA256(4867L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/TlsCiphersuite/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/TlsCiphersuite/*</name>*/ valueOf(long n) {
        for (/*<name>*/TlsCiphersuite/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/TlsCiphersuite/*</name>*/.class.getName());
    }
}
