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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterDishwasherAlarm/*</name>*/ 
    extends /*<extends>*/MTRGenericBaseCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterDishwasherAlarmPtr extends Ptr<MTRBaseClusterDishwasherAlarm, MTRBaseClusterDishwasherAlarmPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterDishwasherAlarm.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterDishwasherAlarm() {}
    protected MTRBaseClusterDishwasherAlarm(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterDishwasherAlarm(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterDishwasherAlarm(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "resetWithParams:completion:")
    public native void reset(MTRDishwasherAlarmClusterResetParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "modifyEnabledAlarmsWithParams:completion:")
    public native void modifyEnabledAlarms(MTRDishwasherAlarmClusterModifyEnabledAlarmsParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeMaskWithCompletion:")
    public native void readAttributeMask(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeMaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMask(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeLatchWithCompletion:")
    public native void readAttributeLatch(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeLatchWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLatch(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeStateWithCompletion:")
    public native void readAttributeState(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeState(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedWithCompletion:")
    public native void readAttributeSupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "subscribeAttributeSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeMaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMask(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeLatchWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLatch(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeState(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
