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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MPSCNNNeuronType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    None(0L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReLU(1L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Linear(2L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Sigmoid(3L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    HardSigmoid(4L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    TanH(5L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Absolute(6L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SoftPlus(7L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SoftSign(8L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ELU(9L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    PReLU(10L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ReLUN(11L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Power(12L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Exponential(13L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Logarithm(14L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Count(15L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSCNNNeuronType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSCNNNeuronType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSCNNNeuronType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSCNNNeuronType/*</name>*/.class.getName());
    }
}
