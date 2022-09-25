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
package org.robovm.apple.pushtotalk;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/PTChannelManagerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "channelManager:didJoinChannelWithUUID:reason:")
    void didJoinChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, PTChannelJoinReason reason);
    @Method(selector = "channelManager:didLeaveChannelWithUUID:reason:")
    void didLeaveChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, PTChannelLeaveReason reason);
    @Method(selector = "channelManager:channelUUID:didBeginTransmittingFromSource:")
    void didBeginTransmittingFromSource(PTChannelManager channelManager, NSUUID channelUUID, PTChannelTransmitRequestSource source);
    @Method(selector = "channelManager:channelUUID:didEndTransmittingFromSource:")
    void didEndTransmittingFromSource(PTChannelManager channelManager, NSUUID channelUUID, PTChannelTransmitRequestSource source);
    @Method(selector = "channelManager:receivedEphemeralPushToken:")
    void receivedEphemeralPushToken(PTChannelManager channelManager, NSData pushToken);
    @Method(selector = "incomingPushResultForChannelManager:channelUUID:pushPayload:")
    PTPushResult incomingPushResultForChannelManager(PTChannelManager channelManager, NSUUID channelUUID, NSDictionary<NSString, ?> pushPayload);
    @Method(selector = "channelManager:didActivateAudioSession:")
    void didActivateAudioSession(PTChannelManager channelManager, AVAudioSession audioSession);
    @Method(selector = "channelManager:didDeactivateAudioSession:")
    void didDeactivateAudioSession(PTChannelManager channelManager, AVAudioSession audioSession);
    @Method(selector = "channelManager:failedToJoinChannelWithUUID:error:")
    void failedToJoinChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error);
    @Method(selector = "channelManager:failedToLeaveChannelWithUUID:error:")
    void failedToLeaveChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error);
    @Method(selector = "channelManager:failedToBeginTransmittingInChannelWithUUID:error:")
    void failedToBeginTransmittingInChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error);
    @Method(selector = "channelManager:failedToStopTransmittingInChannelWithUUID:error:")
    void failedToStopTransmittingInChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
