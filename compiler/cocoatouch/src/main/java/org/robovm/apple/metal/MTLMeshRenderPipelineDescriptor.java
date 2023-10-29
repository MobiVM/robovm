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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLMeshRenderPipelineDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLMeshRenderPipelineDescriptorPtr extends Ptr<MTLMeshRenderPipelineDescriptor, MTLMeshRenderPipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLMeshRenderPipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLMeshRenderPipelineDescriptor() {}
    protected MTLMeshRenderPipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLMeshRenderPipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "objectFunction")
    public native MTLFunction getObjectFunction();
    @Property(selector = "setObjectFunction:")
    public native void setObjectFunction(MTLFunction v);
    @Property(selector = "meshFunction")
    public native MTLFunction getMeshFunction();
    @Property(selector = "setMeshFunction:")
    public native void setMeshFunction(MTLFunction v);
    @Property(selector = "fragmentFunction")
    public native MTLFunction getFragmentFunction();
    @Property(selector = "setFragmentFunction:")
    public native void setFragmentFunction(MTLFunction v);
    @Property(selector = "maxTotalThreadsPerObjectThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerObjectThreadgroup();
    @Property(selector = "setMaxTotalThreadsPerObjectThreadgroup:")
    public native void setMaxTotalThreadsPerObjectThreadgroup(@MachineSizedUInt long v);
    @Property(selector = "maxTotalThreadsPerMeshThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerMeshThreadgroup();
    @Property(selector = "setMaxTotalThreadsPerMeshThreadgroup:")
    public native void setMaxTotalThreadsPerMeshThreadgroup(@MachineSizedUInt long v);
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
    @Property(selector = "objectBuffers")
    public native MTLPipelineBufferDescriptorArray getObjectBuffers();
    @Property(selector = "meshBuffers")
    public native MTLPipelineBufferDescriptorArray getMeshBuffers();
    @Property(selector = "fragmentBuffers")
    public native MTLPipelineBufferDescriptorArray getFragmentBuffers();
    @Property(selector = "rasterSampleCount")
    public native @MachineSizedUInt long getRasterSampleCount();
    @Property(selector = "setRasterSampleCount:")
    public native void setRasterSampleCount(@MachineSizedUInt long v);
    @Property(selector = "isAlphaToCoverageEnabled")
    public native boolean isAlphaToCoverageEnabled();
    @Property(selector = "setAlphaToCoverageEnabled:")
    public native void setAlphaToCoverageEnabled(boolean v);
    @Property(selector = "isAlphaToOneEnabled")
    public native boolean isAlphaToOneEnabled();
    @Property(selector = "setAlphaToOneEnabled:")
    public native void setAlphaToOneEnabled(boolean v);
    @Property(selector = "isRasterizationEnabled")
    public native boolean isRasterizationEnabled();
    @Property(selector = "setRasterizationEnabled:")
    public native void setRasterizationEnabled(boolean v);
    @Property(selector = "maxVertexAmplificationCount")
    public native @MachineSizedUInt long getMaxVertexAmplificationCount();
    @Property(selector = "setMaxVertexAmplificationCount:")
    public native void setMaxVertexAmplificationCount(@MachineSizedUInt long v);
    @Property(selector = "colorAttachments")
    public native MTLRenderPipelineColorAttachmentDescriptorArray getColorAttachments();
    @Property(selector = "depthAttachmentPixelFormat")
    public native MTLPixelFormat getDepthAttachmentPixelFormat();
    @Property(selector = "setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(MTLPixelFormat v);
    @Property(selector = "stencilAttachmentPixelFormat")
    public native MTLPixelFormat getStencilAttachmentPixelFormat();
    @Property(selector = "setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(MTLPixelFormat v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supportIndirectCommandBuffers")
    public native boolean isSupportIndirectCommandBuffers();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "objectLinkedFunctions")
    public native MTLLinkedFunctions getObjectLinkedFunctions();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setObjectLinkedFunctions:")
    public native void setObjectLinkedFunctions(MTLLinkedFunctions v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "meshLinkedFunctions")
    public native MTLLinkedFunctions getMeshLinkedFunctions();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMeshLinkedFunctions:")
    public native void setMeshLinkedFunctions(MTLLinkedFunctions v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "fragmentLinkedFunctions")
    public native MTLLinkedFunctions getFragmentLinkedFunctions();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setFragmentLinkedFunctions:")
    public native void setFragmentLinkedFunctions(MTLLinkedFunctions v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
