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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MLCompute")/*</annotations>*/
public enum /*<name>*/MLCArithmeticOperation/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Add(0L),
    Subtract(1L),
    Multiply(2L),
    Divide(3L),
    Floor(4L),
    Round(5L),
    Ceil(6L),
    Sqrt(7L),
    Rsqrt(8L),
    Sin(9L),
    Cos(10L),
    Tan(11L),
    Asin(12L),
    Acos(13L),
    Atan(14L),
    Sinh(15L),
    Cosh(16L),
    Tanh(17L),
    Asinh(18L),
    Acosh(19L),
    Atanh(20L),
    Pow(21L),
    Exp(22L),
    Exp2(23L),
    Log(24L),
    Log2(25L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    MultiplyNoNaN(26L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    DivideNoNaN(27L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    Min(28L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    Max(29L),
    Count(30L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MLCArithmeticOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="MLCArithmeticOperationDebugDescription", optional=true)
    public native String getDebugDescription();
    /*</methods>*/

    private final long n;

    private /*<name>*/MLCArithmeticOperation/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MLCArithmeticOperation/*</name>*/ valueOf(long n) {
        for (/*<name>*/MLCArithmeticOperation/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MLCArithmeticOperation/*</name>*/.class.getName());
    }
}
