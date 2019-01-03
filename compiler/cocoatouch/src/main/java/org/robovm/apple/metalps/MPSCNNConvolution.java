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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolution/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionPtr extends Ptr<MPSCNNConvolution, MPSCNNConvolutionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolution.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNConvolution() {}
    protected MPSCNNConvolution(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolution(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:weights:")
    public MPSCNNConvolution(MTLDevice device, MPSCNNConvolutionDataSource weights) { super((SkipInit) null); initObject(init(device, weights)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:convolutionDescriptor:kernelWeights:biasTerms:flags:")
    public MPSCNNConvolution(MTLDevice device, MPSCNNConvolutionDescriptor convolutionDescriptor, FloatPtr kernelWeights, FloatPtr biasTerms, MPSCNNConvolutionFlags flags) { super((SkipInit) null); initObject(init(device, convolutionDescriptor, kernelWeights, biasTerms, flags)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSCNNConvolution(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNConvolution(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "groups")
    public native @MachineSizedUInt long getGroups();
    @Property(selector = "dataSource")
    public native MPSCNNConvolutionDataSource getDataSource();
    @Property(selector = "subPixelScaleFactor")
    public native @MachineSizedUInt long getSubPixelScaleFactor();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "neuron")
    public native MPSCNNNeuron getNeuron();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "neuronType")
    public native MPSCNNNeuronType getNeuronType();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "neuronParameterA")
    public native float getNeuronParameterA();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "neuronParameterB")
    public native float getNeuronParameterB();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "neuronParameterC")
    public native float getNeuronParameterC();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "fusedNeuronDescriptor")
    public native MPSNNNeuronDescriptor getFusedNeuronDescriptor();
    @Property(selector = "channelMultiplier")
    public native @MachineSizedUInt long getChannelMultiplier();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "accumulatorPrecisionOption")
    public native MPSNNConvolutionAccumulatorPrecisionOption getAccumulatorPrecisionOption();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setAccumulatorPrecisionOption:")
    public native void setAccumulatorPrecisionOption(MPSNNConvolutionAccumulatorPrecisionOption v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:weights:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource weights);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:convolutionDescriptor:kernelWeights:biasTerms:flags:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDescriptor convolutionDescriptor, FloatPtr kernelWeights, FloatPtr biasTerms, MPSCNNConvolutionFlags flags);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionGradientState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateBatchForSourceImage:sourceStates:destinationImage:")
    public native NSArray<MPSCNNConvolutionGradientState> getResultStateBatch(NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionGradientState getResultState(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native NSArray<MPSCNNConvolutionGradientState> getTemporaryResultStateBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "reloadWeightsAndBiasesWithDataSource:")
    public native void reloadWeightsAndBiases(MPSCNNConvolutionDataSource dataSource);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiases(MTLCommandBuffer commandBuffer, MPSCNNConvolutionWeightsAndBiasesState state);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "exportWeightsAndBiasesWithCommandBuffer:resultStateCanBeTemporary:")
    public native MPSCNNConvolutionWeightsAndBiasesState exportWeightsAndBiases(MTLCommandBuffer commandBuffer, boolean resultStateCanBeTemporary);
    /*</methods>*/
}
