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

/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKPreferences/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKPreferencesPtr extends Ptr<WKPreferences, WKPreferencesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKPreferences.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKPreferences() {}
    protected WKPreferences(Handle h, long handle) { super(h, handle); }
    protected WKPreferences(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public WKPreferences(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumFontSize")
    public native @MachineSizedFloat double getMinimumFontSize();
    @Property(selector = "setMinimumFontSize:")
    public native void setMinimumFontSize(@MachineSizedFloat double v);
    @Property(selector = "javaScriptCanOpenWindowsAutomatically")
    public native boolean javaScriptCanOpenWindowsAutomatically();
    @Property(selector = "setJavaScriptCanOpenWindowsAutomatically:")
    public native void setJavaScriptCanOpenWindowsAutomatically(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isFraudulentWebsiteWarningEnabled")
    public native boolean isFraudulentWebsiteWarningEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setFraudulentWebsiteWarningEnabled:")
    public native void setFraudulentWebsiteWarningEnabled(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "shouldPrintBackgrounds")
    public native boolean shouldPrintBackgrounds();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setShouldPrintBackgrounds:")
    public native void setShouldPrintBackgrounds(boolean v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "isTextInteractionEnabled")
    public native boolean isTextInteractionEnabled();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "setTextInteractionEnabled:")
    public native void setTextInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "isSiteSpecificQuirksModeEnabled")
    public native boolean isSiteSpecificQuirksModeEnabled();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setSiteSpecificQuirksModeEnabled:")
    public native void setSiteSpecificQuirksModeEnabled(boolean v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "isElementFullscreenEnabled")
    public native boolean isElementFullscreenEnabled();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setElementFullscreenEnabled:")
    public native void setElementFullscreenEnabled(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "inactiveSchedulingPolicy")
    public native WKInactiveSchedulingPolicy getInactiveSchedulingPolicy();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setInactiveSchedulingPolicy:")
    public native void setInactiveSchedulingPolicy(WKInactiveSchedulingPolicy v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use WKWebpagePreferences.allowsContentJavaScript to disable content JavaScript on a per-navigation basis
     */
    @Deprecated
    @Property(selector = "javaScriptEnabled")
    public native boolean isJavaScriptEnabled();
    /**
     * @deprecated Deprecated in iOS 14.0. Use WKWebpagePreferences.allowsContentJavaScript to disable content JavaScript on a per-navigation basis
     */
    @Deprecated
    @Property(selector = "setJavaScriptEnabled:")
    public native void setJavaScriptEnabled(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
