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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationControllerPtr extends Ptr<ASAuthorizationController, ASAuthorizationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASAuthorizationController() {}
    protected ASAuthorizationController(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAuthorizationRequests:")
    public ASAuthorizationController(NSArray<ASAuthorizationRequest> authorizationRequests) { super((SkipInit) null); initObject(init(authorizationRequests)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationRequests")
    public native NSArray<ASAuthorizationRequest> getAuthorizationRequests();
    @Property(selector = "delegate")
    public native ASAuthorizationControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ASAuthorizationControllerDelegate v);
    @Property(selector = "presentationContextProvider")
    public native ASAuthorizationControllerPresentationContextProviding getPresentationContextProvider();
    @Property(selector = "setPresentationContextProvider:", strongRef = true)
    public native void setPresentationContextProvider(ASAuthorizationControllerPresentationContextProviding v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthorizationRequests:")
    protected native @Pointer long init(NSArray<ASAuthorizationRequest> authorizationRequests);
    @Method(selector = "performRequests")
    public native void performRequests();
    /*</methods>*/
}
