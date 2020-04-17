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
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NETunnelProvider/*</name>*/ 
    extends /*<extends>*/NEProvider/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NETunnelProviderPtr extends Ptr<NETunnelProvider, NETunnelProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NETunnelProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NETunnelProvider() {}
    protected NETunnelProvider(Handle h, long handle) { super(h, handle); }
    protected NETunnelProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "protocolConfiguration")
    public native NEVPNProtocol getProtocolConfiguration();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "appRules")
    public native NSArray<NEAppRule> getAppRules();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "routingMethod")
    public native NETunnelProviderRoutingMethod getRoutingMethod();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "reasserting")
    public native boolean isReasserting();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setReasserting:")
    public native void setReasserting(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "handleAppMessage:completionHandler:")
    public native void handleAppMessage(NSData messageData, @Block VoidBlock1<NSData> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setTunnelNetworkSettings:completionHandler:")
    public native void setTunnelNetworkSettings(NETunnelNetworkSettings tunnelNetworkSettings, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
