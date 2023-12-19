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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterPumpConfigurationAndControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterPumpConfigurationAndControlPtr extends Ptr<MTRClusterPumpConfigurationAndControl, MTRClusterPumpConfigurationAndControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterPumpConfigurationAndControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterPumpConfigurationAndControl() {}
    protected MTRClusterPumpConfigurationAndControl(Handle h, long handle) { super(h, handle); }
    protected MTRClusterPumpConfigurationAndControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterPumpConfigurationAndControl(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "readAttributeMaxPressureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxPressure(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxSpeedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxSpeed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxFlowWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxFlow(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinConstPressureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinConstPressure(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxConstPressureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxConstPressure(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinCompPressureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinCompPressure(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxCompPressureWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxCompPressure(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinConstSpeedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinConstSpeed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxConstSpeedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxConstSpeed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinConstFlowWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinConstFlow(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxConstFlowWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxConstFlow(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinConstTempWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinConstTemp(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxConstTempWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxConstTemp(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePumpStatusWithParams:")
    public native NSDictionary<NSString, ?> readAttributePumpStatus(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEffectiveOperationModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEffectiveOperationMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEffectiveControlModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEffectiveControlMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCapacityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCapacity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSpeedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSpeed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLifetimeRunningHoursWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLifetimeRunningHours(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLifetimeRunningHoursWithValue:expectedValueInterval:")
    public native void writeAttributeLifetimeRunningHours(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLifetimeRunningHoursWithValue:expectedValueInterval:params:")
    public native void writeAttributeLifetimeRunningHours(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributePower(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLifetimeEnergyConsumedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLifetimeEnergyConsumed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLifetimeEnergyConsumedWithValue:expectedValueInterval:")
    public native void writeAttributeLifetimeEnergyConsumed(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeLifetimeEnergyConsumedWithValue:expectedValueInterval:params:")
    public native void writeAttributeLifetimeEnergyConsumed(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOperationModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOperationMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOperationModeWithValue:expectedValueInterval:")
    public native void writeAttributeOperationMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOperationModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOperationMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeControlModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeControlMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeControlModeWithValue:expectedValueInterval:")
    public native void writeAttributeControlMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeControlModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeControlMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
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
