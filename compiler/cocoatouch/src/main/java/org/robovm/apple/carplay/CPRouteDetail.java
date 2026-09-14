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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPRouteDetail/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPRouteDetailPtr extends Ptr<CPRouteDetail, CPRouteDetailPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPRouteDetail.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPRouteDetail() {}
    protected CPRouteDetail(Handle h, long handle) { super(h, handle); }
    protected CPRouteDetail(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CPRouteDetail(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "symbolTintColor")
    public native UIColor getSymbolTintColor();
    @Property(selector = "setSymbolTintColor:")
    public native void setSymbolTintColor(UIColor v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "routeDetailWithTollAmount:locale:")
    public static native CPRouteDetail routeDetailWithTollAmount(double value, NSLocale locale);
    @Method(selector = "routeDetailWithFuelLevel:")
    public static native CPRouteDetail routeDetailWithFuelLevel(NSMeasurement<NSUnitVolume> fuelLevel);
    @Method(selector = "routeDetailWithFuelEnergy:")
    public static native CPRouteDetail routeDetailWithFuelEnergy(NSMeasurement<NSUnitEnergy> fuelEnergy);
    @Method(selector = "routeDetailWithFuelMass:")
    public static native CPRouteDetail routeDetailWithFuelMass(NSMeasurement<NSUnitMass> fuelMass);
    @Method(selector = "routeDetailWithBatteryLevel:")
    public static native CPRouteDetail routeDetailWithBatteryLevel(double batteryLevel);
    @Method(selector = "routeDetailWithKilowattHours:")
    public static native CPRouteDetail routeDetailWithKilowattHours(NSMeasurement<NSUnitEnergy> kilowattHours);
    @Method(selector = "routeDetailWithCarbonFootprint:")
    public static native CPRouteDetail routeDetailWithCarbonFootprint(NSMeasurement<NSUnitMass> carbonFootprint);
    @Method(selector = "routeDetailWithEcoScore:")
    public static native CPRouteDetail routeDetailWithEcoScore(double value);
    @Method(selector = "routeDetailWithEmissions:")
    public static native CPRouteDetail routeDetailWithEmissions(NSMeasurement<NSUnitMass> emissions);
    @Method(selector = "routeDetailWithRating:")
    public static native CPRouteDetail routeDetailWithRating(double rating);
    @Method(selector = "routeDetailWithHOV:")
    public static native CPRouteDetail routeDetailWithHOV(String hovInfo);
    @Method(selector = "routeDetailWithTrafficLights:")
    public static native CPRouteDetail routeDetailWithTrafficLights(@MachineSizedUInt long trafficLights);
    @Method(selector = "routeDetailWithWarning:")
    public static native CPRouteDetail routeDetailWithWarning(String warning);
    @Method(selector = "routeDetailWithInfo:")
    public static native CPRouteDetail routeDetailWithInfo(String info);
    @Method(selector = "routeDetailWithParking:")
    public static native CPRouteDetail routeDetailWithParking(String parking);
    @Method(selector = "routeDetailWithSymbolName:value:")
    public static native CPRouteDetail routeDetailWithSymbolName(String symbolName, String value);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
