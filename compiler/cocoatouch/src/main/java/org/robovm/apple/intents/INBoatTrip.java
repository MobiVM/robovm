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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INBoatTrip/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INBoatTripPtr extends Ptr<INBoatTrip, INBoatTripPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INBoatTrip.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INBoatTrip() {}
    protected INBoatTrip(Handle h, long handle) { super(h, handle); }
    protected INBoatTrip(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProvider:boatName:boatNumber:tripDuration:departureBoatTerminalLocation:arrivalBoatTerminalLocation:")
    public INBoatTrip(String provider, String boatName, String boatNumber, INDateComponentsRange tripDuration, CLPlacemark departureBoatTerminalLocation, CLPlacemark arrivalBoatTerminalLocation) { super((SkipInit) null); initObject(init(provider, boatName, boatNumber, tripDuration, departureBoatTerminalLocation, arrivalBoatTerminalLocation)); }
    @Method(selector = "initWithCoder:")
    public INBoatTrip(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "provider")
    public native String getProvider();
    @Property(selector = "boatName")
    public native String getBoatName();
    @Property(selector = "boatNumber")
    public native String getBoatNumber();
    @Property(selector = "tripDuration")
    public native INDateComponentsRange getTripDuration();
    @Property(selector = "departureBoatTerminalLocation")
    public native CLPlacemark getDepartureBoatTerminalLocation();
    @Property(selector = "arrivalBoatTerminalLocation")
    public native CLPlacemark getArrivalBoatTerminalLocation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProvider:boatName:boatNumber:tripDuration:departureBoatTerminalLocation:arrivalBoatTerminalLocation:")
    protected native @Pointer long init(String provider, String boatName, String boatNumber, INDateComponentsRange tripDuration, CLPlacemark departureBoatTerminalLocation, CLPlacemark arrivalBoatTerminalLocation);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
