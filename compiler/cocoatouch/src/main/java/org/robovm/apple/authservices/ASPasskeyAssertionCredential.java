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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPasskeyAssertionCredential/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ASAuthorizationCredential/*</implements>*/ {

    /*<ptr>*/public static class ASPasskeyAssertionCredentialPtr extends Ptr<ASPasskeyAssertionCredential, ASPasskeyAssertionCredentialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPasskeyAssertionCredential.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASPasskeyAssertionCredential() {}
    protected ASPasskeyAssertionCredential(Handle h, long handle) { super(h, handle); }
    protected ASPasskeyAssertionCredential(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserHandle:relyingParty:signature:clientDataHash:authenticatorData:credentialID:")
    public ASPasskeyAssertionCredential(NSData userHandle, String relyingParty, NSData signature, NSData clientDataHash, NSData authenticatorData, NSData credentialID) { super((SkipInit) null); initObject(init(userHandle, relyingParty, signature, clientDataHash, authenticatorData, credentialID)); }
    @Method(selector = "initWithCoder:")
    public ASPasskeyAssertionCredential(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userHandle")
    public native NSData getUserHandle();
    @Property(selector = "relyingParty")
    public native String getRelyingParty();
    @Property(selector = "signature")
    public native NSData getSignature();
    @Property(selector = "clientDataHash")
    public native NSData getClientDataHash();
    @Property(selector = "authenticatorData")
    public native NSData getAuthenticatorData();
    @Property(selector = "credentialID")
    public native NSData getCredentialID();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserHandle:relyingParty:signature:clientDataHash:authenticatorData:credentialID:")
    protected native @Pointer long init(NSData userHandle, String relyingParty, NSData signature, NSData clientDataHash, NSData authenticatorData, NSData credentialID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
