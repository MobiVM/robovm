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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWEstablishmentReport/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWEstablishmentReportPtr extends Ptr<NWEstablishmentReport, NWEstablishmentReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWEstablishmentReport.class); }/*</bind>*/
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
    @Bridge(symbol="nw_establishment_report_get_duration_milliseconds", optional=true)
    public native long getDurationMilliseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_get_attempt_started_after_milliseconds", optional=true)
    public native long getAttemptStartedAfterMilliseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_get_previous_attempt_count", optional=true)
    public native int getPreviousAttemptCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_get_used_proxy", optional=true)
    public native boolean getUsedProxy();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_get_proxy_configured", optional=true)
    public native boolean getProxyConfigured();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_copy_proxy_endpoint", optional=true)
    public native NWEndpoint copyProxyEndpoint();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_enumerate_resolutions", optional=true)
    public native void enumerateResolutions(@Block Block5<NWReportResolutionSource, Long, Integer, NWEndpoint, NWEndpoint, Boolean> enumerate_block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_establishment_report_enumerate_protocols", optional=true)
    public native void enumerateProtocols(@Block Block3<NWProtocolDefinition, Long, Long, Boolean> enumerate_block);
    
    
    /*</methods>*/
}
