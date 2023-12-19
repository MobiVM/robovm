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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutSessionPtr extends Ptr<HKWorkoutSession, HKWorkoutSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkoutSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkoutSession() {}
    protected HKWorkoutSession(Handle h, long handle) { super(h, handle); }
    protected HKWorkoutSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKWorkoutSession(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activityType")
    public native HKWorkoutActivityType getActivityType();
    @Property(selector = "locationType")
    public native HKWorkoutSessionLocationType getLocationType();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "workoutConfiguration")
    public native HKWorkoutConfiguration getWorkoutConfiguration();
    @Property(selector = "delegate")
    public native HKWorkoutSessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HKWorkoutSessionDelegate v);
    @Property(selector = "state")
    public native HKWorkoutSessionState getState();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "type")
    public native HKWorkoutSessionType getType();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "currentActivity")
    public native HKWorkoutActivity getCurrentActivity();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "prepare")
    public native void prepare();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "startActivityWithDate:")
    public native void startActivity(NSDate date);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "stopActivityWithDate:")
    public native void stopActivity(NSDate date);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "end")
    public native void end();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "pause")
    public native void pause();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "resume")
    public native void resume();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "beginNewActivityWithConfiguration:date:metadata:")
    public native void beginNewActivity(HKWorkoutConfiguration workoutConfiguration, NSDate date, NSDictionary<NSString, ?> metadata);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "endCurrentActivityOnDate:")
    public native void endCurrentActivityOnDate(NSDate date);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "sendDataToRemoteWorkoutSession:completion:")
    public native void sendDataToRemoteWorkoutSession(NSData data, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
