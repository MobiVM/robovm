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
package org.robovm.apple.mediasetup;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaSetup") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSServiceAccount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSServiceAccountPtr extends Ptr<MSServiceAccount, MSServiceAccountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSServiceAccount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSServiceAccount() {}
    protected MSServiceAccount(Handle h, long handle) { super(h, handle); }
    protected MSServiceAccount(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceName:accountName:")
    public MSServiceAccount(String serviceName, String accountName) { super((SkipInit) null); initObject(init(serviceName, accountName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serviceName")
    public native String getServiceName();
    @Property(selector = "accountName")
    public native String getAccountName();
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "setClientID:")
    public native void setClientID(String v);
    @Property(selector = "clientSecret")
    public native String getClientSecret();
    @Property(selector = "setClientSecret:")
    public native void setClientSecret(String v);
    @Property(selector = "configurationURL")
    public native NSURL getConfigurationURL();
    @Property(selector = "setConfigurationURL:")
    public native void setConfigurationURL(NSURL v);
    @Property(selector = "authorizationTokenURL")
    public native NSURL getAuthorizationTokenURL();
    @Property(selector = "setAuthorizationTokenURL:")
    public native void setAuthorizationTokenURL(NSURL v);
    @Property(selector = "authorizationScope")
    public native String getAuthorizationScope();
    @Property(selector = "setAuthorizationScope:")
    public native void setAuthorizationScope(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceName:accountName:")
    protected native @Pointer long init(String serviceName, String accountName);
    /*</methods>*/
}
