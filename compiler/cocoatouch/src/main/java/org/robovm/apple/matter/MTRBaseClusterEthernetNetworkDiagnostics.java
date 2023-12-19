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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterEthernetNetworkDiagnostics/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterEthernetNetworkDiagnosticsPtr extends Ptr<MTRBaseClusterEthernetNetworkDiagnostics, MTRBaseClusterEthernetNetworkDiagnosticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterEthernetNetworkDiagnostics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterEthernetNetworkDiagnostics() {}
    protected MTRBaseClusterEthernetNetworkDiagnostics(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterEthernetNetworkDiagnostics(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterEthernetNetworkDiagnostics(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "resetCountsWithParams:completion:")
    public native void resetCounts(MTREthernetNetworkDiagnosticsClusterResetCountsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "resetCountsWithCompletion:")
    public native void resetCounts(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePHYRateWithCompletion:")
    public native void readAttributePHYRate(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePHYRateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePHYRate(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFullDuplexWithCompletion:")
    public native void readAttributeFullDuplex(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFullDuplexWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFullDuplex(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketRxCountWithCompletion:")
    public native void readAttributePacketRxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketRxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketRxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketTxCountWithCompletion:")
    public native void readAttributePacketTxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketTxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketTxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrCountWithCompletion:")
    public native void readAttributeTxErrCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxErrCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCollisionCountWithCompletion:")
    public native void readAttributeCollisionCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCollisionCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCollisionCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOverrunCountWithCompletion:")
    public native void readAttributeOverrunCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOverrunCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverrunCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCarrierDetectWithCompletion:")
    public native void readAttributeCarrierDetect(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCarrierDetectWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCarrierDetect(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTimeSinceResetWithCompletion:")
    public native void readAttributeTimeSinceReset(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTimeSinceResetWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimeSinceReset(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributePHYRateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePHYRate(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFullDuplexWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFullDuplex(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketRxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketRxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketTxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketTxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCollisionCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCollisionCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOverrunCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverrunCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCarrierDetectWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCarrierDetect(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTimeSinceResetWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTimeSinceReset(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
