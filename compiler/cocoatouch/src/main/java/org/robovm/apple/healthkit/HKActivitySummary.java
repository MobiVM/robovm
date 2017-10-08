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
 * @since Available in iOS 9.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKActivitySummary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKActivitySummaryPtr extends Ptr<HKActivitySummary, HKActivitySummaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKActivitySummary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HKActivitySummary() {}
    protected HKActivitySummary(Handle h, long handle) { super(h, handle); }
    protected HKActivitySummary(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKActivitySummary(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activeEnergyBurned")
    public native HKQuantity getActiveEnergyBurned();
    @Property(selector = "setActiveEnergyBurned:")
    public native void setActiveEnergyBurned(HKQuantity v);
    @Property(selector = "appleExerciseTime")
    public native HKQuantity getAppleExerciseTime();
    @Property(selector = "setAppleExerciseTime:")
    public native void setAppleExerciseTime(HKQuantity v);
    @Property(selector = "appleStandHours")
    public native HKQuantity getAppleStandHours();
    @Property(selector = "setAppleStandHours:")
    public native void setAppleStandHours(HKQuantity v);
    @Property(selector = "activeEnergyBurnedGoal")
    public native HKQuantity getActiveEnergyBurnedGoal();
    @Property(selector = "setActiveEnergyBurnedGoal:")
    public native void setActiveEnergyBurnedGoal(HKQuantity v);
    @Property(selector = "appleExerciseTimeGoal")
    public native HKQuantity getAppleExerciseTimeGoal();
    @Property(selector = "setAppleExerciseTimeGoal:")
    public native void setAppleExerciseTimeGoal(HKQuantity v);
    @Property(selector = "appleStandHoursGoal")
    public native HKQuantity getAppleStandHoursGoal();
    @Property(selector = "setAppleStandHoursGoal:")
    public native void setAppleStandHoursGoal(HKQuantity v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dateComponentsForCalendar:")
    public native NSDateComponents dateComponentsForCalendar(NSCalendar calendar);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
