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
/*<annotations>*/@Library("PushToTalk") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PTChannelManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PTChannelManagerPtr extends Ptr<PTChannelManager, PTChannelManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PTChannelManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PTChannelManager() {}
    protected PTChannelManager(Handle h, long handle) { super(h, handle); }
    protected PTChannelManager(SkipInit skipInit) { super(skipInit); }
    public PTChannelManager(PTChannelManagerDelegate delegate, PTChannelRestorationDelegate restorationDelegate, @Block VoidBlock2<PTChannelManager, NSError> completionHandler) { super((Handle) null, create(delegate, restorationDelegate, completionHandler)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activeChannelUUID")
    public native NSUUID getActiveChannelUUID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestJoinChannelWithUUID:descriptor:")
    public native void requestJoinChannel(NSUUID channelUUID, PTChannelDescriptor descriptor);
    @Method(selector = "requestBeginTransmittingWithChannelUUID:")
    public native void requestBeginTransmitting(NSUUID channelUUID);
    @Method(selector = "stopTransmittingWithChannelUUID:")
    public native void stopTransmitting(NSUUID channelUUID);
    @Method(selector = "leaveChannelWithUUID:")
    public native void leaveChannel(NSUUID channelUUID);
    @Method(selector = "setChannelDescriptor:forChannelUUID:completionHandler:")
    public native void setChannelDescriptor(PTChannelDescriptor channelDescriptor, NSUUID channelUUID, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "setActiveRemoteParticipant:forChannelUUID:completionHandler:")
    public native void setActiveRemoteParticipant(PTParticipant participant, NSUUID channelUUID, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "setServiceStatus:forChannelUUID:completionHandler:")
    public native void setServiceStatus(PTServiceStatus status, NSUUID channelUUID, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "setTransmissionMode:forChannelUUID:completionHandler:")
    public native void setTransmissionMode(PTTransmissionMode transmissionMode, NSUUID channelUUID, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "channelManagerWithDelegate:restorationDelegate:completionHandler:")
    protected static native @Pointer long create(PTChannelManagerDelegate delegate, PTChannelRestorationDelegate restorationDelegate, @Block VoidBlock2<PTChannelManager, NSError> completionHandler);
    /*</methods>*/
}
