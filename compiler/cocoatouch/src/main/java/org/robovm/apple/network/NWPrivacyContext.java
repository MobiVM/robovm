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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWPrivacyContext/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWPrivacyContextPtr extends Ptr<NWPrivacyContext, NWPrivacyContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWPrivacyContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NWPrivacyContext(String description) { super((Handle) null, create(description));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_create", optional=true)
    private static native @Pointer long create(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String description);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_flush_cache", optional=true)
    public native void flushCache();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_disable_logging", optional=true)
    public native void disableLogging();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_require_encrypted_name_resolution", optional=true)
    public native void requireEncryptedNameResolution(boolean require_encrypted_name_resolution, NWResolverConfig fallback_resolver_config);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_add_proxy", optional=true)
    public native void addProxy(NWProxyConfig proxy_config);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="nw_privacy_context_clear_proxies", optional=true)
    public native void clearProxies();
    
    
    /*</methods>*/
}
