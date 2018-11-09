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
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNMatrixInferenceLayer/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNMatrixInferenceLayerPtr extends Ptr<MPSRNNMatrixInferenceLayer, MPSRNNMatrixInferenceLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNMatrixInferenceLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSRNNMatrixInferenceLayer() {}
    protected MPSRNNMatrixInferenceLayer(Handle h, long handle) { super(h, handle); }
    protected MPSRNNMatrixInferenceLayer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptor:")
    public MPSRNNMatrixInferenceLayer(MTLDevice device, MPSRNNDescriptor rnnDescriptor) { super((SkipInit) null); initObject(init(device, rnnDescriptor)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptors:")
    public MPSRNNMatrixInferenceLayer(MTLDevice device, NSArray<MPSRNNDescriptor> rnnDescriptors) { super((SkipInit) null); initObject(init(device, rnnDescriptors)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSRNNMatrixInferenceLayer(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSRNNMatrixInferenceLayer(NSCoder decoder) { super(decoder); }
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
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequence(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> sourceMatrices, MachineSizedUIntPtr sourceOffsets, NSArray<MPSMatrix> destinationMatrices, MachineSizedUIntPtr destinationOffsets, MPSRNNRecurrentMatrixState recurrentInputState, NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);
    @Method(selector = "encodeSequenceToCommandBuffer:sourceMatrices:destinationMatrices:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequence(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> sourceMatrices, NSArray<MPSMatrix> destinationMatrices, MPSRNNRecurrentMatrixState recurrentInputState, NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);
    @Method(selector = "encodeBidirectionalSequenceToCommandBuffer:sourceSequence:destinationForwardMatrices:destinationBackwardMatrices:")
    public native void encodeBidirectionalSequence(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> sourceSequence, NSArray<MPSMatrix> destinationForwardMatrices, NSArray<MPSMatrix> destinationBackwardMatrices);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSRNNMatrixInferenceLayer copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
