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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_connection")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWConnection/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWConnectionPtr extends Ptr<NWConnection, NWConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWConnection.class); }/*</bind>*/
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
    @GlobalValue(symbol="_nw_connection_send_idempotent_content", optional=true)
    public static native @Block VoidBlock1<NWError> SEND_IDEMPOTENT_CONTENT();
    
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_create", optional=true)
    public static native NWConnection create(NWEndpoint endpoint, NWParameters parameters);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_copy_endpoint", optional=true)
    public native NWEndpoint copyEndpoint();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_copy_parameters", optional=true)
    public native NWParameters copyParameters();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_set_state_changed_handler", optional=true)
    public native void setStateChangedHandler(@Block VoidBlock2<NWConnectionState, NWError> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_set_viability_changed_handler", optional=true)
    public native void setViabilityChangedHandler(@Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_set_better_path_available_handler", optional=true)
    public native void setBetterPathAvailableHandler(@Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_set_path_changed_handler", optional=true)
    public native void setPathChangedHandler(@Block VoidBlock1<NWPath> handler);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_set_queue", optional=true)
    public native void setQueue(DispatchQueue queue);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_start", optional=true)
    public native void start();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_restart", optional=true)
    public native void restart();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_cancel", optional=true)
    public native void cancel();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_force_cancel", optional=true)
    public native void forceCancel();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_cancel_current_endpoint", optional=true)
    public native void cancelCurrentEndpoint();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_receive", optional=true)
    public native void receive(int minimum_incomplete_length, int maximum_length, @Block VoidBlock4<DispatchData, NWContentContext, Boolean, NWError> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_receive_message", optional=true)
    public native void receiveMessage(@Block VoidBlock4<DispatchData, NWContentContext, Boolean, NWError> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_send", optional=true)
    public native void send(DispatchData content, NWContentContext context, boolean is_complete, @Block VoidBlock1<NWError> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_batch", optional=true)
    public native void batch(@Block Runnable batch_block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_copy_description", optional=true)
    public native BytePtr copyDescription();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_copy_current_path", optional=true)
    public native NWPath copyCurrentPath();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_copy_protocol_metadata", optional=true)
    public native NWProtocolMetadata copyProtocolMetadata(NWProtocolDefinition definition);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_connection_get_maximum_datagram_size", optional=true)
    public native int getMaximumDatagramSize();
    
    
    /*</methods>*/
}
