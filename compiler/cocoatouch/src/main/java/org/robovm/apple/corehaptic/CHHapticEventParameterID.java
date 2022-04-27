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
@Marshaler(/*<name>*/CHHapticEventParameterID/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticEventParameterID/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CHHapticEventParameterID/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CHHapticEventParameterID toObject(Class<CHHapticEventParameterID> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CHHapticEventParameterID.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CHHapticEventParameterID o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CHHapticEventParameterID> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CHHapticEventParameterID> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CHHapticEventParameterID.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CHHapticEventParameterID> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CHHapticEventParameterID o : l) {
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
    public static final CHHapticEventParameterID HapticIntensity = new CHHapticEventParameterID("HapticIntensity");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID HapticSharpness = new CHHapticEventParameterID("HapticSharpness");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID AttackTime = new CHHapticEventParameterID("AttackTime");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID DecayTime = new CHHapticEventParameterID("DecayTime");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID ReleaseTime = new CHHapticEventParameterID("ReleaseTime");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID Sustained = new CHHapticEventParameterID("Sustained");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID AudioVolume = new CHHapticEventParameterID("AudioVolume");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID AudioPitch = new CHHapticEventParameterID("AudioPitch");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID AudioPan = new CHHapticEventParameterID("AudioPan");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventParameterID AudioBrightness = new CHHapticEventParameterID("AudioBrightness");
    /*</constants>*/
    
    private static /*<name>*/CHHapticEventParameterID/*</name>*/[] values = new /*<name>*/CHHapticEventParameterID/*</name>*/[] {/*<value_list>*/HapticIntensity, HapticSharpness, AttackTime, DecayTime, ReleaseTime, Sustained, AudioVolume, AudioPitch, AudioPan, AudioBrightness/*</value_list>*/};
    
    /*<name>*/CHHapticEventParameterID/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CHHapticEventParameterID/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CHHapticEventParameterID/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CHHapticEventParameterID/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreHaptics") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDHapticIntensity", optional=true)
        public static native NSString HapticIntensity();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDHapticSharpness", optional=true)
        public static native NSString HapticSharpness();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDAttackTime", optional=true)
        public static native NSString AttackTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDDecayTime", optional=true)
        public static native NSString DecayTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDReleaseTime", optional=true)
        public static native NSString ReleaseTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDSustained", optional=true)
        public static native NSString Sustained();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDAudioVolume", optional=true)
        public static native NSString AudioVolume();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDAudioPitch", optional=true)
        public static native NSString AudioPitch();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDAudioPan", optional=true)
        public static native NSString AudioPan();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventParameterIDAudioBrightness", optional=true)
        public static native NSString AudioBrightness();
        /*</values>*/
    }
}
