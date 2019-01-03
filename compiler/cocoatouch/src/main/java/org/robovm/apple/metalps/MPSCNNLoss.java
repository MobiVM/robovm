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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNLoss/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNLossPtr extends Ptr<MPSCNNLoss, MPSCNNLossPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNLoss.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNLoss() {}
    protected MPSCNNLoss(Handle h, long handle) { super(h, handle); }
    protected MPSCNNLoss(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:lossDescriptor:")
    public MPSCNNLoss(MTLDevice device, MPSCNNLossDescriptor lossDescriptor) { super((SkipInit) null); initObject(init(device, lossDescriptor)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNLoss(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNLoss(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossType")
    public native MPSCNNLossType getLossType();
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "weight")
    public native float getWeight();
    @Property(selector = "labelSmoothing")
    public native float getLabelSmoothing();
    @Property(selector = "numberOfClasses")
    public native @MachineSizedUInt long getNumberOfClasses();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "delta")
    public native float getDelta();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:lossDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSCNNLossDescriptor lossDescriptor);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImage:labels:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNLossLabels labels, MPSImage destinationImage);
    @Method(selector = "encodeToCommandBuffer:sourceImage:labels:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNLossLabels labels);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:labels:destinationImages:")
    public native void encodeBatchLabels(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray <MPSCNNLossLabels> labels, NSArray<MPSImage> destinationImage);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:labels:")
    public native NSArray<MPSImage> encodeBatchLabels(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray <MPSCNNLossLabels> labels);
    /*</methods>*/
}
