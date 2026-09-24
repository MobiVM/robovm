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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRWindowCoveringEndProductType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    RollerShade(0L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RomanShade(1L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    BalloonShade(2L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    WovenWood(3L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PleatedShade(4L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    CellularShade(5L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LayeredShade(6L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LayeredShade2D(7L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SheerShade(8L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    TiltOnlyInteriorBlind(9L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    InteriorBlind(10L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    VerticalBlindStripCurtain(11L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    InteriorVenetianBlind(12L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ExteriorVenetianBlind(13L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LateralLeftCurtain(14L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LateralRightCurtain(15L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    CentralCurtain(16L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RollerShutter(17L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ExteriorVerticalScreen(18L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    AwningTerracePatio(19L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    AwningVerticalScreen(20L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    TiltOnlyPergola(21L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SwingingShutter(22L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SlidingShutter(23L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Unknown(255L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRWindowCoveringEndProductType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRWindowCoveringEndProductType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRWindowCoveringEndProductType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRWindowCoveringEndProductType/*</name>*/.class.getName());
    }
}
