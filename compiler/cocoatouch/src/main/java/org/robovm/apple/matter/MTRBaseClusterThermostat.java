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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterThermostat/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterThermostatPtr extends Ptr<MTRBaseClusterThermostat, MTRBaseClusterThermostatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterThermostat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterThermostat() {}
    protected MTRBaseClusterThermostat(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterThermostat(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterThermostat(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setpointRaiseLowerWithParams:completion:")
    public native void setpointRaiseLower(MTRThermostatClusterSetpointRaiseLowerParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setWeeklyScheduleWithParams:completion:")
    public native void setWeeklySchedule(MTRThermostatClusterSetWeeklyScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getWeeklyScheduleWithParams:completion:")
    public native void getWeeklySchedule(MTRThermostatClusterGetWeeklyScheduleParams params, @Block VoidBlock2<MTRThermostatClusterGetWeeklyScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeeklyScheduleWithParams:completion:")
    public native void clearWeeklySchedule(MTRThermostatClusterClearWeeklyScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeeklyScheduleWithCompletion:")
    public native void clearWeeklySchedule(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureWithCompletion:")
    public native void readAttributeLocalTemperature(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLocalTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperature(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOutdoorTemperatureWithCompletion:")
    public native void readAttributeOutdoorTemperature(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOutdoorTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOutdoorTemperature(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancyWithCompletion:")
    public native void readAttributeOccupancy(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupancyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMinHeatSetpointLimitWithCompletion:")
    public native void readAttributeAbsMinHeatSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAbsMinHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinHeatSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMaxHeatSetpointLimitWithCompletion:")
    public native void readAttributeAbsMaxHeatSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAbsMaxHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxHeatSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMinCoolSetpointLimitWithCompletion:")
    public native void readAttributeAbsMinCoolSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAbsMinCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinCoolSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMaxCoolSetpointLimitWithCompletion:")
    public native void readAttributeAbsMaxCoolSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAbsMaxCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxCoolSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePICoolingDemandWithCompletion:")
    public native void readAttributePICoolingDemand(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePICoolingDemandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePICoolingDemand(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIHeatingDemandWithCompletion:")
    public native void readAttributePIHeatingDemand(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePIHeatingDemandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIHeatingDemand(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeHVACSystemTypeConfigurationWithCompletion:")
    public native void readAttributeHVACSystemTypeConfiguration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeHVACSystemTypeConfigurationWithValue:completion:")
    public native void writeAttributeHVACSystemTypeConfiguration(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeHVACSystemTypeConfigurationWithValue:params:completion:")
    public native void writeAttributeHVACSystemTypeConfiguration(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeHVACSystemTypeConfigurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHVACSystemTypeConfiguration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureCalibrationWithCompletion:")
    public native void readAttributeLocalTemperatureCalibration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalTemperatureCalibrationWithValue:completion:")
    public native void writeAttributeLocalTemperatureCalibration(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalTemperatureCalibrationWithValue:params:completion:")
    public native void writeAttributeLocalTemperatureCalibration(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLocalTemperatureCalibrationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperatureCalibration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedCoolingSetpointWithCompletion:")
    public native void readAttributeOccupiedCoolingSetpoint(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedCoolingSetpointWithValue:completion:")
    public native void writeAttributeOccupiedCoolingSetpoint(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedCoolingSetpointWithValue:params:completion:")
    public native void writeAttributeOccupiedCoolingSetpoint(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupiedCoolingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedCoolingSetpoint(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedHeatingSetpointWithCompletion:")
    public native void readAttributeOccupiedHeatingSetpoint(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedHeatingSetpointWithValue:completion:")
    public native void writeAttributeOccupiedHeatingSetpoint(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedHeatingSetpointWithValue:params:completion:")
    public native void writeAttributeOccupiedHeatingSetpoint(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupiedHeatingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedHeatingSetpoint(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedCoolingSetpointWithCompletion:")
    public native void readAttributeUnoccupiedCoolingSetpoint(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedCoolingSetpointWithValue:completion:")
    public native void writeAttributeUnoccupiedCoolingSetpoint(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedCoolingSetpointWithValue:params:completion:")
    public native void writeAttributeUnoccupiedCoolingSetpoint(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnoccupiedCoolingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedCoolingSetpoint(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedHeatingSetpointWithCompletion:")
    public native void readAttributeUnoccupiedHeatingSetpoint(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedHeatingSetpointWithValue:completion:")
    public native void writeAttributeUnoccupiedHeatingSetpoint(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedHeatingSetpointWithValue:params:completion:")
    public native void writeAttributeUnoccupiedHeatingSetpoint(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnoccupiedHeatingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedHeatingSetpoint(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinHeatSetpointLimitWithCompletion:")
    public native void readAttributeMinHeatSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinHeatSetpointLimitWithValue:completion:")
    public native void writeAttributeMinHeatSetpointLimit(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinHeatSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMinHeatSetpointLimit(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinHeatSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxHeatSetpointLimitWithCompletion:")
    public native void readAttributeMaxHeatSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMaxHeatSetpointLimitWithValue:completion:")
    public native void writeAttributeMaxHeatSetpointLimit(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMaxHeatSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMaxHeatSetpointLimit(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxHeatSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinCoolSetpointLimitWithCompletion:")
    public native void readAttributeMinCoolSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinCoolSetpointLimitWithValue:completion:")
    public native void writeAttributeMinCoolSetpointLimit(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinCoolSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMinCoolSetpointLimit(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinCoolSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxCoolSetpointLimitWithCompletion:")
    public native void readAttributeMaxCoolSetpointLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMaxCoolSetpointLimitWithValue:completion:")
    public native void writeAttributeMaxCoolSetpointLimit(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMaxCoolSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMaxCoolSetpointLimit(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxCoolSetpointLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinSetpointDeadBandWithCompletion:")
    public native void readAttributeMinSetpointDeadBand(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinSetpointDeadBandWithValue:completion:")
    public native void writeAttributeMinSetpointDeadBand(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeMinSetpointDeadBandWithValue:params:completion:")
    public native void writeAttributeMinSetpointDeadBand(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinSetpointDeadBandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinSetpointDeadBand(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRemoteSensingWithCompletion:")
    public native void readAttributeRemoteSensing(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRemoteSensingWithValue:completion:")
    public native void writeAttributeRemoteSensing(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRemoteSensingWithValue:params:completion:")
    public native void writeAttributeRemoteSensing(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRemoteSensingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemoteSensing(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeControlSequenceOfOperationWithCompletion:")
    public native void readAttributeControlSequenceOfOperation(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeControlSequenceOfOperationWithValue:completion:")
    public native void writeAttributeControlSequenceOfOperation(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeControlSequenceOfOperationWithValue:params:completion:")
    public native void writeAttributeControlSequenceOfOperation(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeControlSequenceOfOperationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeControlSequenceOfOperation(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSystemModeWithCompletion:")
    public native void readAttributeSystemMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSystemModeWithValue:completion:")
    public native void writeAttributeSystemMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSystemModeWithValue:params:completion:")
    public native void writeAttributeSystemMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSystemModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSystemMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatRunningModeWithCompletion:")
    public native void readAttributeThermostatRunningMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeThermostatRunningModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStartOfWeekWithCompletion:")
    public native void readAttributeStartOfWeek(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeStartOfWeekWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartOfWeek(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfWeeklyTransitionsWithCompletion:")
    public native void readAttributeNumberOfWeeklyTransitions(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfWeeklyTransitionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeeklyTransitions(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfDailyTransitionsWithCompletion:")
    public native void readAttributeNumberOfDailyTransitions(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfDailyTransitionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfDailyTransitions(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldWithCompletion:")
    public native void readAttributeTemperatureSetpointHold(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldWithValue:completion:")
    public native void writeAttributeTemperatureSetpointHold(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldWithValue:params:completion:")
    public native void writeAttributeTemperatureSetpointHold(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTemperatureSetpointHoldWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHold(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldDurationWithCompletion:")
    public native void readAttributeTemperatureSetpointHoldDuration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldDurationWithValue:completion:")
    public native void writeAttributeTemperatureSetpointHoldDuration(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTemperatureSetpointHoldDurationWithValue:params:completion:")
    public native void writeAttributeTemperatureSetpointHoldDuration(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTemperatureSetpointHoldDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHoldDuration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatProgrammingOperationModeWithCompletion:")
    public native void readAttributeThermostatProgrammingOperationMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeThermostatProgrammingOperationModeWithValue:completion:")
    public native void writeAttributeThermostatProgrammingOperationMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeThermostatProgrammingOperationModeWithValue:params:completion:")
    public native void writeAttributeThermostatProgrammingOperationMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeThermostatProgrammingOperationModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatProgrammingOperationMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatRunningStateWithCompletion:")
    public native void readAttributeThermostatRunningState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeThermostatRunningStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceWithCompletion:")
    public native void readAttributeSetpointChangeSource(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSetpointChangeSourceWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSource(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeAmountWithCompletion:")
    public native void readAttributeSetpointChangeAmount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSetpointChangeAmountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeAmount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceTimestampWithCompletion:")
    public native void readAttributeSetpointChangeSourceTimestamp(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSetpointChangeSourceTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSourceTimestamp(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackWithCompletion:")
    public native void readAttributeOccupiedSetback(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedSetbackWithValue:completion:")
    public native void writeAttributeOccupiedSetback(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOccupiedSetbackWithValue:params:completion:")
    public native void writeAttributeOccupiedSetback(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupiedSetbackWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetback(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMinWithCompletion:")
    public native void readAttributeOccupiedSetbackMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupiedSetbackMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMaxWithCompletion:")
    public native void readAttributeOccupiedSetbackMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupiedSetbackMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackWithCompletion:")
    public native void readAttributeUnoccupiedSetback(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedSetbackWithValue:completion:")
    public native void writeAttributeUnoccupiedSetback(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnoccupiedSetbackWithValue:params:completion:")
    public native void writeAttributeUnoccupiedSetback(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnoccupiedSetbackWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetback(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMinWithCompletion:")
    public native void readAttributeUnoccupiedSetbackMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnoccupiedSetbackMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMaxWithCompletion:")
    public native void readAttributeUnoccupiedSetbackMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnoccupiedSetbackMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEmergencyHeatDeltaWithCompletion:")
    public native void readAttributeEmergencyHeatDelta(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEmergencyHeatDeltaWithValue:completion:")
    public native void writeAttributeEmergencyHeatDelta(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEmergencyHeatDeltaWithValue:params:completion:")
    public native void writeAttributeEmergencyHeatDelta(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEmergencyHeatDeltaWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEmergencyHeatDelta(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACTypeWithCompletion:")
    public native void readAttributeACType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACTypeWithValue:completion:")
    public native void writeAttributeACType(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACTypeWithValue:params:completion:")
    public native void writeAttributeACType(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCapacityWithCompletion:")
    public native void readAttributeACCapacity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCapacityWithValue:completion:")
    public native void writeAttributeACCapacity(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCapacityWithValue:params:completion:")
    public native void writeAttributeACCapacity(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACCapacityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACRefrigerantTypeWithCompletion:")
    public native void readAttributeACRefrigerantType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACRefrigerantTypeWithValue:completion:")
    public native void writeAttributeACRefrigerantType(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACRefrigerantTypeWithValue:params:completion:")
    public native void writeAttributeACRefrigerantType(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACRefrigerantTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACRefrigerantType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCompressorTypeWithCompletion:")
    public native void readAttributeACCompressorType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCompressorTypeWithValue:completion:")
    public native void writeAttributeACCompressorType(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCompressorTypeWithValue:params:completion:")
    public native void writeAttributeACCompressorType(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACCompressorTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCompressorType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACErrorCodeWithCompletion:")
    public native void readAttributeACErrorCode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACErrorCodeWithValue:completion:")
    public native void writeAttributeACErrorCode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACErrorCodeWithValue:params:completion:")
    public native void writeAttributeACErrorCode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACErrorCodeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACErrorCode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACLouverPositionWithCompletion:")
    public native void readAttributeACLouverPosition(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACLouverPositionWithValue:completion:")
    public native void writeAttributeACLouverPosition(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACLouverPositionWithValue:params:completion:")
    public native void writeAttributeACLouverPosition(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACLouverPositionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACLouverPosition(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCoilTemperatureWithCompletion:")
    public native void readAttributeACCoilTemperature(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACCoilTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCoilTemperature(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCapacityformatWithCompletion:")
    public native void readAttributeACCapacityformat(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCapacityformatWithValue:completion:")
    public native void writeAttributeACCapacityformat(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeACCapacityformatWithValue:params:completion:")
    public native void writeAttributeACCapacityformat(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeACCapacityformatWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacityformat(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalTemperature(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOutdoorTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOutdoorTemperature(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMinHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMinHeatSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMaxHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMaxHeatSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMinCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMinCoolSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAbsMaxCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMaxCoolSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePICoolingDemandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePICoolingDemand(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIHeatingDemandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIHeatingDemand(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeHVACSystemTypeConfigurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHVACSystemTypeConfiguration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalTemperatureCalibrationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalTemperatureCalibration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedCoolingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedCoolingSetpoint(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedHeatingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedHeatingSetpoint(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedCoolingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedCoolingSetpoint(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedHeatingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedHeatingSetpoint(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinHeatSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxHeatSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinCoolSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxCoolSetpointLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinSetpointDeadBandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinSetpointDeadBand(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRemoteSensingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRemoteSensing(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeControlSequenceOfOperationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeControlSequenceOfOperation(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSystemModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSystemMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatRunningModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatRunningMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStartOfWeekWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStartOfWeek(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfWeeklyTransitionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfWeeklyTransitions(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfDailyTransitionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfDailyTransitions(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTemperatureSetpointHold(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTemperatureSetpointHoldDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTemperatureSetpointHoldDuration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatProgrammingOperationModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatProgrammingOperationMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeThermostatRunningStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatRunningState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeSource(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeAmountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeAmount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSetpointChangeSourceTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeSourceTimestamp(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetback(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetbackMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupiedSetbackMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetbackMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetback(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetbackMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnoccupiedSetbackMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetbackMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEmergencyHeatDeltaWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEmergencyHeatDelta(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCapacityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCapacity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACRefrigerantTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACRefrigerantType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCompressorTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCompressorType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACErrorCodeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACErrorCode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACLouverPositionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACLouverPosition(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCoilTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCoilTemperature(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeACCapacityformatWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCapacityformat(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /*</methods>*/
}
