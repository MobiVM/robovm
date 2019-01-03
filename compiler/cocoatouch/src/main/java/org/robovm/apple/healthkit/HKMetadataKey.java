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
@Marshaler(/*<name>*/HKMetadataKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKMetadataKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKMetadataKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKMetadataKey toObject(Class<HKMetadataKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKMetadataKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKMetadataKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKMetadataKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKMetadataKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKMetadataKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKMetadataKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKMetadataKey o : l) {
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
    public static final HKMetadataKey DeviceSerialNumber = new HKMetadataKey("DeviceSerialNumber");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey BodyTemperatureSensorLocation = new HKMetadataKey("BodyTemperatureSensorLocation");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey HeartRateSensorLocation = new HKMetadataKey("HeartRateSensorLocation");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey HeartRateMotionContext = new HKMetadataKey("HeartRateMotionContext");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey FoodType = new HKMetadataKey("FoodType");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey UDIDeviceIdentifier = new HKMetadataKey("UDIDeviceIdentifier");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey UDIProductionIdentifier = new HKMetadataKey("UDIProductionIdentifier");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey DigitalSignature = new HKMetadataKey("DigitalSignature");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey ExternalUUID = new HKMetadataKey("ExternalUUID");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey SyncIdentifier = new HKMetadataKey("SyncIdentifier");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey SyncVersion = new HKMetadataKey("SyncVersion");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey TimeZone = new HKMetadataKey("TimeZone");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey DeviceName = new HKMetadataKey("DeviceName");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey DeviceManufacturerName = new HKMetadataKey("DeviceManufacturerName");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey WasTakenInLab = new HKMetadataKey("WasTakenInLab");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey ReferenceRangeLowerLimit = new HKMetadataKey("ReferenceRangeLowerLimit");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey ReferenceRangeUpperLimit = new HKMetadataKey("ReferenceRangeUpperLimit");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey WasUserEntered = new HKMetadataKey("WasUserEntered");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey WorkoutBrandName = new HKMetadataKey("WorkoutBrandName");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey GroupFitness = new HKMetadataKey("GroupFitness");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey IndoorWorkout = new HKMetadataKey("IndoorWorkout");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKMetadataKey CoachedWorkout = new HKMetadataKey("CoachedWorkout");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey WeatherCondition = new HKMetadataKey("WeatherCondition");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey WeatherTemperature = new HKMetadataKey("WeatherTemperature");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey WeatherHumidity = new HKMetadataKey("WeatherHumidity");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKMetadataKey SexualActivityProtectionUsed = new HKMetadataKey("SexualActivityProtectionUsed");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKMetadataKey MenstrualCycleStart = new HKMetadataKey("MenstrualCycleStart");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey LapLength = new HKMetadataKey("LapLength");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey SwimmingLocationType = new HKMetadataKey("SwimmingLocationType");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKMetadataKey SwimmingStrokeStyle = new HKMetadataKey("SwimmingStrokeStyle");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey InsulinDeliveryReason = new HKMetadataKey("InsulinDeliveryReason");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey BloodGlucoseMealTime = new HKMetadataKey("BloodGlucoseMealTime");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKMetadataKey VO2MaxTestType = new HKMetadataKey("VO2MaxTestType");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKMetadataKey AverageSpeed = new HKMetadataKey("AverageSpeed");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKMetadataKey MaximumSpeed = new HKMetadataKey("MaximumSpeed");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKMetadataKey AlpineSlopeGrade = new HKMetadataKey("AlpineSlopeGrade");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKMetadataKey ElevationAscended = new HKMetadataKey("ElevationAscended");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKMetadataKey ElevationDescended = new HKMetadataKey("ElevationDescended");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKMetadataKey FitnessMachineDuration = new HKMetadataKey("FitnessMachineDuration");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKMetadataKey IndoorBikeDistance = new HKMetadataKey("IndoorBikeDistance");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKMetadataKey CrossTrainerDistance = new HKMetadataKey("CrossTrainerDistance");
    /*</constants>*/
    
    private static /*<name>*/HKMetadataKey/*</name>*/[] values = new /*<name>*/HKMetadataKey/*</name>*/[] {/*<value_list>*/DeviceSerialNumber, BodyTemperatureSensorLocation, HeartRateSensorLocation, HeartRateMotionContext, FoodType, UDIDeviceIdentifier, UDIProductionIdentifier, DigitalSignature, ExternalUUID, SyncIdentifier, SyncVersion, TimeZone, DeviceName, DeviceManufacturerName, WasTakenInLab, ReferenceRangeLowerLimit, ReferenceRangeUpperLimit, WasUserEntered, WorkoutBrandName, GroupFitness, IndoorWorkout, CoachedWorkout, WeatherCondition, WeatherTemperature, WeatherHumidity, SexualActivityProtectionUsed, MenstrualCycleStart, LapLength, SwimmingLocationType, SwimmingStrokeStyle, InsulinDeliveryReason, BloodGlucoseMealTime, VO2MaxTestType, AverageSpeed, MaximumSpeed, AlpineSlopeGrade, ElevationAscended, ElevationDescended, FitnessMachineDuration, IndoorBikeDistance, CrossTrainerDistance/*</value_list>*/};
    
    /*<name>*/HKMetadataKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKMetadataKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKMetadataKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKMetadataKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyDeviceSerialNumber", optional=true)
        public static native NSString DeviceSerialNumber();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyBodyTemperatureSensorLocation", optional=true)
        public static native NSString BodyTemperatureSensorLocation();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyHeartRateSensorLocation", optional=true)
        public static native NSString HeartRateSensorLocation();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyHeartRateMotionContext", optional=true)
        public static native NSString HeartRateMotionContext();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyFoodType", optional=true)
        public static native NSString FoodType();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyUDIDeviceIdentifier", optional=true)
        public static native NSString UDIDeviceIdentifier();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyUDIProductionIdentifier", optional=true)
        public static native NSString UDIProductionIdentifier();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyDigitalSignature", optional=true)
        public static native NSString DigitalSignature();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyExternalUUID", optional=true)
        public static native NSString ExternalUUID();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeySyncIdentifier", optional=true)
        public static native NSString SyncIdentifier();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeySyncVersion", optional=true)
        public static native NSString SyncVersion();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyTimeZone", optional=true)
        public static native NSString TimeZone();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyDeviceName", optional=true)
        public static native NSString DeviceName();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyDeviceManufacturerName", optional=true)
        public static native NSString DeviceManufacturerName();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWasTakenInLab", optional=true)
        public static native NSString WasTakenInLab();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyReferenceRangeLowerLimit", optional=true)
        public static native NSString ReferenceRangeLowerLimit();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyReferenceRangeUpperLimit", optional=true)
        public static native NSString ReferenceRangeUpperLimit();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWasUserEntered", optional=true)
        public static native NSString WasUserEntered();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWorkoutBrandName", optional=true)
        public static native NSString WorkoutBrandName();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyGroupFitness", optional=true)
        public static native NSString GroupFitness();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyIndoorWorkout", optional=true)
        public static native NSString IndoorWorkout();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyCoachedWorkout", optional=true)
        public static native NSString CoachedWorkout();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWeatherCondition", optional=true)
        public static native NSString WeatherCondition();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWeatherTemperature", optional=true)
        public static native NSString WeatherTemperature();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyWeatherHumidity", optional=true)
        public static native NSString WeatherHumidity();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeySexualActivityProtectionUsed", optional=true)
        public static native NSString SexualActivityProtectionUsed();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyMenstrualCycleStart", optional=true)
        public static native NSString MenstrualCycleStart();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyLapLength", optional=true)
        public static native NSString LapLength();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeySwimmingLocationType", optional=true)
        public static native NSString SwimmingLocationType();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeySwimmingStrokeStyle", optional=true)
        public static native NSString SwimmingStrokeStyle();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyInsulinDeliveryReason", optional=true)
        public static native NSString InsulinDeliveryReason();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyBloodGlucoseMealTime", optional=true)
        public static native NSString BloodGlucoseMealTime();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyVO2MaxTestType", optional=true)
        public static native NSString VO2MaxTestType();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyAverageSpeed", optional=true)
        public static native NSString AverageSpeed();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyMaximumSpeed", optional=true)
        public static native NSString MaximumSpeed();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyAlpineSlopeGrade", optional=true)
        public static native NSString AlpineSlopeGrade();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyElevationAscended", optional=true)
        public static native NSString ElevationAscended();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyElevationDescended", optional=true)
        public static native NSString ElevationDescended();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyFitnessMachineDuration", optional=true)
        public static native NSString FitnessMachineDuration();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyIndoorBikeDistance", optional=true)
        public static native NSString IndoorBikeDistance();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKMetadataKeyCrossTrainerDistance", optional=true)
        public static native NSString CrossTrainerDistance();
        /*</values>*/
    }
}
