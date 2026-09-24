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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROperationalCertificateChain/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROperationalCertificateChainPtr extends Ptr<MTROperationalCertificateChain, MTROperationalCertificateChainPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROperationalCertificateChain.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTROperationalCertificateChain() {}
    protected MTROperationalCertificateChain(Handle h, long handle) { super(h, handle); }
    protected MTROperationalCertificateChain(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOperationalCertificate:intermediateCertificate:rootCertificate:adminSubject:")
    public MTROperationalCertificateChain(NSData operationalCertificate, NSData intermediateCertificate, NSData rootCertificate, NSNumber adminSubject) { super((SkipInit) null); initObject(init(operationalCertificate, intermediateCertificate, rootCertificate, adminSubject)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "operationalCertificate")
    public native NSData getOperationalCertificate();
    @Property(selector = "setOperationalCertificate:")
    public native void setOperationalCertificate(NSData v);
    @Property(selector = "intermediateCertificate")
    public native NSData getIntermediateCertificate();
    @Property(selector = "setIntermediateCertificate:")
    public native void setIntermediateCertificate(NSData v);
    @Property(selector = "rootCertificate")
    public native NSData getRootCertificate();
    @Property(selector = "setRootCertificate:")
    public native void setRootCertificate(NSData v);
    @Property(selector = "adminSubject")
    public native NSNumber getAdminSubject();
    @Property(selector = "setAdminSubject:")
    public native void setAdminSubject(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOperationalCertificate:intermediateCertificate:rootCertificate:adminSubject:")
    protected native @Pointer long init(NSData operationalCertificate, NSData intermediateCertificate, NSData rootCertificate, NSNumber adminSubject);
    /*</methods>*/
}
