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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterElectricalPowerMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterElectricalPowerMeasurementPtr extends Ptr<MTRBaseClusterElectricalPowerMeasurement, MTRBaseClusterElectricalPowerMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterElectricalPowerMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterElectricalPowerMeasurement() {}
    protected MTRBaseClusterElectricalPowerMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterElectricalPowerMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterElectricalPowerMeasurement(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePowerModeWithCompletion:")
    public native void readAttributePowerMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePowerModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNumberOfMeasurementTypesWithCompletion:")
    public native void readAttributeNumberOfMeasurementTypes(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfMeasurementTypesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfMeasurementTypes(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAccuracyWithCompletion:")
    public native void readAttributeAccuracy(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAccuracyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAccuracy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRangesWithCompletion:")
    public native void readAttributeRanges(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeRangesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRanges(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeVoltageWithCompletion:")
    public native void readAttributeVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActiveCurrentWithCompletion:")
    public native void readAttributeActiveCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeActiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactiveCurrentWithCompletion:")
    public native void readAttributeReactiveCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeReactiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentCurrentWithCompletion:")
    public native void readAttributeApparentCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeApparentCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActivePowerWithCompletion:")
    public native void readAttributeActivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeActivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactivePowerWithCompletion:")
    public native void readAttributeReactivePower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeReactivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentPowerWithCompletion:")
    public native void readAttributeApparentPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeApparentPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSVoltageWithCompletion:")
    public native void readAttributeRMSVoltage(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeRMSVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRMSVoltage(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSCurrentWithCompletion:")
    public native void readAttributeRMSCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeRMSCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRMSCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSPowerWithCompletion:")
    public native void readAttributeRMSPower(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeRMSPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRMSPower(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFrequencyWithCompletion:")
    public native void readAttributeFrequency(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeFrequencyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFrequency(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicCurrentsWithCompletion:")
    public native void readAttributeHarmonicCurrents(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeHarmonicCurrentsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHarmonicCurrents(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicPhasesWithCompletion:")
    public native void readAttributeHarmonicPhases(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeHarmonicPhasesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHarmonicPhases(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePowerFactorWithCompletion:")
    public native void readAttributePowerFactor(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePowerFactorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactor(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNeutralCurrentWithCompletion:")
    public native void readAttributeNeutralCurrent(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeNeutralCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeutralCurrent(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributePowerModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNumberOfMeasurementTypesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfMeasurementTypes(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAccuracyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAccuracy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRangesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRanges(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactiveCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRMSVoltage(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRMSCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRMSPower(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFrequencyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFrequency(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicCurrentsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHarmonicCurrents(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicPhasesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHarmonicPhases(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePowerFactorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactor(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNeutralCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNeutralCurrent(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
