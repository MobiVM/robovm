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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterThermostat/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterThermostatPtr extends Ptr<MTRClusterThermostat, MTRClusterThermostatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterThermostat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterThermostat() {}
    protected MTRClusterThermostat(Handle h, long handle) { super(h, handle); }
    protected MTRClusterThermostat(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterThermostat(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setpointRaiseLowerWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setpointRaiseLower(MTRThermostatClusterSetpointRaiseLowerParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setWeeklySchedule(MTRThermostatClusterSetWeeklyScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getWeeklySchedule(MTRThermostatClusterGetWeeklyScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRThermostatClusterGetWeeklyScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearWeeklySchedule(MTRThermostatClusterClearWeeklyScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeeklyScheduleWithExpectedValues:expectedValueInterval:completion:")
    public native void clearWeeklySchedule(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocalTemperature(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOutdoorTemperatureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOutdoorTemperature(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupancyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupancy(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAbsMinHeatSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMinHeatSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAbsMaxHeatSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMaxHeatSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAbsMinCoolSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMinCoolSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAbsMaxCoolSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMaxCoolSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePICoolingDemandWithParams:")
    public native NSDictionary<NSString, ?> readAttributePICoolingDemand(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePIHeatingDemandWithParams:")
    public native NSDictionary<NSString, ?> readAttributePIHeatingDemand(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeHVACSystemTypeConfigurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHVACSystemTypeConfiguration(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeHVACSystemTypeConfigurationWithValue:expectedValueInterval:")
    public native void writeAttributeHVACSystemTypeConfiguration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeHVACSystemTypeConfigurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeHVACSystemTypeConfiguration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureCalibrationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocalTemperatureCalibration(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLocalTemperatureCalibrationWithValue:expectedValueInterval:")
    public native void writeAttributeLocalTemperatureCalibration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLocalTemperatureCalibrationWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalTemperatureCalibration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupiedCoolingSetpointWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupiedCoolingSetpoint(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedCoolingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedCoolingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedCoolingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedCoolingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupiedHeatingSetpointWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupiedHeatingSetpoint(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedHeatingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedHeatingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedHeatingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedHeatingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUnoccupiedCoolingSetpointWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnoccupiedCoolingSetpoint(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedCoolingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedCoolingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedCoolingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedCoolingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUnoccupiedHeatingSetpointWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnoccupiedHeatingSetpoint(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedHeatingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedHeatingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedHeatingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedHeatingSetpoint(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinHeatSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinHeatSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinHeatSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMinHeatSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinHeatSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinHeatSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxHeatSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxHeatSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMaxHeatSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMaxHeatSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMaxHeatSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMaxHeatSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinCoolSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinCoolSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinCoolSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMinCoolSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinCoolSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinCoolSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxCoolSetpointLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxCoolSetpointLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMaxCoolSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMaxCoolSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMaxCoolSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMaxCoolSetpointLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinSetpointDeadBandWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinSetpointDeadBand(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinSetpointDeadBandWithValue:expectedValueInterval:")
    public native void writeAttributeMinSetpointDeadBand(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeMinSetpointDeadBandWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinSetpointDeadBand(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRemoteSensingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRemoteSensing(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRemoteSensingWithValue:expectedValueInterval:")
    public native void writeAttributeRemoteSensing(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRemoteSensingWithValue:expectedValueInterval:params:")
    public native void writeAttributeRemoteSensing(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeControlSequenceOfOperationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeControlSequenceOfOperation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeControlSequenceOfOperationWithValue:expectedValueInterval:")
    public native void writeAttributeControlSequenceOfOperation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeControlSequenceOfOperationWithValue:expectedValueInterval:params:")
    public native void writeAttributeControlSequenceOfOperation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSystemModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSystemMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSystemModeWithValue:expectedValueInterval:")
    public native void writeAttributeSystemMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSystemModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeSystemMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeThermostatRunningModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeThermostatRunningMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStartOfWeekWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStartOfWeek(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfWeeklyTransitionsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfWeeklyTransitions(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfDailyTransitionsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfDailyTransitions(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTemperatureSetpointHold(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldWithValue:expectedValueInterval:")
    public native void writeAttributeTemperatureSetpointHold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldWithValue:expectedValueInterval:params:")
    public native void writeAttributeTemperatureSetpointHold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTemperatureSetpointHoldDuration(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldDurationWithValue:expectedValueInterval:")
    public native void writeAttributeTemperatureSetpointHoldDuration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldDurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeTemperatureSetpointHoldDuration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeThermostatProgrammingOperationModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeThermostatProgrammingOperationMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeThermostatProgrammingOperationModeWithValue:expectedValueInterval:")
    public native void writeAttributeThermostatProgrammingOperationMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeThermostatProgrammingOperationModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeThermostatProgrammingOperationMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeThermostatRunningStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeThermostatRunningState(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSetpointChangeSource(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSetpointChangeAmountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSetpointChangeAmount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceTimestampWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSetpointChangeSourceTimestamp(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupiedSetback(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedSetbackWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedSetback(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOccupiedSetbackWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedSetback(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupiedSetbackMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupiedSetbackMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnoccupiedSetback(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedSetbackWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedSetback(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedSetbackWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedSetback(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnoccupiedSetbackMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnoccupiedSetbackMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEmergencyHeatDeltaWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEmergencyHeatDelta(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEmergencyHeatDeltaWithValue:expectedValueInterval:")
    public native void writeAttributeEmergencyHeatDelta(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEmergencyHeatDeltaWithValue:expectedValueInterval:params:")
    public native void writeAttributeEmergencyHeatDelta(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACCapacityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACCapacity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCapacityWithValue:expectedValueInterval:")
    public native void writeAttributeACCapacity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCapacityWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCapacity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACRefrigerantTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACRefrigerantType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACRefrigerantTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACRefrigerantType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACRefrigerantTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACRefrigerantType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACCompressorTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACCompressorType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCompressorTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACCompressorType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCompressorTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCompressorType(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACErrorCodeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACErrorCode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACErrorCodeWithValue:expectedValueInterval:")
    public native void writeAttributeACErrorCode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACErrorCodeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACErrorCode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACLouverPositionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACLouverPosition(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACLouverPositionWithValue:expectedValueInterval:")
    public native void writeAttributeACLouverPosition(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACLouverPositionWithValue:expectedValueInterval:params:")
    public native void writeAttributeACLouverPosition(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACCoilTemperatureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACCoilTemperature(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeACCapacityformatWithParams:")
    public native NSDictionary<NSString, ?> readAttributeACCapacityformat(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCapacityformatWithValue:expectedValueInterval:")
    public native void writeAttributeACCapacityformat(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeACCapacityformatWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCapacityformat(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
