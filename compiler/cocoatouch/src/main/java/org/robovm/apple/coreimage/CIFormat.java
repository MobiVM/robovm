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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CIFormat/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIFormat/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<Integer>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CIFormat/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIFormat toObject(Class<CIFormat> cls, long handle, long flags) {
            NSNumber o = (NSNumber) NSObject.Marshaler.toObject(NSNumber.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CIFormat.valueOf(o.intValue());
        }
        @MarshalsPointer
        public static long toNative(CIFormat o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(NSNumber.valueOf(o.value()), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CIFormat> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSNumber> o = (NSArray<NSNumber>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIFormat> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CIFormat.valueOf(o.get(i).intValue()));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIFormat> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSNumber> array = new NSMutableArray<>();
            for (CIFormat o : l) {
                array.add(NSNumber.valueOf(o.value()));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final CIFormat ARGB8 = new CIFormat("ARGB8");
    public static final CIFormat BGRA8 = new CIFormat("BGRA8");
    public static final CIFormat RGBA8 = new CIFormat("RGBA8");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat ABGR8 = new CIFormat("ABGR8");
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final CIFormat RGBAh = new CIFormat("RGBAh");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat RGBA16 = new CIFormat("RGBA16");
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final CIFormat RGBAf = new CIFormat("RGBAf");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat A8 = new CIFormat("A8");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat A16 = new CIFormat("A16");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat Ah = new CIFormat("Ah");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat Af = new CIFormat("Af");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat R8 = new CIFormat("R8");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat R16 = new CIFormat("R16");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat Rh = new CIFormat("Rh");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat Rf = new CIFormat("Rf");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat RG8 = new CIFormat("RG8");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat RG16 = new CIFormat("RG16");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat RGh = new CIFormat("RGh");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CIFormat RGf = new CIFormat("RGf");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat L8 = new CIFormat("L8");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat L16 = new CIFormat("L16");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat Lh = new CIFormat("Lh");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat Lf = new CIFormat("Lf");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat LA8 = new CIFormat("LA8");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat LA16 = new CIFormat("LA16");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat LAh = new CIFormat("LAh");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CIFormat LAf = new CIFormat("LAf");
    /*</constants>*/
    
    private static /*<name>*/CIFormat/*</name>*/[] values = new /*<name>*/CIFormat/*</name>*/[] {/*<value_list>*/ARGB8, BGRA8, RGBA8, ABGR8, RGBAh, RGBA16, RGBAf, A8, A16, Ah, Af, R8, R16, Rh, Rf, RG8, RG16, RGh, RGf, L8, L16, Lh, Lf, LA8, LA16, LAh, LAf/*</value_list>*/};
    
    /*<name>*/CIFormat/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CIFormat/*</name>*/ valueOf(/*<type>*/int/*</type>*/ value) {
        for (/*<name>*/CIFormat/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CIFormat/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreImage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCIFormatARGB8", optional=true)
        public static native int ARGB8();
        @GlobalValue(symbol="kCIFormatBGRA8", optional=true)
        public static native int BGRA8();
        @GlobalValue(symbol="kCIFormatRGBA8", optional=true)
        public static native int RGBA8();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatABGR8", optional=true)
        public static native int ABGR8();
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRGBAh", optional=true)
        public static native int RGBAh();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRGBA16", optional=true)
        public static native int RGBA16();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRGBAf", optional=true)
        public static native int RGBAf();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatA8", optional=true)
        public static native int A8();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatA16", optional=true)
        public static native int A16();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatAh", optional=true)
        public static native int Ah();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatAf", optional=true)
        public static native int Af();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatR8", optional=true)
        public static native int R8();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatR16", optional=true)
        public static native int R16();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRh", optional=true)
        public static native int Rh();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRf", optional=true)
        public static native int Rf();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRG8", optional=true)
        public static native int RG8();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRG16", optional=true)
        public static native int RG16();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRGh", optional=true)
        public static native int RGh();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIFormatRGf", optional=true)
        public static native int RGf();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatL8", optional=true)
        public static native int L8();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatL16", optional=true)
        public static native int L16();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLh", optional=true)
        public static native int Lh();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLf", optional=true)
        public static native int Lf();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLA8", optional=true)
        public static native int LA8();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLA16", optional=true)
        public static native int LA16();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLAh", optional=true)
        public static native int LAh();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIFormatLAf", optional=true)
        public static native int LAf();
        /*</values>*/
    }
}
