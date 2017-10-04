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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INGetAvailableRestaurantReservationBookingDefaultsIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INGetAvailableRestaurantReservationBookingDefaultsIntentResponsePtr extends Ptr<INGetAvailableRestaurantReservationBookingDefaultsIntentResponse, INGetAvailableRestaurantReservationBookingDefaultsIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INGetAvailableRestaurantReservationBookingDefaultsIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INGetAvailableRestaurantReservationBookingDefaultsIntentResponse() {}
    protected INGetAvailableRestaurantReservationBookingDefaultsIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INGetAvailableRestaurantReservationBookingDefaultsIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDefaultPartySize:defaultBookingDate:code:userActivity:")
    public INGetAvailableRestaurantReservationBookingDefaultsIntentResponse(@MachineSizedUInt long defaultPartySize, NSDate defaultBookingDate, INGetAvailableRestaurantReservationBookingDefaultsIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(defaultPartySize, defaultBookingDate, code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultPartySize")
    public native @MachineSizedUInt long getDefaultPartySize();
    @Property(selector = "defaultBookingDate")
    public native NSDate getDefaultBookingDate();
    @Property(selector = "maximumPartySize")
    public native NSNumber getMaximumPartySize();
    @Property(selector = "setMaximumPartySize:")
    public native void setMaximumPartySize(NSNumber v);
    @Property(selector = "minimumPartySize")
    public native NSNumber getMinimumPartySize();
    @Property(selector = "setMinimumPartySize:")
    public native void setMinimumPartySize(NSNumber v);
    @Property(selector = "providerImage")
    public native INImage getProviderImage();
    @Property(selector = "setProviderImage:")
    public native void setProviderImage(INImage v);
    @Property(selector = "code")
    public native INGetAvailableRestaurantReservationBookingDefaultsIntentResponseCode getCode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDefaultPartySize:defaultBookingDate:code:userActivity:")
    protected native @Pointer long init(@MachineSizedUInt long defaultPartySize, NSDate defaultBookingDate, INGetAvailableRestaurantReservationBookingDefaultsIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
