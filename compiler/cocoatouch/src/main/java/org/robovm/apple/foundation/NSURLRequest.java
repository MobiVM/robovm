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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSURLRequestPtr extends Ptr<NSURLRequest, NSURLRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLRequest() {}
    protected NSURLRequest(Handle h, long handle) { super(h, handle); }
    protected NSURLRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public NSURLRequest(NSURL URL) { super((SkipInit) null); initObject(init(URL)); }
    @Method(selector = "initWithURL:cachePolicy:timeoutInterval:")
    public NSURLRequest(NSURL URL, NSURLRequestCachePolicy cachePolicy, double timeoutInterval) { super((SkipInit) null); initObject(init(URL, cachePolicy, timeoutInterval)); }
    @Method(selector = "initWithCoder:")
    public NSURLRequest(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "cachePolicy")
    public native NSURLRequestCachePolicy getCachePolicy();
    @Property(selector = "timeoutInterval")
    public native double getTimeoutInterval();
    @Property(selector = "mainDocumentURL")
    public native NSURL getMainDocumentURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "networkServiceType")
    public native NSURLRequestNetworkServiceType getNetworkServiceType();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Property(selector = "HTTPMethod")
    public native String getHTTPMethod();
    @Property(selector = "allHTTPHeaderFields")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getAllHTTPHeaderFields();
    @Property(selector = "HTTPBody")
    public native NSData getHTTPBody();
    @Property(selector = "HTTPBodyStream")
    public native NSInputStream getHTTPBodyStream();
    @Property(selector = "HTTPShouldHandleCookies")
    public native boolean shouldHandleHTTPCookies();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    /*</properties>*/
    
    public void setURL(NSURL v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setCachePolicy(NSURLRequestCachePolicy v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setTimeoutInterval(double v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setMainDocumentURL(NSURL v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setNetworkServiceType(NSURLRequestNetworkServiceType v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setAllowsCellularAccess(boolean v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setHTTPMethod(String v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setAllHTTPHeaderFields(Map<String, String> v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setHTTPBody(NSData v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setHTTPBodyStream(NSInputStream v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setShouldHandleHTTPCookies(boolean v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setShouldUseHTTPPipelining(boolean v) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void setHTTPHeaderField(String field, String value) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }

    public void addHTTPHeaderField(String field, String value) {
        throw new UnsupportedOperationException("NSURLRequest is immutable");
    }
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    @Method(selector = "initWithURL:cachePolicy:timeoutInterval:")
    protected native @Pointer long init(NSURL URL, NSURLRequestCachePolicy cachePolicy, double timeoutInterval);
    @Method(selector = "valueForHTTPHeaderField:")
    public native String getHTTPHeaderFieldValue(String field);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
