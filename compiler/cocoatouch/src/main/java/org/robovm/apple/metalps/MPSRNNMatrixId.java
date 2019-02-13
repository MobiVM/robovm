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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MPSRNNMatrixId/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    SingleGateInputWeights(0L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    SingleGateRecurrentWeights(1L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    SingleGateBiasTerms(2L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMInputGateInputWeights(3L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMInputGateRecurrentWeights(4L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMInputGateMemoryWeights(5L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMInputGateBiasTerms(6L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMForgetGateInputWeights(7L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMForgetGateRecurrentWeights(8L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMForgetGateMemoryWeights(9L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMForgetGateBiasTerms(10L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMMemoryGateInputWeights(11L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMMemoryGateRecurrentWeights(12L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMMemoryGateMemoryWeights(13L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMMemoryGateBiasTerms(14L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMOutputGateInputWeights(15L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMOutputGateRecurrentWeights(16L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMOutputGateMemoryWeights(17L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    LSTMOutputGateBiasTerms(18L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUInputGateInputWeights(19L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUInputGateRecurrentWeights(20L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUInputGateBiasTerms(21L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRURecurrentGateInputWeights(22L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRURecurrentGateRecurrentWeights(23L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRURecurrentGateBiasTerms(24L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUOutputGateInputWeights(25L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUOutputGateRecurrentWeights(26L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUOutputGateInputGateWeights(27L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    GRUOutputGateBiasTerms(28L),
    _count(29L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSRNNMatrixId/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSRNNMatrixId/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSRNNMatrixId/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSRNNMatrixId/*</name>*/.class.getName());
    }
}
