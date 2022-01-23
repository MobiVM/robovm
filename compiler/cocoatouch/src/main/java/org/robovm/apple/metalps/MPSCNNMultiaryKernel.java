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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNMultiaryKernel/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNMultiaryKernelPtr extends Ptr<MPSCNNMultiaryKernel, MPSCNNMultiaryKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNMultiaryKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNMultiaryKernel() {}
    protected MPSCNNMultiaryKernel(Handle h, long handle) { super(h, handle); }
    protected MPSCNNMultiaryKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:sourceCount:")
    public MPSCNNMultiaryKernel(MTLDevice device, @MachineSizedUInt long sourceCount) { super((SkipInit) null); initObject(init(device, sourceCount)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNMultiaryKernel(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNMultiaryKernel(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceCount")
    public native @MachineSizedUInt long getSourceCount();
    @Property(selector = "clipRect")
    public native @ByVal MTLRegion getClipRect();
    @Property(selector = "setClipRect:")
    public native void setClipRect(@ByVal MTLRegion v);
    @Property(selector = "destinationFeatureChannelOffset")
    public native @MachineSizedUInt long getDestinationFeatureChannelOffset();
    @Property(selector = "setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@MachineSizedUInt long v);
    @Property(selector = "isBackwards")
    public native boolean isBackwards();
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
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:sourceCount:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long sourceCount);
    @Method(selector = "offsetAtIndex:")
    public native @ByVal MPSOffset offsetAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setOffset:atIndex:")
    public native void setOffset(@ByVal MPSOffset offset, @MachineSizedUInt long index);
    @Method(selector = "sourceFeatureChannelOffsetAtIndex:")
    public native @MachineSizedUInt long sourceFeatureChannelOffsetAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setSourceFeatureChannelOffset:atIndex:")
    public native void setSourceFeatureChannelOffset(@MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "sourceFeatureChannelMaxCountAtIndex:")
    public native @MachineSizedUInt long sourceFeatureChannelMaxCountAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setSourceFeatureChannelMaxCount:atIndex:")
    public native void setSourceFeatureChannelMaxCount(@MachineSizedUInt long count, @MachineSizedUInt long index);
    @Method(selector = "edgeModeAtIndex:")
    public native MPSImageEdgeMode edgeModeAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setEdgeMode:atIndex:")
    public native void setEdgeMode(MPSImageEdgeMode edgeMode, @MachineSizedUInt long index);
    @Method(selector = "kernelWidthAtIndex:")
    public native @MachineSizedUInt long kernelWidthAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setKernelWidth:atIndex:")
    public native void setKernelWidth(@MachineSizedUInt long width, @MachineSizedUInt long index);
    @Method(selector = "kernelHeightAtIndex:")
    public native @MachineSizedUInt long kernelHeightAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setKernelHeight:atIndex:")
    public native void setKernelHeight(@MachineSizedUInt long height, @MachineSizedUInt long index);
    @Method(selector = "strideInPixelsXatIndex:")
    public native @MachineSizedUInt long strideInPixelsXatIndex(@MachineSizedUInt long index);
    @Method(selector = "setStrideInPixelsX:atIndex:")
    public native void setStrideInPixelsX(@MachineSizedUInt long stride, @MachineSizedUInt long index);
    @Method(selector = "strideInPixelsYatIndex:")
    public native @MachineSizedUInt long strideInPixelsYatIndex(@MachineSizedUInt long index);
    @Method(selector = "setStrideInPixelsY:atIndex:")
    public native void setStrideInPixelsY(@MachineSizedUInt long stride, @MachineSizedUInt long index);
    @Method(selector = "dilationRateXatIndex:")
    public native @MachineSizedUInt long dilationRateXatIndex(@MachineSizedUInt long index);
    @Method(selector = "setDilationRateX:atIndex:")
    public native void setDilationRateX(@MachineSizedUInt long dilationRate, @MachineSizedUInt long index);
    @Method(selector = "dilationRateYatIndex:")
    public native @MachineSizedUInt long dilationRateYatIndex(@MachineSizedUInt long index);
    @Method(selector = "setDilationRateY:atIndex:")
    public native void setDilationRateY(@MachineSizedUInt long dilationRate, @MachineSizedUInt long index);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImages:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, MPSImage destinationImage);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationImages:")
    public native void encodeBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImages, NSArray<MPSImage> destinationImages);
    @Method(selector = "encodeToCommandBuffer:sourceImages:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImageBatches);
    @Method(selector = "encodeToCommandBuffer:sourceImages:destinationState:destinationStateIsTemporary:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, MPSState.MPSStatePtr outState, boolean isTemporary);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:destinationStates:destinationStateIsTemporary:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImageBatches, NSArray.NSArrayPtr<? extends MPSState> outState, boolean isTemporary);
    @Method(selector = "isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();
    @Method(selector = "appendBatchBarrier")
    public native boolean appendBatchBarrier();
    @Method(selector = "resultStateForSourceImages:sourceStates:destinationImage:")
    public native MPSState getResultState(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "resultStateBatchForSourceImages:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getResultStateBatch(NSArray<NSArray<MPSImage>> sourceImages, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImages:sourceStates:destinationImage:")
    public native MPSState getTemporaryResultState(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "temporaryResultStateBatchForCommandBuffer:sourceImages:sourceStates:destinationImage:")
    public native NSArray<? extends MPSState> getTemporaryResultStateBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImage, NSArray<NSArray<? extends MPSState>> sourceStates, NSArray<MPSImage> destinationImage);
    @Method(selector = "destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor getDestinationImageDescriptor(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates);
    /*</methods>*/
}
