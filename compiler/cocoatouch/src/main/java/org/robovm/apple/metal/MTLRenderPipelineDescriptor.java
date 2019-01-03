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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRenderPipelineDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRenderPipelineDescriptorPtr extends Ptr<MTLRenderPipelineDescriptor, MTLRenderPipelineDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderPipelineDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLRenderPipelineDescriptor() {}
    protected MTLRenderPipelineDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLRenderPipelineDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "vertexFunction")
    public native MTLFunction getVertexFunction();
    @Property(selector = "setVertexFunction:")
    public native void setVertexFunction(MTLFunction v);
    @Property(selector = "fragmentFunction")
    public native MTLFunction getFragmentFunction();
    @Property(selector = "setFragmentFunction:")
    public native void setFragmentFunction(MTLFunction v);
    @Property(selector = "vertexDescriptor")
    public native MTLVertexDescriptor getVertexDescriptor();
    @Property(selector = "setVertexDescriptor:")
    public native void setVertexDescriptor(MTLVertexDescriptor v);
    @Property(selector = "sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Property(selector = "setSampleCount:")
    public native void setSampleCount(@MachineSizedUInt long v);
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
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "inputPrimitiveTopology")
    public native MTLPrimitiveTopologyClass getInputPrimitiveTopology();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setInputPrimitiveTopology:")
    public native void setInputPrimitiveTopology(MTLPrimitiveTopologyClass v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "tessellationPartitionMode")
    public native MTLTessellationPartitionMode getTessellationPartitionMode();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationPartitionMode:")
    public native void setTessellationPartitionMode(MTLTessellationPartitionMode v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "maxTessellationFactor")
    public native @MachineSizedUInt long getMaxTessellationFactor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMaxTessellationFactor:")
    public native void setMaxTessellationFactor(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isTessellationFactorScaleEnabled")
    public native boolean isTessellationFactorScaleEnabled();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationFactorScaleEnabled:")
    public native void setTessellationFactorScaleEnabled(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "tessellationFactorFormat")
    public native MTLTessellationFactorFormat getTessellationFactorFormat();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationFactorFormat:")
    public native void setTessellationFactorFormat(MTLTessellationFactorFormat v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "tessellationControlPointIndexType")
    public native MTLTessellationControlPointIndexType getTessellationControlPointIndexType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationControlPointIndexType:")
    public native void setTessellationControlPointIndexType(MTLTessellationControlPointIndexType v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "tessellationFactorStepFunction")
    public native MTLTessellationFactorStepFunction getTessellationFactorStepFunction();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationFactorStepFunction:")
    public native void setTessellationFactorStepFunction(MTLTessellationFactorStepFunction v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "tessellationOutputWindingOrder")
    public native MTLWinding getTessellationOutputWindingOrder();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTessellationOutputWindingOrder:")
    public native void setTessellationOutputWindingOrder(MTLWinding v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "vertexBuffers")
    public native MTLPipelineBufferDescriptorArray getVertexBuffers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "fragmentBuffers")
    public native MTLPipelineBufferDescriptorArray getFragmentBuffers();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportIndirectCommandBuffers")
    public native boolean isSupportIndirectCommandBuffers();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setSupportIndirectCommandBuffers:")
    public native void setSupportIndirectCommandBuffers(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    /*</methods>*/
}
