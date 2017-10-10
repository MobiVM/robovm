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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRestaurant/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRestaurantPtr extends Ptr<INRestaurant, INRestaurantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRestaurant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRestaurant() {}
    protected INRestaurant(Handle h, long handle) { super(h, handle); }
    protected INRestaurant(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocation:name:vendorIdentifier:restaurantIdentifier:")
    public INRestaurant(CLLocation location, String name, String vendorIdentifier, String restaurantIdentifier) { super((SkipInit) null); initObject(init(location, name, vendorIdentifier, restaurantIdentifier)); }
    @Method(selector = "initWithCoder:")
    public INRestaurant(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "vendorIdentifier")
    public native String getVendorIdentifier();
    @Property(selector = "setVendorIdentifier:")
    public native void setVendorIdentifier(String v);
    @Property(selector = "restaurantIdentifier")
    public native String getRestaurantIdentifier();
    @Property(selector = "setRestaurantIdentifier:")
    public native void setRestaurantIdentifier(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocation:name:vendorIdentifier:restaurantIdentifier:")
    protected native @Pointer long init(CLLocation location, String name, String vendorIdentifier, String restaurantIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
