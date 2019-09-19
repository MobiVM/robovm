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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLCache/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSURLCachePtr extends Ptr<NSURLCache, NSURLCachePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURLCache.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSURLCache() {}
    protected NSURLCache(Handle h, long handle) { super(h, handle); }
    protected NSURLCache(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Use initWithMemoryCapacity:diskCapacity:directoryURL:
     */
    @Deprecated
    @Method(selector = "initWithMemoryCapacity:diskCapacity:diskPath:")
    public NSURLCache(@MachineSizedUInt long memoryCapacity, @MachineSizedUInt long diskCapacity, String path) { super((SkipInit) null); initObject(init(memoryCapacity, diskCapacity, path)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithMemoryCapacity:diskCapacity:directoryURL:")
    public NSURLCache(@MachineSizedUInt long memoryCapacity, @MachineSizedUInt long diskCapacity, NSURL directoryURL) { super((SkipInit) null); initObject(init(memoryCapacity, diskCapacity, directoryURL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedURLCache")
    public static native NSURLCache getSharedURLCache();
    @Property(selector = "setSharedURLCache:")
    public static native void setSharedURLCache(NSURLCache v);
    @Property(selector = "memoryCapacity")
    public native @MachineSizedUInt long getMemoryCapacity();
    @Property(selector = "setMemoryCapacity:")
    public native void setMemoryCapacity(@MachineSizedUInt long v);
    @Property(selector = "diskCapacity")
    public native @MachineSizedUInt long getDiskCapacity();
    @Property(selector = "setDiskCapacity:")
    public native void setDiskCapacity(@MachineSizedUInt long v);
    @Property(selector = "currentMemoryUsage")
    public native @MachineSizedUInt long getCurrentMemoryUsage();
    @Property(selector = "currentDiskUsage")
    public native @MachineSizedUInt long getCurrentDiskUsage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Use initWithMemoryCapacity:diskCapacity:directoryURL:
     */
    @Deprecated
    @Method(selector = "initWithMemoryCapacity:diskCapacity:diskPath:")
    protected native @Pointer long init(@MachineSizedUInt long memoryCapacity, @MachineSizedUInt long diskCapacity, String path);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithMemoryCapacity:diskCapacity:directoryURL:")
    protected native @Pointer long init(@MachineSizedUInt long memoryCapacity, @MachineSizedUInt long diskCapacity, NSURL directoryURL);
    @Method(selector = "cachedResponseForRequest:")
    public native NSCachedURLResponse getCachedResponse(NSURLRequest request);
    @Method(selector = "storeCachedResponse:forRequest:")
    public native void storeCachedResponse(NSCachedURLResponse cachedResponse, NSURLRequest request);
    @Method(selector = "removeCachedResponseForRequest:")
    public native void removeCachedResponse(NSURLRequest request);
    @Method(selector = "removeAllCachedResponses")
    public native void removeAllCachedResponses();
    @Method(selector = "removeCachedResponsesSinceDate:")
    public native void removeCachedResponsesSinceDate(NSDate date);
    @Method(selector = "storeCachedResponse:forDataTask:")
    public native void storeCachedResponse(NSCachedURLResponse cachedResponse, NSURLSessionDataTask dataTask);
    @Method(selector = "getCachedResponseForDataTask:completionHandler:")
    public native void getCachedResponse(NSURLSessionDataTask dataTask, @Block VoidBlock1<NSCachedURLResponse> completionHandler);
    @Method(selector = "removeCachedResponseForDataTask:")
    public native void removeCachedResponse(NSURLSessionDataTask dataTask);
    /*</methods>*/
}
