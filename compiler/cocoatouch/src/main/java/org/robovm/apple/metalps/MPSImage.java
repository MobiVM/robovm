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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImagePtr extends Ptr<MPSImage, MPSImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSImage() {}
    protected MPSImage(Handle h, long handle) { super(h, handle); }
    protected MPSImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:imageDescriptor:")
    public MPSImage(MTLDevice device, MPSImageDescriptor imageDescriptor) { super((SkipInit) null); initObject(init(device, imageDescriptor)); }
    @Method(selector = "initWithParentImage:sliceRange:featureChannels:")
    public MPSImage(MPSImage parent, @ByVal NSRange sliceRange, @MachineSizedUInt long featureChannels) { super((SkipInit) null); initObject(init(parent, sliceRange, featureChannels)); }
    @Method(selector = "initWithTexture:featureChannels:")
    public MPSImage(MTLTexture texture, @MachineSizedUInt long featureChannels) { super((SkipInit) null); initObject(init(texture, featureChannels)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "width")
    public native @MachineSizedUInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedUInt long getHeight();
    @Property(selector = "featureChannels")
    public native @MachineSizedUInt long getFeatureChannels();
    @Property(selector = "numberOfImages")
    public native @MachineSizedUInt long getNumberOfImages();
    @Property(selector = "textureType")
    public native MTLTextureType getTextureType();
    @Property(selector = "pixelFormat")
    public native MTLPixelFormat getPixelFormat();
    @Property(selector = "precision")
    public native @MachineSizedUInt long getPrecision();
    @Property(selector = "usage")
    public native MTLTextureUsage getUsage();
    @Property(selector = "pixelSize")
    public native @MachineSizedUInt long getPixelSize();
    @Property(selector = "texture")
    public native MTLTexture getTexture();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "parent")
    public native MPSImage getParent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:imageDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSImageDescriptor imageDescriptor);
    @Method(selector = "initWithParentImage:sliceRange:featureChannels:")
    protected native @Pointer long init(MPSImage parent, @ByVal NSRange sliceRange, @MachineSizedUInt long featureChannels);
    @Method(selector = "initWithTexture:featureChannels:")
    protected native @Pointer long init(MTLTexture texture, @MachineSizedUInt long featureChannels);
    @Method(selector = "batchRepresentationWithSubRange:")
    public native NSArray<MPSImage> batchRepresentationWithSubRange(@ByVal NSRange subRange);
    @Method(selector = "batchRepresentation")
    public native NSArray<MPSImage> batchRepresentation();
    @Method(selector = "subImageWithFeatureChannelRange:")
    public native MPSImage subImageWithFeatureChannelRange(@ByVal NSRange range);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resourceSize")
    public native @MachineSizedUInt long resourceSize();
    @Method(selector = "setPurgeableState:")
    public native MPSPurgeableState setPurgeableState(MPSPurgeableState state);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "readBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void readBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long bytesPerRow, @ByVal MTLRegion region, @ByVal MPSImageReadWriteParams featureChannelInfo, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "writeBytes:dataLayout:bytesPerRow:region:featureChannelInfo:imageIndex:")
    public native void writeBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long bytesPerRow, @ByVal MTLRegion region, @ByVal MPSImageReadWriteParams featureChannelInfo, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "readBytes:dataLayout:bytesPerRow:bytesPerImage:region:featureChannelInfo:imageIndex:")
    public native void readBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage, @ByVal MTLRegion region, @ByVal MPSImageReadWriteParams featureChannelInfo, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "writeBytes:dataLayout:bytesPerRow:bytesPerImage:region:featureChannelInfo:imageIndex:")
    public native void writeBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage, @ByVal MTLRegion region, @ByVal MPSImageReadWriteParams featureChannelInfo, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "readBytes:dataLayout:imageIndex:")
    public native void readBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "writeBytes:dataLayout:imageIndex:")
    public native void writeBytes(VoidPtr dataBytes, MPSDataLayout dataLayout, @MachineSizedUInt long imageIndex);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(MTLCommandBuffer commandBuffer);
    @Method(selector = "defaultAllocator")
    public static native MPSImageAllocator defaultAllocator();
    /*</methods>*/
}
