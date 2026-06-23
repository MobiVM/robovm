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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4ComputeCommandEncoderAdapter/*</name>*/ 
    extends /*<extends>*/MTL4CommandEncoderAdapter/*</extends>*/ 
    /*<implements>*/implements MTL4ComputeCommandEncoder/*</implements>*/ {

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
    @NotImplemented("stages")
    public MTLStages stages() { return null; }
    @NotImplemented("setComputePipelineState:")
    public void setComputePipelineState(MTLComputePipelineState state) {}
    @NotImplemented("setThreadgroupMemoryLength:atIndex:")
    public void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index) {}
    @NotImplemented("setImageblockWidth:height:")
    public void setImageblockWidthHeight(@MachineSizedUInt long width, @MachineSizedUInt long height) {}
    @NotImplemented("dispatchThreads:threadsPerThreadgroup:")
    public void dispatchThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerThreadgroup) {}
    @NotImplemented("dispatchThreadgroups:threadsPerThreadgroup:")
    public void dispatchThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerThreadgroup) {}
    @NotImplemented("dispatchThreadgroupsWithIndirectBuffer:threadsPerThreadgroup:")
    public void dispatchThreadgroups(long indirectBuffer, @ByVal MTLSize threadsPerThreadgroup) {}
    @NotImplemented("dispatchThreadsWithIndirectBuffer:")
    public void dispatchThreads(long indirectBuffer) {}
    @NotImplemented("executeCommandsInBuffer:withRange:")
    public void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange executionRange) {}
    @NotImplemented("executeCommandsInBuffer:indirectBuffer:")
    public void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandbuffer, long indirectRangeBuffer) {}
    @NotImplemented("copyFromTexture:toTexture:")
    public void copyFromTexture(MTLTexture sourceTexture, MTLTexture destinationTexture) {}
    @NotImplemented("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    public void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @MachineSizedUInt long sliceCount, @MachineSizedUInt long levelCount) {}
    @NotImplemented("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    public void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin) {}
    @NotImplemented("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    public void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long destinationBytesPerRow, @MachineSizedUInt long destinationBytesPerImage) {}
    @NotImplemented("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    public void copyFromTexture(MTLTexture sourceTexture, @MachineSizedUInt long sourceSlice, @MachineSizedUInt long sourceLevel, @ByVal MTLOrigin sourceOrigin, @ByVal MTLSize sourceSize, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long destinationBytesPerRow, @MachineSizedUInt long destinationBytesPerImage, MTLBlitOption options) {}
    @NotImplemented("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    public void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, MTLBuffer destinationBuffer, @MachineSizedUInt long destinationOffset, @MachineSizedUInt long size) {}
    @NotImplemented("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    public void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin) {}
    @NotImplemented("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    public void copyFromBuffer(MTLBuffer sourceBuffer, @MachineSizedUInt long sourceOffset, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLSize sourceSize, MTLTexture destinationTexture, @MachineSizedUInt long destinationSlice, @MachineSizedUInt long destinationLevel, @ByVal MTLOrigin destinationOrigin, MTLBlitOption options) {}
    @NotImplemented("copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:")
    public void copyFromTensor(MTLTensor sourceTensor, MTLTensorExtents sourceOrigin, MTLTensorExtents sourceDimensions, MTLTensor destinationTensor, MTLTensorExtents destinationOrigin, MTLTensorExtents destinationDimensions) {}
    @NotImplemented("generateMipmapsForTexture:")
    public void generateMipmapsForTexture(MTLTexture texture) {}
    @NotImplemented("fillBuffer:range:value:")
    public void fillBuffer(MTLBuffer buffer, @ByVal NSRange range, byte value) {}
    @NotImplemented("optimizeContentsForGPUAccess:")
    public void optimizeContentsForGPUAccess(MTLTexture texture) {}
    @NotImplemented("optimizeContentsForGPUAccess:slice:level:")
    public void optimizeContentsForGPUAccess(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level) {}
    @NotImplemented("optimizeContentsForCPUAccess:")
    public void optimizeContentsForCPUAccess(MTLTexture texture) {}
    @NotImplemented("optimizeContentsForCPUAccess:slice:level:")
    public void optimizeContentsForCPUAccess(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level) {}
    @NotImplemented("resetCommandsInBuffer:withRange:")
    public void resetCommandsInBuffer(MTLIndirectCommandBuffer buffer, @ByVal NSRange range) {}
    @NotImplemented("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    public void copyIndirectCommandBuffer(MTLIndirectCommandBuffer source, @ByVal NSRange sourceRange, MTLIndirectCommandBuffer destination, @MachineSizedUInt long destinationIndex) {}
    @NotImplemented("optimizeIndirectCommandBuffer:withRange:")
    public void optimizeIndirectCommandBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange range) {}
    @NotImplemented("setArgumentTable:")
    public void setArgumentTable(MTL4ArgumentTable argumentTable) {}
    @NotImplemented("buildAccelerationStructure:descriptor:scratchBuffer:")
    public void buildAccelerationStructure(MTLAccelerationStructure accelerationStructure, MTL4AccelerationStructureDescriptor descriptor, @ByVal MTL4BufferRange scratchBuffer) {}
    @NotImplemented("refitAccelerationStructure:descriptor:destination:scratchBuffer:")
    public void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTL4AccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, @ByVal MTL4BufferRange scratchBuffer) {}
    @NotImplemented("refitAccelerationStructure:descriptor:destination:scratchBuffer:options:")
    public void refitAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTL4AccelerationStructureDescriptor descriptor, MTLAccelerationStructure destinationAccelerationStructure, @ByVal MTL4BufferRange scratchBuffer, MTLAccelerationStructureRefitOptions options) {}
    @NotImplemented("copyAccelerationStructure:toAccelerationStructure:")
    public void copyAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure) {}
    @NotImplemented("writeCompactedAccelerationStructureSize:toBuffer:")
    public void writeCompactedAccelerationStructureSize(MTLAccelerationStructure accelerationStructure, @ByVal MTL4BufferRange buffer) {}
    @NotImplemented("copyAndCompactAccelerationStructure:toAccelerationStructure:")
    public void copyAndCompactAccelerationStructure(MTLAccelerationStructure sourceAccelerationStructure, MTLAccelerationStructure destinationAccelerationStructure) {}
    @NotImplemented("writeTimestampWithGranularity:intoHeap:atIndex:")
    public void writeTimestampWithGranularity(MTL4TimestampGranularity granularity, MTL4CounterHeap counterHeap, @MachineSizedUInt long index) {}
    /*</methods>*/
}
