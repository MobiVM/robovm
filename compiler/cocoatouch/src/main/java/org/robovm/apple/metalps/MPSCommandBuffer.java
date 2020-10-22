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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCommandBuffer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLCommandBuffer/*</implements>*/ {

    /*<ptr>*/public static class MPSCommandBufferPtr extends Ptr<MPSCommandBuffer, MPSCommandBufferPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCommandBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCommandBuffer() {}
    protected MPSCommandBuffer(Handle h, long handle) { super(h, handle); }
    protected MPSCommandBuffer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCommandBuffer:")
    public MPSCommandBuffer(MTLCommandBuffer commandBuffer) { super((SkipInit) null); initObject(init(commandBuffer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "commandBuffer")
    public native MTLCommandBuffer getCommandBuffer();
    @Property(selector = "rootCommandBuffer")
    public native MTLCommandBuffer getRootCommandBuffer();
    @Property(selector = "predicate")
    public native MPSPredicate getPredicate();
    @Property(selector = "setPredicate:")
    public native void setPredicate(MPSPredicate v);
    @Property(selector = "heapProvider")
    public native MPSHeapProvider getHeapProvider();
    @Property(selector = "setHeapProvider:")
    public native void setHeapProvider(MPSHeapProvider v);
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "commandQueue")
    public native MTLCommandQueue getCommandQueue();
    @Property(selector = "retainedReferences")
    public native boolean maintainsRetainedReferences();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "errorOptions")
    public native MTLCommandBufferErrorOption getErrorOptions();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "kernelStartTime")
    public native double getKernelStartTime();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "kernelEndTime")
    public native double getKernelEndTime();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "logs")
    public native MTLLogContainer getLogs();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "GPUStartTime")
    public native double getGPUStartTime();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "GPUEndTime")
    public native double getGPUEndTime();
    @Property(selector = "status")
    public native MTLCommandBufferStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCommandBuffer:")
    protected native @Pointer long init(MTLCommandBuffer commandBuffer);
    @Method(selector = "commitAndContinue")
    public native void commitAndContinue();
    @Method(selector = "prefetchHeapForWorkloadSize:")
    public native void prefetchHeapForWorkloadSize(@MachineSizedUInt long size);
    @Method(selector = "commandBufferFromCommandQueue:")
    public static native MPSCommandBuffer commandBufferFromCommandQueue(MTLCommandQueue commandQueue);
    @Method(selector = "enqueue")
    public native void enqueue();
    @Method(selector = "commit")
    public native void commit();
    @Method(selector = "addScheduledHandler:")
    public native void addScheduledHandler(@Block VoidBlock1<MTLCommandBuffer> block);
    @Method(selector = "presentDrawable:")
    public native void presentDrawable(MTLDrawable drawable);
    @Method(selector = "presentDrawable:atTime:")
    public native void presentDrawableAtTime(MTLDrawable drawable, double presentationTime);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "presentDrawable:afterMinimumDuration:")
    public native void presentDrawableAfterMinimumDuration(MTLDrawable drawable, double duration);
    @Method(selector = "waitUntilScheduled")
    public native void waitUntilScheduled();
    @Method(selector = "addCompletedHandler:")
    public native void addCompletedHandler(@Block VoidBlock1<MTLCommandBuffer> block);
    @Method(selector = "waitUntilCompleted")
    public native void waitUntilCompleted();
    @Method(selector = "blitCommandEncoder")
    public native MTLBlitCommandEncoder newBlitCommandEncoder();
    @Method(selector = "renderCommandEncoderWithDescriptor:")
    public native MTLRenderCommandEncoder newRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "computeCommandEncoderWithDescriptor:")
    public native MTLComputeCommandEncoder computeCommandEncoder(MTLComputePassDescriptor computePassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "blitCommandEncoderWithDescriptor:")
    public native MTLBlitCommandEncoder blitCommandEncoder(MTLBlitPassDescriptor blitPassDescriptor);
    @Method(selector = "computeCommandEncoder")
    public native MTLComputeCommandEncoder newComputeCommandEncoder();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "computeCommandEncoderWithDispatchType:")
    public native MTLComputeCommandEncoder newComputeCommandEncoder(MTLDispatchType dispatchType);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeWaitForEvent:value:")
    public native void encodeWaitForEvent(MTLEvent event, long value);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeSignalEvent:value:")
    public native void encodeSignalEvent(MTLEvent event, long value);
    @Method(selector = "parallelRenderCommandEncoderWithDescriptor:")
    public native MTLParallelRenderCommandEncoder newParallelRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resourceStateCommandEncoder")
    public native MTLResourceStateCommandEncoder resourceStateCommandEncoder();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "resourceStateCommandEncoderWithDescriptor:")
    public native MTLResourceStateCommandEncoder resourceStateCommandEncoder(MTLResourceStatePassDescriptor resourceStatePassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "accelerationStructureCommandEncoder")
    public native MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "pushDebugGroup:")
    public native void pushDebugGroup(String string);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "popDebugGroup")
    public native void popDebugGroup();
    /*</methods>*/
}
