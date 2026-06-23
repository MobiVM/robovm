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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4RenderCommandEncoderAdapter/*</name>*/ 
    extends /*<extends>*/MTL4CommandEncoderAdapter/*</extends>*/ 
    /*<implements>*/implements MTL4RenderCommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("tileWidth")
    public @MachineSizedUInt long getTileWidth() { return 0; }
    @NotImplemented("tileHeight")
    public @MachineSizedUInt long getTileHeight() { return 0; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setColorAttachmentMap:")
    public void setColorAttachmentMap(MTLLogicalToPhysicalColorAttachmentMap mapping) {}
    @NotImplemented("setRenderPipelineState:")
    public void setRenderPipelineState(MTLRenderPipelineState pipelineState) {}
    @NotImplemented("setViewport:")
    public void setViewport(@ByVal MTLViewport viewport) {}
    @NotImplemented("setViewports:count:")
    public void setViewports(MTLViewport viewports, @MachineSizedUInt long count) {}
    @NotImplemented("setVertexAmplificationCount:viewMappings:")
    public void setVertexAmplificationCount(@MachineSizedUInt long count, MTLVertexAmplificationViewMapping viewMappings) {}
    @NotImplemented("setCullMode:")
    public void setCullMode(MTLCullMode cullMode) {}
    @NotImplemented("setDepthClipMode:")
    public void setDepthClipMode(MTLDepthClipMode depthClipMode) {}
    @NotImplemented("setDepthBias:slopeScale:clamp:")
    public void setDepthBias(float depthBias, float slopeScale, float clamp) {}
    @NotImplemented("setDepthTestMinBound:maxBound:")
    public void setDepthTestMinMaxBound(float minBound, float maxBound) {}
    @NotImplemented("setScissorRect:")
    public void setScissorRect(@ByVal MTLScissorRect rect) {}
    @NotImplemented("setScissorRects:count:")
    public void setScissorRects(MTLScissorRect scissorRects, @MachineSizedUInt long count) {}
    @NotImplemented("setTriangleFillMode:")
    public void setTriangleFillMode(MTLTriangleFillMode fillMode) {}
    @NotImplemented("setBlendColorRed:green:blue:alpha:")
    public void setBlendColor(float red, float green, float blue, float alpha) {}
    @NotImplemented("setDepthStencilState:")
    public void setDepthStencilState(MTLDepthStencilState depthStencilState) {}
    @NotImplemented("setStencilReferenceValue:")
    public void setStencilReferenceValue(int referenceValue) {}
    @NotImplemented("setStencilFrontReferenceValue:backReferenceValue:")
    public void setStencilFrontBackReferenceValues(int frontReferenceValue, int backReferenceValue) {}
    @NotImplemented("setVisibilityResultMode:offset:")
    public void setVisibilityResultMode(MTLVisibilityResultMode mode, @MachineSizedUInt long offset) {}
    @NotImplemented("setColorStoreAction:atIndex:")
    public void setColorStoreAction(MTLStoreAction storeAction, @MachineSizedUInt long colorAttachmentIndex) {}
    @NotImplemented("setDepthStoreAction:")
    public void setDepthStoreAction(MTLStoreAction storeAction) {}
    @NotImplemented("setStencilStoreAction:")
    public void setStencilStoreAction(MTLStoreAction storeAction) {}
    @NotImplemented("drawPrimitives:vertexStart:vertexCount:")
    public void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount) {}
    @NotImplemented("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    public void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount) {}
    @NotImplemented("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    public void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance) {}
    @NotImplemented("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:")
    public void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength) {}
    @NotImplemented("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:")
    public void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, @MachineSizedUInt long instanceCount) {}
    @NotImplemented("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:baseVertex:baseInstance:")
    public void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, @MachineSizedUInt long instanceCount, @MachineSizedSInt long baseVertex, @MachineSizedUInt long baseInstance) {}
    @NotImplemented("drawPrimitives:indirectBuffer:")
    public void drawPrimitives(MTLPrimitiveType primitiveType, long indirectBuffer) {}
    @NotImplemented("drawIndexedPrimitives:indexType:indexBuffer:indexBufferLength:indirectBuffer:")
    public void drawIndexedPrimitives(MTLPrimitiveType primitiveType, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, long indirectBuffer) {}
    @NotImplemented("executeCommandsInBuffer:withRange:")
    public void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange executionRange) {}
    @NotImplemented("executeCommandsInBuffer:indirectBuffer:")
    public void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, long indirectRangeBuffer) {}
    @NotImplemented("setObjectThreadgroupMemoryLength:atIndex:")
    public void setObjectThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index) {}
    @NotImplemented("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    public void drawMeshThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup) {}
    @NotImplemented("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    public void drawMeshThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup) {}
    @NotImplemented("drawMeshThreadgroupsWithIndirectBuffer:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    public void drawMeshThreadgroups(long indirectBuffer, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup) {}
    @NotImplemented("dispatchThreadsPerTile:")
    public void dispatchThreadsPerTile(@ByVal MTLSize threadsPerTile) {}
    @NotImplemented("setThreadgroupMemoryLength:offset:atIndex:")
    public void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    @NotImplemented("setArgumentTable:atStages:")
    public void setArgumentTable(MTL4ArgumentTable argumentTable, MTLRenderStages stages) {}
    @NotImplemented("setFrontFacingWinding:")
    public void setFrontFacingWinding(MTLWinding frontFacingWinding) {}
    @NotImplemented("writeTimestampWithGranularity:afterStage:intoHeap:atIndex:")
    public void writeTimestamp(MTL4TimestampGranularity granularity, MTLRenderStages stage, MTL4CounterHeap counterHeap, @MachineSizedUInt long index) {}
    /*</methods>*/
}
