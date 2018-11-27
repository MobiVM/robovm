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
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNOptimizer/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNOptimizerPtr extends Ptr<MPSNNOptimizer, MPSNNOptimizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNOptimizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNOptimizer() {}
    protected MPSNNOptimizer(Handle h, long handle) { super(h, handle); }
    protected MPSNNOptimizer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MPSNNOptimizer(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSNNOptimizer(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "learningRate")
    public native float getLearningRate();
    @Property(selector = "setLearningRate:")
    public native void setLearningRate(float v);
    @Property(selector = "gradientRescale")
    public native float getGradientRescale();
    @Property(selector = "applyGradientClipping")
    public native boolean isApplyGradientClipping();
    @Property(selector = "setApplyGradientClipping:")
    public native void setApplyGradientClipping(boolean v);
    @Property(selector = "gradientClipMax")
    public native float getGradientClipMax();
    @Property(selector = "gradientClipMin")
    public native float getGradientClipMin();
    @Property(selector = "regularizationScale")
    public native float getRegularizationScale();
    @Property(selector = "regularizationType")
    public native MPSNNRegularizationType getRegularizationType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
