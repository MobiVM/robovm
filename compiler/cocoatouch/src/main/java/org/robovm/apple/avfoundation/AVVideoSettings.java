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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
@Marshaler(/*<name>*/AVVideoSettings/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoSettings/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVVideoSettings toObject(Class<AVVideoSettings> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new AVVideoSettings(o);
        }
        @MarshalsPointer
        public static long toNative(AVVideoSettings o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<AVVideoSettings> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVVideoSettings> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new AVVideoSettings(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVVideoSettings> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (AVVideoSettings i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    AVVideoSettings(NSDictionary data) {
        super(data);
    }
    public AVVideoSettings() {}
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
    public AVVideoSettings set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public AVVideoCodecType getCodec() {
        if (has(Keys.Codec())) {
            NSString val = (NSString) get(Keys.Codec());
            return AVVideoCodecType.valueOf(val);
        }
        return null;
    }
    public AVVideoSettings setCodec(AVVideoCodecType codec) {
        set(Keys.Codec(), codec.value());
        return this;
    }
    public long getWidth() {
        if (has(Keys.Width())) {
            NSNumber val = (NSNumber) get(Keys.Width());
            return val.longValue();
        }
        return 0;
    }
    public AVVideoSettings setWidth(long width) {
        set(Keys.Width(), NSNumber.valueOf(width));
        return this;
    }
    public long getHeight() {
        if (has(Keys.Height())) {
            NSNumber val = (NSNumber) get(Keys.Height());
            return val.longValue();
        }
        return 0;
    }
    public AVVideoSettings setHeight(long height) {
        set(Keys.Height(), NSNumber.valueOf(height));
        return this;
    }
    public AVVideoCleanAperture getCleanAperture() {
        if (has(Keys.CleanAperture())) {
            NSDictionary val = (NSDictionary) get(Keys.CleanAperture());
            return new AVVideoCleanAperture(val);
        }
        return null;
    }
    public AVVideoSettings setCleanAperture(AVVideoCleanAperture cleanAperture) {
        set(Keys.CleanAperture(), cleanAperture.getDictionary());
        return this;
    }
    public AVVideoScalingMode getScalingMode() {
        if (has(Keys.ScalingMode())) {
            NSString val = (NSString) get(Keys.ScalingMode());
            return AVVideoScalingMode.valueOf(val);
        }
        return null;
    }
    public AVVideoSettings setScalingMode(AVVideoScalingMode scalingMode) {
        set(Keys.ScalingMode(), scalingMode.value());
        return this;
    }
    public boolean allowsFrameReordering() {
        if (has(Keys.AllowFrameReordering())) {
            NSNumber val = (NSNumber) get(Keys.AllowFrameReordering());
            return val.booleanValue();
        }
        return false;
    }
    public AVVideoSettings setAllowsFrameReordering(boolean allowsFrameReordering) {
        set(Keys.AllowFrameReordering(), NSNumber.valueOf(allowsFrameReordering));
        return this;
    }
    public AVVideoProfileLevel getProfileLevel() {
        if (has(Keys.ProfileLevel())) {
            NSString val = (NSString) get(Keys.ProfileLevel());
            return AVVideoProfileLevel.valueOf(val);
        }
        return null;
    }
    public AVVideoSettings setProfileLevel(AVVideoProfileLevel profileLevel) {
        set(Keys.ProfileLevel(), profileLevel.value());
        return this;
    }
    public AVVideoH264EntropyMode getH264EntropyMode() {
        if (has(Keys.H264EntropyMode())) {
            NSString val = (NSString) get(Keys.H264EntropyMode());
            return AVVideoH264EntropyMode.valueOf(val);
        }
        return null;
    }
    public AVVideoSettings setH264EntropyMode(AVVideoH264EntropyMode h264EntropyMode) {
        set(Keys.H264EntropyMode(), h264EntropyMode.value());
        return this;
    }
    public double getExpectedSourceFrameRate() {
        if (has(Keys.ExpectedSourceFrameRate())) {
            NSNumber val = (NSNumber) get(Keys.ExpectedSourceFrameRate());
            return val.doubleValue();
        }
        return 0;
    }
    public AVVideoSettings setExpectedSourceFrameRate(double expectedSourceFrameRate) {
        set(Keys.ExpectedSourceFrameRate(), NSNumber.valueOf(expectedSourceFrameRate));
        return this;
    }
    public double getAverageNonDroppableFrameRate() {
        if (has(Keys.AverageNonDroppableFrameRate())) {
            NSNumber val = (NSNumber) get(Keys.AverageNonDroppableFrameRate());
            return val.doubleValue();
        }
        return 0;
    }
    public AVVideoSettings setAverageNonDroppableFrameRate(double averageNonDroppableFrameRate) {
        set(Keys.AverageNonDroppableFrameRate(), NSNumber.valueOf(averageNonDroppableFrameRate));
        return this;
    }
    /*</methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVPixelAspectRatio getPixelAspectRatio() {
        if (has(Keys.PixelAspectRatio())) {
            NSDictionary<NSString, NSObject> val = (NSDictionary<NSString, NSObject>) get(Keys.PixelAspectRatio());
            AVPixelAspectRatio result = new AVPixelAspectRatio(val.getLong(AVPixelAspectRatio.HorizontalSpacing(), 0), val.getLong(AVPixelAspectRatio.VerticalSpacing(), 0));
            return result;
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public AVVideoSettings setPixelAspectRatio(AVPixelAspectRatio pixelAspectRatio) {
        NSDictionary<NSString, NSObject> val = new NSMutableDictionary<>();
        val.put(AVPixelAspectRatio.HorizontalSpacing(), pixelAspectRatio.getHorizontalSpacing());
        val.put(AVPixelAspectRatio.VerticalSpacing(), pixelAspectRatio.getVerticalSpacing());
        set(Keys.PixelAspectRatio(), val);
        return this;
    }
    
    /*<keys>*/
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="AVVideoCodecKey", optional=true)
        public static native NSString Codec();
        @GlobalValue(symbol="AVVideoWidthKey", optional=true)
        public static native NSString Width();
        @GlobalValue(symbol="AVVideoHeightKey", optional=true)
        public static native NSString Height();
        @GlobalValue(symbol="AVVideoPixelAspectRatioKey", optional=true)
        public static native NSString PixelAspectRatio();
        @GlobalValue(symbol="AVVideoCleanApertureKey", optional=true)
        public static native NSString CleanAperture();
        @GlobalValue(symbol="AVVideoScalingModeKey", optional=true)
        public static native NSString ScalingMode();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="AVVideoColorPropertiesKey", optional=true)
        public static native NSString ColorProperties();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="AVVideoColorPrimariesKey", optional=true)
        public static native NSString ColorPrimaries();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="AVVideoTransferFunctionKey", optional=true)
        public static native NSString TransferFunction();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="AVVideoYCbCrMatrixKey", optional=true)
        public static native NSString YCbCrMatrix();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="AVVideoAllowWideColorKey", optional=true)
        public static native NSString AllowWideColor();
        @GlobalValue(symbol="AVVideoCompressionPropertiesKey", optional=true)
        public static native NSString CompressionProperties();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="AVVideoAppleProRAWBitDepthKey", optional=true)
        public static native NSString AppleProRAWBitDepth();
        @GlobalValue(symbol="AVVideoAllowFrameReorderingKey", optional=true)
        public static native NSString AllowFrameReordering();
        @GlobalValue(symbol="AVVideoProfileLevelKey", optional=true)
        public static native NSString ProfileLevel();
        @GlobalValue(symbol="AVVideoH264EntropyModeKey", optional=true)
        public static native NSString H264EntropyMode();
        @GlobalValue(symbol="AVVideoExpectedSourceFrameRateKey", optional=true)
        public static native NSString ExpectedSourceFrameRate();
        @GlobalValue(symbol="AVVideoAverageNonDroppableFrameRateKey", optional=true)
        public static native NSString AverageNonDroppableFrameRate();
    }
    /*</keys>*/
}
