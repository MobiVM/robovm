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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceControllerServerProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTRDeviceControllerServerProtocol/*</implements>*/ {

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
    @NotImplemented("getAnyDeviceControllerWithCompletion:")
    public void getAnyDeviceController(@Block VoidBlock2<NSObject, NSError> completion) {}
    @NotImplemented("readAttributeWithController:nodeId:endpointId:clusterId:attributeId:params:completion:")
    public void readAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSDictionary<NSString, ?> params, @Block VoidBlock2<NSObject, NSError> completion) {}
    @NotImplemented("writeAttributeWithController:nodeId:endpointId:clusterId:attributeId:value:timedWriteTimeout:completion:")
    public void writeAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSObject value, NSNumber timeoutMs, @Block VoidBlock2<NSObject, NSError> completion) {}
    @NotImplemented("invokeCommandWithController:nodeId:endpointId:clusterId:commandId:fields:timedInvokeTimeout:completion:")
    public void invokeCommand(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber commandId, NSObject fields, NSNumber timeoutMs, @Block VoidBlock2<NSObject, NSError> completion) {}
    @NotImplemented("subscribeAttributeWithController:nodeId:endpointId:clusterId:attributeId:minInterval:maxInterval:params:establishedHandler:")
    public void subscribeAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSNumber minInterval, NSNumber maxInterval, NSDictionary<NSString, ?> params, @Block Runnable establishedHandler) {}
    @NotImplemented("stopReportsWithController:nodeId:completion:")
    public void stopReports(NSObject controller, long nodeId, @Block Runnable completion) {}
    @NotImplemented("subscribeWithController:nodeId:minInterval:maxInterval:params:shouldCache:completion:")
    public void subscribe(NSObject controller, long nodeId, NSNumber minInterval, NSNumber maxInterval, NSDictionary<NSString, ?> params, boolean shouldCache, @Block VoidBlock1<NSError> completion) {}
    @NotImplemented("readAttributeCacheWithController:nodeId:endpointId:clusterId:attributeId:completion:")
    public void readAttributeCache(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, @Block VoidBlock2<NSObject, NSError> completion) {}
    /*</methods>*/
}
