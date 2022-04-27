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
/*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CVPixelBufferAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVPixelBufferAttribute/*</name>*/ 
    extends /*<extends>*/CVBufferAttribute/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CVPixelBufferAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVPixelBufferAttribute toObject(Class<CVPixelBufferAttribute> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CVPixelBufferAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CVPixelBufferAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVPixelBufferAttribute> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVPixelBufferAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CVPixelBufferAttribute.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVPixelBufferAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVPixelBufferAttribute o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CVPixelBufferAttribute PixelFormatType = new CVPixelBufferAttribute("PixelFormatType");
    public static final CVPixelBufferAttribute MemoryAllocator = new CVPixelBufferAttribute("MemoryAllocator");
    public static final CVPixelBufferAttribute Width = new CVPixelBufferAttribute("Width");
    public static final CVPixelBufferAttribute Height = new CVPixelBufferAttribute("Height");
    public static final CVPixelBufferAttribute ExtendedPixelsLeft = new CVPixelBufferAttribute("ExtendedPixelsLeft");
    public static final CVPixelBufferAttribute ExtendedPixelsTop = new CVPixelBufferAttribute("ExtendedPixelsTop");
    public static final CVPixelBufferAttribute ExtendedPixelsRight = new CVPixelBufferAttribute("ExtendedPixelsRight");
    public static final CVPixelBufferAttribute ExtendedPixelsBottom = new CVPixelBufferAttribute("ExtendedPixelsBottom");
    public static final CVPixelBufferAttribute BytesPerRowAlignment = new CVPixelBufferAttribute("BytesPerRowAlignment");
    public static final CVPixelBufferAttribute CGBitmapContextCompatibility = new CVPixelBufferAttribute("CGBitmapContextCompatibility");
    public static final CVPixelBufferAttribute CGImageCompatibility = new CVPixelBufferAttribute("CGImageCompatibility");
    public static final CVPixelBufferAttribute OpenGLCompatibility = new CVPixelBufferAttribute("OpenGLCompatibility");
    public static final CVPixelBufferAttribute PlaneAlignment = new CVPixelBufferAttribute("PlaneAlignment");
    public static final CVPixelBufferAttribute IOSurfaceProperties = new CVPixelBufferAttribute("IOSurfaceProperties");
    public static final CVPixelBufferAttribute OpenGLESCompatibility = new CVPixelBufferAttribute("OpenGLESCompatibility");
    public static final CVPixelBufferAttribute MetalCompatibility = new CVPixelBufferAttribute("MetalCompatibility");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CVPixelBufferAttribute OpenGLESTextureCacheCompatibility = new CVPixelBufferAttribute("OpenGLESTextureCacheCompatibility");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute VersatileBayerKey = new CVPixelBufferAttribute("VersatileBayerKey");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawSenselSitingOffsets = new CVPixelBufferAttribute("RawSenselSitingOffsets");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawBlackLevel = new CVPixelBufferAttribute("RawBlackLevel");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawWhiteLevel = new CVPixelBufferAttribute("RawWhiteLevel");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawWhiteBalanceCCT = new CVPixelBufferAttribute("RawWhiteBalanceCCT");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawWhiteBalanceRedFactor = new CVPixelBufferAttribute("RawWhiteBalanceRedFactor");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawWhiteBalanceBlueFactor = new CVPixelBufferAttribute("RawWhiteBalanceBlueFactor");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawColorMatrix = new CVPixelBufferAttribute("RawColorMatrix");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawGainFactor = new CVPixelBufferAttribute("RawGainFactor");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final CVPixelBufferAttribute RawRecommendedCrop = new CVPixelBufferAttribute("RawRecommendedCrop");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CVPixelBufferAttribute RawMetadataExtension = new CVPixelBufferAttribute("RawMetadataExtension");
    public static final CVPixelBufferAttribute IOSurfaceCoreAnimationCompatibility = new CVPixelBufferAttribute("IOSurfaceCoreAnimationCompatibility");
    public static final CVPixelBufferAttribute IOSurfaceOpenGLESTextureCompatibility = new CVPixelBufferAttribute("IOSurfaceOpenGLESTextureCompatibility");
    public static final CVPixelBufferAttribute IOSurfaceOpenGLESFBOCompatibility = new CVPixelBufferAttribute("IOSurfaceOpenGLESFBOCompatibility");
    /*</constants>*/
    
    private static /*<name>*/CVPixelBufferAttribute/*</name>*/[] values = new /*<name>*/CVPixelBufferAttribute/*</name>*/[] {/*<value_list>*/PixelFormatType, MemoryAllocator, Width, Height, ExtendedPixelsLeft, ExtendedPixelsTop, ExtendedPixelsRight, ExtendedPixelsBottom, BytesPerRowAlignment, CGBitmapContextCompatibility, CGImageCompatibility, OpenGLCompatibility, PlaneAlignment, IOSurfaceProperties, OpenGLESCompatibility, MetalCompatibility, OpenGLESTextureCacheCompatibility, VersatileBayerKey, RawSenselSitingOffsets, RawBlackLevel, RawWhiteLevel, RawWhiteBalanceCCT, RawWhiteBalanceRedFactor, RawWhiteBalanceBlueFactor, RawColorMatrix, RawGainFactor, RawRecommendedCrop, RawMetadataExtension, IOSurfaceCoreAnimationCompatibility, IOSurfaceOpenGLESTextureCompatibility, IOSurfaceOpenGLESFBOCompatibility/*</value_list>*/};
    
    /*<name>*/CVPixelBufferAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CVPixelBufferAttribute/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CVPixelBufferAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CVPixelBufferAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCVPixelBufferPixelFormatTypeKey", optional=true)
        public static native CFString PixelFormatType();
        @GlobalValue(symbol="kCVPixelBufferMemoryAllocatorKey", optional=true)
        public static native CFString MemoryAllocator();
        @GlobalValue(symbol="kCVPixelBufferWidthKey", optional=true)
        public static native CFString Width();
        @GlobalValue(symbol="kCVPixelBufferHeightKey", optional=true)
        public static native CFString Height();
        @GlobalValue(symbol="kCVPixelBufferExtendedPixelsLeftKey", optional=true)
        public static native CFString ExtendedPixelsLeft();
        @GlobalValue(symbol="kCVPixelBufferExtendedPixelsTopKey", optional=true)
        public static native CFString ExtendedPixelsTop();
        @GlobalValue(symbol="kCVPixelBufferExtendedPixelsRightKey", optional=true)
        public static native CFString ExtendedPixelsRight();
        @GlobalValue(symbol="kCVPixelBufferExtendedPixelsBottomKey", optional=true)
        public static native CFString ExtendedPixelsBottom();
        @GlobalValue(symbol="kCVPixelBufferBytesPerRowAlignmentKey", optional=true)
        public static native CFString BytesPerRowAlignment();
        @GlobalValue(symbol="kCVPixelBufferCGBitmapContextCompatibilityKey", optional=true)
        public static native CFString CGBitmapContextCompatibility();
        @GlobalValue(symbol="kCVPixelBufferCGImageCompatibilityKey", optional=true)
        public static native CFString CGImageCompatibility();
        @GlobalValue(symbol="kCVPixelBufferOpenGLCompatibilityKey", optional=true)
        public static native CFString OpenGLCompatibility();
        @GlobalValue(symbol="kCVPixelBufferPlaneAlignmentKey", optional=true)
        public static native CFString PlaneAlignment();
        @GlobalValue(symbol="kCVPixelBufferIOSurfacePropertiesKey", optional=true)
        public static native CFString IOSurfaceProperties();
        @GlobalValue(symbol="kCVPixelBufferOpenGLESCompatibilityKey", optional=true)
        public static native CFString OpenGLESCompatibility();
        @GlobalValue(symbol="kCVPixelBufferMetalCompatibilityKey", optional=true)
        public static native CFString MetalCompatibility();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferOpenGLESTextureCacheCompatibilityKey", optional=true)
        public static native CFString OpenGLESTextureCacheCompatibility();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferVersatileBayerKey_BayerPattern", optional=true)
        public static native CFString VersatileBayerKey();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_SenselSitingOffsets", optional=true)
        public static native CFString RawSenselSitingOffsets();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_BlackLevel", optional=true)
        public static native CFString RawBlackLevel();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_WhiteLevel", optional=true)
        public static native CFString RawWhiteLevel();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_WhiteBalanceCCT", optional=true)
        public static native CFString RawWhiteBalanceCCT();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_WhiteBalanceRedFactor", optional=true)
        public static native CFString RawWhiteBalanceRedFactor();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_WhiteBalanceBlueFactor", optional=true)
        public static native CFString RawWhiteBalanceBlueFactor();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_ColorMatrix", optional=true)
        public static native CFString RawColorMatrix();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_GainFactor", optional=true)
        public static native CFString RawGainFactor();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_RecommendedCrop", optional=true)
        public static native CFString RawRecommendedCrop();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCVPixelBufferProResRAWKey_MetadataExtension", optional=true)
        public static native CFString RawMetadataExtension();
        @GlobalValue(symbol="kCVPixelBufferIOSurfaceCoreAnimationCompatibilityKey", optional=true)
        public static native CFString IOSurfaceCoreAnimationCompatibility();
        @GlobalValue(symbol="kCVPixelBufferIOSurfaceOpenGLESTextureCompatibilityKey", optional=true)
        public static native CFString IOSurfaceOpenGLESTextureCompatibility();
        @GlobalValue(symbol="kCVPixelBufferIOSurfaceOpenGLESFBOCompatibilityKey", optional=true)
        public static native CFString IOSurfaceOpenGLESFBOCompatibility();
        /*</values>*/
    }
}
