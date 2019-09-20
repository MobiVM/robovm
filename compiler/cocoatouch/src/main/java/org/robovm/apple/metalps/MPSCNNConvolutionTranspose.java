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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionTranspose/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionTransposePtr extends Ptr<MPSCNNConvolutionTranspose, MPSCNNConvolutionTransposePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionTranspose.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNConvolutionTranspose() {}
    protected MPSCNNConvolutionTranspose(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionTranspose(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:weights:")
    public MPSCNNConvolutionTranspose(MTLDevice device, MPSCNNConvolutionDataSource weights) { super((SkipInit) null); initObject(init(device, weights)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNConvolutionTranspose(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNConvolutionTranspose(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "kernelOffsetX")
    public native @MachineSizedSInt long getKernelOffsetX();
    @Property(selector = "setKernelOffsetX:")
    public native void setKernelOffsetX(@MachineSizedSInt long v);
    @Property(selector = "kernelOffsetY")
    public native @MachineSizedSInt long getKernelOffsetY();
    @Property(selector = "setKernelOffsetY:")
    public native void setKernelOffsetY(@MachineSizedSInt long v);
    @Property(selector = "groups")
    public native @MachineSizedUInt long getGroups();
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
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "dataSource")
    public native MPSCNNConvolutionDataSource getDataSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:weights:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource weights);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:convolutionGradientState:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNConvolutionGradientState convolutionGradientState);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:convolutionGradientStates:")
    public native NSArray<MPSImage> encodeBatchConvolutionGradient(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<MPSCNNConvolutionGradientState> convolutionGradientState);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:convolutionGradientState:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNConvolutionGradientState convolutionGradientState, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:convolutionGradientStates:destinationImages:")
    public native void encodeBatchConvolutionGradient(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<MPSCNNConvolutionGradientState> convolutionGradientState, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionTransposeGradientState getResultStateEx(MPSImage sourceImage, NSArray<MPSCNNConvolutionGradientState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateBatchForSourceImage:sourceStates:destinationImage:")
    public native NSArray<MPSCNNConvolutionTransposeGradientState> getResultStateBatchEx(NSArray<MPSImage> sourceImage, NSArray<NSArray<MPSCNNConvolutionGradientState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionTransposeGradientState getTemporaryResultEx(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSCNNConvolutionGradientState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native NSArray<MPSCNNConvolutionTransposeGradientState> getTemporaryResultStateBatchEx(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<NSArray<MPSCNNConvolutionGradientState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiases(MTLCommandBuffer commandBuffer, MPSCNNConvolutionWeightsAndBiasesState state);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "exportWeightsAndBiasesWithCommandBuffer:resultStateCanBeTemporary:")
    public native MPSCNNConvolutionWeightsAndBiasesState exportWeightsAndBiases(MTLCommandBuffer commandBuffer, boolean resultStateCanBeTemporary);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:convolutionGradientState:destinationState:destinationStateIsTemporary:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSCNNConvolutionGradientState convolutionGradientState, MPSCNNConvolutionTransposeGradientState.MPSCNNConvolutionTransposeGradientStatePtr outState, boolean isTemporary);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:convolutionGradientStates:destinationStates:destinationStateIsTemporary:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray<MPSCNNConvolutionGradientState> convolutionGradientStates, NSArray.NSArrayPtr<MPSCNNConvolutionTransposeGradientState> outStates, boolean isTemporary);
    /*</methods>*/
}
