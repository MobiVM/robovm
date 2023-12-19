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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterOccupancySensing/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterOccupancySensingPtr extends Ptr<MTRClusterOccupancySensing, MTRClusterOccupancySensingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterOccupancySensing.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterOccupancySensing() {}
    protected MTRClusterOccupancySensing(Handle h, long handle) { super(h, handle); }
    protected MTRClusterOccupancySensing(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterOccupancySensing(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupancyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupancy(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupancySensorType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOccupancySensorTypeBitmapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOccupancySensorTypeBitmap(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIROccupiedToUnoccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributePIROccupiedToUnoccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIROccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePIROccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIROccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePIROccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributePIRUnoccupiedToOccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePIRUnoccupiedToOccupiedThresholdWithParams:")
    public native NSDictionary<NSString, ?> readAttributePIRUnoccupiedToOccupiedThreshold(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributePIRUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributePIRUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUltrasonicOccupiedToUnoccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUltrasonicUnoccupiedToOccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUltrasonicUnoccupiedToOccupiedThreshold(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhysicalContactOccupiedToUnoccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhysicalContactUnoccupiedToOccupiedDelay(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelay(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhysicalContactUnoccupiedToOccupiedThreshold(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThreshold(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
