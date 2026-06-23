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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MTRDeviceTypeIDType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 18.2 and later.
     */
    DoorLockID(10L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DoorLockControllerID(11L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    AggregatorID(14L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    GenericSwitchID(15L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    PowerSourceID(17L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OTARequestorID(18L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    BridgedNodeID(19L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OTAProviderID(20L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ContactSensorID(21L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    RootNodeID(22L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    SolarPowerID(23L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    BatteryStorageID(24L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    SecondaryNetworkInterfaceID(25L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    SpeakerID(34L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    CastingVideoPlayerID(35L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ContentAppID(36L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ModeSelectID(39L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    BasicVideoPlayerID(40L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    CastingVideoClientID(41L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    VideoRemoteControlID(42L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    FanID(43L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    AirQualitySensorID(44L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    AirPurifierID(45L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    WaterFreezeDetectorID(65L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    WaterValveID(66L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    WaterLeakDetectorID(67L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    RainSensorID(68L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    RefrigeratorID(112L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    TemperatureControlledCabinetID(113L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    RoomAirConditionerID(114L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    LaundryWasherID(115L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    RoboticVacuumCleanerID(116L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DishwasherID(117L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    SmokeCOAlarmID(118L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    CookSurfaceID(119L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    CooktopID(120L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    MicrowaveOvenID(121L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ExtractorHoodID(122L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OvenID(123L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    LaundryDryerID(124L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    NetworkInfrastructureManagerID(144L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ThreadBorderRouterID(145L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OnOffLightID(256L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DimmableLightID(257L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OnOffLightSwitchID(259L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DimmerSwitchID(260L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ColorDimmerSwitchID(261L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    LightSensorID(262L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OccupancySensorID(263L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OnOffPlugInUnitID(266L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DimmablePlugInUnitID(267L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ColorTemperatureLightID(268L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ExtendedColorLightID(269L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    WindowCoveringID(514L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    WindowCoveringControllerID(515L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ThermostatID(769L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    TemperatureSensorID(770L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    PumpID(771L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    PumpControllerID(772L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    PressureSensorID(773L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    FlowSensorID(774L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    HumiditySensorID(775L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    HeatPumpID(777L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    EVSEID(1292L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    DeviceEnergyManagementID(1293L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    WaterHeaterID(1295L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ElectricalSensorID(1296L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    ControlBridgeID(2112L),
    /**
     * @since Available in iOS 18.2 and later.
     */
    OnOffSensorID(2128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRDeviceTypeIDType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRDeviceTypeIDType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRDeviceTypeIDType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRDeviceTypeIDType/*</name>*/.class.getName());
    }
}
