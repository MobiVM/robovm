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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INGetAvailableRestaurantReservationBookingsIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INGetAvailableRestaurantReservationBookingsIntentPtr extends Ptr<INGetAvailableRestaurantReservationBookingsIntent, INGetAvailableRestaurantReservationBookingsIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INGetAvailableRestaurantReservationBookingsIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INGetAvailableRestaurantReservationBookingsIntent() {}
    protected INGetAvailableRestaurantReservationBookingsIntent(Handle h, long handle) { super(h, handle); }
    protected INGetAvailableRestaurantReservationBookingsIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRestaurant:partySize:preferredBookingDateComponents:maximumNumberOfResults:earliestBookingDateForResults:latestBookingDateForResults:")
    public INGetAvailableRestaurantReservationBookingsIntent(INRestaurant restaurant, @MachineSizedUInt long partySize, NSDateComponents preferredBookingDateComponents, NSNumber maximumNumberOfResults, NSDate earliestBookingDateForResults, NSDate latestBookingDateForResults) { super((SkipInit) null); initObject(init(restaurant, partySize, preferredBookingDateComponents, maximumNumberOfResults, earliestBookingDateForResults, latestBookingDateForResults)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "restaurant")
    public native INRestaurant getRestaurant();
    @Property(selector = "setRestaurant:")
    public native void setRestaurant(INRestaurant v);
    @Property(selector = "partySize")
    public native @MachineSizedUInt long getPartySize();
    @Property(selector = "setPartySize:")
    public native void setPartySize(@MachineSizedUInt long v);
    @Property(selector = "preferredBookingDateComponents")
    public native NSDateComponents getPreferredBookingDateComponents();
    @Property(selector = "setPreferredBookingDateComponents:")
    public native void setPreferredBookingDateComponents(NSDateComponents v);
    @Property(selector = "maximumNumberOfResults")
    public native NSNumber getMaximumNumberOfResults();
    @Property(selector = "setMaximumNumberOfResults:")
    public native void setMaximumNumberOfResults(NSNumber v);
    @Property(selector = "earliestBookingDateForResults")
    public native NSDate getEarliestBookingDateForResults();
    @Property(selector = "setEarliestBookingDateForResults:")
    public native void setEarliestBookingDateForResults(NSDate v);
    @Property(selector = "latestBookingDateForResults")
    public native NSDate getLatestBookingDateForResults();
    @Property(selector = "setLatestBookingDateForResults:")
    public native void setLatestBookingDateForResults(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRestaurant:partySize:preferredBookingDateComponents:maximumNumberOfResults:earliestBookingDateForResults:latestBookingDateForResults:")
    protected native @Pointer long init(INRestaurant restaurant, @MachineSizedUInt long partySize, NSDateComponents preferredBookingDateComponents, NSNumber maximumNumberOfResults, NSDate earliestBookingDateForResults, NSDate latestBookingDateForResults);
    /*</methods>*/
}
