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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationProviderExtensionAuthorizationResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationProviderExtensionAuthorizationResultPtr extends Ptr<ASAuthorizationProviderExtensionAuthorizationResult, ASAuthorizationProviderExtensionAuthorizationResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationProviderExtensionAuthorizationResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAuthorizationProviderExtensionAuthorizationResult() {}
    protected ASAuthorizationProviderExtensionAuthorizationResult(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationProviderExtensionAuthorizationResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHTTPAuthorizationHeaders:")
    public ASAuthorizationProviderExtensionAuthorizationResult(NSDictionary<NSString, NSString> httpAuthorizationHeaders) { super((SkipInit) null); initObject(init(httpAuthorizationHeaders)); }
    @Method(selector = "initWithHTTPResponse:httpBody:")
    public ASAuthorizationProviderExtensionAuthorizationResult(NSHTTPURLResponse httpResponse, NSData httpBody) { super((SkipInit) null); initObject(init(httpResponse, httpBody)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "httpAuthorizationHeaders")
    public native NSDictionary<NSString, NSString> getHttpAuthorizationHeaders();
    @Property(selector = "setHttpAuthorizationHeaders:")
    public native void setHttpAuthorizationHeaders(NSDictionary<NSString, NSString> v);
    @Property(selector = "httpResponse")
    public native NSHTTPURLResponse getHttpResponse();
    @Property(selector = "setHttpResponse:")
    public native void setHttpResponse(NSHTTPURLResponse v);
    @Property(selector = "httpBody")
    public native NSData getHttpBody();
    @Property(selector = "setHttpBody:")
    public native void setHttpBody(NSData v);
    @Property(selector = "privateKeys")
    public native NSArray<?> getPrivateKeys();
    @Property(selector = "setPrivateKeys:")
    public native void setPrivateKeys(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHTTPAuthorizationHeaders:")
    protected native @Pointer long init(NSDictionary<NSString, NSString> httpAuthorizationHeaders);
    @Method(selector = "initWithHTTPResponse:httpBody:")
    protected native @Pointer long init(NSHTTPURLResponse httpResponse, NSData httpBody);
    /*</methods>*/
}
