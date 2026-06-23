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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/CGToneMapping/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Default(0L),
    ImageSpecificLumaScaling(1L),
    ReferenceWhiteBased(2L),
    ITURecommended(3L),
    EXRGamma(4L),
    None(5L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Library("CoreGraphics")
    public static class Consts {
        static { Bro.bind(Consts.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGPreferredDynamicRange", optional=true)
        public static native String PreferredDynamicRange();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGDynamicRangeHigh", optional=true)
        public static native String DynamicRangeHigh();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGDynamicRangeConstrained", optional=true)
        public static native String DynamicRangeConstrained();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGDynamicRangeStandard", optional=true)
        public static native String DynamicRangeStandard();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGContentAverageLightLevel", optional=true)
        public static native String ContentAverageLightLevel();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCGContentAverageLightLevelNits", optional=true)
        public static native String ContentAverageLightLevelNits();
    }
    /*</methods>*/

    private final long n;

    private /*<name>*/CGToneMapping/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CGToneMapping/*</name>*/ valueOf(long n) {
        for (/*<name>*/CGToneMapping/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CGToneMapping/*</name>*/.class.getName());
    }
}
