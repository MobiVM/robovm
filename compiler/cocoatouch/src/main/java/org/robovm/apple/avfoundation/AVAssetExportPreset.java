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
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVAssetExportPreset/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetExportPreset/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVAssetExportPreset/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVAssetExportPreset toObject(Class<AVAssetExportPreset> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVAssetExportPreset.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVAssetExportPreset o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVAssetExportPreset> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVAssetExportPreset> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVAssetExportPreset.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVAssetExportPreset> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVAssetExportPreset o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVAssetExportPreset LowQuality = new AVAssetExportPreset("LowQuality");
    public static final AVAssetExportPreset MediumQuality = new AVAssetExportPreset("MediumQuality");
    public static final AVAssetExportPreset HighestQuality = new AVAssetExportPreset("HighestQuality");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVAssetExportPreset HEVCHighestQuality = new AVAssetExportPreset("HEVCHighestQuality");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVAssetExportPreset HEVCHighestQualityWithAlpha = new AVAssetExportPreset("HEVCHighestQualityWithAlpha");
    public static final AVAssetExportPreset Size640x480 = new AVAssetExportPreset("Size640x480");
    public static final AVAssetExportPreset Size960x540 = new AVAssetExportPreset("Size960x540");
    public static final AVAssetExportPreset Size1280x720 = new AVAssetExportPreset("Size1280x720");
    public static final AVAssetExportPreset Size1920x1080 = new AVAssetExportPreset("Size1920x1080");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVAssetExportPreset Size3840x2160 = new AVAssetExportPreset("Size3840x2160");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVAssetExportPreset HEVC1920x1080 = new AVAssetExportPreset("HEVC1920x1080");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVAssetExportPreset HEVC1920x1080WithAlpha = new AVAssetExportPreset("HEVC1920x1080WithAlpha");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVAssetExportPreset HEVC3840x2160 = new AVAssetExportPreset("HEVC3840x2160");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVAssetExportPreset HEVC3840x2160WithAlpha = new AVAssetExportPreset("HEVC3840x2160WithAlpha");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVAssetExportPreset MVHEVC960x960 = new AVAssetExportPreset("MVHEVC960x960");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVAssetExportPreset MVHEVC1440x1440 = new AVAssetExportPreset("MVHEVC1440x1440");
    public static final AVAssetExportPreset AppleM4A = new AVAssetExportPreset("AppleM4A");
    public static final AVAssetExportPreset Passthrough = new AVAssetExportPreset("Passthrough");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVAssetExportPreset AppleProRes422LPCM = new AVAssetExportPreset("AppleProRes422LPCM");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVAssetExportPreset AppleProRes4444LPCM = new AVAssetExportPreset("AppleProRes4444LPCM");
    /*</constants>*/
    
    private static /*<name>*/AVAssetExportPreset/*</name>*/[] values = new /*<name>*/AVAssetExportPreset/*</name>*/[] {/*<value_list>*/LowQuality, MediumQuality, HighestQuality, HEVCHighestQuality, HEVCHighestQualityWithAlpha, Size640x480, Size960x540, Size1280x720, Size1920x1080, Size3840x2160, HEVC1920x1080, HEVC1920x1080WithAlpha, HEVC3840x2160, HEVC3840x2160WithAlpha, MVHEVC960x960, MVHEVC1440x1440, AppleM4A, Passthrough, AppleProRes422LPCM, AppleProRes4444LPCM/*</value_list>*/};
    
    /*<name>*/AVAssetExportPreset/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVAssetExportPreset/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVAssetExportPreset/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVAssetExportPreset/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVAssetExportPresetLowQuality", optional=true)
        public static native NSString LowQuality();
        @GlobalValue(symbol="AVAssetExportPresetMediumQuality", optional=true)
        public static native NSString MediumQuality();
        @GlobalValue(symbol="AVAssetExportPresetHighestQuality", optional=true)
        public static native NSString HighestQuality();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVCHighestQuality", optional=true)
        public static native NSString HEVCHighestQuality();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVCHighestQualityWithAlpha", optional=true)
        public static native NSString HEVCHighestQualityWithAlpha();
        @GlobalValue(symbol="AVAssetExportPreset640x480", optional=true)
        public static native NSString Size640x480();
        @GlobalValue(symbol="AVAssetExportPreset960x540", optional=true)
        public static native NSString Size960x540();
        @GlobalValue(symbol="AVAssetExportPreset1280x720", optional=true)
        public static native NSString Size1280x720();
        @GlobalValue(symbol="AVAssetExportPreset1920x1080", optional=true)
        public static native NSString Size1920x1080();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPreset3840x2160", optional=true)
        public static native NSString Size3840x2160();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVC1920x1080", optional=true)
        public static native NSString HEVC1920x1080();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVC1920x1080WithAlpha", optional=true)
        public static native NSString HEVC1920x1080WithAlpha();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVC3840x2160", optional=true)
        public static native NSString HEVC3840x2160();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetHEVC3840x2160WithAlpha", optional=true)
        public static native NSString HEVC3840x2160WithAlpha();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetMVHEVC960x960", optional=true)
        public static native NSString MVHEVC960x960();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetMVHEVC1440x1440", optional=true)
        public static native NSString MVHEVC1440x1440();
        @GlobalValue(symbol="AVAssetExportPresetAppleM4A", optional=true)
        public static native NSString AppleM4A();
        @GlobalValue(symbol="AVAssetExportPresetPassthrough", optional=true)
        public static native NSString Passthrough();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetAppleProRes422LPCM", optional=true)
        public static native NSString AppleProRes422LPCM();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVAssetExportPresetAppleProRes4444LPCM", optional=true)
        public static native NSString AppleProRes4444LPCM();
        /*</values>*/
    }
}
