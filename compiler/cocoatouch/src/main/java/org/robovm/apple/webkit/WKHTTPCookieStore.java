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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKHTTPCookieStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKHTTPCookieStorePtr extends Ptr<WKHTTPCookieStore, WKHTTPCookieStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKHTTPCookieStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKHTTPCookieStore() {}
    protected WKHTTPCookieStore(Handle h, long handle) { super(h, handle); }
    protected WKHTTPCookieStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getAllCookies:")
    public native void getAllCookies(@Block VoidBlock1<NSArray<NSHTTPCookie>> completionHandler);
    @Method(selector = "setCookie:completionHandler:")
    public native void setCookie(NSHTTPCookie cookie, @Block Runnable completionHandler);
    @Method(selector = "deleteCookie:completionHandler:")
    public native void deleteCookie(NSHTTPCookie cookie, @Block Runnable completionHandler);
    @Method(selector = "addObserver:")
    public native void addObserver(WKHTTPCookieStoreObserver observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(WKHTTPCookieStoreObserver observer);
    /*</methods>*/
}
