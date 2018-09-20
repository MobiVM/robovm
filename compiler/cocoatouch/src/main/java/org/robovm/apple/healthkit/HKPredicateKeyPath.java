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
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath UUID = new HKPredicateKeyPath("UUID");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath Source = new HKPredicateKeyPath("Source");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath Metadata = new HKPredicateKeyPath("Metadata");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath Correlation = new HKPredicateKeyPath("Correlation");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath Workout = new HKPredicateKeyPath("Workout");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKPredicateKeyPath Device = new HKPredicateKeyPath("Device");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKPredicateKeyPath SourceRevision = new HKPredicateKeyPath("SourceRevision");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath StartDate = new HKPredicateKeyPath("StartDate");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath EndDate = new HKPredicateKeyPath("EndDate");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutDuration = new HKPredicateKeyPath("WorkoutDuration");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutTotalDistance = new HKPredicateKeyPath("WorkoutTotalDistance");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath WorkoutTotalEnergyBurned = new HKPredicateKeyPath("WorkoutTotalEnergyBurned");
    /**
     * @since Available in iOS 8.0 and later.
     */
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
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath CategoryValue = new HKPredicateKeyPath("CategoryValue");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath ClinicalRecordFHIRResourceIdentifier = new HKPredicateKeyPath("ClinicalRecordFHIRResourceIdentifier");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath ClinicalRecordFHIRResourceType = new HKPredicateKeyPath("ClinicalRecordFHIRResourceType");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HKPredicateKeyPath Quantity = new HKPredicateKeyPath("Quantity");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKPredicateKeyPath Sum = new HKPredicateKeyPath("Sum");
    /*</constants>*/
    
    private static /*<name>*/HKPredicateKeyPath/*</name>*/[] values = new /*<name>*/HKPredicateKeyPath/*</name>*/[] {/*<value_list>*/DateComponents, UUID, Source, Metadata, Correlation, Workout, Device, SourceRevision, StartDate, EndDate, WorkoutDuration, WorkoutTotalDistance, WorkoutTotalEnergyBurned, WorkoutType, WorkoutTotalSwimmingStrokeCount, WorkoutTotalFlightsClimbed, Title, PatientName, AuthorName, CustodianName, CategoryValue, ClinicalRecordFHIRResourceIdentifier, ClinicalRecordFHIRResourceType, Quantity, Sum/*</value_list>*/};
    
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
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathUUID", optional=true)
        public static native NSString UUID();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathSource", optional=true)
        public static native NSString Source();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathMetadata", optional=true)
        public static native NSString Metadata();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathCorrelation", optional=true)
        public static native NSString Correlation();
        /**
         * @since Available in iOS 8.0 and later.
         */
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
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathStartDate", optional=true)
        public static native NSString StartDate();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathEndDate", optional=true)
        public static native NSString EndDate();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutDuration", optional=true)
        public static native NSString WorkoutDuration();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalDistance", optional=true)
        public static native NSString WorkoutTotalDistance();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathWorkoutTotalEnergyBurned", optional=true)
        public static native NSString WorkoutTotalEnergyBurned();
        /**
         * @since Available in iOS 8.0 and later.
         */
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
        /**
         * @since Available in iOS 8.0 and later.
         */
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
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathQuantity", optional=true)
        public static native NSString Quantity();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKPredicateKeyPathSum", optional=true)
        public static native NSString Sum();
        /*</values>*/
    }
}
