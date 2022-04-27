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
/*<annotations>*/@Library("Network") @NativeClass("NSObject")/*</annotations>*/
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
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_create_options", optional=true)
    public static native NWProtocolOptions createFramerOptions(NWProtocolDefinition framer_definition);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Bridge(symbol="nw_framer_options_set_object_value", optional=true)
    public native void setFramerObjectValue(BytePtr key, NSObject value);
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
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_local_address_preference", optional=true)
    public native void setIpLocalAddressPreference(NWIpLocalAddressPreference preference);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_ip_options_set_disable_multicast_loopback", optional=true)
    public native void setIpDisableMulticastLoopback(boolean disable_multicast_loopback);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_create_options", optional=true)
    public static native NWProtocolOptions createQuicOptions();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_protocol_options_is_quic", optional=true)
    public native boolean isQuic();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_add_tls_application_protocol", optional=true)
    public native void addQuicTlsApplicationProtocol(BytePtr application_protocol);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_copy_sec_protocol_options", optional=true)
    public native SecArcProtocolOptions copyQuicSecProtocolOptions();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_stream_is_unidirectional", optional=true)
    public native boolean getQuicStreamIsUnidirectional();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_stream_is_unidirectional", optional=true)
    public native void setQuicStreamIsUnidirectional(boolean is_unidirectional);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_data", optional=true)
    public native long getQuicInitialMaxData();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_data", optional=true)
    public native void setQuicInitialMaxData(long initial_max_data);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_max_udp_payload_size", optional=true)
    public native short getQuicMaxUdpPayloadSize();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_max_udp_payload_size", optional=true)
    public native void setQuicMaxUdpPayloadSize(short max_udp_payload_size);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_idle_timeout", optional=true)
    public native int getQuicIdleTimeout();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_idle_timeout", optional=true)
    public native void setQuicIdleTimeout(int idle_timeout);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_streams_bidirectional", optional=true)
    public native long getQuicInitialMaxStreamsBidirectional();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_streams_bidirectional", optional=true)
    public native void setQuicInitialMaxStreamsBidirectional(long initial_max_streams_bidirectional);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_streams_unidirectional", optional=true)
    public native long getQuicInitialMaxStreamsUnidirectional();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_streams_unidirectional", optional=true)
    public native void setQuicInitialMaxStreamsUnidirectional(long initial_max_streams_unidirectional);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_stream_data_bidirectional_local", optional=true)
    public native long getQuicInitialMaxStreamDataBidirectionalLocal();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_stream_data_bidirectional_local", optional=true)
    public native void setQuicInitialMaxStreamDataBidirectionalLocal(long initial_max_stream_data_bidirectional_local);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_stream_data_bidirectional_remote", optional=true)
    public native long getQuicInitialMaxStreamDataBidirectionalRemote();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_stream_data_bidirectional_remote", optional=true)
    public native void setQuicInitialMaxStreamDataBidirectionalRemote(long initial_max_stream_data_bidirectional_remote);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_get_initial_max_stream_data_unidirectional", optional=true)
    public native long getQuicInitialMaxStreamDataUnidirectional();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_quic_set_initial_max_stream_data_unidirectional", optional=true)
    public native void setQuicInitialMaxStreamDataUnidirectional(long initial_max_stream_data_unidirectional);
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
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="nw_tcp_options_set_multipath_force_version", optional=true)
    public native void setTcpMultipathForceVersion(NWMultipathVersion multipath_force_version);
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
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_create_options", optional=true)
    public static native NWProtocolOptions createWsOptions(NWWsVersion version);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_add_additional_header", optional=true)
    public native void addAdditionalHeader(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String name, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_add_subprotocol", optional=true)
    public native void addSubprotocol(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String subprotocol);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_set_auto_reply_ping", optional=true)
    public native void setWsAutoReplyPing(boolean auto_reply_ping);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_set_skip_handshake", optional=true)
    public native void setWsSkipHandshake(boolean skip_handshake);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_set_maximum_message_size", optional=true)
    public native void setWsMaximumMessageSize(@MachineSizedUInt long maximum_message_size);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_options_set_client_request_handler", optional=true)
    public native void setWsClientRequestHandler(DispatchQueue client_queue, @Block Block1<NWWsRequest, NWWsResponse> handler);
    
    
    /*</methods>*/
}
