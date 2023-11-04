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
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkout/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutPtr extends Ptr<HKWorkout, HKWorkoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkout() {}
    protected HKWorkout(Handle h, long handle) { super(h, handle); }
    protected HKWorkout(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "workoutActivityType")
    public native HKWorkoutActivityType getWorkoutActivityType();
    @Property(selector = "workoutEvents")
    public native NSArray<HKWorkoutEvent> getWorkoutEvents();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "workoutActivities")
    public native NSArray<HKWorkoutActivity> getWorkoutActivities();
    @Property(selector = "duration")
    public native double getDuration();
    /**
     * @deprecated Use statisticsForType: passing the HKQuantityType for HKQuantityTypeIdentifierActiveEnergyBurned
     */
    @Deprecated
    @Property(selector = "totalEnergyBurned")
    public native HKQuantity getTotalEnergyBurned();
    /**
     * @deprecated Use statisticsForType: passing the HKQuantityType for the desired distance type
     */
    @Deprecated
    @Property(selector = "totalDistance")
    public native HKQuantity getTotalDistance();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Use statisticsForType: passing the HKQuantityType for HKQuantityTypeIdentifierSwimmingStrokeCount
     */
    @Deprecated
    @Property(selector = "totalSwimmingStrokeCount")
    public native HKQuantity getTotalSwimmingStrokeCount();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Use statisticsForType: passing the HKQuantityType for HKQuantityTypeIdentifierFlightClimbed
     */
    @Deprecated
    @Property(selector = "totalFlightsClimbed")
    public native HKQuantity getTotalFlightsClimbed();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "allStatistics")
    public native NSDictionary<HKQuantityType, HKStatistics> getAllStatistics();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "statisticsForType:")
    public native HKStatistics statisticsForType(HKQuantityType quantityType);
    /**
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate);
    /**
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, NSArray<HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKMetadata metadata);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:device:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, NSArray<HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKDevice device, HKMetadata metadata);
    /**
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, double duration, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKMetadata metadata);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:device:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, double duration, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKDevice device, HKMetadata metadata);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalSwimmingStrokeCount:device:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, NSArray<HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKQuantity totalSwimmingStrokeCount, HKDevice device, HKMetadata metadata);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use HKWorkoutBuilder
     */
    @Deprecated
    @Method(selector = "workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:totalFlightsClimbed:device:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, NSArray<HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKQuantity totalFlightsClimbed, HKDevice device, NSDictionary<NSString, ?> metadata);
    /*</methods>*/
}
