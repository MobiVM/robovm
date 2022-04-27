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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INPlayMediaIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handlePlayMedia:completion:")
    void handlePlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INPlayMediaIntentResponse> completion);
    @Method(selector = "confirmPlayMedia:completion:")
    void confirmPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INPlayMediaIntentResponse> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveMediaItemsForPlayMedia:withCompletion:")
    void resolveMediaItemsForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<NSArray<INPlayMediaMediaItemResolutionResult>> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePlayShuffledForPlayMedia:withCompletion:")
    void resolvePlayShuffledForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePlaybackRepeatModeForPlayMedia:withCompletion:")
    void resolvePlaybackRepeatModeForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INPlaybackRepeatModeResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveResumePlaybackForPlayMedia:withCompletion:")
    void resolveResumePlaybackForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePlaybackQueueLocationForPlayMedia:withCompletion:")
    void resolvePlaybackQueueLocationForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INPlaybackQueueLocationResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePlaybackSpeedForPlayMedia:withCompletion:")
    void resolvePlaybackSpeedForPlayMedia(INPlayMediaIntent intent, @Block VoidBlock1<INPlayMediaPlaybackSpeedResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
