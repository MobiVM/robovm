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
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
@Marshaler(/*<name>*/CIFilterInputParameters/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIFilterInputParameters/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIFilterInputParameters toObject(Class<CIFilterInputParameters> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIFilterInputParameters(o);
        }
        @MarshalsPointer
        public static long toNative(CIFilterInputParameters o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIFilterInputParameters> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIFilterInputParameters> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIFilterInputParameters(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIFilterInputParameters> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CIFilterInputParameters i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIFilterInputParameters(NSDictionary data) {
        super(data);
    }
    public CIFilterInputParameters() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public CIFilterInputParameters set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIImage getOutputImage() {
        if (has(Keys.OutputImage())) {
            CIImage val = (CIImage) get(Keys.OutputImage());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIFilterInputParameters setOutputImage(CIImage outputImage) {
        set(Keys.OutputImage(), outputImage);
        return this;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIImage getBackgroundImage() {
        if (has(Keys.BackgroundImage())) {
            CIImage val = (CIImage) get(Keys.BackgroundImage());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIFilterInputParameters setBackgroundImage(CIImage backgroundImage) {
        set(Keys.BackgroundImage(), backgroundImage);
        return this;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIImage getInputImage() {
        if (has(Keys.Image())) {
            CIImage val = (CIImage) get(Keys.Image());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIFilterInputParameters setInputImage(CIImage inputImage) {
        set(Keys.Image(), inputImage);
        return this;
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public long getVersion() {
        if (has(Keys.Version())) {
            NSNumber val = (NSNumber) get(Keys.Version());
            return val.longValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public CIFilterInputParameters setVersion(long version) {
        set(Keys.Version(), NSNumber.valueOf(version));
        return this;
    }
    /*</methods>*/
    public boolean has(String key) {
        return has(new NSString(key));
    }
    public NSObject get(String key) {
        return get(new NSString(key));
    }
    public CIFilterInputParameters set(String key, NSObject value) {
        return set(new NSString(key), value);
    }
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCIOutputImageKey", optional=true)
        public static native NSString OutputImage();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCIInputBackgroundImageKey", optional=true)
        public static native NSString BackgroundImage();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCIInputImageKey", optional=true)
        public static native NSString Image();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIInputDepthImageKey", optional=true)
        public static native NSString DepthImage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIInputDisparityImageKey", optional=true)
        public static native NSString DisparityImage();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputRefractionKey", optional=true)
        public static native NSString Refraction();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputBiasKey", optional=true)
        public static native NSString Bias();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputWeightsKey", optional=true)
        public static native NSString Weights();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputGradientImageKey", optional=true)
        public static native NSString GradientImage();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputShadingImageKey", optional=true)
        public static native NSString ShadingImage();
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="kCIInputVersionKey", optional=true)
        public static native NSString Version();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputAllowDraftModeKey", optional=true)
        public static native NSString AllowDraftMode();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputDecoderVersionKey", optional=true)
        public static native NSString DecoderVersion();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCISupportedDecoderVersionsKey", optional=true)
        public static native String SupportedDecoderVersions();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputBaselineExposureKey", optional=true)
        public static native NSString BaselineExposure();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputBoostKey", optional=true)
        public static native NSString Boost();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputBoostShadowAmountKey", optional=true)
        public static native NSString BoostShadowAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputDisableGamutMapKey", optional=true)
        public static native NSString DisableGamutMap();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNeutralChromaticityXKey", optional=true)
        public static native NSString NeutralChromaticityX();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNeutralChromaticityYKey", optional=true)
        public static native NSString NeutralChromaticityY();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNeutralTemperatureKey", optional=true)
        public static native NSString NeutralTemperature();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNeutralTintKey", optional=true)
        public static native NSString NeutralTint();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNeutralLocationKey", optional=true)
        public static native NSString NeutralLocation();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputScaleFactorKey", optional=true)
        public static native NSString ScaleFactor();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputIgnoreImageOrientationKey", optional=true)
        public static native NSString IgnoreImageOrientation();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputImageOrientationKey", optional=true)
        public static native NSString ImageOrientation();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputEnableSharpeningKey", optional=true)
        public static native NSString EnableSharpening();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputEnableChromaticNoiseTrackingKey", optional=true)
        public static native NSString EnableChromaticNoiseTracking();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNoiseReductionAmountKey", optional=true)
        public static native NSString NoiseReductionAmount();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIInputMoireAmountKey", optional=true)
        public static native NSString MoireAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputEnableVendorLensCorrectionKey", optional=true)
        public static native NSString EnableVendorLensCorrection();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputLuminanceNoiseReductionAmountKey", optional=true)
        public static native NSString LuminanceNoiseReductionAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputColorNoiseReductionAmountKey", optional=true)
        public static native NSString ColorNoiseReductionAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNoiseReductionSharpnessAmountKey", optional=true)
        public static native NSString NoiseReductionSharpnessAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNoiseReductionContrastAmountKey", optional=true)
        public static native NSString NoiseReductionContrastAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputNoiseReductionDetailAmountKey", optional=true)
        public static native NSString NoiseReductionDetailAmount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIInputLinearSpaceFilter", optional=true)
        public static native String LinearSpaceFilter();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIOutputNativeSizeKey", optional=true)
        public static native String NativeSize();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIActiveKeys", optional=true)
        public static native String ActiveKeys();
    }
    /*</keys>*/
}
