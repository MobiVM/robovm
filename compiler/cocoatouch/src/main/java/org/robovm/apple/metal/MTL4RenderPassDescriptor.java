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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4RenderPassDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4RenderPassDescriptorPtr extends Ptr<MTL4RenderPassDescriptor, MTL4RenderPassDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4RenderPassDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4RenderPassDescriptor() {}
    protected MTL4RenderPassDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4RenderPassDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colorAttachments")
    public native MTLRenderPassColorAttachmentDescriptorArray getColorAttachments();
    @Property(selector = "depthAttachment")
    public native MTLRenderPassDepthAttachmentDescriptor getDepthAttachment();
    @Property(selector = "setDepthAttachment:")
    public native void setDepthAttachment(MTLRenderPassDepthAttachmentDescriptor v);
    @Property(selector = "stencilAttachment")
    public native MTLRenderPassStencilAttachmentDescriptor getStencilAttachment();
    @Property(selector = "setStencilAttachment:")
    public native void setStencilAttachment(MTLRenderPassStencilAttachmentDescriptor v);
    @Property(selector = "renderTargetArrayLength")
    public native @MachineSizedUInt long getRenderTargetArrayLength();
    @Property(selector = "setRenderTargetArrayLength:")
    public native void setRenderTargetArrayLength(@MachineSizedUInt long v);
    @Property(selector = "imageblockSampleLength")
    public native @MachineSizedUInt long getImageblockSampleLength();
    @Property(selector = "setImageblockSampleLength:")
    public native void setImageblockSampleLength(@MachineSizedUInt long v);
    @Property(selector = "threadgroupMemoryLength")
    public native @MachineSizedUInt long getThreadgroupMemoryLength();
    @Property(selector = "setThreadgroupMemoryLength:")
    public native void setThreadgroupMemoryLength(@MachineSizedUInt long v);
    @Property(selector = "tileWidth")
    public native @MachineSizedUInt long getTileWidth();
    @Property(selector = "setTileWidth:")
    public native void setTileWidth(@MachineSizedUInt long v);
    @Property(selector = "tileHeight")
    public native @MachineSizedUInt long getTileHeight();
    @Property(selector = "setTileHeight:")
    public native void setTileHeight(@MachineSizedUInt long v);
    @Property(selector = "defaultRasterSampleCount")
    public native @MachineSizedUInt long getDefaultRasterSampleCount();
    @Property(selector = "setDefaultRasterSampleCount:")
    public native void setDefaultRasterSampleCount(@MachineSizedUInt long v);
    @Property(selector = "renderTargetWidth")
    public native @MachineSizedUInt long getRenderTargetWidth();
    @Property(selector = "setRenderTargetWidth:")
    public native void setRenderTargetWidth(@MachineSizedUInt long v);
    @Property(selector = "renderTargetHeight")
    public native @MachineSizedUInt long getRenderTargetHeight();
    @Property(selector = "setRenderTargetHeight:")
    public native void setRenderTargetHeight(@MachineSizedUInt long v);
    @Property(selector = "rasterizationRateMap")
    public native MTLRasterizationRateMap getRasterizationRateMap();
    @Property(selector = "setRasterizationRateMap:")
    public native void setRasterizationRateMap(MTLRasterizationRateMap v);
    @Property(selector = "visibilityResultBuffer")
    public native MTLBuffer getVisibilityResultBuffer();
    @Property(selector = "setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(MTLBuffer v);
    @Property(selector = "visibilityResultType")
    public native MTLVisibilityResultType getVisibilityResultType();
    @Property(selector = "setVisibilityResultType:")
    public native void setVisibilityResultType(MTLVisibilityResultType v);
    @Property(selector = "supportColorAttachmentMapping")
    public native boolean isSupportColorAttachmentMapping();
    @Property(selector = "setSupportColorAttachmentMapping:")
    public native void setSupportColorAttachmentMapping(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setSamplePositions:count:")
    public native void setSamplePositions(MTLSamplePosition positions, @MachineSizedUInt long count);
    @Method(selector = "getSamplePositions:count:")
    public native @MachineSizedUInt long getSamplePositions(MTLSamplePosition positions, @MachineSizedUInt long count);
    /*</methods>*/
}
