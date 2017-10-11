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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterSocketFlow/*</name>*/ 
    extends /*<extends>*/NEFilterFlow/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEFilterSocketFlowPtr extends Ptr<NEFilterSocketFlow, NEFilterSocketFlowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterSocketFlow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEFilterSocketFlow() {}
    protected NEFilterSocketFlow(Handle h, long handle) { super(h, handle); }
    protected NEFilterSocketFlow(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "remoteEndpoint")
    public native NWEndpoint getRemoteEndpoint();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localEndpoint")
    public native NWEndpoint getLocalEndpoint();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "socketFamily")
    public native int getSocketFamily();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSocketFamily:")
    public native void setSocketFamily(int v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "socketType")
    public native int getSocketType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSocketType:")
    public native void setSocketType(int v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "socketProtocol")
    public native int getSocketProtocol();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSocketProtocol:")
    public native void setSocketProtocol(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
