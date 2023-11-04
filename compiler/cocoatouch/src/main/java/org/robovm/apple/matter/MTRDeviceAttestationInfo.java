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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceAttestationInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceAttestationInfoPtr extends Ptr<MTRDeviceAttestationInfo, MTRDeviceAttestationInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceAttestationInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDeviceAttestationInfo() {}
    protected MTRDeviceAttestationInfo(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceAttestationInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDeviceAttestationChallenge:nonce:elementsTLV:elementsSignature:deviceAttestationCertificate:productAttestationIntermediateCertificate:certificationDeclaration:firmwareInfo:")
    public MTRDeviceAttestationInfo(NSData challenge, NSData nonce, NSData elementsTLV, NSData elementsSignature, NSData deviceAttestationCertificate, NSData processAttestationIntermediateCertificate, NSData certificationDeclaration, NSData firmwareInfo) { super((SkipInit) null); initObject(init(challenge, nonce, elementsTLV, elementsSignature, deviceAttestationCertificate, processAttestationIntermediateCertificate, certificationDeclaration, firmwareInfo)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "challenge")
    public native NSData getChallenge();
    @Property(selector = "nonce")
    public native NSData getNonce();
    @Property(selector = "elementsTLV")
    public native NSData getElementsTLV();
    @Property(selector = "elementsSignature")
    public native NSData getElementsSignature();
    @Property(selector = "deviceAttestationCertificate")
    public native NSData getDeviceAttestationCertificate();
    @Property(selector = "productAttestationIntermediateCertificate")
    public native NSData getProductAttestationIntermediateCertificate();
    @Property(selector = "certificationDeclaration")
    public native NSData getCertificationDeclaration();
    @Property(selector = "firmwareInfo")
    public native NSData getFirmwareInfo();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDeviceAttestationChallenge:nonce:elementsTLV:elementsSignature:deviceAttestationCertificate:productAttestationIntermediateCertificate:certificationDeclaration:firmwareInfo:")
    protected native @Pointer long init(NSData challenge, NSData nonce, NSData elementsTLV, NSData elementsSignature, NSData deviceAttestationCertificate, NSData processAttestationIntermediateCertificate, NSData certificationDeclaration, NSData firmwareInfo);
    /*</methods>*/
}
