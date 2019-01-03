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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebViewConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKWebViewConfigurationPtr extends Ptr<WKWebViewConfiguration, WKWebViewConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebViewConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKWebViewConfiguration() {}
    protected WKWebViewConfiguration(Handle h, long handle) { super(h, handle); }
    protected WKWebViewConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public WKWebViewConfiguration(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "processPool")
    public native WKProcessPool getProcessPool();
    @Property(selector = "setProcessPool:")
    public native void setProcessPool(WKProcessPool v);
    @Property(selector = "preferences")
    public native WKPreferences getPreferences();
    @Property(selector = "setPreferences:")
    public native void setPreferences(WKPreferences v);
    @Property(selector = "userContentController")
    public native WKUserContentController getUserContentController();
    @Property(selector = "setUserContentController:")
    public native void setUserContentController(WKUserContentController v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "websiteDataStore")
    public native WKWebsiteDataStore getWebsiteDataStore();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setWebsiteDataStore:")
    public native void setWebsiteDataStore(WKWebsiteDataStore v);
    @Property(selector = "suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();
    @Property(selector = "setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "applicationNameForUserAgent")
    public native String getApplicationNameForUserAgent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setApplicationNameForUserAgent:")
    public native void setApplicationNameForUserAgent(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsAirPlayForMediaPlayback")
    public native boolean allowsAirPlayForMediaPlayback();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsAirPlayForMediaPlayback:")
    public native void setAllowsAirPlayForMediaPlayback(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "mediaTypesRequiringUserActionForPlayback")
    public native WKAudiovisualMediaTypes getMediaTypesRequiringUserActionForPlayback();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMediaTypesRequiringUserActionForPlayback:")
    public native void setMediaTypesRequiringUserActionForPlayback(WKAudiovisualMediaTypes v);
    @Property(selector = "allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();
    @Property(selector = "setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean v);
    @Property(selector = "selectionGranularity")
    public native WKSelectionGranularity getSelectionGranularity();
    @Property(selector = "setSelectionGranularity:")
    public native void setSelectionGranularity(WKSelectionGranularity v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsPictureInPictureMediaPlayback")
    public native boolean allowsPictureInPictureMediaPlayback();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsPictureInPictureMediaPlayback:")
    public native void setAllowsPictureInPictureMediaPlayback(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "dataDetectorTypes")
    public native WKDataDetectorTypes getDataDetectorTypes();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setDataDetectorTypes:")
    public native void setDataDetectorTypes(WKDataDetectorTypes v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "ignoresViewportScaleLimits")
    public native boolean ignoresViewportScaleLimits();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setIgnoresViewportScaleLimits:")
    public native void setIgnoresViewportScaleLimits(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "requiresUserActionForMediaPlayback")
    public native boolean requiresUserActionForMediaPlayback();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setRequiresUserActionForMediaPlayback:")
    public native void setRequiresUserActionForMediaPlayback(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setURLSchemeHandler:forURLScheme:")
    public native void setURLSchemeHandler(WKURLSchemeHandler urlSchemeHandler, String urlScheme);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "urlSchemeHandlerForURLScheme:")
    public native WKURLSchemeHandler urlSchemeHandlerForURLScheme(String urlScheme);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
