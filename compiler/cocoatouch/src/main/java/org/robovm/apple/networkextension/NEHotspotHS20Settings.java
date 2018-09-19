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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotHS20Settings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEHotspotHS20SettingsPtr extends Ptr<NEHotspotHS20Settings, NEHotspotHS20SettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotHS20Settings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotHS20Settings() {}
    protected NEHotspotHS20Settings(Handle h, long handle) { super(h, handle); }
    protected NEHotspotHS20Settings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDomainName:roamingEnabled:")
    public NEHotspotHS20Settings(String domainName, boolean roamingEnabled) { super((SkipInit) null); initObject(init(domainName, roamingEnabled)); }
    @Method(selector = "initWithCoder:")
    public NEHotspotHS20Settings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "domainName")
    public native String getDomainName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isRoamingEnabled")
    public native boolean isRoamingEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRoamingEnabled:")
    public native void setRoamingEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "roamingConsortiumOIs")
    public native NSArray<NSString> getRoamingConsortiumOIs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRoamingConsortiumOIs:")
    public native void setRoamingConsortiumOIs(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "naiRealmNames")
    public native NSArray<NSString> getNaiRealmNames();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setNaiRealmNames:")
    public native void setNaiRealmNames(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "MCCAndMNCs")
    public native NSArray<NSString> getMCCAndMNCs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMCCAndMNCs:")
    public native void setMCCAndMNCs(NSArray<NSString> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDomainName:roamingEnabled:")
    protected native @Pointer long init(String domainName, boolean roamingEnabled);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
