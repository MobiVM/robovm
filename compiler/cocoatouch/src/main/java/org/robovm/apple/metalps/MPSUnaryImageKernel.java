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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSUnaryImageKernel/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSUnaryImageKernelPtr extends Ptr<MPSUnaryImageKernel, MPSUnaryImageKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSUnaryImageKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSUnaryImageKernel() {}
    protected MPSUnaryImageKernel(Handle h, long handle) { super(h, handle); }
    protected MPSUnaryImageKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSUnaryImageKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSUnaryImageKernel(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSUnaryImageKernel(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "offset")
    public native @ByVal MPSOffset getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal MPSOffset v);
    @Property(selector = "clipRect")
    public native @ByVal MTLRegion getClipRect();
    @Property(selector = "setClipRect:")
    public native void setClipRect(@ByVal MTLRegion v);
    @Property(selector = "edgeMode")
    public native MPSImageEdgeMode getEdgeMode();
    @Property(selector = "setEdgeMode:")
    public native void setEdgeMode(MPSImageEdgeMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:")
    public native boolean encode(MTLCommandBuffer commandBuffer, MTLTexture texture, @Block Block3<MPSKernel, MTLCommandBuffer, MTLTexture, MTLTexture> copyAllocator);
    @Method(selector = "encodeToCommandBuffer:sourceTexture:destinationTexture:")
    public native void encode(MTLCommandBuffer commandBuffer, MTLTexture sourceTexture, MTLTexture destinationTexture);
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSImage destinationImage);
    @Method(selector = "sourceRegionForDestinationSize:")
    public native @ByVal MPSRegion sourceRegionForDestinationSize(@ByVal MTLSize destinationSize);
    /*</methods>*/
}
