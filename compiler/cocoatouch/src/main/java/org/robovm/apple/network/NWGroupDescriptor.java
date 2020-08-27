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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWGroupDescriptor/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWGroupDescriptorPtr extends Ptr<NWGroupDescriptor, NWGroupDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWGroupDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NWGroupDescriptor(NWEndpoint multicast_group) { super((Handle) null, createMulticast(multicast_group));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="nw_group_descriptor_create_multicast", optional=true)
    private static native @Pointer long createMulticast(NWEndpoint multicast_group);
    @Bridge(symbol="nw_group_descriptor_add_endpoint", optional=true)
    public native boolean addEndpoint(NWEndpoint endpoint);
    @Bridge(symbol="nw_group_descriptor_enumerate_endpoints", optional=true)
    public native void enumerateEndpoints(@Block Block1<NWEndpoint, Boolean> enumerate_block);
    @Bridge(symbol="nw_multicast_group_descriptor_set_specific_source", optional=true)
    public native void setSpecificSource(NWEndpoint source);
    @Bridge(symbol="nw_multicast_group_descriptor_set_disable_unicast_traffic", optional=true)
    public native void setDisableUnicastTraffic(boolean disable_unicast_traffic);
    @Bridge(symbol="nw_multicast_group_descriptor_get_disable_unicast_traffic", optional=true)
    public native boolean getDisableUnicastTraffic();
    
    
    /*</methods>*/
}
