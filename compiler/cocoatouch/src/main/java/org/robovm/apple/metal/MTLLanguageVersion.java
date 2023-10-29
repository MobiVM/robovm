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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTLLanguageVersion/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use a newer language standard
     */
    @Deprecated
    Version1_0(65536L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    Version1_1(65537L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    Version1_2(65538L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Version2_0(131072L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    Version2_1(131073L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    Version2_2(131074L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    Version2_3(131075L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    Version2_4(131076L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    Version3_0(196608L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Version3_1(196609L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTLLanguageVersion/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTLLanguageVersion/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTLLanguageVersion/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTLLanguageVersion/*</name>*/.class.getName());
    }
}
