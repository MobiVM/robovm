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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCOptimizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCOptimizerPtr extends Ptr<MLCOptimizer, MLCOptimizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCOptimizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCOptimizer() {}
    protected MLCOptimizer(Handle h, long handle) { super(h, handle); }
    protected MLCOptimizer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "learningRate")
    public native float getLearningRate();
    @Property(selector = "setLearningRate:")
    public native void setLearningRate(float v);
    @Property(selector = "gradientRescale")
    public native float getGradientRescale();
    @Property(selector = "appliesGradientClipping")
    public native boolean appliesGradientClipping();
    @Property(selector = "setAppliesGradientClipping:")
    public native void setAppliesGradientClipping(boolean v);
    @Property(selector = "gradientClipMax")
    public native float getGradientClipMax();
    @Property(selector = "gradientClipMin")
    public native float getGradientClipMin();
    @Property(selector = "regularizationScale")
    public native float getRegularizationScale();
    @Property(selector = "regularizationType")
    public native MLCRegularizationType getRegularizationType();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "gradientClippingType")
    public native MLCGradientClippingType getGradientClippingType();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "maximumClippingNorm")
    public native float getMaximumClippingNorm();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "customGlobalNorm")
    public native float getCustomGlobalNorm();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
