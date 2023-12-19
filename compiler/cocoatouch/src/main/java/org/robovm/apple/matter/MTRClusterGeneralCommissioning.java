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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterGeneralCommissioning/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterGeneralCommissioningPtr extends Ptr<MTRClusterGeneralCommissioning, MTRClusterGeneralCommissioningPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterGeneralCommissioning.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterGeneralCommissioning() {}
    protected MTRClusterGeneralCommissioning(Handle h, long handle) { super(h, handle); }
    protected MTRClusterGeneralCommissioning(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterGeneralCommissioning(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "armFailSafeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void armFailSafe(MTRGeneralCommissioningClusterArmFailSafeParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRGeneralCommissioningClusterArmFailSafeResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "setRegulatoryConfigWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setRegulatoryConfig(MTRGeneralCommissioningClusterSetRegulatoryConfigParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRGeneralCommissioningClusterSetRegulatoryConfigResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "commissioningCompleteWithParams:expectedValues:expectedValueInterval:completion:")
    public native void commissioningComplete(MTRGeneralCommissioningClusterCommissioningCompleteParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRGeneralCommissioningClusterCommissioningCompleteResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "commissioningCompleteWithExpectedValues:expectedValueInterval:completion:")
    public native void commissioningComplete(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRGeneralCommissioningClusterCommissioningCompleteResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBreadcrumbWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBreadcrumb(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeBreadcrumbWithValue:expectedValueInterval:")
    public native void writeAttributeBreadcrumb(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeBreadcrumbWithValue:expectedValueInterval:params:")
    public native void writeAttributeBreadcrumb(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeBasicCommissioningInfoWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBasicCommissioningInfo(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRegulatoryConfigWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRegulatoryConfig(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeLocationCapabilityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocationCapability(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSupportsConcurrentConnectionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportsConcurrentConnection(MTRReadParams params);
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
