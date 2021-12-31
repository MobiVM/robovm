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
@Marshaler(/*<name>*/CVImageBufferAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBufferAttribute/*</name>*/ 
    extends /*<extends>*/CVBufferAttribute/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CVImageBufferAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVImageBufferAttribute toObject(Class<CVImageBufferAttribute> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CVImageBufferAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CVImageBufferAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVImageBufferAttribute> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVImageBufferAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CVImageBufferAttribute.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVImageBufferAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVImageBufferAttribute o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CVImageBufferAttribute CGColorSpace = new CVImageBufferAttribute("CGColorSpace");
    public static final CVImageBufferAttribute CleanAperture = new CVImageBufferAttribute("CleanAperture");
    public static final CVImageBufferAttribute PreferredCleanAperture = new CVImageBufferAttribute("PreferredCleanAperture");
    public static final CVImageBufferAttribute FieldCount = new CVImageBufferAttribute("FieldCount");
    public static final CVImageBufferAttribute FieldDetail = new CVImageBufferAttribute("FieldDetail");
    public static final CVImageBufferAttribute PixelAspectRatio = new CVImageBufferAttribute("PixelAspectRatio");
    public static final CVImageBufferAttribute DisplayDimensions = new CVImageBufferAttribute("DisplayDimensions");
    public static final CVImageBufferAttribute GammaLevel = new CVImageBufferAttribute("GammaLevel");
    public static final CVImageBufferAttribute ICCProfile = new CVImageBufferAttribute("ICCProfile");
    public static final CVImageBufferAttribute YCbCrMatrix = new CVImageBufferAttribute("YCbCrMatrix");
    public static final CVImageBufferAttribute ColorPrimaries = new CVImageBufferAttribute("ColorPrimaries");
    public static final CVImageBufferAttribute TransferFunction = new CVImageBufferAttribute("TransferFunction");
    public static final CVImageBufferAttribute ChromaLocationTopField = new CVImageBufferAttribute("ChromaLocationTopField");
    public static final CVImageBufferAttribute ChromaLocationBottomField = new CVImageBufferAttribute("ChromaLocationBottomField");
    public static final CVImageBufferAttribute ChromaSubsampling = new CVImageBufferAttribute("ChromaSubsampling");
    public static final CVImageBufferAttribute AlphaChannelIsOpaque = new CVImageBufferAttribute("AlphaChannelIsOpaque");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CVImageBufferAttribute AlphaChannelMode = new CVImageBufferAttribute("AlphaChannelMode");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CVImageBufferAttribute MasteringDisplayColorVolume = new CVImageBufferAttribute("MasteringDisplayColorVolume");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CVImageBufferAttribute ContentLightLevelInfo = new CVImageBufferAttribute("ContentLightLevelInfo");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CVImageBufferAttribute AmbientViewingEnvironment = new CVImageBufferAttribute("AmbientViewingEnvironment");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CVImageBufferAttribute RegionOfInterest = new CVImageBufferAttribute("RegionOfInterest");
    /*</constants>*/
    
    private static /*<name>*/CVImageBufferAttribute/*</name>*/[] values = new /*<name>*/CVImageBufferAttribute/*</name>*/[] {/*<value_list>*/CGColorSpace, CleanAperture, PreferredCleanAperture, FieldCount, FieldDetail, PixelAspectRatio, DisplayDimensions, GammaLevel, ICCProfile, YCbCrMatrix, ColorPrimaries, TransferFunction, ChromaLocationTopField, ChromaLocationBottomField, ChromaSubsampling, AlphaChannelIsOpaque, AlphaChannelMode, MasteringDisplayColorVolume, ContentLightLevelInfo, AmbientViewingEnvironment, RegionOfInterest/*</value_list>*/};
    
    /*<name>*/CVImageBufferAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    CVImageBufferAttribute (Class<?> clazz, String getterName) {
        super(clazz, getterName);
    }
    
    public static /*<name>*/CVImageBufferAttribute/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CVImageBufferAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CVImageBufferAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCVImageBufferCGColorSpaceKey", optional=true)
        public static native CFString CGColorSpace();
        @GlobalValue(symbol="kCVImageBufferCleanApertureKey", optional=true)
        public static native CFString CleanAperture();
        @GlobalValue(symbol="kCVImageBufferPreferredCleanApertureKey", optional=true)
        public static native CFString PreferredCleanAperture();
        @GlobalValue(symbol="kCVImageBufferFieldCountKey", optional=true)
        public static native CFString FieldCount();
        @GlobalValue(symbol="kCVImageBufferFieldDetailKey", optional=true)
        public static native CFString FieldDetail();
        @GlobalValue(symbol="kCVImageBufferPixelAspectRatioKey", optional=true)
        public static native CFString PixelAspectRatio();
        @GlobalValue(symbol="kCVImageBufferDisplayDimensionsKey", optional=true)
        public static native CFString DisplayDimensions();
        @GlobalValue(symbol="kCVImageBufferGammaLevelKey", optional=true)
        public static native CFString GammaLevel();
        @GlobalValue(symbol="kCVImageBufferICCProfileKey", optional=true)
        public static native CFString ICCProfile();
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrixKey", optional=true)
        public static native CFString YCbCrMatrix();
        @GlobalValue(symbol="kCVImageBufferColorPrimariesKey", optional=true)
        public static native CFString ColorPrimaries();
        @GlobalValue(symbol="kCVImageBufferTransferFunctionKey", optional=true)
        public static native CFString TransferFunction();
        @GlobalValue(symbol="kCVImageBufferChromaLocationTopFieldKey", optional=true)
        public static native CFString ChromaLocationTopField();
        @GlobalValue(symbol="kCVImageBufferChromaLocationBottomFieldKey", optional=true)
        public static native CFString ChromaLocationBottomField();
        @GlobalValue(symbol="kCVImageBufferChromaSubsamplingKey", optional=true)
        public static native CFString ChromaSubsampling();
        @GlobalValue(symbol="kCVImageBufferAlphaChannelIsOpaque", optional=true)
        public static native CFString AlphaChannelIsOpaque();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferAlphaChannelModeKey", optional=true)
        public static native CFString AlphaChannelMode();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferMasteringDisplayColorVolumeKey", optional=true)
        public static native CFString MasteringDisplayColorVolume();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferContentLightLevelInfoKey", optional=true)
        public static native CFString ContentLightLevelInfo();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferAmbientViewingEnvironmentKey", optional=true)
        public static native CFString AmbientViewingEnvironment();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferRegionOfInterestKey", optional=true)
        public static native CFString RegionOfInterest();
        /*</values>*/
    }
}
