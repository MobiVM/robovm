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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNOptimizerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNOptimizerDescriptorPtr extends Ptr<MPSNNOptimizerDescriptor, MPSNNOptimizerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNOptimizerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNOptimizerDescriptor() {}
    protected MPSNNOptimizerDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSNNOptimizerDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public MPSNNOptimizerDescriptor(float learningRate, float gradientRescale, MPSNNRegularizationType regularizationType, float regularizationScale) { super((SkipInit) null); initObject(init(learningRate, gradientRescale, regularizationType, regularizationScale)); }
    @Method(selector = "initWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public MPSNNOptimizerDescriptor(float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax, float gradientClipMin, MPSNNRegularizationType regularizationType, float regularizationScale) { super((SkipInit) null); initObject(init(learningRate, gradientRescale, applyGradientClipping, gradientClipMax, gradientClipMin, regularizationType, regularizationScale)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "learningRate")
    public native float getLearningRate();
    @Property(selector = "setLearningRate:")
    public native void setLearningRate(float v);
    @Property(selector = "gradientRescale")
    public native float getGradientRescale();
    @Property(selector = "setGradientRescale:")
    public native void setGradientRescale(float v);
    @Property(selector = "applyGradientClipping")
    public native boolean isApplyGradientClipping();
    @Property(selector = "setApplyGradientClipping:")
    public native void setApplyGradientClipping(boolean v);
    @Property(selector = "gradientClipMax")
    public native float getGradientClipMax();
    @Property(selector = "setGradientClipMax:")
    public native void setGradientClipMax(float v);
    @Property(selector = "gradientClipMin")
    public native float getGradientClipMin();
    @Property(selector = "setGradientClipMin:")
    public native void setGradientClipMin(float v);
    @Property(selector = "regularizationScale")
    public native float getRegularizationScale();
    @Property(selector = "setRegularizationScale:")
    public native void setRegularizationScale(float v);
    @Property(selector = "regularizationType")
    public native MPSNNRegularizationType getRegularizationType();
    @Property(selector = "setRegularizationType:")
    public native void setRegularizationType(MPSNNRegularizationType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    protected native @Pointer long init(float learningRate, float gradientRescale, MPSNNRegularizationType regularizationType, float regularizationScale);
    @Method(selector = "initWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    protected native @Pointer long init(float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax, float gradientClipMin, MPSNNRegularizationType regularizationType, float regularizationScale);
    @Method(selector = "optimizerDescriptorWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptor(float learningRate, float gradientRescale, MPSNNRegularizationType regularizationType, float regularizationScale);
    @Method(selector = "optimizerDescriptorWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptor(float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax, float gradientClipMin, MPSNNRegularizationType regularizationType, float regularizationScale);
    /*</methods>*/
}
