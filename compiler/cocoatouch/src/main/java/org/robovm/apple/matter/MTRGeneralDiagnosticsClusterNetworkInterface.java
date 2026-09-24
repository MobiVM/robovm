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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRGeneralDiagnosticsClusterNetworkInterface/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRGeneralDiagnosticsClusterNetworkInterfacePtr extends Ptr<MTRGeneralDiagnosticsClusterNetworkInterface, MTRGeneralDiagnosticsClusterNetworkInterfacePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRGeneralDiagnosticsClusterNetworkInterface.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRGeneralDiagnosticsClusterNetworkInterface() {}
    protected MTRGeneralDiagnosticsClusterNetworkInterface(Handle h, long handle) { super(h, handle); }
    protected MTRGeneralDiagnosticsClusterNetworkInterface(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "isOperational")
    public native NSNumber getIsOperational();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setIsOperational:")
    public native void setIsOperational(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "offPremiseServicesReachableIPv4")
    public native NSNumber getOffPremiseServicesReachableIPv4();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOffPremiseServicesReachableIPv4:")
    public native void setOffPremiseServicesReachableIPv4(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "offPremiseServicesReachableIPv6")
    public native NSNumber getOffPremiseServicesReachableIPv6();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOffPremiseServicesReachableIPv6:")
    public native void setOffPremiseServicesReachableIPv6(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "hardwareAddress")
    public native NSData getHardwareAddress();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setHardwareAddress:")
    public native void setHardwareAddress(NSData v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "iPv4Addresses")
    public native NSArray<?> getIPv4Addresses();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setIPv4Addresses:")
    public native void setIPv4Addresses(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "iPv6Addresses")
    public native NSArray<?> getIPv6Addresses();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setIPv6Addresses:")
    public native void setIPv6Addresses(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "type")
    public native NSNumber getType();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setType:")
    public native void setType(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
