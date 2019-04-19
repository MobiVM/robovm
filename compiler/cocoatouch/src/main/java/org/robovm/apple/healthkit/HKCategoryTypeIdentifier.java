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
package org.robovm.apple.healthkit;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HKCategoryTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCategoryTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKCategoryTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKCategoryTypeIdentifier toObject(Class<HKCategoryTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKCategoryTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKCategoryTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKCategoryTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKCategoryTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKCategoryTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKCategoryTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKCategoryTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKCategoryTypeIdentifier SleepAnalysis = new HKCategoryTypeIdentifier("SleepAnalysis");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier AppleStandHour = new HKCategoryTypeIdentifier("AppleStandHour");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier CervicalMucusQuality = new HKCategoryTypeIdentifier("CervicalMucusQuality");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier OvulationTestResult = new HKCategoryTypeIdentifier("OvulationTestResult");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier MenstrualFlow = new HKCategoryTypeIdentifier("MenstrualFlow");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier IntermenstrualBleeding = new HKCategoryTypeIdentifier("IntermenstrualBleeding");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier SexualActivity = new HKCategoryTypeIdentifier("SexualActivity");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKCategoryTypeIdentifier MindfulSession = new HKCategoryTypeIdentifier("MindfulSession");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier HighHeartRateEvent = new HKCategoryTypeIdentifier("HighHeartRateEvent");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier LowHeartRateEvent = new HKCategoryTypeIdentifier("LowHeartRateEvent");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier IrregularHeartRhythmEvent = new HKCategoryTypeIdentifier("IrregularHeartRhythmEvent");
    /*</constants>*/
    
    private static /*<name>*/HKCategoryTypeIdentifier/*</name>*/[] values = new /*<name>*/HKCategoryTypeIdentifier/*</name>*/[] {/*<value_list>*/SleepAnalysis, AppleStandHour, CervicalMucusQuality, OvulationTestResult, MenstrualFlow, IntermenstrualBleeding, SexualActivity, MindfulSession, HighHeartRateEvent, LowHeartRateEvent, IrregularHeartRhythmEvent/*</value_list>*/};
    
    /*<name>*/HKCategoryTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKCategoryTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKCategoryTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKCategoryTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSleepAnalysis", optional=true)
        public static native NSString SleepAnalysis();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAppleStandHour", optional=true)
        public static native NSString AppleStandHour();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierCervicalMucusQuality", optional=true)
        public static native NSString CervicalMucusQuality();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierOvulationTestResult", optional=true)
        public static native NSString OvulationTestResult();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMenstrualFlow", optional=true)
        public static native NSString MenstrualFlow();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierIntermenstrualBleeding", optional=true)
        public static native NSString IntermenstrualBleeding();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSexualActivity", optional=true)
        public static native NSString SexualActivity();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMindfulSession", optional=true)
        public static native NSString MindfulSession();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHighHeartRateEvent", optional=true)
        public static native NSString HighHeartRateEvent();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLowHeartRateEvent", optional=true)
        public static native NSString LowHeartRateEvent();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierIrregularHeartRhythmEvent", optional=true)
        public static native NSString IrregularHeartRhythmEvent();
        /*</values>*/
    }
}
