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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterServiceArea/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterServiceAreaPtr extends Ptr<MTRBaseClusterServiceArea, MTRBaseClusterServiceAreaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterServiceArea.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterServiceArea() {}
    protected MTRBaseClusterServiceArea(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterServiceArea(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterServiceArea(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "selectAreasWithParams:completion:")
    public native void selectAreas(MTRServiceAreaClusterSelectAreasParams params, @Block VoidBlock2<MTRServiceAreaClusterSelectAreasResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "skipAreaWithParams:completion:")
    public native void skipArea(MTRServiceAreaClusterSkipAreaParams params, @Block VoidBlock2<MTRServiceAreaClusterSkipAreaResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedAreasWithCompletion:")
    public native void readAttributeSupportedAreas(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSupportedAreasWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupportedAreas(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedMapsWithCompletion:")
    public native void readAttributeSupportedMaps(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSupportedMapsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupportedMaps(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSelectedAreasWithCompletion:")
    public native void readAttributeSelectedAreas(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSelectedAreasWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSelectedAreas(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCurrentAreaWithCompletion:")
    public native void readAttributeCurrentArea(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentAreaWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentArea(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeEstimatedEndTimeWithCompletion:")
    public native void readAttributeEstimatedEndTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeEstimatedEndTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEstimatedEndTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeProgressWithCompletion:")
    public native void readAttributeProgress(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeProgressWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeProgress(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
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
    @Method(selector = "readAttributeSupportedAreasWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupportedAreas(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedMapsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupportedMaps(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSelectedAreasWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSelectedAreas(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCurrentAreaWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentArea(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeEstimatedEndTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEstimatedEndTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeProgressWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeProgress(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
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
