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
public enum /*<name>*/NEVPNIKEv2DiffieHellmanGroup/*</name>*/ implements ValuedEnum {
    /*<values>*/
    GroupInvalid(0L),
    /**
     * @deprecated Deprecated in iOS 17.0. Use Diffie Hellman group 14 or greater instead
     */
    @Deprecated
    Group1(1L),
    /**
     * @deprecated Deprecated in iOS 17.0. Use Diffie Hellman group 14 or greater instead
     */
    @Deprecated
    Group2(2L),
    /**
     * @deprecated Deprecated in iOS 17.0. Use Diffie Hellman group 14 or greater instead
     */
    @Deprecated
    Group5(5L),
    Group14(14L),
    Group15(15L),
    Group16(16L),
    Group17(17L),
    Group18(18L),
    Group19(19L),
    Group20(20L),
    Group21(21L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    Group31(31L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Group32(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NEVPNIKEv2DiffieHellmanGroup/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NEVPNIKEv2DiffieHellmanGroup/*</name>*/ valueOf(long n) {
        for (/*<name>*/NEVPNIKEv2DiffieHellmanGroup/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NEVPNIKEv2DiffieHellmanGroup/*</name>*/.class.getName());
    }
}
