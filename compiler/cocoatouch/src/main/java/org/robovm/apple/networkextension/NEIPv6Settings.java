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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEIPv6Settings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEIPv6SettingsPtr extends Ptr<NEIPv6Settings, NEIPv6SettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEIPv6Settings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEIPv6Settings() {}
    protected NEIPv6Settings(Handle h, long handle) { super(h, handle); }
    protected NEIPv6Settings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddresses:networkPrefixLengths:")
    public NEIPv6Settings(NSArray<NSString> addresses, NSArray<NSNumber> networkPrefixLengths) { super((SkipInit) null); initObject(init(addresses, networkPrefixLengths)); }
    @Method(selector = "initWithCoder:")
    public NEIPv6Settings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "addresses")
    public native NSArray<NSString> getAddresses();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "networkPrefixLengths")
    public native NSArray<NSNumber> getNetworkPrefixLengths();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "includedRoutes")
    public native NSArray<NEIPv6Route> getIncludedRoutes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIncludedRoutes:")
    public native void setIncludedRoutes(NSArray<NEIPv6Route> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "excludedRoutes")
    public native NSArray<NEIPv6Route> getExcludedRoutes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setExcludedRoutes:")
    public native void setExcludedRoutes(NSArray<NEIPv6Route> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddresses:networkPrefixLengths:")
    protected native @Pointer long init(NSArray<NSString> addresses, NSArray<NSNumber> networkPrefixLengths);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
