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
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INGetCarPowerLevelStatusIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INGetCarPowerLevelStatusIntentResponsePtr extends Ptr<INGetCarPowerLevelStatusIntentResponse, INGetCarPowerLevelStatusIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INGetCarPowerLevelStatusIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INGetCarPowerLevelStatusIntentResponse() {}
    protected INGetCarPowerLevelStatusIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INGetCarPowerLevelStatusIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:userActivity:")
    public INGetCarPowerLevelStatusIntentResponse(INGetCarPowerLevelStatusIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INGetCarPowerLevelStatusIntentResponseCode getCode();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "carIdentifier")
    public native String getCarIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setCarIdentifier:")
    public native void setCarIdentifier(String v);
    @Property(selector = "fuelPercentRemaining")
    public native NSNumber getFuelPercentRemaining();
    @Property(selector = "setFuelPercentRemaining:")
    public native void setFuelPercentRemaining(NSNumber v);
    @Property(selector = "chargePercentRemaining")
    public native NSNumber getChargePercentRemaining();
    @Property(selector = "setChargePercentRemaining:")
    public native void setChargePercentRemaining(NSNumber v);
    @Property(selector = "distanceRemaining")
    public native NSMeasurement<NSUnitLength> getDistanceRemaining();
    @Property(selector = "setDistanceRemaining:")
    public native void setDistanceRemaining(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "charging")
    public native NSNumber getCharging();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setCharging:")
    public native void setCharging(NSNumber v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "minutesToFull")
    public native NSNumber getMinutesToFull();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setMinutesToFull:")
    public native void setMinutesToFull(NSNumber v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumDistance")
    public native NSMeasurement<NSUnitLength> getMaximumDistance();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMaximumDistance:")
    public native void setMaximumDistance(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "distanceRemainingElectric")
    public native NSMeasurement<NSUnitLength> getDistanceRemainingElectric();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDistanceRemainingElectric:")
    public native void setDistanceRemainingElectric(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumDistanceElectric")
    public native NSMeasurement<NSUnitLength> getMaximumDistanceElectric();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMaximumDistanceElectric:")
    public native void setMaximumDistanceElectric(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "distanceRemainingFuel")
    public native NSMeasurement<NSUnitLength> getDistanceRemainingFuel();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDistanceRemainingFuel:")
    public native void setDistanceRemainingFuel(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumDistanceFuel")
    public native NSMeasurement<NSUnitLength> getMaximumDistanceFuel();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMaximumDistanceFuel:")
    public native void setMaximumDistanceFuel(NSMeasurement<NSUnitLength> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "consumptionFormulaArguments")
    public native NSDictionary<NSString, ?> getConsumptionFormulaArguments();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setConsumptionFormulaArguments:")
    public native void setConsumptionFormulaArguments(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "chargingFormulaArguments")
    public native NSDictionary<NSString, ?> getChargingFormulaArguments();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setChargingFormulaArguments:")
    public native void setChargingFormulaArguments(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dateOfLastStateUpdate")
    public native NSDateComponents getDateOfLastStateUpdate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDateOfLastStateUpdate:")
    public native void setDateOfLastStateUpdate(NSDateComponents v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "activeConnector")
    public native INCarChargingConnectorType getActiveConnector();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setActiveConnector:")
    public native void setActiveConnector(INCarChargingConnectorType v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> getMaximumBatteryCapacity();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMaximumBatteryCapacity:")
    public native void setMaximumBatteryCapacity(NSMeasurement<NSUnitEnergy> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "currentBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> getCurrentBatteryCapacity();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setCurrentBatteryCapacity:")
    public native void setCurrentBatteryCapacity(NSMeasurement<NSUnitEnergy> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "minimumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> getMinimumBatteryCapacity();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMinimumBatteryCapacity:")
    public native void setMinimumBatteryCapacity(NSMeasurement<NSUnitEnergy> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:userActivity:")
    protected native @Pointer long init(INGetCarPowerLevelStatusIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
