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
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRXPCServerProtocol_MTRDevice/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "deviceController:nodeID:getStateWithReply:")
    void getState(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<MTRDeviceState> reply);
    @Method(selector = "deviceController:nodeID:getDeviceCachePrimedWithReply:")
    void getDeviceCachePrimed(NSUUID controller, NSNumber nodeID, @Block VoidBooleanBlock reply);
    @Method(selector = "deviceController:nodeID:getEstimatedStartTimeWithReply:")
    void getEstimatedStartTime(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<NSDate> reply);
    @Method(selector = "deviceController:nodeID:getEstimatedSubscriptionLatencyWithReply:")
    void getEstimatedSubscriptionLatency(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<NSNumber> reply);
    @Method(selector = "deviceController:nodeID:readAttributeWithEndpointID:clusterID:attributeID:params:withReply:")
    void readAttribute(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRReadParams params, @Block VoidBlock1<NSDictionary<NSString, ?>> reply);
    @Method(selector = "deviceController:nodeID:writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    void writeAttribute(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, NSObject value, NSNumber expectedValueInterval, NSNumber timeout);
    @Method(selector = "deviceController:nodeID:readAttributePaths:withReply:")
    void readAttributePaths(NSUUID controller, NSNumber nodeID, NSArray<MTRAttributeRequestPath> attributePaths, @Block VoidBlock1<NSArray<?>> reply);
    @Method(selector = "deviceController:nodeID:invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:serverSideProcessingTimeout:completion:")
    void invokeCommand(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSObject commandFields, NSArray<?> expectedValues, NSNumber expectedValueInterval, NSNumber timeout, NSNumber serverSideProcessingTimeout, @Block VoidBlock2<NSArray<?>, NSError> completion);
    @Method(selector = "deviceController:nodeID:openCommissioningWindowWithSetupPasscode:discriminator:duration:completion:")
    void openCommissioningWindow(NSUUID controller, NSNumber nodeID, NSNumber setupPasscode, NSNumber discriminator, NSNumber duration, @Block VoidBlock2<MTRSetupPayload, NSError> completion);
    @Method(selector = "downloadLogOfType:nodeID:timeout:completion:")
    void downloadLog(MTRDiagnosticLogType type, NSNumber nodeID, double timeout, @Block VoidBlock2<NSURL, NSError> completion);
    @Method(selector = "deviceController:nodeID:downloadLogOfType:timeout:completion:")
    void downloadLog(NSUUID controller, NSNumber nodeID, MTRDiagnosticLogType type, double timeout, @Block VoidBlock2<NSURL, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "deviceController:nodeID:invokeCommands:completion:")
    void invokeCommands(NSUUID controller, NSNumber nodeID, NSArray<?> commands, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
