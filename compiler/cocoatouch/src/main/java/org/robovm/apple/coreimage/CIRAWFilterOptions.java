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
@Marshaler(/*<name>*/CIRAWFilterOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIRAWFilterOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIRAWFilterOptions toObject(Class<CIRAWFilterOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIRAWFilterOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CIRAWFilterOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIRAWFilterOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIRAWFilterOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIRAWFilterOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIRAWFilterOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CIRAWFilterOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIRAWFilterOptions(NSDictionary data) {
        super(data);
    }
    public CIRAWFilterOptions() {}
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
    public CIRAWFilterOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
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
        public static native NSString kCISupportedDecoderVersions();
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
        public static native NSString LinearSpaceFilter();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIOutputNativeSizeKey", optional=true)
        public static native NSString kCIOutputNativeSize();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIActiveKeys", optional=true)
        public static native NSString kCIActiveKeys();
    }
    /*</keys>*/
}
