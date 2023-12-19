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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRNetworkCommissioningClusterNetworkInfoStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRNetworkCommissioningClusterNetworkInfoStructPtr extends Ptr<MTRNetworkCommissioningClusterNetworkInfoStruct, MTRNetworkCommissioningClusterNetworkInfoStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRNetworkCommissioningClusterNetworkInfoStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRNetworkCommissioningClusterNetworkInfoStruct() {}
    protected MTRNetworkCommissioningClusterNetworkInfoStruct(Handle h, long handle) { super(h, handle); }
    protected MTRNetworkCommissioningClusterNetworkInfoStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "networkID")
    public native NSData getNetworkID();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setNetworkID:")
    public native void setNetworkID(NSData v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "connected")
    public native NSNumber getConnected();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setConnected:")
    public native void setConnected(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
