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

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRCommandPath/*</name>*/ 
    extends /*<extends>*/MTRClusterPath/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRCommandPathPtr extends Ptr<MTRCommandPath, MTRCommandPathPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRCommandPath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRCommandPath() {}
    protected MTRCommandPath(Handle h, long handle) { super(h, handle); }
    protected MTRCommandPath(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    public MTRCommandPath(NSNumber endpointID, NSNumber clusterID, NSNumber commandID) { super((Handle) null, create(endpointID, clusterID, commandID)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "command")
    public native NSNumber getCommand();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "commandPathWithEndpointID:clusterID:commandID:")
    protected static native @Pointer long create(NSNumber endpointID, NSNumber clusterID, NSNumber commandID);
    @Method(selector = "clusterPathWithEndpointID:clusterID:")
    public static native MTRClusterPath createClusterPath(NSNumber endpointID, NSNumber clusterID);
    /*</methods>*/
}
