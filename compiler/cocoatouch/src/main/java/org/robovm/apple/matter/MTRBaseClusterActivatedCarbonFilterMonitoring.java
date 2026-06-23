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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterActivatedCarbonFilterMonitoring/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterActivatedCarbonFilterMonitoringPtr extends Ptr<MTRBaseClusterActivatedCarbonFilterMonitoring, MTRBaseClusterActivatedCarbonFilterMonitoringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterActivatedCarbonFilterMonitoring.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterActivatedCarbonFilterMonitoring() {}
    protected MTRBaseClusterActivatedCarbonFilterMonitoring(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterActivatedCarbonFilterMonitoring(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterActivatedCarbonFilterMonitoring(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "resetConditionWithParams:completion:")
    public native void resetCondition(MTRActivatedCarbonFilterMonitoringClusterResetConditionParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "resetConditionWithCompletion:")
    public native void resetCondition(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeConditionWithCompletion:")
    public native void readAttributeCondition(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeConditionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCondition(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDegradationDirectionWithCompletion:")
    public native void readAttributeDegradationDirection(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeDegradationDirectionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDegradationDirection(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeChangeIndicationWithCompletion:")
    public native void readAttributeChangeIndication(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeChangeIndicationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChangeIndication(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInPlaceIndicatorWithCompletion:")
    public native void readAttributeInPlaceIndicator(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeInPlaceIndicatorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInPlaceIndicator(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLastChangedTimeWithCompletion:")
    public native void readAttributeLastChangedTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeLastChangedTimeWithValue:completion:")
    public native void writeAttributeLastChangedTime(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeLastChangedTimeWithValue:params:completion:")
    public native void writeAttributeLastChangedTime(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeLastChangedTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLastChangedTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReplacementProductListWithCompletion:")
    public native void readAttributeReplacementProductList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "subscribeAttributeReplacementProductListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReplacementProductList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
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
    @Method(selector = "readAttributeConditionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCondition(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDegradationDirectionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDegradationDirection(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeChangeIndicationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChangeIndication(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInPlaceIndicatorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInPlaceIndicator(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLastChangedTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLastChangedTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReplacementProductListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReplacementProductList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
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
