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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
@Marshaler(/*<name>*/CVPixelBufferAttributes/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVPixelBufferAttributes/*</name>*/ 
    extends /*<extends>*/CVBufferAttributes/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVPixelBufferAttributes toObject(Class<CVPixelBufferAttributes> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CVPixelBufferAttributes(o);
        }
        @MarshalsPointer
        public static long toNative(CVPixelBufferAttributes o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVPixelBufferAttributes> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVPixelBufferAttributes> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CVPixelBufferAttributes(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVPixelBufferAttributes> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVPixelBufferAttributes i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CVPixelBufferAttributes(CFDictionary data) {
        super(data);
    }
    public CVPixelBufferAttributes() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CVPixelBufferAttribute key) {
        return data.containsKey(key.value());
    }
    public <T extends NativeObject> T get(CVPixelBufferAttribute key, Class<T> type) {
        if (has(key)) {
            return data.get(key.value(), type);
        }
        return null;
    }
    public CVPixelBufferAttributes set(CVPixelBufferAttribute key, NativeObject value) {
        data.put(key.value(), value);
        return this;
    }
    

    public CFAllocator getMemoryAllocator() {
        if (has(CVPixelBufferAttribute.MemoryAllocator)) {
            CFAllocator val = get(CVPixelBufferAttribute.MemoryAllocator, CFAllocator.class);
            return val;
        }
        return null;
    }
    public CVPixelBufferAttributes setMemoryAllocator(CFAllocator memoryAllocator) {
        set(CVPixelBufferAttribute.MemoryAllocator, memoryAllocator);
        return this;
    }
    public long getWidth() {
        if (has(CVPixelBufferAttribute.Width)) {
            CFNumber val = get(CVPixelBufferAttribute.Width, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setWidth(long width) {
        set(CVPixelBufferAttribute.Width, CFNumber.valueOf(width));
        return this;
    }
    public long getHeight() {
        if (has(CVPixelBufferAttribute.Height)) {
            CFNumber val = get(CVPixelBufferAttribute.Height, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setHeight(long height) {
        set(CVPixelBufferAttribute.Height, CFNumber.valueOf(height));
        return this;
    }
    public long getExtendedPixelsLeft() {
        if (has(CVPixelBufferAttribute.ExtendedPixelsLeft)) {
            CFNumber val = get(CVPixelBufferAttribute.ExtendedPixelsLeft, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setExtendedPixelsLeft(long extendedPixelsLeft) {
        set(CVPixelBufferAttribute.ExtendedPixelsLeft, CFNumber.valueOf(extendedPixelsLeft));
        return this;
    }
    public long getExtendedPixelsTop() {
        if (has(CVPixelBufferAttribute.ExtendedPixelsTop)) {
            CFNumber val = get(CVPixelBufferAttribute.ExtendedPixelsTop, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setExtendedPixelsTop(long extendedPixelsTop) {
        set(CVPixelBufferAttribute.ExtendedPixelsTop, CFNumber.valueOf(extendedPixelsTop));
        return this;
    }
    public long getExtendedPixelsRight() {
        if (has(CVPixelBufferAttribute.ExtendedPixelsRight)) {
            CFNumber val = get(CVPixelBufferAttribute.ExtendedPixelsRight, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setExtendedPixelsRight(long extendedPixelsRight) {
        set(CVPixelBufferAttribute.ExtendedPixelsRight, CFNumber.valueOf(extendedPixelsRight));
        return this;
    }
    public long getExtendedPixelsBottom() {
        if (has(CVPixelBufferAttribute.ExtendedPixelsBottom)) {
            CFNumber val = get(CVPixelBufferAttribute.ExtendedPixelsBottom, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setExtendedPixelsBottom(long extendedPixelsBottom) {
        set(CVPixelBufferAttribute.ExtendedPixelsBottom, CFNumber.valueOf(extendedPixelsBottom));
        return this;
    }
    public long getBytesPerRowAlignment() {
        if (has(CVPixelBufferAttribute.BytesPerRowAlignment)) {
            CFNumber val = get(CVPixelBufferAttribute.BytesPerRowAlignment, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setBytesPerRowAlignment(long bytesPerRowAlignment) {
        set(CVPixelBufferAttribute.BytesPerRowAlignment, CFNumber.valueOf(bytesPerRowAlignment));
        return this;
    }
    public boolean isCompatibleWithCGBitmapContext() {
        if (has(CVPixelBufferAttribute.CGBitmapContextCompatibility)) {
            CFBoolean val = get(CVPixelBufferAttribute.CGBitmapContextCompatibility, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelBufferAttributes setCompatibleWithCGBitmapContext(boolean compatibleWithCGBitmapContext) {
        set(CVPixelBufferAttribute.CGBitmapContextCompatibility, CFBoolean.valueOf(compatibleWithCGBitmapContext));
        return this;
    }
    public boolean isCompatibleWithCGImage() {
        if (has(CVPixelBufferAttribute.CGImageCompatibility)) {
            CFBoolean val = get(CVPixelBufferAttribute.CGImageCompatibility, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelBufferAttributes setCompatibleWithCGImage(boolean compatibleWithCGImage) {
        set(CVPixelBufferAttribute.CGImageCompatibility, CFBoolean.valueOf(compatibleWithCGImage));
        return this;
    }
    public boolean isCompatibleWithOpenGL() {
        if (has(CVPixelBufferAttribute.OpenGLCompatibility)) {
            CFBoolean val = get(CVPixelBufferAttribute.OpenGLCompatibility, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelBufferAttributes setCompatibleWithOpenGL(boolean compatibleWithOpenGL) {
        set(CVPixelBufferAttribute.OpenGLCompatibility, CFBoolean.valueOf(compatibleWithOpenGL));
        return this;
    }
    public long getPlaneAlignment() {
        if (has(CVPixelBufferAttribute.PlaneAlignment)) {
            CFNumber val = get(CVPixelBufferAttribute.PlaneAlignment, CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelBufferAttributes setPlaneAlignment(long planeAlignment) {
        set(CVPixelBufferAttribute.PlaneAlignment, CFNumber.valueOf(planeAlignment));
        return this;
    }
    public NSDictionary getIOSurfaceProperties() {
        if (has(CVPixelBufferAttribute.IOSurfaceProperties)) {
            NSDictionary val = get(CVPixelBufferAttribute.IOSurfaceProperties, NSDictionary.class);
            return val;
        }
        return null;
    }
    public CVPixelBufferAttributes setIOSurfaceProperties(NSDictionary iOSurfaceProperties) {
        set(CVPixelBufferAttribute.IOSurfaceProperties, iOSurfaceProperties);
        return this;
    }
    public boolean isCompatibleWithOpenGLES() {
        if (has(CVPixelBufferAttribute.OpenGLESCompatibility)) {
            CFBoolean val = get(CVPixelBufferAttribute.OpenGLESCompatibility, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelBufferAttributes setCompatibleWithOpenGLES(boolean compatibleWithOpenGLES) {
        set(CVPixelBufferAttribute.OpenGLESCompatibility, CFBoolean.valueOf(compatibleWithOpenGLES));
        return this;
    }
    public boolean isCompatibleWithMetal() {
        if (has(CVPixelBufferAttribute.MetalCompatibility)) {
            CFBoolean val = get(CVPixelBufferAttribute.MetalCompatibility, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelBufferAttributes setCompatibleWithMetal(boolean compatibleWithMetal) {
        set(CVPixelBufferAttribute.MetalCompatibility, CFBoolean.valueOf(compatibleWithMetal));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVVersatileBayerPattern getVersatileBayerKey() {
        if (has(CVPixelBufferAttribute.VersatileBayerKey)) {
            CFNumber val = get(CVPixelBufferAttribute.VersatileBayerKey, CFNumber.class);
            return CVVersatileBayerPattern.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setVersatileBayerKey(CVVersatileBayerPattern versatileBayerKey) {
        set(CVPixelBufferAttribute.VersatileBayerKey, CFNumber.valueOf(versatileBayerKey.value()));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NSData getRawSenselSitingOffsets() {
        if (has(CVPixelBufferAttribute.RawSenselSitingOffsets)) {
            NSData val = get(CVPixelBufferAttribute.RawSenselSitingOffsets, NSData.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawSenselSitingOffsets(NSData rawSenselSitingOffsets) {
        set(CVPixelBufferAttribute.RawSenselSitingOffsets, rawSenselSitingOffsets);
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public int getRawBlackLevel() {
        if (has(CVPixelBufferAttribute.RawBlackLevel)) {
            CFNumber val = get(CVPixelBufferAttribute.RawBlackLevel, CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawBlackLevel(int rawBlackLevel) {
        set(CVPixelBufferAttribute.RawBlackLevel, CFNumber.valueOf(rawBlackLevel));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public int getRawWhiteLevel() {
        if (has(CVPixelBufferAttribute.RawWhiteLevel)) {
            CFNumber val = get(CVPixelBufferAttribute.RawWhiteLevel, CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawWhiteLevel(int rawWhiteLevel) {
        set(CVPixelBufferAttribute.RawWhiteLevel, CFNumber.valueOf(rawWhiteLevel));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public int getRawWhiteBalanceCCT() {
        if (has(CVPixelBufferAttribute.RawWhiteBalanceCCT)) {
            CFNumber val = get(CVPixelBufferAttribute.RawWhiteBalanceCCT, CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawWhiteBalanceCCT(int rawWhiteBalanceCCT) {
        set(CVPixelBufferAttribute.RawWhiteBalanceCCT, CFNumber.valueOf(rawWhiteBalanceCCT));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public float getRawWhiteBalanceRedFactor() {
        if (has(CVPixelBufferAttribute.RawWhiteBalanceRedFactor)) {
            CFNumber val = get(CVPixelBufferAttribute.RawWhiteBalanceRedFactor, CFNumber.class);
            return val.floatValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawWhiteBalanceRedFactor(float rawWhiteBalanceRedFactor) {
        set(CVPixelBufferAttribute.RawWhiteBalanceRedFactor, CFNumber.valueOf(rawWhiteBalanceRedFactor));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public float getRawWhiteBalanceBlueFactor() {
        if (has(CVPixelBufferAttribute.RawWhiteBalanceBlueFactor)) {
            CFNumber val = get(CVPixelBufferAttribute.RawWhiteBalanceBlueFactor, CFNumber.class);
            return val.floatValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawWhiteBalanceBlueFactor(float rawWhiteBalanceBlueFactor) {
        set(CVPixelBufferAttribute.RawWhiteBalanceBlueFactor, CFNumber.valueOf(rawWhiteBalanceBlueFactor));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NSData getRawColorMatrix() {
        if (has(CVPixelBufferAttribute.RawColorMatrix)) {
            NSData val = get(CVPixelBufferAttribute.RawColorMatrix, NSData.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawColorMatrix(NSData rawColorMatrix) {
        set(CVPixelBufferAttribute.RawColorMatrix, rawColorMatrix);
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public float getRawGainFactor() {
        if (has(CVPixelBufferAttribute.RawGainFactor)) {
            CFNumber val = get(CVPixelBufferAttribute.RawGainFactor, CFNumber.class);
            return val.floatValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawGainFactor(float rawGainFactor) {
        set(CVPixelBufferAttribute.RawGainFactor, CFNumber.valueOf(rawGainFactor));
        return this;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NSData getRawRecommendedCrop() {
        if (has(CVPixelBufferAttribute.RawRecommendedCrop)) {
            NSData val = get(CVPixelBufferAttribute.RawRecommendedCrop, NSData.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public CVPixelBufferAttributes setRawRecommendedCrop(NSData rawRecommendedCrop) {
        set(CVPixelBufferAttribute.RawRecommendedCrop, rawRecommendedCrop);
        return this;
    }
    /*</methods>*/
    
    /**
    * @since Available in iOS 4.0 and later.
    */
    public List<CVPixelFormatType> getPixelFormatTypes() {
       if (has(CVPixelBufferAttribute.PixelFormatType)) {
           CFType val = get(CVPixelBufferAttribute.PixelFormatType, CFType.class);
           List<CVPixelFormatType> list = new ArrayList<>();
           if (val.getClass() == CFNumber.class || CFNumber.class.isAssignableFrom(val.getClass())) {
               CFNumber num = (CFNumber)val;
               list.add(CVPixelFormatType.valueOf(num.longValue()));
               return list;
           } else if (val.getClass() == CFArray.class || CFArray.class.isAssignableFrom(val.getClass())) {
               CFArray arr = (CFArray)val;
               for (int i = 0; i < arr.size(); i++) {
                   list.add(CVPixelFormatType.valueOf(arr.get(i, CFNumber.class).longValue()));
               }
               return list;
           }
       }
       return null;
   }
   /**
    * @since Available in iOS 4.0 and later.
    */
   public CVPixelBufferAttributes setPixelFormatType(CVPixelFormatType type) {
       set(CVPixelBufferAttribute.PixelFormatType, CFNumber.valueOf(type.value()));
       return this;
   }
   /**
    * @since Available in iOS 4.0 and later.
    */
   public CVPixelBufferAttributes setPixelFormatTypes(List<CVPixelFormatType> types) {
       CFArray array = CFMutableArray.create();
       for (CVPixelFormatType i : types) {
           array.add(CFNumber.valueOf(i.value()));
       }
       set(CVPixelBufferAttribute.PixelFormatType, array);
       return this;
   }
    
    /*<keys>*/
    /*</keys>*/
}
