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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRenderPassDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRenderPassDescriptorPtr extends Ptr<MTLRenderPassDescriptor, MTLRenderPassDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderPassDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLRenderPassDescriptor() {}
    protected MTLRenderPassDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLRenderPassDescriptor(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "visibilityResultBuffer")
    public native MTLBuffer getVisibilityResultBuffer();
    @Property(selector = "setVisibilityResultBuffer:")
    public native void setVisibilityResultBuffer(MTLBuffer v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "renderTargetArrayLength")
    public native @MachineSizedUInt long getRenderTargetArrayLength();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setRenderTargetArrayLength:")
    public native void setRenderTargetArrayLength(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "imageblockSampleLength")
    public native @MachineSizedUInt long getImageblockSampleLength();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setImageblockSampleLength:")
    public native void setImageblockSampleLength(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "threadgroupMemoryLength")
    public native @MachineSizedUInt long getThreadgroupMemoryLength();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setThreadgroupMemoryLength:")
    public native void setThreadgroupMemoryLength(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "tileWidth")
    public native @MachineSizedUInt long getTileWidth();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTileWidth:")
    public native void setTileWidth(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "tileHeight")
    public native @MachineSizedUInt long getTileHeight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTileHeight:")
    public native void setTileHeight(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "defaultRasterSampleCount")
    public native @MachineSizedUInt long getDefaultRasterSampleCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDefaultRasterSampleCount:")
    public native void setDefaultRasterSampleCount(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "renderTargetWidth")
    public native @MachineSizedUInt long getRenderTargetWidth();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRenderTargetWidth:")
    public native void setRenderTargetWidth(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "renderTargetHeight")
    public native @MachineSizedUInt long getRenderTargetHeight();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRenderTargetHeight:")
    public native void setRenderTargetHeight(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setSamplePositions:count:")
    public native void setSamplePositions(MTLSamplePosition positions, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "getSamplePositions:count:")
    public native @MachineSizedUInt long getSamplePositions(MTLSamplePosition positions, @MachineSizedUInt long count);
    /*</methods>*/
}
