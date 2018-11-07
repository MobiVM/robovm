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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_protocol_definition")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWProtocolDefinition/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWProtocolDefinitionPtr extends Ptr<NWProtocolDefinition, NWProtocolDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWProtocolDefinition.class); }/*</bind>*/
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
    @Bridge(symbol="nw_protocol_definition_is_equal", optional=true)
    public native boolean isEqual(NWProtocolDefinition definition2);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_copy_ip_definition", optional=true)
    public static native NWProtocolDefinition copyipDefinition();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_copy_tcp_definition", optional=true)
    public static native NWProtocolDefinition copytcpDefinition();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_copy_tls_definition", optional=true)
    public static native NWProtocolDefinition copytlsDefinition();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_copy_udp_definition", optional=true)
    public static native NWProtocolDefinition copyudpDefinition();
    
    
    /*</methods>*/
}
