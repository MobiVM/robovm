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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNAnimatableAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimatable/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("animationKeys")
    public NSArray<NSString> getAnimationKeys() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addAnimation:forKey:")
    public void addAnimation(SCNAnimationProtocol animation, String key) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("addAnimationPlayer:forKey:")
    public void addAnimationPlayer(SCNAnimationPlayer player, String key) {}
    @NotImplemented("removeAllAnimations")
    public void removeAllAnimations() {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("removeAllAnimationsWithBlendOutDuration:")
    public void removeAllAnimations(@MachineSizedFloat double duration) {}
    @NotImplemented("removeAnimationForKey:")
    public void removeAnimation(String key) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("removeAnimationForKey:blendOutDuration:")
    public void removeAnimationForKey(String key, @MachineSizedFloat double duration) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("animationPlayerForKey:")
    public SCNAnimationPlayer animationPlayerForKey(String key) { return null; }
    /**
     * @deprecated Deprecated in iOS 11.0. Use -removeAnimationForKey:blendOutDuration:
     */
    @Deprecated
    @NotImplemented("removeAnimationForKey:fadeOutDuration:")
    public void removeAnimation(String key, @MachineSizedFloat double duration) {}
    /**
     * @deprecated Deprecated in iOS 11.0. Use -animationPlayerForKey:
     */
    @Deprecated
    @NotImplemented("animationForKey:")
    public CAAnimation getAnimation(String key) { return null; }
    /**
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @NotImplemented("pauseAnimationForKey:")
    public void pauseAnimation(String key) {}
    /**
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @NotImplemented("resumeAnimationForKey:")
    public void resumeAnimation(String key) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer setSpeed:] instead
     */
    @Deprecated
    @NotImplemented("setSpeed:forAnimationKey:")
    public void setSpeed(@MachineSizedFloat double speed, String key) {}
    /**
     * @deprecated Deprecated in iOS 11.0. Use -[SCNAnimationPlayer paused] instead
     */
    @Deprecated
    @NotImplemented("isAnimationForKeyPaused:")
    public boolean isAnimationPaused(String key) { return false; }
    /*</methods>*/
}
