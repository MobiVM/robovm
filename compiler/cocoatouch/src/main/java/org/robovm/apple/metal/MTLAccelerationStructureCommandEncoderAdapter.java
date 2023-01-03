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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureCommandEncoderAdapter/*</name>*/ 
    extends /*<extends>*/MTLCommandEncoderAdapter/*</extends>*/ 
    /*<implements>*/implements MTLAccelerationStructureCommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:")
    public void buildAccelerationStructure(MTLAccelerationStructure accelerationStructure, MTLAccelerationStructureDescriptor descriptor, MTLBuffer scratchBuffer, @MachineSizedUInt long scratchBufferOffset) {}
    @NotImplemented("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:")
    public void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, MTLBuffer scratchBuffer, @MachineSizedUInt long scratchBufferOffset) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:options:")
    public void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, MTLBuffer scratchBuffer, @MachineSizedUInt long scratchBufferOffset, MTLAccelerationStructureRefitOptions options) {}
    @NotImplemented("copyAccelerationStructure:toAccelerationStructure:")
    public void copyAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure) {}
    @NotImplemented("writeCompactedAccelerationStructureSize:toBuffer:offset:")
    public void writeCompactedAccelerationStructure(MTLAccelerationStructure accelerationStructure, MTLBuffer buffer, @MachineSizedUInt long offset) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("writeCompactedAccelerationStructureSize:toBuffer:offset:sizeDataType:")
    public void writeCompactedAccelerationStructure(MTLAccelerationStructure accelerationStructure, MTLBuffer buffer, @MachineSizedUInt long offset, MTLDataType sizeDataType) {}
    @NotImplemented("copyAndCompactAccelerationStructure:toAccelerationStructure:")
    public void copyAndCompactAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure) {}
    @NotImplemented("updateFence:")
    public void updateFence(MTLFence fence) {}
    @NotImplemented("waitForFence:")
    public void waitForFence(MTLFence fence) {}
    @NotImplemented("useResource:usage:")
    public void useResource(MTLResource resource, MTLResourceUsage usage) {}
    @NotImplemented("useResources:count:usage:")
    public void useResources(MTLResource resources, @MachineSizedUInt long count, MTLResourceUsage usage) {}
    @NotImplemented("useHeap:")
    public void useHeap(MTLHeap heap) {}
    @NotImplemented("useHeaps:count:")
    public void useHeaps(MTLHeap heaps, @MachineSizedUInt long count) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    public void sampleCountersInBuffer(MTLCounterSampleBuffer sampleBuffer, @MachineSizedUInt long sampleIndex, boolean barrier) {}
    /*</methods>*/
}
