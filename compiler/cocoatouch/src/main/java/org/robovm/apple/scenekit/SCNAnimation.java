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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNAnimation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimationProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNAnimationPtr extends Ptr<SCNAnimation, SCNAnimationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNAnimation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNAnimation() {}
    protected SCNAnimation(Handle h, long handle) { super(h, handle); }
    protected SCNAnimation(SkipInit skipInit) { super(skipInit); }
    public SCNAnimation(NSURL animationUrl) { super((Handle) null, create(animationUrl)); retain(getHandle()); }
    public SCNAnimation(CAAnimation caAnimation) { super((Handle) null, create(caAnimation)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public SCNAnimation(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(double v);
    @Property(selector = "keyPath")
    public native String getKeyPath();
    @Property(selector = "setKeyPath:")
    public native void setKeyPath(String v);
    @Property(selector = "timingFunction")
    public native SCNTimingFunction getTimingFunction();
    @Property(selector = "setTimingFunction:")
    public native void setTimingFunction(SCNTimingFunction v);
    @Property(selector = "blendInDuration")
    public native double getBlendInDuration();
    @Property(selector = "setBlendInDuration:")
    public native void setBlendInDuration(double v);
    @Property(selector = "blendOutDuration")
    public native double getBlendOutDuration();
    @Property(selector = "setBlendOutDuration:")
    public native void setBlendOutDuration(double v);
    @Property(selector = "isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();
    @Property(selector = "setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean v);
    @Property(selector = "isAppliedOnCompletion")
    public native boolean isAppliedOnCompletion();
    @Property(selector = "setAppliedOnCompletion:")
    public native void setAppliedOnCompletion(boolean v);
    @Property(selector = "repeatCount")
    public native @MachineSizedFloat double getRepeatCount();
    @Property(selector = "setRepeatCount:")
    public native void setRepeatCount(@MachineSizedFloat double v);
    @Property(selector = "autoreverses")
    public native boolean autoreverses();
    @Property(selector = "setAutoreverses:")
    public native void setAutoreverses(boolean v);
    @Property(selector = "startDelay")
    public native double getStartDelay();
    @Property(selector = "setStartDelay:")
    public native void setStartDelay(double v);
    @Property(selector = "timeOffset")
    public native double getTimeOffset();
    @Property(selector = "setTimeOffset:")
    public native void setTimeOffset(double v);
    @Property(selector = "fillsForward")
    public native boolean fillsForward();
    @Property(selector = "setFillsForward:")
    public native void setFillsForward(boolean v);
    @Property(selector = "fillsBackward")
    public native boolean fillsBackward();
    @Property(selector = "setFillsBackward:")
    public native void setFillsBackward(boolean v);
    @Property(selector = "usesSceneTimeBase")
    public native boolean usesSceneTimeBase();
    @Property(selector = "setUsesSceneTimeBase:")
    public native void setUsesSceneTimeBase(boolean v);
    @Property(selector = "animationDidStart")
    public native @Block VoidBlock2<SCNAnimation, SCNAnimatable> getAnimationDidStart();
    @Property(selector = "setAnimationDidStart:")
    public native void setAnimationDidStart(@Block VoidBlock2<SCNAnimation, SCNAnimatable> v);
    @Property(selector = "animationDidStop")
    public native @Block VoidBlock3<SCNAnimation, SCNAnimatable, Boolean> getAnimationDidStop();
    @Property(selector = "setAnimationDidStop:")
    public native void setAnimationDidStop(@Block VoidBlock3<SCNAnimation, SCNAnimatable, Boolean> v);
    @Property(selector = "animationEvents")
    public native NSArray<SCNAnimationEvent> getAnimationEvents();
    @Property(selector = "setAnimationEvents:")
    public native void setAnimationEvents(NSArray<SCNAnimationEvent> v);
    @Property(selector = "isAdditive")
    public native boolean isAdditive();
    @Property(selector = "setAdditive:")
    public native void setAdditive(boolean v);
    @Property(selector = "isCumulative")
    public native boolean isCumulative();
    @Property(selector = "setCumulative:")
    public native void setCumulative(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "animationWithContentsOfURL:")
    protected static native @Pointer long create(NSURL animationUrl);
    @Method(selector = "animationNamed:")
    public static native SCNAnimation animationNamed(String animationName);
    @Method(selector = "animationWithCAAnimation:")
    protected static native @Pointer long create(CAAnimation caAnimation);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
