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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_protocol_metadata")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWProtocolMetadata/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWProtocolMetadataPtr extends Ptr<NWProtocolMetadata, NWProtocolMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWProtocolMetadata.class); }/*</bind>*/
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
    @Bridge(symbol="nw_protocol_metadata_copy_definition", optional=true)
    public native NWProtocolDefinition copyDefinition();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_create_metadata", optional=true)
    public static native NWProtocolMetadata createIpMetadata();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_metadata_is_ip", optional=true)
    public native boolean isIp();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_metadata_set_ecn_flag", optional=true)
    public native void setIpEcnFlag(NWIpEcnFlag ecn_flag);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_metadata_get_ecn_flag", optional=true)
    public native NWIpEcnFlag getIpEcnFlag();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_metadata_set_service_class", optional=true)
    public native void setIpServiceClass(NWServiceClass service_class);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_metadata_get_service_class", optional=true)
    public native NWServiceClass getIpServiceClass();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_ip_metadata_get_receive_time", optional=true)
    public native long getIpReceiveTime();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_metadata_is_tcp", optional=true)
    public native boolean isTcp();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_get_available_receive_buffer", optional=true)
    public native int getTcpAvailableReceiveBuffer();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tcp_get_available_send_buffer", optional=true)
    public native int getTcpAvailableSendBuffer();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_metadata_is_tls", optional=true)
    public native boolean isTls();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_tls_copy_sec_protocol_metadata", optional=true)
    public native SecArcProtocolMetadata copySecArcProtocolMetadata();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_udp_create_metadata", optional=true)
    public static native NWProtocolMetadata createUdpMetadata();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_metadata_is_udp", optional=true)
    public native boolean isUdp();
    
    
    /*</methods>*/
}
