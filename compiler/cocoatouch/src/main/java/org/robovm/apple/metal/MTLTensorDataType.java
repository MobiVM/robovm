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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTLTensorDataType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    Float32(3L),
    Float16(16L),
    BFloat16(121L),
    Int8(45L),
    UInt8(49L),
    Int16(37L),
    UInt16(41L),
    Int32(29L),
    UInt32(33L),
    /**
     * @since Available in iOS 26.4 and later.
     */
    Int4(143L),
    /**
     * @since Available in iOS 26.4 and later.
     */
    UInt4(144L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    MetalFloat8UE8M0(145L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    UInt2(149L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    Int2(150L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    MetalFloat8E5M2(141L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    MetalFloat8E4M3(142L),
    /**
     * @since Available in iOS 27.0 and later.
     */
    MetalFloat4E2M1(148L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTLTensorDataType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTLTensorDataType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTLTensorDataType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTLTensorDataType/*</name>*/.class.getName());
    }
}
