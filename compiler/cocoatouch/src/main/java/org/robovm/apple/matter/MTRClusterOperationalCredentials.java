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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterOperationalCredentials/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterOperationalCredentialsPtr extends Ptr<MTRClusterOperationalCredentials, MTRClusterOperationalCredentialsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterOperationalCredentials.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterOperationalCredentials() {}
    protected MTRClusterOperationalCredentials(Handle h, long handle) { super(h, handle); }
    protected MTRClusterOperationalCredentials(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterOperationalCredentials(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "attestationRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void attestationRequest(MTROperationalCredentialsClusterAttestationRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterAttestationResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "certificateChainRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void certificateChainRequest(MTROperationalCredentialsClusterCertificateChainRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterCertificateChainResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "CSRRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void CSRRequest(MTROperationalCredentialsClusterCSRRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterCSRResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "addNOCWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addNOC(MTROperationalCredentialsClusterAddNOCParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterNOCResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "updateNOCWithParams:expectedValues:expectedValueInterval:completion:")
    public native void updateNOC(MTROperationalCredentialsClusterUpdateNOCParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterNOCResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "updateFabricLabelWithParams:expectedValues:expectedValueInterval:completion:")
    public native void updateFabricLabel(MTROperationalCredentialsClusterUpdateFabricLabelParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterNOCResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "removeFabricWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeFabric(MTROperationalCredentialsClusterRemoveFabricParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTROperationalCredentialsClusterNOCResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "addTrustedRootCertificateWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addTrustedRootCertificate(MTROperationalCredentialsClusterAddTrustedRootCertificateParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNOCsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNOCs(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFabricsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFabrics(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSupportedFabricsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportedFabrics(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCommissionedFabricsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCommissionedFabrics(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTrustedRootCertificatesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTrustedRootCertificates(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentFabricIndexWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentFabricIndex(MTRReadParams params);
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
