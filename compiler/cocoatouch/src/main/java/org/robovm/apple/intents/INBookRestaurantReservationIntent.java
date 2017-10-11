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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INBookRestaurantReservationIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INBookRestaurantReservationIntentPtr extends Ptr<INBookRestaurantReservationIntent, INBookRestaurantReservationIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INBookRestaurantReservationIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INBookRestaurantReservationIntent() {}
    protected INBookRestaurantReservationIntent(Handle h, long handle) { super(h, handle); }
    protected INBookRestaurantReservationIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRestaurant:bookingDateComponents:partySize:bookingIdentifier:guest:selectedOffer:guestProvidedSpecialRequestText:")
    public INBookRestaurantReservationIntent(INRestaurant restaurant, NSDateComponents bookingDateComponents, @MachineSizedUInt long partySize, String bookingIdentifier, INRestaurantGuest guest, INRestaurantOffer selectedOffer, String guestProvidedSpecialRequestText) { super((SkipInit) null); initObject(init(restaurant, bookingDateComponents, partySize, bookingIdentifier, guest, selectedOffer, guestProvidedSpecialRequestText)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "restaurant")
    public native INRestaurant getRestaurant();
    @Property(selector = "setRestaurant:")
    public native void setRestaurant(INRestaurant v);
    @Property(selector = "bookingDateComponents")
    public native NSDateComponents getBookingDateComponents();
    @Property(selector = "setBookingDateComponents:")
    public native void setBookingDateComponents(NSDateComponents v);
    @Property(selector = "partySize")
    public native @MachineSizedUInt long getPartySize();
    @Property(selector = "setPartySize:")
    public native void setPartySize(@MachineSizedUInt long v);
    @Property(selector = "bookingIdentifier")
    public native String getBookingIdentifier();
    @Property(selector = "setBookingIdentifier:")
    public native void setBookingIdentifier(String v);
    @Property(selector = "guest")
    public native INRestaurantGuest getGuest();
    @Property(selector = "setGuest:")
    public native void setGuest(INRestaurantGuest v);
    @Property(selector = "selectedOffer")
    public native INRestaurantOffer getSelectedOffer();
    @Property(selector = "setSelectedOffer:")
    public native void setSelectedOffer(INRestaurantOffer v);
    @Property(selector = "guestProvidedSpecialRequestText")
    public native String getGuestProvidedSpecialRequestText();
    @Property(selector = "setGuestProvidedSpecialRequestText:")
    public native void setGuestProvidedSpecialRequestText(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRestaurant:bookingDateComponents:partySize:bookingIdentifier:guest:selectedOffer:guestProvidedSpecialRequestText:")
    protected native @Pointer long init(INRestaurant restaurant, NSDateComponents bookingDateComponents, @MachineSizedUInt long partySize, String bookingIdentifier, INRestaurantGuest guest, INRestaurantOffer selectedOffer, String guestProvidedSpecialRequestText);
    /*</methods>*/
}
