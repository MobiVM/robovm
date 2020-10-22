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
public enum /*<name>*/MLCLossType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    MeanAbsoluteError(0L),
    MeanSquaredError(1L),
    SoftmaxCrossEntropy(2L),
    SigmoidCrossEntropy(3L),
    CategoricalCrossEntropy(4L),
    Hinge(5L),
    Huber(6L),
    CosineDistance(7L),
    Log(8L),
    Count(9L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MLCLossType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="MLCLossTypeDebugDescription", optional=true)
    public native String getDebugDescription();
    /*</methods>*/

    private final long n;

    private /*<name>*/MLCLossType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MLCLossType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MLCLossType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MLCLossType/*</name>*/.class.getName());
    }
}
