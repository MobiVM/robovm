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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWFramer/*</name>*/
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWFramerPtr extends Ptr<NWFramer, NWFramerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWFramer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_message_create", optional=true)
    public native NWFramerMessage createMessage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_create_definition", optional=true)
    public static native NWProtocolDefinition createDefinition(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String identifier, int flags, @Block Block1<NWFramer, NWFramerStartResult> start_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_set_input_handler", optional=true)
    public native void setInputHandler(@Block Block1<NWFramer, Long> input_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_set_output_handler", optional=true)
    public native void setOutputHandler(@Block("(,,@MachineSizedUInt,)") VoidBlock4<NWFramer, NWFramerMessage, Long, Boolean> output_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_set_wakeup_handler", optional=true)
    public native void setWakeupHandler(@Block VoidBlock1<NWFramer> wakeup_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_set_stop_handler", optional=true)
    public native void setStopHandler(@Block Block1<NWFramer, Boolean> stop_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_set_cleanup_handler", optional=true)
    public native void setCleanupHandler(@Block VoidBlock1<NWFramer> cleanup_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_mark_ready", optional=true)
    public native void markReady();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_prepend_application_protocol", optional=true)
    public native boolean prependApplicationProtocol(NWProtocolOptions protocol_options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_mark_failed_with_error", optional=true)
    public native void markFailedWithError(int error_code);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_parse_input", optional=true)
    public native boolean parseInput(@MachineSizedUInt long minimum_incomplete_length, @MachineSizedUInt long maximum_length, BytePtr temp_buffer, @Block("(,@MachineSizedUInt,)") Block3<BytePtr, Long, Boolean, Long> parse);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_deliver_input", optional=true)
    public native void deliverInput(BytePtr input_buffer, @MachineSizedUInt long input_length, NWFramerMessage message, boolean is_complete);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_deliver_input_no_copy", optional=true)
    public native boolean deliverInputNoCopy(@MachineSizedUInt long input_length, NWFramerMessage message, boolean is_complete);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_pass_through_input", optional=true)
    public native void passThroughInput();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_parse_output", optional=true)
    public native boolean parseOutput(@MachineSizedUInt long minimum_incomplete_length, @MachineSizedUInt long maximum_length, BytePtr temp_buffer, @Block("(,@MachineSizedUInt,)") Block3<BytePtr, Long, Boolean, Long> parse);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_write_output", optional=true)
    public native void writeOutput(BytePtr output_buffer, @MachineSizedUInt long output_length);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_write_output_data", optional=true)
    public native void writeOutputData(DispatchData output_data);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_write_output_no_copy", optional=true)
    public native boolean writeOutputNoCopy(@MachineSizedUInt long output_length);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_pass_through_output", optional=true)
    public native void passThroughOutput();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_schedule_wakeup", optional=true)
    public native void scheduleWakeup(long milliseconds);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_async", optional=true)
    public native void async(@Block Runnable async_block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_copy_remote_endpoint", optional=true)
    public native NWEndpoint copyRemoteEndpoint();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_copy_local_endpoint", optional=true)
    public native NWEndpoint copyLocalEndpoint();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_copy_parameters", optional=true)
    public native NWParameters copyParameters();
    
    
    /*</methods>*/
}
