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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterPumpConfigurationAndControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterPumpConfigurationAndControlPtr extends Ptr<MTRBaseClusterPumpConfigurationAndControl, MTRBaseClusterPumpConfigurationAndControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterPumpConfigurationAndControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterPumpConfigurationAndControl() {}
    protected MTRBaseClusterPumpConfigurationAndControl(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterPumpConfigurationAndControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterPumpConfigurationAndControl(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "readAttributeMaxPressureWithCompletion:")
    public native void readAttributeMaxPressure(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxPressureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxPressure(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxSpeedWithCompletion:")
    public native void readAttributeMaxSpeed(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxSpeedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxSpeed(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxFlowWithCompletion:")
    public native void readAttributeMaxFlow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxFlowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxFlow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstPressureWithCompletion:")
    public native void readAttributeMinConstPressure(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinConstPressureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinConstPressure(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstPressureWithCompletion:")
    public native void readAttributeMaxConstPressure(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxConstPressureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxConstPressure(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinCompPressureWithCompletion:")
    public native void readAttributeMinCompPressure(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinCompPressureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinCompPressure(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxCompPressureWithCompletion:")
    public native void readAttributeMaxCompPressure(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxCompPressureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxCompPressure(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstSpeedWithCompletion:")
    public native void readAttributeMinConstSpeed(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinConstSpeedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinConstSpeed(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstSpeedWithCompletion:")
    public native void readAttributeMaxConstSpeed(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxConstSpeedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxConstSpeed(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstFlowWithCompletion:")
    public native void readAttributeMinConstFlow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinConstFlowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinConstFlow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstFlowWithCompletion:")
    public native void readAttributeMaxConstFlow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxConstFlowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxConstFlow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstTempWithCompletion:")
    public native void readAttributeMinConstTemp(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMinConstTempWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinConstTemp(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstTempWithCompletion:")
    public native void readAttributeMaxConstTemp(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMaxConstTempWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxConstTemp(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePumpStatusWithCompletion:")
    public native void readAttributePumpStatus(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePumpStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePumpStatus(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEffectiveOperationModeWithCompletion:")
    public native void readAttributeEffectiveOperationMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEffectiveOperationModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEffectiveOperationMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEffectiveControlModeWithCompletion:")
    public native void readAttributeEffectiveControlMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEffectiveControlModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEffectiveControlMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCapacityWithCompletion:")
    public native void readAttributeCapacity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCapacityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCapacity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSpeedWithCompletion:")
    public native void readAttributeSpeed(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSpeedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSpeed(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLifetimeRunningHoursWithCompletion:")
    public native void readAttributeLifetimeRunningHours(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLifetimeRunningHoursWithValue:completion:")
    public native void writeAttributeLifetimeRunningHours(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLifetimeRunningHoursWithValue:params:completion:")
    public native void writeAttributeLifetimeRunningHours(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLifetimeRunningHoursWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLifetimeRunningHours(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePowerWithCompletion:")
    public native void readAttributePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLifetimeEnergyConsumedWithCompletion:")
    public native void readAttributeLifetimeEnergyConsumed(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLifetimeEnergyConsumedWithValue:completion:")
    public native void writeAttributeLifetimeEnergyConsumed(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLifetimeEnergyConsumedWithValue:params:completion:")
    public native void writeAttributeLifetimeEnergyConsumed(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLifetimeEnergyConsumedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLifetimeEnergyConsumed(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationModeWithCompletion:")
    public native void readAttributeOperationMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOperationModeWithValue:completion:")
    public native void writeAttributeOperationMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOperationModeWithValue:params:completion:")
    public native void writeAttributeOperationMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOperationModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeControlModeWithCompletion:")
    public native void readAttributeControlMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeControlModeWithValue:completion:")
    public native void writeAttributeControlMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeControlModeWithValue:params:completion:")
    public native void writeAttributeControlMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeControlModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeControlMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeMaxPressureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxPressure(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxSpeedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxSpeed(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxFlowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxFlow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstPressureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinConstPressure(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstPressureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxConstPressure(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinCompPressureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinCompPressure(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxCompPressureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxCompPressure(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstSpeedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinConstSpeed(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstSpeedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxConstSpeed(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstFlowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinConstFlow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstFlowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxConstFlow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMinConstTempWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinConstTemp(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMaxConstTempWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxConstTemp(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePumpStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePumpStatus(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEffectiveOperationModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEffectiveOperationMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEffectiveControlModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEffectiveControlMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCapacityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCapacity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSpeedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSpeed(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLifetimeRunningHoursWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLifetimeRunningHours(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLifetimeEnergyConsumedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLifetimeEnergyConsumed(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperationMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeControlModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeControlMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
