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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterICDManagement/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterICDManagementPtr extends Ptr<MTRBaseClusterICDManagement, MTRBaseClusterICDManagementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterICDManagement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterICDManagement() {}
    protected MTRBaseClusterICDManagement(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterICDManagement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterICDManagement(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "registerClientWithParams:completion:")
    public native void registerClient(MTRICDManagementClusterRegisterClientParams params, @Block VoidBlock2<MTRICDManagementClusterRegisterClientResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "unregisterClientWithParams:completion:")
    public native void unregisterClient(MTRICDManagementClusterUnregisterClientParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "stayActiveRequestWithParams:completion:")
    public native void stayActiveRequest(MTRICDManagementClusterStayActiveRequestParams params, @Block VoidBlock2<MTRICDManagementClusterStayActiveResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeIdleModeDurationWithCompletion:")
    public native void readAttributeIdleModeDuration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeIdleModeDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeIdleModeDuration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeActiveModeDurationWithCompletion:")
    public native void readAttributeActiveModeDuration(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeActiveModeDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveModeDuration(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeActiveModeThresholdWithCompletion:")
    public native void readAttributeActiveModeThreshold(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeActiveModeThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveModeThreshold(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeRegisteredClientsWithParams:completion:")
    public native void readAttributeRegisteredClients(MTRReadParams params, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeRegisteredClientsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRegisteredClients(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeICDCounterWithCompletion:")
    public native void readAttributeICDCounter(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeICDCounterWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeICDCounter(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClientsSupportedPerFabricWithCompletion:")
    public native void readAttributeClientsSupportedPerFabric(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeClientsSupportedPerFabricWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClientsSupportedPerFabric(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserActiveModeTriggerHintWithCompletion:")
    public native void readAttributeUserActiveModeTriggerHint(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeUserActiveModeTriggerHintWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserActiveModeTriggerHint(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserActiveModeTriggerInstructionWithCompletion:")
    public native void readAttributeUserActiveModeTriggerInstruction(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeUserActiveModeTriggerInstructionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserActiveModeTriggerInstruction(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeOperatingModeWithCompletion:")
    public native void readAttributeOperatingMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeOperatingModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperatingMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaximumCheckInBackOffWithCompletion:")
    public native void readAttributeMaximumCheckInBackOff(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeMaximumCheckInBackOffWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaximumCheckInBackOff(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeIdleModeDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeIdleModeDuration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeActiveModeDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveModeDuration(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeActiveModeThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveModeThreshold(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeRegisteredClientsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRegisteredClients(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeICDCounterWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeICDCounter(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClientsSupportedPerFabricWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClientsSupportedPerFabric(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserActiveModeTriggerHintWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserActiveModeTriggerHint(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUserActiveModeTriggerInstructionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserActiveModeTriggerInstruction(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeOperatingModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperatingMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaximumCheckInBackOffWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaximumCheckInBackOff(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
