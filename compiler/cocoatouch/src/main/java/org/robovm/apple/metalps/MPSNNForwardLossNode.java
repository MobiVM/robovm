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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNForwardLossNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNForwardLossNodePtr extends Ptr<MPSNNForwardLossNode, MPSNNForwardLossNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNForwardLossNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNForwardLossNode() {}
    protected MPSNNForwardLossNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNForwardLossNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:labels:weights:lossDescriptor:")
    public MPSNNForwardLossNode(MPSNNImageNode source, MPSNNImageNode labels, MPSNNImageNode weights, MPSCNNLossDescriptor descriptor) { super((SkipInit) null); initObject(init(source, labels, weights, descriptor)); }
    @Method(selector = "initWithSource:labels:lossDescriptor:")
    public MPSNNForwardLossNode(MPSNNImageNode source, MPSNNImageNode labels, MPSCNNLossDescriptor descriptor) { super((SkipInit) null); initObject(init(source, labels, descriptor)); }
    @Method(selector = "initWithSources:lossDescriptor:")
    public MPSNNForwardLossNode(NSArray<MPSNNImageNode> sourceNodes, MPSCNNLossDescriptor descriptor) { super((SkipInit) null); initObject(init(sourceNodes, descriptor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossType")
    public native MPSCNNLossType getLossType();
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "numberOfClasses")
    public native @MachineSizedUInt long getNumberOfClasses();
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "propertyCallBack")
    public native MPSNNLossCallback getPropertyCallBack();
    @Property(selector = "setPropertyCallBack:")
    public native void setPropertyCallBack(MPSNNLossCallback v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:labels:weights:lossDescriptor:")
    protected native @Pointer long init(MPSNNImageNode source, MPSNNImageNode labels, MPSNNImageNode weights, MPSCNNLossDescriptor descriptor);
    @Method(selector = "initWithSource:labels:lossDescriptor:")
    protected native @Pointer long init(MPSNNImageNode source, MPSNNImageNode labels, MPSCNNLossDescriptor descriptor);
    @Method(selector = "initWithSources:lossDescriptor:")
    protected native @Pointer long init(NSArray<MPSNNImageNode> sourceNodes, MPSCNNLossDescriptor descriptor);
    @Method(selector = "gradientFilterWithSources:")
    public native MPSNNLossGradientNode gradientFilter(NSArray<MPSNNImageNode> sourceGradient);
    @Method(selector = "gradientFiltersWithSources:")
    public native NSArray<MPSNNLossGradientNode> gradientFiltersEx(NSArray<MPSNNImageNode> sourceGradient);
    @Method(selector = "gradientFilterWithSource:")
    public native MPSNNLossGradientNode gradientFilter(MPSNNImageNode sourceGradient);
    @Method(selector = "gradientFiltersWithSource:")
    public native NSArray<MPSNNLossGradientNode> gradientFiltersEx(MPSNNImageNode sourceGradient);
    /*</methods>*/
}
