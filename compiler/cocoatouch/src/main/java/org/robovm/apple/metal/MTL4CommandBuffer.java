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
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4CommandBuffer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "beginCommandBufferWithAllocator:")
    void beginCommandBuffer(MTL4CommandAllocator allocator);
    @Method(selector = "beginCommandBufferWithAllocator:options:")
    void beginCommandBuffer(MTL4CommandAllocator allocator, MTL4CommandBufferOptions options);
    @Method(selector = "endCommandBuffer")
    void endCommandBuffer();
    @Method(selector = "renderCommandEncoderWithDescriptor:")
    MTL4RenderCommandEncoder renderCommandEncoder(MTL4RenderPassDescriptor descriptor);
    @Method(selector = "renderCommandEncoderWithDescriptor:options:")
    MTL4RenderCommandEncoder renderCommandEncoder(MTL4RenderPassDescriptor descriptor, MTL4RenderEncoderOptions options);
    @Method(selector = "computeCommandEncoder")
    MTL4ComputeCommandEncoder computeCommandEncoder();
    @Method(selector = "machineLearningCommandEncoder")
    MTL4MachineLearningCommandEncoder machineLearningCommandEncoder();
    @Method(selector = "useResidencySet:")
    void useResidencySet(MTLResidencySet residencySet);
    @Method(selector = "useResidencySets:count:")
    void useResidencySets(MTLResidencySet residencySets, @MachineSizedUInt long count);
    @Method(selector = "pushDebugGroup:")
    void pushDebugGroup(String string);
    @Method(selector = "popDebugGroup")
    void popDebugGroup();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "writeTimestampIntoHeap:atIndex:")
    void writeTimestampIntoHeap(MTL4CounterHeap counterHeap, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "resolveCounterHeap:withRange:intoBuffer:waitFence:updateFence:")
    void resolveCounterHeap(MTL4CounterHeap counterHeap, @ByVal NSRange range, @ByVal MTL4BufferRange bufferRange, MTLFence fenceToWait, MTLFence fenceToUpdate);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
