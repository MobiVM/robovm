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

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceControllerStartupParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceControllerStartupParamsPtr extends Ptr<MTRDeviceControllerStartupParams, MTRDeviceControllerStartupParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceControllerStartupParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceControllerStartupParams() {}
    protected MTRDeviceControllerStartupParams(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceControllerStartupParams(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIPK:fabricID:nocSigner:")
    public MTRDeviceControllerStartupParams(NSData ipk, NSNumber fabricID, MTRKeypair nocSigner) { super((SkipInit) null); initObject(init(ipk, fabricID, nocSigner)); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIPK:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:")
    public MTRDeviceControllerStartupParams(NSData ipk, MTRKeypair operationalKeypair, NSData operationalCertificate, NSData intermediateCertificate, NSData rootCertificate) { super((SkipInit) null); initObject(init(ipk, operationalKeypair, operationalCertificate, intermediateCertificate, rootCertificate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nocSigner")
    public native MTRKeypair getNocSigner();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricID")
    public native NSNumber getFabricID();
    @Property(selector = "ipk")
    public native NSData getIpk();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setVendorID:")
    public native void setVendorID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nodeID")
    public native NSNumber getNodeID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNodeID:")
    public native void setNodeID(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "caseAuthenticatedTags")
    public native NSSet<NSNumber> getCaseAuthenticatedTags();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setCaseAuthenticatedTags:")
    public native void setCaseAuthenticatedTags(NSSet<NSNumber> v);
    @Property(selector = "rootCertificate")
    public native NSData getRootCertificate();
    @Property(selector = "setRootCertificate:")
    public native void setRootCertificate(NSData v);
    @Property(selector = "intermediateCertificate")
    public native NSData getIntermediateCertificate();
    @Property(selector = "setIntermediateCertificate:")
    public native void setIntermediateCertificate(NSData v);
    @Property(selector = "operationalCertificate")
    public native NSData getOperationalCertificate();
    @Property(selector = "operationalKeypair")
    public native MTRKeypair getOperationalKeypair();
    @Property(selector = "setOperationalKeypair:")
    public native void setOperationalKeypair(MTRKeypair v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "operationalCertificateIssuer")
    public native MTROperationalCertificateIssuer getOperationalCertificateIssuer();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOperationalCertificateIssuer:")
    public native void setOperationalCertificateIssuer(MTROperationalCertificateIssuer v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "operationalCertificateIssuerQueue")
    public native DispatchQueue getOperationalCertificateIssuerQueue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOperationalCertificateIssuerQueue:")
    public native void setOperationalCertificateIssuerQueue(DispatchQueue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIPK:fabricID:nocSigner:")
    protected native @Pointer long init(NSData ipk, NSNumber fabricID, MTRKeypair nocSigner);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithIPK:operationalKeypair:operationalCertificate:intermediateCertificate:rootCertificate:")
    protected native @Pointer long init(NSData ipk, MTRKeypair operationalKeypair, NSData operationalCertificate, NSData intermediateCertificate, NSData rootCertificate);
    /*</methods>*/
}
