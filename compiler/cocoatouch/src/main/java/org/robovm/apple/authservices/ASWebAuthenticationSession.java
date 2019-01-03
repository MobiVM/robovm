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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASWebAuthenticationSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASWebAuthenticationSessionPtr extends Ptr<ASWebAuthenticationSession, ASWebAuthenticationSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASWebAuthenticationSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASWebAuthenticationSession() {}
    protected ASWebAuthenticationSession(Handle h, long handle) { super(h, handle); }
    protected ASWebAuthenticationSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:callbackURLScheme:completionHandler:")
    public ASWebAuthenticationSession(NSURL URL, String callbackURLScheme, @Block VoidBlock2<NSURL, NSError> completionHandler) { super((SkipInit) null); initObject(init(URL, callbackURLScheme, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:callbackURLScheme:completionHandler:")
    protected native @Pointer long init(NSURL URL, String callbackURLScheme, @Block VoidBlock2<NSURL, NSError> completionHandler);
    @Method(selector = "start")
    public native boolean start();
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
