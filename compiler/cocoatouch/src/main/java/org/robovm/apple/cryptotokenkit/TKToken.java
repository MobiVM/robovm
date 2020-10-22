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
package org.robovm.apple.cryptotokenkit;

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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKToken/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKTokenPtr extends Ptr<TKToken, TKTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TKToken() {}
    protected TKToken(Handle h, long handle) { super(h, handle); }
    protected TKToken(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTokenDriver:instanceID:")
    public TKToken(TKTokenDriver tokenDriver, String instanceID) { super((SkipInit) null); initObject(init(tokenDriver, instanceID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tokenDriver")
    public native TKTokenDriver getTokenDriver();
    @Property(selector = "delegate")
    public native TKTokenDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(TKTokenDelegate v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "configuration")
    public native TKTokenConfiguration getConfiguration();
    @Property(selector = "keychainContents")
    public native TKTokenKeychainContents getKeychainContents();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTokenDriver:instanceID:")
    protected native @Pointer long init(TKTokenDriver tokenDriver, String instanceID);
    /*</methods>*/
}
