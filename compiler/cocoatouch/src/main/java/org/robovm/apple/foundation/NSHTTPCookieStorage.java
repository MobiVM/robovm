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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSHTTPCookieStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObjectProtocol observeAcceptPolicyChanged(NSHTTPCookieStorage object, final VoidBlock1<NSHTTPCookieStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(AcceptPolicyChangedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSHTTPCookieStorage) a.getObject());
                }
            });
        }
        public static NSObjectProtocol observeCookiesChanged(NSHTTPCookieStorage object, final VoidBlock1<NSHTTPCookieStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(CookiesChangedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSHTTPCookieStorage) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSHTTPCookieStoragePtr extends Ptr<NSHTTPCookieStorage, NSHTTPCookieStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSHTTPCookieStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSHTTPCookieStorage() {}
    protected NSHTTPCookieStorage(Handle h, long handle) { super(h, handle); }
    protected NSHTTPCookieStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage getSharedHTTPCookieStorage();
    @Property(selector = "cookies")
    public native NSArray<NSHTTPCookie> getCookies();
    @Property(selector = "cookieAcceptPolicy")
    public native NSHTTPCookieAcceptPolicy getCookieAcceptPolicy();
    @Property(selector = "setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(NSHTTPCookieAcceptPolicy v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSHTTPCookieManagerAcceptPolicyChangedNotification", optional=true)
    public static native NSString AcceptPolicyChangedNotification();
    @GlobalValue(symbol="NSHTTPCookieManagerCookiesChangedNotification", optional=true)
    public static native NSString CookiesChangedNotification();
    
    @Method(selector = "setCookie:")
    public native void setCookie(NSHTTPCookie cookie);
    @Method(selector = "deleteCookie:")
    public native void deleteCookie(NSHTTPCookie cookie);
    @Method(selector = "removeCookiesSinceDate:")
    public native void removeCookiesSinceDate(NSDate date);
    @Method(selector = "cookiesForURL:")
    public native NSArray<NSHTTPCookie> getCookiesForURL(NSURL URL);
    @Method(selector = "setCookies:forURL:mainDocumentURL:")
    public native void setCookiesForURL(NSArray<NSHTTPCookie> cookies, NSURL URL, NSURL mainDocumentURL);
    @Method(selector = "sortedCookiesUsingDescriptors:")
    public native NSArray<NSHTTPCookie> getSortedCookies(NSArray<NSSortDescriptor> sortOrder);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "sharedCookieStorageForGroupContainerIdentifier:")
    public static native NSHTTPCookieStorage getSharedCookieStorageForGroupContainer(String identifier);
    @Method(selector = "storeCookies:forTask:")
    public native void storeCookiesForTask(NSArray<NSHTTPCookie> cookies, NSURLSessionTask task);
    @Method(selector = "getCookiesForTask:completionHandler:")
    public native void getCookiesForTask(NSURLSessionTask task, @Block VoidBlock1<NSArray<NSHTTPCookie>> completionHandler);
    /*</methods>*/
}
