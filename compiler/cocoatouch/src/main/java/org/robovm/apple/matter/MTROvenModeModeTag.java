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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedShortMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTROvenModeModeTag/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    Auto(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Quick(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Quiet(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    LowNoise(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    LowEnergy(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Vacation(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Min(6L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Max(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Night(8L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Day(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Bake(16384L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Convection(16385L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Grill(16386L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Roast(16387L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Clean(16388L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    ConvectionBake(16389L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    ConvectionRoast(16390L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Warming(16391L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Proofing(16392L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTROvenModeModeTag/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTROvenModeModeTag/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTROvenModeModeTag/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTROvenModeModeTag/*</name>*/.class.getName());
    }
}
