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
@Marshaler(/*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKQuantityTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKResultsQuantityTypeIdentifier toObject(Class<HKResultsQuantityTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKResultsQuantityTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKResultsQuantityTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKResultsQuantityTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKResultsQuantityTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKResultsQuantityTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKResultsQuantityTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKResultsQuantityTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKResultsQuantityTypeIdentifier OxygenSaturation = new HKResultsQuantityTypeIdentifier("OxygenSaturation");
    public static final HKResultsQuantityTypeIdentifier PeripheralPerfusionIndex = new HKResultsQuantityTypeIdentifier("PeripheralPerfusionIndex");
    public static final HKResultsQuantityTypeIdentifier BloodGlucose = new HKResultsQuantityTypeIdentifier("BloodGlucose");
    public static final HKResultsQuantityTypeIdentifier NumberOfTimesFallen = new HKResultsQuantityTypeIdentifier("NumberOfTimesFallen");
    public static final HKResultsQuantityTypeIdentifier ElectrodermalActivity = new HKResultsQuantityTypeIdentifier("ElectrodermalActivity");
    public static final HKResultsQuantityTypeIdentifier InhalerUsage = new HKResultsQuantityTypeIdentifier("InhalerUsage");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKResultsQuantityTypeIdentifier InsulinDelivery = new HKResultsQuantityTypeIdentifier("InsulinDelivery");
    public static final HKResultsQuantityTypeIdentifier BloodAlcoholContent = new HKResultsQuantityTypeIdentifier("BloodAlcoholContent");
    public static final HKResultsQuantityTypeIdentifier ForcedVitalCapacity = new HKResultsQuantityTypeIdentifier("ForcedVitalCapacity");
    public static final HKResultsQuantityTypeIdentifier ForcedExpiratoryVolume1 = new HKResultsQuantityTypeIdentifier("ForcedExpiratoryVolume1");
    public static final HKResultsQuantityTypeIdentifier PeakExpiratoryFlowRate = new HKResultsQuantityTypeIdentifier("PeakExpiratoryFlowRate");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKResultsQuantityTypeIdentifier EnvironmentalAudioExposure = new HKResultsQuantityTypeIdentifier("EnvironmentalAudioExposure");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKResultsQuantityTypeIdentifier HeadphoneAudioExposure = new HKResultsQuantityTypeIdentifier("HeadphoneAudioExposure");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final HKResultsQuantityTypeIdentifier NumberOfAlcoholicBeverages = new HKResultsQuantityTypeIdentifier("NumberOfAlcoholicBeverages");
    /*</constants>*/
    
    private static /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/[] values = new /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/[] {/*<value_list>*/OxygenSaturation, PeripheralPerfusionIndex, BloodGlucose, NumberOfTimesFallen, ElectrodermalActivity, InhalerUsage, InsulinDelivery, BloodAlcoholContent, ForcedVitalCapacity, ForcedExpiratoryVolume1, PeakExpiratoryFlowRate, EnvironmentalAudioExposure, HeadphoneAudioExposure, NumberOfAlcoholicBeverages/*</value_list>*/};
    
    /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKResultsQuantityTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKQuantityTypeIdentifierOxygenSaturation", optional=true)
        public static native NSString OxygenSaturation();
        @GlobalValue(symbol="HKQuantityTypeIdentifierPeripheralPerfusionIndex", optional=true)
        public static native NSString PeripheralPerfusionIndex();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBloodGlucose", optional=true)
        public static native NSString BloodGlucose();
        @GlobalValue(symbol="HKQuantityTypeIdentifierNumberOfTimesFallen", optional=true)
        public static native NSString NumberOfTimesFallen();
        @GlobalValue(symbol="HKQuantityTypeIdentifierElectrodermalActivity", optional=true)
        public static native NSString ElectrodermalActivity();
        @GlobalValue(symbol="HKQuantityTypeIdentifierInhalerUsage", optional=true)
        public static native NSString InhalerUsage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierInsulinDelivery", optional=true)
        public static native NSString InsulinDelivery();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBloodAlcoholContent", optional=true)
        public static native NSString BloodAlcoholContent();
        @GlobalValue(symbol="HKQuantityTypeIdentifierForcedVitalCapacity", optional=true)
        public static native NSString ForcedVitalCapacity();
        @GlobalValue(symbol="HKQuantityTypeIdentifierForcedExpiratoryVolume1", optional=true)
        public static native NSString ForcedExpiratoryVolume1();
        @GlobalValue(symbol="HKQuantityTypeIdentifierPeakExpiratoryFlowRate", optional=true)
        public static native NSString PeakExpiratoryFlowRate();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierEnvironmentalAudioExposure", optional=true)
        public static native NSString EnvironmentalAudioExposure();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierHeadphoneAudioExposure", optional=true)
        public static native NSString HeadphoneAudioExposure();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierNumberOfAlcoholicBeverages", optional=true)
        public static native NSString NumberOfAlcoholicBeverages();
        /*</values>*/
    }
}
