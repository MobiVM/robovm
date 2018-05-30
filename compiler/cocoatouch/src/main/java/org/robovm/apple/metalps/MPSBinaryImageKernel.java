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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSBinaryImageKernel/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSBinaryImageKernelPtr extends Ptr<MPSBinaryImageKernel, MPSBinaryImageKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSBinaryImageKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSBinaryImageKernel() {}
    protected MPSBinaryImageKernel(Handle h, long handle) { super(h, handle); }
    protected MPSBinaryImageKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSBinaryImageKernel(MTLDevice device) { super((SkipInit) null); initObject(initWithDevice(device)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSBinaryImageKernel(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryOffset")
    public native @ByVal MPSOffset getPrimaryOffset();
    @Property(selector = "setPrimaryOffset:")
    public native void setPrimaryOffset(@ByVal MPSOffset v);
    @Property(selector = "secondaryOffset")
    public native @ByVal MPSOffset getSecondaryOffset();
    @Property(selector = "setSecondaryOffset:")
    public native void setSecondaryOffset(@ByVal MPSOffset v);
    @Property(selector = "primaryEdgeMode")
    public native MPSImageEdgeMode getPrimaryEdgeMode();
    @Property(selector = "setPrimaryEdgeMode:")
    public native void setPrimaryEdgeMode(MPSImageEdgeMode v);
    @Property(selector = "secondaryEdgeMode")
    public native MPSImageEdgeMode getSecondaryEdgeMode();
    @Property(selector = "setSecondaryEdgeMode:")
    public native void setSecondaryEdgeMode(MPSImageEdgeMode v);
    @Property(selector = "clipRect")
    public native @ByVal MTLRegion getClipRect();
    @Property(selector = "setClipRect:")
    public native void setClipRect(@ByVal MTLRegion v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long initWithDevice(MTLDevice device);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:primaryTexture:inPlaceSecondaryTexture:fallbackCopyAllocator:")
    public native boolean encodePrimaryTexture(MTLCommandBuffer commandBuffer, MTLTexture primaryTexture, MTLTexture inPlaceSecondaryTexture, @Block Block3<MPSKernel, MTLCommandBuffer, MTLTexture, MTLTexture> copyAllocator);
    @Method(selector = "encodeToCommandBuffer:inPlacePrimaryTexture:secondaryTexture:fallbackCopyAllocator:")
    public native boolean encodeSecondaryTexture(MTLCommandBuffer commandBuffer, MTLTexture inPlacePrimaryTexture, MTLTexture secondaryTexture, @Block Block3<MPSKernel, MTLCommandBuffer, MTLTexture, MTLTexture> copyAllocator);
    @Method(selector = "encodeToCommandBuffer:primaryTexture:secondaryTexture:destinationTexture:")
    public native void encode(MTLCommandBuffer commandBuffer, MTLTexture primaryTexture, MTLTexture secondaryTexture, MTLTexture destinationTexture);
    @Method(selector = "encodeToCommandBuffer:primaryImage:secondaryImage:destinationImage:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage primaryImage, MPSImage secondaryImage, MPSImage destinationImage);
    @Method(selector = "primarySourceRegionForDestinationSize:")
    public native @ByVal MPSRegion primarySourceRegionForDestinationSize(@ByVal MTLSize destinationSize);
    @Method(selector = "secondarySourceRegionForDestinationSize:")
    public native @ByVal MPSRegion secondarySourceRegionForDestinationSize(@ByVal MTLSize destinationSize);
    /*</methods>*/
}
