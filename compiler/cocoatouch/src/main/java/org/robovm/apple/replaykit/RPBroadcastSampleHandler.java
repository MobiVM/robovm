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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPBroadcastSampleHandler/*</name>*/ 
    extends /*<extends>*/RPBroadcastHandler/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RPBroadcastSampleHandlerPtr extends Ptr<RPBroadcastSampleHandler, RPBroadcastSampleHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPBroadcastSampleHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPBroadcastSampleHandler() {}
    protected RPBroadcastSampleHandler(Handle h, long handle) { super(h, handle); }
    protected RPBroadcastSampleHandler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "broadcastStartedWithSetupInfo:")
    public native void broadcastStarted(NSDictionary<NSString, ?> setupInfo);
    @Method(selector = "broadcastPaused")
    public native void broadcastPaused();
    @Method(selector = "broadcastResumed")
    public native void broadcastResumed();
    @Method(selector = "broadcastFinished")
    public native void broadcastFinished();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Method(selector = "broadcastAnnotatedWithApplicationInfo:")
    public native void broadcastAnnotated(NSDictionary<?, ?> applicationInfo);
    @Method(selector = "processSampleBuffer:withType:")
    public native void processSampleBuffer(org.robovm.apple.coremedia.CMSampleBuffer sampleBuffer, RPSampleBufferType sampleBufferType);
    @Method(selector = "finishBroadcastWithError:")
    public native void finish(NSError error);
    /*</methods>*/
}
