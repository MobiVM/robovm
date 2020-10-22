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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWResolutionReport/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWResolutionReportPtr extends Ptr<NWResolutionReport, NWResolutionReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWResolutionReport.class); }/*</bind>*/
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
    @Bridge(symbol="nw_resolution_report_get_source", optional=true)
    public native NWReportResolutionSource getSource();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolution_report_get_milliseconds", optional=true)
    public native long getMilliseconds();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolution_report_get_endpoint_count", optional=true)
    public native int getEndpointCount();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolution_report_copy_successful_endpoint", optional=true)
    public native NWEndpoint copySuccessfulEndpoint();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolution_report_copy_preferred_endpoint", optional=true)
    public native NWEndpoint copyPreferredEndpoint();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="nw_resolution_report_get_protocol", optional=true)
    public native NWReportResolutionProtocol getProtocol();
    
    
    /*</methods>*/
}
