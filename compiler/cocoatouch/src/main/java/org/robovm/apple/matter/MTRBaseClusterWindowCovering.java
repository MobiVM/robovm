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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterWindowCovering/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterWindowCoveringPtr extends Ptr<MTRBaseClusterWindowCovering, MTRBaseClusterWindowCoveringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterWindowCovering.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterWindowCovering() {}
    protected MTRBaseClusterWindowCovering(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterWindowCovering(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterWindowCovering(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "upOrOpenWithParams:completion:")
    public native void upOrOpen(MTRWindowCoveringClusterUpOrOpenParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "upOrOpenWithCompletion:")
    public native void upOrOpen(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "downOrCloseWithParams:completion:")
    public native void downOrClose(MTRWindowCoveringClusterDownOrCloseParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "downOrCloseWithCompletion:")
    public native void downOrClose(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMotionWithParams:completion:")
    public native void stopMotion(MTRWindowCoveringClusterStopMotionParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMotionWithCompletion:")
    public native void stopMotion(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToLiftValueWithParams:completion:")
    public native void goToLiftValue(MTRWindowCoveringClusterGoToLiftValueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToLiftPercentageWithParams:completion:")
    public native void goToLiftPercentage(MTRWindowCoveringClusterGoToLiftPercentageParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToTiltValueWithParams:completion:")
    public native void goToTiltValue(MTRWindowCoveringClusterGoToTiltValueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToTiltPercentageWithParams:completion:")
    public native void goToTiltPercentage(MTRWindowCoveringClusterGoToTiltPercentageParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTypeWithCompletion:")
    public native void readAttributeType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitLiftWithCompletion:")
    public native void readAttributePhysicalClosedLimitLift(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePhysicalClosedLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitLift(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitTiltWithCompletion:")
    public native void readAttributePhysicalClosedLimitTilt(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePhysicalClosedLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitTilt(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftWithCompletion:")
    public native void readAttributeCurrentPositionLift(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLift(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltWithCompletion:")
    public native void readAttributeCurrentPositionTilt(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTilt(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsLiftWithCompletion:")
    public native void readAttributeNumberOfActuationsLift(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfActuationsLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsLift(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsTiltWithCompletion:")
    public native void readAttributeNumberOfActuationsTilt(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfActuationsTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsTilt(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeConfigStatusWithCompletion:")
    public native void readAttributeConfigStatus(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeConfigStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeConfigStatus(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercentageWithCompletion:")
    public native void readAttributeCurrentPositionLiftPercentage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionLiftPercentageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercentage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercentageWithCompletion:")
    public native void readAttributeCurrentPositionTiltPercentage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionTiltPercentageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercentage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationalStatusWithCompletion:")
    public native void readAttributeOperationalStatus(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOperationalStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalStatus(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTargetPositionLiftPercent100thsWithCompletion:")
    public native void readAttributeTargetPositionLiftPercent100ths(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTargetPositionLiftPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionLiftPercent100ths(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTargetPositionTiltPercent100thsWithCompletion:")
    public native void readAttributeTargetPositionTiltPercent100ths(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTargetPositionTiltPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionTiltPercent100ths(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEndProductTypeWithCompletion:")
    public native void readAttributeEndProductType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEndProductTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEndProductType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercent100thsWithCompletion:")
    public native void readAttributeCurrentPositionLiftPercent100ths(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionLiftPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercent100ths(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercent100thsWithCompletion:")
    public native void readAttributeCurrentPositionTiltPercent100ths(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentPositionTiltPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercent100ths(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitLiftWithCompletion:")
    public native void readAttributeInstalledOpenLimitLift(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInstalledOpenLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitLift(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitLiftWithCompletion:")
    public native void readAttributeInstalledClosedLimitLift(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInstalledClosedLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitLift(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitTiltWithCompletion:")
    public native void readAttributeInstalledOpenLimitTilt(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInstalledOpenLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitTilt(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitTiltWithCompletion:")
    public native void readAttributeInstalledClosedLimitTilt(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInstalledClosedLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitTilt(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeModeWithCompletion:")
    public native void readAttributeMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeModeWithValue:completion:")
    public native void writeAttributeMode(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeModeWithValue:params:completion:")
    public native void writeAttributeMode(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSafetyStatusWithCompletion:")
    public native void readAttributeSafetyStatus(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeSafetyStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSafetyStatus(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalClosedLimitLift(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalClosedLimitTilt(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLift(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTilt(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfActuationsLift(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfActuationsTilt(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeConfigStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeConfigStatus(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercentageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLiftPercentage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercentageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTiltPercentage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOperationalStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperationalStatus(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTargetPositionLiftPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetPositionLiftPercent100ths(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTargetPositionTiltPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetPositionTiltPercent100ths(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEndProductTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEndProductType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLiftPercent100ths(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTiltPercent100ths(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledOpenLimitLift(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledClosedLimitLift(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledOpenLimitTilt(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledClosedLimitTilt(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSafetyStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSafetyStatus(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
