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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtension/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionPtr extends Ptr<WKWebExtension, WKWebExtensionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtension.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebExtension() {}
    protected WKWebExtension(Handle h, long handle) { super(h, handle); }
    protected WKWebExtension(SkipInit skipInit) { super(skipInit); }
    public WKWebExtension(NSBundle appExtensionBundle, @Block VoidBlock2<WKWebExtension, NSError> completionHandler) { super((Handle) null, create(appExtensionBundle, completionHandler)); retain(getHandle()); }
    public WKWebExtension(NSURL resourceBaseURL, @Block VoidBlock2<WKWebExtension, NSError> completionHandler) { super((Handle) null, create(resourceBaseURL, completionHandler)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errors")
    public native NSArray<NSError> getErrors();
    @Property(selector = "manifest")
    public native NSDictionary<NSString, ?> getManifest();
    @Property(selector = "manifestVersion")
    public native double getManifestVersion();
    @Property(selector = "defaultLocale")
    public native NSLocale getDefaultLocale();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "displayShortName")
    public native String getDisplayShortName();
    @Property(selector = "displayVersion")
    public native String getDisplayVersion();
    @Property(selector = "displayDescription")
    public native String getDisplayDescription();
    @Property(selector = "displayActionLabel")
    public native String getDisplayActionLabel();
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "requestedPermissions")
    public native NSSet<NSString> getRequestedPermissions();
    @Property(selector = "optionalPermissions")
    public native NSSet<NSString> getOptionalPermissions();
    @Property(selector = "requestedPermissionMatchPatterns")
    public native NSSet<WKWebExtensionMatchPattern> getRequestedPermissionMatchPatterns();
    @Property(selector = "optionalPermissionMatchPatterns")
    public native NSSet<WKWebExtensionMatchPattern> getOptionalPermissionMatchPatterns();
    @Property(selector = "allRequestedMatchPatterns")
    public native NSSet<WKWebExtensionMatchPattern> getAllRequestedMatchPatterns();
    @Property(selector = "hasBackgroundContent")
    public native boolean hasBackgroundContent();
    @Property(selector = "hasPersistentBackgroundContent")
    public native boolean hasPersistentBackgroundContent();
    @Property(selector = "hasInjectedContent")
    public native boolean hasInjectedContent();
    @Property(selector = "hasOptionsPage")
    public native boolean hasOptionsPage();
    @Property(selector = "hasOverrideNewTabPage")
    public native boolean hasOverrideNewTabPage();
    @Property(selector = "hasCommands")
    public native boolean hasCommands();
    @Property(selector = "hasContentModificationRules")
    public native boolean hasContentModificationRules();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "supportsManifestVersion:")
    public native boolean supportsManifestVersion(double manifestVersion);
    @Method(selector = "iconForSize:")
    public native UIImage iconForSize(@ByVal CGSize size);
    @Method(selector = "actionIconForSize:")
    public native UIImage actionIconForSize(@ByVal CGSize size);
    @Method(selector = "extensionWithAppExtensionBundle:completionHandler:")
    protected static native @Pointer long create(NSBundle appExtensionBundle, @Block VoidBlock2<WKWebExtension, NSError> completionHandler);
    @Method(selector = "extensionWithResourceBaseURL:completionHandler:")
    protected static native @Pointer long create(NSURL resourceBaseURL, @Block VoidBlock2<WKWebExtension, NSError> completionHandler);
    /*</methods>*/
}
