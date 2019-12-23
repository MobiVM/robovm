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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWDataTransferReport/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWDataTransferReportPtr extends Ptr<NWDataTransferReport, NWDataTransferReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWDataTransferReport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="_nw_data_transfer_report_all_paths", optional=true)
    public static native int allPaths();
    
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_state", optional=true)
    public native NWDataTransferReportState getState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_collect", optional=true)
    public native void collect(DispatchQueue queue, @Block VoidBlock1<NWDataTransferReport> collect_block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_duration_milliseconds", optional=true)
    public native long getDurationMilliseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_path_count", optional=true)
    public native int getPathCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_received_ip_packet_count", optional=true)
    public native long getReceivedIpPacketCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_sent_ip_packet_count", optional=true)
    public native long getSentIpPacketCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_received_transport_byte_count", optional=true)
    public native long getReceivedTransportByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_received_transport_duplicate_byte_count", optional=true)
    public native long getReceivedTransportDuplicateByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_received_transport_out_of_order_byte_count", optional=true)
    public native long getReceivedTransportOutOfOrderByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_sent_transport_byte_count", optional=true)
    public native long getSentTransportByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_sent_transport_retransmitted_byte_count", optional=true)
    public native long getSentTransportRetransmittedByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_transport_smoothed_rtt_milliseconds", optional=true)
    public native long getTransportSmoothedRttMilliseconds(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_transport_minimum_rtt_milliseconds", optional=true)
    public native long getTransportMinimumRttMilliseconds(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_transport_rtt_variance", optional=true)
    public native long getTransportRttVariance(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_received_application_byte_count", optional=true)
    public native long getReceivedApplicationByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_get_sent_application_byte_count", optional=true)
    public native long getSentApplicationByteCount(int path_index);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_data_transfer_report_copy_path_interface", optional=true)
    public native NWInterface copyPathInterface(int path_index);
    
    
    /*</methods>*/
}
