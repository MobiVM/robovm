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
package org.robovm.apple.iosurface;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("IOSurface") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/IOSurfacePropertyKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IOSurfacePropertyKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/IOSurfacePropertyKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static IOSurfacePropertyKey toObject(Class<IOSurfacePropertyKey> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return IOSurfacePropertyKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(IOSurfacePropertyKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<IOSurfacePropertyKey> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<IOSurfacePropertyKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(IOSurfacePropertyKey.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<IOSurfacePropertyKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (IOSurfacePropertyKey o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final IOSurfacePropertyKey AllocSize = new IOSurfacePropertyKey("AllocSize");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey Width = new IOSurfacePropertyKey("Width");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey Height = new IOSurfacePropertyKey("Height");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey BytesPerRow = new IOSurfacePropertyKey("BytesPerRow");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey BytesPerElement = new IOSurfacePropertyKey("BytesPerElement");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey ElementWidth = new IOSurfacePropertyKey("ElementWidth");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey ElementHeight = new IOSurfacePropertyKey("ElementHeight");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey Offset = new IOSurfacePropertyKey("Offset");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneInfo = new IOSurfacePropertyKey("PlaneInfo");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneWidth = new IOSurfacePropertyKey("PlaneWidth");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneHeight = new IOSurfacePropertyKey("PlaneHeight");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneBytesPerRow = new IOSurfacePropertyKey("PlaneBytesPerRow");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneOffset = new IOSurfacePropertyKey("PlaneOffset");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneSize = new IOSurfacePropertyKey("PlaneSize");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneBase = new IOSurfacePropertyKey("PlaneBase");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneBytesPerElement = new IOSurfacePropertyKey("PlaneBytesPerElement");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneElementWidth = new IOSurfacePropertyKey("PlaneElementWidth");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PlaneElementHeight = new IOSurfacePropertyKey("PlaneElementHeight");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey CacheMode = new IOSurfacePropertyKey("CacheMode");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PixelFormat = new IOSurfacePropertyKey("PixelFormat");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final IOSurfacePropertyKey PixelSizeCastingAllowed = new IOSurfacePropertyKey("PixelSizeCastingAllowed");
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    public static final IOSurfacePropertyKey AllocSizeKey = new IOSurfacePropertyKey("AllocSizeKey");
    /*</constants>*/
    
    private static /*<name>*/IOSurfacePropertyKey/*</name>*/[] values = new /*<name>*/IOSurfacePropertyKey/*</name>*/[] {/*<value_list>*/AllocSize, Width, Height, BytesPerRow, BytesPerElement, ElementWidth, ElementHeight, Offset, PlaneInfo, PlaneWidth, PlaneHeight, PlaneBytesPerRow, PlaneOffset, PlaneSize, PlaneBase, PlaneBytesPerElement, PlaneElementWidth, PlaneElementHeight, CacheMode, PixelFormat, PixelSizeCastingAllowed, AllocSizeKey/*</value_list>*/};
    
    /*<name>*/IOSurfacePropertyKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/IOSurfacePropertyKey/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/IOSurfacePropertyKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/IOSurfacePropertyKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("IOSurface") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyAllocSize", optional=true)
        public static native CFString AllocSize();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyWidth", optional=true)
        public static native CFString Width();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyHeight", optional=true)
        public static native CFString Height();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyBytesPerRow", optional=true)
        public static native CFString BytesPerRow();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyBytesPerElement", optional=true)
        public static native CFString BytesPerElement();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyElementWidth", optional=true)
        public static native CFString ElementWidth();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyElementHeight", optional=true)
        public static native CFString ElementHeight();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyOffset", optional=true)
        public static native CFString Offset();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneInfo", optional=true)
        public static native CFString PlaneInfo();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneWidth", optional=true)
        public static native CFString PlaneWidth();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneHeight", optional=true)
        public static native CFString PlaneHeight();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneBytesPerRow", optional=true)
        public static native CFString PlaneBytesPerRow();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneOffset", optional=true)
        public static native CFString PlaneOffset();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneSize", optional=true)
        public static native CFString PlaneSize();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneBase", optional=true)
        public static native CFString PlaneBase();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneBytesPerElement", optional=true)
        public static native CFString PlaneBytesPerElement();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneElementWidth", optional=true)
        public static native CFString PlaneElementWidth();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPlaneElementHeight", optional=true)
        public static native CFString PlaneElementHeight();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyCacheMode", optional=true)
        public static native CFString CacheMode();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPixelFormat", optional=true)
        public static native CFString PixelFormat();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="IOSurfacePropertyKeyPixelSizeCastingAllowed", optional=true)
        public static native CFString PixelSizeCastingAllowed();
        /**
         * @since Available in iOS 10.0 and later.
         * @deprecated Deprecated in iOS 12.0.
         */
        @Deprecated
        @GlobalValue(symbol="IOSurfacePropertyAllocSizeKey", optional=true)
        public static native CFString AllocSizeKey();
        /*</values>*/
    }
}
