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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRideStatus/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRideStatusPtr extends Ptr<INRideStatus, INRideStatusPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRideStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRideStatus() {}
    protected INRideStatus(Handle h, long handle) { super(h, handle); }
    protected INRideStatus(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public INRideStatus(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rideIdentifier")
    public native String getRideIdentifier();
    @Property(selector = "setRideIdentifier:")
    public native void setRideIdentifier(String v);
    @Property(selector = "phase")
    public native INRidePhase getPhase();
    @Property(selector = "setPhase:")
    public native void setPhase(INRidePhase v);
    @Property(selector = "completionStatus")
    public native INRideCompletionStatus getCompletionStatus();
    @Property(selector = "setCompletionStatus:")
    public native void setCompletionStatus(INRideCompletionStatus v);
    @Property(selector = "vehicle")
    public native INRideVehicle getVehicle();
    @Property(selector = "setVehicle:")
    public native void setVehicle(INRideVehicle v);
    @Property(selector = "driver")
    public native INRideDriver getDriver();
    @Property(selector = "setDriver:")
    public native void setDriver(INRideDriver v);
    @Property(selector = "estimatedPickupDate")
    public native NSDate getEstimatedPickupDate();
    @Property(selector = "setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(NSDate v);
    @Property(selector = "estimatedDropOffDate")
    public native NSDate getEstimatedDropOffDate();
    @Property(selector = "setEstimatedDropOffDate:")
    public native void setEstimatedDropOffDate(NSDate v);
    @Property(selector = "estimatedPickupEndDate")
    public native NSDate getEstimatedPickupEndDate();
    @Property(selector = "setEstimatedPickupEndDate:")
    public native void setEstimatedPickupEndDate(NSDate v);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "scheduledPickupTime")
    public native INDateComponentsRange getScheduledPickupTime();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "setScheduledPickupTime:")
    public native void setScheduledPickupTime(INDateComponentsRange v);
    @Property(selector = "pickupLocation")
    public native CLPlacemark getPickupLocation();
    @Property(selector = "setPickupLocation:")
    public native void setPickupLocation(CLPlacemark v);
    @Property(selector = "waypoints")
    public native NSArray<CLPlacemark> getWaypoints();
    @Property(selector = "setWaypoints:")
    public native void setWaypoints(NSArray<CLPlacemark> v);
    @Property(selector = "dropOffLocation")
    public native CLPlacemark getDropOffLocation();
    @Property(selector = "setDropOffLocation:")
    public native void setDropOffLocation(CLPlacemark v);
    @Property(selector = "rideOption")
    public native INRideOption getRideOption();
    @Property(selector = "setRideOption:")
    public native void setRideOption(INRideOption v);
    @Property(selector = "userActivityForCancelingInApplication")
    public native NSUserActivity getUserActivityForCancelingInApplication();
    @Property(selector = "setUserActivityForCancelingInApplication:")
    public native void setUserActivityForCancelingInApplication(NSUserActivity v);
    @Property(selector = "additionalActionActivities")
    public native NSArray<NSUserActivity> getAdditionalActionActivities();
    @Property(selector = "setAdditionalActionActivities:")
    public native void setAdditionalActionActivities(NSArray<NSUserActivity> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
