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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotNetwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEHotspotNetworkPtr extends Ptr<NEHotspotNetwork, NEHotspotNetworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotNetwork() {}
    protected NEHotspotNetwork(Handle h, long handle) { super(h, handle); }
    protected NEHotspotNetwork(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "SSID")
    public native String getSSID();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "BSSID")
    public native String getBSSID();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "signalStrength")
    public native double getSignalStrength();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isSecure")
    public native boolean isSecure();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "didAutoJoin")
    public native boolean isAutoJoined();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "didJustJoin")
    public native boolean isJustJoined();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isChosenHelper")
    public native boolean isChosenHelper();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setConfidence:")
    public native void setConfidence(NEHotspotHelperConfidence confidence);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setPassword:")
    public native void setPassword(String password);
    /*</methods>*/
}
