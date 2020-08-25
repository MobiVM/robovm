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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCar/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INCarPtr extends Ptr<INCar, INCarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCar() {}
    protected INCar(Handle h, long handle) { super(h, handle); }
    protected INCar(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCarIdentifier:displayName:year:make:model:color:headUnit:supportedChargingConnectors:")
    public INCar(String carIdentifier, String displayName, String year, String make, String model, CGColor color, INCarHeadUnit headUnit, NSArray<NSString> supportedChargingConnectors) { super((SkipInit) null); initObject(init(carIdentifier, displayName, year, make, model, color, headUnit, supportedChargingConnectors)); }
    @Method(selector = "initWithCoder:")
    public INCar(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "carIdentifier")
    public native String getCarIdentifier();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "year")
    public native String getYear();
    @Property(selector = "make")
    public native String getMake();
    @Property(selector = "model")
    public native String getModel();
    @Property(selector = "color")
    public native CGColor getColor();
    @Property(selector = "headUnit")
    public native INCarHeadUnit getHeadUnit();
    @Property(selector = "supportedChargingConnectors")
    public native NSArray<NSString> getSupportedChargingConnectors();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCarIdentifier:displayName:year:make:model:color:headUnit:supportedChargingConnectors:")
    protected native @Pointer long init(String carIdentifier, String displayName, String year, String make, String model, CGColor color, INCarHeadUnit headUnit, NSArray<NSString> supportedChargingConnectors);
    @Method(selector = "setMaximumPower:forChargingConnectorType:")
    public native void setMaximumPower(NSMeasurement<NSUnitPower> power, INCarChargingConnectorType chargingConnectorType);
    @Method(selector = "maximumPowerForChargingConnectorType:")
    public native NSMeasurement<NSUnitPower> maximumPowerForChargingConnectorType(INCarChargingConnectorType chargingConnectorType);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
