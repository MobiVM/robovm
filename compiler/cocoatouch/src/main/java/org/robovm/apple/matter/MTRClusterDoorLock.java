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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterDoorLock/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterDoorLockPtr extends Ptr<MTRClusterDoorLock, MTRClusterDoorLockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterDoorLock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterDoorLock() {}
    protected MTRClusterDoorLock(Handle h, long handle) { super(h, handle); }
    protected MTRClusterDoorLock(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterDoorLock(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "lockDoorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void lockDoor(MTRDoorLockClusterLockDoorParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "unlockDoorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void unlockDoor(MTRDoorLockClusterUnlockDoorParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "unlockWithTimeoutWithParams:expectedValues:expectedValueInterval:completion:")
    public native void unlockWithTimeout(MTRDoorLockClusterUnlockWithTimeoutParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setWeekDaySchedule(MTRDoorLockClusterSetWeekDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getWeekDaySchedule(MTRDoorLockClusterGetWeekDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterGetWeekDayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearWeekDaySchedule(MTRDoorLockClusterClearWeekDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setYearDaySchedule(MTRDoorLockClusterSetYearDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getYearDaySchedule(MTRDoorLockClusterGetYearDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterGetYearDayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearYearDaySchedule(MTRDoorLockClusterClearYearDayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setHolidaySchedule(MTRDoorLockClusterSetHolidayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getHolidaySchedule(MTRDoorLockClusterGetHolidayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterGetHolidayScheduleResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearHolidaySchedule(MTRDoorLockClusterClearHolidayScheduleParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setUser(MTRDoorLockClusterSetUserParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getUser(MTRDoorLockClusterGetUserParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterGetUserResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearUser(MTRDoorLockClusterClearUserParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setCredentialWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setCredential(MTRDoorLockClusterSetCredentialParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterSetCredentialResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getCredentialStatusWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getCredentialStatus(MTRDoorLockClusterGetCredentialStatusParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRDoorLockClusterGetCredentialStatusResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "clearCredentialWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearCredential(MTRDoorLockClusterClearCredentialParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLockStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLockState(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLockTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLockType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActuatorEnabledWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActuatorEnabled(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDoorStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDoorState(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDoorOpenEventsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDoorOpenEvents(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDoorOpenEventsWithValue:expectedValueInterval:")
    public native void writeAttributeDoorOpenEvents(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDoorOpenEventsWithValue:expectedValueInterval:params:")
    public native void writeAttributeDoorOpenEvents(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDoorClosedEventsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDoorClosedEvents(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDoorClosedEventsWithValue:expectedValueInterval:")
    public native void writeAttributeDoorClosedEvents(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDoorClosedEventsWithValue:expectedValueInterval:params:")
    public native void writeAttributeDoorClosedEvents(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOpenPeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOpenPeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOpenPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeOpenPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOpenPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeOpenPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfTotalUsersSupportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfTotalUsersSupported(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfPINUsersSupportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfPINUsersSupported(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfRFIDUsersSupportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfRFIDUsersSupported(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfWeekDaySchedulesSupportedPerUser(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfYearDaySchedulesSupportedPerUser(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfHolidaySchedulesSupportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfHolidaySchedulesSupported(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxPINCodeLengthWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxPINCodeLength(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinPINCodeLengthWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinPINCodeLength(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxRFIDCodeLengthWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxRFIDCodeLength(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinRFIDCodeLengthWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinRFIDCodeLength(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCredentialRulesSupportWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCredentialRulesSupport(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfCredentialsSupportedPerUserWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfCredentialsSupportedPerUser(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLanguageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLanguage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLanguageWithValue:expectedValueInterval:")
    public native void writeAttributeLanguage(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLanguageWithValue:expectedValueInterval:params:")
    public native void writeAttributeLanguage(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLEDSettingsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLEDSettings(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLEDSettingsWithValue:expectedValueInterval:")
    public native void writeAttributeLEDSettings(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLEDSettingsWithValue:expectedValueInterval:params:")
    public native void writeAttributeLEDSettings(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAutoRelockTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAutoRelockTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAutoRelockTimeWithValue:expectedValueInterval:")
    public native void writeAttributeAutoRelockTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAutoRelockTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeAutoRelockTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSoundVolumeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSoundVolume(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSoundVolumeWithValue:expectedValueInterval:")
    public native void writeAttributeSoundVolume(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSoundVolumeWithValue:expectedValueInterval:params:")
    public native void writeAttributeSoundVolume(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOperatingModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOperatingMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOperatingModeWithValue:expectedValueInterval:")
    public native void writeAttributeOperatingMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOperatingModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOperatingMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSupportedOperatingModesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportedOperatingModes(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDefaultConfigurationRegisterWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDefaultConfigurationRegister(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnableLocalProgrammingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnableLocalProgramming(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableLocalProgrammingWithValue:expectedValueInterval:")
    public native void writeAttributeEnableLocalProgramming(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableLocalProgrammingWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableLocalProgramming(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnableOneTouchLockingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnableOneTouchLocking(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableOneTouchLockingWithValue:expectedValueInterval:")
    public native void writeAttributeEnableOneTouchLocking(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableOneTouchLockingWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableOneTouchLocking(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnableInsideStatusLEDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnableInsideStatusLED(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableInsideStatusLEDWithValue:expectedValueInterval:")
    public native void writeAttributeEnableInsideStatusLED(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnableInsideStatusLEDWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableInsideStatusLED(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnablePrivacyModeButtonWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnablePrivacyModeButton(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnablePrivacyModeButtonWithValue:expectedValueInterval:")
    public native void writeAttributeEnablePrivacyModeButton(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeEnablePrivacyModeButtonWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnablePrivacyModeButton(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLocalProgrammingFeaturesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocalProgrammingFeatures(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLocalProgrammingFeaturesWithValue:expectedValueInterval:")
    public native void writeAttributeLocalProgrammingFeatures(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLocalProgrammingFeaturesWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalProgrammingFeatures(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWrongCodeEntryLimitWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWrongCodeEntryLimit(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWrongCodeEntryLimitWithValue:expectedValueInterval:")
    public native void writeAttributeWrongCodeEntryLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWrongCodeEntryLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeWrongCodeEntryLimit(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUserCodeTemporaryDisableTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUserCodeTemporaryDisableTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUserCodeTemporaryDisableTimeWithValue:expectedValueInterval:")
    public native void writeAttributeUserCodeTemporaryDisableTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUserCodeTemporaryDisableTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeUserCodeTemporaryDisableTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSendPINOverTheAirWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSendPINOverTheAir(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSendPINOverTheAirWithValue:expectedValueInterval:")
    public native void writeAttributeSendPINOverTheAir(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSendPINOverTheAirWithValue:expectedValueInterval:params:")
    public native void writeAttributeSendPINOverTheAir(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRequirePINforRemoteOperationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRequirePINforRemoteOperation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRequirePINforRemoteOperationWithValue:expectedValueInterval:")
    public native void writeAttributeRequirePINforRemoteOperation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRequirePINforRemoteOperationWithValue:expectedValueInterval:params:")
    public native void writeAttributeRequirePINforRemoteOperation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeExpiringUserTimeoutWithParams:")
    public native NSDictionary<NSString, ?> readAttributeExpiringUserTimeout(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeExpiringUserTimeoutWithValue:expectedValueInterval:")
    public native void writeAttributeExpiringUserTimeout(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeExpiringUserTimeoutWithValue:expectedValueInterval:params:")
    public native void writeAttributeExpiringUserTimeout(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
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
