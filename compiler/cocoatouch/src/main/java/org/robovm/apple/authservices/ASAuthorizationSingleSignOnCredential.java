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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationSingleSignOnCredential/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ASAuthorizationCredential/*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationSingleSignOnCredentialPtr extends Ptr<ASAuthorizationSingleSignOnCredential, ASAuthorizationSingleSignOnCredentialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationSingleSignOnCredential.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASAuthorizationSingleSignOnCredential() {}
    protected ASAuthorizationSingleSignOnCredential(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationSingleSignOnCredential(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public ASAuthorizationSingleSignOnCredential(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "state")
    public native String getState();
    @Property(selector = "accessToken")
    public native NSData getAccessToken();
    @Property(selector = "identityToken")
    public native NSData getIdentityToken();
    @Property(selector = "authorizedScopes")
    public native NSArray<NSString> getAuthorizedScopes();
    @Property(selector = "authenticatedResponse")
    public native NSHTTPURLResponse getAuthenticatedResponse();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "privateKeys")
    public native NSArray<?> getPrivateKeys();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
