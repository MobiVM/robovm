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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWRelayHop/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWRelayHopPtr extends Ptr<NWRelayHop, NWRelayHopPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWRelayHop.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    public NWRelayHop(NWEndpoint http3_relay_endpoint, NWEndpoint http2_relay_endpoint, NWProtocolOptions relay_tls_options) { super((Handle) null, create(http3_relay_endpoint, http2_relay_endpoint, relay_tls_options));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_relay_hop_create", optional=true)
    private static native @Pointer long create(NWEndpoint http3_relay_endpoint, NWEndpoint http2_relay_endpoint, NWProtocolOptions relay_tls_options);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_relay_hop_add_additional_http_header_field", optional=true)
    public native void addAdditionalHttpHeaderField(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String field_name, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String field_value);
    
    
    /*</methods>*/
}
