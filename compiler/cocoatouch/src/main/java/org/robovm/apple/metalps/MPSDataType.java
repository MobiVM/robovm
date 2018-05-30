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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MPSDataType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    Invalid(0L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    FloatBit(268435456L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    Float32(268435488L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Float16(268435472L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    SignedBit(536870912L),
    IntBit(536870912L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    Int8(536870920L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    Int16(536870928L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    UInt8(8L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    UInt16(16L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    UInt32(32L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    NormalizedBit(1073741824L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Unorm1(1073741825L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Unorm8(1073741832L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSDataType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSDataType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSDataType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSDataType/*</name>*/.class.getName());
    }
}
