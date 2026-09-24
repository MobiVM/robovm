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
 * @deprecated Deprecated in iOS 18.2. ElectricalMeasurement is deprecated and will be removed
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterElectricalMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterElectricalMeasurementPtr extends Ptr<MTRBaseClusterElectricalMeasurement, MTRBaseClusterElectricalMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterElectricalMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterElectricalMeasurement() {}
    protected MTRBaseClusterElectricalMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterElectricalMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. ElectricalMeasurement is deprecated and will be removed
     */
    @Deprecated
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterElectricalMeasurement(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This command is deprecated
     */
    @Deprecated
    @Method(selector = "getProfileInfoCommandWithParams:completion:")
    public native void getProfileInfoCommand(MTRElectricalMeasurementClusterGetProfileInfoCommandParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This command is deprecated
     */
    @Deprecated
    @Method(selector = "getProfileInfoCommandWithCompletion:")
    public native void getProfileInfoCommand(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This command is deprecated
     */
    @Deprecated
    @Method(selector = "getMeasurementProfileCommandWithParams:completion:")
    public native void getMeasurementProfileCommand(MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasurementTypeWithCompletion:")
    public native void readAttributeMeasurementType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasurementTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasurementType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageWithCompletion:")
    public native void readAttributeDcVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMinWithCompletion:")
    public native void readAttributeDcVoltageMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcVoltageMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMaxWithCompletion:")
    public native void readAttributeDcVoltageMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcVoltageMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentWithCompletion:")
    public native void readAttributeDcCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMinWithCompletion:")
    public native void readAttributeDcCurrentMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcCurrentMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMaxWithCompletion:")
    public native void readAttributeDcCurrentMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcCurrentMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerWithCompletion:")
    public native void readAttributeDcPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMinWithCompletion:")
    public native void readAttributeDcPowerMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcPowerMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMaxWithCompletion:")
    public native void readAttributeDcPowerMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcPowerMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMultiplierWithCompletion:")
    public native void readAttributeDcVoltageMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcVoltageMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageDivisorWithCompletion:")
    public native void readAttributeDcVoltageDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcVoltageDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMultiplierWithCompletion:")
    public native void readAttributeDcCurrentMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentDivisorWithCompletion:")
    public native void readAttributeDcCurrentDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcCurrentDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMultiplierWithCompletion:")
    public native void readAttributeDcPowerMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcPowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerDivisorWithCompletion:")
    public native void readAttributeDcPowerDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeDcPowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyWithCompletion:")
    public native void readAttributeAcFrequency(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcFrequencyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequency(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMinWithCompletion:")
    public native void readAttributeAcFrequencyMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcFrequencyMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMaxWithCompletion:")
    public native void readAttributeAcFrequencyMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcFrequencyMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeNeutralCurrentWithCompletion:")
    public native void readAttributeNeutralCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeNeutralCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeutralCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalActivePowerWithCompletion:")
    public native void readAttributeTotalActivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeTotalActivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalActivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalReactivePowerWithCompletion:")
    public native void readAttributeTotalReactivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeTotalReactivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalReactivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalApparentPowerWithCompletion:")
    public native void readAttributeTotalApparentPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeTotalApparentPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalApparentPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured1stHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured1stHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured1stHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured1stHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured3rdHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured3rdHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured3rdHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured3rdHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured5thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured5thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured5thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured5thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured7thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured7thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured7thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured7thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured9thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured9thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured9thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured9thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured11thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured11thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasured11thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured11thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase1stHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase1stHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase3rdHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase3rdHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase5thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase5thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase7thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase7thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase9thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase9thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase11thHarmonicCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase11thHarmonicCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMultiplierWithCompletion:")
    public native void readAttributeAcFrequencyMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcFrequencyMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyDivisorWithCompletion:")
    public native void readAttributeAcFrequencyDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcFrequencyDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerMultiplierWithCompletion:")
    public native void readAttributePowerMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerDivisorWithCompletion:")
    public native void readAttributePowerDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeHarmonicCurrentMultiplierWithCompletion:")
    public native void readAttributeHarmonicCurrentMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeHarmonicCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHarmonicCurrentMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePhaseHarmonicCurrentMultiplierWithCompletion:")
    public native void readAttributePhaseHarmonicCurrentMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePhaseHarmonicCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhaseHarmonicCurrentMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousVoltageWithCompletion:")
    public native void readAttributeInstantaneousVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeInstantaneousVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousLineCurrentWithCompletion:")
    public native void readAttributeInstantaneousLineCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeInstantaneousLineCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousLineCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousActiveCurrentWithCompletion:")
    public native void readAttributeInstantaneousActiveCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeInstantaneousActiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousActiveCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousReactiveCurrentWithCompletion:")
    public native void readAttributeInstantaneousReactiveCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeInstantaneousReactiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousReactiveCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousPowerWithCompletion:")
    public native void readAttributeInstantaneousPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeInstantaneousPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageWithCompletion:")
    public native void readAttributeRmsVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinWithCompletion:")
    public native void readAttributeRmsVoltageMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxWithCompletion:")
    public native void readAttributeRmsVoltageMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentWithCompletion:")
    public native void readAttributeRmsCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinWithCompletion:")
    public native void readAttributeRmsCurrentMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxWithCompletion:")
    public native void readAttributeRmsCurrentMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerWithCompletion:")
    public native void readAttributeActivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinWithCompletion:")
    public native void readAttributeActivePowerMin(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMin(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxWithCompletion:")
    public native void readAttributeActivePowerMax(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMax(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerWithCompletion:")
    public native void readAttributeReactivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeReactivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerWithCompletion:")
    public native void readAttributeApparentPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeApparentPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorWithCompletion:")
    public native void readAttributePowerFactor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePowerFactorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:completion:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:params:completion:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounter(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAverageRmsUnderVoltageCounterWithValue:completion:")
    public native void writeAttributeAverageRmsUnderVoltageCounter(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAverageRmsUnderVoltageCounterWithValue:params:completion:")
    public native void writeAttributeAverageRmsUnderVoltageCounter(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsUnderVoltageCounterWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounter(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsExtremeOverVoltagePeriodWithValue:completion:")
    public native void writeAttributeRmsExtremeOverVoltagePeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsExtremeOverVoltagePeriodWithValue:params:completion:")
    public native void writeAttributeRmsExtremeOverVoltagePeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeOverVoltagePeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsExtremeUnderVoltagePeriodWithValue:completion:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsExtremeUnderVoltagePeriodWithValue:params:completion:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeUnderVoltagePeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsVoltageSagPeriodWithValue:completion:")
    public native void writeAttributeRmsVoltageSagPeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsVoltageSagPeriodWithValue:params:completion:")
    public native void writeAttributeRmsVoltageSagPeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSagPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriod(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsVoltageSwellPeriodWithValue:completion:")
    public native void writeAttributeRmsVoltageSwellPeriod(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeRmsVoltageSwellPeriodWithValue:params:completion:")
    public native void writeAttributeRmsVoltageSwellPeriod(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSwellPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriod(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageMultiplierWithCompletion:")
    public native void readAttributeAcVoltageMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcVoltageMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageDivisorWithCompletion:")
    public native void readAttributeAcVoltageDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcVoltageDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentMultiplierWithCompletion:")
    public native void readAttributeAcCurrentMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentDivisorWithCompletion:")
    public native void readAttributeAcCurrentDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcCurrentDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcPowerMultiplierWithCompletion:")
    public native void readAttributeAcPowerMultiplier(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcPowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerMultiplier(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcPowerDivisorWithCompletion:")
    public native void readAttributeAcPowerDivisor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcPowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerDivisor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeOverloadAlarmsMaskWithCompletion:")
    public native void readAttributeOverloadAlarmsMask(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeOverloadAlarmsMaskWithValue:completion:")
    public native void writeAttributeOverloadAlarmsMask(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeOverloadAlarmsMaskWithValue:params:completion:")
    public native void writeAttributeOverloadAlarmsMask(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeOverloadAlarmsMaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverloadAlarmsMask(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeVoltageOverloadWithCompletion:")
    public native void readAttributeVoltageOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeVoltageOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVoltageOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeCurrentOverloadWithCompletion:")
    public native void readAttributeCurrentOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeCurrentOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcOverloadAlarmsMaskWithCompletion:")
    public native void readAttributeAcOverloadAlarmsMask(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAcOverloadAlarmsMaskWithValue:completion:")
    public native void writeAttributeAcOverloadAlarmsMask(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "writeAttributeAcOverloadAlarmsMaskWithValue:params:completion:")
    public native void writeAttributeAcOverloadAlarmsMask(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcOverloadAlarmsMaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcOverloadAlarmsMask(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageOverloadWithCompletion:")
    public native void readAttributeAcVoltageOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcVoltageOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentOverloadWithCompletion:")
    public native void readAttributeAcCurrentOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcCurrentOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcActivePowerOverloadWithCompletion:")
    public native void readAttributeAcActivePowerOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcActivePowerOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcActivePowerOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcReactivePowerOverloadWithCompletion:")
    public native void readAttributeAcReactivePowerOverload(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcReactivePowerOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcReactivePowerOverload(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageWithCompletion:")
    public native void readAttributeAverageRmsOverVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsOverVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsUnderVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltageWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeOverVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltageWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeUnderVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagWithCompletion:")
    public native void readAttributeRmsVoltageSag(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSagWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSag(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellWithCompletion:")
    public native void readAttributeRmsVoltageSwell(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSwellWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwell(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeLineCurrentPhaseBWithCompletion:")
    public native void readAttributeLineCurrentPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeLineCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActiveCurrentPhaseBWithCompletion:")
    public native void readAttributeActiveCurrentPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActiveCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactiveCurrentPhaseBWithCompletion:")
    public native void readAttributeReactiveCurrentPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeReactiveCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltagePhaseBWithCompletion:")
    public native void readAttributeRmsVoltagePhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltagePhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageMinPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageMaxPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentMinPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentMaxPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerPhaseBWithCompletion:")
    public native void readAttributeActivePowerPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinPhaseBWithCompletion:")
    public native void readAttributeActivePowerMinPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxPhaseBWithCompletion:")
    public native void readAttributeActivePowerMaxPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerPhaseBWithCompletion:")
    public native void readAttributeReactivePowerPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeReactivePowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerPhaseBWithCompletion:")
    public native void readAttributeApparentPowerPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeApparentPowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorPhaseBWithCompletion:")
    public native void readAttributePowerFactorPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePowerFactorPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriodPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSagPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseB(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseB(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeLineCurrentPhaseCWithCompletion:")
    public native void readAttributeLineCurrentPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeLineCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActiveCurrentPhaseCWithCompletion:")
    public native void readAttributeActiveCurrentPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActiveCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactiveCurrentPhaseCWithCompletion:")
    public native void readAttributeReactiveCurrentPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeReactiveCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltagePhaseCWithCompletion:")
    public native void readAttributeRmsVoltagePhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltagePhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageMinPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageMaxPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentMinPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentMaxPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsCurrentMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerPhaseCWithCompletion:")
    public native void readAttributeActivePowerPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinPhaseCWithCompletion:")
    public native void readAttributeActivePowerMinPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxPhaseCWithCompletion:")
    public native void readAttributeActivePowerMaxPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeActivePowerMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerPhaseCWithCompletion:")
    public native void readAttributeReactivePowerPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeReactivePowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerPhaseCWithCompletion:")
    public native void readAttributeApparentPowerPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeApparentPowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorPhaseCWithCompletion:")
    public native void readAttributePowerFactorPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributePowerFactorPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriodPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSagPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasurementTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasurementType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcVoltageDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcCurrentDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeDcPowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequency(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeNeutralCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNeutralCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalActivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalActivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalReactivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalReactivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeTotalApparentPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalApparentPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured1stHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured1stHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured3rdHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured3rdHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured5thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured5thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured7thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured7thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured9thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured9thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasured11thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured11thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase1stHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase3rdHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase5thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase7thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase9thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase11thHarmonicCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcFrequencyDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeHarmonicCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHarmonicCurrentMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhaseHarmonicCurrentMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousLineCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousLineCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousActiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousActiveCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousReactiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousReactiveCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeInstantaneousPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMin(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMax(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounter(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriod(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcPowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcPowerMultiplier(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcPowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcPowerDivisor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeOverloadAlarmsMaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverloadAlarmsMask(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeVoltageOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVoltageOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeCurrentOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcOverloadAlarmsMaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcOverloadAlarmsMask(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcVoltageOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcCurrentOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcActivePowerOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcActivePowerOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcReactivePowerOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcReactivePowerOverload(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSag(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwell(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeLineCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLineCurrentPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActiveCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveCurrentPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactiveCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactiveCurrentPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltagePhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltagePhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMinPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMaxPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMinPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMaxPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMinPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMaxPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePowerPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPowerPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactorPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseB(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeLineCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLineCurrentPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActiveCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveCurrentPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactiveCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactiveCurrentPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltagePhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltagePhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMinPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMaxPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMinPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsCurrentMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMaxPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMinPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeActivePowerMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMaxPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeReactivePowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePowerPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeApparentPowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPowerPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributePowerFactorPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactorPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. This attribute is deprecated
     */
    @Deprecated
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. ElectricalMeasurement is deprecated and will be removed
     */
    @Deprecated
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
