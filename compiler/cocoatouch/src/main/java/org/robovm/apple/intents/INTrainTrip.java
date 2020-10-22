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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTrainTrip/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INTrainTripPtr extends Ptr<INTrainTrip, INTrainTripPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTrainTrip.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INTrainTrip() {}
    protected INTrainTrip(Handle h, long handle) { super(h, handle); }
    protected INTrainTrip(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProvider:trainName:trainNumber:tripDuration:departureStationLocation:departurePlatform:arrivalStationLocation:arrivalPlatform:")
    public INTrainTrip(String provider, String trainName, String trainNumber, INDateComponentsRange tripDuration, CLPlacemark departureStationLocation, String departurePlatform, CLPlacemark arrivalStationLocation, String arrivalPlatform) { super((SkipInit) null); initObject(init(provider, trainName, trainNumber, tripDuration, departureStationLocation, departurePlatform, arrivalStationLocation, arrivalPlatform)); }
    @Method(selector = "initWithCoder:")
    public INTrainTrip(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "provider")
    public native String getProvider();
    @Property(selector = "trainName")
    public native String getTrainName();
    @Property(selector = "trainNumber")
    public native String getTrainNumber();
    @Property(selector = "tripDuration")
    public native INDateComponentsRange getTripDuration();
    @Property(selector = "departureStationLocation")
    public native CLPlacemark getDepartureStationLocation();
    @Property(selector = "departurePlatform")
    public native String getDeparturePlatform();
    @Property(selector = "arrivalStationLocation")
    public native CLPlacemark getArrivalStationLocation();
    @Property(selector = "arrivalPlatform")
    public native String getArrivalPlatform();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProvider:trainName:trainNumber:tripDuration:departureStationLocation:departurePlatform:arrivalStationLocation:arrivalPlatform:")
    protected native @Pointer long init(String provider, String trainName, String trainNumber, INDateComponentsRange tripDuration, CLPlacemark departureStationLocation, String departurePlatform, CLPlacemark arrivalStationLocation, String arrivalPlatform);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
