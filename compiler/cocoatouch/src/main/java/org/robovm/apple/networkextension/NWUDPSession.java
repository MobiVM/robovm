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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NWUDPSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NWUDPSessionPtr extends Ptr<NWUDPSession, NWUDPSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWUDPSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NWUDPSession() {}
    protected NWUDPSession(Handle h, long handle) { super(h, handle); }
    protected NWUDPSession(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithUpgradeForSession:")
    public NWUDPSession(NWUDPSession session) { super((SkipInit) null); initObject(init(session)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "state")
    public native NWUDPSessionState getState();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "endpoint")
    public native NWEndpoint getEndpoint();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "resolvedEndpoint")
    public native NWEndpoint getResolvedEndpoint();
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
    @Property(selector = "currentPath")
    public native NWPath getCurrentPath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "maximumDatagramLength")
    public native @MachineSizedUInt long getMaximumDatagramLength();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithUpgradeForSession:")
    protected native @Pointer long init(NWUDPSession session);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "tryNextResolvedEndpoint")
    public native void tryNextResolvedEndpoint();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setReadHandler:maxDatagrams:")
    public native void setReadHandler(@Block VoidBlock2<NSArray<NSData>, NSError> handler, @MachineSizedUInt long maxDatagrams);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "writeMultipleDatagrams:completionHandler:")
    public native void writeMultipleDatagrams(NSArray<NSData> datagramArray, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "writeDatagram:completionHandler:")
    public native void writeDatagram(NSData datagram, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
