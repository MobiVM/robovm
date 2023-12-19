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
package org.robovm.apple.matter;

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
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRNetworkCommissioningClusterWiFiInterfaceScanResultStructPtr extends Ptr<MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct, MTRNetworkCommissioningClusterWiFiInterfaceScanResultStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct() {}
    protected MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct(Handle h, long handle) { super(h, handle); }
    protected MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "security")
    public native NSNumber getSecurity();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSecurity:")
    public native void setSecurity(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "ssid")
    public native NSData getSsid();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSsid:")
    public native void setSsid(NSData v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "bssid")
    public native NSData getBssid();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setBssid:")
    public native void setBssid(NSData v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "channel")
    public native NSNumber getChannel();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setChannel:")
    public native void setChannel(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "wiFiBand")
    public native NSNumber getWiFiBand();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setWiFiBand:")
    public native void setWiFiBand(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "rssi")
    public native NSNumber getRssi();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setRssi:")
    public native void setRssi(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
