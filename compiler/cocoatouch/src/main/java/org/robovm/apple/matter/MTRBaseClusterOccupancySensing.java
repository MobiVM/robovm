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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterOccupancySensing/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterOccupancySensingPtr extends Ptr<MTRBaseClusterOccupancySensing, MTRBaseClusterOccupancySensingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterOccupancySensing.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterOccupancySensing() {}
    protected MTRBaseClusterOccupancySensing(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterOccupancySensing(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterOccupancySensing(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "readAttributeOccupancyWithCompletion:")
    public native void readAttributeOccupancy(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupancyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancy(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeWithCompletion:")
    public native void readAttributeOccupancySensorType(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupancySensorTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorType(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeBitmapWithCompletion:")
    public native void readAttributeOccupancySensorTypeBitmap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOccupancySensorTypeBitmapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorTypeBitmap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIROccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributePIROccupiedToUnoccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIROccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributePIROccupiedToUnoccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIROccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributePIROccupiedToUnoccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePIROccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIROccupiedToUnoccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributePIRUnoccupiedToOccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePIRUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIRUnoccupiedToOccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributePIRUnoccupiedToOccupiedThreshold(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedThreshold(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedThreshold(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIRUnoccupiedToOccupiedThreshold(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributeUltrasonicOccupiedToUnoccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicOccupiedToUnoccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedThreshold(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThreshold(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThreshold(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedThreshold(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributePhysicalContactOccupiedToUnoccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactOccupiedToUnoccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedDelay(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelay(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelay(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedDelay(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedThreshold(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThreshold(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThreshold(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedThreshold(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
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
    @Method(selector = "readAttributeOccupancyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancy(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancySensorType(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeBitmapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancySensorTypeBitmap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIROccupiedToUnoccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIRUnoccupiedToOccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIRUnoccupiedToOccupiedThreshold(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicOccupiedToUnoccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedThreshold(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactOccupiedToUnoccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedDelay(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedThreshold(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
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
