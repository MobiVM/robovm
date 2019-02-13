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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSXPCConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSXPCProxyCreating/*</implements>*/ {

    /*<ptr>*/public static class NSXPCConnectionPtr extends Ptr<NSXPCConnection, NSXPCConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSXPCConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSXPCConnection() {}
    protected NSXPCConnection(Handle h, long handle) { super(h, handle); }
    protected NSXPCConnection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithListenerEndpoint:")
    public NSXPCConnection(NSXPCListenerEndpoint endpoint) { super((SkipInit) null); initObject(init(endpoint)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serviceName")
    public native String getServiceName();
    @Property(selector = "endpoint")
    public native NSXPCListenerEndpoint getEndpoint();
    @Property(selector = "exportedInterface")
    public native NSXPCInterface getExportedInterface();
    @Property(selector = "setExportedInterface:")
    public native void setExportedInterface(NSXPCInterface v);
    @Property(selector = "exportedObject")
    public native NSObject getExportedObject();
    @Property(selector = "setExportedObject:")
    public native void setExportedObject(NSObject v);
    @Property(selector = "remoteObjectInterface")
    public native NSXPCInterface getRemoteObjectInterface();
    @Property(selector = "setRemoteObjectInterface:")
    public native void setRemoteObjectInterface(NSXPCInterface v);
    @Property(selector = "remoteObjectProxy")
    public native NSObject remoteObjectProxy();
    @Property(selector = "interruptionHandler")
    public native @Block Runnable getInterruptionHandler();
    @Property(selector = "setInterruptionHandler:")
    public native void setInterruptionHandler(@Block Runnable v);
    @Property(selector = "invalidationHandler")
    public native @Block Runnable getInvalidationHandler();
    @Property(selector = "setInvalidationHandler:")
    public native void setInvalidationHandler(@Block Runnable v);
    @Property(selector = "auditSessionIdentifier")
    public native int getAuditSessionIdentifier();
    @Property(selector = "processIdentifier")
    public native int getProcessIdentifier();
    @Property(selector = "effectiveUserIdentifier")
    public native int getEffectiveUserIdentifier();
    @Property(selector = "effectiveGroupIdentifier")
    public native int getEffectiveGroupIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithListenerEndpoint:")
    protected native @Pointer long init(NSXPCListenerEndpoint endpoint);
    @Method(selector = "remoteObjectProxyWithErrorHandler:")
    public native NSObject remoteObjectProxy(@Block VoidBlock1<NSError> handler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "synchronousRemoteObjectProxyWithErrorHandler:")
    public native NSObject synchronousRemoteObjectProxy(@Block VoidBlock1<NSError> handler);
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "suspend")
    public native void suspend();
    @Method(selector = "invalidate")
    public native void invalidate();
    /*</methods>*/
}
