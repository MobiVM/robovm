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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterElectricalMeasurement/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterElectricalMeasurementPtr extends Ptr<MTRClusterElectricalMeasurement, MTRClusterElectricalMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterElectricalMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterElectricalMeasurement() {}
    protected MTRClusterElectricalMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRClusterElectricalMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterElectricalMeasurement(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "getProfileInfoCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getProfileInfoCommand(MTRElectricalMeasurementClusterGetProfileInfoCommandParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getProfileInfoCommandWithExpectedValues:expectedValueInterval:completion:")
    public native void getProfileInfoCommand(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "getMeasurementProfileCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getMeasurementProfileCommand(MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasurementTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasurementType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcVoltageMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcVoltageMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcVoltageMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcVoltageMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcCurrentMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcCurrentMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcCurrentMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcCurrentMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcPower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcPowerMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcPowerMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcPowerMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcPowerMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcVoltageMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcVoltageMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcVoltageDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcVoltageDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcCurrentMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcCurrentMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcCurrentDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcCurrentDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcPowerMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcPowerMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDcPowerDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDcPowerDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcFrequency(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcFrequencyMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcFrequencyMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcFrequencyMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcFrequencyMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNeutralCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNeutralCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTotalActivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTotalActivePower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTotalReactivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTotalReactivePower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTotalApparentPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTotalApparentPower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured1stHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured1stHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured3rdHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured3rdHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured5thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured5thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured7thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured7thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured9thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured9thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasured11thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasured11thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase1stHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase1stHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase3rdHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase3rdHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase5thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase5thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase7thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase7thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase9thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase9thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeasuredPhase11thHarmonicCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeasuredPhase11thHarmonicCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcFrequencyMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcFrequencyMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcFrequencyDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcFrequencyDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeHarmonicCurrentMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHarmonicCurrentMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhaseHarmonicCurrentMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhaseHarmonicCurrentMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstantaneousVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstantaneousVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstantaneousLineCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstantaneousLineCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstantaneousActiveCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstantaneousActiveCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstantaneousReactiveCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstantaneousReactiveCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstantaneousPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstantaneousPower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMinWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMin(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeReactivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactivePower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeApparentPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApparentPower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerFactorWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerFactor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsVoltageMeasurementPeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsUnderVoltageCounter(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAverageRmsUnderVoltageCounterWithValue:expectedValueInterval:")
    public native void writeAttributeAverageRmsUnderVoltageCounter(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAverageRmsUnderVoltageCounterWithValue:expectedValueInterval:params:")
    public native void writeAttributeAverageRmsUnderVoltageCounter(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeOverVoltagePeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsExtremeOverVoltagePeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsExtremeOverVoltagePeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsExtremeOverVoltagePeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsExtremeOverVoltagePeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeUnderVoltagePeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsExtremeUnderVoltagePeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsExtremeUnderVoltagePeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSagPeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSagPeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsVoltageSagPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsVoltageSagPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsVoltageSagPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsVoltageSagPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSwellPeriodWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSwellPeriod(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsVoltageSwellPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsVoltageSwellPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRmsVoltageSwellPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsVoltageSwellPeriod(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcVoltageMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcVoltageMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcVoltageDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcVoltageDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcCurrentMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcCurrentMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcCurrentDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcCurrentDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcPowerMultiplierWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcPowerMultiplier(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcPowerDivisorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcPowerDivisor(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOverloadAlarmsMaskWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOverloadAlarmsMask(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOverloadAlarmsMaskWithValue:expectedValueInterval:")
    public native void writeAttributeOverloadAlarmsMask(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOverloadAlarmsMaskWithValue:expectedValueInterval:params:")
    public native void writeAttributeOverloadAlarmsMask(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeVoltageOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeVoltageOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcOverloadAlarmsMaskWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcOverloadAlarmsMask(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAcOverloadAlarmsMaskWithValue:expectedValueInterval:")
    public native void writeAttributeAcOverloadAlarmsMask(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeAcOverloadAlarmsMaskWithValue:expectedValueInterval:params:")
    public native void writeAttributeAcOverloadAlarmsMask(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcVoltageOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcVoltageOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcCurrentOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcCurrentOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcActivePowerOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcActivePowerOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcReactivePowerOverloadWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcReactivePowerOverload(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsOverVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsOverVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsUnderVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsUnderVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeOverVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeOverVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeUnderVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeUnderVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSagWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSag(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSwellWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSwell(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLineCurrentPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLineCurrentPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveCurrentPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveCurrentPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeReactiveCurrentPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactiveCurrentPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltagePhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltagePhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMinPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMinPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMaxPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMaxPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMinPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMinPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMaxPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMaxPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMinPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMinPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMaxPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMaxPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeReactivePowerPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactivePowerPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeApparentPowerPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApparentPowerPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerFactorPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerFactorPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsVoltageMeasurementPeriodPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsOverVoltageCounterPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsUnderVoltageCounterPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeOverVoltagePeriodPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeUnderVoltagePeriodPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSagPeriodPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseBWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSwellPeriodPhaseB(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLineCurrentPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLineCurrentPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveCurrentPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveCurrentPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeReactiveCurrentPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactiveCurrentPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltagePhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltagePhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMinPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMinPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageMaxPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageMaxPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMinPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMinPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsCurrentMaxPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsCurrentMaxPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMinPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMinPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActivePowerMaxPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePowerMaxPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeReactivePowerPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactivePowerPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeApparentPowerPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApparentPowerPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerFactorPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerFactorPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsVoltageMeasurementPeriodPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsOverVoltageCounterPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAverageRmsUnderVoltageCounterPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeOverVoltagePeriodPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsExtremeUnderVoltagePeriodPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSagPeriodPhaseC(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRmsVoltageSwellPeriodPhaseC(MTRReadParams params);
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
