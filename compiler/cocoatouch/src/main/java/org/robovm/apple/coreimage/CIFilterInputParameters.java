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
import org.robovm.apple.avfoundation.*;
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
    

    public CIImage getOutputImage() {
        if (has(Keys.OutputImage())) {
            CIImage val = (CIImage) get(Keys.OutputImage());
            return val;
        }
        return null;
    }
    public CIFilterInputParameters setOutputImage(CIImage outputImage) {
        set(Keys.OutputImage(), outputImage);
        return this;
    }
    public CIImage getBackgroundImage() {
        if (has(Keys.BackgroundImage())) {
            CIImage val = (CIImage) get(Keys.BackgroundImage());
            return val;
        }
        return null;
    }
    public CIFilterInputParameters setBackgroundImage(CIImage backgroundImage) {
        set(Keys.BackgroundImage(), backgroundImage);
        return this;
    }
    public CIImage getInputImage() {
        if (has(Keys.Image())) {
            CIImage val = (CIImage) get(Keys.Image());
            return val;
        }
        return null;
    }
    public CIFilterInputParameters setInputImage(CIImage inputImage) {
        set(Keys.Image(), inputImage);
        return this;
    }
    public long getVersion() {
        if (has(Keys.Version())) {
            NSNumber val = (NSNumber) get(Keys.Version());
            return val.longValue();
        }
        return 0;
    }
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
        @GlobalValue(symbol="kCIOutputImageKey", optional=true)
        public static native NSString OutputImage();
        @GlobalValue(symbol="kCIInputBackgroundImageKey", optional=true)
        public static native NSString BackgroundImage();
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
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIInputAmountKey", optional=true)
        public static native NSString Amount();
        @GlobalValue(symbol="kCIInputTimeKey", optional=true)
        public static native NSString Time();
        @GlobalValue(symbol="kCIInputTransformKey", optional=true)
        public static native NSString Transform();
        @GlobalValue(symbol="kCIInputScaleKey", optional=true)
        public static native NSString Scale();
        @GlobalValue(symbol="kCIInputAspectRatioKey", optional=true)
        public static native NSString AspectRatio();
        @GlobalValue(symbol="kCIInputCenterKey", optional=true)
        public static native NSString Center();
        @GlobalValue(symbol="kCIInputRadiusKey", optional=true)
        public static native NSString Radius();
        @GlobalValue(symbol="kCIInputAngleKey", optional=true)
        public static native NSString Angle();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputRefractionKey", optional=true)
        public static native NSString Refraction();
        @GlobalValue(symbol="kCIInputWidthKey", optional=true)
        public static native NSString Width();
        @GlobalValue(symbol="kCIInputSharpnessKey", optional=true)
        public static native NSString Sharpness();
        @GlobalValue(symbol="kCIInputIntensityKey", optional=true)
        public static native NSString Intensity();
        @GlobalValue(symbol="kCIInputEVKey", optional=true)
        public static native NSString EV();
        @GlobalValue(symbol="kCIInputSaturationKey", optional=true)
        public static native NSString Saturation();
        @GlobalValue(symbol="kCIInputColorKey", optional=true)
        public static native NSString Color();
        @GlobalValue(symbol="kCIInputBrightnessKey", optional=true)
        public static native NSString Brightness();
        @GlobalValue(symbol="kCIInputContrastKey", optional=true)
        public static native NSString Contrast();
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
        @GlobalValue(symbol="kCIInputMaskImageKey", optional=true)
        public static native NSString MaskImage();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIInputMatteImageKey", optional=true)
        public static native NSString MatteImage();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIInputShadingImageKey", optional=true)
        public static native NSString ShadingImage();
        @GlobalValue(symbol="kCIInputTargetImageKey", optional=true)
        public static native NSString TargetImage();
        @GlobalValue(symbol="kCIInputExtentKey", optional=true)
        public static native NSString Extent();
        @GlobalValue(symbol="kCIInputVersionKey", optional=true)
        public static native NSString Version();
    }
    /*</keys>*/
}
