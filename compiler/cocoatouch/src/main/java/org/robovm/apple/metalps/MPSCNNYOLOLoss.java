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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNYOLOLoss/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNYOLOLossPtr extends Ptr<MPSCNNYOLOLoss, MPSCNNYOLOLossPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNYOLOLoss.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNYOLOLoss() {}
    protected MPSCNNYOLOLoss(Handle h, long handle) { super(h, handle); }
    protected MPSCNNYOLOLoss(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:lossDescriptor:")
    public MPSCNNYOLOLoss(MTLDevice device, MPSCNNYOLOLossDescriptor lossDescriptor) { super((SkipInit) null); initObject(init(device, lossDescriptor)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNYOLOLoss(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNYOLOLoss(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lossXY")
    public native MPSCNNLoss getLossXY();
    @Property(selector = "lossWH")
    public native MPSCNNLoss getLossWH();
    @Property(selector = "lossConfidence")
    public native MPSCNNLoss getLossConfidence();
    @Property(selector = "lossClasses")
    public native MPSCNNLoss getLossClasses();
    @Property(selector = "scaleXY")
    public native float getScaleXY();
    @Property(selector = "scaleWH")
    public native float getScaleWH();
    @Property(selector = "scaleNoObject")
    public native float getScaleNoObject();
    @Property(selector = "scaleObject")
    public native float getScaleObject();
    @Property(selector = "scaleClass")
    public native float getScaleClass();
    @Property(selector = "minIOUForObjectPresence")
    public native float getMinIOUForObjectPresence();
    @Property(selector = "maxIOUForObjectAbsence")
    public native float getMaxIOUForObjectAbsence();
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "numberOfAnchorBoxes")
    public native @MachineSizedUInt long getNumberOfAnchorBoxes();
    @Property(selector = "anchorBoxes")
    public native NSData getAnchorBoxes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:lossDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSCNNYOLOLossDescriptor lossDescriptor);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImage:labels:destinationImage:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNLossLabels labels, MPSImage destinationImage);
    @Method(selector = "encodeToCommandBuffer:sourceImage:labels:")
    public native MPSImage encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNLossLabels labels);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:labels:destinationImages:")
    public native void encodeBatchToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray <MPSCNNLossLabels> labels, NSArray<MPSImage> destinationImage);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:labels:")
    public native NSArray<MPSImage> encodeBatchToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray <MPSCNNLossLabels> labels);
    /*</methods>*/
}
