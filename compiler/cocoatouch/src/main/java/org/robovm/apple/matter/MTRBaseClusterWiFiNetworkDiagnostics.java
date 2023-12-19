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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterWiFiNetworkDiagnostics/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterWiFiNetworkDiagnosticsPtr extends Ptr<MTRBaseClusterWiFiNetworkDiagnostics, MTRBaseClusterWiFiNetworkDiagnosticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterWiFiNetworkDiagnostics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterWiFiNetworkDiagnostics() {}
    protected MTRBaseClusterWiFiNetworkDiagnostics(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterWiFiNetworkDiagnostics(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterWiFiNetworkDiagnostics(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    public native void resetCounts(MTRWiFiNetworkDiagnosticsClusterResetCountsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "resetCountsWithCompletion:")
    public native void resetCounts(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBSSIDWithCompletion:")
    public native void readAttributeBSSID(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBSSIDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBSSID(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSecurityTypeWithCompletion:")
    public native void readAttributeSecurityType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSecurityTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSecurityType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWiFiVersionWithCompletion:")
    public native void readAttributeWiFiVersion(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWiFiVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWiFiVersion(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChannelNumberWithCompletion:")
    public native void readAttributeChannelNumber(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeChannelNumberWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelNumber(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRSSIWithCompletion:")
    public native void readAttributeRSSI(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRSSIWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRSSI(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBeaconLostCountWithCompletion:")
    public native void readAttributeBeaconLostCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBeaconLostCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBeaconLostCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBeaconRxCountWithCompletion:")
    public native void readAttributeBeaconRxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBeaconRxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBeaconRxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketMulticastRxCountWithCompletion:")
    public native void readAttributePacketMulticastRxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketMulticastRxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketMulticastRxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketMulticastTxCountWithCompletion:")
    public native void readAttributePacketMulticastTxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketMulticastTxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketMulticastTxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketUnicastRxCountWithCompletion:")
    public native void readAttributePacketUnicastRxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketUnicastRxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketUnicastRxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketUnicastTxCountWithCompletion:")
    public native void readAttributePacketUnicastTxCount(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePacketUnicastTxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketUnicastTxCount(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentMaxRateWithCompletion:")
    public native void readAttributeCurrentMaxRate(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentMaxRateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentMaxRate(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeBSSIDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBSSID(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSecurityTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSecurityType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWiFiVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWiFiVersion(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeChannelNumberWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChannelNumber(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRSSIWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRSSI(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBeaconLostCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBeaconLostCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBeaconRxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBeaconRxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketMulticastRxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketMulticastRxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketMulticastTxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketMulticastTxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketUnicastRxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketUnicastRxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePacketUnicastTxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketUnicastTxCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentMaxRateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentMaxRate(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOverrunCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverrunCount(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
