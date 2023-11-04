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
 * @since Available in iOS 16.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedShortMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRPowerSourceBatApprovedChemistry/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.5 and later.
     */
    Unspecified(0L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    Alkaline(1L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumCarbonFluoride(2L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumChromiumOxide(3L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumCopperOxide(4L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumIronDisulfide(5L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumManganeseDioxide(6L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumThionylChloride(7L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    Magnesium(8L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    MercuryOxide(9L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelOxyhydride(10L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SilverOxide(11L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincAir(12L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincCarbon(13L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincChloride(14L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincManganeseDioxide(15L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LeadAcid(16L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumCobaltOxide(17L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumIon(18L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumIonPolymer(19L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumIronPhosphate(20L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumSulfur(21L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LithiumTitanate(22L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelCadmium(23L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelHydrogen(24L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelIron(25L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelMetalHydride(26L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    NickelZinc(27L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SilverZinc(28L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SodiumIon(29L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SodiumSulfur(30L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincBromide(31L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    ZincCerium(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRPowerSourceBatApprovedChemistry/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRPowerSourceBatApprovedChemistry/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRPowerSourceBatApprovedChemistry/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRPowerSourceBatApprovedChemistry/*</name>*/.class.getName());
    }
}
