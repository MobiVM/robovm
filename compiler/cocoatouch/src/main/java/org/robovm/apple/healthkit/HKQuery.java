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
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKQueryPtr extends Ptr<HKQuery, HKQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKQuery() {}
    protected HKQuery(Handle h, long handle) { super(h, handle); }
    protected HKQuery(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "objectType")
    public native HKObjectType getObjectType();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.3.
     */
    @Deprecated
    @Property(selector = "sampleType")
    public native HKSampleType getSampleType();
    @Property(selector = "predicate")
    public native NSPredicate getPredicate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "predicateForObjectsWithMetadataKey:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key);
    @Method(selector = "predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key, NSArray<?> allowedValues);
    @Method(selector = "predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key, NSPredicateOperatorType operatorType, NSObject value);
    @Method(selector = "predicateForObjectsFromSource:")
    public static native NSPredicate createPredicateForObjectsFromSource(HKSource source);
    @Method(selector = "predicateForObjectsFromSources:")
    public static native NSPredicate createPredicateForObjectsFromSources(NSSet<HKSource> sources);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(NSSet<HKSourceRevision> sourceRevisions);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(NSSet<HKDevice> devices);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDeviceProperty(String key, NSSet<NSString> allowedValues);
    @Method(selector = "predicateForObjectWithUUID:")
    public static native NSPredicate createPredicateForObjectsWithUUID(NSUUID uuid);
    @Method(selector = "predicateForObjectsWithUUIDs:")
    public static native NSPredicate createPredicateForObjectsWithUUIDs(NSSet<NSUUID> uuids);
    @Method(selector = "predicateForObjectsWithNoCorrelation")
    public static native NSPredicate createPredicateForObjectsWithNoCorrelation();
    @Method(selector = "predicateForObjectsFromWorkout:")
    public static native NSPredicate createPredicateForObjectsFromWorkout(HKWorkout workout);
    @Method(selector = "predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate createPredicateForSamplesWithDate(NSDate startDate, NSDate endDate, HKQueryOptions options);
    @Method(selector = "predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate createPredicateForQuantitySamplesWithQuantity(NSPredicateOperatorType operatorType, HKQuantity quantity);
    @Method(selector = "predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate createPredicateForCategorySamplesWithValue(NSPredicateOperatorType operatorType, @MachineSizedSInt long value);
    @Method(selector = "predicateForWorkoutsWithWorkoutActivityType:")
    public static native NSPredicate createPredicateForWorkoutsWithActivityType(HKWorkoutActivityType workoutActivityType);
    @Method(selector = "predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate createPredicateForWorkoutsWithDuration(NSPredicateOperatorType operatorType, double duration);
    @Method(selector = "predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate createPredicateForWorkoutsWithTotalEnergyBurned(NSPredicateOperatorType operatorType, HKQuantity totalEnergyBurned);
    @Method(selector = "predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate createPredicateForWorkoutsWithTotalDistance(NSPredicateOperatorType operatorType, HKQuantity totalDistance);
    @Method(selector = "predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate createPredicateForWorkoutsWithTotalSwimmingStrokeCount(NSPredicateOperatorType operatorType, HKQuantity totalSwimmingStrokeCount);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate createPredicateForWorkouts(NSPredicateOperatorType operatorType, HKQuantity totalFlightsClimbed);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate createPredicateForActivitySummary(NSDateComponents dateComponents);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate createPredicateForActivitySummariesBetweenDates(NSDateComponents startDateComponents, NSDateComponents endDateComponents);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate createPredicateForClinicalRecords(HKFHIRResourceType resourceType);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate createPredicateForClinicalRecords(HKSource source, HKFHIRResourceType resourceType, String identifier);
    /*</methods>*/
}
