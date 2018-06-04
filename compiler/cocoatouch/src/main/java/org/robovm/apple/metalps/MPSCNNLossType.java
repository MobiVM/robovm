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
public enum /*<name>*/MPSCNNLossType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    MeanAbsoluteError(0L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    MeanSquaredError(1L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    SoftMaxCrossEntropy(2L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    SigmoidCrossEntropy(3L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    CategoricalCrossEntropy(4L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Hinge(5L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Huber(6L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    CosineDistance(7L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    Log(8L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    KullbackLeiblerDivergence(9L),
    Count(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSCNNLossType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSCNNLossType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSCNNLossType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSCNNLossType/*</name>*/.class.getName());
    }
}
