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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIViewControllerTransitionCoordinatorContext/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "isAnimated")
    boolean isAnimated();
    @Property(selector = "presentationStyle")
    UIModalPresentationStyle getPresentationStyle();
    @Property(selector = "initiallyInteractive")
    boolean isInitiallyInteractive();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isInterruptible")
    boolean isInterruptible();
    @Property(selector = "isInteractive")
    boolean isInteractive();
    @Property(selector = "isCancelled")
    boolean isCancelled();
    @Property(selector = "transitionDuration")
    double getTransitionDuration();
    @Property(selector = "percentComplete")
    @MachineSizedFloat double getPercentComplete();
    @Property(selector = "completionVelocity")
    @MachineSizedFloat double getCompletionVelocity();
    @Property(selector = "completionCurve")
    UIViewAnimationCurve getCompletionCurve();
    @Property(selector = "containerView")
    UIView getContainerView();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "targetTransform")
    @ByVal CGAffineTransform getTargetTransform();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "viewControllerForKey:")
    UIViewController getViewController(String key);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "viewForKey:")
    UIView getView(String key);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
