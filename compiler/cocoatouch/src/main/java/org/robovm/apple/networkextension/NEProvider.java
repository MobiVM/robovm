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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEProviderPtr extends Ptr<NEProvider, NEProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEProvider() {}
    protected NEProvider(Handle h, long handle) { super(h, handle); }
    protected NEProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "defaultPath")
    public native NWPath getDefaultPath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "sleepWithCompletionHandler:")
    public native void sleep(@Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "wake")
    public native void wake();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "createTCPConnectionToEndpoint:enableTLS:TLSParameters:delegate:")
    public native NWTCPConnection createTCPConnection(NWEndpoint remoteEndpoint, boolean enableTLS, NWTLSParameters TLSParameters, NSObject delegate);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "createUDPSessionToEndpoint:fromEndpoint:")
    public native NWUDPSession createUDPSession(NWEndpoint remoteEndpoint, NWHostEndpoint localEndpoint);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "displayMessage:completionHandler:")
    public native void displayMessage(String message, @Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
