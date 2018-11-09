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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNMatrixTrainingLayer/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNMatrixTrainingLayerPtr extends Ptr<MPSRNNMatrixTrainingLayer, MPSRNNMatrixTrainingLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNMatrixTrainingLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSRNNMatrixTrainingLayer() {}
    protected MPSRNNMatrixTrainingLayer(Handle h, long handle) { super(h, handle); }
    protected MPSRNNMatrixTrainingLayer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptor:trainableWeights:")
    public MPSRNNMatrixTrainingLayer(MTLDevice device, MPSRNNDescriptor rnnDescriptor, NSMutableArray<MPSMatrix> trainableWeights) { super((SkipInit) null); initObject(init(device, rnnDescriptor, trainableWeights)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSRNNMatrixTrainingLayer(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSRNNMatrixTrainingLayer(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "storeAllIntermediateStates")
    public native boolean isStoreAllIntermediateStates();
    @Property(selector = "setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean v);
    @Property(selector = "recurrentOutputIsTemporary")
    public native boolean isRecurrentOutputIsTemporary();
    @Property(selector = "setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean v);
    @Property(selector = "trainingStateIsTemporary")
    public native boolean isTrainingStateIsTemporary();
    @Property(selector = "setTrainingStateIsTemporary:")
    public native void setTrainingStateIsTemporary(boolean v);
    @Property(selector = "accumulateWeightGradients")
    public native boolean isAccumulateWeightGradients();
    @Property(selector = "setAccumulateWeightGradients:")
    public native void setAccumulateWeightGradients(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithDevice:rnnDescriptor:trainableWeights:")
    protected native @Pointer long init(MTLDevice device, MPSRNNDescriptor rnnDescriptor, NSMutableArray<MPSMatrix> trainableWeights);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "createWeightGradientMatrices:dataType:")
    public native void createWeightGradientMatrices(NSMutableArray<MPSMatrix> matricesOut, MPSDataType dataType);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "createTemporaryWeightGradientMatrices:dataType:commandBuffer:")
    public native void createTemporaryWeightGradientMatrices(NSMutableArray<MPSMatrix> matricesOut, MPSDataType dataType, MTLCommandBuffer commandBuffer);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "createWeightMatrices:")
    public native void createWeightMatrices(NSMutableArray<MPSMatrix> matricesOut);
    @Method(selector = "encodeCopyWeightsToCommandBuffer:weights:matrixId:matrix:copyFromWeightsToMatrix:matrixOffset:")
    public native void encodeCopyWeightsToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> weights, MPSRNNMatrixId matrixId, MPSMatrix matrix, boolean copyFromWeightsToMatrix, @ByVal MTLOrigin matrixOffset);
    @Method(selector = "encodeForwardSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeForwardSequenceToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> sourceMatrices, MachineSizedUIntPtr sourceOffsets, NSArray<MPSMatrix> destinationMatrices, MachineSizedUIntPtr destinationOffsets, NSMutableArray<MPSRNNMatrixTrainingState> trainingStates, MPSRNNRecurrentMatrixState recurrentInputState, NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<MPSMatrix> weights);
    @Method(selector = "encodeForwardSequenceToCommandBuffer:sourceMatrices:destinationMatrices:trainingStates:weights:")
    public native void encodeForwardSequenceToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> sourceMatrices, NSArray<MPSMatrix> destinationMatrices, NSMutableArray<MPSRNNMatrixTrainingState> trainingStates, NSArray<MPSMatrix> weights);
    @Method(selector = "encodeGradientSequenceToCommandBuffer:forwardSources:forwardSourceOffsets:sourceGradients:sourceGradientOffsets:destinationGradients:destinationOffsets:weightGradients:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeGradientSequenceToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> forwardSources, MachineSizedUIntPtr forwardSourceOffsets, NSArray<MPSMatrix> sourceGradients, MachineSizedUIntPtr sourceGradientOffsets, NSArray<MPSMatrix> destinationGradients, MachineSizedUIntPtr destinationOffsets, NSArray<MPSMatrix> weightGradients, NSArray<MPSRNNMatrixTrainingState> trainingStates, MPSRNNRecurrentMatrixState recurrentInputState, NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<MPSMatrix> weights);
    @Method(selector = "encodeGradientSequenceToCommandBuffer:forwardSources:sourceGradients:destinationGradients:weightGradients:trainingStates:weights:")
    public native void encodeGradientSequenceToCommandBuffer(MTLCommandBuffer commandBuffer, NSArray<MPSMatrix> forwardSources, NSArray<MPSMatrix> sourceGradients, NSArray<MPSMatrix> destinationGradients, NSArray<MPSMatrix> weightGradients, NSArray<MPSRNNMatrixTrainingState> trainingStates, NSArray<MPSMatrix> weights);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSRNNMatrixTrainingLayer copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
