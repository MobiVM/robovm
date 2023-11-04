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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEPushStreamNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEPushStreamNodePtr extends Ptr<PHASEPushStreamNode, PHASEPushStreamNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEPushStreamNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEPushStreamNode() {}
    protected PHASEPushStreamNode(Handle h, long handle) { super(h, handle); }
    protected PHASEPushStreamNode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gainMetaParameter")
    public native PHASENumberMetaParameter getGainMetaParameter();
    @Property(selector = "rateMetaParameter")
    public native PHASENumberMetaParameter getRateMetaParameter();
    @Property(selector = "mixer")
    public native PHASEMixer getMixer();
    @Property(selector = "format")
    public native AVAudioFormat getFormat();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "scheduleBuffer:")
    public native void scheduleBuffer(AVAudioPCMBuffer buffer);
    @Method(selector = "scheduleBuffer:completionCallbackType:completionHandler:")
    public native void scheduleBuffer(AVAudioPCMBuffer buffer, PHASEPushStreamCompletionCallbackCondition completionCallbackType, @Block VoidBlock1<PHASEPushStreamCompletionCallbackCondition> completionHandler);
    @Method(selector = "scheduleBuffer:atTime:options:")
    public native void scheduleBuffer(AVAudioPCMBuffer buffer, AVAudioTime when, PHASEPushStreamBufferOptions options);
    @Method(selector = "scheduleBuffer:atTime:options:completionCallbackType:completionHandler:")
    public native void scheduleBuffer(AVAudioPCMBuffer buffer, AVAudioTime when, PHASEPushStreamBufferOptions options, PHASEPushStreamCompletionCallbackCondition completionCallbackType, @Block VoidBlock1<PHASEPushStreamCompletionCallbackCondition> completionHandler);
    /*</methods>*/
}
