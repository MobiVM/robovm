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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterThreadNetworkDiagnostics/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterThreadNetworkDiagnosticsPtr extends Ptr<MTRBaseClusterThreadNetworkDiagnostics, MTRBaseClusterThreadNetworkDiagnosticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterThreadNetworkDiagnostics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterThreadNetworkDiagnostics() {}
    protected MTRBaseClusterThreadNetworkDiagnostics(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterThreadNetworkDiagnostics(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterThreadNetworkDiagnostics(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    public native void resetCounts(MTRThreadNetworkDiagnosticsClusterResetCountsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "resetCountsWithCompletion:")
    public native void resetCounts(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChannelWithCompletion:")
    public native void readAttributeChannel(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeChannelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannel(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRoutingRoleWithCompletion:")
    public native void readAttributeRoutingRole(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRoutingRoleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRoutingRole(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNetworkNameWithCompletion:")
    public native void readAttributeNetworkName(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNetworkNameWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNetworkName(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePanIdWithCompletion:")
    public native void readAttributePanId(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePanIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePanId(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeExtendedPanIdWithCompletion:")
    public native void readAttributeExtendedPanId(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeExtendedPanIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExtendedPanId(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMeshLocalPrefixWithCompletion:")
    public native void readAttributeMeshLocalPrefix(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeMeshLocalPrefixWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeshLocalPrefix(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
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
    @Method(selector = "readAttributeNeighborTableWithCompletion:")
    public native void readAttributeNeighborTable(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNeighborTableWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeighborTable(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRouteTableWithCompletion:")
    public native void readAttributeRouteTable(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRouteTableWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouteTable(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePartitionIdWithCompletion:")
    public native void readAttributePartitionId(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePartitionIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionId(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWeightingWithCompletion:")
    public native void readAttributeWeighting(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWeightingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWeighting(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDataVersionWithCompletion:")
    public native void readAttributeDataVersion(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDataVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDataVersion(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStableDataVersionWithCompletion:")
    public native void readAttributeStableDataVersion(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeStableDataVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStableDataVersion(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLeaderRouterIdWithCompletion:")
    public native void readAttributeLeaderRouterId(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLeaderRouterIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRouterId(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDetachedRoleCountWithCompletion:")
    public native void readAttributeDetachedRoleCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDetachedRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDetachedRoleCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChildRoleCountWithCompletion:")
    public native void readAttributeChildRoleCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeChildRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChildRoleCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRouterRoleCountWithCompletion:")
    public native void readAttributeRouterRoleCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRouterRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouterRoleCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLeaderRoleCountWithCompletion:")
    public native void readAttributeLeaderRoleCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLeaderRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRoleCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttachAttemptCountWithCompletion:")
    public native void readAttributeAttachAttemptCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAttachAttemptCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttachAttemptCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePartitionIdChangeCountWithCompletion:")
    public native void readAttributePartitionIdChangeCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePartitionIdChangeCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionIdChangeCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBetterPartitionAttachAttemptCountWithCompletion:")
    public native void readAttributeBetterPartitionAttachAttemptCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBetterPartitionAttachAttemptCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBetterPartitionAttachAttemptCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeParentChangeCountWithCompletion:")
    public native void readAttributeParentChangeCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeParentChangeCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeParentChangeCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxTotalCountWithCompletion:")
    public native void readAttributeTxTotalCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxTotalCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxTotalCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxUnicastCountWithCompletion:")
    public native void readAttributeTxUnicastCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxUnicastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxUnicastCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBroadcastCountWithCompletion:")
    public native void readAttributeTxBroadcastCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxBroadcastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBroadcastCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxAckRequestedCountWithCompletion:")
    public native void readAttributeTxAckRequestedCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxAckRequestedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckRequestedCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxAckedCountWithCompletion:")
    public native void readAttributeTxAckedCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxAckedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckedCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxNoAckRequestedCountWithCompletion:")
    public native void readAttributeTxNoAckRequestedCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxNoAckRequestedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxNoAckRequestedCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDataCountWithCompletion:")
    public native void readAttributeTxDataCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxDataCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDataPollCountWithCompletion:")
    public native void readAttributeTxDataPollCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxDataPollCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataPollCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBeaconCountWithCompletion:")
    public native void readAttributeTxBeaconCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxBeaconCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBeaconRequestCountWithCompletion:")
    public native void readAttributeTxBeaconRequestCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxBeaconRequestCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconRequestCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxOtherCountWithCompletion:")
    public native void readAttributeTxOtherCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxOtherCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxRetryCountWithCompletion:")
    public native void readAttributeTxRetryCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxRetryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxRetryCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDirectMaxRetryExpiryCountWithCompletion:")
    public native void readAttributeTxDirectMaxRetryExpiryCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxDirectMaxRetryExpiryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDirectMaxRetryExpiryCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxIndirectMaxRetryExpiryCountWithCompletion:")
    public native void readAttributeTxIndirectMaxRetryExpiryCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxIndirectMaxRetryExpiryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxIndirectMaxRetryExpiryCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrCcaCountWithCompletion:")
    public native void readAttributeTxErrCcaCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxErrCcaCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCcaCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrAbortCountWithCompletion:")
    public native void readAttributeTxErrAbortCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxErrAbortCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrAbortCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrBusyChannelCountWithCompletion:")
    public native void readAttributeTxErrBusyChannelCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTxErrBusyChannelCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrBusyChannelCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxTotalCountWithCompletion:")
    public native void readAttributeRxTotalCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxTotalCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxTotalCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxUnicastCountWithCompletion:")
    public native void readAttributeRxUnicastCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxUnicastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxUnicastCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBroadcastCountWithCompletion:")
    public native void readAttributeRxBroadcastCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxBroadcastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBroadcastCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDataCountWithCompletion:")
    public native void readAttributeRxDataCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxDataCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDataPollCountWithCompletion:")
    public native void readAttributeRxDataPollCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxDataPollCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataPollCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBeaconCountWithCompletion:")
    public native void readAttributeRxBeaconCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxBeaconCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBeaconRequestCountWithCompletion:")
    public native void readAttributeRxBeaconRequestCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxBeaconRequestCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconRequestCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxOtherCountWithCompletion:")
    public native void readAttributeRxOtherCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxOtherCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxAddressFilteredCountWithCompletion:")
    public native void readAttributeRxAddressFilteredCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxAddressFilteredCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxAddressFilteredCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDestAddrFilteredCountWithCompletion:")
    public native void readAttributeRxDestAddrFilteredCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxDestAddrFilteredCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDestAddrFilteredCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDuplicatedCountWithCompletion:")
    public native void readAttributeRxDuplicatedCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxDuplicatedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDuplicatedCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrNoFrameCountWithCompletion:")
    public native void readAttributeRxErrNoFrameCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrNoFrameCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrNoFrameCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrUnknownNeighborCountWithCompletion:")
    public native void readAttributeRxErrUnknownNeighborCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrUnknownNeighborCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrUnknownNeighborCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrInvalidSrcAddrCountWithCompletion:")
    public native void readAttributeRxErrInvalidSrcAddrCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrInvalidSrcAddrCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrInvalidSrcAddrCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrSecCountWithCompletion:")
    public native void readAttributeRxErrSecCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrSecCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrSecCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrFcsCountWithCompletion:")
    public native void readAttributeRxErrFcsCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrFcsCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrFcsCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrOtherCountWithCompletion:")
    public native void readAttributeRxErrOtherCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRxErrOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrOtherCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActiveTimestampWithCompletion:")
    public native void readAttributeActiveTimestamp(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeActiveTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveTimestamp(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePendingTimestampWithCompletion:")
    public native void readAttributePendingTimestamp(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePendingTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePendingTimestamp(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDelayWithCompletion:")
    public native void readAttributeDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSecurityPolicyWithCompletion:")
    public native void readAttributeSecurityPolicy(@Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterSecurityPolicy, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSecurityPolicyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSecurityPolicy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterSecurityPolicy, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChannelPage0MaskWithCompletion:")
    public native void readAttributeChannelPage0Mask(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeChannelPage0MaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelPage0Mask(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationalDatasetComponentsWithCompletion:")
    public native void readAttributeOperationalDatasetComponents(@Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOperationalDatasetComponentsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalDatasetComponents(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActiveNetworkFaultsListWithCompletion:")
    public native void readAttributeActiveNetworkFaultsList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeActiveNetworkFaultsListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveNetworkFaultsList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
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
    @Method(selector = "readAttributeChannelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChannel(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRoutingRoleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRoutingRole(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNetworkNameWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNetworkName(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePanIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePanId(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeExtendedPanIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExtendedPanId(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeMeshLocalPrefixWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeshLocalPrefix(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOverrunCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverrunCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNeighborTableWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNeighborTable(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRouteTableWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRouteTable(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePartitionIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePartitionId(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWeightingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWeighting(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDataVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDataVersion(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStableDataVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStableDataVersion(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLeaderRouterIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLeaderRouterId(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDetachedRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDetachedRoleCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChildRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChildRoleCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRouterRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRouterRoleCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLeaderRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLeaderRoleCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttachAttemptCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttachAttemptCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePartitionIdChangeCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePartitionIdChangeCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBetterPartitionAttachAttemptCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBetterPartitionAttachAttemptCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeParentChangeCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeParentChangeCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxTotalCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxTotalCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxUnicastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxUnicastCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBroadcastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBroadcastCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxAckRequestedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxAckRequestedCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxAckedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxAckedCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxNoAckRequestedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxNoAckRequestedCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDataCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDataCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDataPollCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDataPollCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBeaconCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBeaconCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxBeaconRequestCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBeaconRequestCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxOtherCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxRetryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxRetryCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDirectMaxRetryExpiryCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxIndirectMaxRetryExpiryCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrCcaCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrCcaCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrAbortCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrAbortCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTxErrBusyChannelCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrBusyChannelCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxTotalCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxTotalCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxUnicastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxUnicastCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBroadcastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBroadcastCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDataCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDataCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDataPollCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDataPollCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBeaconCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBeaconCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxBeaconRequestCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBeaconRequestCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxOtherCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxAddressFilteredCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxAddressFilteredCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDestAddrFilteredCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDestAddrFilteredCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxDuplicatedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDuplicatedCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrNoFrameCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrNoFrameCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrUnknownNeighborCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrUnknownNeighborCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrInvalidSrcAddrCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrInvalidSrcAddrCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrSecCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrSecCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrFcsCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrFcsCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRxErrOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrOtherCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActiveTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveTimestamp(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePendingTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePendingTimestamp(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSecurityPolicyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSecurityPolicy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterSecurityPolicy, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChannelPage0MaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChannelPage0Mask(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationalDatasetComponentsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperationalDatasetComponents(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeActiveNetworkFaultsListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveNetworkFaultsList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
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
