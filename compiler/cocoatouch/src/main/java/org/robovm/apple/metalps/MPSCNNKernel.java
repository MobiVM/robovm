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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNKernel/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNKernelPtr extends Ptr<MPSCNNKernel, MPSCNNKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNKernel() {}
    protected MPSCNNKernel(Handle h, long handle) { super(h, handle); }
    protected MPSCNNKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSCNNKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSCNNKernel(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNKernel(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offset")
    public native @ByVal MPSOffset getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal MPSOffset v);
    @Property(selector = "clipRect")
    public native @ByVal MTLRegion getClipRect();
    @Property(selector = "setClipRect:")
    public native void setClipRect(@ByVal MTLRegion v);
    @Property(selector = "destinationFeatureChannelOffset")
    public native @MachineSizedUInt long getDestinationFeatureChannelOffset();
    @Property(selector = "setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@MachineSizedUInt long v);
    @Property(selector = "sourceFeatureChannelOffset")
    public native @MachineSizedUInt long getSourceFeatureChannelOffset();
    @Property(selector = "setSourceFeatureChannelOffset:")
    public native void setSourceFeatureChannelOffset(@MachineSizedUInt long v);
    @Property(selector = "sourceFeatureChannelMaxCount")
    public native @MachineSizedUInt long getSourceFeatureChannelMaxCount();
    @Property(selector = "setSourceFeatureChannelMaxCount:")
    public native void setSourceFeatureChannelMaxCount(@MachineSizedUInt long v);
    @Property(selector = "edgeMode")
    public native MPSImageEdgeMode getEdgeMode();
    @Property(selector = "setEdgeMode:")
    public native void setEdgeMode(MPSImageEdgeMode v);
    @Property(selector = "kernelWidth")
    public native @MachineSizedUInt long getKernelWidth();
    @Property(selector = "kernelHeight")
    public native @MachineSizedUInt long getKernelHeight();
    @Property(selector = "strideInPixelsX")
    public native @MachineSizedUInt long getStrideInPixelsX();
    @Property(selector = "strideInPixelsY")
    public native @MachineSizedUInt long getStrideInPixelsY();
    @Property(selector = "dilationRateX")
    public native @MachineSizedUInt long getDilationRateX();
    @Property(selector = "dilationRateY")
    public native @MachineSizedUInt long getDilationRateY();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isBackwards")
    public native boolean isBackwards();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "isStateModified")
    public native boolean isStateModified();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "padding")
    public native MPSNNPadding getPadding();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPadding:")
    public native void setPadding(MPSNNPadding v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "destinationImageAllocator")
    public native MPSImageAllocator getDestinationImageAllocator();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(MPSImageAllocator v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationState:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSState destinationState, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationImages:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray<MPSImage> destinationImages);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationStates:destinationImages:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray<? extends MPSState> destinationStates, NSArray<MPSImage> destinationImages);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationState:destinationStateIsTemporary:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSState.MPSStatePtr outState, boolean isTemporary);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationStates:destinationStateIsTemporary:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray.NSArrayPtr<? extends MPSState> outStates, boolean isTemporary);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateBatchForSourceImage:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getResultStateBatch(NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSState getTemporaryResult(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getTemporaryResultState(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "appendBatchBarrier")
    public native boolean appendBatchBarrier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor getDestinationImageDescriptor(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates);
    /*</methods>*/
}
