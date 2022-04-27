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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSHTTPURLResponse/*</name>*/ 
    extends /*<extends>*/NSURLResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSHTTPURLResponsePtr extends Ptr<NSHTTPURLResponse, NSHTTPURLResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSHTTPURLResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSHTTPURLResponse() {}
    protected NSHTTPURLResponse(Handle h, long handle) { super(h, handle); }
    protected NSHTTPURLResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:statusCode:HTTPVersion:headerFields:")
    public NSHTTPURLResponse(NSURL url, @MachineSizedSInt long statusCode, String HTTPVersion, @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> headerFields) { super((SkipInit) null); initObject(init(url, statusCode, HTTPVersion, headerFields)); }
    @Method(selector = "initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public NSHTTPURLResponse(NSURL URL, String MIMEType, @MachineSizedSInt long length, String name) { super(URL, MIMEType, length, name); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "statusCode")
    public native @MachineSizedSInt long getStatusCode();
    @Property(selector = "allHeaderFields")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getAllHeaderFields();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:statusCode:HTTPVersion:headerFields:")
    protected native @Pointer long init(NSURL url, @MachineSizedSInt long statusCode, String HTTPVersion, @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> headerFields);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "valueForHTTPHeaderField:")
    public native String valueForHTTPHeaderField(String field);
    @Method(selector = "localizedStringForStatusCode:")
    public static native String getLocalizedStatusCode(@MachineSizedSInt long statusCode);
    /*</methods>*/
}
