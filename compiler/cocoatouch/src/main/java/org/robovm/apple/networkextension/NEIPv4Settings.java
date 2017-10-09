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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEIPv4Settings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEIPv4SettingsPtr extends Ptr<NEIPv4Settings, NEIPv4SettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEIPv4Settings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEIPv4Settings() {}
    protected NEIPv4Settings(Handle h, long handle) { super(h, handle); }
    protected NEIPv4Settings(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddresses:subnetMasks:")
    public NEIPv4Settings(NSArray<NSString> addresses, NSArray<NSString> subnetMasks) { super((SkipInit) null); initObject(init(addresses, subnetMasks)); }
    @Method(selector = "initWithCoder:")
    public NEIPv4Settings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
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
    @Property(selector = "subnetMasks")
    public native NSArray<NSString> getSubnetMasks();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "includedRoutes")
    public native NSArray<NEIPv4Route> getIncludedRoutes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIncludedRoutes:")
    public native void setIncludedRoutes(NSArray<NEIPv4Route> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "excludedRoutes")
    public native NSArray<NEIPv4Route> getExcludedRoutes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setExcludedRoutes:")
    public native void setExcludedRoutes(NSArray<NEIPv4Route> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddresses:subnetMasks:")
    protected native @Pointer long init(NSArray<NSString> addresses, NSArray<NSString> subnetMasks);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
