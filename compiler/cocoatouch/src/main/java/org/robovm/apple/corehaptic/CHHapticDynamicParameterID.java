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
package org.robovm.apple.corehaptic;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreHaptics") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CHHapticDynamicParameterID/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticDynamicParameterID/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CHHapticDynamicParameterID/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CHHapticDynamicParameterID toObject(Class<CHHapticDynamicParameterID> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CHHapticDynamicParameterID.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CHHapticDynamicParameterID o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CHHapticDynamicParameterID> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CHHapticDynamicParameterID> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CHHapticDynamicParameterID.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CHHapticDynamicParameterID> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CHHapticDynamicParameterID o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID HapticIntensityControl = new CHHapticDynamicParameterID("HapticIntensityControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID HapticSharpnessControl = new CHHapticDynamicParameterID("HapticSharpnessControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID HapticAttackTimeControl = new CHHapticDynamicParameterID("HapticAttackTimeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID HapticDecayTimeControl = new CHHapticDynamicParameterID("HapticDecayTimeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID HapticReleaseTimeControl = new CHHapticDynamicParameterID("HapticReleaseTimeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioVolumeControl = new CHHapticDynamicParameterID("AudioVolumeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioPanControl = new CHHapticDynamicParameterID("AudioPanControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioBrightnessControl = new CHHapticDynamicParameterID("AudioBrightnessControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioPitchControl = new CHHapticDynamicParameterID("AudioPitchControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioAttackTimeControl = new CHHapticDynamicParameterID("AudioAttackTimeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioDecayTimeControl = new CHHapticDynamicParameterID("AudioDecayTimeControl");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticDynamicParameterID AudioReleaseTimeControl = new CHHapticDynamicParameterID("AudioReleaseTimeControl");
    /*</constants>*/
    
    private static /*<name>*/CHHapticDynamicParameterID/*</name>*/[] values = new /*<name>*/CHHapticDynamicParameterID/*</name>*/[] {/*<value_list>*/HapticIntensityControl, HapticSharpnessControl, HapticAttackTimeControl, HapticDecayTimeControl, HapticReleaseTimeControl, AudioVolumeControl, AudioPanControl, AudioBrightnessControl, AudioPitchControl, AudioAttackTimeControl, AudioDecayTimeControl, AudioReleaseTimeControl/*</value_list>*/};
    
    /*<name>*/CHHapticDynamicParameterID/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CHHapticDynamicParameterID/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CHHapticDynamicParameterID/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CHHapticDynamicParameterID/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreHaptics") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDHapticIntensityControl", optional=true)
        public static native NSString HapticIntensityControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDHapticSharpnessControl", optional=true)
        public static native NSString HapticSharpnessControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDHapticAttackTimeControl", optional=true)
        public static native NSString HapticAttackTimeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDHapticDecayTimeControl", optional=true)
        public static native NSString HapticDecayTimeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDHapticReleaseTimeControl", optional=true)
        public static native NSString HapticReleaseTimeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioVolumeControl", optional=true)
        public static native NSString AudioVolumeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioPanControl", optional=true)
        public static native NSString AudioPanControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioBrightnessControl", optional=true)
        public static native NSString AudioBrightnessControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioPitchControl", optional=true)
        public static native NSString AudioPitchControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioAttackTimeControl", optional=true)
        public static native NSString AudioAttackTimeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioDecayTimeControl", optional=true)
        public static native NSString AudioDecayTimeControl();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticDynamicParameterIDAudioReleaseTimeControl", optional=true)
        public static native NSString AudioReleaseTimeControl();
        /*</values>*/
    }
}
