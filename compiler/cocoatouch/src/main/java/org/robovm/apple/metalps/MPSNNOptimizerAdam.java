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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNOptimizerAdam/*</name>*/ 
    extends /*<extends>*/MPSNNOptimizer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNOptimizerAdamPtr extends Ptr<MPSNNOptimizerAdam, MPSNNOptimizerAdamPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNOptimizerAdam.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNOptimizerAdam() {}
    protected MPSNNOptimizerAdam(Handle h, long handle) { super(h, handle); }
    protected MPSNNOptimizerAdam(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:learningRate:")
    public MPSNNOptimizerAdam(MTLDevice device, float learningRate) { super((SkipInit) null); initObject(init(device, learningRate)); }
    @Method(selector = "initWithDevice:beta1:beta2:epsilon:timeStep:optimizerDescriptor:")
    public MPSNNOptimizerAdam(MTLDevice device, double beta1, double beta2, float epsilon, @MachineSizedUInt long timeStep, MPSNNOptimizerDescriptor optimizerDescriptor) { super((SkipInit) null); initObject(init(device, beta1, beta2, epsilon, timeStep, optimizerDescriptor)); }
    @Method(selector = "initWithCoder:")
    public MPSNNOptimizerAdam(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSNNOptimizerAdam(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "beta1")
    public native double getBeta1();
    @Property(selector = "beta2")
    public native double getBeta2();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "timeStep")
    public native @MachineSizedUInt long getTimeStep();
    @Property(selector = "setTimeStep:")
    public native void setTimeStep(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:learningRate:")
    protected native @Pointer long init(MTLDevice device, float learningRate);
    @Method(selector = "initWithDevice:beta1:beta2:epsilon:timeStep:optimizerDescriptor:")
    protected native @Pointer long init(MTLDevice device, double beta1, double beta2, float epsilon, @MachineSizedUInt long timeStep, MPSNNOptimizerDescriptor optimizerDescriptor);
    @Method(selector = "encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:inputVelocityVector:resultValuesVector:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSVector inputGradientVector, MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector inputVelocityVector, MPSVector resultValuesVector);
    @Method(selector = "encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNConvolutionGradientState convolutionGradientState, MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState, NSArray<MPSVector> inputMomentumVectors, NSArray<MPSVector> inputVelocityVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);
    @Method(selector = "encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationState, NSArray<MPSVector> inputMomentumVectors, NSArray<MPSVector> inputVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);
    @Method(selector = "encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSCNNBatchNormalizationState batchNormalizationGradientState, MPSCNNBatchNormalizationState batchNormalizationSourceState, NSArray<MPSVector> inputMomentumVectors, NSArray<MPSVector> inputVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);
    /*</methods>*/
}
