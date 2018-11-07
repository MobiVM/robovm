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
/*<annotations>*/@Library("Security") @NativeProtocolProxy("OS_sec_protocol_metadata")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/SecArcProtocolMetadata/*</name>*/ 
    extends /*<extends>*/SecArcObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class SecArcProtocolMetadataPtr extends Ptr<SecArcProtocolMetadata, SecArcProtocolMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SecArcProtocolMetadata.class); }/*</bind>*/
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
    @Bridge(symbol="sec_protocol_metadata_get_negotiated_protocol", optional=true)
    public native BytePtr getNegotiatedProtocol();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_copy_peer_public_key", optional=true)
    public native DispatchData copyPeerPublicKey();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_get_negotiated_protocol_version", optional=true)
    public native SSLProtocol getNegotiatedProtocolVersion();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_get_negotiated_ciphersuite", optional=true)
    public native SSLCipherSuite getNegotiatedCiphersuite();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_get_early_data_accepted", optional=true)
    public native boolean getEarlyDataAccepted();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_access_peer_certificate_chain", optional=true)
    public native boolean accessPeerCertificateChain(@Block VoidBlock1<SecArcCertificate> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_access_ocsp_response", optional=true)
    public native boolean accessOcspResponse(@Block VoidBlock1<DispatchData> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_access_supported_signature_algorithms", optional=true)
    public native boolean accessSupportedSignatureAlgorithms(@Block VoidShortBlock handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_access_distinguished_names", optional=true)
    public native boolean accessDistinguishedNames(@Block VoidBlock1<DispatchData> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_peers_are_equal", optional=true)
    public native boolean peersAreEqual(SecArcProtocolMetadata metadataB);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_challenge_parameters_are_equal", optional=true)
    public native boolean challengeParametersAreEqual(SecArcProtocolMetadata metadataB);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_create_secret", optional=true)
    public native DispatchData createSecret(@MachineSizedUInt long label_len, BytePtr label, @MachineSizedUInt long exporter_length);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_protocol_metadata_create_secret_with_context", optional=true)
    public native DispatchData createSecretWithContext(@MachineSizedUInt long label_len, BytePtr label, @MachineSizedUInt long context_len, BytePtr context, @MachineSizedUInt long exporter_length);
    
    
    /*</methods>*/
}
