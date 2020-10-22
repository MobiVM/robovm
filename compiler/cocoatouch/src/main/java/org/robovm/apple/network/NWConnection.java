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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWConnection/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWConnectionPtr extends Ptr<NWConnection, NWConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    public NWConnection(NWEndpoint endpoint, NWParameters parameters) { super((Handle) null, create(endpoint, parameters));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/

    // manually added wrappers
    public String copyDescription() {
        long ptr = copyDescription0();
        if (ptr != 0) {
            String res = StringMarshalers.AsAsciiZMarshaler.toObject(String.class, ptr, 0);
            // nw_connection_copy_description returns pointer that The caller must call free() on the string.
            VM.free(ptr);
            return res;
        } else {
            return null;
        }
    }

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
    private static native @Pointer long create(NWEndpoint endpoint, NWParameters parameters);
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
    protected native @Pointer long copyDescription0();
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
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_create", optional=true)
    public static native NWConnectionGroup groupCreate(NWGroupDescriptor group_descriptor, NWParameters parameters);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_copy_descriptor", optional=true)
    public static native NWGroupDescriptor groupCopyDescriptor(NWConnectionGroup group);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_copy_parameters", optional=true)
    public static native NWParameters groupCopyParameters(NWConnectionGroup group);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_set_queue", optional=true)
    public static native void groupSetQueue(NWConnectionGroup group, DispatchQueue queue);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_set_state_changed_handler", optional=true)
    public static native void groupSetStateChangedHandler(NWConnectionGroup group, @Block VoidBlock2<NWConnectionGroupState, NWError> state_changed_handler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_set_receive_handler", optional=true)
    public static native void groupSetReceiveHandler(NWConnectionGroup group, int maximum_message_size, boolean reject_oversized_messages, @Block VoidBlock3<DispatchData, NWContentContext, Boolean> receive_handler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_start", optional=true)
    public static native void groupStart(NWConnectionGroup group);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_cancel", optional=true)
    public static native void groupCancel(NWConnectionGroup group);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_copy_remote_endpoint_for_message", optional=true)
    public static native NWEndpoint groupCopyRemoteEndpointForMessage(NWConnectionGroup group, NWContentContext context);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_copy_local_endpoint_for_message", optional=true)
    public static native NWEndpoint groupCopyLocalEndpointForMessage(NWConnectionGroup group, NWContentContext context);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_copy_path_for_message", optional=true)
    public static native NWPath groupCopyPathForMessage(NWConnectionGroup group, NWContentContext context);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_reply", optional=true)
    public static native void groupReply(NWConnectionGroup group, NWContentContext inbound_message, NWContentContext outbound_message, DispatchData content);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_extract_connection_for_message", optional=true)
    public static native NWConnection groupExtractConnectionForMessage(NWConnectionGroup group, NWContentContext context);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_connection_group_send_message", optional=true)
    public static native void groupSendMessage(NWConnectionGroup group, DispatchData content, NWEndpoint endpoint, NWContentContext context, @Block VoidBlock1<NWError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_connection_access_establishment_report", optional=true)
    public native void accessEstablishmentReport(DispatchQueue queue, @Block VoidBlock1<NWEstablishmentReport> access_block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_connection_create_new_data_transfer_report", optional=true)
    public native NWDataTransferReport createNewDataTransferReport();
    
    
    /*</methods>*/
}
