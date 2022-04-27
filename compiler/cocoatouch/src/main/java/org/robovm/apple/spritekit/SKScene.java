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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKScene/*</name>*/ 
    extends /*<extends>*/SKEffectNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKScenePtr extends Ptr<SKScene, SKScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKScene() {}
    protected SKScene(Handle h, long handle) { super(h, handle); }
    protected SKScene(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSize:")
    public SKScene(@ByVal CGSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithCoder:")
    public SKScene(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "scaleMode")
    public native SKSceneScaleMode getScaleMode();
    @Property(selector = "setScaleMode:")
    public native void setScaleMode(SKSceneScaleMode v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "camera")
    public native SKCameraNode getCamera();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCamera:", strongRef = true)
    public native void setCamera(SKCameraNode v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "listener")
    public native SKNode getListener();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setListener:", strongRef = true)
    public native void setListener(SKNode v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audioEngine")
    public native AVAudioEngine getAudioEngine();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "delegate")
    public native SKSceneDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SKSceneDelegate v);
    @Property(selector = "anchorPoint")
    public native @ByVal CGPoint getAnchorPoint();
    @Property(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ByVal CGPoint v);
    @Property(selector = "physicsWorld")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.Marshaler.class) SKPhysicsWorld getPhysicsWorld();
    @Property(selector = "view")
    public native SKView getView();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(@ByVal CGSize size);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "sceneDidLoad")
    public native void sceneDidLoad();
    @Method(selector = "convertPointFromView:")
    public native @ByVal CGPoint convertPointFromView(@ByVal CGPoint point);
    @Method(selector = "convertPointToView:")
    public native @ByVal CGPoint convertPointToView(@ByVal CGPoint point);
    @Method(selector = "update:")
    public native void update(double currentTime);
    @Method(selector = "didEvaluateActions")
    public native void didEvaluateActions();
    @Method(selector = "didSimulatePhysics")
    public native void didSimulatePhysics();
    @Method(selector = "didApplyConstraints")
    public native void didApplyConstraints();
    @Method(selector = "didFinishUpdate")
    public native void didFinishUpdate();
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(SKView view);
    @Method(selector = "willMoveFromView:")
    public native void willMoveFromView(SKView view);
    @Method(selector = "didChangeSize:")
    public native void didChangeSize(@ByVal CGSize oldSize);
    /*</methods>*/
}
