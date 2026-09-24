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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4MeshRenderPipelineDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4PipelineDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4MeshRenderPipelineDescriptorPtr extends Ptr<MTL4MeshRenderPipelineDescriptor, MTL4MeshRenderPipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4MeshRenderPipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4MeshRenderPipelineDescriptor() {}
    protected MTL4MeshRenderPipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4MeshRenderPipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "objectFunctionDescriptor")
    public native MTL4FunctionDescriptor getObjectFunctionDescriptor();
    @Property(selector = "setObjectFunctionDescriptor:")
    public native void setObjectFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "meshFunctionDescriptor")
    public native MTL4FunctionDescriptor getMeshFunctionDescriptor();
    @Property(selector = "setMeshFunctionDescriptor:")
    public native void setMeshFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "fragmentFunctionDescriptor")
    public native MTL4FunctionDescriptor getFragmentFunctionDescriptor();
    @Property(selector = "setFragmentFunctionDescriptor:")
    public native void setFragmentFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "maxTotalThreadsPerObjectThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerObjectThreadgroup();
    @Property(selector = "setMaxTotalThreadsPerObjectThreadgroup:")
    public native void setMaxTotalThreadsPerObjectThreadgroup(@MachineSizedUInt long v);
    @Property(selector = "maxTotalThreadsPerMeshThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerMeshThreadgroup();
    @Property(selector = "setMaxTotalThreadsPerMeshThreadgroup:")
    public native void setMaxTotalThreadsPerMeshThreadgroup(@MachineSizedUInt long v);
    @Property(selector = "requiredThreadsPerObjectThreadgroup")
    public native @ByVal MTLSize getRequiredThreadsPerObjectThreadgroup();
    @Property(selector = "setRequiredThreadsPerObjectThreadgroup:")
    public native void setRequiredThreadsPerObjectThreadgroup(@ByVal MTLSize v);
    @Property(selector = "requiredThreadsPerMeshThreadgroup")
    public native @ByVal MTLSize getRequiredThreadsPerMeshThreadgroup();
    @Property(selector = "setRequiredThreadsPerMeshThreadgroup:")
    public native void setRequiredThreadsPerMeshThreadgroup(@ByVal MTLSize v);
    @Property(selector = "objectThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean isObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth();
    @Property(selector = "setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setObjectThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean v);
    @Property(selector = "meshThreadgroupSizeIsMultipleOfThreadExecutionWidth")
    public native boolean isMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth();
    @Property(selector = "setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth:")
    public native void setMeshThreadgroupSizeIsMultipleOfThreadExecutionWidth(boolean v);
    @Property(selector = "payloadMemoryLength")
    public native @MachineSizedUInt long getPayloadMemoryLength();
    @Property(selector = "setPayloadMemoryLength:")
    public native void setPayloadMemoryLength(@MachineSizedUInt long v);
    @Property(selector = "maxTotalThreadgroupsPerMeshGrid")
    public native @MachineSizedUInt long getMaxTotalThreadgroupsPerMeshGrid();
    @Property(selector = "setMaxTotalThreadgroupsPerMeshGrid:")
    public native void setMaxTotalThreadgroupsPerMeshGrid(@MachineSizedUInt long v);
    @Property(selector = "rasterSampleCount")
    public native @MachineSizedUInt long getRasterSampleCount();
    @Property(selector = "setRasterSampleCount:")
    public native void setRasterSampleCount(@MachineSizedUInt long v);
    @Property(selector = "alphaToCoverageState")
    public native MTL4AlphaToCoverageState getAlphaToCoverageState();
    @Property(selector = "setAlphaToCoverageState:")
    public native void setAlphaToCoverageState(MTL4AlphaToCoverageState v);
    @Property(selector = "alphaToOneState")
    public native MTL4AlphaToOneState getAlphaToOneState();
    @Property(selector = "setAlphaToOneState:")
    public native void setAlphaToOneState(MTL4AlphaToOneState v);
    @Property(selector = "isRasterizationEnabled")
    public native boolean isRasterizationEnabled();
    @Property(selector = "setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean v);
    @Property(selector = "maxVertexAmplificationCount")
    public native @MachineSizedUInt long getMaxVertexAmplificationCount();
    @Property(selector = "setMaxVertexAmplificationCount:")
    public native void setMaxVertexAmplificationCount(@MachineSizedUInt long v);
    @Property(selector = "colorAttachments")
    public native MTL4RenderPipelineColorAttachmentDescriptorArray getColorAttachments();
    @Property(selector = "objectStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getObjectStaticLinkingDescriptor();
    @Property(selector = "setObjectStaticLinkingDescriptor:")
    public native void setObjectStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "meshStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getMeshStaticLinkingDescriptor();
    @Property(selector = "setMeshStaticLinkingDescriptor:")
    public native void setMeshStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "fragmentStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getFragmentStaticLinkingDescriptor();
    @Property(selector = "setFragmentStaticLinkingDescriptor:")
    public native void setFragmentStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "supportObjectBinaryLinking")
    public native boolean isSupportObjectBinaryLinking();
    @Property(selector = "setSupportObjectBinaryLinking:")
    public native void setSupportObjectBinaryLinking(boolean v);
    @Property(selector = "supportMeshBinaryLinking")
    public native boolean isSupportMeshBinaryLinking();
    @Property(selector = "setSupportMeshBinaryLinking:")
    public native void setSupportMeshBinaryLinking(boolean v);
    @Property(selector = "supportFragmentBinaryLinking")
    public native boolean isSupportFragmentBinaryLinking();
    @Property(selector = "setSupportFragmentBinaryLinking:")
    public native void setSupportFragmentBinaryLinking(boolean v);
    @Property(selector = "colorAttachmentMappingState")
    public native MTL4LogicalToPhysicalColorAttachmentMappingState getColorAttachmentMappingState();
    @Property(selector = "setColorAttachmentMappingState:")
    public native void setColorAttachmentMappingState(MTL4LogicalToPhysicalColorAttachmentMappingState v);
    @Property(selector = "supportIndirectCommandBuffers")
    public native MTL4IndirectCommandBufferSupportState getSupportIndirectCommandBuffers();
    @Property(selector = "setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(MTL4IndirectCommandBufferSupportState v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
