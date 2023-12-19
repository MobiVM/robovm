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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutActivity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutActivityPtr extends Ptr<HKWorkoutActivity, HKWorkoutActivityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkoutActivity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkoutActivity() {}
    protected HKWorkoutActivity(Handle h, long handle) { super(h, handle); }
    protected HKWorkoutActivity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWorkoutConfiguration:startDate:endDate:metadata:")
    public HKWorkoutActivity(HKWorkoutConfiguration workoutConfiguration, NSDate startDate, NSDate endDate, NSDictionary<NSString, ?> metadata) { super((SkipInit) null); initObject(init(workoutConfiguration, startDate, endDate, metadata)); }
    @Method(selector = "initWithCoder:")
    public HKWorkoutActivity(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "UUID")
    public native NSUUID getUUID();
    @Property(selector = "workoutConfiguration")
    public native HKWorkoutConfiguration getWorkoutConfiguration();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "workoutEvents")
    public native NSArray<HKWorkoutEvent> getWorkoutEvents();
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
    @Method(selector = "statisticsForType:")
    public native HKStatistics statisticsForType(HKQuantityType quantityType);
    @Method(selector = "initWithWorkoutConfiguration:startDate:endDate:metadata:")
    protected native @Pointer long init(HKWorkoutConfiguration workoutConfiguration, NSDate startDate, NSDate endDate, NSDictionary<NSString, ?> metadata);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
