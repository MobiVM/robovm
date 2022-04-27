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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
@Marshaler(/*<name>*/CIImageOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImageOptions/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIImageOptions toObject(Class<CIImageOptions> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIImageOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CIImageOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIImageOptions> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIImageOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIImageOptions(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIImageOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CIImageOptions i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIImageOptions(CFDictionary data) {
        super(data);
    }
    public CIImageOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFString key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFString key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public CIImageOptions set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public CGColorSpace getColorSpace() {
        if (has(Keys.ColorSpace())) {
            CGColorSpace val = get(Keys.ColorSpace(), CGColorSpace.class);
            return val;
        }
        return null;
    }
    public CIImageOptions setColorSpace(CGColorSpace colorSpace) {
        set(Keys.ColorSpace(), colorSpace);
        return this;
    }
    @WeaklyLinked
    public CGImageProperties getProperties() {
        if (has(Keys.Properties())) {
            CFDictionary val = get(Keys.Properties(), CFDictionary.class);
            return new CGImageProperties(val);
        }
        return null;
    }
    @WeaklyLinked
    public CIImageOptions setProperties(CGImageProperties properties) {
        set(Keys.Properties(), properties.getDictionary());
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCIImageColorSpace", optional=true)
        public static native CFString ColorSpace();
        /**
         * @since Available in iOS 14.1 and later.
         */
        @GlobalValue(symbol="kCIImageToneMapHDRtoSDR", optional=true)
        public static native CFString ToneMapHDRtoSDR();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageNearestSampling", optional=true)
        public static native CFString NearestSampling();
        @GlobalValue(symbol="kCIImageProperties", optional=true)
        public static native CFString Properties();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageApplyOrientationProperty", optional=true)
        public static native CFString ApplyOrientationProperty();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliaryDepth", optional=true)
        public static native CFString AuxiliaryDepth();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliaryDisparity", optional=true)
        public static native CFString AuxiliaryDisparity();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliaryPortraitEffectsMatte", optional=true)
        public static native CFString AuxiliaryPortraitEffectsMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliarySemanticSegmentationSkinMatte", optional=true)
        public static native CFString AuxiliarySemanticSegmentationSkinMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliarySemanticSegmentationHairMatte", optional=true)
        public static native CFString AuxiliarySemanticSegmentationHairMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliarySemanticSegmentationTeethMatte", optional=true)
        public static native CFString AuxiliarySemanticSegmentationTeethMatte();
        /**
         * @since Available in iOS 14.1 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliarySemanticSegmentationGlassesMatte", optional=true)
        public static native CFString AuxiliarySemanticSegmentationGlassesMatte();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="kCIImageAuxiliarySemanticSegmentationSkyMatte", optional=true)
        public static native CFString AuxiliarySemanticSegmentationSkyMatte();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIImageProviderTileSize", optional=true)
        public static native CFString ProviderTileSize();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIImageProviderUserInfo", optional=true)
        public static native CFString ProviderUserInfo();
    }
    /*</keys>*/
}
