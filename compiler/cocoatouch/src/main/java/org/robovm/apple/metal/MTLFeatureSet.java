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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTLFeatureSet/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    iOS_GPUFamily1_v1(0L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    iOS_GPUFamily2_v1(1L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    iOS_GPUFamily1_v2(2L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    iOS_GPUFamily2_v2(3L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    iOS_GPUFamily3_v1(4L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    iOS_GPUFamily1_v3(5L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    iOS_GPUFamily2_v3(6L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    iOS_GPUFamily3_v2(7L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    iOS_GPUFamily1_v4(8L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    iOS_GPUFamily2_v4(9L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    iOS_GPUFamily3_v3(10L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    iOS_GPUFamily4_v1(11L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    iOS_GPUFamily1_v5(12L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    iOS_GPUFamily2_v5(13L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    iOS_GPUFamily3_v4(14L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    iOS_GPUFamily4_v2(15L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    iOS_GPUFamily5_v1(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTLFeatureSet/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTLFeatureSet/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTLFeatureSet/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTLFeatureSet/*</name>*/.class.getName());
    }
}
