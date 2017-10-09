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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEProxySettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEProxySettingsPtr extends Ptr<NEProxySettings, NEProxySettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEProxySettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEProxySettings() {}
    protected NEProxySettings(Handle h, long handle) { super(h, handle); }
    protected NEProxySettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NEProxySettings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "autoProxyConfigurationEnabled")
    public native boolean isAutoProxyConfigurationEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAutoProxyConfigurationEnabled:")
    public native void setAutoProxyConfigurationEnabled(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "proxyAutoConfigurationURL")
    public native NSURL getProxyAutoConfigurationURL();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProxyAutoConfigurationURL:")
    public native void setProxyAutoConfigurationURL(NSURL v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "proxyAutoConfigurationJavaScript")
    public native String getProxyAutoConfigurationJavaScript();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProxyAutoConfigurationJavaScript:")
    public native void setProxyAutoConfigurationJavaScript(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "HTTPEnabled")
    public native boolean isHTTPEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setHTTPEnabled:")
    public native void setHTTPEnabled(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "HTTPServer")
    public native NEProxyServer getHTTPServer();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setHTTPServer:")
    public native void setHTTPServer(NEProxyServer v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "HTTPSEnabled")
    public native boolean isHTTPSEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setHTTPSEnabled:")
    public native void setHTTPSEnabled(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "HTTPSServer")
    public native NEProxyServer getHTTPSServer();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setHTTPSServer:")
    public native void setHTTPSServer(NEProxyServer v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "excludeSimpleHostnames")
    public native boolean isExcludeSimpleHostnames();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setExcludeSimpleHostnames:")
    public native void setExcludeSimpleHostnames(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "exceptionList")
    public native NSArray<NSString> getExceptionList();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setExceptionList:")
    public native void setExceptionList(NSArray<NSString> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "matchDomains")
    public native NSArray<NSString> getMatchDomains();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMatchDomains:")
    public native void setMatchDomains(NSArray<NSString> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
