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
/*<annotations>*/@Library("CoreHaptics")/*</annotations>*/
@Marshaler(/*<name>*/CHHapticPatternDict/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticPatternDict/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CHHapticPatternDict toObject(Class<CHHapticPatternDict> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CHHapticPatternDict(o);
        }
        @MarshalsPointer
        public static long toNative(CHHapticPatternDict o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CHHapticPatternDict> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CHHapticPatternDict> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CHHapticPatternDict(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CHHapticPatternDict> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CHHapticPatternDict i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CHHapticPatternDict(NSDictionary data) {
        super(data);
    }
    public CHHapticPatternDict() {}
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
    public CHHapticPatternDict set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 13.0 and later.
     */
    public double getVersion() {
        if (has(Keys.Version())) {
            NSNumber val = (NSNumber) get(Keys.Version());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setVersion(double version) {
        set(Keys.Version(), NSNumber.valueOf(version));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSArray<?> getPattern() {
        if (has(Keys.Pattern())) {
            NSArray<?> val = (NSArray<?>) get(Keys.Pattern());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setPattern(NSArray<?> pattern) {
        set(Keys.Pattern(), pattern);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict getEvent() {
        if (has(Keys.Event())) {
            NSDictionary val = (NSDictionary) get(Keys.Event());
            return new CHHapticPatternDict(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setEvent(CHHapticPatternDict event) {
        set(Keys.Event(), event.getDictionary());
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticEventType getEventType() {
        if (has(Keys.EventType())) {
            NSString val = (NSString) get(Keys.EventType());
            return CHHapticEventType.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setEventType(CHHapticEventType eventType) {
        set(Keys.EventType(), eventType.value());
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public double getTime() {
        if (has(Keys.Time())) {
            NSNumber val = (NSNumber) get(Keys.Time());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setTime(double time) {
        set(Keys.Time(), NSNumber.valueOf(time));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public double getEventDuration() {
        if (has(Keys.EventDuration())) {
            NSNumber val = (NSNumber) get(Keys.EventDuration());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setEventDuration(double eventDuration) {
        set(Keys.EventDuration(), NSNumber.valueOf(eventDuration));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public String getEventWaveformPath() {
        if (has(Keys.EventWaveformPath())) {
            NSString val = (NSString) get(Keys.EventWaveformPath());
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setEventWaveformPath(String eventWaveformPath) {
        set(Keys.EventWaveformPath(), new NSString(eventWaveformPath));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSArray<?> getEventParameters() {
        if (has(Keys.EventParameters())) {
            NSArray<?> val = (NSArray<?>) get(Keys.EventParameters());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setEventParameters(NSArray<?> eventParameters) {
        set(Keys.EventParameters(), eventParameters);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NSDictionary<?, ?> getParameter() {
        if (has(Keys.Parameter())) {
            NSDictionary<?, ?> val = (NSDictionary<?, ?>) get(Keys.Parameter());
            return val;
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setParameter(NSDictionary<?, ?> parameter) {
        set(Keys.Parameter(), parameter);
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticEventParameterID getParameterID() {
        if (has(Keys.ParameterID())) {
            NSString val = (NSString) get(Keys.ParameterID());
            return CHHapticEventParameterID.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setParameterID(CHHapticEventParameterID parameterID) {
        set(Keys.ParameterID(), parameterID.value());
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public double getParameterValue() {
        if (has(Keys.ParameterValue())) {
            NSNumber val = (NSNumber) get(Keys.ParameterValue());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CHHapticPatternDict setParameterValue(double parameterValue) {
        set(Keys.ParameterValue(), NSNumber.valueOf(parameterValue));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreHaptics")
    public static class Keys {
        static { Bro.bind(Keys.class); }
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
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventWaveformUseVolumeEnvelope", optional=true)
        public static native NSString EventWaveformUseVolumeEnvelope();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="CHHapticPatternKeyEventWaveformLoopEnabled", optional=true)
        public static native NSString EventWaveformLoopEnabled();
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
    }
    /*</keys>*/
}
