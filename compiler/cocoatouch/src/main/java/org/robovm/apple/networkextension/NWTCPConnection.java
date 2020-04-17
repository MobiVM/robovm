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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NWTCPConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NWTCPConnectionPtr extends Ptr<NWTCPConnection, NWTCPConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWTCPConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NWTCPConnection() {}
    protected NWTCPConnection(Handle h, long handle) { super(h, handle); }
    protected NWTCPConnection(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithUpgradeForConnection:")
    public NWTCPConnection(NWTCPConnection connection) { super((SkipInit) null); initObject(init(connection)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "state")
    public native NWTCPConnectionState getState();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isViable")
    public native boolean isViable();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "hasBetterPath")
    public native boolean hasBetterPath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "endpoint")
    public native NWEndpoint getEndpoint();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "connectedPath")
    public native NWPath getConnectedPath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localAddress")
    public native NWEndpoint getLocalAddress();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "remoteAddress")
    public native NWEndpoint getRemoteAddress();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "txtRecord")
    public native NSData getTxtRecord();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "error")
    public native NSError getError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithUpgradeForConnection:")
    protected native @Pointer long init(NWTCPConnection connection);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cancel")
    public native void cancel();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "readLength:completionHandler:")
    public native void read(@MachineSizedUInt long length, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "readMinimumLength:maximumLength:completionHandler:")
    public native void read(@MachineSizedUInt long minimum, @MachineSizedUInt long maximum, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "write:completionHandler:")
    public native void write(NSData data, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "writeClose")
    public native void writeClose();
    /*</methods>*/
}
