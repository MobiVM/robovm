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

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRCommissioningParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRCommissioningParametersPtr extends Ptr<MTRCommissioningParameters, MTRCommissioningParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRCommissioningParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRCommissioningParameters() {}
    protected MTRCommissioningParameters(Handle h, long handle) { super(h, handle); }
    protected MTRCommissioningParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "csrNonce")
    public native NSData getCsrNonce();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setCsrNonce:")
    public native void setCsrNonce(NSData v);
    @Property(selector = "attestationNonce")
    public native NSData getAttestationNonce();
    @Property(selector = "setAttestationNonce:")
    public native void setAttestationNonce(NSData v);
    @Property(selector = "wifiSSID")
    public native NSData getWifiSSID();
    @Property(selector = "setWifiSSID:")
    public native void setWifiSSID(NSData v);
    @Property(selector = "wifiCredentials")
    public native NSData getWifiCredentials();
    @Property(selector = "setWifiCredentials:")
    public native void setWifiCredentials(NSData v);
    @Property(selector = "threadOperationalDataset")
    public native NSData getThreadOperationalDataset();
    @Property(selector = "setThreadOperationalDataset:")
    public native void setThreadOperationalDataset(NSData v);
    @Property(selector = "deviceAttestationDelegate")
    public native MTRDeviceAttestationDelegate getDeviceAttestationDelegate();
    @Property(selector = "setDeviceAttestationDelegate:")
    public native void setDeviceAttestationDelegate(MTRDeviceAttestationDelegate v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "failSafeTimeout")
    public native NSNumber getFailSafeTimeout();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFailSafeTimeout:")
    public native void setFailSafeTimeout(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "skipCommissioningComplete")
    public native boolean isSkipCommissioningComplete();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSkipCommissioningComplete:")
    public native void setSkipCommissioningComplete(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "countryCode")
    public native String getCountryCode();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setCountryCode:")
    public native void setCountryCode(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
