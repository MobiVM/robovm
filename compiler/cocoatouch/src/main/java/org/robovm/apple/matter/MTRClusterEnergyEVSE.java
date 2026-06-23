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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterEnergyEVSE/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterEnergyEVSEPtr extends Ptr<MTRClusterEnergyEVSE, MTRClusterEnergyEVSEPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterEnergyEVSE.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterEnergyEVSE() {}
    protected MTRClusterEnergyEVSE(Handle h, long handle) { super(h, handle); }
    protected MTRClusterEnergyEVSE(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterEnergyEVSE(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "disableWithParams:expectedValues:expectedValueInterval:completion:")
    public native void disable(MTREnergyEVSEClusterDisableParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "disableWithExpectedValues:expectedValueInterval:completion:")
    public native void disable(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "enableChargingWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enableCharging(MTREnergyEVSEClusterEnableChargingParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "startDiagnosticsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startDiagnostics(MTREnergyEVSEClusterStartDiagnosticsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "startDiagnosticsWithExpectedValues:expectedValueInterval:completion:")
    public native void startDiagnostics(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTargets(MTREnergyEVSEClusterSetTargetsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getTargets(MTREnergyEVSEClusterGetTargetsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTREnergyEVSEClusterGetTargetsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getTargetsWithExpectedValues:expectedValueInterval:completion:")
    public native void getTargets(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTREnergyEVSEClusterGetTargetsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "clearTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearTargets(MTREnergyEVSEClusterClearTargetsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "clearTargetsWithExpectedValues:expectedValueInterval:completion:")
    public native void clearTargets(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeState(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupplyStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupplyState(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFaultStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFaultState(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeChargingEnabledUntilWithParams:")
    public native NSDictionary<NSString, ?> readAttributeChargingEnabledUntil(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCircuitCapacityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCircuitCapacity(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMinimumChargeCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinimumChargeCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaximumChargeCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaximumChargeCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserMaximumChargeCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUserMaximumChargeCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeUserMaximumChargeCurrentWithValue:expectedValueInterval:")
    public native void writeAttributeUserMaximumChargeCurrent(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeUserMaximumChargeCurrentWithValue:expectedValueInterval:params:")
    public native void writeAttributeUserMaximumChargeCurrent(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeRandomizationDelayWindowWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRandomizationDelayWindow(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeRandomizationDelayWindowWithValue:expectedValueInterval:")
    public native void writeAttributeRandomizationDelayWindow(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeRandomizationDelayWindowWithValue:expectedValueInterval:params:")
    public native void writeAttributeRandomizationDelayWindow(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeStartTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNextChargeStartTime(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNextChargeTargetTime(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeRequiredEnergyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNextChargeRequiredEnergy(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetSoCWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNextChargeTargetSoC(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeApproximateEVEfficiencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApproximateEVEfficiency(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeApproximateEVEfficiencyWithValue:expectedValueInterval:")
    public native void writeAttributeApproximateEVEfficiency(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeApproximateEVEfficiencyWithValue:expectedValueInterval:params:")
    public native void writeAttributeApproximateEVEfficiency(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionIDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSessionID(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSessionDuration(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionEnergyChargedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSessionEnergyCharged(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
