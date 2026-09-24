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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROTASoftwareUpdateProviderClusterQueryImageParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROTASoftwareUpdateProviderClusterQueryImageParamsPtr extends Ptr<MTROTASoftwareUpdateProviderClusterQueryImageParams, MTROTASoftwareUpdateProviderClusterQueryImageParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROTASoftwareUpdateProviderClusterQueryImageParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTROTASoftwareUpdateProviderClusterQueryImageParams() {}
    protected MTROTASoftwareUpdateProviderClusterQueryImageParams(Handle h, long handle) { super(h, handle); }
    protected MTROTASoftwareUpdateProviderClusterQueryImageParams(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setVendorID:")
    public native void setVendorID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "productID")
    public native NSNumber getProductID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setProductID:")
    public native void setProductID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "softwareVersion")
    public native NSNumber getSoftwareVersion();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setSoftwareVersion:")
    public native void setSoftwareVersion(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "protocolsSupported")
    public native NSArray<?> getProtocolsSupported();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setProtocolsSupported:")
    public native void setProtocolsSupported(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "hardwareVersion")
    public native NSNumber getHardwareVersion();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setHardwareVersion:")
    public native void setHardwareVersion(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "location")
    public native String getLocation();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setLocation:")
    public native void setLocation(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "requestorCanConsent")
    public native NSNumber getRequestorCanConsent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setRequestorCanConsent:")
    public native void setRequestorCanConsent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "metadataForProvider")
    public native NSData getMetadataForProvider();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMetadataForProvider:")
    public native void setMetadataForProvider(NSData v);
    @Property(selector = "timedInvokeTimeoutMs")
    public native NSNumber getTimedInvokeTimeoutMs();
    @Property(selector = "setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(NSNumber v);
    @Property(selector = "serverSideProcessingTimeout")
    public native NSNumber getServerSideProcessingTimeout();
    @Property(selector = "setServerSideProcessingTimeout:")
    public native void setServerSideProcessingTimeout(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
