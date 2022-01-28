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
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest/*</name>*/ 
    extends /*<extends>*/ASAuthorizationRequest/*</extends>*/ 
    /*<implements>*/implements ASAuthorizationPublicKeyCredentialRegistrationRequest/*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationPlatformPublicKeyCredentialRegistrationRequestPtr extends Ptr<ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest, ASAuthorizationPlatformPublicKeyCredentialRegistrationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest() {}
    protected ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "relyingPartyIdentifier")
    public native String getRelyingPartyIdentifier();
    @Property(selector = "userID")
    public native NSData getUserID();
    @Property(selector = "setUserID:")
    public native void setUserID(NSData v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public native void setDisplayName(String v);
    @Property(selector = "challenge")
    public native NSData getChallenge();
    @Property(selector = "setChallenge:")
    public native void setChallenge(NSData v);
    @Property(selector = "userVerificationPreference")
    public native String getUserVerificationPreference();
    @Property(selector = "setUserVerificationPreference:")
    public native void setUserVerificationPreference(String v);
    @Property(selector = "attestationPreference")
    public native String getAttestationPreference();
    @Property(selector = "setAttestationPreference:")
    public native void setAttestationPreference(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
