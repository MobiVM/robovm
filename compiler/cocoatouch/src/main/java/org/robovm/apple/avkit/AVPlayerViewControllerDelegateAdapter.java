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
package org.robovm.apple.avkit;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVPlayerViewControllerDelegate/*</implements>*/ {

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
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("playerViewController:willBeginFullScreenPresentationWithAnimationCoordinator:")
    public void willBeginFullScreenPresentation(AVPlayerViewController playerViewController, UIViewControllerTransitionCoordinator coordinator) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("playerViewController:willEndFullScreenPresentationWithAnimationCoordinator:")
    public void willEndFullScreenPresentation(AVPlayerViewController playerViewController, UIViewControllerTransitionCoordinator coordinator) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("playerViewController:restoreUserInterfaceForFullScreenExitWithCompletionHandler:")
    public void restoreUserInterfaceForFullScreenExit(AVPlayerViewController playerViewController, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("playerViewControllerWillStartPictureInPicture:")
    public void willStartPictureInPicture(AVPlayerViewController playerViewController) {}
    @NotImplemented("playerViewControllerDidStartPictureInPicture:")
    public void didStartPictureInPicture(AVPlayerViewController playerViewController) {}
    @NotImplemented("playerViewController:failedToStartPictureInPictureWithError:")
    public void failedToStartPictureInPicture(AVPlayerViewController playerViewController, NSError error) {}
    @NotImplemented("playerViewControllerWillStopPictureInPicture:")
    public void willStopPictureInPicture(AVPlayerViewController playerViewController) {}
    @NotImplemented("playerViewControllerDidStopPictureInPicture:")
    public void didStopPictureInPicture(AVPlayerViewController playerViewController) {}
    @NotImplemented("playerViewControllerShouldAutomaticallyDismissAtPictureInPictureStart:")
    public boolean shouldAutomaticallyDismissAtPictureInPictureStart(AVPlayerViewController playerViewController) { return false; }
    @NotImplemented("playerViewController:restoreUserInterfaceForPictureInPictureStopWithCompletionHandler:")
    public void restoreUserInterfaceForPictureInPictureStop(AVPlayerViewController playerViewController, @Block VoidBooleanBlock completionHandler) {}
    /*</methods>*/
}
