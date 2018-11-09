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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEPacketTunnelNetworkSettings/*</name>*/ 
    extends /*<extends>*/NETunnelNetworkSettings/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEPacketTunnelNetworkSettingsPtr extends Ptr<NEPacketTunnelNetworkSettings, NEPacketTunnelNetworkSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEPacketTunnelNetworkSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEPacketTunnelNetworkSettings() {}
    protected NEPacketTunnelNetworkSettings(Handle h, long handle) { super(h, handle); }
    protected NEPacketTunnelNetworkSettings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithTunnelRemoteAddress:")
    public NEPacketTunnelNetworkSettings(String address) { super(address); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "IPv4Settings")
    public native NEIPv4Settings getIPv4Settings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIPv4Settings:")
    public native void setIPv4Settings(NEIPv4Settings v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "IPv6Settings")
    public native NEIPv6Settings getIPv6Settings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIPv6Settings:")
    public native void setIPv6Settings(NEIPv6Settings v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "tunnelOverheadBytes")
    public native NSNumber getTunnelOverheadBytes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setTunnelOverheadBytes:")
    public native void setTunnelOverheadBytes(NSNumber v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "MTU")
    public native NSNumber getMTU();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMTU:")
    public native void setMTU(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
