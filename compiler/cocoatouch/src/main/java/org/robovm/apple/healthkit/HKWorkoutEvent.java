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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutEventPtr extends Ptr<HKWorkoutEvent, HKWorkoutEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkoutEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkoutEvent() {}
    protected HKWorkoutEvent(Handle h, long handle) { super(h, handle); }
    protected HKWorkoutEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKWorkoutEvent(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native HKWorkoutEventType getType();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "date")
    public native NSDate getDate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dateInterval")
    public native NSDateInterval getDateInterval();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "metadata")
    public native HKMetadata getMetadata();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "workoutEventWithType:date:")
    public static native HKWorkoutEvent create(HKWorkoutEventType type, NSDate date);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "workoutEventWithType:date:metadata:")
    public static native HKWorkoutEvent create(HKWorkoutEventType type, NSDate date, HKMetadata metadata);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "workoutEventWithType:dateInterval:metadata:")
    public static native HKWorkoutEvent create(HKWorkoutEventType type, NSDateInterval dateInterval, NSDictionary<NSString, ?> metadata);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
