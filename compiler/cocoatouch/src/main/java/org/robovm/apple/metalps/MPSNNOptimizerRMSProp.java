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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNOptimizerRMSProp/*</name>*/ 
    extends /*<extends>*/MPSNNOptimizer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNOptimizerRMSPropPtr extends Ptr<MPSNNOptimizerRMSProp, MPSNNOptimizerRMSPropPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNOptimizerRMSProp.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNOptimizerRMSProp() {}
    protected MPSNNOptimizerRMSProp(Handle h, long handle) { super(h, handle); }
    protected MPSNNOptimizerRMSProp(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:learningRate:")
    public MPSNNOptimizerRMSProp(MTLDevice device, float learningRate) { super((SkipInit) null); initObject(init(device, learningRate)); }
    @Method(selector = "initWithDevice:decay:epsilon:optimizerDescriptor:")
    public MPSNNOptimizerRMSProp(MTLDevice device, double decay, float epsilon, MPSNNOptimizerDescriptor optimizerDescriptor) { super((SkipInit) null); initObject(init(device, decay, epsilon, optimizerDescriptor)); }
    @Method(selector = "initWithCoder:")
    public MPSNNOptimizerRMSProp(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSNNOptimizerRMSProp(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "decay")
    public native double getDecay();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:learningRate:")
    protected native @Pointer long init(MTLDevice device, float learningRate);
    @Method(selector = "initWithDevice:decay:epsilon:optimizerDescriptor:")
    protected native @Pointer long init(MTLDevice device, double decay, float epsilon, MPSNNOptimizerDescriptor optimizerDescriptor);
    @Method(selector = "encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputSumOfSquaresVector:resultValuesVector:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSVector inputGradientVector, MPSVector inputValuesVector, MPSVector inputSumOfSquaresVector, MPSVector resultValuesVector);
    @Method(selector = "encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNConvolutionGradientState convolutionGradientState, MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState, NSArray<MPSVector> inputSumOfSquaresVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);
    @Method(selector = "encodeToCommandBuffer:batchNormalizationState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationState, NSArray<MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);
    @Method(selector = "encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationGradientState, MPSCNNBatchNormalizationState batchNormalizationSourceState, NSArray<MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);
    /*</methods>*/
}
