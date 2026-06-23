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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionContextPtr extends Ptr<WKWebExtensionContext, WKWebExtensionContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtensionContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebExtensionContext() {}
    protected WKWebExtensionContext(Handle h, long handle) { super(h, handle); }
    protected WKWebExtensionContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForExtension:")
    public WKWebExtensionContext(WKWebExtension extension) { super((SkipInit) null); initObject(initForExtension(extension)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "webExtension")
    public native WKWebExtension getWebExtension();
    @Property(selector = "webExtensionController")
    public native WKWebExtensionController getWebExtensionController();
    @Property(selector = "isLoaded")
    public native boolean isLoaded();
    @Property(selector = "errors")
    public native NSArray<NSError> getErrors();
    @Property(selector = "baseURL")
    public native NSURL getBaseURL();
    @Property(selector = "setBaseURL:")
    public native void setBaseURL(NSURL v);
    @Property(selector = "uniqueIdentifier")
    public native String getUniqueIdentifier();
    @Property(selector = "setUniqueIdentifier:")
    public native void setUniqueIdentifier(String v);
    @Property(selector = "isInspectable")
    public native boolean isInspectable();
    @Property(selector = "setInspectable:")
    public native void setInspectable(boolean v);
    @Property(selector = "inspectionName")
    public native String getInspectionName();
    @Property(selector = "setInspectionName:")
    public native void setInspectionName(String v);
    @Property(selector = "unsupportedAPIs")
    public native NSSet<NSString> getUnsupportedAPIs();
    @Property(selector = "setUnsupportedAPIs:")
    public native void setUnsupportedAPIs(NSSet<NSString> v);
    @Property(selector = "webViewConfiguration")
    public native WKWebViewConfiguration getWebViewConfiguration();
    @Property(selector = "optionsPageURL")
    public native NSURL getOptionsPageURL();
    @Property(selector = "overrideNewTabPageURL")
    public native NSURL getOverrideNewTabPageURL();
    @Property(selector = "grantedPermissions")
    public native NSDictionary<NSString, NSDate> getGrantedPermissions();
    @Property(selector = "setGrantedPermissions:")
    public native void setGrantedPermissions(NSDictionary<NSString, NSDate> v);
    @Property(selector = "grantedPermissionMatchPatterns")
    public native NSDictionary<WKWebExtensionMatchPattern, NSDate> getGrantedPermissionMatchPatterns();
    @Property(selector = "setGrantedPermissionMatchPatterns:")
    public native void setGrantedPermissionMatchPatterns(NSDictionary<WKWebExtensionMatchPattern, NSDate> v);
    @Property(selector = "deniedPermissions")
    public native NSDictionary<NSString, NSDate> getDeniedPermissions();
    @Property(selector = "setDeniedPermissions:")
    public native void setDeniedPermissions(NSDictionary<NSString, NSDate> v);
    @Property(selector = "deniedPermissionMatchPatterns")
    public native NSDictionary<WKWebExtensionMatchPattern, NSDate> getDeniedPermissionMatchPatterns();
    @Property(selector = "setDeniedPermissionMatchPatterns:")
    public native void setDeniedPermissionMatchPatterns(NSDictionary<WKWebExtensionMatchPattern, NSDate> v);
    @Property(selector = "hasRequestedOptionalAccessToAllHosts")
    public native boolean hasRequestedOptionalAccessToAllHosts();
    @Property(selector = "setHasRequestedOptionalAccessToAllHosts:")
    public native void setHasRequestedOptionalAccessToAllHosts(boolean v);
    @Property(selector = "hasAccessToPrivateData")
    public native boolean hasAccessToPrivateData();
    @Property(selector = "setHasAccessToPrivateData:")
    public native void setHasAccessToPrivateData(boolean v);
    @Property(selector = "currentPermissions")
    public native NSSet<NSString> getCurrentPermissions();
    @Property(selector = "currentPermissionMatchPatterns")
    public native NSSet<WKWebExtensionMatchPattern> getCurrentPermissionMatchPatterns();
    @Property(selector = "hasAccessToAllURLs")
    public native boolean hasAccessToAllURLs();
    @Property(selector = "hasAccessToAllHosts")
    public native boolean hasAccessToAllHosts();
    @Property(selector = "hasInjectedContent")
    public native boolean hasInjectedContent();
    @Property(selector = "hasContentModificationRules")
    public native boolean hasContentModificationRules();
    @Property(selector = "commands")
    public native NSArray<WKWebExtensionCommand> getCommands();
    @Property(selector = "openWindows")
    public native NSArray<?> getOpenWindows();
    @Property(selector = "focusedWindow")
    public native WKWebExtensionWindow getFocusedWindow();
    @Property(selector = "openTabs")
    public native NSSet<?> getOpenTabs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("WebKit")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextErrorsDidUpdateNotification", optional=true)
        public static native NSString ErrorsDidUpdate();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextPermissionsWereGrantedNotification", optional=true)
        public static native NSString PermissionsWereGranted();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextPermissionsWereDeniedNotification", optional=true)
        public static native NSString PermissionsWereDenied();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextGrantedPermissionsWereRemovedNotification", optional=true)
        public static native NSString GrantedPermissionsWereRemoved();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextDeniedPermissionsWereRemovedNotification", optional=true)
        public static native NSString DeniedPermissionsWereRemoved();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextPermissionMatchPatternsWereGrantedNotification", optional=true)
        public static native NSString PermissionMatchPatternsWereGranted();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextPermissionMatchPatternsWereDeniedNotification", optional=true)
        public static native NSString PermissionMatchPatternsWereDenied();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextGrantedPermissionMatchPatternsWereRemovedNotification", optional=true)
        public static native NSString GrantedPermissionMatchPatternsWereRemoved();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionContextDeniedPermissionMatchPatternsWereRemovedNotification", optional=true)
        public static native NSString DeniedPermissionMatchPatternsWereRemoved();
    }
    
    @Method(selector = "initForExtension:")
    protected native @Pointer long initForExtension(WKWebExtension extension);
    @Method(selector = "hasPermission:")
    public native boolean hasPermission(WKWebExtensionPermission permission);
    @Method(selector = "hasPermission:inTab:")
    public native boolean hasPermission(WKWebExtensionPermission permission, WKWebExtensionTab tab);
    @Method(selector = "hasAccessToURL:")
    public native boolean hasAccessToURL(NSURL url);
    @Method(selector = "hasAccessToURL:inTab:")
    public native boolean hasAccessToURL(NSURL url, WKWebExtensionTab tab);
    @Method(selector = "hasInjectedContentForURL:")
    public native boolean hasInjectedContentForURL(NSURL url);
    @Method(selector = "permissionStatusForPermission:")
    public native WKWebExtensionContextPermissionStatus permissionStatusForPermission(WKWebExtensionPermission permission);
    @Method(selector = "permissionStatusForPermission:inTab:")
    public native WKWebExtensionContextPermissionStatus getPermissionStatus(WKWebExtensionPermission permission, WKWebExtensionTab tab);
    @Method(selector = "setPermissionStatus:forPermission:")
    public native void setPermissionStatus(WKWebExtensionContextPermissionStatus status, WKWebExtensionPermission permission);
    @Method(selector = "setPermissionStatus:forPermission:expirationDate:")
    public native void setPermissionStatus$(WKWebExtensionContextPermissionStatus status, WKWebExtensionPermission permission, NSDate expirationDate);
    @Method(selector = "permissionStatusForURL:")
    public native WKWebExtensionContextPermissionStatus permissionStatusForURL(NSURL url);
    @Method(selector = "permissionStatusForURL:inTab:")
    public native WKWebExtensionContextPermissionStatus getPermissionStatus(NSURL url, WKWebExtensionTab tab);
    @Method(selector = "setPermissionStatus:forURL:")
    public native void setPermissionStatus(WKWebExtensionContextPermissionStatus status, NSURL url);
    @Method(selector = "setPermissionStatus:forURL:expirationDate:")
    public native void setPermissionStatus(WKWebExtensionContextPermissionStatus status, NSURL url, NSDate expirationDate);
    @Method(selector = "permissionStatusForMatchPattern:")
    public native WKWebExtensionContextPermissionStatus permissionStatusForMatchPattern(WKWebExtensionMatchPattern pattern);
    @Method(selector = "permissionStatusForMatchPattern:inTab:")
    public native WKWebExtensionContextPermissionStatus getPermissionStatus(WKWebExtensionMatchPattern pattern, WKWebExtensionTab tab);
    @Method(selector = "setPermissionStatus:forMatchPattern:")
    public native void setPermissionStatus(WKWebExtensionContextPermissionStatus status, WKWebExtensionMatchPattern pattern);
    @Method(selector = "setPermissionStatus:forMatchPattern:expirationDate:")
    public native void setPermissionStatus(WKWebExtensionContextPermissionStatus status, WKWebExtensionMatchPattern pattern, NSDate expirationDate);
    @Method(selector = "loadBackgroundContentWithCompletionHandler:")
    public native void loadBackgroundContent(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "actionForTab:")
    public native WKWebExtensionAction actionForTab(WKWebExtensionTab tab);
    @Method(selector = "performActionForTab:")
    public native void performActionForTab(WKWebExtensionTab tab);
    @Method(selector = "performCommand:")
    public native void performCommand(WKWebExtensionCommand command);
    @Method(selector = "performCommandForKeyCommand:")
    public native boolean performCommandForKeyCommand(UIKeyCommand keyCommand);
    @Method(selector = "menuItemsForTab:")
    public native NSArray<UIMenuElement> menuItemsForTab(WKWebExtensionTab tab);
    @Method(selector = "userGesturePerformedInTab:")
    public native void userGesturePerformedInTab(WKWebExtensionTab tab);
    @Method(selector = "hasActiveUserGestureInTab:")
    public native boolean hasActiveUserGestureInTab(WKWebExtensionTab tab);
    @Method(selector = "clearUserGestureInTab:")
    public native void clearUserGestureInTab(WKWebExtensionTab tab);
    @Method(selector = "didOpenWindow:")
    public native void didOpenWindow(WKWebExtensionWindow newWindow);
    @Method(selector = "didCloseWindow:")
    public native void didCloseWindow(WKWebExtensionWindow closedWindow);
    @Method(selector = "didFocusWindow:")
    public native void didFocusWindow(WKWebExtensionWindow focusedWindow);
    @Method(selector = "didOpenTab:")
    public native void didOpenTab(WKWebExtensionTab newTab);
    @Method(selector = "didCloseTab:windowIsClosing:")
    public native void didCloseTab(WKWebExtensionTab closedTab, boolean windowIsClosing);
    @Method(selector = "didActivateTab:previousActiveTab:")
    public native void didActivateTab(WKWebExtensionTab activatedTab, WKWebExtensionTab previousTab);
    @Method(selector = "didSelectTabs:")
    public native void didSelectTabs(NSArray<?> selectedTabs);
    @Method(selector = "didDeselectTabs:")
    public native void didDeselectTabs(NSArray<?> deselectedTabs);
    @Method(selector = "didMoveTab:fromIndex:inWindow:")
    public native void didMoveTab(WKWebExtensionTab movedTab, @MachineSizedUInt long index, WKWebExtensionWindow oldWindow);
    @Method(selector = "didReplaceTab:withTab:")
    public native void didReplaceTab(WKWebExtensionTab oldTab, WKWebExtensionTab newTab);
    @Method(selector = "didChangeTabProperties:forTab:")
    public native void didChangeTabProperties(WKWebExtensionTabChangedProperties properties, WKWebExtensionTab changedTab);
    @Method(selector = "contextForExtension:")
    public static native WKWebExtensionContext contextForExtension(WKWebExtension extension);
    /*</methods>*/
}
