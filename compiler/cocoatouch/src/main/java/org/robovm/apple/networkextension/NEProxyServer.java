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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEProxyServer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEProxyServerPtr extends Ptr<NEProxyServer, NEProxyServerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEProxyServer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEProxyServer() {}
    protected NEProxyServer(Handle h, long handle) { super(h, handle); }
    protected NEProxyServer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddress:port:")
    public NEProxyServer(String address, @MachineSizedSInt long port) { super((SkipInit) null); initObject(init(address, port)); }
    @Method(selector = "initWithCoder:")
    public NEProxyServer(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "address")
    public native String getAddress();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "port")
    public native @MachineSizedSInt long getPort();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "authenticationRequired")
    public native boolean isAuthenticationRequired();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAuthenticationRequired:")
    public native void setAuthenticationRequired(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "username")
    public native String getUsername();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "password")
    public native String getPassword();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setPassword:")
    public native void setPassword(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithAddress:port:")
    protected native @Pointer long init(String address, @MachineSizedSInt long port);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
