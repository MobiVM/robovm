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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutBuilderPtr extends Ptr<HKWorkoutBuilder, HKWorkoutBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkoutBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkoutBuilder() {}
    protected HKWorkoutBuilder(Handle h, long handle) { super(h, handle); }
    protected HKWorkoutBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHealthStore:configuration:device:")
    public HKWorkoutBuilder(HKHealthStore healthStore, HKWorkoutConfiguration configuration, HKDevice device) { super((SkipInit) null); initObject(init(healthStore, configuration, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native HKDevice getDevice();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "workoutConfiguration")
    public native HKWorkoutConfiguration getWorkoutConfiguration();
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    @Property(selector = "workoutEvents")
    public native NSArray<HKWorkoutEvent> getWorkoutEvents();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHealthStore:configuration:device:")
    protected native @Pointer long init(HKHealthStore healthStore, HKWorkoutConfiguration configuration, HKDevice device);
    @Method(selector = "beginCollectionWithStartDate:completion:")
    public native void beginCollection(NSDate startDate, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "addSamples:completion:")
    public native void addSamples(NSArray<HKSample> samples, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "addWorkoutEvents:completion:")
    public native void addWorkoutEvents(NSArray<HKWorkoutEvent> workoutEvents, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "addMetadata:completion:")
    public native void addMetadata(NSDictionary<NSString, ?> metadata, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "endCollectionWithEndDate:completion:")
    public native void endCollection(NSDate endDate, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "finishWorkoutWithCompletion:")
    public native void finishWorkout(@Block VoidBlock2<HKWorkout, NSError> completion);
    @Method(selector = "discardWorkout")
    public native void discardWorkout();
    @Method(selector = "elapsedTimeAtDate:")
    public native double elapsedTimeAtDate(NSDate date);
    @Method(selector = "statisticsForType:")
    public native HKStatistics statisticsForType(HKQuantityType quantityType);
    @Method(selector = "seriesBuilderForType:")
    public native HKSeriesBuilder seriesBuilderForType(HKSeriesType seriesType);
    /*</methods>*/
}
