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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterPowerSource/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterPowerSourcePtr extends Ptr<MTRClusterPowerSource, MTRClusterPowerSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterPowerSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterPowerSource() {}
    protected MTRClusterPowerSource(Handle h, long handle) { super(h, handle); }
    protected MTRClusterPowerSource(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterPowerSource(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStatusWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStatus(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOrderWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOrder(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDescriptionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDescription(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredAssessedInputVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredAssessedInputVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredAssessedInputFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredAssessedInputFrequency(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredCurrentTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredCurrentType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredAssessedCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredAssessedCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredNominalVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredNominalVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredMaximumCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredMaximumCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWiredPresentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWiredPresent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveWiredFaultsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveWiredFaults(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatPercentRemainingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatPercentRemaining(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatTimeRemainingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatTimeRemaining(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatChargeLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatChargeLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatReplacementNeededWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatReplacementNeeded(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatReplaceabilityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatReplaceability(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatPresentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatPresent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveBatFaultsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveBatFaults(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatReplacementDescriptionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatReplacementDescription(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatCommonDesignationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatCommonDesignation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatANSIDesignationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatANSIDesignation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatIECDesignationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatIECDesignation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatApprovedChemistryWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatApprovedChemistry(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatCapacityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatCapacity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatQuantityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatQuantity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatChargeStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatChargeState(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatTimeToFullChargeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatTimeToFullCharge(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatFunctionalWhileChargingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatFunctionalWhileCharging(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBatChargingCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBatChargingCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveBatChargeFaultsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveBatChargeFaults(MTRReadParams params);
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
