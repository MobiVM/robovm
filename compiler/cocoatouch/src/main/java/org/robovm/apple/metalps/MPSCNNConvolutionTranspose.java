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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionTranspose/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionTransposePtr extends Ptr<MPSCNNConvolutionTranspose, MPSCNNConvolutionTransposePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionTranspose.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNConvolutionTranspose() {}
    protected MPSCNNConvolutionTranspose(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionTranspose(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:weights:")
    public MPSCNNConvolutionTranspose(MTLDevice device, MPSCNNConvolutionDataSource weights) { super((SkipInit) null); initObject(init(device, weights)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNConvolutionTranspose(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:weights:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDataSource weights);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
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
    /*</methods>*/
}
