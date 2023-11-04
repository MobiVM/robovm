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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRBasicInformationColor/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    Black(0L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Navy(1L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Green(2L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Teal(3L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Maroon(4L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Purple(5L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Olive(6L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Gray(7L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Blue(8L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Lime(9L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Aqua(10L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Red(11L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Fuchsia(12L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Yellow(13L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    White(14L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Nickel(15L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Chrome(16L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Brass(17L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Copper(18L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Silver(19L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Gold(20L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRBasicInformationColor/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRBasicInformationColor/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRBasicInformationColor/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRBasicInformationColor/*</name>*/.class.getName());
    }
}
