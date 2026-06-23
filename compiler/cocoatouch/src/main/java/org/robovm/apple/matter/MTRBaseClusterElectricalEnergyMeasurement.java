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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterElectricalEnergyMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterElectricalEnergyMeasurementPtr extends Ptr<MTRBaseClusterElectricalEnergyMeasurement, MTRBaseClusterElectricalEnergyMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterElectricalEnergyMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterElectricalEnergyMeasurement() {}
    protected MTRBaseClusterElectricalEnergyMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterElectricalEnergyMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterElectricalEnergyMeasurement(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAccuracyWithCompletion:")
    public native void readAttributeAccuracy(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterMeasurementAccuracyStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAccuracyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAccuracy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterMeasurementAccuracyStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyImportedWithCompletion:")
    public native void readAttributeCumulativeEnergyImported(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeCumulativeEnergyImportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCumulativeEnergyImported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyExportedWithCompletion:")
    public native void readAttributeCumulativeEnergyExported(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeCumulativeEnergyExportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCumulativeEnergyExported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyImportedWithCompletion:")
    public native void readAttributePeriodicEnergyImported(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePeriodicEnergyImportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePeriodicEnergyImported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyExportedWithCompletion:")
    public native void readAttributePeriodicEnergyExported(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePeriodicEnergyExportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePeriodicEnergyExported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyResetWithCompletion:")
    public native void readAttributeCumulativeEnergyReset(@Block VoidBlock2<MTRElectricalEnergyMeasurementClusterCumulativeEnergyResetStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeCumulativeEnergyResetWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCumulativeEnergyReset(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterCumulativeEnergyResetStruct, NSError> reportHandler);
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
    @Method(selector = "readAttributeAccuracyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAccuracy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterMeasurementAccuracyStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyImportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCumulativeEnergyImported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyExportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCumulativeEnergyExported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyImportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePeriodicEnergyImported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyExportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePeriodicEnergyExported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyResetWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCumulativeEnergyReset(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRElectricalEnergyMeasurementClusterCumulativeEnergyResetStruct, NSError> completion);
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
