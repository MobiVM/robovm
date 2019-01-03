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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_protocol_options")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWProtocolOptions/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWProtocolOptionsPtr extends Ptr<NWProtocolOptions, NWProtocolOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWProtocolOptions.class); }/*</bind>*/
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
    @Bridge(symbol="nw_protocol_options_copy_definition", optional=true)
    public native NWProtocolDefinition copyDefinition();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_version", optional=true)
    public native void setIpVersion(NWIpVersion version);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_hop_limit", optional=true)
    public native void setIpHopLimit(byte hop_limit);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_use_minimum_mtu", optional=true)
    public native void setIpUseMinimumMtu(boolean use_minimum_mtu);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_disable_fragmentation", optional=true)
    public native void setIpDisableFragmentation(boolean disable_fragmentation);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_calculate_receive_time", optional=true)
    public native void setIpCalculateReceiveTime(boolean calculate_receive_time);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_create_options", optional=true)
    public static native NWProtocolOptions createTcpOptions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_no_delay", optional=true)
    public native void setTcpNoDelay(boolean no_delay);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_no_push", optional=true)
    public native void setTcpNoPush(boolean no_push);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_no_options", optional=true)
    public native void setTcpNoOptions(boolean no_options);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_enable_keepalive", optional=true)
    public native void setTcpEnableKeepalive(boolean enable_keepalive);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_keepalive_count", optional=true)
    public native void setTcpKeepaliveCount(int keepalive_count);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_keepalive_idle_time", optional=true)
    public native void setTcpKeepaliveIdleTime(int keepalive_idle_time);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_keepalive_interval", optional=true)
    public native void setTcpKeepaliveInterval(int keepalive_interval);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_maximum_segment_size", optional=true)
    public native void setTcpMaximumSegmentSize(int maximum_segment_size);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_connection_timeout", optional=true)
    public native void setTcpConnectionTimeout(int connection_timeout);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_persist_timeout", optional=true)
    public native void setTcpPersistTimeout(int persist_timeout);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_retransmit_connection_drop_time", optional=true)
    public native void setTcpRetransmitConnectionDropTime(int retransmit_connection_drop_time);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_retransmit_fin_drop", optional=true)
    public native void setTcpRetransmitFinDrop(boolean retransmit_fin_drop);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_disable_ack_stretching", optional=true)
    public native void setTcpDisableAckStretching(boolean disable_ack_stretching);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_enable_fast_open", optional=true)
    public native void setTcpEnableFastOpen(boolean enable_fast_open);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_disable_ecn", optional=true)
    public native void setTcpDisableEcn(boolean disable_ecn);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tls_create_options", optional=true)
    public static native NWProtocolOptions createTlsOptions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tls_copy_sec_protocol_options", optional=true)
    public native SecArcProtocolOptions copySecArcProtocolOptions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_udp_create_options", optional=true)
    public static native NWProtocolOptions createUdpOptions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_udp_options_set_prefer_no_checksum", optional=true)
    public native void setUdpPreferNoChecksum(boolean prefer_no_checksum);
    
    
    /*</methods>*/
}
