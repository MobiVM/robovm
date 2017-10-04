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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIViewPropertyAnimator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIViewImplicitlyAnimating/*</implements>*/ {

    /*<ptr>*/public static class UIViewPropertyAnimatorPtr extends Ptr<UIViewPropertyAnimator, UIViewPropertyAnimatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIViewPropertyAnimator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIViewPropertyAnimator() {}
    protected UIViewPropertyAnimator(Handle h, long handle) { super(h, handle); }
    protected UIViewPropertyAnimator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDuration:timingParameters:")
    public UIViewPropertyAnimator(double duration, UITimingCurveProvider parameters) { super((SkipInit) null); initObject(init(duration, parameters)); }
    @Method(selector = "initWithDuration:curve:animations:")
    public UIViewPropertyAnimator(double duration, UIViewAnimationCurve curve, @Block Runnable animations) { super((SkipInit) null); initObject(init(duration, curve, animations)); }
    @Method(selector = "initWithDuration:controlPoint1:controlPoint2:animations:")
    public UIViewPropertyAnimator(double duration, @ByVal CGPoint point1, @ByVal CGPoint point2, @Block Runnable animations) { super((SkipInit) null); initObject(init(duration, point1, point2, animations)); }
    @Method(selector = "initWithDuration:dampingRatio:animations:")
    public UIViewPropertyAnimator(double duration, @MachineSizedFloat double ratio, @Block Runnable animations) { super((SkipInit) null); initObject(init(duration, ratio, animations)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timingParameters")
    public native UITimingCurveProvider getTimingParameters();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "delay")
    public native double getDelay();
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Property(selector = "isManualHitTestingEnabled")
    public native boolean isManualHitTestingEnabled();
    @Property(selector = "setManualHitTestingEnabled:")
    public native void setManualHitTestingEnabled(boolean v);
    @Property(selector = "isInterruptible")
    public native boolean isInterruptible();
    @Property(selector = "setInterruptible:")
    public native void setInterruptible(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "scrubsLinearly")
    public native boolean isScrubsLinearly();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setScrubsLinearly:")
    public native void setScrubsLinearly(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "pausesOnCompletion")
    public native boolean pausesOnCompletion();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPausesOnCompletion:")
    public native void setPausesOnCompletion(boolean v);
    @Property(selector = "state")
    public native UIViewAnimatingState getState();
    @Property(selector = "isRunning")
    public native boolean isRunning();
    @Property(selector = "isReversed")
    public native boolean isReversed();
    @Property(selector = "setReversed:")
    public native void setReversed(boolean v);
    @Property(selector = "fractionComplete")
    public native @MachineSizedFloat double getFractionComplete();
    @Property(selector = "setFractionComplete:")
    public native void setFractionComplete(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDuration:timingParameters:")
    protected native @Pointer long init(double duration, UITimingCurveProvider parameters);
    @Method(selector = "initWithDuration:curve:animations:")
    protected native @Pointer long init(double duration, UIViewAnimationCurve curve, @Block Runnable animations);
    @Method(selector = "initWithDuration:controlPoint1:controlPoint2:animations:")
    protected native @Pointer long init(double duration, @ByVal CGPoint point1, @ByVal CGPoint point2, @Block Runnable animations);
    @Method(selector = "initWithDuration:dampingRatio:animations:")
    protected native @Pointer long init(double duration, @MachineSizedFloat double ratio, @Block Runnable animations);
    @Method(selector = "addAnimations:delayFactor:")
    public native void addAnimations(@Block Runnable animation, @MachineSizedFloat double delayFactor);
    @Method(selector = "addAnimations:")
    public native void addAnimations(@Block Runnable animation);
    @Method(selector = "addCompletion:")
    public native void addCompletion(@Block VoidBlock1<UIViewAnimatingPosition> completion);
    @Method(selector = "continueAnimationWithTimingParameters:durationFactor:")
    public native void continueAnimation(UITimingCurveProvider parameters, @MachineSizedFloat double durationFactor);
    @Method(selector = "runningPropertyAnimatorWithDuration:delay:options:animations:completion:")
    public static native UIViewPropertyAnimator getRunningPropertyAnimator(double duration, double delay, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBlock1<UIViewAnimatingPosition> completion);
    @Method(selector = "startAnimation")
    public native void startAnimation();
    @Method(selector = "startAnimationAfterDelay:")
    public native void startAnimation(double delay);
    @Method(selector = "pauseAnimation")
    public native void pauseAnimation();
    @Method(selector = "stopAnimation:")
    public native void stopAnimation(boolean withoutFinishing);
    @Method(selector = "finishAnimationAtPosition:")
    public native void finishAnimation(UIViewAnimatingPosition finalPosition);
    /*</methods>*/
}
