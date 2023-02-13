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
package org.robovm.apple.authservices;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ASAuthorizationPublicKeyCredentialRegistrationRequest/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "relyingPartyIdentifier")
    String getRelyingPartyIdentifier();
    @Property(selector = "userID")
    NSData getUserID();
    @Property(selector = "setUserID:")
    void setUserID(NSData v);
    @Property(selector = "name")
    String getName();
    @Property(selector = "setName:")
    void setName(String v);
    @Property(selector = "displayName")
    String getDisplayName();
    @Property(selector = "setDisplayName:")
    void setDisplayName(String v);
    @Property(selector = "challenge")
    NSData getChallenge();
    @Property(selector = "setChallenge:")
    void setChallenge(NSData v);
    @Property(selector = "userVerificationPreference")
    ASAuthorizationPublicKeyCredentialUserVerificationPreference getUserVerificationPreference();
    @Property(selector = "setUserVerificationPreference:")
    void setUserVerificationPreference(ASAuthorizationPublicKeyCredentialUserVerificationPreference v);
    @Property(selector = "attestationPreference")
    ASAuthorizationPublicKeyCredentialAttestationKind getAttestationPreference();
    @Property(selector = "setAttestationPreference:")
    void setAttestationPreference(ASAuthorizationPublicKeyCredentialAttestationKind v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
