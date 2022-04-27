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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 11.0. No longer supported, use RPBroadcastSampleHandler instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPBroadcastMP4ClipHandler/*</name>*/ 
    extends /*<extends>*/RPBroadcastHandler/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RPBroadcastMP4ClipHandlerPtr extends Ptr<RPBroadcastMP4ClipHandler, RPBroadcastMP4ClipHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPBroadcastMP4ClipHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPBroadcastMP4ClipHandler() {}
    protected RPBroadcastMP4ClipHandler(Handle h, long handle) { super(h, handle); }
    protected RPBroadcastMP4ClipHandler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "processMP4ClipWithURL:setupInfo:finished:")
    public native void processMP4Clip(NSURL mp4ClipURL, NSDictionary<NSString, ?> setupInfo, boolean finished);
    @Method(selector = "finishedProcessingMP4ClipWithUpdatedBroadcastConfiguration:error:")
    public native void finishedProcessingMP4Clip(RPBroadcastConfiguration broadcastConfiguration, NSError error);
    /*</methods>*/
}
