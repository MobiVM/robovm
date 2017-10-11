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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurantReservationBooking/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRestaurantReservationBookingPtr extends Ptr<INRestaurantReservationBooking, INRestaurantReservationBookingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurantReservationBooking.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRestaurantReservationBooking() {}
    protected INRestaurantReservationBooking(Handle h, long handle) { super(h, handle); }
    protected INRestaurantReservationBooking(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRestaurant:bookingDate:partySize:bookingIdentifier:")
    public INRestaurantReservationBooking(INRestaurant restaurant, NSDate bookingDate, @MachineSizedUInt long partySize, String bookingIdentifier) { super((SkipInit) null); initObject(init(restaurant, bookingDate, partySize, bookingIdentifier)); }
    @Method(selector = "initWithCoder:")
    public INRestaurantReservationBooking(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "restaurant")
    public native INRestaurant getRestaurant();
    @Property(selector = "setRestaurant:")
    public native void setRestaurant(INRestaurant v);
    @Property(selector = "bookingDescription")
    public native String getBookingDescription();
    @Property(selector = "setBookingDescription:")
    public native void setBookingDescription(String v);
    @Property(selector = "bookingDate")
    public native NSDate getBookingDate();
    @Property(selector = "setBookingDate:")
    public native void setBookingDate(NSDate v);
    @Property(selector = "partySize")
    public native @MachineSizedUInt long getPartySize();
    @Property(selector = "setPartySize:")
    public native void setPartySize(@MachineSizedUInt long v);
    @Property(selector = "bookingIdentifier")
    public native String getBookingIdentifier();
    @Property(selector = "setBookingIdentifier:")
    public native void setBookingIdentifier(String v);
    @Property(selector = "isBookingAvailable")
    public native boolean isBookingAvailable();
    @Property(selector = "setBookingAvailable:")
    public native void setBookingAvailable(boolean v);
    @Property(selector = "offers")
    public native NSArray<INRestaurantOffer> getOffers();
    @Property(selector = "setOffers:")
    public native void setOffers(NSArray<INRestaurantOffer> v);
    @Property(selector = "requiresManualRequest")
    public native boolean requiresManualRequest();
    @Property(selector = "setRequiresManualRequest:")
    public native void setRequiresManualRequest(boolean v);
    @Property(selector = "requiresEmailAddress")
    public native boolean requiresEmailAddress();
    @Property(selector = "setRequiresEmailAddress:")
    public native void setRequiresEmailAddress(boolean v);
    @Property(selector = "requiresName")
    public native boolean requiresName();
    @Property(selector = "setRequiresName:")
    public native void setRequiresName(boolean v);
    @Property(selector = "requiresPhoneNumber")
    public native boolean requiresPhoneNumber();
    @Property(selector = "setRequiresPhoneNumber:")
    public native void setRequiresPhoneNumber(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRestaurant:bookingDate:partySize:bookingIdentifier:")
    protected native @Pointer long init(INRestaurant restaurant, NSDate bookingDate, @MachineSizedUInt long partySize, String bookingIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
