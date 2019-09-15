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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNLossGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNBinaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNLossGradientPtr extends Ptr<MPSNNLossGradient, MPSNNLossGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNLossGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNLossGradient() {}
    protected MPSNNLossGradient(Handle h, long handle) { super(h, handle); }
    protected MPSNNLossGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:lossDescriptor:")
    public MPSNNLossGradient(MTLDevice device, MPSCNNLossDescriptor lossDescriptor) { super((SkipInit) null); initObject(init(device, lossDescriptor)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNLossGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNLossGradient(NSCoder decoder) { super(decoder); }
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
    @Property(selector = "setWeight:")
    public native void setWeight(float v);
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "setLabelSmoothing:")
    public native void setLabelSmoothing(float v);
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "setDelta:")
    public native void setDelta(float v);
    @Property(selector = "computeLabelGradients")
    public native boolean isComputeLabelGradients();
    @Property(selector = "setComputeLabelGradients:")
    public native void setComputeLabelGradients(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:lossDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSCNNLossDescriptor lossDescriptor);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:labels:weights:sourceStates:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, NSArray<MPSImage> labels, NSArray<MPSImage> weights, NSArray<? extends MPSState> sourceStates);
    @Method(selector = "encodeBatchToCommandBuffer:sourceGradients:sourceImages:labels:weights:sourceStates:destinationGradients:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceGradients, NSArray<MPSImage> sourceImages, NSArray<MPSImage> labels, NSArray<MPSImage> weights, NSArray<? extends MPSState> sourceStates, NSArray<MPSImage> destinationGradients);
    /*</methods>*/
}
