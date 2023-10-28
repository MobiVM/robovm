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
package org.robovm.apple.network;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Network")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWProxyConfig/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWProxyConfigPtr extends Ptr<NWProxyConfig, NWProxyConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWProxyConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_create_relay", optional=true)
    public static native NWProxyConfig createRelay(NWRelayHop first_hop, NWRelayHop second_hop);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_create_oblivious_http", optional=true)
    public static native NWProxyConfig createObliviousHttp(NWRelayHop relay, BytePtr relay_resource_path, byte[] gateway_key_config, @MachineSizedUInt long gateway_key_config_length);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_create_http_connect", optional=true)
    public static native NWProxyConfig createHttpConnect(NWEndpoint proxy_endpoint, NWProtocolOptions proxy_tls_options);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_create_socksv5", optional=true)
    public static native NWProxyConfig createSocksv5(NWEndpoint proxy_endpoint);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_set_username_and_password", optional=true)
    public native void setUsernameAndPassword(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String username, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String password);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_set_failover_allowed", optional=true)
    public native void setFailoverAllowed(boolean failover_allowed);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_get_failover_allowed", optional=true)
    public native boolean getFailoverAllowed();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_add_match_domain", optional=true)
    public native void addMatchDomain(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String match_domain);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_clear_match_domains", optional=true)
    public native void clearMatchDomains();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_add_excluded_domain", optional=true)
    public native void addExcludedDomain(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String excluded_domain);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_clear_excluded_domains", optional=true)
    public native void clearExcludedDomains();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_enumerate_match_domains", optional=true)
    public native void enumerateMatchDomains(@Block VoidBlock1<BytePtr> enumerator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_proxy_config_enumerate_excluded_domains", optional=true)
    public native void enumerateExcludedDomains(@Block VoidBlock1<BytePtr> enumerator);
    
    
    /*</methods>*/
}
