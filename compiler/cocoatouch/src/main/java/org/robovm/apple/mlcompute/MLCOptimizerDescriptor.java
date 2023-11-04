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
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCOptimizerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCOptimizerDescriptorPtr extends Ptr<MLCOptimizerDescriptor, MLCOptimizerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCOptimizerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLCOptimizerDescriptor() {}
    protected MLCOptimizerDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCOptimizerDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCOptimizerDescriptor(float learningRate, float gradientRescale, MLCRegularizationType regularizationType, float regularizationScale) { super((Handle) null, create(learningRate, gradientRescale, regularizationType, regularizationScale)); retain(getHandle()); }
    public MLCOptimizerDescriptor(float learningRate, float gradientRescale, boolean appliesGradientClipping, float gradientClipMax, float gradientClipMin, MLCRegularizationType regularizationType, float regularizationScale) { super((Handle) null, create(learningRate, gradientRescale, appliesGradientClipping, gradientClipMax, gradientClipMin, regularizationType, regularizationScale)); retain(getHandle()); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    public MLCOptimizerDescriptor(float learningRate, float gradientRescale, boolean appliesGradientClipping, MLCGradientClippingType gradientClippingType, float gradientClipMax, float gradientClipMin, float maximumClippingNorm, float customGlobalNorm, MLCRegularizationType regularizationType, float regularizationScale) { super((Handle) null, create(learningRate, gradientRescale, appliesGradientClipping, gradientClippingType, gradientClipMax, gradientClipMin, maximumClippingNorm, customGlobalNorm, regularizationType, regularizationScale)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "learningRate")
    public native float getLearningRate();
    @Property(selector = "gradientRescale")
    public native float getGradientRescale();
    @Property(selector = "appliesGradientClipping")
    public native boolean appliesGradientClipping();
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
    @Method(selector = "descriptorWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    protected static native @Pointer long create(float learningRate, float gradientRescale, MLCRegularizationType regularizationType, float regularizationScale);
    @Method(selector = "descriptorWithLearningRate:gradientRescale:appliesGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    protected static native @Pointer long create(float learningRate, float gradientRescale, boolean appliesGradientClipping, float gradientClipMax, float gradientClipMin, MLCRegularizationType regularizationType, float regularizationScale);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "descriptorWithLearningRate:gradientRescale:appliesGradientClipping:gradientClippingType:gradientClipMax:gradientClipMin:maximumClippingNorm:customGlobalNorm:regularizationType:regularizationScale:")
    protected static native @Pointer long create(float learningRate, float gradientRescale, boolean appliesGradientClipping, MLCGradientClippingType gradientClippingType, float gradientClipMax, float gradientClipMin, float maximumClippingNorm, float customGlobalNorm, MLCRegularizationType regularizationType, float regularizationScale);
    /*</methods>*/
}
