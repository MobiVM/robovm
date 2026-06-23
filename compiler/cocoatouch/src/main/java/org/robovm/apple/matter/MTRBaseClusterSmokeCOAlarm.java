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
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterSmokeCOAlarm/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterSmokeCOAlarmPtr extends Ptr<MTRBaseClusterSmokeCOAlarm, MTRBaseClusterSmokeCOAlarmPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterSmokeCOAlarm.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterSmokeCOAlarm() {}
    protected MTRBaseClusterSmokeCOAlarm(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterSmokeCOAlarm(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterSmokeCOAlarm(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "selfTestRequestWithParams:completion:")
    public native void selfTestRequest(MTRSmokeCOAlarmClusterSelfTestRequestParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "selfTestRequestWithCompletion:")
    public native void selfTestRequest(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeExpressedStateWithCompletion:")
    public native void readAttributeExpressedState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeExpressedStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExpressedState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeSmokeStateWithCompletion:")
    public native void readAttributeSmokeState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeSmokeStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSmokeState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCOStateWithCompletion:")
    public native void readAttributeCOState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeCOStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCOState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeBatteryAlertWithCompletion:")
    public native void readAttributeBatteryAlert(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeBatteryAlertWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBatteryAlert(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDeviceMutedWithCompletion:")
    public native void readAttributeDeviceMuted(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeDeviceMutedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDeviceMuted(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeTestInProgressWithCompletion:")
    public native void readAttributeTestInProgress(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeTestInProgressWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTestInProgress(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHardwareFaultAlertWithCompletion:")
    public native void readAttributeHardwareFaultAlert(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeHardwareFaultAlertWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHardwareFaultAlert(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeEndOfServiceAlertWithCompletion:")
    public native void readAttributeEndOfServiceAlert(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeEndOfServiceAlertWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEndOfServiceAlert(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInterconnectSmokeAlarmWithCompletion:")
    public native void readAttributeInterconnectSmokeAlarm(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeInterconnectSmokeAlarmWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInterconnectSmokeAlarm(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInterconnectCOAlarmWithCompletion:")
    public native void readAttributeInterconnectCOAlarm(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeInterconnectCOAlarmWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInterconnectCOAlarm(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeContaminationStateWithCompletion:")
    public native void readAttributeContaminationState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeContaminationStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeContaminationState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeSmokeSensitivityLevelWithCompletion:")
    public native void readAttributeSmokeSensitivityLevel(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeSmokeSensitivityLevelWithValue:completion:")
    public native void writeAttributeSmokeSensitivityLevel(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeSmokeSensitivityLevelWithValue:params:completion:")
    public native void writeAttributeSmokeSensitivityLevel(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeSmokeSensitivityLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSmokeSensitivityLevel(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeExpiryDateWithCompletion:")
    public native void readAttributeExpiryDate(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeExpiryDateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExpiryDate(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeExpressedStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExpressedState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeSmokeStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSmokeState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCOStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCOState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeBatteryAlertWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBatteryAlert(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDeviceMutedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDeviceMuted(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeTestInProgressWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTestInProgress(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHardwareFaultAlertWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHardwareFaultAlert(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeEndOfServiceAlertWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEndOfServiceAlert(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInterconnectSmokeAlarmWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInterconnectSmokeAlarm(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInterconnectCOAlarmWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInterconnectCOAlarm(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeContaminationStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeContaminationState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeSmokeSensitivityLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSmokeSensitivityLevel(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeExpiryDateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExpiryDate(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
