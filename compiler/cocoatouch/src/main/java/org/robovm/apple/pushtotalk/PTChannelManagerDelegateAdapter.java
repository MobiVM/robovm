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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PTChannelManagerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements PTChannelManagerDelegate/*</implements>*/ {

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
    @NotImplemented("channelManager:didJoinChannelWithUUID:reason:")
    public void didJoinChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, PTChannelJoinReason reason) {}
    @NotImplemented("channelManager:didLeaveChannelWithUUID:reason:")
    public void didLeaveChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, PTChannelLeaveReason reason) {}
    @NotImplemented("channelManager:channelUUID:didBeginTransmittingFromSource:")
    public void didBeginTransmittingFromSource(PTChannelManager channelManager, NSUUID channelUUID, PTChannelTransmitRequestSource source) {}
    @NotImplemented("channelManager:channelUUID:didEndTransmittingFromSource:")
    public void didEndTransmittingFromSource(PTChannelManager channelManager, NSUUID channelUUID, PTChannelTransmitRequestSource source) {}
    @NotImplemented("channelManager:receivedEphemeralPushToken:")
    public void receivedEphemeralPushToken(PTChannelManager channelManager, NSData pushToken) {}
    @NotImplemented("incomingPushResultForChannelManager:channelUUID:pushPayload:")
    public PTPushResult incomingPushResultForChannelManager(PTChannelManager channelManager, NSUUID channelUUID, NSDictionary<NSString, ?> pushPayload) { return null; }
    @NotImplemented("channelManager:didActivateAudioSession:")
    public void didActivateAudioSession(PTChannelManager channelManager, AVAudioSession audioSession) {}
    @NotImplemented("channelManager:didDeactivateAudioSession:")
    public void didDeactivateAudioSession(PTChannelManager channelManager, AVAudioSession audioSession) {}
    @NotImplemented("channelManager:failedToJoinChannelWithUUID:error:")
    public void failedToJoinChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error) {}
    @NotImplemented("channelManager:failedToLeaveChannelWithUUID:error:")
    public void failedToLeaveChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error) {}
    @NotImplemented("channelManager:failedToBeginTransmittingInChannelWithUUID:error:")
    public void failedToBeginTransmittingInChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error) {}
    @NotImplemented("channelManager:failedToStopTransmittingInChannelWithUUID:error:")
    public void failedToStopTransmittingInChannelWithUUID(PTChannelManager channelManager, NSUUID channelUUID, NSError error) {}
    /*</methods>*/
}
