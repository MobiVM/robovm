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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLAccelerationStructureCommandEncoder/*</name>*/ 
    /*<implements>*/extends MTLCommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:")
    void buildAccelerationStructure$descriptor$scratchBuffer$scratchBufferOffset$(MTLAccelerationStructure accelerationStructure, MTLAccelerationStructureDescriptor descriptor, MTLBuffer scratchBuffer, @MachineSizedUInt long scratchBufferOffset);
    @Method(selector = "refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:")
    void refitAccelerationStructure$descriptor$destination$scratchBuffer$scratchBufferOffset$(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, MTLBuffer scratchBuffer, @MachineSizedUInt long scratchBufferOffset);
    @Method(selector = "copyAccelerationStructure:toAccelerationStructure:")
    void copyAccelerationStructure$toAccelerationStructure$(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure);
    @Method(selector = "writeCompactedAccelerationStructureSize:toBuffer:offset:")
    void writeCompactedAccelerationStructureSize$toBuffer$offset$(MTLAccelerationStructure accelerationStructure, MTLBuffer buffer, @MachineSizedUInt long offset);
    @Method(selector = "copyAndCompactAccelerationStructure:toAccelerationStructure:")
    void copyAndCompactAccelerationStructure$toAccelerationStructure$(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure);
    @Method(selector = "updateFence:")
    void updateFence(MTLFence fence);
    @Method(selector = "waitForFence:")
    void waitForFence(MTLFence fence);
    @Method(selector = "useResource:usage:")
    void useResource$usage$(MTLResource resource, MTLResourceUsage usage);
    @Method(selector = "useResources:count:usage:")
    void useResources$count$usage$(MTLResource resources, @MachineSizedUInt long count, MTLResourceUsage usage);
    @Method(selector = "useHeap:")
    void useHeap(MTLHeap heap);
    @Method(selector = "useHeaps:count:")
    void useHeaps$count$(MTLHeap heaps, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBuffer$atSampleIndex$withBarrier$(MTLCounterSampleBuffer sampleBuffer, @MachineSizedUInt long sampleIndex, boolean barrier);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
