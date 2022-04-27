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

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLTexture/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLResource/*</implements>*/ {

    /*<ptr>*/public static class MTLTexturePtr extends Ptr<MTLTexture, MTLTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 10.0. Use parentTexture or buffer instead
     */
    @Deprecated
    @Property(selector = "rootResource")
    public native MTLResource getRootResource();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "parentTexture")
    public native MTLTexture getParentTexture();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "parentRelativeLevel")
    public native @MachineSizedUInt long getParentRelativeLevel();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "parentRelativeSlice")
    public native @MachineSizedUInt long getParentRelativeSlice();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "buffer")
    public native MTLBuffer getBuffer();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "bufferOffset")
    public native @MachineSizedUInt long getBufferOffset();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "bufferBytesPerRow")
    public native @MachineSizedUInt long getBufferBytesPerRow();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "iosurface")
    public native org.robovm.apple.iosurface.IOSurface getIosurface();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "iosurfacePlane")
    public native @MachineSizedUInt long getIosurfacePlane();
    @Property(selector = "textureType")
    public native MTLTextureType getTextureType();
    @Property(selector = "pixelFormat")
    public native MTLPixelFormat getPixelFormat();
    @Property(selector = "width")
    public native @MachineSizedUInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedUInt long getHeight();
    @Property(selector = "depth")
    public native @MachineSizedUInt long getDepth();
    @Property(selector = "mipmapLevelCount")
    public native @MachineSizedUInt long getMipmapLevelCount();
    @Property(selector = "sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Property(selector = "arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    @Property(selector = "usage")
    public native MTLTextureUsage getUsage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isShareable")
    public native boolean isShareable();
    @Property(selector = "isFramebufferOnly")
    public native boolean isFramebufferOnly();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "firstMipmapInTail")
    public native @MachineSizedUInt long getFirstMipmapInTail();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "tailSizeInBytes")
    public native @MachineSizedUInt long getTailSizeInBytes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isSparse")
    public native boolean isSparse();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "allowGPUOptimizedContents")
    public native boolean isAllowGPUOptimizedContents();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "compressionType")
    public native MTLTextureCompressionType getCompressionType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "swizzle")
    public native @ByVal MTLTextureSwizzleChannels getSwizzle();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "cpuCacheMode")
    public native MTLCPUCacheMode getCpuCacheMode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "storageMode")
    public native MTLStorageMode getStorageMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hazardTrackingMode")
    public native MTLHazardTrackingMode getHazardTrackingMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "resourceOptions")
    public native MTLResourceOptions getResourceOptions();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "heap")
    public native MTLHeap getHeap();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "heapOffset")
    public native @MachineSizedUInt long getHeapOffset();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allocatedSize")
    public native @MachineSizedUInt long getAllocatedSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    public byte[] getBytes(int length, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage, @ByVal MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice) {
        byte[] bytes = new byte[length];
        getBytes(VM.getArrayValuesAddress(bytes), bytesPerRow, bytesPerImage, region, level, slice);
        return bytes;
    }
    public void replaceRegion(@ByVal MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice, byte[] pixelBytes, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage) {
        replaceRegion(region, level, slice, VM.getArrayValuesAddress(pixelBytes), bytesPerRow, bytesPerImage);
    }
    public byte[] getBytes(int length, @MachineSizedUInt long bytesPerRow, @ByVal MTLRegion region, @MachineSizedUInt long level) {
        byte[] bytes = new byte[length];
        getBytes(VM.getArrayValuesAddress(bytes), bytesPerRow, region, level);
        return bytes;
    }
    public void replaceRegion(@ByVal MTLRegion region, @MachineSizedUInt long level, byte[] pixelBytes, @MachineSizedUInt long bytesPerRow) {
        replaceRegion(region, level, VM.getArrayValuesAddress(pixelBytes), bytesPerRow);
    }
    /*<methods>*/
    @Method(selector = "getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    protected native void getBytes(@Pointer long pixelBytes, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage, @ByVal MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice);
    @Method(selector = "replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    protected native void replaceRegion(@ByVal MTLRegion region, @MachineSizedUInt long level, @MachineSizedUInt long slice, @Pointer long pixelBytes, @MachineSizedUInt long bytesPerRow, @MachineSizedUInt long bytesPerImage);
    @Method(selector = "getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    protected native void getBytes(@Pointer long pixelBytes, @MachineSizedUInt long bytesPerRow, @ByVal MTLRegion region, @MachineSizedUInt long level);
    @Method(selector = "replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    protected native void replaceRegion(@ByVal MTLRegion region, @MachineSizedUInt long level, @Pointer long pixelBytes, @MachineSizedUInt long bytesPerRow);
    @Method(selector = "newTextureViewWithPixelFormat:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLTexture newTextureView(MTLPixelFormat pixelFormat);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "newTextureViewWithPixelFormat:textureType:levels:slices:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLTexture newTextureView(MTLPixelFormat pixelFormat, MTLTextureType textureType, @ByVal NSRange levelRange, @ByVal NSRange sliceRange);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newSharedTextureHandle")
    public native MTLSharedTextureHandle newSharedTextureHandle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLTexture newTextureView(MTLPixelFormat pixelFormat, MTLTextureType textureType, @ByVal NSRange levelRange, @ByVal NSRange sliceRange, @ByVal MTLTextureSwizzleChannels swizzle);
    @Method(selector = "setPurgeableState:")
    public native MTLPurgeableState setPurgeableState(MTLPurgeableState state);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "makeAliasable")
    public native void makeAliasable();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "isAliasable")
    public native boolean isAliasable();
    /*</methods>*/
}
