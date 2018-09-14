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
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentBrowserTransitionController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIViewControllerAnimatedTransitioning/*</implements>*/ {

    /*<ptr>*/public static class UIDocumentBrowserTransitionControllerPtr extends Ptr<UIDocumentBrowserTransitionController, UIDocumentBrowserTransitionControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentBrowserTransitionController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIDocumentBrowserTransitionController() {}
    protected UIDocumentBrowserTransitionController(Handle h, long handle) { super(h, handle); }
    protected UIDocumentBrowserTransitionController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "loadingProgress")
    public native NSProgress getLoadingProgress();
    @Property(selector = "setLoadingProgress:")
    public native void setLoadingProgress(NSProgress v);
    @Property(selector = "targetView")
    public native UIView getTargetView();
    @Property(selector = "setTargetView:", strongRef = true)
    public native void setTargetView(UIView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "transitionDuration:")
    public native double getTransitionDuration(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animateTransition:")
    public native void animateTransition(UIViewControllerContextTransitioning transitionContext);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "interruptibleAnimatorForTransition:")
    public native UIViewImplicitlyAnimating getInterruptibleAnimator(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animationEnded:")
    public native void animationEnded(boolean transitionCompleted);
    /*</methods>*/
}
