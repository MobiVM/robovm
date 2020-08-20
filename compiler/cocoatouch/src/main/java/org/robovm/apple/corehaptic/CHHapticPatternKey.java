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
@Marshaler(/*<name>*/CHHapticPatternKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticPatternKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CHHapticPatternKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CHHapticPatternKey toObject(Class<CHHapticPatternKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CHHapticPatternKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CHHapticPatternKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CHHapticPatternKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CHHapticPatternKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CHHapticPatternKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CHHapticPatternKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CHHapticPatternKey o : l) {
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
    public static final CHHapticPatternKey Version = new CHHapticPatternKey("Version");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey Pattern = new CHHapticPatternKey("Pattern");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey Event = new CHHapticPatternKey("Event");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey EventType = new CHHapticPatternKey("EventType");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey Time = new CHHapticPatternKey("Time");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey EventDuration = new CHHapticPatternKey("EventDuration");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey EventWaveformPath = new CHHapticPatternKey("EventWaveformPath");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey EventParameters = new CHHapticPatternKey("EventParameters");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey Parameter = new CHHapticPatternKey("Parameter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey ParameterID = new CHHapticPatternKey("ParameterID");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey ParameterValue = new CHHapticPatternKey("ParameterValue");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey ParameterCurve = new CHHapticPatternKey("ParameterCurve");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CHHapticPatternKey ParameterCurveControlPoints = new CHHapticPatternKey("ParameterCurveControlPoints");
    /*</constants>*/
    
    private static /*<name>*/CHHapticPatternKey/*</name>*/[] values = new /*<name>*/CHHapticPatternKey/*</name>*/[] {/*<value_list>*/Version, Pattern, Event, EventType, Time, EventDuration, EventWaveformPath, EventParameters, Parameter, ParameterID, ParameterValue, ParameterCurve, ParameterCurveControlPoints/*</value_list>*/};
    
    /*<name>*/CHHapticPatternKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CHHapticPatternKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CHHapticPatternKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CHHapticPatternKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreHaptics") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyVersion", optional=true)
        public static native NSString Version();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyPattern", optional=true)
        public static native NSString Pattern();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEvent", optional=true)
        public static native NSString Event();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventType", optional=true)
        public static native NSString EventType();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyTime", optional=true)
        public static native NSString Time();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventDuration", optional=true)
        public static native NSString EventDuration();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventWaveformPath", optional=true)
        public static native NSString EventWaveformPath();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventParameters", optional=true)
        public static native NSString EventParameters();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyParameter", optional=true)
        public static native NSString Parameter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyParameterID", optional=true)
        public static native NSString ParameterID();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyParameterValue", optional=true)
        public static native NSString ParameterValue();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyParameterCurve", optional=true)
        public static native NSString ParameterCurve();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyParameterCurveControlPoints", optional=true)
        public static native NSString ParameterCurveControlPoints();
        /*</values>*/
    }
}
