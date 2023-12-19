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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterThreadNetworkDiagnostics/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterThreadNetworkDiagnosticsPtr extends Ptr<MTRClusterThreadNetworkDiagnostics, MTRClusterThreadNetworkDiagnosticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterThreadNetworkDiagnostics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterThreadNetworkDiagnostics() {}
    protected MTRClusterThreadNetworkDiagnostics(Handle h, long handle) { super(h, handle); }
    protected MTRClusterThreadNetworkDiagnostics(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterThreadNetworkDiagnostics(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "resetCountsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resetCounts(MTRThreadNetworkDiagnosticsClusterResetCountsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "resetCountsWithExpectedValues:expectedValueInterval:completion:")
    public native void resetCounts(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeChannelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeChannel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRoutingRoleWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRoutingRole(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNetworkNameWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNetworkName(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePanIdWithParams:")
    public native NSDictionary<NSString, ?> readAttributePanId(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeExtendedPanIdWithParams:")
    public native NSDictionary<NSString, ?> readAttributeExtendedPanId(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMeshLocalPrefixWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMeshLocalPrefix(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOverrunCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOverrunCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNeighborTableWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNeighborTable(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRouteTableWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRouteTable(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePartitionIdWithParams:")
    public native NSDictionary<NSString, ?> readAttributePartitionId(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWeightingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWeighting(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDataVersionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDataVersion(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStableDataVersionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStableDataVersion(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLeaderRouterIdWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLeaderRouterId(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDetachedRoleCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDetachedRoleCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeChildRoleCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeChildRoleCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRouterRoleCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRouterRoleCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLeaderRoleCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLeaderRoleCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAttachAttemptCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttachAttemptCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePartitionIdChangeCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributePartitionIdChangeCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBetterPartitionAttachAttemptCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBetterPartitionAttachAttemptCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeParentChangeCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeParentChangeCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxTotalCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxTotalCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxUnicastCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxUnicastCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxBroadcastCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxBroadcastCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxAckRequestedCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxAckRequestedCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxAckedCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxAckedCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxNoAckRequestedCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxNoAckRequestedCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxDataCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxDataCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxDataPollCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxDataPollCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxBeaconCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxBeaconCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxBeaconRequestCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxBeaconRequestCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxOtherCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxOtherCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxRetryCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxRetryCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxDirectMaxRetryExpiryCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxDirectMaxRetryExpiryCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxIndirectMaxRetryExpiryCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxIndirectMaxRetryExpiryCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxErrCcaCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxErrCcaCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxErrAbortCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxErrAbortCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTxErrBusyChannelCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTxErrBusyChannelCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxTotalCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxTotalCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxUnicastCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxUnicastCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxBroadcastCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxBroadcastCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxDataCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxDataCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxDataPollCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxDataPollCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxBeaconCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxBeaconCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxBeaconRequestCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxBeaconRequestCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxOtherCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxOtherCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxAddressFilteredCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxAddressFilteredCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxDestAddrFilteredCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxDestAddrFilteredCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxDuplicatedCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxDuplicatedCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrNoFrameCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrNoFrameCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrUnknownNeighborCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrUnknownNeighborCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrInvalidSrcAddrCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrInvalidSrcAddrCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrSecCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrSecCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrFcsCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrFcsCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRxErrOtherCountWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRxErrOtherCount(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveTimestampWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveTimestamp(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePendingTimestampWithParams:")
    public native NSDictionary<NSString, ?> readAttributePendingTimestamp(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSecurityPolicyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSecurityPolicy(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeChannelPage0MaskWithParams:")
    public native NSDictionary<NSString, ?> readAttributeChannelPage0Mask(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOperationalDatasetComponentsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOperationalDatasetComponents(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeActiveNetworkFaultsListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveNetworkFaultsList(MTRReadParams params);
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
