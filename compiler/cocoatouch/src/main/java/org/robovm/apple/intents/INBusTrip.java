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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INBusTrip/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INBusTripPtr extends Ptr<INBusTrip, INBusTripPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INBusTrip.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INBusTrip() {}
    protected INBusTrip(Handle h, long handle) { super(h, handle); }
    protected INBusTrip(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProvider:busName:busNumber:tripDuration:departureBusStopLocation:departurePlatform:arrivalBusStopLocation:arrivalPlatform:")
    public INBusTrip(String provider, String busName, String busNumber, INDateComponentsRange tripDuration, CLPlacemark departureBusStopLocation, String departurePlatform, CLPlacemark arrivalBusStopLocation, String arrivalPlatform) { super((SkipInit) null); initObject(init(provider, busName, busNumber, tripDuration, departureBusStopLocation, departurePlatform, arrivalBusStopLocation, arrivalPlatform)); }
    @Method(selector = "initWithCoder:")
    public INBusTrip(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "provider")
    public native String getProvider();
    @Property(selector = "busName")
    public native String getBusName();
    @Property(selector = "busNumber")
    public native String getBusNumber();
    @Property(selector = "tripDuration")
    public native INDateComponentsRange getTripDuration();
    @Property(selector = "departureBusStopLocation")
    public native CLPlacemark getDepartureBusStopLocation();
    @Property(selector = "departurePlatform")
    public native String getDeparturePlatform();
    @Property(selector = "arrivalBusStopLocation")
    public native CLPlacemark getArrivalBusStopLocation();
    @Property(selector = "arrivalPlatform")
    public native String getArrivalPlatform();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProvider:busName:busNumber:tripDuration:departureBusStopLocation:departurePlatform:arrivalBusStopLocation:arrivalPlatform:")
    protected native @Pointer long init(String provider, String busName, String busNumber, INDateComponentsRange tripDuration, CLPlacemark departureBusStopLocation, String departurePlatform, CLPlacemark arrivalBusStopLocation, String arrivalPlatform);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
