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
@Marshaler(/*<name>*/CHHapticEventType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticEventType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CHHapticEventType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CHHapticEventType toObject(Class<CHHapticEventType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CHHapticEventType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CHHapticEventType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CHHapticEventType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CHHapticEventType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CHHapticEventType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CHHapticEventType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CHHapticEventType o : l) {
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
    public static final CHHapticEventType HapticTransient = new CHHapticEventType("HapticTransient");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventType HapticContinuous = new CHHapticEventType("HapticContinuous");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventType AudioContinuous = new CHHapticEventType("AudioContinuous");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticEventType AudioCustom = new CHHapticEventType("AudioCustom");
    /*</constants>*/
    
    private static /*<name>*/CHHapticEventType/*</name>*/[] values = new /*<name>*/CHHapticEventType/*</name>*/[] {/*<value_list>*/HapticTransient, HapticContinuous, AudioContinuous, AudioCustom/*</value_list>*/};
    
    /*<name>*/CHHapticEventType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CHHapticEventType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CHHapticEventType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CHHapticEventType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreHaptics") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventTypeHapticTransient", optional=true)
        public static native NSString HapticTransient();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventTypeHapticContinuous", optional=true)
        public static native NSString HapticContinuous();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventTypeAudioContinuous", optional=true)
        public static native NSString AudioContinuous();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticEventTypeAudioCustom", optional=true)
        public static native NSString AudioCustom();
        /*</values>*/
    }
}
