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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NETunnelNetworkSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NETunnelNetworkSettingsPtr extends Ptr<NETunnelNetworkSettings, NETunnelNetworkSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NETunnelNetworkSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NETunnelNetworkSettings() {}
    protected NETunnelNetworkSettings(Handle h, long handle) { super(h, handle); }
    protected NETunnelNetworkSettings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithTunnelRemoteAddress:")
    public NETunnelNetworkSettings(String address) { super((SkipInit) null); initObject(init(address)); }
    @Method(selector = "initWithCoder:")
    public NETunnelNetworkSettings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "tunnelRemoteAddress")
    public native String getTunnelRemoteAddress();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "DNSSettings")
    public native NEDNSSettings getDNSSettings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDNSSettings:")
    public native void setDNSSettings(NEDNSSettings v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "proxySettings")
    public native NEProxySettings getProxySettings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProxySettings:")
    public native void setProxySettings(NEProxySettings v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithTunnelRemoteAddress:")
    protected native @Pointer long init(String address);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
