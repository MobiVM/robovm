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
package org.robovm.apple.imageio;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
@Marshaler(/*<name>*/GImageAuxiliaryDataType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GImageAuxiliaryDataType/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GImageAuxiliaryDataType toObject(Class<GImageAuxiliaryDataType> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new GImageAuxiliaryDataType(o);
        }
        @MarshalsPointer
        public static long toNative(GImageAuxiliaryDataType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<GImageAuxiliaryDataType> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GImageAuxiliaryDataType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new GImageAuxiliaryDataType(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GImageAuxiliaryDataType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (GImageAuxiliaryDataType i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    GImageAuxiliaryDataType(CFDictionary data) {
        super(data);
    }
    public GImageAuxiliaryDataType() {}
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
    public GImageAuxiliaryDataType set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("ImageIO")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeDepth", optional=true)
        public static native CFString Depth();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeDisparity", optional=true)
        public static native CFString Disparity();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypePortraitEffectsMatte", optional=true)
        public static native CFString PortraitEffectsMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeSemanticSegmentationSkinMatte", optional=true)
        public static native CFString SemanticSegmentationSkinMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeSemanticSegmentationHairMatte", optional=true)
        public static native CFString SemanticSegmentationHairMatte();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeSemanticSegmentationTeethMatte", optional=true)
        public static native CFString SemanticSegmentationTeethMatte();
        /**
         * @since Available in iOS 14.1 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeSemanticSegmentationGlassesMatte", optional=true)
        public static native CFString SemanticSegmentationGlassesMatte();
        /**
         * @since Available in iOS 14.1 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeSemanticSegmentationSkyMatte", optional=true)
        public static native CFString SemanticSegmentationSkyMatte();
        /**
         * @since Available in iOS 14.1 and later.
         */
        @GlobalValue(symbol="kCGImageAuxiliaryDataTypeHDRGainMap", optional=true)
        public static native CFString HDRGainMap();
    }
    /*</keys>*/
}
