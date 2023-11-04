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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRDeviceControllerServerProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "getAnyDeviceControllerWithCompletion:")
    void getAnyDeviceController(@Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "readAttributeWithController:nodeId:endpointId:clusterId:attributeId:params:completion:")
    void readAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSDictionary<NSString, ?> params, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "writeAttributeWithController:nodeId:endpointId:clusterId:attributeId:value:timedWriteTimeout:completion:")
    void writeAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSObject value, NSNumber timeoutMs, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "invokeCommandWithController:nodeId:endpointId:clusterId:commandId:fields:timedInvokeTimeout:completion:")
    void invokeCommand(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber commandId, NSObject fields, NSNumber timeoutMs, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "subscribeAttributeWithController:nodeId:endpointId:clusterId:attributeId:minInterval:maxInterval:params:establishedHandler:")
    void subscribeAttribute(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, NSNumber minInterval, NSNumber maxInterval, NSDictionary<NSString, ?> params, @Block Runnable establishedHandler);
    @Method(selector = "stopReportsWithController:nodeId:completion:")
    void stopReports(NSObject controller, long nodeId, @Block Runnable completion);
    @Method(selector = "subscribeWithController:nodeId:minInterval:maxInterval:params:shouldCache:completion:")
    void subscribe(NSObject controller, long nodeId, NSNumber minInterval, NSNumber maxInterval, NSDictionary<NSString, ?> params, boolean shouldCache, @Block VoidBlock1<NSError> completion);
    @Method(selector = "readAttributeCacheWithController:nodeId:endpointId:clusterId:attributeId:completion:")
    void readAttributeCache(NSObject controller, long nodeId, NSNumber endpointId, NSNumber clusterId, NSNumber attributeId, @Block VoidBlock2<NSObject, NSError> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
