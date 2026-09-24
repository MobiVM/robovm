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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRXPCServerProtocol_MTRDeviceControllerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTRXPCServerProtocol_MTRDeviceController/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("deviceController:deleteNodeID:")
    public void deleteNodeID(NSUUID controller, NSNumber nodeID) {}
    @NotImplemented("deviceController:registerNodeID:")
    public void registerNodeID(NSUUID controller, NSNumber nodeID) {}
    @NotImplemented("deviceController:unregisterNodeID:")
    public void unregisterNodeID(NSUUID controller, NSNumber nodeID) {}
    /**
     * @since Available in iOS 18.3 and later.
     */
    @NotImplemented("deviceController:updateControllerConfiguration:")
    public void updateControllerConfiguration(NSUUID controller, NSDictionary<?, ?> controllerState) {}
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("deviceController:getNodesWithStoredDataWithReply:")
    public void getNodes(NSUUID controller, @Block VoidBlock1<NSArray<NSNumber>> reply) {}
    /*</methods>*/
}
