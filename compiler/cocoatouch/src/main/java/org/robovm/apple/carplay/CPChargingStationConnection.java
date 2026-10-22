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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPChargingStationConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPChargingStationConnectionPtr extends Ptr<CPChargingStationConnection, CPChargingStationConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPChargingStationConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPChargingStationConnection() {}
    protected CPChargingStationConnection(Handle h, long handle) { super(h, handle); }
    protected CPChargingStationConnection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConnector:voltage:power:")
    public CPChargingStationConnection(CPChargingStationConnectionConnector connector, NSMeasurement<NSUnitElectricPotentialDifference> voltage, NSMeasurement<NSUnitPower> power) { super((SkipInit) null); initObject(init(connector, voltage, power)); }
    @Method(selector = "initWithCoder:")
    public CPChargingStationConnection(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "connector")
    public native CPChargingStationConnectionConnector getConnector();
    @Property(selector = "voltage")
    public native NSMeasurement<NSUnitElectricPotentialDifference> getVoltage();
    @Property(selector = "power")
    public native NSMeasurement<NSUnitPower> getPower();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConnector:voltage:power:")
    protected native @Pointer long init(CPChargingStationConnectionConnector connector, NSMeasurement<NSUnitElectricPotentialDifference> voltage, NSMeasurement<NSUnitPower> power);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
