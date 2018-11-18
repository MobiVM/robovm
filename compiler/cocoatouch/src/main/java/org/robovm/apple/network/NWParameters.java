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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_parameters")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWParameters/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWParametersPtr extends Ptr<NWParameters, NWParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="_nw_parameters_configure_protocol_default_configuration", optional=true)
    public static native @Block VoidBlock1<NWProtocolOptions> DEFAULT_CONFIGURATION();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="_nw_parameters_configure_protocol_disable", optional=true)
    public static native @Block VoidBlock1<NWProtocolOptions> DISABLE();
    
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_create_secure_tcp", optional=true)
    public static native NWParameters createSecureTcp(@Block VoidBlock1<NWProtocolOptions> configure_tls, @Block VoidBlock1<NWProtocolOptions> configure_tcp);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_create_secure_udp", optional=true)
    public static native NWParameters createSecureUdp(@Block VoidBlock1<NWProtocolOptions> configure_dtls, @Block VoidBlock1<NWProtocolOptions> configure_udp);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_create", optional=true)
    public static native NWParameters create();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_copy", optional=true)
    public native NWParameters copyParameters();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_require_interface", optional=true)
    public native void requireInterface(NWInterface inf);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_copy_required_interface", optional=true)
    public native NWInterface copyRequiredInterface();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_prohibit_interface", optional=true)
    public native void prohibitInterface(NWInterface inf);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_clear_prohibited_interfaces", optional=true)
    public native void clearProhibitedInterfaces();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_iterate_prohibited_interfaces", optional=true)
    public native void iterateProhibitedInterfaces(@Block Block1<NWInterface, Boolean> iterate_block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_required_interface_type", optional=true)
    public native void setRequiredInterfaceType(NWInterfaceType interface_type);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_required_interface_type", optional=true)
    public native NWInterfaceType getRequiredInterfaceType();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_prohibit_interface_type", optional=true)
    public native void prohibitInterfaceType(NWInterfaceType interface_type);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_clear_prohibited_interface_types", optional=true)
    public native void clearProhibitedInterfaceTypes();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_iterate_prohibited_interface_types", optional=true)
    public native void iterateProhibitedInterfaceTypes(@Block Block1<NWInterfaceType, Boolean> iterate_block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_prohibit_expensive", optional=true)
    public native void setProhibitExpensive(boolean prohibit_expensive);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_prohibit_expensive", optional=true)
    public native boolean getProhibitExpensive();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_reuse_local_address", optional=true)
    public native void setReuseLocalAddress(boolean reuse_local_address);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_reuse_local_address", optional=true)
    public native boolean getReuseLocalAddress();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_local_endpoint", optional=true)
    public native void setLocalEndpoint(NWEndpoint local_endpoint);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_copy_local_endpoint", optional=true)
    public native NWEndpoint copyLocalEndpoint();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_include_peer_to_peer", optional=true)
    public native void setIncludePeerToPeer(boolean include_peer_to_peer);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_include_peer_to_peer", optional=true)
    public native boolean getIncludePeerToPeer();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_fast_open_enabled", optional=true)
    public native void setFastOpenEnabled(boolean fast_open_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_fast_open_enabled", optional=true)
    public native boolean getFastOpenEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_service_class", optional=true)
    public native void setServiceClass(NWServiceClass service_class);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_service_class", optional=true)
    public native NWServiceClass getServiceClass();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_multipath_service", optional=true)
    public native void setMultipathService(NWMultipathService multipath_service);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_multipath_service", optional=true)
    public native NWMultipathService getMultipathService();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_copy_default_protocol_stack", optional=true)
    public native NWProtocolStack copyDefaultProtocolStack();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_local_only", optional=true)
    public native void setLocalOnly(boolean local_only);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_local_only", optional=true)
    public native boolean getLocalOnly();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_prefer_no_proxy", optional=true)
    public native void setPreferNoProxy(boolean prefer_no_proxy);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_prefer_no_proxy", optional=true)
    public native boolean getPreferNoProxy();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_set_expired_dns_behavior", optional=true)
    public native void setExpiredDnsBehavior(NWParametersExpiredDnsBehavior expired_dns_behavior);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_parameters_get_expired_dns_behavior", optional=true)
    public native NWParametersExpiredDnsBehavior getExpiredDnsBehavior();
    
    
    /*</methods>*/
}
