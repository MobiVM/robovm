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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4RenderPipelineDescriptor/*</name>*/ 
    extends /*<extends>*/MTL4PipelineDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4RenderPipelineDescriptorPtr extends Ptr<MTL4RenderPipelineDescriptor, MTL4RenderPipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4RenderPipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4RenderPipelineDescriptor() {}
    protected MTL4RenderPipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4RenderPipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexFunctionDescriptor")
    public native MTL4FunctionDescriptor getVertexFunctionDescriptor();
    @Property(selector = "setVertexFunctionDescriptor:")
    public native void setVertexFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "fragmentFunctionDescriptor")
    public native MTL4FunctionDescriptor getFragmentFunctionDescriptor();
    @Property(selector = "setFragmentFunctionDescriptor:")
    public native void setFragmentFunctionDescriptor(MTL4FunctionDescriptor v);
    @Property(selector = "vertexDescriptor")
    public native MTLVertexDescriptor getVertexDescriptor();
    @Property(selector = "setVertexDescriptor:")
    public native void setVertexDescriptor(MTLVertexDescriptor v);
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
    @Property(selector = "inputPrimitiveTopology")
    public native MTLPrimitiveTopologyClass getInputPrimitiveTopology();
    @Property(selector = "setInputPrimitiveTopology:")
    public native void setInputPrimitiveTopology(MTLPrimitiveTopologyClass v);
    @Property(selector = "vertexStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getVertexStaticLinkingDescriptor();
    @Property(selector = "setVertexStaticLinkingDescriptor:")
    public native void setVertexStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "fragmentStaticLinkingDescriptor")
    public native MTL4StaticLinkingDescriptor getFragmentStaticLinkingDescriptor();
    @Property(selector = "setFragmentStaticLinkingDescriptor:")
    public native void setFragmentStaticLinkingDescriptor(MTL4StaticLinkingDescriptor v);
    @Property(selector = "supportVertexBinaryLinking")
    public native boolean isSupportVertexBinaryLinking();
    @Property(selector = "setSupportVertexBinaryLinking:")
    public native void setSupportVertexBinaryLinking(boolean v);
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
