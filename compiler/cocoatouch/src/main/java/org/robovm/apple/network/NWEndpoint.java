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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_endpoint")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWEndpoint/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWEndpointPtr extends Ptr<NWEndpoint, NWEndpointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWEndpoint.class); }/*</bind>*/
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
    @Bridge(symbol="nw_endpoint_get_type", optional=true)
    public native NWEndpointType getType();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_create_host", optional=true)
    public static native NWEndpoint createHost(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String hostname, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String port);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_get_hostname", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getHostName();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_copy_port_string", optional=true)
    public native BytePtr copyPortString();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_get_port", optional=true)
    public native short getPort();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_copy_address_string", optional=true)
    public native BytePtr copyAddressString();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_create_bonjour_service", optional=true)
    public static native NWEndpoint createBonjourService(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String name, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String type, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String domain);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_get_bonjour_service_name", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getBonjourServiceName();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_get_bonjour_service_type", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getBonjourServiceType();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_endpoint_get_bonjour_service_domain", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getBonjourServiceDomain();
    
    
    /*</methods>*/
}
