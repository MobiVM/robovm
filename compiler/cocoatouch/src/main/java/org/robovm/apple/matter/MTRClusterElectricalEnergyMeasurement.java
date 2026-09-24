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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterElectricalEnergyMeasurement/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterElectricalEnergyMeasurementPtr extends Ptr<MTRClusterElectricalEnergyMeasurement, MTRClusterElectricalEnergyMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterElectricalEnergyMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterElectricalEnergyMeasurement() {}
    protected MTRClusterElectricalEnergyMeasurement(Handle h, long handle) { super(h, handle); }
    protected MTRClusterElectricalEnergyMeasurement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterElectricalEnergyMeasurement(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAccuracyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAccuracy(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyImportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCumulativeEnergyImported(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyExportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCumulativeEnergyExported(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyImportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributePeriodicEnergyImported(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributePeriodicEnergyExportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributePeriodicEnergyExported(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCumulativeEnergyResetWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCumulativeEnergyReset(MTRReadParams params);
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
