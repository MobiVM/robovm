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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurantReservation/*</name>*/ 
    extends /*<extends>*/INReservation/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRestaurantReservationPtr extends Ptr<INRestaurantReservation, INRestaurantReservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurantReservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRestaurantReservation() {}
    protected INRestaurantReservation(Handle h, long handle) { super(h, handle); }
    protected INRestaurantReservation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:reservationDuration:partySize:restaurantLocation:")
    public INRestaurantReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, INDateComponentsRange reservationDuration, NSNumber partySize, CLPlacemark restaurantLocation) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, URL, reservationDuration, partySize, restaurantLocation)); }
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservationDuration:partySize:restaurantLocation:")
    public INRestaurantReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INDateComponentsRange reservationDuration, NSNumber partySize, CLPlacemark restaurantLocation) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, reservationDuration, partySize, restaurantLocation)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reservationDuration")
    public native INDateComponentsRange getReservationDuration();
    @Property(selector = "partySize")
    public native NSNumber getPartySize();
    @Property(selector = "restaurantLocation")
    public native CLPlacemark getRestaurantLocation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:reservationDuration:partySize:restaurantLocation:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, INDateComponentsRange reservationDuration, NSNumber partySize, CLPlacemark restaurantLocation);
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservationDuration:partySize:restaurantLocation:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INDateComponentsRange reservationDuration, NSNumber partySize, CLPlacemark restaurantLocation);
    /*</methods>*/
}
