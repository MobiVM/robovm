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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRAttributeRequestPath/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRAttributeRequestPathPtr extends Ptr<MTRAttributeRequestPath, MTRAttributeRequestPathPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRAttributeRequestPath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRAttributeRequestPath() {}
    protected MTRAttributeRequestPath(Handle h, long handle) { super(h, handle); }
    protected MTRAttributeRequestPath(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public MTRAttributeRequestPath(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID) { super((Handle) null, create(endpointID, clusterID, attributeID)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "endpoint")
    public native NSNumber getEndpoint();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "cluster")
    public native NSNumber getCluster();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "attribute")
    public native NSNumber getAttribute();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestPathWithEndpointID:clusterID:attributeID:")
    protected static native @Pointer long create(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID);
    /*</methods>*/
}
