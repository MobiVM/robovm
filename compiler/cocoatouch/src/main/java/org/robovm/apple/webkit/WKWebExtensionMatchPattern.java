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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionMatchPattern/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionMatchPatternPtr extends Ptr<WKWebExtensionMatchPattern, WKWebExtensionMatchPatternPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtensionMatchPattern.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebExtensionMatchPattern() {}
    protected WKWebExtensionMatchPattern(Handle h, long handle) { super(h, handle); }
    protected WKWebExtensionMatchPattern(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithString:error:")
    public WKWebExtensionMatchPattern(String string) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(string, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithScheme:host:path:error:")
    public WKWebExtensionMatchPattern(String scheme, String host, String path) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(scheme, host, path, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithCoder:")
    public WKWebExtensionMatchPattern(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "scheme")
    public native String getScheme();
    @Property(selector = "host")
    public native String getHost();
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "matchesAllURLs")
    public native boolean isMatchesAllURLs();
    @Property(selector = "matchesAllHosts")
    public native boolean isMatchesAllHosts();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithString:error:")
    private native @Pointer long init(String string, NSError.NSErrorPtr error);
    @Method(selector = "initWithScheme:host:path:error:")
    private native @Pointer long init(String scheme, String host, String path, NSError.NSErrorPtr error);
    @Method(selector = "matchesURL:")
    public native boolean matchesURL(NSURL url);
    @Method(selector = "matchesURL:options:")
    public native boolean matchesURL(NSURL url, WKWebExtensionMatchPatternOptions options);
    @Method(selector = "matchesPattern:")
    public native boolean matchesPattern(WKWebExtensionMatchPattern pattern);
    @Method(selector = "matchesPattern:options:")
    public native boolean matchesPattern(WKWebExtensionMatchPattern pattern, WKWebExtensionMatchPatternOptions options);
    @Method(selector = "registerCustomURLScheme:")
    public static native void registerCustomURLScheme(String urlScheme);
    @Method(selector = "allURLsMatchPattern")
    public static native WKWebExtensionMatchPattern allURLsMatchPattern();
    @Method(selector = "allHostsAndSchemesMatchPattern")
    public static native WKWebExtensionMatchPattern allHostsAndSchemesMatchPattern();
    @Method(selector = "matchPatternWithString:")
    public static native WKWebExtensionMatchPattern matchPattern(String string);
    @Method(selector = "matchPatternWithScheme:host:path:")
    public static native WKWebExtensionMatchPattern matchPattern(String scheme, String host, String path);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
