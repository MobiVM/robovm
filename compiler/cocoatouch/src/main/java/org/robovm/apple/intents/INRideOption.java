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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRideOption/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRideOptionPtr extends Ptr<INRideOption, INRideOptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRideOption.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRideOption() {}
    protected INRideOption(Handle h, long handle) { super(h, handle); }
    protected INRideOption(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:estimatedPickupDate:")
    public INRideOption(String name, NSDate estimatedPickupDate) { super((SkipInit) null); initObject(init(name, estimatedPickupDate)); }
    @Method(selector = "initWithCoder:")
    public INRideOption(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "estimatedPickupDate")
    public native NSDate getEstimatedPickupDate();
    @Property(selector = "setEstimatedPickupDate:")
    public native void setEstimatedPickupDate(NSDate v);
    @Property(selector = "priceRange")
    public native INPriceRange getPriceRange();
    @Property(selector = "setPriceRange:")
    public native void setPriceRange(INPriceRange v);
    @Property(selector = "usesMeteredFare")
    public native NSNumber getUsesMeteredFare();
    @Property(selector = "setUsesMeteredFare:")
    public native void setUsesMeteredFare(NSNumber v);
    @Property(selector = "disclaimerMessage")
    public native String getDisclaimerMessage();
    @Property(selector = "setDisclaimerMessage:")
    public native void setDisclaimerMessage(String v);
    @Property(selector = "availablePartySizeOptions")
    public native NSArray<INRidePartySizeOption> getAvailablePartySizeOptions();
    @Property(selector = "setAvailablePartySizeOptions:")
    public native void setAvailablePartySizeOptions(NSArray<INRidePartySizeOption> v);
    @Property(selector = "availablePartySizeOptionsSelectionPrompt")
    public native String getAvailablePartySizeOptionsSelectionPrompt();
    @Property(selector = "setAvailablePartySizeOptionsSelectionPrompt:")
    public native void setAvailablePartySizeOptionsSelectionPrompt(String v);
    @Property(selector = "specialPricing")
    public native String getSpecialPricing();
    @Property(selector = "setSpecialPricing:")
    public native void setSpecialPricing(String v);
    @Property(selector = "specialPricingBadgeImage")
    public native INImage getSpecialPricingBadgeImage();
    @Property(selector = "setSpecialPricingBadgeImage:")
    public native void setSpecialPricingBadgeImage(INImage v);
    @Property(selector = "fareLineItems")
    public native NSArray<INRideFareLineItem> getFareLineItems();
    @Property(selector = "setFareLineItems:")
    public native void setFareLineItems(NSArray<INRideFareLineItem> v);
    @Property(selector = "userActivityForBookingInApplication")
    public native NSUserActivity getUserActivityForBookingInApplication();
    @Property(selector = "setUserActivityForBookingInApplication:")
    public native void setUserActivityForBookingInApplication(NSUserActivity v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:estimatedPickupDate:")
    protected native @Pointer long init(String name, NSDate estimatedPickupDate);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
