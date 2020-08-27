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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKOverlayAppConfiguration/*</name>*/ 
    extends /*<extends>*/SKOverlayConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKOverlayAppConfigurationPtr extends Ptr<SKOverlayAppConfiguration, SKOverlayAppConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKOverlayAppConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SKOverlayAppConfiguration() {}
    protected SKOverlayAppConfiguration(Handle h, long handle) { super(h, handle); }
    protected SKOverlayAppConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAppIdentifier:position:")
    public SKOverlayAppConfiguration(String appIdentifier, SKOverlayPosition position) { super((SkipInit) null); initObject(init(appIdentifier, position)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appIdentifier")
    public native String getAppIdentifier();
    @Property(selector = "setAppIdentifier:")
    public native void setAppIdentifier(String v);
    @Property(selector = "campaignToken")
    public native String getCampaignToken();
    @Property(selector = "setCampaignToken:")
    public native void setCampaignToken(String v);
    @Property(selector = "providerToken")
    public native String getProviderToken();
    @Property(selector = "setProviderToken:")
    public native void setProviderToken(String v);
    @Property(selector = "position")
    public native SKOverlayPosition getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(SKOverlayPosition v);
    @Property(selector = "userDismissible")
    public native boolean isUserDismissible();
    @Property(selector = "setUserDismissible:")
    public native void setUserDismissible(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppIdentifier:position:")
    protected native @Pointer long init(String appIdentifier, SKOverlayPosition position);
    @Method(selector = "setAdditionalValue:forKey:")
    public native void setAdditionalValue(NSObject value, String key);
    @Method(selector = "additionalValueForKey:")
    public native NSObject additionalValueForKey(String key);
    /*</methods>*/
}
