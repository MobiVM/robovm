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
@Marshaler(/*<name>*/CGImagePropertyExif/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyExif/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyExif/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyExif toObject(Class<CGImagePropertyExif> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyExif.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyExif o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyExif> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyExif> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyExif.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyExif> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyExif o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CGImagePropertyExif ExposureTime = new CGImagePropertyExif("ExposureTime");
    public static final CGImagePropertyExif FNumber = new CGImagePropertyExif("FNumber");
    public static final CGImagePropertyExif ExposureProgram = new CGImagePropertyExif("ExposureProgram");
    public static final CGImagePropertyExif SpectralSensitivity = new CGImagePropertyExif("SpectralSensitivity");
    public static final CGImagePropertyExif ISOSpeedRatings = new CGImagePropertyExif("ISOSpeedRatings");
    public static final CGImagePropertyExif OECF = new CGImagePropertyExif("OECF");
    public static final CGImagePropertyExif SensitivityType = new CGImagePropertyExif("SensitivityType");
    public static final CGImagePropertyExif StandardOutputSensitivity = new CGImagePropertyExif("StandardOutputSensitivity");
    public static final CGImagePropertyExif RecommendedExposureIndex = new CGImagePropertyExif("RecommendedExposureIndex");
    public static final CGImagePropertyExif ISOSpeed = new CGImagePropertyExif("ISOSpeed");
    public static final CGImagePropertyExif ISOSpeedLatitudeyyy = new CGImagePropertyExif("ISOSpeedLatitudeyyy");
    public static final CGImagePropertyExif ISOSpeedLatitudezzz = new CGImagePropertyExif("ISOSpeedLatitudezzz");
    public static final CGImagePropertyExif Version = new CGImagePropertyExif("Version");
    public static final CGImagePropertyExif DateTimeOriginal = new CGImagePropertyExif("DateTimeOriginal");
    public static final CGImagePropertyExif DateTimeDigitized = new CGImagePropertyExif("DateTimeDigitized");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyExif OffsetTime = new CGImagePropertyExif("OffsetTime");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyExif OffsetTimeOriginal = new CGImagePropertyExif("OffsetTimeOriginal");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CGImagePropertyExif OffsetTimeDigitized = new CGImagePropertyExif("OffsetTimeDigitized");
    public static final CGImagePropertyExif ComponentsConfiguration = new CGImagePropertyExif("ComponentsConfiguration");
    public static final CGImagePropertyExif CompressedBitsPerPixel = new CGImagePropertyExif("CompressedBitsPerPixel");
    public static final CGImagePropertyExif ShutterSpeedValue = new CGImagePropertyExif("ShutterSpeedValue");
    public static final CGImagePropertyExif ApertureValue = new CGImagePropertyExif("ApertureValue");
    public static final CGImagePropertyExif BrightnessValue = new CGImagePropertyExif("BrightnessValue");
    public static final CGImagePropertyExif ExposureBiasValue = new CGImagePropertyExif("ExposureBiasValue");
    public static final CGImagePropertyExif MaxApertureValue = new CGImagePropertyExif("MaxApertureValue");
    public static final CGImagePropertyExif SubjectDistance = new CGImagePropertyExif("SubjectDistance");
    public static final CGImagePropertyExif MeteringMode = new CGImagePropertyExif("MeteringMode");
    public static final CGImagePropertyExif LightSource = new CGImagePropertyExif("LightSource");
    public static final CGImagePropertyExif Flash = new CGImagePropertyExif("Flash");
    public static final CGImagePropertyExif FocalLength = new CGImagePropertyExif("FocalLength");
    public static final CGImagePropertyExif SubjectArea = new CGImagePropertyExif("SubjectArea");
    public static final CGImagePropertyExif MakerNote = new CGImagePropertyExif("MakerNote");
    public static final CGImagePropertyExif UserComment = new CGImagePropertyExif("UserComment");
    public static final CGImagePropertyExif SubsecTime = new CGImagePropertyExif("SubsecTime");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CGImagePropertyExif SubsecTimeOriginal = new CGImagePropertyExif("SubsecTimeOriginal");
    public static final CGImagePropertyExif SubsecTimeDigitized = new CGImagePropertyExif("SubsecTimeDigitized");
    public static final CGImagePropertyExif FlashPixVersion = new CGImagePropertyExif("FlashPixVersion");
    public static final CGImagePropertyExif ColorSpace = new CGImagePropertyExif("ColorSpace");
    public static final CGImagePropertyExif PixelXDimension = new CGImagePropertyExif("PixelXDimension");
    public static final CGImagePropertyExif PixelYDimension = new CGImagePropertyExif("PixelYDimension");
    public static final CGImagePropertyExif RelatedSoundFile = new CGImagePropertyExif("RelatedSoundFile");
    public static final CGImagePropertyExif FlashEnergy = new CGImagePropertyExif("FlashEnergy");
    public static final CGImagePropertyExif SpatialFrequencyResponse = new CGImagePropertyExif("SpatialFrequencyResponse");
    public static final CGImagePropertyExif FocalPlaneXResolution = new CGImagePropertyExif("FocalPlaneXResolution");
    public static final CGImagePropertyExif FocalPlaneYResolution = new CGImagePropertyExif("FocalPlaneYResolution");
    public static final CGImagePropertyExif FocalPlaneResolutionUnit = new CGImagePropertyExif("FocalPlaneResolutionUnit");
    public static final CGImagePropertyExif SubjectLocation = new CGImagePropertyExif("SubjectLocation");
    public static final CGImagePropertyExif ExposureIndex = new CGImagePropertyExif("ExposureIndex");
    public static final CGImagePropertyExif SensingMethod = new CGImagePropertyExif("SensingMethod");
    public static final CGImagePropertyExif FileSource = new CGImagePropertyExif("FileSource");
    public static final CGImagePropertyExif SceneType = new CGImagePropertyExif("SceneType");
    public static final CGImagePropertyExif CFAPattern = new CGImagePropertyExif("CFAPattern");
    public static final CGImagePropertyExif CustomRendered = new CGImagePropertyExif("CustomRendered");
    public static final CGImagePropertyExif ExposureMode = new CGImagePropertyExif("ExposureMode");
    public static final CGImagePropertyExif WhiteBalance = new CGImagePropertyExif("WhiteBalance");
    public static final CGImagePropertyExif DigitalZoomRatio = new CGImagePropertyExif("DigitalZoomRatio");
    public static final CGImagePropertyExif FocalLenIn35mmFilm = new CGImagePropertyExif("FocalLenIn35mmFilm");
    public static final CGImagePropertyExif SceneCaptureType = new CGImagePropertyExif("SceneCaptureType");
    public static final CGImagePropertyExif GainControl = new CGImagePropertyExif("GainControl");
    public static final CGImagePropertyExif Contrast = new CGImagePropertyExif("Contrast");
    public static final CGImagePropertyExif Saturation = new CGImagePropertyExif("Saturation");
    public static final CGImagePropertyExif Sharpness = new CGImagePropertyExif("Sharpness");
    public static final CGImagePropertyExif DeviceSettingDescription = new CGImagePropertyExif("DeviceSettingDescription");
    public static final CGImagePropertyExif SubjectDistRange = new CGImagePropertyExif("SubjectDistRange");
    public static final CGImagePropertyExif ImageUniqueID = new CGImagePropertyExif("ImageUniqueID");
    public static final CGImagePropertyExif CameraOwnerName = new CGImagePropertyExif("CameraOwnerName");
    public static final CGImagePropertyExif BodySerialNumber = new CGImagePropertyExif("BodySerialNumber");
    public static final CGImagePropertyExif LensSpecification = new CGImagePropertyExif("LensSpecification");
    public static final CGImagePropertyExif LensMake = new CGImagePropertyExif("LensMake");
    public static final CGImagePropertyExif LensModel = new CGImagePropertyExif("LensModel");
    public static final CGImagePropertyExif LensSerialNumber = new CGImagePropertyExif("LensSerialNumber");
    public static final CGImagePropertyExif Gamma = new CGImagePropertyExif("Gamma");
    /**
     * @since Available in iOS 13.1 and later.
     */
    public static final CGImagePropertyExif CompositeImage = new CGImagePropertyExif("CompositeImage");
    /**
     * @since Available in iOS 13.1 and later.
     */
    public static final CGImagePropertyExif SourceImageNumberOfCompositeImage = new CGImagePropertyExif("SourceImageNumberOfCompositeImage");
    /**
     * @since Available in iOS 13.1 and later.
     */
    public static final CGImagePropertyExif SourceExposureTimesOfCompositeImage = new CGImagePropertyExif("SourceExposureTimesOfCompositeImage");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyExif/*</name>*/[] values = new /*<name>*/CGImagePropertyExif/*</name>*/[] {/*<value_list>*/ExposureTime, FNumber, ExposureProgram, SpectralSensitivity, ISOSpeedRatings, OECF, SensitivityType, StandardOutputSensitivity, RecommendedExposureIndex, ISOSpeed, ISOSpeedLatitudeyyy, ISOSpeedLatitudezzz, Version, DateTimeOriginal, DateTimeDigitized, OffsetTime, OffsetTimeOriginal, OffsetTimeDigitized, ComponentsConfiguration, CompressedBitsPerPixel, ShutterSpeedValue, ApertureValue, BrightnessValue, ExposureBiasValue, MaxApertureValue, SubjectDistance, MeteringMode, LightSource, Flash, FocalLength, SubjectArea, MakerNote, UserComment, SubsecTime, SubsecTimeOriginal, SubsecTimeDigitized, FlashPixVersion, ColorSpace, PixelXDimension, PixelYDimension, RelatedSoundFile, FlashEnergy, SpatialFrequencyResponse, FocalPlaneXResolution, FocalPlaneYResolution, FocalPlaneResolutionUnit, SubjectLocation, ExposureIndex, SensingMethod, FileSource, SceneType, CFAPattern, CustomRendered, ExposureMode, WhiteBalance, DigitalZoomRatio, FocalLenIn35mmFilm, SceneCaptureType, GainControl, Contrast, Saturation, Sharpness, DeviceSettingDescription, SubjectDistRange, ImageUniqueID, CameraOwnerName, BodySerialNumber, LensSpecification, LensMake, LensModel, LensSerialNumber, Gamma, CompositeImage, SourceImageNumberOfCompositeImage, SourceExposureTimesOfCompositeImage/*</value_list>*/};
    
    /*<name>*/CGImagePropertyExif/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyExif/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyExif/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyExif/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCGImagePropertyExifExposureTime", optional=true)
        public static native CFString ExposureTime();
        @GlobalValue(symbol="kCGImagePropertyExifFNumber", optional=true)
        public static native CFString FNumber();
        @GlobalValue(symbol="kCGImagePropertyExifExposureProgram", optional=true)
        public static native CFString ExposureProgram();
        @GlobalValue(symbol="kCGImagePropertyExifSpectralSensitivity", optional=true)
        public static native CFString SpectralSensitivity();
        @GlobalValue(symbol="kCGImagePropertyExifISOSpeedRatings", optional=true)
        public static native CFString ISOSpeedRatings();
        @GlobalValue(symbol="kCGImagePropertyExifOECF", optional=true)
        public static native CFString OECF();
        @GlobalValue(symbol="kCGImagePropertyExifSensitivityType", optional=true)
        public static native CFString SensitivityType();
        @GlobalValue(symbol="kCGImagePropertyExifStandardOutputSensitivity", optional=true)
        public static native CFString StandardOutputSensitivity();
        @GlobalValue(symbol="kCGImagePropertyExifRecommendedExposureIndex", optional=true)
        public static native CFString RecommendedExposureIndex();
        @GlobalValue(symbol="kCGImagePropertyExifISOSpeed", optional=true)
        public static native CFString ISOSpeed();
        @GlobalValue(symbol="kCGImagePropertyExifISOSpeedLatitudeyyy", optional=true)
        public static native CFString ISOSpeedLatitudeyyy();
        @GlobalValue(symbol="kCGImagePropertyExifISOSpeedLatitudezzz", optional=true)
        public static native CFString ISOSpeedLatitudezzz();
        @GlobalValue(symbol="kCGImagePropertyExifVersion", optional=true)
        public static native CFString Version();
        @GlobalValue(symbol="kCGImagePropertyExifDateTimeOriginal", optional=true)
        public static native CFString DateTimeOriginal();
        @GlobalValue(symbol="kCGImagePropertyExifDateTimeDigitized", optional=true)
        public static native CFString DateTimeDigitized();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifOffsetTime", optional=true)
        public static native CFString OffsetTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifOffsetTimeOriginal", optional=true)
        public static native CFString OffsetTimeOriginal();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifOffsetTimeDigitized", optional=true)
        public static native CFString OffsetTimeDigitized();
        @GlobalValue(symbol="kCGImagePropertyExifComponentsConfiguration", optional=true)
        public static native CFString ComponentsConfiguration();
        @GlobalValue(symbol="kCGImagePropertyExifCompressedBitsPerPixel", optional=true)
        public static native CFString CompressedBitsPerPixel();
        @GlobalValue(symbol="kCGImagePropertyExifShutterSpeedValue", optional=true)
        public static native CFString ShutterSpeedValue();
        @GlobalValue(symbol="kCGImagePropertyExifApertureValue", optional=true)
        public static native CFString ApertureValue();
        @GlobalValue(symbol="kCGImagePropertyExifBrightnessValue", optional=true)
        public static native CFString BrightnessValue();
        @GlobalValue(symbol="kCGImagePropertyExifExposureBiasValue", optional=true)
        public static native CFString ExposureBiasValue();
        @GlobalValue(symbol="kCGImagePropertyExifMaxApertureValue", optional=true)
        public static native CFString MaxApertureValue();
        @GlobalValue(symbol="kCGImagePropertyExifSubjectDistance", optional=true)
        public static native CFString SubjectDistance();
        @GlobalValue(symbol="kCGImagePropertyExifMeteringMode", optional=true)
        public static native CFString MeteringMode();
        @GlobalValue(symbol="kCGImagePropertyExifLightSource", optional=true)
        public static native CFString LightSource();
        @GlobalValue(symbol="kCGImagePropertyExifFlash", optional=true)
        public static native CFString Flash();
        @GlobalValue(symbol="kCGImagePropertyExifFocalLength", optional=true)
        public static native CFString FocalLength();
        @GlobalValue(symbol="kCGImagePropertyExifSubjectArea", optional=true)
        public static native CFString SubjectArea();
        @GlobalValue(symbol="kCGImagePropertyExifMakerNote", optional=true)
        public static native CFString MakerNote();
        @GlobalValue(symbol="kCGImagePropertyExifUserComment", optional=true)
        public static native CFString UserComment();
        @GlobalValue(symbol="kCGImagePropertyExifSubsecTime", optional=true)
        public static native CFString SubsecTime();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifSubsecTimeOriginal", optional=true)
        public static native CFString SubsecTimeOriginal();
        @GlobalValue(symbol="kCGImagePropertyExifSubsecTimeDigitized", optional=true)
        public static native CFString SubsecTimeDigitized();
        @GlobalValue(symbol="kCGImagePropertyExifFlashPixVersion", optional=true)
        public static native CFString FlashPixVersion();
        @GlobalValue(symbol="kCGImagePropertyExifColorSpace", optional=true)
        public static native CFString ColorSpace();
        @GlobalValue(symbol="kCGImagePropertyExifPixelXDimension", optional=true)
        public static native CFString PixelXDimension();
        @GlobalValue(symbol="kCGImagePropertyExifPixelYDimension", optional=true)
        public static native CFString PixelYDimension();
        @GlobalValue(symbol="kCGImagePropertyExifRelatedSoundFile", optional=true)
        public static native CFString RelatedSoundFile();
        @GlobalValue(symbol="kCGImagePropertyExifFlashEnergy", optional=true)
        public static native CFString FlashEnergy();
        @GlobalValue(symbol="kCGImagePropertyExifSpatialFrequencyResponse", optional=true)
        public static native CFString SpatialFrequencyResponse();
        @GlobalValue(symbol="kCGImagePropertyExifFocalPlaneXResolution", optional=true)
        public static native CFString FocalPlaneXResolution();
        @GlobalValue(symbol="kCGImagePropertyExifFocalPlaneYResolution", optional=true)
        public static native CFString FocalPlaneYResolution();
        @GlobalValue(symbol="kCGImagePropertyExifFocalPlaneResolutionUnit", optional=true)
        public static native CFString FocalPlaneResolutionUnit();
        @GlobalValue(symbol="kCGImagePropertyExifSubjectLocation", optional=true)
        public static native CFString SubjectLocation();
        @GlobalValue(symbol="kCGImagePropertyExifExposureIndex", optional=true)
        public static native CFString ExposureIndex();
        @GlobalValue(symbol="kCGImagePropertyExifSensingMethod", optional=true)
        public static native CFString SensingMethod();
        @GlobalValue(symbol="kCGImagePropertyExifFileSource", optional=true)
        public static native CFString FileSource();
        @GlobalValue(symbol="kCGImagePropertyExifSceneType", optional=true)
        public static native CFString SceneType();
        @GlobalValue(symbol="kCGImagePropertyExifCFAPattern", optional=true)
        public static native CFString CFAPattern();
        @GlobalValue(symbol="kCGImagePropertyExifCustomRendered", optional=true)
        public static native CFString CustomRendered();
        @GlobalValue(symbol="kCGImagePropertyExifExposureMode", optional=true)
        public static native CFString ExposureMode();
        @GlobalValue(symbol="kCGImagePropertyExifWhiteBalance", optional=true)
        public static native CFString WhiteBalance();
        @GlobalValue(symbol="kCGImagePropertyExifDigitalZoomRatio", optional=true)
        public static native CFString DigitalZoomRatio();
        @GlobalValue(symbol="kCGImagePropertyExifFocalLenIn35mmFilm", optional=true)
        public static native CFString FocalLenIn35mmFilm();
        @GlobalValue(symbol="kCGImagePropertyExifSceneCaptureType", optional=true)
        public static native CFString SceneCaptureType();
        @GlobalValue(symbol="kCGImagePropertyExifGainControl", optional=true)
        public static native CFString GainControl();
        @GlobalValue(symbol="kCGImagePropertyExifContrast", optional=true)
        public static native CFString Contrast();
        @GlobalValue(symbol="kCGImagePropertyExifSaturation", optional=true)
        public static native CFString Saturation();
        @GlobalValue(symbol="kCGImagePropertyExifSharpness", optional=true)
        public static native CFString Sharpness();
        @GlobalValue(symbol="kCGImagePropertyExifDeviceSettingDescription", optional=true)
        public static native CFString DeviceSettingDescription();
        @GlobalValue(symbol="kCGImagePropertyExifSubjectDistRange", optional=true)
        public static native CFString SubjectDistRange();
        @GlobalValue(symbol="kCGImagePropertyExifImageUniqueID", optional=true)
        public static native CFString ImageUniqueID();
        @GlobalValue(symbol="kCGImagePropertyExifCameraOwnerName", optional=true)
        public static native CFString CameraOwnerName();
        @GlobalValue(symbol="kCGImagePropertyExifBodySerialNumber", optional=true)
        public static native CFString BodySerialNumber();
        @GlobalValue(symbol="kCGImagePropertyExifLensSpecification", optional=true)
        public static native CFString LensSpecification();
        @GlobalValue(symbol="kCGImagePropertyExifLensMake", optional=true)
        public static native CFString LensMake();
        @GlobalValue(symbol="kCGImagePropertyExifLensModel", optional=true)
        public static native CFString LensModel();
        @GlobalValue(symbol="kCGImagePropertyExifLensSerialNumber", optional=true)
        public static native CFString LensSerialNumber();
        @GlobalValue(symbol="kCGImagePropertyExifGamma", optional=true)
        public static native CFString Gamma();
        /**
         * @since Available in iOS 13.1 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifCompositeImage", optional=true)
        public static native CFString CompositeImage();
        /**
         * @since Available in iOS 13.1 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifSourceImageNumberOfCompositeImage", optional=true)
        public static native CFString SourceImageNumberOfCompositeImage();
        /**
         * @since Available in iOS 13.1 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyExifSourceExposureTimesOfCompositeImage", optional=true)
        public static native CFString SourceExposureTimesOfCompositeImage();
        /*</values>*/
    }
}
