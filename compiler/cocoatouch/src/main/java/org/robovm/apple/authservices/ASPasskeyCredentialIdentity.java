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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPasskeyCredentialIdentity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, ASCredentialIdentity/*</implements>*/ {

    /*<ptr>*/public static class ASPasskeyCredentialIdentityPtr extends Ptr<ASPasskeyCredentialIdentity, ASPasskeyCredentialIdentityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPasskeyCredentialIdentity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASPasskeyCredentialIdentity() {}
    protected ASPasskeyCredentialIdentity(Handle h, long handle) { super(h, handle); }
    protected ASPasskeyCredentialIdentity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRelyingPartyIdentifier:userName:credentialID:userHandle:recordIdentifier:")
    public ASPasskeyCredentialIdentity(String relyingPartyIdentifier, String userName, NSData credentialID, NSData userHandle, String recordIdentifier) { super((SkipInit) null); initObject(init(relyingPartyIdentifier, userName, credentialID, userHandle, recordIdentifier)); }
    @Method(selector = "initWithCoder:")
    public ASPasskeyCredentialIdentity(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "relyingPartyIdentifier")
    public native String getRelyingPartyIdentifier();
    @Property(selector = "userName")
    public native String getUserName();
    @Property(selector = "credentialID")
    public native NSData getCredentialID();
    @Property(selector = "userHandle")
    public native NSData getUserHandle();
    @Property(selector = "recordIdentifier")
    public native String getRecordIdentifier();
    @Property(selector = "rank")
    public native @MachineSizedSInt long getRank();
    @Property(selector = "setRank:")
    public native void setRank(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "serviceIdentifier")
    public native ASCredentialServiceIdentifier getServiceIdentifier();
    @Property(selector = "user")
    public native String getUser();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRelyingPartyIdentifier:userName:credentialID:userHandle:recordIdentifier:")
    protected native @Pointer long init(String relyingPartyIdentifier, String userName, NSData credentialID, NSData userHandle, String recordIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
