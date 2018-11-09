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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNBinaryKernel/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNBinaryKernelPtr extends Ptr<MPSCNNBinaryKernel, MPSCNNBinaryKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNBinaryKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNBinaryKernel() {}
    protected MPSCNNBinaryKernel(Handle h, long handle) { super(h, handle); }
    protected MPSCNNBinaryKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSCNNBinaryKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNBinaryKernel(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNBinaryKernel(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryOffset")
    public native @ByVal MPSOffset getPrimaryOffset();
    @Property(selector = "setPrimaryOffset:")
    public native void setPrimaryOffset(@ByVal MPSOffset v);
    @Property(selector = "secondaryOffset")
    public native @ByVal MPSOffset getSecondaryOffset();
    @Property(selector = "setSecondaryOffset:")
    public native void setSecondaryOffset(@ByVal MPSOffset v);
    @Property(selector = "clipRect")
    public native @ByVal MTLRegion getClipRect();
    @Property(selector = "setClipRect:")
    public native void setClipRect(@ByVal MTLRegion v);
    @Property(selector = "destinationFeatureChannelOffset")
    public native @MachineSizedUInt long getDestinationFeatureChannelOffset();
    @Property(selector = "setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primarySourceFeatureChannelOffset")
    public native @MachineSizedUInt long getPrimarySourceFeatureChannelOffset();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setPrimarySourceFeatureChannelOffset:")
    public native void setPrimarySourceFeatureChannelOffset(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondarySourceFeatureChannelOffset")
    public native @MachineSizedUInt long getSecondarySourceFeatureChannelOffset();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setSecondarySourceFeatureChannelOffset:")
    public native void setSecondarySourceFeatureChannelOffset(@MachineSizedUInt long v);
    @Property(selector = "primarySourceFeatureChannelMaxCount")
    public native @MachineSizedUInt long getPrimarySourceFeatureChannelMaxCount();
    @Property(selector = "setPrimarySourceFeatureChannelMaxCount:")
    public native void setPrimarySourceFeatureChannelMaxCount(@MachineSizedUInt long v);
    @Property(selector = "secondarySourceFeatureChannelMaxCount")
    public native @MachineSizedUInt long getSecondarySourceFeatureChannelMaxCount();
    @Property(selector = "setSecondarySourceFeatureChannelMaxCount:")
    public native void setSecondarySourceFeatureChannelMaxCount(@MachineSizedUInt long v);
    @Property(selector = "primaryEdgeMode")
    public native MPSImageEdgeMode getPrimaryEdgeMode();
    @Property(selector = "setPrimaryEdgeMode:")
    public native void setPrimaryEdgeMode(MPSImageEdgeMode v);
    @Property(selector = "secondaryEdgeMode")
    public native MPSImageEdgeMode getSecondaryEdgeMode();
    @Property(selector = "setSecondaryEdgeMode:")
    public native void setSecondaryEdgeMode(MPSImageEdgeMode v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryKernelWidth")
    public native @MachineSizedUInt long getPrimaryKernelWidth();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryKernelHeight")
    public native @MachineSizedUInt long getPrimaryKernelHeight();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryKernelWidth")
    public native @MachineSizedUInt long getSecondaryKernelWidth();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryKernelHeight")
    public native @MachineSizedUInt long getSecondaryKernelHeight();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryStrideInPixelsX")
    public native @MachineSizedUInt long getPrimaryStrideInPixelsX();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setPrimaryStrideInPixelsX:")
    public native void setPrimaryStrideInPixelsX(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryStrideInPixelsY")
    public native @MachineSizedUInt long getPrimaryStrideInPixelsY();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setPrimaryStrideInPixelsY:")
    public native void setPrimaryStrideInPixelsY(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryStrideInPixelsX")
    public native @MachineSizedUInt long getSecondaryStrideInPixelsX();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryStrideInPixelsY")
    public native @MachineSizedUInt long getSecondaryStrideInPixelsY();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryDilationRateX")
    public native @MachineSizedUInt long getPrimaryDilationRateX();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "primaryDilationRateY")
    public native @MachineSizedUInt long getPrimaryDilationRateY();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryDilationRateX")
    public native @MachineSizedUInt long getSecondaryDilationRateX();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "secondaryDilationRateY")
    public native @MachineSizedUInt long getSecondaryDilationRateY();
    @Property(selector = "isBackwards")
    public native boolean isBackwards();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "isStateModified")
    public native boolean isStateModified();
    @Property(selector = "padding")
    public native MPSNNPadding getPadding();
    @Property(selector = "setPadding:")
    public native void setPadding(MPSNNPadding v);
    @Property(selector = "destinationImageAllocator")
    public native MPSImageAllocator getDestinationImageAllocator();
    @Property(selector = "setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(MPSImageAllocator v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:primaryImage:secondaryImage:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage primaryImage, MPSImage secondaryImage, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:primaryImages:secondaryImages:destinationImages:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> primaryImages, NSArray<MPSImage> secondaryImages, NSArray<MPSImage> destinationImages);
    @Method(selector = "encodeToCommandBuffer:primaryImage:secondaryImage:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage primaryImage, MPSImage secondaryImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:primaryImages:secondaryImages:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> primaryImage, NSArray<MPSImage> secondaryImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeToCommandBuffer:primaryImage:secondaryImage:destinationState:destinationStateIsTemporary:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, MPSImage primaryImage, MPSImage secondaryImage, MPSState.MPSStatePtr outState, boolean isTemporary);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:primaryImages:secondaryImages:destinationStates:destinationStateIsTemporary:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> primaryImages, NSArray<MPSImage> secondaryImages, NSArray.NSArrayPtr<? extends MPSState> outState, boolean isTemporary);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState getResultState(MPSImage primaryImage, MPSImage secondaryImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resultStateBatchForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getResultStateBatch(NSArray<MPSImage> primaryImage, NSArray<MPSImage> secondaryImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateForCommandBuffer:primaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState getTemporaryResultState(MTLCommandBuffer commandBuffer, MPSImage primaryImage, MPSImage secondaryImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:primaryImage:secondaryImage:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getTemporaryResultStateBatch(MTLCommandBuffer commandBuffer, NSArray<MPSImage> primaryImage, NSArray<MPSImage> secondaryImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
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
    @Method(selector = "destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor getDestinationImageDescriptor(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates);
    /*</methods>*/
}
