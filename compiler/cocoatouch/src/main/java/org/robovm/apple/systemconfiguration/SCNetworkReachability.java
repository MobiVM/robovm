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
package org.robovm.apple.systemconfiguration;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("SystemConfiguration")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNetworkReachability/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNetworkReachabilityPtr extends Ptr<SCNetworkReachability, SCNetworkReachabilityPtr> {}/*</ptr>*/
    
    public interface ClientCallback {
        void invoke(SCNetworkReachability target, SCNetworkReachabilityFlags flags);
    }
    
    private static java.util.concurrent.atomic.AtomicLong refconId = new java.util.concurrent.atomic.AtomicLong();
    private long localRefconId;
    private static LongMap<ClientCallback> callbacks = new LongMap<>();
    private static final java.lang.reflect.Method cbInvoke;
    
    static {
        try {
            cbInvoke = SCNetworkReachability.class.getDeclaredMethod("cbInvoke", SCNetworkReachability.class, SCNetworkReachabilityFlags.class, long.class);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    /*<bind>*/static { Bro.bind(SCNetworkReachability.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SCNetworkReachability() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Callback
    private static void cbInvoke(SCNetworkReachability target, SCNetworkReachabilityFlags flags, @Pointer long refcon) {
        ClientCallback callback = null;
        synchronized (callbacks) {
            callback = callbacks.get(refcon);
        }
        callback.invoke(target, flags);
    }
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    public SCNetworkReachability(java.net.InetSocketAddress address) {
        long refconId = SCNetworkReachability.refconId.getAndIncrement();
        long reachability;
        
        java.net.InetAddress addr = address.getAddress();
        if (addr instanceof java.net.Inet4Address) {
            reachability = create(null, new sockaddr_in(address));
        } else if (addr instanceof java.net.Inet6Address) {
            reachability = create(null, new sockaddr_in6(address));
        } else {
            throw new IllegalArgumentException("address is not a valid IPv4 or IPv6 address!");
        }
        localRefconId = refconId;
        setHandle(reachability);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public SCNetworkReachability(java.net.InetSocketAddress localAddress, java.net.InetSocketAddress remoteAddress) {
        long refconId = SCNetworkReachability.refconId.getAndIncrement();
        Struct<?> l;
        Struct<?> r;
        if (localAddress.getAddress() instanceof java.net.Inet4Address) {
            l = new sockaddr_in(localAddress);
        } else if (localAddress.getAddress() instanceof java.net.Inet6Address) {
            l = new sockaddr_in6(localAddress);
        } else {
            throw new IllegalArgumentException("localAddress is not a valid IPv4 or IPv6 address!");
        }
        if (remoteAddress.getAddress() instanceof java.net.Inet4Address) {
            r = new sockaddr_in(remoteAddress);
        } else if (remoteAddress.getAddress() instanceof java.net.Inet6Address) {
            r = new sockaddr_in6(remoteAddress);
        } else {
            throw new IllegalArgumentException("remoteAddress is not a valid IPv4 or IPv6 address!");
        }
        long reachability = create(null, l, r);
        localRefconId = refconId;
        setHandle(reachability);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public SCNetworkReachability(String nodename) {
        long refconId = SCNetworkReachability.refconId.getAndIncrement();
        BytePtr ptr = BytePtr.toBytePtrZ(nodename);
        long reachability = create(null, ptr);
        localRefconId = refconId;
        setHandle(reachability);
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public SCNetworkReachabilityFlags getFlags() {
        IntPtr ptr = new IntPtr();
        getFlags(ptr);
        return new SCNetworkReachabilityFlags(ptr.get());
    }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public boolean setCallback(ClientCallback callback) {
        SCNetworkReachabilityContext context = new SCNetworkReachabilityContext();
        context.setInfo(localRefconId);
        synchronized (callbacks) {
            callbacks.put(localRefconId, callback);
        }
        return setCallback(new FunctionPtr(cbInvoke), context);
    }
    /*<methods>*/
    @Bridge(symbol="SCNetworkReachabilityCreateWithAddress", optional=true)
    private static native @Pointer long create(CFAllocator allocator, Struct<?> address);
    @Bridge(symbol="SCNetworkReachabilityCreateWithAddressPair", optional=true)
    private static native @Pointer long create(CFAllocator allocator, Struct<?> localAddress, Struct<?> remoteAddress);
    @Bridge(symbol="SCNetworkReachabilityCreateWithName", optional=true)
    private static native @Pointer long create(CFAllocator allocator, BytePtr nodename);
    @Bridge(symbol="SCNetworkReachabilityGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="SCNetworkReachabilityGetFlags", optional=true)
    protected native boolean getFlags(IntPtr flags);
    @Bridge(symbol="SCNetworkReachabilitySetCallback", optional=true)
    protected native boolean setCallback(FunctionPtr callout, SCNetworkReachabilityContext context);
    @Bridge(symbol="SCNetworkReachabilityScheduleWithRunLoop", optional=true)
    public native boolean schedule(CFRunLoop runLoop, CFString runLoopMode);
    @Bridge(symbol="SCNetworkReachabilityUnscheduleFromRunLoop", optional=true)
    public native boolean unschedule(CFRunLoop runLoop, CFString runLoopMode);
    @WeaklyLinked
    @Bridge(symbol="SCNetworkReachabilitySetDispatchQueue", optional=true)
    public native boolean setDispatchQueue(DispatchQueue queue);
    /*</methods>*/
}
