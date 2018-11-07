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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_listener")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWListener/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWListenerPtr extends Ptr<NWListener, NWListenerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWListener.class); }/*</bind>*/
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
    @Bridge(symbol="nw_listener_create_with_port", optional=true)
    public static native NWListener createWithPort(BytePtr port, NWParameters parameters);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_create", optional=true)
    public static native NWListener create(NWParameters parameters);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_create_with_connection", optional=true)
    public static native NWListener createWithConnection(NWConnection connection, NWParameters parameters);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_set_queue", optional=true)
    public native void setQueue(DispatchQueue queue);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_set_state_changed_handler", optional=true)
    public native void setStateChangedHandler(@Block VoidBlock2<NWListenerState, NWError> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_set_new_connection_handler", optional=true)
    public native void setNewConnectionHandler(@Block VoidBlock1<NWConnection> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_set_advertise_descriptor", optional=true)
    public native void setAdvertiseDescriptor(NWAdvertiseDescriptor advertise_descriptor);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_set_advertised_endpoint_changed_handler", optional=true)
    public native void setAdvertisedEndpointChangedHandler(@Block VoidBlock2<NWEndpoint, Boolean> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_get_port", optional=true)
    public native short getPort();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_start", optional=true)
    public native void start();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_listener_cancel", optional=true)
    public native void cancel();
    
    
    /*</methods>*/
}
