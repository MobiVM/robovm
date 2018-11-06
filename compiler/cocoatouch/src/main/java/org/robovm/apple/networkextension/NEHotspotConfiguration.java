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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEHotspotConfigurationPtr extends Ptr<NEHotspotConfiguration, NEHotspotConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotConfiguration() {}
    protected NEHotspotConfiguration(Handle h, long handle) { super(h, handle); }
    protected NEHotspotConfiguration(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:")
    public NEHotspotConfiguration(String SSID) { super((SkipInit) null); initObject(init(SSID)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:passphrase:isWEP:")
    public NEHotspotConfiguration(String SSID, String passphrase, boolean isWEP) { super((SkipInit) null); initObject(init(SSID, passphrase, isWEP)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:eapSettings:")
    public NEHotspotConfiguration(String SSID, NEHotspotEAPSettings eapSettings) { super((SkipInit) null); initObject(init(SSID, eapSettings)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithHS20Settings:eapSettings:")
    public NEHotspotConfiguration(NEHotspotHS20Settings hs20Settings, NEHotspotEAPSettings eapSettings) { super((SkipInit) null); initObject(init(hs20Settings, eapSettings)); }
    @Method(selector = "initWithCoder:")
    public NEHotspotConfiguration(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "SSID")
    public native String getSSID();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "joinOnce")
    public native boolean isJoinOnce();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setJoinOnce:")
    public native void setJoinOnce(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "lifeTimeInDays")
    public native NSNumber getLifeTimeInDays();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLifeTimeInDays:")
    public native void setLifeTimeInDays(NSNumber v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:")
    protected native @Pointer long init(String SSID);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:passphrase:isWEP:")
    protected native @Pointer long init(String SSID, String passphrase, boolean isWEP);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSSID:eapSettings:")
    protected native @Pointer long init(String SSID, NEHotspotEAPSettings eapSettings);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithHS20Settings:eapSettings:")
    protected native @Pointer long init(NEHotspotHS20Settings hs20Settings, NEHotspotEAPSettings eapSettings);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
