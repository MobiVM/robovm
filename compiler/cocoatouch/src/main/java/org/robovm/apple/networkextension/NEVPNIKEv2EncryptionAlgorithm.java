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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/NEVPNIKEv2EncryptionAlgorithm/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @deprecated Deprecated in iOS 17.0. Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated
    DES(1L),
    /**
     * @deprecated Deprecated in iOS 17.0. Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated
    _3DES(2L),
    /**
     * @deprecated Deprecated in iOS 17.0. Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated
    AES128(3L),
    AES256(4L),
    /**
     * @since Available in iOS 8.3 and later.
     * @deprecated Deprecated in iOS 17.0. Use an encryption algorithm with 256-bit keys instead
     */
    @Deprecated
    AES128GCM(5L),
    /**
     * @since Available in iOS 8.3 and later.
     */
    AES256GCM(6L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    ChaCha20Poly1305(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NEVPNIKEv2EncryptionAlgorithm/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NEVPNIKEv2EncryptionAlgorithm/*</name>*/ valueOf(long n) {
        for (/*<name>*/NEVPNIKEv2EncryptionAlgorithm/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NEVPNIKEv2EncryptionAlgorithm/*</name>*/.class.getName());
    }
}
