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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebsiteDataStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKWebsiteDataStorePtr extends Ptr<WKWebsiteDataStore, WKWebsiteDataStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebsiteDataStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebsiteDataStore() {}
    protected WKWebsiteDataStore(Handle h, long handle) { super(h, handle); }
    protected WKWebsiteDataStore(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public WKWebsiteDataStore(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isPersistent")
    public native boolean isPersistent();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "httpCookieStore")
    public native WKHTTPCookieStore getHttpCookieStore();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchDataRecordsOfTypes:completionHandler:")
    public native void fetchDataRecords(@org.robovm.rt.bro.annotation.Marshaler(WKWebsiteDataType.AsSetMarshaler.class) Set<WKWebsiteDataType> dataTypes, @Block VoidBlock1<NSArray<WKWebsiteDataRecord>> completionHandler);
    @Method(selector = "removeDataOfTypes:forDataRecords:completionHandler:")
    public native void removeData(@org.robovm.rt.bro.annotation.Marshaler(WKWebsiteDataType.AsSetMarshaler.class) Set<WKWebsiteDataType> dataTypes, NSArray<WKWebsiteDataRecord> dataRecords, @Block Runnable completionHandler);
    @Method(selector = "removeDataOfTypes:modifiedSince:completionHandler:")
    public native void removeData(@org.robovm.rt.bro.annotation.Marshaler(WKWebsiteDataType.AsSetMarshaler.class) Set<WKWebsiteDataType> dataTypes, NSDate date, @Block Runnable completionHandler);
    @Method(selector = "defaultDataStore")
    public static native WKWebsiteDataStore getDefaultDataStore();
    @Method(selector = "nonPersistentDataStore")
    public static native WKWebsiteDataStore getNonPersistentDataStore();
    @Method(selector = "allWebsiteDataTypes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(WKWebsiteDataType.AsSetMarshaler.class) Set<WKWebsiteDataType> getAllWebsiteDataTypes();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
