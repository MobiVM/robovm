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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNArithmeticGradientNode/*</name>*/ 
    extends /*<extends>*/MPSNNGradientFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNArithmeticGradientNodePtr extends Ptr<MPSNNArithmeticGradientNode, MPSNNArithmeticGradientNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNArithmeticGradientNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNArithmeticGradientNode() {}
    protected MPSNNArithmeticGradientNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNArithmeticGradientNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:isSecondarySourceFilter:")
    public MPSNNArithmeticGradientNode(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNBinaryGradientStateNode gradientState, boolean isSecondarySourceFilter) { super((SkipInit) null); initObject(init(sourceGradient, sourceImage, gradientState, isSecondarySourceFilter)); }
    @Method(selector = "initWithGradientImages:forwardFilter:isSecondarySourceFilter:")
    public MPSNNArithmeticGradientNode(NSArray<MPSNNImageNode> gradientImages, MPSNNFilterNode filter, boolean isSecondarySourceFilter) { super((SkipInit) null); initObject(init(gradientImages, filter, isSecondarySourceFilter)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryScale")
    public native float getPrimaryScale();
    @Property(selector = "setPrimaryScale:")
    public native void setPrimaryScale(float v);
    @Property(selector = "secondaryScale")
    public native float getSecondaryScale();
    @Property(selector = "setSecondaryScale:")
    public native void setSecondaryScale(float v);
    @Property(selector = "bias")
    public native float getBias();
    @Property(selector = "setBias:")
    public native void setBias(float v);
    @Property(selector = "secondaryStrideInPixelsX")
    public native @MachineSizedUInt long getSecondaryStrideInPixelsX();
    @Property(selector = "setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@MachineSizedUInt long v);
    @Property(selector = "secondaryStrideInPixelsY")
    public native @MachineSizedUInt long getSecondaryStrideInPixelsY();
    @Property(selector = "setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@MachineSizedUInt long v);
    @Property(selector = "secondaryStrideInFeatureChannels")
    public native @MachineSizedUInt long getSecondaryStrideInFeatureChannels();
    @Property(selector = "setSecondaryStrideInFeatureChannels:")
    public native void setSecondaryStrideInFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "minimumValue")
    public native float getMinimumValue();
    @Property(selector = "setMinimumValue:")
    public native void setMinimumValue(float v);
    @Property(selector = "maximumValue")
    public native float getMaximumValue();
    @Property(selector = "setMaximumValue:")
    public native void setMaximumValue(float v);
    @Property(selector = "isSecondarySourceFilter")
    public native boolean isSecondarySourceFilter();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:isSecondarySourceFilter:")
    protected native @Pointer long init(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNBinaryGradientStateNode gradientState, boolean isSecondarySourceFilter);
    @Method(selector = "initWithGradientImages:forwardFilter:isSecondarySourceFilter:")
    protected native @Pointer long init(NSArray<MPSNNImageNode> gradientImages, MPSNNFilterNode filter, boolean isSecondarySourceFilter);
    /*</methods>*/
}
