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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionControllerConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionControllerConfigurationPtr extends Ptr<WKWebExtensionControllerConfiguration, WKWebExtensionControllerConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtensionControllerConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebExtensionControllerConfiguration() {}
    protected WKWebExtensionControllerConfiguration(Handle h, long handle) { super(h, handle); }
    protected WKWebExtensionControllerConfiguration(SkipInit skipInit) { super(skipInit); }
    public WKWebExtensionControllerConfiguration(NSUUID identifier) { super((Handle) null, create(identifier)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public WKWebExtensionControllerConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isPersistent")
    public native boolean isPersistent();
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    @Property(selector = "webViewConfiguration")
    public native WKWebViewConfiguration getWebViewConfiguration();
    @Property(selector = "setWebViewConfiguration:")
    public native void setWebViewConfiguration(WKWebViewConfiguration v);
    @Property(selector = "defaultWebsiteDataStore")
    public native WKWebsiteDataStore getDefaultWebsiteDataStore();
    @Property(selector = "setDefaultWebsiteDataStore:")
    public native void setDefaultWebsiteDataStore(WKWebsiteDataStore v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultConfiguration")
    public static native WKWebExtensionControllerConfiguration defaultConfiguration();
    @Method(selector = "nonPersistentConfiguration")
    public static native WKWebExtensionControllerConfiguration nonPersistentConfiguration();
    @Method(selector = "configurationWithIdentifier:")
    protected static native @Pointer long create(NSUUID identifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
