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
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationWebBrowserPublicKeyCredentialManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationWebBrowserPublicKeyCredentialManagerPtr extends Ptr<ASAuthorizationWebBrowserPublicKeyCredentialManager, ASAuthorizationWebBrowserPublicKeyCredentialManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationWebBrowserPublicKeyCredentialManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAuthorizationWebBrowserPublicKeyCredentialManager() {}
    protected ASAuthorizationWebBrowserPublicKeyCredentialManager(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationWebBrowserPublicKeyCredentialManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationStateForPlatformCredentials")
    public native ASAuthorizationWebBrowserPublicKeyCredentialManagerAuthorizationState getAuthorizationStateForPlatformCredentials();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestAuthorizationForPublicKeyCredentials:")
    public native void requestAuthorizationForPublicKeyCredentials(@Block VoidBlock1<ASAuthorizationWebBrowserPublicKeyCredentialManagerAuthorizationState> completionHandler);
    @Method(selector = "platformCredentialsForRelyingParty:completionHandler:")
    public native void platformCredentialsForRelyingParty(String relyingParty, @Block VoidBlock1<NSArray<ASAuthorizationWebBrowserPlatformPublicKeyCredential>> completionHandler);
    /*</methods>*/
}
