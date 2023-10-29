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
@Marshaler(/*<name>*/AVOutputSettingsPreset/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVOutputSettingsPreset/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVOutputSettingsPreset/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVOutputSettingsPreset toObject(Class<AVOutputSettingsPreset> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVOutputSettingsPreset.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVOutputSettingsPreset o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVOutputSettingsPreset> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVOutputSettingsPreset> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVOutputSettingsPreset.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVOutputSettingsPreset> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVOutputSettingsPreset o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVOutputSettingsPreset Size640x480 = new AVOutputSettingsPreset("Size640x480");
    public static final AVOutputSettingsPreset Size960x540 = new AVOutputSettingsPreset("Size960x540");
    public static final AVOutputSettingsPreset Size1280x720 = new AVOutputSettingsPreset("Size1280x720");
    public static final AVOutputSettingsPreset Size1920x1080 = new AVOutputSettingsPreset("Size1920x1080");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVOutputSettingsPreset Size3840x2160 = new AVOutputSettingsPreset("Size3840x2160");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVOutputSettingsPreset SizeHEVC1920x1080 = new AVOutputSettingsPreset("SizeHEVC1920x1080");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVOutputSettingsPreset SizeHEVC1920x1080WithAlpha = new AVOutputSettingsPreset("SizeHEVC1920x1080WithAlpha");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final AVOutputSettingsPreset SizeHEVC3840x2160 = new AVOutputSettingsPreset("SizeHEVC3840x2160");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVOutputSettingsPreset SizeHEVC3840x2160WithAlpha = new AVOutputSettingsPreset("SizeHEVC3840x2160WithAlpha");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVOutputSettingsPreset SizeMVHEVC960x960 = new AVOutputSettingsPreset("SizeMVHEVC960x960");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVOutputSettingsPreset SizeMVHEVC1440x1440 = new AVOutputSettingsPreset("SizeMVHEVC1440x1440");
    /*</constants>*/
    
    private static /*<name>*/AVOutputSettingsPreset/*</name>*/[] values = new /*<name>*/AVOutputSettingsPreset/*</name>*/[] {/*<value_list>*/Size640x480, Size960x540, Size1280x720, Size1920x1080, Size3840x2160, SizeHEVC1920x1080, SizeHEVC1920x1080WithAlpha, SizeHEVC3840x2160, SizeHEVC3840x2160WithAlpha, SizeMVHEVC960x960, SizeMVHEVC1440x1440/*</value_list>*/};
    
    /*<name>*/AVOutputSettingsPreset/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVOutputSettingsPreset/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVOutputSettingsPreset/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVOutputSettingsPreset/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVOutputSettingsPreset640x480", optional=true)
        public static native NSString Size640x480();
        @GlobalValue(symbol="AVOutputSettingsPreset960x540", optional=true)
        public static native NSString Size960x540();
        @GlobalValue(symbol="AVOutputSettingsPreset1280x720", optional=true)
        public static native NSString Size1280x720();
        @GlobalValue(symbol="AVOutputSettingsPreset1920x1080", optional=true)
        public static native NSString Size1920x1080();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPreset3840x2160", optional=true)
        public static native NSString Size3840x2160();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetHEVC1920x1080", optional=true)
        public static native NSString SizeHEVC1920x1080();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetHEVC1920x1080WithAlpha", optional=true)
        public static native NSString SizeHEVC1920x1080WithAlpha();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetHEVC3840x2160", optional=true)
        public static native NSString SizeHEVC3840x2160();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetHEVC3840x2160WithAlpha", optional=true)
        public static native NSString SizeHEVC3840x2160WithAlpha();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetMVHEVC960x960", optional=true)
        public static native NSString SizeMVHEVC960x960();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVOutputSettingsPresetMVHEVC1440x1440", optional=true)
        public static native NSString SizeMVHEVC1440x1440();
        /*</values>*/
    }
}
