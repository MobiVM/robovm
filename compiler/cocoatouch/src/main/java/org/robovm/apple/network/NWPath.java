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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_path")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWPath/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWPathPtr extends Ptr<NWPath, NWPathPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWPath.class); }/*</bind>*/
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
    @Bridge(symbol="nw_path_get_status", optional=true)
    public native NWPathStatus getStatus();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_enumerate_interfaces", optional=true)
    public native void enumerateInterfaces(@Block Block1<NWInterface, Boolean> enumerate_block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_is_equal", optional=true)
    public native boolean isEqual(NWPath other_path);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_is_expensive", optional=true)
    public native boolean isExpensive();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_has_ipv4", optional=true)
    public native boolean hasIpv4();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_has_ipv6", optional=true)
    public native boolean hasIpv6();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_has_dns", optional=true)
    public native boolean hasDns();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_uses_interface_type", optional=true)
    public native boolean usesInterfaceType(NWInterfaceType interface_type);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_copy_effective_local_endpoint", optional=true)
    public native NWEndpoint copyEffectiveLocalEndpoint();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_path_copy_effective_remote_endpoint", optional=true)
    public native NWEndpoint copyEffectiveRemoteEndpoint();
    
    
    /*</methods>*/
}
