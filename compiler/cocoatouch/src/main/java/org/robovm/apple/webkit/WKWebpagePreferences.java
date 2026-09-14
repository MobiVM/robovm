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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebpagePreferences/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebpagePreferencesPtr extends Ptr<WKWebpagePreferences, WKWebpagePreferencesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebpagePreferences.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKWebpagePreferences() {}
    protected WKWebpagePreferences(Handle h, long handle) { super(h, handle); }
    protected WKWebpagePreferences(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "preferredContentMode")
    public native WKContentMode getPreferredContentMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPreferredContentMode:")
    public native void setPreferredContentMode(WKContentMode v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsContentJavaScript")
    public native boolean allowsContentJavaScript();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsContentJavaScript:")
    public native void setAllowsContentJavaScript(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isLockdownModeEnabled")
    public native boolean isLockdownModeEnabled();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setLockdownModeEnabled:")
    public native void setLockdownModeEnabled(boolean v);
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "preferredHTTPSNavigationPolicy")
    public native WKWebpagePreferencesUpgradeToHTTPSPolicy getPreferredHTTPSNavigationPolicy();
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "setPreferredHTTPSNavigationPolicy:")
    public native void setPreferredHTTPSNavigationPolicy(WKWebpagePreferencesUpgradeToHTTPSPolicy v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "securityRestrictionMode")
    public native WKSecurityRestrictionMode getSecurityRestrictionMode();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setSecurityRestrictionMode:")
    public native void setSecurityRestrictionMode(WKSecurityRestrictionMode v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "alternateRequest")
    public native NSURLRequest getAlternateRequest();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setAlternateRequest:")
    public native void setAlternateRequest(NSURLRequest v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "overrideReferrer")
    public native String getOverrideReferrer();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setOverrideReferrer:")
    public native void setOverrideReferrer(String v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "allowsJSHandleCreationInPageWorld")
    public native boolean allowsJSHandleCreationInPageWorld();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setAllowsJSHandleCreationInPageWorld:")
    public native void setAllowsJSHandleCreationInPageWorld(boolean v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "globalPrivacyControlEnabled")
    public native boolean isGlobalPrivacyControlEnabled();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setGlobalPrivacyControlEnabled:")
    public native void setGlobalPrivacyControlEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
