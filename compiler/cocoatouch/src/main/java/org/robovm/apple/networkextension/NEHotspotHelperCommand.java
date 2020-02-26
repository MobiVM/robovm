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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotHelperCommand/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEHotspotHelperCommandPtr extends Ptr<NEHotspotHelperCommand, NEHotspotHelperCommandPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotHelperCommand.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotHelperCommand() {}
    protected NEHotspotHelperCommand(Handle h, long handle) { super(h, handle); }
    protected NEHotspotHelperCommand(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "commandType")
    public native NEHotspotHelperCommandType getCommandType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "network")
    public native NEHotspotNetwork getNetwork();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "networkList")
    public native NSArray<NEHotspotNetwork> getNetworkList();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "createResponse:")
    public native NEHotspotHelperResponse createResponse(NEHotspotHelperResult result);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "createTCPConnection:")
    public native NWTCPConnection createTCPConnection(NWEndpoint endpoint);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "createUDPSession:")
    public native NWUDPSession createUDPSession(NWEndpoint endpoint);
    /*</methods>*/
}
