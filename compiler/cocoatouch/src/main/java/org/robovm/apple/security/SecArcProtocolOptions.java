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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Security") @NativeProtocolProxy("OS_sec_protocol_options")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/SecArcProtocolOptions/*</name>*/ 
    extends /*<extends>*/SecArcObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class SecArcProtocolOptionsPtr extends Ptr<SecArcProtocolOptions, SecArcProtocolOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SecArcProtocolOptions.class); }/*</bind>*/
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
    @Bridge(symbol="sec_protocol_options_set_local_identity", optional=true)
    public native void setLocalIdentity(SecArcIdentity identity);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_add_tls_ciphersuite", optional=true)
    public native void addTlsCiphersuite(SSLCipherSuite ciphersuite);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_add_tls_ciphersuite_group", optional=true)
    public native void addTlsCiphersuiteGroup(SSLCiphersuiteGroup group);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_min_version", optional=true)
    public native void setTlsMinVersion(SSLProtocol version);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_max_version", optional=true)
    public native void setTlsMaxVersion(SSLProtocol version);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_add_tls_application_protocol", optional=true)
    public native void addTlsApplicationProtocol(BytePtr application_protocol);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_server_name", optional=true)
    public native void setTlsServerName(BytePtr server_name);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_diffie_hellman_parameters", optional=true)
    public native void set_tlsDiffieHellmanParameters(DispatchData params);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_add_pre_shared_key", optional=true)
    public native void addPreSharedKey(DispatchData psk, DispatchData psk_identity);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_tickets_enabled", optional=true)
    public native void setTlsTicketsEnabled(boolean tickets_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_is_fallback_attempt", optional=true)
    public native void set_tlsIsFallbackAttempt(boolean is_fallback_attempt);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_resumption_enabled", optional=true)
    public native void setTlsResumptionEnabled(boolean resumption_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_false_start_enabled", optional=true)
    public native void set_tlsFalseStartEnabled(boolean false_start_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_ocsp_enabled", optional=true)
    public native void setTlsOcspEnabled(boolean ocsp_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_sct_enabled", optional=true)
    public native void setTlsSctEnabled(boolean sct_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_tls_renegotiation_enabled", optional=true)
    public native void setTlsRenegotiationEnabled(boolean renegotiation_enabled);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_peer_authentication_required", optional=true)
    public native void setPeerAuthenticationRequired(boolean peer_authentication_required);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_key_update_block", optional=true)
    public native void setKeyUpdateBlock(@Block("(,@Block)") VoidBlock2<SecArcProtocolMetadata, Runnable> key_update_block, DispatchQueue key_update_queue);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_challenge_block", optional=true)
    public native void setChallengeBlock(@Block("(,@Block)") VoidBlock2<SecArcProtocolMetadata, VoidBlock1<SecArcIdentity>> challenge_block, DispatchQueue challenge_queue);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_options_set_verify_block", optional=true)
    public native void setVerifyBlock(@Block("(,,@Block)") VoidBlock3<SecArcProtocolMetadata, SecArcTrust, VoidBooleanBlock> verify_block, DispatchQueue verify_block_queue);
    
    
    /*</methods>*/
}
