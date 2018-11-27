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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurantReservationUserBooking/*</name>*/ 
    extends /*<extends>*/INRestaurantReservationBooking/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INRestaurantReservationUserBookingPtr extends Ptr<INRestaurantReservationUserBooking, INRestaurantReservationUserBookingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurantReservationUserBooking.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRestaurantReservationUserBooking() {}
    protected INRestaurantReservationUserBooking(Handle h, long handle) { super(h, handle); }
    protected INRestaurantReservationUserBooking(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRestaurant:bookingDate:partySize:bookingIdentifier:guest:status:dateStatusModified:")
    public INRestaurantReservationUserBooking(INRestaurant restaurant, NSDate bookingDate, @MachineSizedUInt long partySize, String bookingIdentifier, INRestaurantGuest guest, INRestaurantReservationUserBookingStatus status, NSDate dateStatusModified) { super((SkipInit) null); initObject(init(restaurant, bookingDate, partySize, bookingIdentifier, guest, status, dateStatusModified)); }
    @Method(selector = "initWithRestaurant:bookingDate:partySize:bookingIdentifier:")
    public INRestaurantReservationUserBooking(INRestaurant restaurant, NSDate bookingDate, @MachineSizedUInt long partySize, String bookingIdentifier) { super(restaurant, bookingDate, partySize, bookingIdentifier); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "guest")
    public native INRestaurantGuest getGuest();
    @Property(selector = "setGuest:")
    public native void setGuest(INRestaurantGuest v);
    @Property(selector = "advisementText")
    public native String getAdvisementText();
    @Property(selector = "setAdvisementText:")
    public native void setAdvisementText(String v);
    @Property(selector = "selectedOffer")
    public native INRestaurantOffer getSelectedOffer();
    @Property(selector = "setSelectedOffer:")
    public native void setSelectedOffer(INRestaurantOffer v);
    @Property(selector = "guestProvidedSpecialRequestText")
    public native String getGuestProvidedSpecialRequestText();
    @Property(selector = "setGuestProvidedSpecialRequestText:")
    public native void setGuestProvidedSpecialRequestText(String v);
    @Property(selector = "status")
    public native INRestaurantReservationUserBookingStatus getStatus();
    @Property(selector = "setStatus:")
    public native void setStatus(INRestaurantReservationUserBookingStatus v);
    @Property(selector = "dateStatusModified")
    public native NSDate getDateStatusModified();
    @Property(selector = "setDateStatusModified:")
    public native void setDateStatusModified(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRestaurant:bookingDate:partySize:bookingIdentifier:guest:status:dateStatusModified:")
    protected native @Pointer long init(INRestaurant restaurant, NSDate bookingDate, @MachineSizedUInt long partySize, String bookingIdentifier, INRestaurantGuest guest, INRestaurantReservationUserBookingStatus status, NSDate dateStatusModified);
    /*</methods>*/
}
