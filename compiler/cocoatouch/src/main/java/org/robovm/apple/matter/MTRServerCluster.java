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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRServerCluster/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRServerClusterPtr extends Ptr<MTRServerCluster, MTRServerClusterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRServerCluster.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRServerCluster() {}
    protected MTRServerCluster(Handle h, long handle) { super(h, handle); }
    protected MTRServerCluster(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithClusterID:revision:")
    public MTRServerCluster(NSNumber clusterID, NSNumber revision) { super((SkipInit) null); initObject(init(clusterID, revision)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clusterID")
    public native NSNumber getClusterID();
    @Property(selector = "clusterRevision")
    public native NSNumber getClusterRevision();
    @Property(selector = "accessGrants")
    public native NSArray<MTRAccessGrant> getAccessGrants();
    @Property(selector = "attributes")
    public native NSArray<MTRServerAttribute> getAttributes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithClusterID:revision:")
    protected native @Pointer long init(NSNumber clusterID, NSNumber revision);
    @Method(selector = "addAccessGrant:")
    public native void addAccessGrant(MTRAccessGrant accessGrant);
    @Method(selector = "removeAccessGrant:")
    public native void removeAccessGrant(MTRAccessGrant accessGrant);
    @Method(selector = "addAttribute:")
    public native boolean addAttribute(MTRServerAttribute attribute);
    @Method(selector = "newDescriptorCluster")
    public static native MTRServerCluster newDescriptorCluster();
    /*</methods>*/
}
