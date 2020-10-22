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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLCommandBuffer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "commandQueue")
    MTLCommandQueue getCommandQueue();
    @Property(selector = "retainedReferences")
    boolean maintainsRetainedReferences();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "errorOptions")
    MTLCommandBufferErrorOption getErrorOptions();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "kernelStartTime")
    double getKernelStartTime();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "kernelEndTime")
    double getKernelEndTime();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "logs")
    MTLLogContainer getLogs();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "GPUStartTime")
    double getGPUStartTime();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "GPUEndTime")
    double getGPUEndTime();
    @Property(selector = "status")
    MTLCommandBufferStatus getStatus();
    @Property(selector = "error")
    NSError getError();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "enqueue")
    void enqueue();
    @Method(selector = "commit")
    void commit();
    @Method(selector = "addScheduledHandler:")
    void addScheduledHandler(@Block VoidBlock1<MTLCommandBuffer> block);
    @Method(selector = "presentDrawable:")
    void presentDrawable(MTLDrawable drawable);
    @Method(selector = "presentDrawable:atTime:")
    void presentDrawableAtTime(MTLDrawable drawable, double presentationTime);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "presentDrawable:afterMinimumDuration:")
    void presentDrawableAfterMinimumDuration(MTLDrawable drawable, double duration);
    @Method(selector = "waitUntilScheduled")
    void waitUntilScheduled();
    @Method(selector = "addCompletedHandler:")
    void addCompletedHandler(@Block VoidBlock1<MTLCommandBuffer> block);
    @Method(selector = "waitUntilCompleted")
    void waitUntilCompleted();
    @Method(selector = "blitCommandEncoder")
    MTLBlitCommandEncoder newBlitCommandEncoder();
    @Method(selector = "renderCommandEncoderWithDescriptor:")
    MTLRenderCommandEncoder newRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "computeCommandEncoderWithDescriptor:")
    MTLComputeCommandEncoder computeCommandEncoder(MTLComputePassDescriptor computePassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "blitCommandEncoderWithDescriptor:")
    MTLBlitCommandEncoder blitCommandEncoder(MTLBlitPassDescriptor blitPassDescriptor);
    @Method(selector = "computeCommandEncoder")
    MTLComputeCommandEncoder newComputeCommandEncoder();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "computeCommandEncoderWithDispatchType:")
    MTLComputeCommandEncoder newComputeCommandEncoder(MTLDispatchType dispatchType);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeWaitForEvent:value:")
    void encodeWaitForEvent(MTLEvent event, long value);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeSignalEvent:value:")
    void encodeSignalEvent(MTLEvent event, long value);
    @Method(selector = "parallelRenderCommandEncoderWithDescriptor:")
    MTLParallelRenderCommandEncoder newParallelRenderCommandEncoder(MTLRenderPassDescriptor renderPassDescriptor);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resourceStateCommandEncoder")
    MTLResourceStateCommandEncoder resourceStateCommandEncoder();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "resourceStateCommandEncoderWithDescriptor:")
    MTLResourceStateCommandEncoder resourceStateCommandEncoder(MTLResourceStatePassDescriptor resourceStatePassDescriptor);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "accelerationStructureCommandEncoder")
    MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "pushDebugGroup:")
    void pushDebugGroup(String string);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "popDebugGroup")
    void popDebugGroup();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
