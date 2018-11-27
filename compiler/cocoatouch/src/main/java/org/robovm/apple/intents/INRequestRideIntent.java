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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRequestRideIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INRequestRideIntentPtr extends Ptr<INRequestRideIntent, INRequestRideIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRequestRideIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRequestRideIntent() {}
    protected INRequestRideIntent(Handle h, long handle) { super(h, handle); }
    protected INRequestRideIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "initWithPickupLocation:dropOffLocation:rideOptionName:partySize:paymentMethod:scheduledPickupTime:")
    public INRequestRideIntent(CLPlacemark pickupLocation, CLPlacemark dropOffLocation, INSpeakableString rideOptionName, NSNumber partySize, INPaymentMethod paymentMethod, INDateComponentsRange scheduledPickupTime) { super((SkipInit) null); initObject(init(pickupLocation, dropOffLocation, rideOptionName, partySize, paymentMethod, scheduledPickupTime)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.3. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithPickupLocation:dropOffLocation:rideOptionName:partySize:paymentMethod:")
    public INRequestRideIntent(CLPlacemark pickupLocation, CLPlacemark dropOffLocation, INSpeakableString rideOptionName, NSNumber partySize, INPaymentMethod paymentMethod) { super((SkipInit) null); initObject(init(pickupLocation, dropOffLocation, rideOptionName, partySize, paymentMethod)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pickupLocation")
    public native CLPlacemark getPickupLocation();
    @Property(selector = "dropOffLocation")
    public native CLPlacemark getDropOffLocation();
    @Property(selector = "rideOptionName")
    public native INSpeakableString getRideOptionName();
    @Property(selector = "partySize")
    public native NSNumber getPartySize();
    @Property(selector = "paymentMethod")
    public native INPaymentMethod getPaymentMethod();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "scheduledPickupTime")
    public native INDateComponentsRange getScheduledPickupTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "initWithPickupLocation:dropOffLocation:rideOptionName:partySize:paymentMethod:scheduledPickupTime:")
    protected native @Pointer long init(CLPlacemark pickupLocation, CLPlacemark dropOffLocation, INSpeakableString rideOptionName, NSNumber partySize, INPaymentMethod paymentMethod, INDateComponentsRange scheduledPickupTime);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.3. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithPickupLocation:dropOffLocation:rideOptionName:partySize:paymentMethod:")
    protected native @Pointer long init(CLPlacemark pickupLocation, CLPlacemark dropOffLocation, INSpeakableString rideOptionName, NSNumber partySize, INPaymentMethod paymentMethod);
    /*</methods>*/
}
