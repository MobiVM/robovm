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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INGetAvailableRestaurantReservationBookingsIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INGetAvailableRestaurantReservationBookingsIntentResponsePtr extends Ptr<INGetAvailableRestaurantReservationBookingsIntentResponse, INGetAvailableRestaurantReservationBookingsIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INGetAvailableRestaurantReservationBookingsIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INGetAvailableRestaurantReservationBookingsIntentResponse() {}
    protected INGetAvailableRestaurantReservationBookingsIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INGetAvailableRestaurantReservationBookingsIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAvailableBookings:code:userActivity:")
    public INGetAvailableRestaurantReservationBookingsIntentResponse(NSArray<INRestaurantReservationBooking> availableBookings, INGetAvailableRestaurantReservationBookingsIntentCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(availableBookings, code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INGetAvailableRestaurantReservationBookingsIntentCode getCode();
    @Property(selector = "localizedRestaurantDescriptionText")
    public native String getLocalizedRestaurantDescriptionText();
    @Property(selector = "setLocalizedRestaurantDescriptionText:")
    public native void setLocalizedRestaurantDescriptionText(String v);
    @Property(selector = "localizedBookingAdvisementText")
    public native String getLocalizedBookingAdvisementText();
    @Property(selector = "setLocalizedBookingAdvisementText:")
    public native void setLocalizedBookingAdvisementText(String v);
    @Property(selector = "termsAndConditions")
    public native INTermsAndConditions getTermsAndConditions();
    @Property(selector = "setTermsAndConditions:")
    public native void setTermsAndConditions(INTermsAndConditions v);
    @Property(selector = "availableBookings")
    public native NSArray<INRestaurantReservationBooking> getAvailableBookings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAvailableBookings:code:userActivity:")
    protected native @Pointer long init(NSArray<INRestaurantReservationBooking> availableBookings, INGetAvailableRestaurantReservationBookingsIntentCode code, NSUserActivity userActivity);
    /*</methods>*/
}
