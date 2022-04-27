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

/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEVPNConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObjectProtocol observeStatusDidChange(NEVPNConnection object, final VoidBlock1<NEVPNConnection> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(StatusDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NEVPNConnection)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class NEVPNConnectionPtr extends Ptr<NEVPNConnection, NEVPNConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEVPNConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEVPNConnection() {}
    protected NEVPNConnection(Handle h, long handle) { super(h, handle); }
    protected NEVPNConnection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native NEVPNStatus getStatus();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "connectedDate")
    public native NSDate getConnectedDate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "manager")
    public native NEVPNManager getManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NEVPNStatusDidChangeNotification", optional=true)
    public static native NSString StatusDidChangeNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="NEVPNConnectionStartOptionUsername", optional=true)
    public static native String NEVPNConnectionStartOptionUsername();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="NEVPNConnectionStartOptionPassword", optional=true)
    public static native String NEVPNConnectionStartOptionPassword();
    
    public boolean startVPNTunnel() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = startVPNTunnel(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startVPNTunnelAndReturnError:")
    private native boolean startVPNTunnel(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public boolean startVPNTunnel(NSDictionary<NSString, ?> options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = startVPNTunnel(options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "startVPNTunnelWithOptions:andReturnError:")
    private native boolean startVPNTunnel(NSDictionary<NSString, ?> options, NSError.NSErrorPtr error);
    @Method(selector = "stopVPNTunnel")
    public native void stopVPNTunnel();
    /*</methods>*/
}
