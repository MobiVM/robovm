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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterActivatedCarbonFilterMonitoring/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterActivatedCarbonFilterMonitoringPtr extends Ptr<MTRClusterActivatedCarbonFilterMonitoring, MTRClusterActivatedCarbonFilterMonitoringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterActivatedCarbonFilterMonitoring.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterActivatedCarbonFilterMonitoring() {}
    protected MTRClusterActivatedCarbonFilterMonitoring(Handle h, long handle) { super(h, handle); }
    protected MTRClusterActivatedCarbonFilterMonitoring(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterActivatedCarbonFilterMonitoring(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "resetConditionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resetCondition(MTRActivatedCarbonFilterMonitoringClusterResetConditionParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "resetConditionWithExpectedValues:expectedValueInterval:completion:")
    public native void resetCondition(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeConditionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCondition(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDegradationDirectionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDegradationDirection(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeChangeIndicationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeChangeIndication(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeInPlaceIndicatorWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInPlaceIndicator(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLastChangedTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLastChangedTime(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeLastChangedTimeWithValue:expectedValueInterval:")
    public native void writeAttributeLastChangedTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeLastChangedTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeLastChangedTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReplacementProductListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReplacementProductList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
