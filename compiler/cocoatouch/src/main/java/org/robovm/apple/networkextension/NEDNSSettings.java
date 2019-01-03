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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEDNSSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEDNSSettingsPtr extends Ptr<NEDNSSettings, NEDNSSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEDNSSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEDNSSettings() {}
    protected NEDNSSettings(Handle h, long handle) { super(h, handle); }
    protected NEDNSSettings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithServers:")
    public NEDNSSettings(NSArray<NSString> servers) { super((SkipInit) null); initObject(init(servers)); }
    @Method(selector = "initWithCoder:")
    public NEDNSSettings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "servers")
    public native NSArray<NSString> getServers();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "searchDomains")
    public native NSArray<NSString> getSearchDomains();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSearchDomains:")
    public native void setSearchDomains(NSArray<NSString> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "domainName")
    public native String getDomainName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDomainName:")
    public native void setDomainName(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "matchDomains")
    public native NSArray<NSString> getMatchDomains();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMatchDomains:")
    public native void setMatchDomains(NSArray<NSString> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "matchDomainsNoSearch")
    public native boolean isMatchDomainsNoSearch();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMatchDomainsNoSearch:")
    public native void setMatchDomainsNoSearch(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithServers:")
    protected native @Pointer long init(NSArray<NSString> servers);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
