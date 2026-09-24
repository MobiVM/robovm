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
public enum /*<name>*/MTRPowerSourceBatCommonDesignation/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.5 and later.
     */
    Unspecified(0L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    AAA(1L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    AA(2L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    C(3L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    D(4L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _4v5(5L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _6v0(6L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _9v0(7L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _12AA(8L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    AAAA(9L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A(10L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    B(11L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    F(12L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    N(13L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    No6(14L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SubC(15L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A23(16L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A27(17L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    BA5800(18L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    Duplex(19L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _4SR44(20L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _523(21L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _531(22L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _15v0(23L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _22v5(24L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _30v0(25L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _45v0(26L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _67v5(27L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    J(28L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    CR123A(29L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    CR2(30L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _2CR5(31L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    CRP2(32L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    CRV3(33L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR41(34L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR43(35L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR44(36L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR45(37L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR48(38L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR54(39L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR55(40L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR57(41L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR58(42L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR59(43L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR60(44L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR63(45L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR64(46L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR65(47L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR66(48L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR67(49L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR68(50L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR69(51L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR516(52L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR731(53L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    SR712(54L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    LR932(55L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A5(56L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A10(57L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A13(58L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A312(59L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    A675(60L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    AC41E(61L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _10180(62L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _10280(63L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _10440(64L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _14250(65L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _14430(66L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _14500(67L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _14650(68L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _15270(69L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _16340(70L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    RCR123A(71L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _17500(72L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _17670(73L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _18350(74L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _18500(75L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _18650(76L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _19670(77L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _25500(78L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _26650(79L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    _32600(80L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRPowerSourceBatCommonDesignation/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRPowerSourceBatCommonDesignation/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRPowerSourceBatCommonDesignation/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRPowerSourceBatCommonDesignation/*</name>*/.class.getName());
    }
}
