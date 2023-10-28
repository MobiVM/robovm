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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPercentDrivenInteractiveTransition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIViewControllerInteractiveTransitioning/*</implements>*/ {

    /*<ptr>*/public static class UIPercentDrivenInteractiveTransitionPtr extends Ptr<UIPercentDrivenInteractiveTransition, UIPercentDrivenInteractiveTransitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPercentDrivenInteractiveTransition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPercentDrivenInteractiveTransition() {}
    protected UIPercentDrivenInteractiveTransition(Handle h, long handle) { super(h, handle); }
    protected UIPercentDrivenInteractiveTransition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native @MachineSizedFloat double getDuration();
    @Property(selector = "percentComplete")
    public native @MachineSizedFloat double getPercentComplete();
    @Property(selector = "completionSpeed")
    public native @MachineSizedFloat double getCompletionSpeed();
    @Property(selector = "setCompletionSpeed:")
    public native void setCompletionSpeed(@MachineSizedFloat double v);
    @Property(selector = "completionCurve")
    public native UIViewAnimationCurve getCompletionCurve();
    @Property(selector = "setCompletionCurve:")
    public native void setCompletionCurve(UIViewAnimationCurve v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "timingCurve")
    public native UITimingCurveProvider getTimingCurve();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTimingCurve:")
    public native void setTimingCurve(UITimingCurveProvider v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "wantsInteractiveStart")
    public native boolean wantsInteractiveStart();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWantsInteractiveStart:")
    public native void setWantsInteractiveStart(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "pauseInteractiveTransition")
    public native void pauseInteractiveTransition();
    @Method(selector = "updateInteractiveTransition:")
    public native void updateInteractiveTransition(@MachineSizedFloat double percentComplete);
    @Method(selector = "cancelInteractiveTransition")
    public native void cancelInteractiveTransition();
    @Method(selector = "finishInteractiveTransition")
    public native void finishInteractiveTransition();
    @Method(selector = "startInteractiveTransition:")
    public native void startInteractiveTransition(UIViewControllerContextTransitioning transitionContext);
    /*</methods>*/
}
