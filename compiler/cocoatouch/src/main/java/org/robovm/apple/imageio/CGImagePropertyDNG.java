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
@Marshaler(/*<name>*/CGImagePropertyDNG/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyDNG/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyDNG/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyDNG toObject(Class<CGImagePropertyDNG> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyDNG.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyDNG o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyDNG> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyDNG> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyDNG.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyDNG> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyDNG o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG Version = new CGImagePropertyDNG("Version");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG BackwardVersion = new CGImagePropertyDNG("BackwardVersion");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG UniqueCameraModel = new CGImagePropertyDNG("UniqueCameraModel");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG LocalizedCameraModel = new CGImagePropertyDNG("LocalizedCameraModel");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG CameraSerialNumber = new CGImagePropertyDNG("CameraSerialNumber");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyDNG LensInfo = new CGImagePropertyDNG("LensInfo");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG BlackLevel = new CGImagePropertyDNG("BlackLevel");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG WhiteLevel = new CGImagePropertyDNG("WhiteLevel");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG CalibrationIlluminant1 = new CGImagePropertyDNG("CalibrationIlluminant1");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG CalibrationIlluminant2 = new CGImagePropertyDNG("CalibrationIlluminant2");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG ColorMatrix1 = new CGImagePropertyDNG("ColorMatrix1");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG ColorMatrix2 = new CGImagePropertyDNG("ColorMatrix2");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG CameraCalibration1 = new CGImagePropertyDNG("CameraCalibration1");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG CameraCalibration2 = new CGImagePropertyDNG("CameraCalibration2");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG AsShotNeutral = new CGImagePropertyDNG("AsShotNeutral");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG AsShotWhiteXY = new CGImagePropertyDNG("AsShotWhiteXY");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG BaselineExposure = new CGImagePropertyDNG("BaselineExposure");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG BaselineNoise = new CGImagePropertyDNG("BaselineNoise");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG BaselineSharpness = new CGImagePropertyDNG("BaselineSharpness");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG PrivateData = new CGImagePropertyDNG("PrivateData");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG CameraCalibrationSignature = new CGImagePropertyDNG("CameraCalibrationSignature");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG ProfileCalibrationSignature = new CGImagePropertyDNG("ProfileCalibrationSignature");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG NoiseProfile = new CGImagePropertyDNG("NoiseProfile");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG WarpRectilinear = new CGImagePropertyDNG("WarpRectilinear");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG WarpFisheye = new CGImagePropertyDNG("WarpFisheye");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyDNG FixVignetteRadial = new CGImagePropertyDNG("FixVignetteRadial");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyDNG/*</name>*/[] values = new /*<name>*/CGImagePropertyDNG/*</name>*/[] {/*<value_list>*/Version, BackwardVersion, UniqueCameraModel, LocalizedCameraModel, CameraSerialNumber, LensInfo, BlackLevel, WhiteLevel, CalibrationIlluminant1, CalibrationIlluminant2, ColorMatrix1, ColorMatrix2, CameraCalibration1, CameraCalibration2, AsShotNeutral, AsShotWhiteXY, BaselineExposure, BaselineNoise, BaselineSharpness, PrivateData, CameraCalibrationSignature, ProfileCalibrationSignature, NoiseProfile, WarpRectilinear, WarpFisheye, FixVignetteRadial/*</value_list>*/};
    
    /*<name>*/CGImagePropertyDNG/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyDNG/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyDNG/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyDNG/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGVersion", optional=true)
        public static native CFString Version();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBackwardVersion", optional=true)
        public static native CFString BackwardVersion();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGUniqueCameraModel", optional=true)
        public static native CFString UniqueCameraModel();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGLocalizedCameraModel", optional=true)
        public static native CFString LocalizedCameraModel();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCameraSerialNumber", optional=true)
        public static native CFString CameraSerialNumber();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGLensInfo", optional=true)
        public static native CFString LensInfo();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBlackLevel", optional=true)
        public static native CFString BlackLevel();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGWhiteLevel", optional=true)
        public static native CFString WhiteLevel();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCalibrationIlluminant1", optional=true)
        public static native CFString CalibrationIlluminant1();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCalibrationIlluminant2", optional=true)
        public static native CFString CalibrationIlluminant2();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGColorMatrix1", optional=true)
        public static native CFString ColorMatrix1();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGColorMatrix2", optional=true)
        public static native CFString ColorMatrix2();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCameraCalibration1", optional=true)
        public static native CFString CameraCalibration1();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCameraCalibration2", optional=true)
        public static native CFString CameraCalibration2();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAsShotNeutral", optional=true)
        public static native CFString AsShotNeutral();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAsShotWhiteXY", optional=true)
        public static native CFString AsShotWhiteXY();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBaselineExposure", optional=true)
        public static native CFString BaselineExposure();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBaselineNoise", optional=true)
        public static native CFString BaselineNoise();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBaselineSharpness", optional=true)
        public static native CFString BaselineSharpness();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPrivateData", optional=true)
        public static native CFString PrivateData();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCameraCalibrationSignature", optional=true)
        public static native CFString CameraCalibrationSignature();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileCalibrationSignature", optional=true)
        public static native CFString ProfileCalibrationSignature();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGNoiseProfile", optional=true)
        public static native CFString NoiseProfile();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGWarpRectilinear", optional=true)
        public static native CFString WarpRectilinear();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGWarpFisheye", optional=true)
        public static native CFString WarpFisheye();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGFixVignetteRadial", optional=true)
        public static native CFString FixVignetteRadial();
        /*</values>*/
    }
}
