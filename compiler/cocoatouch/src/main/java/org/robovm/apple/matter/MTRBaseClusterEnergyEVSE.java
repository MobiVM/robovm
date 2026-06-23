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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterEnergyEVSE/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterEnergyEVSEPtr extends Ptr<MTRBaseClusterEnergyEVSE, MTRBaseClusterEnergyEVSEPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterEnergyEVSE.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterEnergyEVSE() {}
    protected MTRBaseClusterEnergyEVSE(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterEnergyEVSE(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterEnergyEVSE(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "disableWithParams:completion:")
    public native void disable(MTREnergyEVSEClusterDisableParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "disableWithCompletion:")
    public native void disable(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "enableChargingWithParams:completion:")
    public native void enableCharging(MTREnergyEVSEClusterEnableChargingParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "startDiagnosticsWithParams:completion:")
    public native void startDiagnostics(MTREnergyEVSEClusterStartDiagnosticsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "startDiagnosticsWithCompletion:")
    public native void startDiagnostics(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setTargetsWithParams:completion:")
    public native void setTargets(MTREnergyEVSEClusterSetTargetsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getTargetsWithParams:completion:")
    public native void getTargets(MTREnergyEVSEClusterGetTargetsParams params, @Block VoidBlock2<MTREnergyEVSEClusterGetTargetsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getTargetsWithCompletion:")
    public native void getTargets(@Block VoidBlock2<MTREnergyEVSEClusterGetTargetsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "clearTargetsWithParams:completion:")
    public native void clearTargets(MTREnergyEVSEClusterClearTargetsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "clearTargetsWithCompletion:")
    public native void clearTargets(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeStateWithCompletion:")
    public native void readAttributeState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupplyStateWithCompletion:")
    public native void readAttributeSupplyState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSupplyStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupplyState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFaultStateWithCompletion:")
    public native void readAttributeFaultState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeFaultStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFaultState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeChargingEnabledUntilWithCompletion:")
    public native void readAttributeChargingEnabledUntil(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeChargingEnabledUntilWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChargingEnabledUntil(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCircuitCapacityWithCompletion:")
    public native void readAttributeCircuitCapacity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeCircuitCapacityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCircuitCapacity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMinimumChargeCurrentWithCompletion:")
    public native void readAttributeMinimumChargeCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeMinimumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinimumChargeCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaximumChargeCurrentWithCompletion:")
    public native void readAttributeMaximumChargeCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeMaximumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaximumChargeCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserMaximumChargeCurrentWithCompletion:")
    public native void readAttributeUserMaximumChargeCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeUserMaximumChargeCurrentWithValue:completion:")
    public native void writeAttributeUserMaximumChargeCurrent(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeUserMaximumChargeCurrentWithValue:params:completion:")
    public native void writeAttributeUserMaximumChargeCurrent(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeUserMaximumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserMaximumChargeCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeRandomizationDelayWindowWithCompletion:")
    public native void readAttributeRandomizationDelayWindow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeRandomizationDelayWindowWithValue:completion:")
    public native void writeAttributeRandomizationDelayWindow(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeRandomizationDelayWindowWithValue:params:completion:")
    public native void writeAttributeRandomizationDelayWindow(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeRandomizationDelayWindowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRandomizationDelayWindow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeStartTimeWithCompletion:")
    public native void readAttributeNextChargeStartTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeNextChargeStartTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeStartTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetTimeWithCompletion:")
    public native void readAttributeNextChargeTargetTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeNextChargeTargetTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeTargetTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeRequiredEnergyWithCompletion:")
    public native void readAttributeNextChargeRequiredEnergy(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeNextChargeRequiredEnergyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeRequiredEnergy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetSoCWithCompletion:")
    public native void readAttributeNextChargeTargetSoC(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeNextChargeTargetSoCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeTargetSoC(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeApproximateEVEfficiencyWithCompletion:")
    public native void readAttributeApproximateEVEfficiency(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeApproximateEVEfficiencyWithValue:completion:")
    public native void writeAttributeApproximateEVEfficiency(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "writeAttributeApproximateEVEfficiencyWithValue:params:completion:")
    public native void writeAttributeApproximateEVEfficiency(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeApproximateEVEfficiencyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApproximateEVEfficiency(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionIDWithCompletion:")
    public native void readAttributeSessionID(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSessionIDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionID(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionDurationWithCompletion:")
    public native void readAttributeSessionDuration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSessionDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionDuration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionEnergyChargedWithCompletion:")
    public native void readAttributeSessionEnergyCharged(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSessionEnergyChargedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionEnergyCharged(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupplyStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupplyState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFaultStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFaultState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeChargingEnabledUntilWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChargingEnabledUntil(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCircuitCapacityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCircuitCapacity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMinimumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinimumChargeCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaximumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaximumChargeCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserMaximumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserMaximumChargeCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeRandomizationDelayWindowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRandomizationDelayWindow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeStartTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeStartTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeTargetTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeRequiredEnergyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeRequiredEnergy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNextChargeTargetSoCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeTargetSoC(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeApproximateEVEfficiencyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApproximateEVEfficiency(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionIDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionID(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionDuration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSessionEnergyChargedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionEnergyCharged(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
