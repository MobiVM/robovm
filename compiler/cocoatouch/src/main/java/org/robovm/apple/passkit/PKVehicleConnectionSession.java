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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKVehicleConnectionSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKVehicleConnectionSessionPtr extends Ptr<PKVehicleConnectionSession, PKVehicleConnectionSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKVehicleConnectionSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKVehicleConnectionSession() {}
    protected PKVehicleConnectionSession(Handle h, long handle) { super(h, handle); }
    protected PKVehicleConnectionSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKVehicleConnectionDelegate getDelegate();
    @Property(selector = "connectionStatus")
    public native PKVehicleConnectionSessionConnectionState getConnectionStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean sendData(NSData message) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendData(message, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "sendData:error:")
    private native boolean sendData(NSData message, NSError.NSErrorPtr error);
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "sessionForPass:delegate:completion:")
    public static native void sessionForPass(PKSecureElementPass pass, PKVehicleConnectionDelegate delegate, @Block VoidBlock2<PKVehicleConnectionSession, NSError> completion);
    /*</methods>*/
}
