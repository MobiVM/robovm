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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_protocol_stack")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWProtocolStack/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWProtocolStackPtr extends Ptr<NWProtocolStack, NWProtocolStackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWProtocolStack.class); }/*</bind>*/
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
    @Bridge(symbol="nw_protocol_stack_prepend_application_protocol", optional=true)
    public native void prependApplicationProtocol(NWProtocolOptions protocol);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_stack_clear_application_protocols", optional=true)
    public native void clearApplicationProtocols();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_stack_iterate_application_protocols", optional=true)
    public native void iterateApplicationProtocols(@Block VoidBlock1<NWProtocolOptions> iterate_block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_stack_copy_transport_protocol", optional=true)
    public native NWProtocolOptions copyTransportProtocol();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_stack_set_transport_protocol", optional=true)
    public native void setTransportProtocol(NWProtocolOptions protocol);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_protocol_stack_copy_internet_protocol", optional=true)
    public native NWProtocolOptions copyInternetProtocol();
    
    
    /*</methods>*/
}
