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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurementPtr extends Ptr<MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement, MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement() {}
    protected MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterTotalVolatileOrganicCompoundsConcentrationMeasurement(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMeasuredValueWithCompletion:")
    public native void readAttributeMeasuredValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeMeasuredValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMinMeasuredValueWithCompletion:")
    public native void readAttributeMinMeasuredValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeMinMeasuredValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinMeasuredValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMaxMeasuredValueWithCompletion:")
    public native void readAttributeMaxMeasuredValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeMaxMeasuredValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxMeasuredValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeakMeasuredValueWithCompletion:")
    public native void readAttributePeakMeasuredValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePeakMeasuredValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePeakMeasuredValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeakMeasuredValueWindowWithCompletion:")
    public native void readAttributePeakMeasuredValueWindow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributePeakMeasuredValueWindowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePeakMeasuredValueWindow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAverageMeasuredValueWithCompletion:")
    public native void readAttributeAverageMeasuredValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAverageMeasuredValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageMeasuredValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAverageMeasuredValueWindowWithCompletion:")
    public native void readAttributeAverageMeasuredValueWindow(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeAverageMeasuredValueWindowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageMeasuredValueWindow(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeUncertaintyWithCompletion:")
    public native void readAttributeUncertainty(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeUncertaintyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUncertainty(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMeasurementUnitWithCompletion:")
    public native void readAttributeMeasurementUnit(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeMeasurementUnitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasurementUnit(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMeasurementMediumWithCompletion:")
    public native void readAttributeMeasurementMedium(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeMeasurementMediumWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasurementMedium(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLevelValueWithCompletion:")
    public native void readAttributeLevelValue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeLevelValueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLevelValue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeMeasuredValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMinMeasuredValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinMeasuredValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMaxMeasuredValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxMeasuredValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeakMeasuredValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePeakMeasuredValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeakMeasuredValueWindowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePeakMeasuredValueWindow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAverageMeasuredValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageMeasuredValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAverageMeasuredValueWindowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageMeasuredValueWindow(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeUncertaintyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUncertainty(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMeasurementUnitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasurementUnit(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeMeasurementMediumWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasurementMedium(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLevelValueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLevelValue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
