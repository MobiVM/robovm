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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationProviderExtensionAuthorizationRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationProviderExtensionAuthorizationRequestPtr extends Ptr<ASAuthorizationProviderExtensionAuthorizationRequest, ASAuthorizationProviderExtensionAuthorizationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationProviderExtensionAuthorizationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAuthorizationProviderExtensionAuthorizationRequest() {}
    protected ASAuthorizationProviderExtensionAuthorizationRequest(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationProviderExtensionAuthorizationRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "requestedOperation")
    public native String getRequestedOperation();
    @Property(selector = "httpHeaders")
    public native NSDictionary<NSString, NSString> getHttpHeaders();
    @Property(selector = "httpBody")
    public native NSData getHttpBody();
    @Property(selector = "realm")
    public native String getRealm();
    @Property(selector = "extensionData")
    public native NSDictionary<?, ?> getExtensionData();
    @Property(selector = "callerBundleIdentifier")
    public native String getCallerBundleIdentifier();
    @Property(selector = "authorizationOptions")
    public native NSDictionary<?, ?> getAuthorizationOptions();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isCallerManaged")
    public native boolean isCallerManaged();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "callerTeamIdentifier")
    public native String getCallerTeamIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "localizedCallerDisplayName")
    public native String getLocalizedCallerDisplayName();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "isUserInterfaceEnabled")
    public native boolean isUserInterfaceEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "doNotHandle")
    public native void doNotHandle();
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "complete")
    public native void complete();
    @Method(selector = "completeWithHTTPAuthorizationHeaders:")
    public native void complete(NSDictionary<NSString, NSString> httpAuthorizationHeaders);
    @Method(selector = "completeWithHTTPResponse:httpBody:")
    public native void complete(NSHTTPURLResponse httpResponse, NSData httpBody);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "completeWithAuthorizationResult:")
    public native void complete(ASAuthorizationProviderExtensionAuthorizationResult authorizationResult);
    @Method(selector = "completeWithError:")
    public native void complete(NSError error);
    @Method(selector = "presentAuthorizationViewControllerWithCompletion:")
    public native void presentAuthorizationViewController(@Block VoidBlock2<Boolean, NSError> completion);
    /*</methods>*/
}
