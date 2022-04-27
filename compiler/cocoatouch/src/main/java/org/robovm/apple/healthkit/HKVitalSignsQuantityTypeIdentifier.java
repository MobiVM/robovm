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
@Marshaler(/*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKQuantityTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKVitalSignsQuantityTypeIdentifier toObject(Class<HKVitalSignsQuantityTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKVitalSignsQuantityTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKVitalSignsQuantityTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKVitalSignsQuantityTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKVitalSignsQuantityTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKVitalSignsQuantityTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKVitalSignsQuantityTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKVitalSignsQuantityTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKVitalSignsQuantityTypeIdentifier HeartRate = new HKVitalSignsQuantityTypeIdentifier("HeartRate");
    public static final HKVitalSignsQuantityTypeIdentifier BodyTemperature = new HKVitalSignsQuantityTypeIdentifier("BodyTemperature");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKVitalSignsQuantityTypeIdentifier BasalBodyTemperature = new HKVitalSignsQuantityTypeIdentifier("BasalBodyTemperature");
    public static final HKVitalSignsQuantityTypeIdentifier BloodPressureSystolic = new HKVitalSignsQuantityTypeIdentifier("BloodPressureSystolic");
    public static final HKVitalSignsQuantityTypeIdentifier BloodPressureDiastolic = new HKVitalSignsQuantityTypeIdentifier("BloodPressureDiastolic");
    public static final HKVitalSignsQuantityTypeIdentifier RespiratoryRate = new HKVitalSignsQuantityTypeIdentifier("RespiratoryRate");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKVitalSignsQuantityTypeIdentifier RestingHeartRate = new HKVitalSignsQuantityTypeIdentifier("RestingHeartRate");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKVitalSignsQuantityTypeIdentifier WalkingHeartRateAverage = new HKVitalSignsQuantityTypeIdentifier("WalkingHeartRateAverage");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKVitalSignsQuantityTypeIdentifier HeartRateVariabilitySDNN = new HKVitalSignsQuantityTypeIdentifier("HeartRateVariabilitySDNN");
    /*</constants>*/
    
    private static /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/[] values = new /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/[] {/*<value_list>*/HeartRate, BodyTemperature, BasalBodyTemperature, BloodPressureSystolic, BloodPressureDiastolic, RespiratoryRate, RestingHeartRate, WalkingHeartRateAverage, HeartRateVariabilitySDNN/*</value_list>*/};
    
    /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKVitalSignsQuantityTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKQuantityTypeIdentifierHeartRate", optional=true)
        public static native NSString HeartRate();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBodyTemperature", optional=true)
        public static native NSString BodyTemperature();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierBasalBodyTemperature", optional=true)
        public static native NSString BasalBodyTemperature();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBloodPressureSystolic", optional=true)
        public static native NSString BloodPressureSystolic();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBloodPressureDiastolic", optional=true)
        public static native NSString BloodPressureDiastolic();
        @GlobalValue(symbol="HKQuantityTypeIdentifierRespiratoryRate", optional=true)
        public static native NSString RespiratoryRate();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierRestingHeartRate", optional=true)
        public static native NSString RestingHeartRate();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierWalkingHeartRateAverage", optional=true)
        public static native NSString WalkingHeartRateAverage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierHeartRateVariabilitySDNN", optional=true)
        public static native NSString HeartRateVariabilitySDNN();
        /*</values>*/
    }
}
