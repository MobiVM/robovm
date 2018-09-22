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

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNMorpher/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimatable, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNMorpherPtr extends Ptr<SCNMorpher, SCNMorpherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNMorpher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNMorpher() {}
    protected SCNMorpher(Handle h, long handle) { super(h, handle); }
    protected SCNMorpher(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNMorpher(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targets")
    public native NSArray<SCNGeometry> getTargets();
    @Property(selector = "setTargets:")
    public native void setTargets(NSArray<SCNGeometry> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "weights")
    public native NSArray<NSNumber> getWeights();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWeights:")
    public native void setWeights(NSArray<NSNumber> v);
    @Property(selector = "calculationMode")
    public native SCNMorpherCalculationMode getCalculationMode();
    @Property(selector = "setCalculationMode:")
    public native void setCalculationMode(SCNMorpherCalculationMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "unifiesNormals")
    public native boolean isUnifiesNormals();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUnifiesNormals:")
    public native void setUnifiesNormals(boolean v);
    @Property(selector = "animationKeys")
    public native NSArray<NSString> getAnimationKeys();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setWeight:forTargetAtIndex:")
    public native void setWeightForTarget(@MachineSizedFloat double weight, @MachineSizedUInt long targetIndex);
    @Method(selector = "weightForTargetAtIndex:")
    public native @MachineSizedFloat double getWeightForTarget(@MachineSizedUInt long targetIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setWeight:forTargetNamed:")
    public native void setWeightForTarget(@MachineSizedFloat double weight, String targetName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "weightForTargetNamed:")
    public native @MachineSizedFloat double weightForTargetNamed(String targetName);
    @Method(selector = "addAnimation:forKey:")
    public native void addAnimation(SCNAnimation animation, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addAnimationPlayer:forKey:")
    public native void addAnimationPlayer(SCNAnimationPlayer player, String key);
    @Method(selector = "removeAllAnimations")
    public native void removeAllAnimations();
    @Method(selector = "removeAnimationForKey:")
    public native void removeAnimation(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKey(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "animationForKey:")
    public native CAAnimation getAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Method(selector = "pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Method(selector = "resumeAnimationForKey:")
    public native void resumeAnimation(String key);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setSpeed:] instead
     */
    @Deprecated
    @Method(selector = "setSpeed:forAnimationKey:")
    public native void setSpeed(@MachineSizedFloat double speed, String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer paused] instead
     */
    @Deprecated
    @Method(selector = "isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
