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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4ComputeCommandEncoder/*</name>*/ 
    /*<implements>*/extends MTL4CommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "stages")
    MTLStages stages();
    @Method(selector = "setComputePipelineState:")
    void setComputePipelineState(MTLComputePipelineState state);
    @Method(selector = "setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index);
    @Method(selector = "setImageblockWidth:height:")
    void setImageblockWidthHeight(@MachineSizedUInt long width, @MachineSizedUInt long height);
    @Method(selector = "dispatchThreads:threadsPerThreadgroup:")
    void dispatchThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerThreadgroup);
    @Method(selector = "dispatchThreadgroups:threadsPerThreadgroup:")
    void dispatchThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerThreadgroup);
    @Method(selector = "dispatchThreadgroupsWithIndirectBuffer:threadsPerThreadgroup:")
    void dispatchThreadgroups(long indirectBuffer, @ByVal MTLSize threadsPerThreadgroup);
    @Method(selector = "dispatchThreadsWithIndirectBuffer:")
    void dispatchThreads(long indirectBuffer);
    @Method(selector = "executeCommandsInBuffer:withRange:")
    void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange executionRange);
    @Method(selector = "executeCommandsInBuffer:indirectBuffer:")
    void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandbuffer, long indirectRangeBuffer);
    @Method(selector = "copyFromTexture:toTexture:")
    void copyFromTexture(MTLTexture sourceTexture, MTLTexture destinationTexture);
    @Method(selector = "copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @MachineSizedUInt long sliceCount, @MachineSizedUInt long levelCount);
    @Method(selector = "copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin);
    @Method(selector = "copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long destinationBytesPerRow, @MachineSizedUInt long destinationBytesPerImage);
    @Method(selector = "copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long destinationBytesPerRow, @MachineSizedUInt long destinationBytesPerImage, MTLBlitOption options);
    @Method(selector = "copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long size);
    @Method(selector = "copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin);
    @Method(selector = "copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin, MTLBlitOption options);
    @Method(selector = "copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:")
    void copyFromTensor(MTLTensor sourceTensor, MTLTensorExtents sourceOrigin, MTLTensorExtents sourceDimensions, MTLTensor destinationTensor, MTLTensorExtents destinationOrigin, MTLTensorExtents destinationDimensions);
    @Method(selector = "generateMipmapsForTexture:")
    void generateMipmapsForTexture(MTLTexture texture);
    @Method(selector = "fillBuffer:range:value:")
    void fillBuffer(MTLBuffer buffer, @ByVal NSRange range, byte value);
    @Method(selector = "optimizeContentsForGPUAccess:")
    void optimizeContentsForGPUAccess(MTLTexture texture);
    @Method(selector = "optimizeContentsForGPUAccess:slice:level:")
    void optimizeContentsForGPUAccess(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level);
    @Method(selector = "optimizeContentsForCPUAccess:")
    void optimizeContentsForCPUAccess(MTLTexture texture);
    @Method(selector = "optimizeContentsForCPUAccess:slice:level:")
    void optimizeContentsForCPUAccess(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level);
    @Method(selector = "resetCommandsInBuffer:withRange:")
    void resetCommandsInBuffer(MTLIndirectCommandBuffer buffer, @ByVal NSRange range);
    @Method(selector = "copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    void copyIndirectCommandBuffer(MTLIndirectCommandBuffer source, @ByVal NSRange sourceRange, MTLIndirectCommandBuffer destination, @MachineSizedUInt long destinationIndex);
    @Method(selector = "optimizeIndirectCommandBuffer:withRange:")
    void optimizeIndirectCommandBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange range);
    @Method(selector = "setArgumentTable:")
    void setArgumentTable(MTL4ArgumentTable argumentTable);
    @Method(selector = "buildAccelerationStructure:descriptor:scratchBuffer:")
    void buildAccelerationStructure(MTLAccelerationStructure accelerationStructure, MTL4AccelerationStructureDescriptor descriptor, @ByVal MTL4BufferRange scratchBuffer);
    @Method(selector = "refitAccelerationStructure:descriptor:destination:scratchBuffer:")
    void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTL4AccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, @ByVal MTL4BufferRange scratchBuffer);
    @Method(selector = "refitAccelerationStructure:descriptor:destination:scratchBuffer:options:")
    void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTL4AccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, @ByVal MTL4BufferRange scratchBuffer, MTLAccelerationStructureRefitOptions options);
    @Method(selector = "copyAccelerationStructure:toAccelerationStructure:")
    void copyAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure);
    @Method(selector = "writeCompactedAccelerationStructureSize:toBuffer:")
    void writeCompactedAccelerationStructureSize(MTLAccelerationStructure accelerationStructure, @ByVal MTL4BufferRange buffer);
    @Method(selector = "copyAndCompactAccelerationStructure:toAccelerationStructure:")
    void copyAndCompactAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure);
    @Method(selector = "writeTimestampWithGranularity:intoHeap:atIndex:")
    void writeTimestampWithGranularity(MTL4TimestampGranularity granularity, MTL4CounterHeap counterHeap, @MachineSizedUInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
