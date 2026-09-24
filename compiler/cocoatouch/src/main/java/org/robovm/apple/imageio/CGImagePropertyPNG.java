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
/*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CGImagePropertyPNG/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyPNG/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyPNG/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyPNG toObject(Class<CGImagePropertyPNG> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyPNG.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyPNG o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyPNG> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyPNG> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyPNG.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyPNG> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyPNG o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CGImagePropertyPNG Author = new CGImagePropertyPNG("Author");
    public static final CGImagePropertyPNG Chromaticities = new CGImagePropertyPNG("Chromaticities");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyPNG Comment = new CGImagePropertyPNG("Comment");
    public static final CGImagePropertyPNG Copyright = new CGImagePropertyPNG("Copyright");
    public static final CGImagePropertyPNG CreationTime = new CGImagePropertyPNG("CreationTime");
    public static final CGImagePropertyPNG Description = new CGImagePropertyPNG("Description");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyPNG Disclaimer = new CGImagePropertyPNG("Disclaimer");
    public static final CGImagePropertyPNG Gamma = new CGImagePropertyPNG("Gamma");
    public static final CGImagePropertyPNG InterlaceType = new CGImagePropertyPNG("InterlaceType");
    public static final CGImagePropertyPNG ModificationTime = new CGImagePropertyPNG("ModificationTime");
    public static final CGImagePropertyPNG Software = new CGImagePropertyPNG("Software");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyPNG Source = new CGImagePropertyPNG("Source");
    public static final CGImagePropertyPNG sRGBIntent = new CGImagePropertyPNG("sRGBIntent");
    public static final CGImagePropertyPNG Title = new CGImagePropertyPNG("Title");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyPNG Warning = new CGImagePropertyPNG("Warning");
    public static final CGImagePropertyPNG XPixelsPerMeter = new CGImagePropertyPNG("XPixelsPerMeter");
    public static final CGImagePropertyPNG YPixelsPerMeter = new CGImagePropertyPNG("YPixelsPerMeter");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CGImagePropertyPNG PixelsAspectRatio = new CGImagePropertyPNG("PixelsAspectRatio");
    public static final CGImagePropertyPNG LoopCount = new CGImagePropertyPNG("LoopCount");
    public static final CGImagePropertyPNG DelayTime = new CGImagePropertyPNG("DelayTime");
    public static final CGImagePropertyPNG UnclampedDelayTime = new CGImagePropertyPNG("UnclampedDelayTime");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyPNG FrameInfoArray = new CGImagePropertyPNG("FrameInfoArray");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyPNG CanvasPixelWidth = new CGImagePropertyPNG("CanvasPixelWidth");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyPNG CanvasPixelHeight = new CGImagePropertyPNG("CanvasPixelHeight");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CGImagePropertyPNG CompressionFilter = new CGImagePropertyPNG("CompressionFilter");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CGImagePropertyPNG Transparency = new CGImagePropertyPNG("Transparency");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyPNG/*</name>*/[] values = new /*<name>*/CGImagePropertyPNG/*</name>*/[] {/*<value_list>*/Author, Chromaticities, Comment, Copyright, CreationTime, Description, Disclaimer, Gamma, InterlaceType, ModificationTime, Software, Source, sRGBIntent, Title, Warning, XPixelsPerMeter, YPixelsPerMeter, PixelsAspectRatio, LoopCount, DelayTime, UnclampedDelayTime, FrameInfoArray, CanvasPixelWidth, CanvasPixelHeight, CompressionFilter, Transparency/*</value_list>*/};
    
    /*<name>*/CGImagePropertyPNG/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyPNG/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyPNG/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyPNG/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCGImagePropertyPNGAuthor", optional=true)
        public static native CFString Author();
        @GlobalValue(symbol="kCGImagePropertyPNGChromaticities", optional=true)
        public static native CFString Chromaticities();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGComment", optional=true)
        public static native CFString Comment();
        @GlobalValue(symbol="kCGImagePropertyPNGCopyright", optional=true)
        public static native CFString Copyright();
        @GlobalValue(symbol="kCGImagePropertyPNGCreationTime", optional=true)
        public static native CFString CreationTime();
        @GlobalValue(symbol="kCGImagePropertyPNGDescription", optional=true)
        public static native CFString Description();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGDisclaimer", optional=true)
        public static native CFString Disclaimer();
        @GlobalValue(symbol="kCGImagePropertyPNGGamma", optional=true)
        public static native CFString Gamma();
        @GlobalValue(symbol="kCGImagePropertyPNGInterlaceType", optional=true)
        public static native CFString InterlaceType();
        @GlobalValue(symbol="kCGImagePropertyPNGModificationTime", optional=true)
        public static native CFString ModificationTime();
        @GlobalValue(symbol="kCGImagePropertyPNGSoftware", optional=true)
        public static native CFString Software();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGSource", optional=true)
        public static native CFString Source();
        @GlobalValue(symbol="kCGImagePropertyPNGsRGBIntent", optional=true)
        public static native CFString sRGBIntent();
        @GlobalValue(symbol="kCGImagePropertyPNGTitle", optional=true)
        public static native CFString Title();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGWarning", optional=true)
        public static native CFString Warning();
        @GlobalValue(symbol="kCGImagePropertyPNGXPixelsPerMeter", optional=true)
        public static native CFString XPixelsPerMeter();
        @GlobalValue(symbol="kCGImagePropertyPNGYPixelsPerMeter", optional=true)
        public static native CFString YPixelsPerMeter();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGPixelsAspectRatio", optional=true)
        public static native CFString PixelsAspectRatio();
        @GlobalValue(symbol="kCGImagePropertyAPNGLoopCount", optional=true)
        public static native CFString LoopCount();
        @GlobalValue(symbol="kCGImagePropertyAPNGDelayTime", optional=true)
        public static native CFString DelayTime();
        @GlobalValue(symbol="kCGImagePropertyAPNGUnclampedDelayTime", optional=true)
        public static native CFString UnclampedDelayTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAPNGFrameInfoArray", optional=true)
        public static native CFString FrameInfoArray();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAPNGCanvasPixelWidth", optional=true)
        public static native CFString CanvasPixelWidth();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAPNGCanvasPixelHeight", optional=true)
        public static native CFString CanvasPixelHeight();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGCompressionFilter", optional=true)
        public static native CFString CompressionFilter();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPNGTransparency", optional=true)
        public static native CFString Transparency();
        /*</values>*/
    }
}
