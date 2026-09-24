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
@Marshaler(/*<name>*/CVImageBufferDisplayMaskRectangle/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBufferDisplayMaskRectangle/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVImageBufferDisplayMaskRectangle toObject(Class<CVImageBufferDisplayMaskRectangle> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CVImageBufferDisplayMaskRectangle(o);
        }
        @MarshalsPointer
        public static long toNative(CVImageBufferDisplayMaskRectangle o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVImageBufferDisplayMaskRectangle> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVImageBufferDisplayMaskRectangle> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CVImageBufferDisplayMaskRectangle(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVImageBufferDisplayMaskRectangle> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVImageBufferDisplayMaskRectangle i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CVImageBufferDisplayMaskRectangle(CFDictionary data) {
        super(data);
    }
    public CVImageBufferDisplayMaskRectangle() {}
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
    public CVImageBufferDisplayMaskRectangle set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getReferenceRasterWidth() {
        if (has(Keys.ReferenceRasterWidth())) {
            CFNumber val = get(Keys.ReferenceRasterWidth(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setReferenceRasterWidth(long referenceRasterWidth) {
        set(Keys.ReferenceRasterWidth(), CFNumber.valueOf(referenceRasterWidth));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getReferenceRasterHeight() {
        if (has(Keys.ReferenceRasterHeight())) {
            CFNumber val = get(Keys.ReferenceRasterHeight(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setReferenceRasterHeight(long referenceRasterHeight) {
        set(Keys.ReferenceRasterHeight(), CFNumber.valueOf(referenceRasterHeight));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getRectangleLeft() {
        if (has(Keys.RectangleLeft())) {
            CFNumber val = get(Keys.RectangleLeft(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setRectangleLeft(long rectangleLeft) {
        set(Keys.RectangleLeft(), CFNumber.valueOf(rectangleLeft));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getRectangleWidth() {
        if (has(Keys.RectangleWidth())) {
            CFNumber val = get(Keys.RectangleWidth(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setRectangleWidth(long rectangleWidth) {
        set(Keys.RectangleWidth(), CFNumber.valueOf(rectangleWidth));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getRectangleTop() {
        if (has(Keys.RectangleTop())) {
            CFNumber val = get(Keys.RectangleTop(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setRectangleTop(long rectangleTop) {
        set(Keys.RectangleTop(), CFNumber.valueOf(rectangleTop));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public long getRectangleHeight() {
        if (has(Keys.RectangleHeight())) {
            CFNumber val = get(Keys.RectangleHeight(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setRectangleHeight(long rectangleHeight) {
        set(Keys.RectangleHeight(), CFNumber.valueOf(rectangleHeight));
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CFArray getLeftEdgePoints() {
        if (has(Keys.LeftEdgePoints())) {
            CFArray val = get(Keys.LeftEdgePoints(), CFArray.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setLeftEdgePoints(CFArray leftEdgePoints) {
        set(Keys.LeftEdgePoints(), leftEdgePoints);
        return this;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CFArray getRightEdgePoints() {
        if (has(Keys.RightEdgePoints())) {
            CFArray val = get(Keys.RightEdgePoints(), CFArray.class);
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    public CVImageBufferDisplayMaskRectangle setRightEdgePoints(CFArray rightEdgePoints) {
        set(Keys.RightEdgePoints(), rightEdgePoints);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreVideo")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_ReferenceRasterWidthKey", optional=true)
        public static native CFString ReferenceRasterWidth();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_ReferenceRasterHeightKey", optional=true)
        public static native CFString ReferenceRasterHeight();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_RectangleLeftKey", optional=true)
        public static native CFString RectangleLeft();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_RectangleWidthKey", optional=true)
        public static native CFString RectangleWidth();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_RectangleTopKey", optional=true)
        public static native CFString RectangleTop();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_RectangleHeightKey", optional=true)
        public static native CFString RectangleHeight();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_LeftEdgePointsKey", optional=true)
        public static native CFString LeftEdgePoints();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferDisplayMaskRectangle_RightEdgePointsKey", optional=true)
        public static native CFString RightEdgePoints();
    }
    /*</keys>*/
}
