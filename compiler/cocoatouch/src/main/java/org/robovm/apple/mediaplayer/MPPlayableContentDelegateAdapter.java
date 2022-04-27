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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPPlayableContentDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPPlayableContentDelegate/*</implements>*/ {

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
    /**
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @NotImplemented("playableContentManager:initiatePlaybackOfContentItemAtIndexPath:completionHandler:")
    public void initiatePlayback(MPPlayableContentManager contentManager, NSIndexPath indexPath, @Block VoidBlock1<NSError> completionHandler) {}
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 9.3. Use Intents framework for initiating playback queues.
     */
    @Deprecated
    @NotImplemented("playableContentManager:initializePlaybackQueueWithCompletionHandler:")
    public void initiatePlaybackQueue(MPPlayableContentManager contentManager, @Block VoidBlock1<NSError> completionHandler) {}
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 12.0. Use Intents framework for initiating playback queues.
     */
    @Deprecated
    @NotImplemented("playableContentManager:initializePlaybackQueueWithContentItems:completionHandler:")
    public void initializePlaybackQueueWithContent(MPPlayableContentManager contentManager, NSArray<?> contentItems, @Block VoidBlock1<NSError> completionHandler) {}
    /**
     * @since Available in iOS 8.4 and later.
     * @deprecated Deprecated in iOS 14.0. Use CarPlay framework
     */
    @Deprecated
    @NotImplemented("playableContentManager:didUpdateContext:")
    public void didUpdateContext(MPPlayableContentManager contentManager, MPPlayableContentManagerContext context) {}
    /*</methods>*/
}
