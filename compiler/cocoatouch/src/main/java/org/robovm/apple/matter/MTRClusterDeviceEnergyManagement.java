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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterDeviceEnergyManagement/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterDeviceEnergyManagementPtr extends Ptr<MTRClusterDeviceEnergyManagement, MTRClusterDeviceEnergyManagementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterDeviceEnergyManagement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterDeviceEnergyManagement() {}
    protected MTRClusterDeviceEnergyManagement(Handle h, long handle) { super(h, handle); }
    protected MTRClusterDeviceEnergyManagement(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterDeviceEnergyManagement(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "powerAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void powerAdjustRequest(MTRDeviceEnergyManagementClusterPowerAdjustRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "cancelPowerAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void cancelPowerAdjustRequest(MTRDeviceEnergyManagementClusterCancelPowerAdjustRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "cancelPowerAdjustRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void cancelPowerAdjustRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "startTimeAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startTimeAdjustRequest(MTRDeviceEnergyManagementClusterStartTimeAdjustRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "pauseRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseRequest(MTRDeviceEnergyManagementClusterPauseRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "resumeRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resumeRequest(MTRDeviceEnergyManagementClusterResumeRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "resumeRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void resumeRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "modifyForecastRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void modifyForecastRequest(MTRDeviceEnergyManagementClusterModifyForecastRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "requestConstraintBasedForecastWithParams:expectedValues:expectedValueInterval:completion:")
    public native void requestConstraintBasedForecast(MTRDeviceEnergyManagementClusterRequestConstraintBasedForecastParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "cancelRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void cancelRequest(MTRDeviceEnergyManagementClusterCancelRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "cancelRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void cancelRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeESATypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeESAType(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeESACanGenerateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeESACanGenerate(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeESAStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeESAState(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAbsMinPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMinPower(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAbsMaxPowerWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAbsMaxPower(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributePowerAdjustmentCapabilityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePowerAdjustmentCapability(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeForecastWithParams:")
    public native NSDictionary<NSString, ?> readAttributeForecast(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeOptOutStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOptOutState(MTRReadParams params);
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
