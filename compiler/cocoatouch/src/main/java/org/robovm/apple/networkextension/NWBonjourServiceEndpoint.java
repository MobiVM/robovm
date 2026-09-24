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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_t` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NWBonjourServiceEndpoint/*</name>*/ 
    extends /*<extends>*/NWEndpoint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NWBonjourServiceEndpointPtr extends Ptr<NWBonjourServiceEndpoint, NWBonjourServiceEndpointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWBonjourServiceEndpoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NWBonjourServiceEndpoint() {}
    protected NWBonjourServiceEndpoint(Handle h, long handle) { super(h, handle); }
    protected NWBonjourServiceEndpoint(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_create_bonjour_service` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
     */
    @Deprecated
    public NWBonjourServiceEndpoint(String name, String type, String domain) { super((Handle) null, create(name, type, domain)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_get_bonjour_service_name` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
     */
    @Deprecated
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_get_bonjour_service_type` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
     */
    @Deprecated
    @Property(selector = "type")
    public native String getType();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_get_bonjour_service_domain` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
     */
    @Deprecated
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use `nw_endpoint_create_bonjour_service` in Network framework instead, see deprecation notice in <NetworkExtension/NWBonjourServiceEndpoint.h>
     */
    @Deprecated
    @Method(selector = "endpointWithName:type:domain:")
    protected static native @Pointer long create(String name, String type, String domain);
    /*</methods>*/
}
