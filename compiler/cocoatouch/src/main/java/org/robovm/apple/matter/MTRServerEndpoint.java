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
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRServerEndpoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRServerEndpointPtr extends Ptr<MTRServerEndpoint, MTRServerEndpointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRServerEndpoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRServerEndpoint() {}
    protected MTRServerEndpoint(Handle h, long handle) { super(h, handle); }
    protected MTRServerEndpoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEndpointID:deviceTypes:")
    public MTRServerEndpoint(NSNumber endpointID, NSArray<MTRDeviceTypeRevision> deviceTypes) { super((SkipInit) null); initObject(init(endpointID, deviceTypes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "endpointID")
    public native NSNumber getEndpointID();
    @Property(selector = "deviceTypes")
    public native NSArray<MTRDeviceTypeRevision> getDeviceTypes();
    @Property(selector = "accessGrants")
    public native NSArray<MTRAccessGrant> getAccessGrants();
    @Property(selector = "serverClusters")
    public native NSArray<MTRServerCluster> getServerClusters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEndpointID:deviceTypes:")
    protected native @Pointer long init(NSNumber endpointID, NSArray<MTRDeviceTypeRevision> deviceTypes);
    @Method(selector = "addAccessGrant:")
    public native void addAccessGrant(MTRAccessGrant accessGrant);
    @Method(selector = "removeAccessGrant:")
    public native void removeAccessGrant(MTRAccessGrant accessGrant);
    @Method(selector = "addServerCluster:")
    public native boolean addServerCluster(MTRServerCluster serverCluster);
    /*</methods>*/
}
