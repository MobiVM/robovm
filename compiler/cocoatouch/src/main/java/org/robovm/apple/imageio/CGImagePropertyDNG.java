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
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ActiveArea = new CGImagePropertyDNG("ActiveArea");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG AnalogBalance = new CGImagePropertyDNG("AnalogBalance");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG AntiAliasStrength = new CGImagePropertyDNG("AntiAliasStrength");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG AsShotICCProfile = new CGImagePropertyDNG("AsShotICCProfile");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG AsShotPreProfileMatrix = new CGImagePropertyDNG("AsShotPreProfileMatrix");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG AsShotProfileName = new CGImagePropertyDNG("AsShotProfileName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BaselineExposureOffset = new CGImagePropertyDNG("BaselineExposureOffset");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BayerGreenSplit = new CGImagePropertyDNG("BayerGreenSplit");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BestQualityScale = new CGImagePropertyDNG("BestQualityScale");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BlackLevelDeltaH = new CGImagePropertyDNG("BlackLevelDeltaH");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BlackLevelDeltaV = new CGImagePropertyDNG("BlackLevelDeltaV");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG BlackLevelRepeatDim = new CGImagePropertyDNG("BlackLevelRepeatDim");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG CFALayout = new CGImagePropertyDNG("CFALayout");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG CFAPlaneColor = new CGImagePropertyDNG("CFAPlaneColor");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ChromaBlurRadius = new CGImagePropertyDNG("ChromaBlurRadius");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ColorimetricReference = new CGImagePropertyDNG("ColorimetricReference");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG CurrentICCProfile = new CGImagePropertyDNG("CurrentICCProfile");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG CurrentPreProfileMatrix = new CGImagePropertyDNG("CurrentPreProfileMatrix");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG DefaultBlackRender = new CGImagePropertyDNG("DefaultBlackRender");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG DefaultCropOrigin = new CGImagePropertyDNG("DefaultCropOrigin");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG DefaultCropSize = new CGImagePropertyDNG("DefaultCropSize");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG DefaultScale = new CGImagePropertyDNG("DefaultScale");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG DefaultUserCrop = new CGImagePropertyDNG("DefaultUserCrop");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ExtraCameraProfiles = new CGImagePropertyDNG("ExtraCameraProfiles");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ForwardMatrix1 = new CGImagePropertyDNG("ForwardMatrix1");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ForwardMatrix2 = new CGImagePropertyDNG("ForwardMatrix2");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG LinearizationTable = new CGImagePropertyDNG("LinearizationTable");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG LinearResponseLimit = new CGImagePropertyDNG("LinearResponseLimit");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG MakerNoteSafety = new CGImagePropertyDNG("MakerNoteSafety");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG MaskedAreas = new CGImagePropertyDNG("MaskedAreas");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG NewRawImageDigest = new CGImagePropertyDNG("NewRawImageDigest");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG NoiseReductionApplied = new CGImagePropertyDNG("NoiseReductionApplied");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OpcodeList1 = new CGImagePropertyDNG("OpcodeList1");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OpcodeList2 = new CGImagePropertyDNG("OpcodeList2");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OpcodeList3 = new CGImagePropertyDNG("OpcodeList3");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalBestQualityFinalSize = new CGImagePropertyDNG("OriginalBestQualityFinalSize");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalDefaultCropSize = new CGImagePropertyDNG("OriginalDefaultCropSize");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalDefaultFinalSize = new CGImagePropertyDNG("OriginalDefaultFinalSize");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalRawFileData = new CGImagePropertyDNG("OriginalRawFileData");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalRawFileDigest = new CGImagePropertyDNG("OriginalRawFileDigest");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG OriginalRawFileName = new CGImagePropertyDNG("OriginalRawFileName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewApplicationName = new CGImagePropertyDNG("PreviewApplicationName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewApplicationVersion = new CGImagePropertyDNG("PreviewApplicationVersion");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewColorSpace = new CGImagePropertyDNG("PreviewColorSpace");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewDateTime = new CGImagePropertyDNG("PreviewDateTime");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewSettingsDigest = new CGImagePropertyDNG("PreviewSettingsDigest");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG PreviewSettingsName = new CGImagePropertyDNG("PreviewSettingsName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileCopyright = new CGImagePropertyDNG("ProfileCopyright");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileEmbedPolicy = new CGImagePropertyDNG("ProfileEmbedPolicy");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileHueSatMapData1 = new CGImagePropertyDNG("ProfileHueSatMapData1");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileHueSatMapData2 = new CGImagePropertyDNG("ProfileHueSatMapData2");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileHueSatMapDims = new CGImagePropertyDNG("ProfileHueSatMapDims");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileHueSatMapEncoding = new CGImagePropertyDNG("ProfileHueSatMapEncoding");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileLookTableData = new CGImagePropertyDNG("ProfileLookTableData");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileLookTableDims = new CGImagePropertyDNG("ProfileLookTableDims");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileLookTableEncoding = new CGImagePropertyDNG("ProfileLookTableEncoding");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileName = new CGImagePropertyDNG("ProfileName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ProfileToneCurve = new CGImagePropertyDNG("ProfileToneCurve");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG RawDataUniqueID = new CGImagePropertyDNG("RawDataUniqueID");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG RawImageDigest = new CGImagePropertyDNG("RawImageDigest");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG RawToPreviewGain = new CGImagePropertyDNG("RawToPreviewGain");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ReductionMatrix1 = new CGImagePropertyDNG("ReductionMatrix1");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ReductionMatrix2 = new CGImagePropertyDNG("ReductionMatrix2");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG RowInterleaveFactor = new CGImagePropertyDNG("RowInterleaveFactor");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG ShadowScale = new CGImagePropertyDNG("ShadowScale");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final CGImagePropertyDNG SubTileBlockSize = new CGImagePropertyDNG("SubTileBlockSize");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyDNG/*</name>*/[] values = new /*<name>*/CGImagePropertyDNG/*</name>*/[] {/*<value_list>*/Version, BackwardVersion, UniqueCameraModel, LocalizedCameraModel, CameraSerialNumber, LensInfo, BlackLevel, WhiteLevel, CalibrationIlluminant1, CalibrationIlluminant2, ColorMatrix1, ColorMatrix2, CameraCalibration1, CameraCalibration2, AsShotNeutral, AsShotWhiteXY, BaselineExposure, BaselineNoise, BaselineSharpness, PrivateData, CameraCalibrationSignature, ProfileCalibrationSignature, NoiseProfile, WarpRectilinear, WarpFisheye, FixVignetteRadial, ActiveArea, AnalogBalance, AntiAliasStrength, AsShotICCProfile, AsShotPreProfileMatrix, AsShotProfileName, BaselineExposureOffset, BayerGreenSplit, BestQualityScale, BlackLevelDeltaH, BlackLevelDeltaV, BlackLevelRepeatDim, CFALayout, CFAPlaneColor, ChromaBlurRadius, ColorimetricReference, CurrentICCProfile, CurrentPreProfileMatrix, DefaultBlackRender, DefaultCropOrigin, DefaultCropSize, DefaultScale, DefaultUserCrop, ExtraCameraProfiles, ForwardMatrix1, ForwardMatrix2, LinearizationTable, LinearResponseLimit, MakerNoteSafety, MaskedAreas, NewRawImageDigest, NoiseReductionApplied, OpcodeList1, OpcodeList2, OpcodeList3, OriginalBestQualityFinalSize, OriginalDefaultCropSize, OriginalDefaultFinalSize, OriginalRawFileData, OriginalRawFileDigest, OriginalRawFileName, PreviewApplicationName, PreviewApplicationVersion, PreviewColorSpace, PreviewDateTime, PreviewSettingsDigest, PreviewSettingsName, ProfileCopyright, ProfileEmbedPolicy, ProfileHueSatMapData1, ProfileHueSatMapData2, ProfileHueSatMapDims, ProfileHueSatMapEncoding, ProfileLookTableData, ProfileLookTableDims, ProfileLookTableEncoding, ProfileName, ProfileToneCurve, RawDataUniqueID, RawImageDigest, RawToPreviewGain, ReductionMatrix1, ReductionMatrix2, RowInterleaveFactor, ShadowScale, SubTileBlockSize/*</value_list>*/};
    
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
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGActiveArea", optional=true)
        public static native CFString ActiveArea();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAnalogBalance", optional=true)
        public static native CFString AnalogBalance();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAntiAliasStrength", optional=true)
        public static native CFString AntiAliasStrength();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAsShotICCProfile", optional=true)
        public static native CFString AsShotICCProfile();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAsShotPreProfileMatrix", optional=true)
        public static native CFString AsShotPreProfileMatrix();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGAsShotProfileName", optional=true)
        public static native CFString AsShotProfileName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBaselineExposureOffset", optional=true)
        public static native CFString BaselineExposureOffset();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBayerGreenSplit", optional=true)
        public static native CFString BayerGreenSplit();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBestQualityScale", optional=true)
        public static native CFString BestQualityScale();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBlackLevelDeltaH", optional=true)
        public static native CFString BlackLevelDeltaH();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBlackLevelDeltaV", optional=true)
        public static native CFString BlackLevelDeltaV();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGBlackLevelRepeatDim", optional=true)
        public static native CFString BlackLevelRepeatDim();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCFALayout", optional=true)
        public static native CFString CFALayout();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCFAPlaneColor", optional=true)
        public static native CFString CFAPlaneColor();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGChromaBlurRadius", optional=true)
        public static native CFString ChromaBlurRadius();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGColorimetricReference", optional=true)
        public static native CFString ColorimetricReference();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCurrentICCProfile", optional=true)
        public static native CFString CurrentICCProfile();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGCurrentPreProfileMatrix", optional=true)
        public static native CFString CurrentPreProfileMatrix();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDefaultBlackRender", optional=true)
        public static native CFString DefaultBlackRender();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDefaultCropOrigin", optional=true)
        public static native CFString DefaultCropOrigin();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDefaultCropSize", optional=true)
        public static native CFString DefaultCropSize();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDefaultScale", optional=true)
        public static native CFString DefaultScale();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGDefaultUserCrop", optional=true)
        public static native CFString DefaultUserCrop();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGExtraCameraProfiles", optional=true)
        public static native CFString ExtraCameraProfiles();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGForwardMatrix1", optional=true)
        public static native CFString ForwardMatrix1();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGForwardMatrix2", optional=true)
        public static native CFString ForwardMatrix2();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGLinearizationTable", optional=true)
        public static native CFString LinearizationTable();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGLinearResponseLimit", optional=true)
        public static native CFString LinearResponseLimit();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGMakerNoteSafety", optional=true)
        public static native CFString MakerNoteSafety();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGMaskedAreas", optional=true)
        public static native CFString MaskedAreas();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGNewRawImageDigest", optional=true)
        public static native CFString NewRawImageDigest();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGNoiseReductionApplied", optional=true)
        public static native CFString NoiseReductionApplied();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOpcodeList1", optional=true)
        public static native CFString OpcodeList1();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOpcodeList2", optional=true)
        public static native CFString OpcodeList2();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOpcodeList3", optional=true)
        public static native CFString OpcodeList3();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalBestQualityFinalSize", optional=true)
        public static native CFString OriginalBestQualityFinalSize();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalDefaultCropSize", optional=true)
        public static native CFString OriginalDefaultCropSize();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalDefaultFinalSize", optional=true)
        public static native CFString OriginalDefaultFinalSize();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalRawFileData", optional=true)
        public static native CFString OriginalRawFileData();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalRawFileDigest", optional=true)
        public static native CFString OriginalRawFileDigest();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGOriginalRawFileName", optional=true)
        public static native CFString OriginalRawFileName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewApplicationName", optional=true)
        public static native CFString PreviewApplicationName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewApplicationVersion", optional=true)
        public static native CFString PreviewApplicationVersion();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewColorSpace", optional=true)
        public static native CFString PreviewColorSpace();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewDateTime", optional=true)
        public static native CFString PreviewDateTime();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewSettingsDigest", optional=true)
        public static native CFString PreviewSettingsDigest();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGPreviewSettingsName", optional=true)
        public static native CFString PreviewSettingsName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileCopyright", optional=true)
        public static native CFString ProfileCopyright();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileEmbedPolicy", optional=true)
        public static native CFString ProfileEmbedPolicy();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileHueSatMapData1", optional=true)
        public static native CFString ProfileHueSatMapData1();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileHueSatMapData2", optional=true)
        public static native CFString ProfileHueSatMapData2();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileHueSatMapDims", optional=true)
        public static native CFString ProfileHueSatMapDims();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileHueSatMapEncoding", optional=true)
        public static native CFString ProfileHueSatMapEncoding();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileLookTableData", optional=true)
        public static native CFString ProfileLookTableData();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileLookTableDims", optional=true)
        public static native CFString ProfileLookTableDims();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileLookTableEncoding", optional=true)
        public static native CFString ProfileLookTableEncoding();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileName", optional=true)
        public static native CFString ProfileName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGProfileToneCurve", optional=true)
        public static native CFString ProfileToneCurve();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGRawDataUniqueID", optional=true)
        public static native CFString RawDataUniqueID();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGRawImageDigest", optional=true)
        public static native CFString RawImageDigest();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGRawToPreviewGain", optional=true)
        public static native CFString RawToPreviewGain();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGReductionMatrix1", optional=true)
        public static native CFString ReductionMatrix1();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGReductionMatrix2", optional=true)
        public static native CFString ReductionMatrix2();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGRowInterleaveFactor", optional=true)
        public static native CFString RowInterleaveFactor();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGShadowScale", optional=true)
        public static native CFString ShadowScale();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyDNGSubTileBlockSize", optional=true)
        public static native CFString SubTileBlockSize();
        /*</values>*/
    }
}
