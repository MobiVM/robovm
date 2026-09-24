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
 * @since Available in iOS 16.1 and later.
 * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRNetworkCommissioningClusterThreadInterfaceScanResult/*</name>*/ 
    extends /*<extends>*/MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRNetworkCommissioningClusterThreadInterfaceScanResultPtr extends Ptr<MTRNetworkCommissioningClusterThreadInterfaceScanResult, MTRNetworkCommissioningClusterThreadInterfaceScanResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRNetworkCommissioningClusterThreadInterfaceScanResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRNetworkCommissioningClusterThreadInterfaceScanResult() {}
    protected MTRNetworkCommissioningClusterThreadInterfaceScanResult(Handle h, long handle) { super(h, handle); }
    protected MTRNetworkCommissioningClusterThreadInterfaceScanResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "panId")
    public native NSNumber getPanId();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setPanId:")
    public native void setPanId(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "extendedPanId")
    public native NSNumber getExtendedPanId();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setExtendedPanId:")
    public native void setExtendedPanId(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "networkName")
    public native String getNetworkName();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setNetworkName:")
    public native void setNetworkName(String v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "channel")
    public native NSNumber getChannel();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setChannel:")
    public native void setChannel(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "version")
    public native NSNumber getVersion();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setVersion:")
    public native void setVersion(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "extendedAddress")
    public native NSData getExtendedAddress();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setExtendedAddress:")
    public native void setExtendedAddress(NSData v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "rssi")
    public native NSNumber getRssi();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setRssi:")
    public native void setRssi(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "lqi")
    public native NSNumber getLqi();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct
     */
    @Deprecated
    @Property(selector = "setLqi:")
    public native void setLqi(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
