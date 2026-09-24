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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterThreadBorderRouterManagement/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterThreadBorderRouterManagementPtr extends Ptr<MTRClusterThreadBorderRouterManagement, MTRClusterThreadBorderRouterManagementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterThreadBorderRouterManagement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterThreadBorderRouterManagement() {}
    protected MTRClusterThreadBorderRouterManagement(Handle h, long handle) { super(h, handle); }
    protected MTRClusterThreadBorderRouterManagement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterThreadBorderRouterManagement(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getActiveDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getActiveDatasetRequest(MTRThreadBorderRouterManagementClusterGetActiveDatasetRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRThreadBorderRouterManagementClusterDatasetResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getActiveDatasetRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void getActiveDatasetRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRThreadBorderRouterManagementClusterDatasetResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getPendingDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getPendingDatasetRequest(MTRThreadBorderRouterManagementClusterGetPendingDatasetRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRThreadBorderRouterManagementClusterDatasetResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "getPendingDatasetRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void getPendingDatasetRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRThreadBorderRouterManagementClusterDatasetResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setActiveDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setActiveDatasetRequest(MTRThreadBorderRouterManagementClusterSetActiveDatasetRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setPendingDatasetRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setPendingDatasetRequest(MTRThreadBorderRouterManagementClusterSetPendingDatasetRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeBorderRouterNameWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBorderRouterName(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeBorderAgentIDWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBorderAgentID(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeThreadVersionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeThreadVersion(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeInterfaceEnabledWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInterfaceEnabled(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeActiveDatasetTimestampWithParams:")
    public native NSDictionary<NSString, ?> readAttributeActiveDatasetTimestamp(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributePendingDatasetTimestampWithParams:")
    public native NSDictionary<NSString, ?> readAttributePendingDatasetTimestamp(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
