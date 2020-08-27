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
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCRMSPropOptimizer/*</name>*/ 
    extends /*<extends>*/MLCOptimizer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCRMSPropOptimizerPtr extends Ptr<MLCRMSPropOptimizer, MLCRMSPropOptimizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCRMSPropOptimizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCRMSPropOptimizer() {}
    protected MLCRMSPropOptimizer(Handle h, long handle) { super(h, handle); }
    protected MLCRMSPropOptimizer(SkipInit skipInit) { super(skipInit); }
    public MLCRMSPropOptimizer(MLCOptimizerDescriptor optimizerDescriptor) { super((Handle) null, create(optimizerDescriptor)); retain(getHandle()); }
    public MLCRMSPropOptimizer(MLCOptimizerDescriptor optimizerDescriptor, float momentumScale, float alpha, float epsilon, boolean isCentered) { super((Handle) null, create(optimizerDescriptor, momentumScale, alpha, epsilon, isCentered)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "momentumScale")
    public native float getMomentumScale();
    @Property(selector = "alpha")
    public native float getAlpha();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "isCentered")
    public native boolean isCentered();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "optimizerWithDescriptor:")
    protected static native @Pointer long create(MLCOptimizerDescriptor optimizerDescriptor);
    @Method(selector = "optimizerWithDescriptor:momentumScale:alpha:epsilon:isCentered:")
    protected static native @Pointer long create(MLCOptimizerDescriptor optimizerDescriptor, float momentumScale, float alpha, float epsilon, boolean isCentered);
    /*</methods>*/
}
