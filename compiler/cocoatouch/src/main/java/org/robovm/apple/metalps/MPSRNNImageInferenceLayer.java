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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNImageInferenceLayer/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNImageInferenceLayerPtr extends Ptr<MPSRNNImageInferenceLayer, MPSRNNImageInferenceLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNImageInferenceLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSRNNImageInferenceLayer() {}
    protected MPSRNNImageInferenceLayer(Handle h, long handle) { super(h, handle); }
    protected MPSRNNImageInferenceLayer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptor:")
    public MPSRNNImageInferenceLayer(MTLDevice device, MPSRNNDescriptor rnnDescriptor) { super((SkipInit) null); initObject(init(device, rnnDescriptor)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptors:")
    public MPSRNNImageInferenceLayer(MTLDevice device, NSArray<MPSRNNDescriptor> rnnDescriptors) { super((SkipInit) null); initObject(init(device, rnnDescriptors)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSRNNImageInferenceLayer(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "numberOfLayers")
    public native @MachineSizedUInt long getNumberOfLayers();
    @Property(selector = "recurrentOutputIsTemporary")
    public native boolean isRecurrentOutputIsTemporary();
    @Property(selector = "setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean v);
    @Property(selector = "storeAllIntermediateStates")
    public native boolean isStoreAllIntermediateStates();
    @Property(selector = "setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean v);
    @Property(selector = "bidirectionalCombineMode")
    public native MPSRNNBidirectionalCombineMode getBidirectionalCombineMode();
    @Property(selector = "setBidirectionalCombineMode:")
    public native void setBidirectionalCombineMode(MPSRNNBidirectionalCombineMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSRNNDescriptor rnnDescriptor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptors:")
    protected native @Pointer long init(MTLDevice device, NSArray<MPSRNNDescriptor> rnnDescriptors);
    @Method(selector = "encodeSequenceToCommandBuffer:sourceImages:destinationImages:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequence(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray<MPSImage> destinationImages, MPSRNNRecurrentImageState recurrentInputState, NSMutableArray<MPSRNNRecurrentImageState> recurrentOutputStates);
    @Method(selector = "encodeBidirectionalSequenceToCommandBuffer:sourceSequence:destinationForwardImages:destinationBackwardImages:")
    public native void encodeBidirectionalSequence(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceSequence, NSArray<MPSImage> destinationForwardImages, NSArray<MPSImage> destinationBackwardImages);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSRNNImageInferenceLayer copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
