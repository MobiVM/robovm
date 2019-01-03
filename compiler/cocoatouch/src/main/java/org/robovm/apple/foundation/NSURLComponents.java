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
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLComponents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLComponentsPtr extends Ptr<NSURLComponents, NSURLComponentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLComponents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLComponents() {}
    protected NSURLComponents(Handle h, long handle) { super(h, handle); }
    protected NSURLComponents(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:resolvingAgainstBaseURL:")
    public NSURLComponents(NSURL url, boolean resolve) { super((SkipInit) null); initObject(init(url, resolve)); }
    @Method(selector = "initWithString:")
    public NSURLComponents(String URLString) { super((SkipInit) null); initObject(init(URLString)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "scheme")
    public native String getScheme();
    @Property(selector = "setScheme:")
    public native void setScheme(String v);
    @Property(selector = "user")
    public native String getUser();
    @Property(selector = "setUser:")
    public native void setUser(String v);
    @Property(selector = "password")
    public native String getPassword();
    @Property(selector = "setPassword:")
    public native void setPassword(String v);
    @Property(selector = "host")
    public native String getHost();
    @Property(selector = "setHost:")
    public native void setHost(String v);
    @Property(selector = "port")
    public native NSNumber getPort();
    @Property(selector = "setPort:")
    public native void setPort(NSNumber v);
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "setPath:")
    public native void setPath(String v);
    @Property(selector = "query")
    public native String getQuery();
    @Property(selector = "setQuery:")
    public native void setQuery(String v);
    @Property(selector = "fragment")
    public native String getFragment();
    @Property(selector = "setFragment:")
    public native void setFragment(String v);
    @Property(selector = "percentEncodedUser")
    public native String getPercentEncodedUser();
    @Property(selector = "setPercentEncodedUser:")
    public native void setPercentEncodedUser(String v);
    @Property(selector = "percentEncodedPassword")
    public native String getPercentEncodedPassword();
    @Property(selector = "setPercentEncodedPassword:")
    public native void setPercentEncodedPassword(String v);
    @Property(selector = "percentEncodedHost")
    public native String getPercentEncodedHost();
    @Property(selector = "setPercentEncodedHost:")
    public native void setPercentEncodedHost(String v);
    @Property(selector = "percentEncodedPath")
    public native String getPercentEncodedPath();
    @Property(selector = "setPercentEncodedPath:")
    public native void setPercentEncodedPath(String v);
    @Property(selector = "percentEncodedQuery")
    public native String getPercentEncodedQuery();
    @Property(selector = "setPercentEncodedQuery:")
    public native void setPercentEncodedQuery(String v);
    @Property(selector = "percentEncodedFragment")
    public native String getPercentEncodedFragment();
    @Property(selector = "setPercentEncodedFragment:")
    public native void setPercentEncodedFragment(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfScheme")
    public native @ByVal NSRange getRangeOfScheme();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfUser")
    public native @ByVal NSRange getRangeOfUser();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfPassword")
    public native @ByVal NSRange getRangeOfPassword();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfHost")
    public native @ByVal NSRange getRangeOfHost();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfPort")
    public native @ByVal NSRange getRangeOfPort();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfPath")
    public native @ByVal NSRange getRangeOfPath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfQuery")
    public native @ByVal NSRange getRangeOfQuery();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rangeOfFragment")
    public native @ByVal NSRange getRangeOfFragment();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "queryItems")
    public native NSArray<NSURLQueryItem> getQueryItems();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setQueryItems:")
    public native void setQueryItems(NSArray<NSURLQueryItem> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "percentEncodedQueryItems")
    public native NSArray<NSURLQueryItem> getPercentEncodedQueryItems();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPercentEncodedQueryItems:")
    public native void setPercentEncodedQueryItems(NSArray<NSURLQueryItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:resolvingAgainstBaseURL:")
    protected native @Pointer long init(NSURL url, boolean resolve);
    @Method(selector = "initWithString:")
    protected native @Pointer long init(String URLString);
    @Method(selector = "URLRelativeToURL:")
    public native NSURL URLRelativeToURL(NSURL baseURL);
    /*</methods>*/
}
