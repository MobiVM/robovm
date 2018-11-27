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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HMCharacteristicType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMCharacteristicType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HMCharacteristicType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HMCharacteristicType toObject(Class<HMCharacteristicType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HMCharacteristicType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HMCharacteristicType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HMCharacteristicType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HMCharacteristicType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HMCharacteristicType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HMCharacteristicType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HMCharacteristicType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType PowerState = new HMCharacteristicType("PowerState");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Hue = new HMCharacteristicType("Hue");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Saturation = new HMCharacteristicType("Saturation");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Brightness = new HMCharacteristicType("Brightness");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TemperatureUnits = new HMCharacteristicType("TemperatureUnits");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CurrentTemperature = new HMCharacteristicType("CurrentTemperature");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TargetTemperature = new HMCharacteristicType("TargetTemperature");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CurrentHeatingCooling = new HMCharacteristicType("CurrentHeatingCooling");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TargetHeatingCooling = new HMCharacteristicType("TargetHeatingCooling");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CoolingThreshold = new HMCharacteristicType("CoolingThreshold");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType HeatingThreshold = new HMCharacteristicType("HeatingThreshold");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CurrentRelativeHumidity = new HMCharacteristicType("CurrentRelativeHumidity");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TargetRelativeHumidity = new HMCharacteristicType("TargetRelativeHumidity");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CurrentDoorState = new HMCharacteristicType("CurrentDoorState");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TargetDoorState = new HMCharacteristicType("TargetDoorState");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType ObstructionDetected = new HMCharacteristicType("ObstructionDetected");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Name = new HMCharacteristicType("Name");
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    public static final HMCharacteristicType Manufacturer = new HMCharacteristicType("Manufacturer");
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    public static final HMCharacteristicType Model = new HMCharacteristicType("Model");
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. No longer supported
     */
    @Deprecated
    public static final HMCharacteristicType SerialNumber = new HMCharacteristicType("SerialNumber");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Identify = new HMCharacteristicType("Identify");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType RotationDirection = new HMCharacteristicType("RotationDirection");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType RotationSpeed = new HMCharacteristicType("RotationSpeed");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType OutletInUse = new HMCharacteristicType("OutletInUse");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Version = new HMCharacteristicType("Version");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType Logs = new HMCharacteristicType("Logs");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType AudioFeedback = new HMCharacteristicType("AudioFeedback");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType AdminOnlyAccess = new HMCharacteristicType("AdminOnlyAccess");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType SecuritySystemAlarmType = new HMCharacteristicType("SecuritySystemAlarmType");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType MotionDetected = new HMCharacteristicType("MotionDetected");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType CurrentLockMechanismState = new HMCharacteristicType("CurrentLockMechanismState");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType TargetLockMechanismState = new HMCharacteristicType("TargetLockMechanismState");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType LockMechanismLastKnownAction = new HMCharacteristicType("LockMechanismLastKnownAction");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType LockManagementControlPoint = new HMCharacteristicType("LockManagementControlPoint");
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final HMCharacteristicType LockManagementAutoSecureTimeout = new HMCharacteristicType("LockManagementAutoSecureTimeout");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType AirParticulateDensity = new HMCharacteristicType("AirParticulateDensity");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType AirParticulateSize = new HMCharacteristicType("AirParticulateSize");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType AirQuality = new HMCharacteristicType("AirQuality");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType BatteryLevel = new HMCharacteristicType("BatteryLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonDioxideDetected = new HMCharacteristicType("CarbonDioxideDetected");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonDioxideLevel = new HMCharacteristicType("CarbonDioxideLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonDioxidePeakLevel = new HMCharacteristicType("CarbonDioxidePeakLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonMonoxideDetected = new HMCharacteristicType("CarbonMonoxideDetected");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonMonoxideLevel = new HMCharacteristicType("CarbonMonoxideLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CarbonMonoxidePeakLevel = new HMCharacteristicType("CarbonMonoxidePeakLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType ChargingState = new HMCharacteristicType("ChargingState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType ContactState = new HMCharacteristicType("ContactState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CurrentHorizontalTilt = new HMCharacteristicType("CurrentHorizontalTilt");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CurrentLightLevel = new HMCharacteristicType("CurrentLightLevel");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CurrentPosition = new HMCharacteristicType("CurrentPosition");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CurrentSecuritySystemState = new HMCharacteristicType("CurrentSecuritySystemState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType CurrentVerticalTilt = new HMCharacteristicType("CurrentVerticalTilt");
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    public static final HMCharacteristicType FirmwareVersion = new HMCharacteristicType("FirmwareVersion");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType HardwareVersion = new HMCharacteristicType("HardwareVersion");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType HoldPosition = new HMCharacteristicType("HoldPosition");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType InputEvent = new HMCharacteristicType("InputEvent");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType LeakDetected = new HMCharacteristicType("LeakDetected");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType OccupancyDetected = new HMCharacteristicType("OccupancyDetected");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType OutputState = new HMCharacteristicType("OutputState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType PositionState = new HMCharacteristicType("PositionState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType SmokeDetected = new HMCharacteristicType("SmokeDetected");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType SoftwareVersion = new HMCharacteristicType("SoftwareVersion");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType StatusActive = new HMCharacteristicType("StatusActive");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType StatusFault = new HMCharacteristicType("StatusFault");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType StatusJammed = new HMCharacteristicType("StatusJammed");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType StatusLowBattery = new HMCharacteristicType("StatusLowBattery");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType StatusTampered = new HMCharacteristicType("StatusTampered");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType TargetHorizontalTilt = new HMCharacteristicType("TargetHorizontalTilt");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType TargetSecuritySystemState = new HMCharacteristicType("TargetSecuritySystemState");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType TargetPosition = new HMCharacteristicType("TargetPosition");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMCharacteristicType TargetVerticalTilt = new HMCharacteristicType("TargetVerticalTilt");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType StreamingStatus = new HMCharacteristicType("StreamingStatus");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType SetupStreamEndpoint = new HMCharacteristicType("SetupStreamEndpoint");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType SupportedVideoStreamConfiguration = new HMCharacteristicType("SupportedVideoStreamConfiguration");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType SupportedAudioStreamConfiguration = new HMCharacteristicType("SupportedAudioStreamConfiguration");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType SupportedRTPConfiguration = new HMCharacteristicType("SupportedRTPConfiguration");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType SelectedStreamConfiguration = new HMCharacteristicType("SelectedStreamConfiguration");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType Volume = new HMCharacteristicType("Volume");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType Mute = new HMCharacteristicType("Mute");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType NightVision = new HMCharacteristicType("NightVision");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType OpticalZoom = new HMCharacteristicType("OpticalZoom");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType DigitalZoom = new HMCharacteristicType("DigitalZoom");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType ImageRotation = new HMCharacteristicType("ImageRotation");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMCharacteristicType ImageMirroring = new HMCharacteristicType("ImageMirroring");
    /**
     * @since Available in iOS 10.3 and later.
     */
    public static final HMCharacteristicType LabelNamespace = new HMCharacteristicType("LabelNamespace");
    /**
     * @since Available in iOS 10.3 and later.
     */
    public static final HMCharacteristicType LabelIndex = new HMCharacteristicType("LabelIndex");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType Active = new HMCharacteristicType("Active");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentAirPurifierState = new HMCharacteristicType("CurrentAirPurifierState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType TargetAirPurifierState = new HMCharacteristicType("TargetAirPurifierState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentFanState = new HMCharacteristicType("CurrentFanState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentHeaterCoolerState = new HMCharacteristicType("CurrentHeaterCoolerState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentHumidifierDehumidifierState = new HMCharacteristicType("CurrentHumidifierDehumidifierState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentSlatState = new HMCharacteristicType("CurrentSlatState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType WaterLevel = new HMCharacteristicType("WaterLevel");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType FilterChangeIndication = new HMCharacteristicType("FilterChangeIndication");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType FilterLifeLevel = new HMCharacteristicType("FilterLifeLevel");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType FilterResetChangeIndication = new HMCharacteristicType("FilterResetChangeIndication");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType LockPhysicalControls = new HMCharacteristicType("LockPhysicalControls");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType SwingMode = new HMCharacteristicType("SwingMode");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType TargetHeaterCoolerState = new HMCharacteristicType("TargetHeaterCoolerState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType TargetHumidifierDehumidifierState = new HMCharacteristicType("TargetHumidifierDehumidifierState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType TargetFanState = new HMCharacteristicType("TargetFanState");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType SlatType = new HMCharacteristicType("SlatType");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType CurrentTilt = new HMCharacteristicType("CurrentTilt");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType TargetTilt = new HMCharacteristicType("TargetTilt");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType OzoneDensity = new HMCharacteristicType("OzoneDensity");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType NitrogenDioxideDensity = new HMCharacteristicType("NitrogenDioxideDensity");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType SulphurDioxideDensity = new HMCharacteristicType("SulphurDioxideDensity");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType PM2_5Density = new HMCharacteristicType("PM2_5Density");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType PM10Density = new HMCharacteristicType("PM10Density");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType VolatileOrganicCompoundDensity = new HMCharacteristicType("VolatileOrganicCompoundDensity");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType DehumidifierThreshold = new HMCharacteristicType("DehumidifierThreshold");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMCharacteristicType HumidifierThreshold = new HMCharacteristicType("HumidifierThreshold");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HMCharacteristicType ColorTemperature = new HMCharacteristicType("ColorTemperature");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType ProgramMode = new HMCharacteristicType("ProgramMode");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType InUse = new HMCharacteristicType("InUse");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType SetDuration = new HMCharacteristicType("SetDuration");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType RemainingDuration = new HMCharacteristicType("RemainingDuration");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType ValveType = new HMCharacteristicType("ValveType");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMCharacteristicType IsConfigured = new HMCharacteristicType("IsConfigured");
    /*</constants>*/
    
    private static /*<name>*/HMCharacteristicType/*</name>*/[] values = new /*<name>*/HMCharacteristicType/*</name>*/[] {/*<value_list>*/PowerState, Hue, Saturation, Brightness, TemperatureUnits, CurrentTemperature, TargetTemperature, CurrentHeatingCooling, TargetHeatingCooling, CoolingThreshold, HeatingThreshold, CurrentRelativeHumidity, TargetRelativeHumidity, CurrentDoorState, TargetDoorState, ObstructionDetected, Name, Manufacturer, Model, SerialNumber, Identify, RotationDirection, RotationSpeed, OutletInUse, Version, Logs, AudioFeedback, AdminOnlyAccess, SecuritySystemAlarmType, MotionDetected, CurrentLockMechanismState, TargetLockMechanismState, LockMechanismLastKnownAction, LockManagementControlPoint, LockManagementAutoSecureTimeout, AirParticulateDensity, AirParticulateSize, AirQuality, BatteryLevel, CarbonDioxideDetected, CarbonDioxideLevel, CarbonDioxidePeakLevel, CarbonMonoxideDetected, CarbonMonoxideLevel, CarbonMonoxidePeakLevel, ChargingState, ContactState, CurrentHorizontalTilt, CurrentLightLevel, CurrentPosition, CurrentSecuritySystemState, CurrentVerticalTilt, FirmwareVersion, HardwareVersion, HoldPosition, InputEvent, LeakDetected, OccupancyDetected, OutputState, PositionState, SmokeDetected, SoftwareVersion, StatusActive, StatusFault, StatusJammed, StatusLowBattery, StatusTampered, TargetHorizontalTilt, TargetSecuritySystemState, TargetPosition, TargetVerticalTilt, StreamingStatus, SetupStreamEndpoint, SupportedVideoStreamConfiguration, SupportedAudioStreamConfiguration, SupportedRTPConfiguration, SelectedStreamConfiguration, Volume, Mute, NightVision, OpticalZoom, DigitalZoom, ImageRotation, ImageMirroring, LabelNamespace, LabelIndex, Active, CurrentAirPurifierState, TargetAirPurifierState, CurrentFanState, CurrentHeaterCoolerState, CurrentHumidifierDehumidifierState, CurrentSlatState, WaterLevel, FilterChangeIndication, FilterLifeLevel, FilterResetChangeIndication, LockPhysicalControls, SwingMode, TargetHeaterCoolerState, TargetHumidifierDehumidifierState, TargetFanState, SlatType, CurrentTilt, TargetTilt, OzoneDensity, NitrogenDioxideDensity, SulphurDioxideDensity, PM2_5Density, PM10Density, VolatileOrganicCompoundDensity, DehumidifierThreshold, HumidifierThreshold, ColorTemperature, ProgramMode, InUse, SetDuration, RemainingDuration, ValveType, IsConfigured/*</value_list>*/};
    
    /*<name>*/HMCharacteristicType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HMCharacteristicType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HMCharacteristicType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HMCharacteristicType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HomeKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypePowerState", optional=true)
        public static native NSString PowerState();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeHue", optional=true)
        public static native NSString Hue();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSaturation", optional=true)
        public static native NSString Saturation();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeBrightness", optional=true)
        public static native NSString Brightness();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTemperatureUnits", optional=true)
        public static native NSString TemperatureUnits();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentTemperature", optional=true)
        public static native NSString CurrentTemperature();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetTemperature", optional=true)
        public static native NSString TargetTemperature();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentHeatingCooling", optional=true)
        public static native NSString CurrentHeatingCooling();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetHeatingCooling", optional=true)
        public static native NSString TargetHeatingCooling();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCoolingThreshold", optional=true)
        public static native NSString CoolingThreshold();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeHeatingThreshold", optional=true)
        public static native NSString HeatingThreshold();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentRelativeHumidity", optional=true)
        public static native NSString CurrentRelativeHumidity();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetRelativeHumidity", optional=true)
        public static native NSString TargetRelativeHumidity();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentDoorState", optional=true)
        public static native NSString CurrentDoorState();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetDoorState", optional=true)
        public static native NSString TargetDoorState();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeObstructionDetected", optional=true)
        public static native NSString ObstructionDetected();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeName", optional=true)
        public static native NSString Name();
        /**
         * @since Available in iOS 8.0 and later.
         * @deprecated Deprecated in iOS 11.0.
         */
        @Deprecated
        @GlobalValue(symbol="HMCharacteristicTypeManufacturer", optional=true)
        public static native NSString Manufacturer();
        /**
         * @since Available in iOS 8.0 and later.
         * @deprecated Deprecated in iOS 11.0.
         */
        @Deprecated
        @GlobalValue(symbol="HMCharacteristicTypeModel", optional=true)
        public static native NSString Model();
        /**
         * @since Available in iOS 8.0 and later.
         * @deprecated Deprecated in iOS 11.0. No longer supported
         */
        @Deprecated
        @GlobalValue(symbol="HMCharacteristicTypeSerialNumber", optional=true)
        public static native NSString SerialNumber();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeIdentify", optional=true)
        public static native NSString Identify();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeRotationDirection", optional=true)
        public static native NSString RotationDirection();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeRotationSpeed", optional=true)
        public static native NSString RotationSpeed();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeOutletInUse", optional=true)
        public static native NSString OutletInUse();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeVersion", optional=true)
        public static native NSString Version();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLogs", optional=true)
        public static native NSString Logs();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeAudioFeedback", optional=true)
        public static native NSString AudioFeedback();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeAdminOnlyAccess", optional=true)
        public static native NSString AdminOnlyAccess();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSecuritySystemAlarmType", optional=true)
        public static native NSString SecuritySystemAlarmType();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeMotionDetected", optional=true)
        public static native NSString MotionDetected();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentLockMechanismState", optional=true)
        public static native NSString CurrentLockMechanismState();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetLockMechanismState", optional=true)
        public static native NSString TargetLockMechanismState();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLockMechanismLastKnownAction", optional=true)
        public static native NSString LockMechanismLastKnownAction();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLockManagementControlPoint", optional=true)
        public static native NSString LockManagementControlPoint();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLockManagementAutoSecureTimeout", optional=true)
        public static native NSString LockManagementAutoSecureTimeout();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeAirParticulateDensity", optional=true)
        public static native NSString AirParticulateDensity();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeAirParticulateSize", optional=true)
        public static native NSString AirParticulateSize();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeAirQuality", optional=true)
        public static native NSString AirQuality();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeBatteryLevel", optional=true)
        public static native NSString BatteryLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonDioxideDetected", optional=true)
        public static native NSString CarbonDioxideDetected();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonDioxideLevel", optional=true)
        public static native NSString CarbonDioxideLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonDioxidePeakLevel", optional=true)
        public static native NSString CarbonDioxidePeakLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonMonoxideDetected", optional=true)
        public static native NSString CarbonMonoxideDetected();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonMonoxideLevel", optional=true)
        public static native NSString CarbonMonoxideLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCarbonMonoxidePeakLevel", optional=true)
        public static native NSString CarbonMonoxidePeakLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeChargingState", optional=true)
        public static native NSString ChargingState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeContactState", optional=true)
        public static native NSString ContactState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentHorizontalTilt", optional=true)
        public static native NSString CurrentHorizontalTilt();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentLightLevel", optional=true)
        public static native NSString CurrentLightLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentPosition", optional=true)
        public static native NSString CurrentPosition();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentSecuritySystemState", optional=true)
        public static native NSString CurrentSecuritySystemState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentVerticalTilt", optional=true)
        public static native NSString CurrentVerticalTilt();
        /**
         * @since Available in iOS 8.0 and later.
         * @deprecated Deprecated in iOS 11.0.
         */
        @Deprecated
        @GlobalValue(symbol="HMCharacteristicTypeFirmwareVersion", optional=true)
        public static native NSString FirmwareVersion();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeHardwareVersion", optional=true)
        public static native NSString HardwareVersion();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeHoldPosition", optional=true)
        public static native NSString HoldPosition();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeInputEvent", optional=true)
        public static native NSString InputEvent();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLeakDetected", optional=true)
        public static native NSString LeakDetected();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeOccupancyDetected", optional=true)
        public static native NSString OccupancyDetected();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeOutputState", optional=true)
        public static native NSString OutputState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypePositionState", optional=true)
        public static native NSString PositionState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSmokeDetected", optional=true)
        public static native NSString SmokeDetected();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSoftwareVersion", optional=true)
        public static native NSString SoftwareVersion();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStatusActive", optional=true)
        public static native NSString StatusActive();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStatusFault", optional=true)
        public static native NSString StatusFault();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStatusJammed", optional=true)
        public static native NSString StatusJammed();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStatusLowBattery", optional=true)
        public static native NSString StatusLowBattery();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStatusTampered", optional=true)
        public static native NSString StatusTampered();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetHorizontalTilt", optional=true)
        public static native NSString TargetHorizontalTilt();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetSecuritySystemState", optional=true)
        public static native NSString TargetSecuritySystemState();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetPosition", optional=true)
        public static native NSString TargetPosition();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetVerticalTilt", optional=true)
        public static native NSString TargetVerticalTilt();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeStreamingStatus", optional=true)
        public static native NSString StreamingStatus();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSetupStreamEndpoint", optional=true)
        public static native NSString SetupStreamEndpoint();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSupportedVideoStreamConfiguration", optional=true)
        public static native NSString SupportedVideoStreamConfiguration();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSupportedAudioStreamConfiguration", optional=true)
        public static native NSString SupportedAudioStreamConfiguration();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSupportedRTPConfiguration", optional=true)
        public static native NSString SupportedRTPConfiguration();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSelectedStreamConfiguration", optional=true)
        public static native NSString SelectedStreamConfiguration();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeVolume", optional=true)
        public static native NSString Volume();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeMute", optional=true)
        public static native NSString Mute();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeNightVision", optional=true)
        public static native NSString NightVision();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeOpticalZoom", optional=true)
        public static native NSString OpticalZoom();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeDigitalZoom", optional=true)
        public static native NSString DigitalZoom();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeImageRotation", optional=true)
        public static native NSString ImageRotation();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeImageMirroring", optional=true)
        public static native NSString ImageMirroring();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLabelNamespace", optional=true)
        public static native NSString LabelNamespace();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLabelIndex", optional=true)
        public static native NSString LabelIndex();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeActive", optional=true)
        public static native NSString Active();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentAirPurifierState", optional=true)
        public static native NSString CurrentAirPurifierState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetAirPurifierState", optional=true)
        public static native NSString TargetAirPurifierState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentFanState", optional=true)
        public static native NSString CurrentFanState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentHeaterCoolerState", optional=true)
        public static native NSString CurrentHeaterCoolerState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentHumidifierDehumidifierState", optional=true)
        public static native NSString CurrentHumidifierDehumidifierState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentSlatState", optional=true)
        public static native NSString CurrentSlatState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeWaterLevel", optional=true)
        public static native NSString WaterLevel();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeFilterChangeIndication", optional=true)
        public static native NSString FilterChangeIndication();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeFilterLifeLevel", optional=true)
        public static native NSString FilterLifeLevel();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeFilterResetChangeIndication", optional=true)
        public static native NSString FilterResetChangeIndication();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeLockPhysicalControls", optional=true)
        public static native NSString LockPhysicalControls();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSwingMode", optional=true)
        public static native NSString SwingMode();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetHeaterCoolerState", optional=true)
        public static native NSString TargetHeaterCoolerState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetHumidifierDehumidifierState", optional=true)
        public static native NSString TargetHumidifierDehumidifierState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetFanState", optional=true)
        public static native NSString TargetFanState();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSlatType", optional=true)
        public static native NSString SlatType();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeCurrentTilt", optional=true)
        public static native NSString CurrentTilt();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeTargetTilt", optional=true)
        public static native NSString TargetTilt();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeOzoneDensity", optional=true)
        public static native NSString OzoneDensity();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeNitrogenDioxideDensity", optional=true)
        public static native NSString NitrogenDioxideDensity();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSulphurDioxideDensity", optional=true)
        public static native NSString SulphurDioxideDensity();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypePM2_5Density", optional=true)
        public static native NSString PM2_5Density();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypePM10Density", optional=true)
        public static native NSString PM10Density();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeVolatileOrganicCompoundDensity", optional=true)
        public static native NSString VolatileOrganicCompoundDensity();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeDehumidifierThreshold", optional=true)
        public static native NSString DehumidifierThreshold();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeHumidifierThreshold", optional=true)
        public static native NSString HumidifierThreshold();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeColorTemperature", optional=true)
        public static native NSString ColorTemperature();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeProgramMode", optional=true)
        public static native NSString ProgramMode();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeInUse", optional=true)
        public static native NSString InUse();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeSetDuration", optional=true)
        public static native NSString SetDuration();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeRemainingDuration", optional=true)
        public static native NSString RemainingDuration();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeValveType", optional=true)
        public static native NSString ValveType();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMCharacteristicTypeIsConfigured", optional=true)
        public static native NSString IsConfigured();
        /*</values>*/
    }
}
