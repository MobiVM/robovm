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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRXPCServerProtocol_MTRDeviceAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTRXPCServerProtocol_MTRDevice/*</implements>*/ {

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
    @NotImplemented("deviceController:nodeID:getStateWithReply:")
    public void getState(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<MTRDeviceState> reply) {}
    @NotImplemented("deviceController:nodeID:getDeviceCachePrimedWithReply:")
    public void getDeviceCachePrimed(NSUUID controller, NSNumber nodeID, @Block VoidBooleanBlock reply) {}
    @NotImplemented("deviceController:nodeID:getEstimatedStartTimeWithReply:")
    public void getEstimatedStartTime(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<NSDate> reply) {}
    @NotImplemented("deviceController:nodeID:getEstimatedSubscriptionLatencyWithReply:")
    public void getEstimatedSubscriptionLatency(NSUUID controller, NSNumber nodeID, @Block VoidBlock1<NSNumber> reply) {}
    @NotImplemented("deviceController:nodeID:readAttributeWithEndpointID:clusterID:attributeID:params:withReply:")
    public void readAttribute(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRReadParams params, @Block VoidBlock1<NSDictionary<NSString, ?>> reply) {}
    @NotImplemented("deviceController:nodeID:writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    public void writeAttribute(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, NSObject value, NSNumber expectedValueInterval, NSNumber timeout) {}
    @NotImplemented("deviceController:nodeID:readAttributePaths:withReply:")
    public void readAttributePaths(NSUUID controller, NSNumber nodeID, NSArray<MTRAttributeRequestPath> attributePaths, @Block VoidBlock1<NSArray<?>> reply) {}
    @NotImplemented("deviceController:nodeID:invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:serverSideProcessingTimeout:completion:")
    public void invokeCommand(NSUUID controller, NSNumber nodeID, NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSObject commandFields, NSArray<?> expectedValues, NSNumber expectedValueInterval, NSNumber timeout, NSNumber serverSideProcessingTimeout, @Block VoidBlock2<NSArray<?>, NSError> completion) {}
    @NotImplemented("deviceController:nodeID:openCommissioningWindowWithSetupPasscode:discriminator:duration:completion:")
    public void openCommissioningWindow(NSUUID controller, NSNumber nodeID, NSNumber setupPasscode, NSNumber discriminator, NSNumber duration, @Block VoidBlock2<MTRSetupPayload, NSError> completion) {}
    @NotImplemented("downloadLogOfType:nodeID:timeout:completion:")
    public void downloadLog(MTRDiagnosticLogType type, NSNumber nodeID, double timeout, @Block VoidBlock2<NSURL, NSError> completion) {}
    @NotImplemented("deviceController:nodeID:downloadLogOfType:timeout:completion:")
    public void downloadLog(NSUUID controller, NSNumber nodeID, MTRDiagnosticLogType type, double timeout, @Block VoidBlock2<NSURL, NSError> completion) {}
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("deviceController:nodeID:invokeCommands:completion:")
    public void invokeCommands(NSUUID controller, NSNumber nodeID, NSArray<?> commands, @Block VoidBlock2<NSArray<?>, NSError> completion) {}
    /*</methods>*/
}
