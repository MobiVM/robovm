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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEVPNProtocol/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEVPNProtocolPtr extends Ptr<NEVPNProtocol, NEVPNProtocolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEVPNProtocol.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEVPNProtocol() {}
    protected NEVPNProtocol(Handle h, long handle) { super(h, handle); }
    protected NEVPNProtocol(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NEVPNProtocol(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    @Property(selector = "setServerAddress:")
    public native void setServerAddress(String v);
    @Property(selector = "username")
    public native String getUsername();
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    @Property(selector = "passwordReference")
    public native NSData getPasswordReference();
    @Property(selector = "setPasswordReference:")
    public native void setPasswordReference(NSData v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "identityReference")
    public native NSData getIdentityReference();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIdentityReference:")
    public native void setIdentityReference(NSData v);
    @Property(selector = "identityData")
    public native NSData getIdentityData();
    @Property(selector = "setIdentityData:")
    public native void setIdentityData(NSData v);
    @Property(selector = "identityDataPassword")
    public native String getIdentityDataPassword();
    @Property(selector = "setIdentityDataPassword:")
    public native void setIdentityDataPassword(String v);
    @Property(selector = "disconnectOnSleep")
    public native boolean disconnectsOnSleep();
    @Property(selector = "setDisconnectOnSleep:")
    public native void setDisconnectsOnSleep(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "proxySettings")
    public native NEProxySettings getProxySettings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProxySettings:")
    public native void setProxySettings(NEProxySettings v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "includeAllNetworks")
    public native boolean isIncludeAllNetworks();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setIncludeAllNetworks:")
    public native void setIncludeAllNetworks(boolean v);
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "excludeLocalNetworks")
    public native boolean isExcludeLocalNetworks();
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "setExcludeLocalNetworks:")
    public native void setExcludeLocalNetworks(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "excludeCellularServices")
    public native boolean isExcludeCellularServices();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setExcludeCellularServices:")
    public native void setExcludeCellularServices(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "excludeAPNs")
    public native boolean isExcludeAPNs();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setExcludeAPNs:")
    public native void setExcludeAPNs(boolean v);
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "enforceRoutes")
    public native boolean isEnforceRoutes();
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "setEnforceRoutes:")
    public native void setEnforceRoutes(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
