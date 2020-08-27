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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNLossGradientNode/*</name>*/ 
    extends /*<extends>*/MPSNNGradientFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNLossGradientNodePtr extends Ptr<MPSNNLossGradientNode, MPSNNLossGradientNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNLossGradientNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNLossGradientNode() {}
    protected MPSNNLossGradientNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNLossGradientNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceGradient:sourceImage:labels:weights:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public MPSNNLossGradientNode(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNImageNode weights, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter) { super((SkipInit) null); initObject(init(sourceGradient, sourceImage, labels, weights, gradientState, descriptor, isLabelsGradientFilter)); }
    @Method(selector = "initWithSourceGradient:sourceImage:labels:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public MPSNNLossGradientNode(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter) { super((SkipInit) null); initObject(init(sourceGradient, sourceImage, labels, gradientState, descriptor, isLabelsGradientFilter)); }
    @Method(selector = "initWithSources:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public MPSNNLossGradientNode(NSArray<MPSNNImageNode> sourceNodes, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter) { super((SkipInit) null); initObject(init(sourceNodes, gradientState, descriptor, isLabelsGradientFilter)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossType")
    public native MPSCNNLossType getLossType();
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "numberOfClasses")
    public native @MachineSizedUInt long getNumberOfClasses();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "reduceAcrossBatch")
    public native boolean isReduceAcrossBatch();
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "isLabelsGradientFilter")
    public native boolean isLabelsGradientFilter();
    @Property(selector = "propertyCallBack")
    public native MPSNNLossCallback getPropertyCallBack();
    @Property(selector = "setPropertyCallBack:")
    public native void setPropertyCallBack(MPSNNLossCallback v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceGradient:sourceImage:labels:weights:gradientState:lossDescriptor:isLabelsGradientFilter:")
    protected native @Pointer long init(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNImageNode weights, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);
    @Method(selector = "initWithSourceGradient:sourceImage:labels:gradientState:lossDescriptor:isLabelsGradientFilter:")
    protected native @Pointer long init(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);
    @Method(selector = "initWithSources:gradientState:lossDescriptor:isLabelsGradientFilter:")
    protected native @Pointer long init(NSArray<MPSNNImageNode> sourceNodes, MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);
    /*</methods>*/
}
