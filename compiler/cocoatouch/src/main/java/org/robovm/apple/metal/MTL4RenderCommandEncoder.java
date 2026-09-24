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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4RenderCommandEncoder/*</name>*/ 
    /*<implements>*/extends MTL4CommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "tileWidth")
    @MachineSizedUInt long getTileWidth();
    @Property(selector = "tileHeight")
    @MachineSizedUInt long getTileHeight();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setColorAttachmentMap:")
    void setColorAttachmentMap(MTLLogicalToPhysicalColorAttachmentMap mapping);
    @Method(selector = "setRenderPipelineState:")
    void setRenderPipelineState(MTLRenderPipelineState pipelineState);
    @Method(selector = "setViewport:")
    void setViewport(@ByVal MTLViewport viewport);
    @Method(selector = "setViewports:count:")
    void setViewports(MTLViewport viewports, @MachineSizedUInt long count);
    @Method(selector = "setVertexAmplificationCount:viewMappings:")
    void setVertexAmplificationCount(@MachineSizedUInt long count, MTLVertexAmplificationViewMapping viewMappings);
    @Method(selector = "setCullMode:")
    void setCullMode(MTLCullMode cullMode);
    @Method(selector = "setDepthClipMode:")
    void setDepthClipMode(MTLDepthClipMode depthClipMode);
    @Method(selector = "setDepthBias:slopeScale:clamp:")
    void setDepthBias(float depthBias, float slopeScale, float clamp);
    @Method(selector = "setDepthTestMinBound:maxBound:")
    void setDepthTestMinMaxBound(float minBound, float maxBound);
    @Method(selector = "setScissorRect:")
    void setScissorRect(@ByVal MTLScissorRect rect);
    @Method(selector = "setScissorRects:count:")
    void setScissorRects(MTLScissorRect scissorRects, @MachineSizedUInt long count);
    @Method(selector = "setTriangleFillMode:")
    void setTriangleFillMode(MTLTriangleFillMode fillMode);
    @Method(selector = "setBlendColorRed:green:blue:alpha:")
    void setBlendColor(float red, float green, float blue, float alpha);
    @Method(selector = "setDepthStencilState:")
    void setDepthStencilState(MTLDepthStencilState depthStencilState);
    @Method(selector = "setStencilReferenceValue:")
    void setStencilReferenceValue(int referenceValue);
    @Method(selector = "setStencilFrontReferenceValue:backReferenceValue:")
    void setStencilFrontBackReferenceValues(int frontReferenceValue, int backReferenceValue);
    @Method(selector = "setVisibilityResultMode:offset:")
    void setVisibilityResultMode(MTLVisibilityResultMode mode, @MachineSizedUInt long offset);
    @Method(selector = "setColorStoreAction:atIndex:")
    void setColorStoreAction(MTLStoreAction storeAction, @MachineSizedUInt long colorAttachmentIndex);
    @Method(selector = "setDepthStoreAction:")
    void setDepthStoreAction(MTLStoreAction storeAction);
    @Method(selector = "setStencilStoreAction:")
    void setStencilStoreAction(MTLStoreAction storeAction);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:")
    void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:instanceCount:")
    void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:")
    void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:")
    void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, @MachineSizedUInt long instanceCount);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferLength:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, @MachineSizedUInt long instanceCount, @MachineSizedSInt long baseVertex, @MachineSizedUInt long baseInstance);
    @Method(selector = "drawPrimitives:indirectBuffer:")
    void drawPrimitives(MTLPrimitiveType primitiveType, long indirectBuffer);
    @Method(selector = "drawIndexedPrimitives:indexType:indexBuffer:indexBufferLength:indirectBuffer:")
    void drawIndexedPrimitives(MTLPrimitiveType primitiveType, MTLIndexType indexType, long indexBuffer, @MachineSizedUInt long indexBufferLength, long indirectBuffer);
    @Method(selector = "executeCommandsInBuffer:withRange:")
    void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, @ByVal NSRange executionRange);
    @Method(selector = "executeCommandsInBuffer:indirectBuffer:")
    void executeCommandsInBuffer(MTLIndirectCommandBuffer indirectCommandBuffer, long indirectRangeBuffer);
    @Method(selector = "setObjectThreadgroupMemoryLength:atIndex:")
    void setObjectThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index);
    @Method(selector = "drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup);
    @Method(selector = "drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup);
    @Method(selector = "drawMeshThreadgroupsWithIndirectBuffer:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroups(long indirectBuffer, @ByVal MTLSize threadsPerObjectThreadgroup, @ByVal MTLSize threadsPerMeshThreadgroup);
    @Method(selector = "dispatchThreadsPerTile:")
    void dispatchThreadsPerTile(@ByVal MTLSize threadsPerTile);
    @Method(selector = "setThreadgroupMemoryLength:offset:atIndex:")
    void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setArgumentTable:atStages:")
    void setArgumentTable(MTL4ArgumentTable argumentTable, MTLRenderStages stages);
    @Method(selector = "setFrontFacingWinding:")
    void setFrontFacingWinding(MTLWinding frontFacingWinding);
    @Method(selector = "writeTimestampWithGranularity:afterStage:intoHeap:atIndex:")
    void writeTimestamp(MTL4TimestampGranularity granularity, MTLRenderStages stage, MTL4CounterHeap counterHeap, @MachineSizedUInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
