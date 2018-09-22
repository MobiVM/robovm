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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNMaterialProperty/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNAnimatable, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNMaterialPropertyPtr extends Ptr<SCNMaterialProperty, SCNMaterialPropertyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNMaterialProperty.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNMaterialProperty() {}
    protected SCNMaterialProperty(Handle h, long handle) { super(h, handle); }
    protected SCNMaterialProperty(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNMaterialProperty(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contents")
    public native NSObject getContents();
    @Property(selector = "setContents:")
    public native void setContents(NSObject v);
    @Property(selector = "intensity")
    public native @MachineSizedFloat double getIntensity();
    @Property(selector = "setIntensity:")
    public native void setIntensity(@MachineSizedFloat double v);
    @Property(selector = "minificationFilter")
    public native SCNFilterMode getMinificationFilter();
    @Property(selector = "setMinificationFilter:")
    public native void setMinificationFilter(SCNFilterMode v);
    @Property(selector = "magnificationFilter")
    public native SCNFilterMode getMagnificationFilter();
    @Property(selector = "setMagnificationFilter:")
    public native void setMagnificationFilter(SCNFilterMode v);
    @Property(selector = "mipFilter")
    public native SCNFilterMode getMipFilter();
    @Property(selector = "setMipFilter:")
    public native void setMipFilter(SCNFilterMode v);
    @Property(selector = "contentsTransform")
    public native @ByVal SCNMatrix4 getContentsTransform();
    @Property(selector = "setContentsTransform:")
    public native void setContentsTransform(@ByVal SCNMatrix4 v);
    @Property(selector = "wrapS")
    public native SCNWrapMode getWrapS();
    @Property(selector = "setWrapS:")
    public native void setWrapS(SCNWrapMode v);
    @Property(selector = "wrapT")
    public native SCNWrapMode getWrapT();
    @Property(selector = "setWrapT:")
    public native void setWrapT(SCNWrapMode v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Deprecated
     */
    @Deprecated
    @Property(selector = "borderColor")
    public native NSObject getBorderColor();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Deprecated
     */
    @Deprecated
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(NSObject v);
    @Property(selector = "mappingChannel")
    public native @MachineSizedSInt long getMappingChannel();
    @Property(selector = "setMappingChannel:")
    public native void setMappingChannel(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "textureComponents")
    public native SCNColorMask getTextureComponents();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTextureComponents:")
    public native void setTextureComponents(SCNColorMask v);
    @Property(selector = "maxAnisotropy")
    public native @MachineSizedFloat double getMaxAnisotropy();
    @Property(selector = "setMaxAnisotropy:")
    public native void setMaxAnisotropy(@MachineSizedFloat double v);
    @Property(selector = "animationKeys")
    public native NSArray<NSString> getAnimationKeys();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "materialPropertyWithContents:")
    public static native SCNMaterialProperty create(NSObject contents);
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
