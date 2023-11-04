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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterDoorLock/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterDoorLockPtr extends Ptr<MTRBaseClusterDoorLock, MTRBaseClusterDoorLockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterDoorLock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterDoorLock() {}
    protected MTRBaseClusterDoorLock(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterDoorLock(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterDoorLock(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "lockDoorWithParams:completion:")
    public native void lockDoor(MTRDoorLockClusterLockDoorParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "unlockDoorWithParams:completion:")
    public native void unlockDoor(MTRDoorLockClusterUnlockDoorParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "unlockWithTimeoutWithParams:completion:")
    public native void unlockWithTimeout(MTRDoorLockClusterUnlockWithTimeoutParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setWeekDayScheduleWithParams:completion:")
    public native void setWeekDaySchedule(MTRDoorLockClusterSetWeekDayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getWeekDayScheduleWithParams:completion:")
    public native void getWeekDaySchedule(MTRDoorLockClusterGetWeekDayScheduleParams params, @Block VoidBlock2<MTRDoorLockClusterGetWeekDayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeekDayScheduleWithParams:completion:")
    public native void clearWeekDaySchedule(MTRDoorLockClusterClearWeekDayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setYearDayScheduleWithParams:completion:")
    public native void setYearDaySchedule(MTRDoorLockClusterSetYearDayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getYearDayScheduleWithParams:completion:")
    public native void getYearDaySchedule(MTRDoorLockClusterGetYearDayScheduleParams params, @Block VoidBlock2<MTRDoorLockClusterGetYearDayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearYearDayScheduleWithParams:completion:")
    public native void clearYearDaySchedule(MTRDoorLockClusterClearYearDayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setHolidayScheduleWithParams:completion:")
    public native void setHolidaySchedule(MTRDoorLockClusterSetHolidayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getHolidayScheduleWithParams:completion:")
    public native void getHolidaySchedule(MTRDoorLockClusterGetHolidayScheduleParams params, @Block VoidBlock2<MTRDoorLockClusterGetHolidayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearHolidayScheduleWithParams:completion:")
    public native void clearHolidaySchedule(MTRDoorLockClusterClearHolidayScheduleParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setUserWithParams:completion:")
    public native void setUser(MTRDoorLockClusterSetUserParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getUserWithParams:completion:")
    public native void getUser(MTRDoorLockClusterGetUserParams params, @Block VoidBlock2<MTRDoorLockClusterGetUserResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearUserWithParams:completion:")
    public native void clearUser(MTRDoorLockClusterClearUserParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setCredentialWithParams:completion:")
    public native void setCredential(MTRDoorLockClusterSetCredentialParams params, @Block VoidBlock2<MTRDoorLockClusterSetCredentialResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getCredentialStatusWithParams:completion:")
    public native void getCredentialStatus(MTRDoorLockClusterGetCredentialStatusParams params, @Block VoidBlock2<MTRDoorLockClusterGetCredentialStatusResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearCredentialWithParams:completion:")
    public native void clearCredential(MTRDoorLockClusterClearCredentialParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLockStateWithCompletion:")
    public native void readAttributeLockState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLockStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLockTypeWithCompletion:")
    public native void readAttributeLockType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLockTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActuatorEnabledWithCompletion:")
    public native void readAttributeActuatorEnabled(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeActuatorEnabledWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActuatorEnabled(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorStateWithCompletion:")
    public native void readAttributeDoorState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDoorStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorOpenEventsWithCompletion:")
    public native void readAttributeDoorOpenEvents(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeDoorOpenEventsWithValue:completion:")
    public native void writeAttributeDoorOpenEvents(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeDoorOpenEventsWithValue:params:completion:")
    public native void writeAttributeDoorOpenEvents(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDoorOpenEventsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorOpenEvents(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorClosedEventsWithCompletion:")
    public native void readAttributeDoorClosedEvents(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeDoorClosedEventsWithValue:completion:")
    public native void writeAttributeDoorClosedEvents(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeDoorClosedEventsWithValue:params:completion:")
    public native void writeAttributeDoorClosedEvents(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDoorClosedEventsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorClosedEvents(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOpenPeriodWithCompletion:")
    public native void readAttributeOpenPeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOpenPeriodWithValue:completion:")
    public native void writeAttributeOpenPeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOpenPeriodWithValue:params:completion:")
    public native void writeAttributeOpenPeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOpenPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOpenPeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfTotalUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfTotalUsersSupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfTotalUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfTotalUsersSupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfPINUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfPINUsersSupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfPINUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPINUsersSupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfRFIDUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfRFIDUsersSupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfRFIDUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfRFIDUsersSupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfWeekDaySchedulesSupportedPerUser(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUser(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfYearDaySchedulesSupportedPerUser(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfYearDaySchedulesSupportedPerUser(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfHolidaySchedulesSupportedWithCompletion:")
    public native void readAttributeNumberOfHolidaySchedulesSupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfHolidaySchedulesSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfHolidaySchedulesSupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxPINCodeLengthWithCompletion:")
    public native void readAttributeMaxPINCodeLength(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxPINCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxPINCodeLength(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinPINCodeLengthWithCompletion:")
    public native void readAttributeMinPINCodeLength(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinPINCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinPINCodeLength(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxRFIDCodeLengthWithCompletion:")
    public native void readAttributeMaxRFIDCodeLength(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxRFIDCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxRFIDCodeLength(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinRFIDCodeLengthWithCompletion:")
    public native void readAttributeMinRFIDCodeLength(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinRFIDCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinRFIDCodeLength(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCredentialRulesSupportWithCompletion:")
    public native void readAttributeCredentialRulesSupport(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCredentialRulesSupportWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCredentialRulesSupport(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfCredentialsSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfCredentialsSupportedPerUser(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfCredentialsSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfCredentialsSupportedPerUser(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLanguageWithCompletion:")
    public native void readAttributeLanguage(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLanguageWithValue:completion:")
    public native void writeAttributeLanguage(String value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLanguageWithValue:params:completion:")
    public native void writeAttributeLanguage(String value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLanguageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLanguage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLEDSettingsWithCompletion:")
    public native void readAttributeLEDSettings(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLEDSettingsWithValue:completion:")
    public native void writeAttributeLEDSettings(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLEDSettingsWithValue:params:completion:")
    public native void writeAttributeLEDSettings(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLEDSettingsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLEDSettings(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAutoRelockTimeWithCompletion:")
    public native void readAttributeAutoRelockTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeAutoRelockTimeWithValue:completion:")
    public native void writeAttributeAutoRelockTime(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeAutoRelockTimeWithValue:params:completion:")
    public native void writeAttributeAutoRelockTime(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAutoRelockTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAutoRelockTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSoundVolumeWithCompletion:")
    public native void readAttributeSoundVolume(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSoundVolumeWithValue:completion:")
    public native void writeAttributeSoundVolume(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSoundVolumeWithValue:params:completion:")
    public native void writeAttributeSoundVolume(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSoundVolumeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSoundVolume(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperatingModeWithCompletion:")
    public native void readAttributeOperatingMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOperatingModeWithValue:completion:")
    public native void writeAttributeOperatingMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOperatingModeWithValue:params:completion:")
    public native void writeAttributeOperatingMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOperatingModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperatingMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSupportedOperatingModesWithCompletion:")
    public native void readAttributeSupportedOperatingModes(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSupportedOperatingModesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupportedOperatingModes(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDefaultConfigurationRegisterWithCompletion:")
    public native void readAttributeDefaultConfigurationRegister(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDefaultConfigurationRegisterWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDefaultConfigurationRegister(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableLocalProgrammingWithCompletion:")
    public native void readAttributeEnableLocalProgramming(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableLocalProgrammingWithValue:completion:")
    public native void writeAttributeEnableLocalProgramming(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableLocalProgrammingWithValue:params:completion:")
    public native void writeAttributeEnableLocalProgramming(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnableLocalProgrammingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableLocalProgramming(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableOneTouchLockingWithCompletion:")
    public native void readAttributeEnableOneTouchLocking(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableOneTouchLockingWithValue:completion:")
    public native void writeAttributeEnableOneTouchLocking(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableOneTouchLockingWithValue:params:completion:")
    public native void writeAttributeEnableOneTouchLocking(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnableOneTouchLockingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableOneTouchLocking(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableInsideStatusLEDWithCompletion:")
    public native void readAttributeEnableInsideStatusLED(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableInsideStatusLEDWithValue:completion:")
    public native void writeAttributeEnableInsideStatusLED(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnableInsideStatusLEDWithValue:params:completion:")
    public native void writeAttributeEnableInsideStatusLED(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnableInsideStatusLEDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableInsideStatusLED(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnablePrivacyModeButtonWithCompletion:")
    public native void readAttributeEnablePrivacyModeButton(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnablePrivacyModeButtonWithValue:completion:")
    public native void writeAttributeEnablePrivacyModeButton(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnablePrivacyModeButtonWithValue:params:completion:")
    public native void writeAttributeEnablePrivacyModeButton(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnablePrivacyModeButtonWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnablePrivacyModeButton(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalProgrammingFeaturesWithCompletion:")
    public native void readAttributeLocalProgrammingFeatures(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalProgrammingFeaturesWithValue:completion:")
    public native void writeAttributeLocalProgrammingFeatures(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalProgrammingFeaturesWithValue:params:completion:")
    public native void writeAttributeLocalProgrammingFeatures(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLocalProgrammingFeaturesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalProgrammingFeatures(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWrongCodeEntryLimitWithCompletion:")
    public native void readAttributeWrongCodeEntryLimit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWrongCodeEntryLimitWithValue:completion:")
    public native void writeAttributeWrongCodeEntryLimit(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWrongCodeEntryLimitWithValue:params:completion:")
    public native void writeAttributeWrongCodeEntryLimit(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWrongCodeEntryLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWrongCodeEntryLimit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUserCodeTemporaryDisableTimeWithCompletion:")
    public native void readAttributeUserCodeTemporaryDisableTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUserCodeTemporaryDisableTimeWithValue:completion:")
    public native void writeAttributeUserCodeTemporaryDisableTime(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUserCodeTemporaryDisableTimeWithValue:params:completion:")
    public native void writeAttributeUserCodeTemporaryDisableTime(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUserCodeTemporaryDisableTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserCodeTemporaryDisableTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSendPINOverTheAirWithCompletion:")
    public native void readAttributeSendPINOverTheAir(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSendPINOverTheAirWithValue:completion:")
    public native void writeAttributeSendPINOverTheAir(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeSendPINOverTheAirWithValue:params:completion:")
    public native void writeAttributeSendPINOverTheAir(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSendPINOverTheAirWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSendPINOverTheAir(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRequirePINforRemoteOperationWithCompletion:")
    public native void readAttributeRequirePINforRemoteOperation(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRequirePINforRemoteOperationWithValue:completion:")
    public native void writeAttributeRequirePINforRemoteOperation(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRequirePINforRemoteOperationWithValue:params:completion:")
    public native void writeAttributeRequirePINforRemoteOperation(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRequirePINforRemoteOperationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRequirePINforRemoteOperation(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeExpiringUserTimeoutWithCompletion:")
    public native void readAttributeExpiringUserTimeout(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeExpiringUserTimeoutWithValue:completion:")
    public native void writeAttributeExpiringUserTimeout(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeExpiringUserTimeoutWithValue:params:completion:")
    public native void writeAttributeExpiringUserTimeout(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeExpiringUserTimeoutWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExpiringUserTimeout(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeLockStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLockState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLockTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLockType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActuatorEnabledWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActuatorEnabled(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorOpenEventsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorOpenEvents(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDoorClosedEventsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorClosedEvents(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOpenPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOpenPeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfTotalUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfTotalUsersSupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfPINUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfPINUsersSupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfRFIDUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfRFIDUsersSupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfWeekDaySchedulesSupportedPerUser(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfYearDaySchedulesSupportedPerUser(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfHolidaySchedulesSupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxPINCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxPINCodeLength(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinPINCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinPINCodeLength(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxRFIDCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxRFIDCodeLength(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinRFIDCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinRFIDCodeLength(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCredentialRulesSupportWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCredentialRulesSupport(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfCredentialsSupportedPerUser(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLanguageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLanguage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLEDSettingsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLEDSettings(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAutoRelockTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAutoRelockTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSoundVolumeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSoundVolume(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperatingModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperatingMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSupportedOperatingModesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupportedOperatingModes(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDefaultConfigurationRegisterWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDefaultConfigurationRegister(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableLocalProgrammingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableLocalProgramming(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableOneTouchLockingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableOneTouchLocking(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnableInsideStatusLEDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableInsideStatusLED(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnablePrivacyModeButtonWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnablePrivacyModeButton(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalProgrammingFeaturesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalProgrammingFeatures(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWrongCodeEntryLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWrongCodeEntryLimit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUserCodeTemporaryDisableTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserCodeTemporaryDisableTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSendPINOverTheAirWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSendPINOverTheAir(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRequirePINforRemoteOperationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRequirePINforRemoteOperation(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeExpiringUserTimeoutWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExpiringUserTimeout(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
