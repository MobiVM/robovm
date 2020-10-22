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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWResolverConfig/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWResolverConfigPtr extends Ptr<NWResolverConfig, NWResolverConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWResolverConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="_nw_privacy_context_default_context", optional=true)
    public static native NWPrivacyContext getDefaultContext();
    
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolver_config_create_https", optional=true)
    public static native NWResolverConfig createHttps(NWEndpoint url_endpoint);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolver_config_create_tls", optional=true)
    public static native NWResolverConfig createTls(NWEndpoint server_endpoint);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolver_config_add_server_address", optional=true)
    public native void addServerAddress(NWEndpoint server_address);
    
    
    /*</methods>*/
}
