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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INListRideOptionsIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INListRideOptionsIntentPtr extends Ptr<INListRideOptionsIntent, INListRideOptionsIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INListRideOptionsIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INListRideOptionsIntent() {}
    protected INListRideOptionsIntent(Handle h, long handle) { super(h, handle); }
    protected INListRideOptionsIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPickupLocation:dropOffLocation:")
    public INListRideOptionsIntent(CLPlacemark pickupLocation, CLPlacemark dropOffLocation) { super((SkipInit) null); initObject(init(pickupLocation, dropOffLocation)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pickupLocation")
    public native CLPlacemark getPickupLocation();
    @Property(selector = "dropOffLocation")
    public native CLPlacemark getDropOffLocation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPickupLocation:dropOffLocation:")
    protected native @Pointer long init(CLPlacemark pickupLocation, CLPlacemark dropOffLocation);
    /*</methods>*/
}
