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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceControllerParameters/*</name>*/ 
    extends /*<extends>*/MTRDeviceControllerAbstractParameters/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceControllerParametersPtr extends Ptr<MTRDeviceControllerParameters, MTRDeviceControllerParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceControllerParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceControllerParameters() {}
    protected MTRDeviceControllerParameters(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceControllerParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productAttestationAuthorityCertificates")
    public native NSArray<?> getProductAttestationAuthorityCertificates();
    @Property(selector = "setProductAttestationAuthorityCertificates:")
    public native void setProductAttestationAuthorityCertificates(NSArray<?> v);
    @Property(selector = "certificationDeclarationCertificates")
    public native NSArray<?> getCertificationDeclarationCertificates();
    @Property(selector = "setCertificationDeclarationCertificates:")
    public native void setCertificationDeclarationCertificates(NSArray<?> v);
    @Property(selector = "shouldAdvertiseOperational")
    public native boolean shouldAdvertiseOperational();
    @Property(selector = "setShouldAdvertiseOperational:")
    public native void setShouldAdvertiseOperational(boolean v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "concurrentSubscriptionEstablishmentsAllowedOnThread")
    public native @MachineSizedUInt long getConcurrentSubscriptionEstablishmentsAllowedOnThread();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setConcurrentSubscriptionEstablishmentsAllowedOnThread:")
    public native void setConcurrentSubscriptionEstablishmentsAllowedOnThread(@MachineSizedUInt long v);
    @Property(selector = "storageBehaviorConfiguration")
    public native MTRDeviceStorageBehaviorConfiguration getStorageBehaviorConfiguration();
    @Property(selector = "setStorageBehaviorConfiguration:")
    public native void setStorageBehaviorConfiguration(MTRDeviceStorageBehaviorConfiguration v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setOperationalCertificateIssuer:queue:")
    public native void setOperationalCertificateIssuer(MTROperationalCertificateIssuer operationalCertificateIssuer, DispatchQueue queue);
    @Method(selector = "setOTAProviderDelegate:queue:")
    public native void setOTAProviderDelegate(MTROTAProviderDelegate otaProviderDelegate, DispatchQueue queue);
    /*</methods>*/
}
