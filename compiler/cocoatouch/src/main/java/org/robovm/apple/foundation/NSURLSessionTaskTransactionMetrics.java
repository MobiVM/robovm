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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSessionTaskTransactionMetrics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLSessionTaskTransactionMetricsPtr extends Ptr<NSURLSessionTaskTransactionMetrics, NSURLSessionTaskTransactionMetricsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLSessionTaskTransactionMetrics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLSessionTaskTransactionMetrics() {}
    protected NSURLSessionTaskTransactionMetrics(Handle h, long handle) { super(h, handle); }
    protected NSURLSessionTaskTransactionMetrics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "request")
    public native NSURLRequest getRequest();
    @Property(selector = "response")
    public native NSURLResponse getResponse();
    @Property(selector = "fetchStartDate")
    public native NSDate getFetchStartDate();
    @Property(selector = "domainLookupStartDate")
    public native NSDate getDomainLookupStartDate();
    @Property(selector = "domainLookupEndDate")
    public native NSDate getDomainLookupEndDate();
    @Property(selector = "connectStartDate")
    public native NSDate getConnectStartDate();
    @Property(selector = "secureConnectionStartDate")
    public native NSDate getSecureConnectionStartDate();
    @Property(selector = "secureConnectionEndDate")
    public native NSDate getSecureConnectionEndDate();
    @Property(selector = "connectEndDate")
    public native NSDate getConnectEndDate();
    @Property(selector = "requestStartDate")
    public native NSDate getRequestStartDate();
    @Property(selector = "requestEndDate")
    public native NSDate getRequestEndDate();
    @Property(selector = "responseStartDate")
    public native NSDate getResponseStartDate();
    @Property(selector = "responseEndDate")
    public native NSDate getResponseEndDate();
    @Property(selector = "networkProtocolName")
    public native String getNetworkProtocolName();
    @Property(selector = "isProxyConnection")
    public native boolean isProxyConnection();
    @Property(selector = "isReusedConnection")
    public native boolean isReusedConnection();
    @Property(selector = "resourceFetchType")
    public native NSURLSessionTaskMetricsResourceFetchType getResourceFetchType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfRequestHeaderBytesSent")
    public native long getCountOfRequestHeaderBytesSent();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfRequestBodyBytesSent")
    public native long getCountOfRequestBodyBytesSent();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfRequestBodyBytesBeforeEncoding")
    public native long getCountOfRequestBodyBytesBeforeEncoding();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfResponseHeaderBytesReceived")
    public native long getCountOfResponseHeaderBytesReceived();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfResponseBodyBytesReceived")
    public native long getCountOfResponseBodyBytesReceived();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "countOfResponseBodyBytesAfterDecoding")
    public native long getCountOfResponseBodyBytesAfterDecoding();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "localAddress")
    public native String getLocalAddress();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "localPort")
    public native NSNumber getLocalPort();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "remoteAddress")
    public native String getRemoteAddress();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "remotePort")
    public native NSNumber getRemotePort();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "negotiatedTLSProtocolVersion")
    public native NSNumber getNegotiatedTLSProtocolVersion();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "negotiatedTLSCipherSuite")
    public native NSNumber getNegotiatedTLSCipherSuite();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isCellular")
    public native boolean isCellular();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isExpensive")
    public native boolean isExpensive();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isConstrained")
    public native boolean isConstrained();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isMultipath")
    public native boolean isMultipath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
