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
package org.robovm.apple.storekit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKOverlayAppClipConfiguration/*</name>*/ 
    extends /*<extends>*/SKOverlayConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKOverlayAppClipConfigurationPtr extends Ptr<SKOverlayAppClipConfiguration, SKOverlayAppClipConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKOverlayAppClipConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SKOverlayAppClipConfiguration() {}
    protected SKOverlayAppClipConfiguration(Handle h, long handle) { super(h, handle); }
    protected SKOverlayAppClipConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPosition:")
    public SKOverlayAppClipConfiguration(SKOverlayPosition position) { super((SkipInit) null); initObject(init(position)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "campaignToken")
    public native String getCampaignToken();
    @Property(selector = "setCampaignToken:")
    public native void setCampaignToken(String v);
    @Property(selector = "providerToken")
    public native String getProviderToken();
    @Property(selector = "setProviderToken:")
    public native void setProviderToken(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "customProductPageIdentifier")
    public native String getCustomProductPageIdentifier();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setCustomProductPageIdentifier:")
    public native void setCustomProductPageIdentifier(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "latestReleaseID")
    public native String getLatestReleaseID();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setLatestReleaseID:")
    public native void setLatestReleaseID(String v);
    @Property(selector = "position")
    public native SKOverlayPosition getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(SKOverlayPosition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPosition:")
    protected native @Pointer long init(SKOverlayPosition position);
    @Method(selector = "setAdditionalValue:forKey:")
    public native void setAdditionalValue(NSObject value, String key);
    @Method(selector = "additionalValueForKey:")
    public native NSObject additionalValueForKey(String key);
    /*</methods>*/
}
