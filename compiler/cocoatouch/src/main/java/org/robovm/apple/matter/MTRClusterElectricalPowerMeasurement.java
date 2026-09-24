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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterElectricalPowerMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterElectricalPowerMeasurementPtr extends Ptr<MTRClusterElectricalPowerMeasurement, MTRClusterElectricalPowerMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterElectricalPowerMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterElectricalPowerMeasurement() {}
    protected MTRClusterElectricalPowerMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRClusterElectricalPowerMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterElectricalPowerMeasurement(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePowerModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerMode(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNumberOfMeasurementTypesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfMeasurementTypes(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAccuracyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAccuracy(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRangesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRanges(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActiveCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactiveCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactiveCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApparentCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeActivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActivePower(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeReactivePowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReactivePower(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeApparentPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeApparentPower(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSVoltageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRMSVoltage(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRMSCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRMSPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRMSPower(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFrequency(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicCurrentsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHarmonicCurrents(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeHarmonicPhasesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHarmonicPhases(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePowerFactorWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerFactor(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeNeutralCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNeutralCurrent(MTRReadParams params);
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
