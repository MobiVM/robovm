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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HKPredicateKeyPath/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKPredicateKeyPath/*</name>*/ 
    extends /*<extends>*/NSPredicateKeyPath/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKPredicateKeyPath/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKPredicateKeyPath toObject(Class<HKPredicateKeyPath> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKPredicateKeyPath.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKPredicateKeyPath o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKPredicateKeyPath> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKPredicateKeyPath> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKPredicateKeyPath.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKPredicateKeyPath> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKPredicateKeyPath o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 9.3 and later.
     */
    public static final HKPredicateKeyPath DateComponents = new HKPredicateKeyPath("DateComponents");
    public static final HKPredicateKeyPath UUID = new HKPredicateKeyPath("UUID");
    public static final HKPredicateKeyPath Source = new HKPredicateKeyPath("Source");
    public static final HKPredicateKeyPath Metadata = new HKPredicateKeyPath("Metadata");
    public static final HKPredicateKeyPath Correlation = new HKPredicateKeyPath("Correlation");
    public static final HKPredicateKeyPath Workout = new HKPredicateKeyPath("Workout");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKPredicateKeyPath Device = new HKPredicateKeyPath("Device");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKPredicateKeyPath SourceRevision = new HKPredicateKeyPath("SourceRevision");
    public static final HKPredicateKeyPath StartDate = new HKPredicateKeyPath("StartDate");
    public static final HKPredicateKeyPath EndDate = new HKPredicateKeyPath("EndDate");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKPredicateKeyPath AverageHeartRate = new HKPredicateKeyPath("AverageHeartRate");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKPredicateKeyPath ECGClassification = new HKPredicateKeyPath("ECGClassification");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKPredicateKeyPath ECGSymptomsStatus = new HKPredicateKeyPath("ECGSymptomsStatus");
    public static final HKPredicateKeyPath WorkoutDuration = new HKPredicateKeyPath("WorkoutDuration");
    public static final HKPredicateKeyPath WorkoutTotalDistance = new HKPredicateKeyPath("WorkoutTotalDistance");
    public static final HKPredicateKeyPath WorkoutTotalEnergyBurned = new HKPredicateKeyPath("WorkoutTotalEnergyBurned");
    public static final HKPredicateKeyPath WorkoutType = new HKPredicateKeyPath("WorkoutType");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutTotalSwimmingStrokeCount = new HKPredicateKeyPath("WorkoutTotalSwimmingStrokeCount");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutTotalFlightsClimbed = new HKPredicateKeyPath("WorkoutTotalFlightsClimbed");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutSumQuantity = new HKPredicateKeyPath("WorkoutSumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutMinimumQuantity = new HKPredicateKeyPath("WorkoutMinimumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutMaximumQuantity = new HKPredicateKeyPath("WorkoutMaximumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutAverageQuantity = new HKPredicateKeyPath("WorkoutAverageQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivity = new HKPredicateKeyPath("WorkoutActivity");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKPredicateKeyPath Title = new HKPredicateKeyPath("Title");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKPredicateKeyPath PatientName = new HKPredicateKeyPath("PatientName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKPredicateKeyPath AuthorName = new HKPredicateKeyPath("AuthorName");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKPredicateKeyPath CustodianName = new HKPredicateKeyPath("CustodianName");
    public static final HKPredicateKeyPath CategoryValue = new HKPredicateKeyPath("CategoryValue");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath ClinicalRecordFHIRResourceIdentifier = new HKPredicateKeyPath("ClinicalRecordFHIRResourceIdentifier");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath ClinicalRecordFHIRResourceType = new HKPredicateKeyPath("ClinicalRecordFHIRResourceType");
    public static final HKPredicateKeyPath Quantity = new HKPredicateKeyPath("Quantity");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath Count = new HKPredicateKeyPath("Count");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath Sum = new HKPredicateKeyPath("Sum");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath Min = new HKPredicateKeyPath("Min");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath Average = new HKPredicateKeyPath("Average");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath Max = new HKPredicateKeyPath("Max");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath MostRecent = new HKPredicateKeyPath("MostRecent");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath MostRecentStartDate = new HKPredicateKeyPath("MostRecentStartDate");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath MostRecentEndDate = new HKPredicateKeyPath("MostRecentEndDate");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKPredicateKeyPath MostRecentDuration = new HKPredicateKeyPath("MostRecentDuration");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityType = new HKPredicateKeyPath("WorkoutActivityType");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityDuration = new HKPredicateKeyPath("WorkoutActivityDuration");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityStartDate = new HKPredicateKeyPath("WorkoutActivityStartDate");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityEndDate = new HKPredicateKeyPath("WorkoutActivityEndDate");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivitySumQuantity = new HKPredicateKeyPath("WorkoutActivitySumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityMinimumQuantity = new HKPredicateKeyPath("WorkoutActivityMinimumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityMaximumQuantity = new HKPredicateKeyPath("WorkoutActivityMaximumQuantity");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutActivityAverageQuantity = new HKPredicateKeyPath("WorkoutActivityAverageQuantity");
    /*</constants>*/
    
    private static /*<name>*/HKPredicateKeyPath/*</name>*/[] values = new /*<name>*/HKPredicateKeyPath/*</name>*/[] {/*<value_list>*/DateComponents, UUID, Source, Metadata, Correlation, Workout, Device, SourceRevision, StartDate, EndDate, AverageHeartRate, ECGClassification, ECGSymptomsStatus, WorkoutDuration, WorkoutTotalDistance, WorkoutTotalEnergyBurned, WorkoutType, WorkoutTotalSwimmingStrokeCount, WorkoutTotalFlightsClimbed, WorkoutSumQuantity, WorkoutMinimumQuantity, WorkoutMaximumQuantity, WorkoutAverageQuantity, WorkoutActivity, Title, PatientName, AuthorName, CustodianName, CategoryValue, ClinicalRecordFHIRResourceIdentifier, ClinicalRecordFHIRResourceType, Quantity, Count, Sum, Min, Average, Max, MostRecent, MostRecentStartDate, MostRecentEndDate, MostRecentDuration, WorkoutActivityType, WorkoutActivityDuration, WorkoutActivityStartDate, WorkoutActivityEndDate, WorkoutActivitySumQuantity, WorkoutActivityMinimumQuantity, WorkoutActivityMaximumQuantity, WorkoutActivityAverageQuantity/*</value_list>*/};
    
    /*<name>*/HKPredicateKeyPath/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKPredicateKeyPath/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKPredicateKeyPath/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKPredicateKeyPath/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 9.3 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathDateComponents", optional=true)
        public static native NSString DateComponents();
        @GlobalValue(symbol="HKPredicateKeyPathUUID", optional=true)
        public static native NSString UUID();
        @GlobalValue(symbol="HKPredicateKeyPathSource", optional=true)
        public static native NSString Source();
        @GlobalValue(symbol="HKPredicateKeyPathMetadata", optional=true)
        public static native NSString Metadata();
        @GlobalValue(symbol="HKPredicateKeyPathCorrelation", optional=true)
        public static native NSString Correlation();
        @GlobalValue(symbol="HKPredicateKeyPathWorkout", optional=true)
        public static native NSString Workout();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathDevice", optional=true)
        public static native NSString Device();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathSourceRevision", optional=true)
        public static native NSString SourceRevision();
        @GlobalValue(symbol="HKPredicateKeyPathStartDate", optional=true)
        public static native NSString StartDate();
        @GlobalValue(symbol="HKPredicateKeyPathEndDate", optional=true)
        public static native NSString EndDate();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathAverageHeartRate", optional=true)
        public static native NSString AverageHeartRate();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathECGClassification", optional=true)
        public static native NSString ECGClassification();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathECGSymptomsStatus", optional=true)
        public static native NSString ECGSymptomsStatus();
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutDuration", optional=true)
        public static native NSString WorkoutDuration();
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalDistance", optional=true)
        public static native NSString WorkoutTotalDistance();
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalEnergyBurned", optional=true)
        public static native NSString WorkoutTotalEnergyBurned();
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutType", optional=true)
        public static native NSString WorkoutType();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalSwimmingStrokeCount", optional=true)
        public static native NSString WorkoutTotalSwimmingStrokeCount();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalFlightsClimbed", optional=true)
        public static native NSString WorkoutTotalFlightsClimbed();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutSumQuantity", optional=true)
        public static native NSString WorkoutSumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutMinimumQuantity", optional=true)
        public static native NSString WorkoutMinimumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutMaximumQuantity", optional=true)
        public static native NSString WorkoutMaximumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutAverageQuantity", optional=true)
        public static native NSString WorkoutAverageQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivity", optional=true)
        public static native NSString WorkoutActivity();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCDATitle", optional=true)
        public static native NSString Title();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCDAPatientName", optional=true)
        public static native NSString PatientName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCDAAuthorName", optional=true)
        public static native NSString AuthorName();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCDACustodianName", optional=true)
        public static native NSString CustodianName();
        @GlobalValue(symbol="HKPredicateKeyPathCategoryValue", optional=true)
        public static native NSString CategoryValue();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathClinicalRecordFHIRResourceIdentifier", optional=true)
        public static native NSString ClinicalRecordFHIRResourceIdentifier();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathClinicalRecordFHIRResourceType", optional=true)
        public static native NSString ClinicalRecordFHIRResourceType();
        @GlobalValue(symbol="HKPredicateKeyPathQuantity", optional=true)
        public static native NSString Quantity();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCount", optional=true)
        public static native NSString Count();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathSum", optional=true)
        public static native NSString Sum();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMin", optional=true)
        public static native NSString Min();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathAverage", optional=true)
        public static native NSString Average();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMax", optional=true)
        public static native NSString Max();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMostRecent", optional=true)
        public static native NSString MostRecent();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMostRecentStartDate", optional=true)
        public static native NSString MostRecentStartDate();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMostRecentEndDate", optional=true)
        public static native NSString MostRecentEndDate();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMostRecentDuration", optional=true)
        public static native NSString MostRecentDuration();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityType", optional=true)
        public static native NSString WorkoutActivityType();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityDuration", optional=true)
        public static native NSString WorkoutActivityDuration();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityStartDate", optional=true)
        public static native NSString WorkoutActivityStartDate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityEndDate", optional=true)
        public static native NSString WorkoutActivityEndDate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivitySumQuantity", optional=true)
        public static native NSString WorkoutActivitySumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityMinimumQuantity", optional=true)
        public static native NSString WorkoutActivityMinimumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityMaximumQuantity", optional=true)
        public static native NSString WorkoutActivityMaximumQuantity();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutActivityAverageQuantity", optional=true)
        public static native NSString WorkoutActivityAverageQuantity();
        /*</values>*/
    }
}
