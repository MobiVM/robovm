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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterBasicInformation/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterBasicInformationPtr extends Ptr<MTRClusterBasicInformation, MTRClusterBasicInformationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterBasicInformation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterBasicInformation() {}
    protected MTRClusterBasicInformation(Handle h, long handle) { super(h, handle); }
    protected MTRClusterBasicInformation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterBasicInformation(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDataModelRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDataModelRevision(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeVendorNameWithParams:")
    public native NSDictionary<NSString, ?> readAttributeVendorName(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeVendorIDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeVendorID(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeProductNameWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProductName(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeProductIDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProductID(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNodeLabelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNodeLabel(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNodeLabelWithValue:expectedValueInterval:")
    public native void writeAttributeNodeLabel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNodeLabelWithValue:expectedValueInterval:params:")
    public native void writeAttributeNodeLabel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocation(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocationWithValue:expectedValueInterval:")
    public native void writeAttributeLocation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocationWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocation(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeHardwareVersionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHardwareVersion(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeHardwareVersionStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeHardwareVersionString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSoftwareVersionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSoftwareVersion(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSoftwareVersionStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSoftwareVersionString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeManufacturingDateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeManufacturingDate(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePartNumberWithParams:")
    public native NSDictionary<NSString, ?> readAttributePartNumber(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeProductURLWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProductURL(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeProductLabelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProductLabel(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeSerialNumberWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSerialNumber(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLocalConfigDisabledWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocalConfigDisabled(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalConfigDisabledWithValue:expectedValueInterval:")
    public native void writeAttributeLocalConfigDisabled(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLocalConfigDisabledWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalConfigDisabled(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeReachableWithParams:")
    public native NSDictionary<NSString, ?> readAttributeReachable(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUniqueIDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUniqueID(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCapabilityMinimaWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCapabilityMinima(MTRReadParams params);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "readAttributeProductAppearanceWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProductAppearance(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
