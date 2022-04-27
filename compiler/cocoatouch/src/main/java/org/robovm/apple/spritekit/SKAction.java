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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKActionPtr extends Ptr<SKAction, SKActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKAction() {}
    protected SKAction(Handle h, long handle) { super(h, handle); }
    protected SKAction(SkipInit skipInit) { super(skipInit); }
    public SKAction(double duration, @Block("(,@MachineSizedFloat)") VoidBlock2<SKNode, Double> block) { super((Handle) null, create(duration, block)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public SKAction(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public SKAction(String name, double duration) { super((Handle) null, create(name, duration)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public SKAction(String name, NSURL url) { super((Handle) null, create(name, url)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public SKAction(String name, NSURL url, double duration) { super((Handle) null, create(name, url, duration)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public SKAction(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(double v);
    @Property(selector = "timingMode")
    public native SKActionTimingMode getTimingMode();
    @Property(selector = "setTimingMode:")
    public native void setTimingMode(SKActionTimingMode v);
    @Property(selector = "timingFunction")
    public native @Block Block1<Float, Float> getTimingFunction();
    @Property(selector = "setTimingFunction:")
    public native void setTimingFunction(@Block Block1<Float, Float> v);
    @Property(selector = "speed")
    public native @MachineSizedFloat double getSpeed();
    @Property(selector = "setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reversedAction")
    public native SKAction reversedAction();
    @Method(selector = "moveBy:duration:")
    public static native SKAction moveBy(@ByVal CGVector delta, double duration);
    @Method(selector = "moveByX:y:duration:")
    public static native SKAction moveBy(@MachineSizedFloat double deltaX, @MachineSizedFloat double deltaY, double duration);
    @Method(selector = "moveTo:duration:")
    public static native SKAction moveTo(@ByVal CGPoint location, double duration);
    @Method(selector = "moveToX:duration:")
    public static native SKAction moveToX(@MachineSizedFloat double x, double duration);
    @Method(selector = "moveToY:duration:")
    public static native SKAction moveToY(@MachineSizedFloat double y, double duration);
    @Method(selector = "rotateByAngle:duration:")
    public static native SKAction rotateBy(@MachineSizedFloat double radians, double duration);
    @Method(selector = "rotateToAngle:duration:")
    public static native SKAction rotateTo(@MachineSizedFloat double radians, double duration);
    @Method(selector = "rotateToAngle:duration:shortestUnitArc:")
    public static native SKAction rotateTo(@MachineSizedFloat double radians, double duration, boolean shortestUnitArc);
    @Method(selector = "resizeByWidth:height:duration:")
    public static native SKAction resizeBy(@MachineSizedFloat double width, @MachineSizedFloat double height, double duration);
    @Method(selector = "resizeToWidth:height:duration:")
    public static native SKAction resizeTo(@MachineSizedFloat double width, @MachineSizedFloat double height, double duration);
    @Method(selector = "resizeToWidth:duration:")
    public static native SKAction resizeToWidth(@MachineSizedFloat double width, double duration);
    @Method(selector = "resizeToHeight:duration:")
    public static native SKAction resizeToHeight(@MachineSizedFloat double height, double duration);
    @Method(selector = "scaleBy:duration:")
    public static native SKAction scaleBy(@MachineSizedFloat double scale, double duration);
    @Method(selector = "scaleXBy:y:duration:")
    public static native SKAction scaleBy(@MachineSizedFloat double xScale, @MachineSizedFloat double yScale, double duration);
    @Method(selector = "scaleTo:duration:")
    public static native SKAction scaleTo(@MachineSizedFloat double scale, double duration);
    @Method(selector = "scaleXTo:y:duration:")
    public static native SKAction scaleTo(@MachineSizedFloat double xScale, @MachineSizedFloat double yScale, double duration);
    @Method(selector = "scaleXTo:duration:")
    public static native SKAction scaleXTo(@MachineSizedFloat double scale, double duration);
    @Method(selector = "scaleYTo:duration:")
    public static native SKAction scaleYTo(@MachineSizedFloat double scale, double duration);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "scaleToSize:duration:")
    public static native SKAction scaleToSize(@ByVal CGSize size, double duration);
    @Method(selector = "sequence:")
    public static native SKAction sequence(NSArray<SKAction> actions);
    @Method(selector = "group:")
    public static native SKAction group(NSArray<SKAction> actions);
    @Method(selector = "repeatAction:count:")
    public static native SKAction repeat(SKAction action, @MachineSizedUInt long count);
    @Method(selector = "repeatActionForever:")
    public static native SKAction repeatForever(SKAction action);
    @Method(selector = "fadeInWithDuration:")
    public static native SKAction fadeIn(double duration);
    @Method(selector = "fadeOutWithDuration:")
    public static native SKAction fadeOut(double duration);
    @Method(selector = "fadeAlphaBy:duration:")
    public static native SKAction fadeAlphaBy(@MachineSizedFloat double factor, double duration);
    @Method(selector = "fadeAlphaTo:duration:")
    public static native SKAction fadeAlphaTo(@MachineSizedFloat double alpha, double duration);
    @Method(selector = "hide")
    public static native SKAction hide();
    @Method(selector = "unhide")
    public static native SKAction unhide();
    @Method(selector = "setTexture:")
    public static native SKAction setTexture(SKTexture texture);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setNormalTexture:")
    public static native SKAction setNormalTexture(SKTexture texture);
    @Method(selector = "setTexture:resize:")
    public static native SKAction setTexture(SKTexture texture, boolean resize);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setNormalTexture:resize:")
    public static native SKAction setNormalTexture(SKTexture texture, boolean resize);
    @Method(selector = "animateWithTextures:timePerFrame:")
    public static native SKAction animateFrames(NSArray<SKTexture> textures, double sec);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "animateWithNormalTextures:timePerFrame:")
    public static native SKAction animateNormalFrames(NSArray<SKTexture> textures, double sec);
    @Method(selector = "animateWithTextures:timePerFrame:resize:restore:")
    public static native SKAction animateFrames(NSArray<SKTexture> textures, double sec, boolean resize, boolean restore);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "animateWithNormalTextures:timePerFrame:resize:restore:")
    public static native SKAction animateNormalFrames(NSArray<SKTexture> textures, double sec, boolean resize, boolean restore);
    @Method(selector = "playSoundFileNamed:waitForCompletion:")
    public static native SKAction playSound(String soundFile, boolean wait);
    @Method(selector = "colorizeWithColor:colorBlendFactor:duration:")
    public static native SKAction colorize(UIColor color, @MachineSizedFloat double colorBlendFactor, double duration);
    @Method(selector = "colorizeWithColorBlendFactor:duration:")
    public static native SKAction colorize(@MachineSizedFloat double colorBlendFactor, double sec);
    @Method(selector = "falloffTo:duration:")
    public static native SKAction falloffTo(float falloff, double duration);
    @Method(selector = "falloffBy:duration:")
    public static native SKAction falloffBy(float falloff, double duration);
    @Method(selector = "followPath:duration:")
    public static native SKAction followPath(CGPath path, double duration);
    @Method(selector = "followPath:asOffset:orientToPath:duration:")
    public static native SKAction followPath(CGPath path, boolean offset, boolean orient, double duration);
    @Method(selector = "followPath:speed:")
    public static native SKAction followPathWithSpeed(CGPath path, @MachineSizedFloat double speed);
    @Method(selector = "followPath:asOffset:orientToPath:speed:")
    public static native SKAction followPathWithSpeed(CGPath path, boolean offset, boolean orient, @MachineSizedFloat double speed);
    @Method(selector = "speedBy:duration:")
    public static native SKAction speedBy(@MachineSizedFloat double speed, double duration);
    @Method(selector = "speedTo:duration:")
    public static native SKAction speedTo(@MachineSizedFloat double speed, double duration);
    @Method(selector = "reachTo:rootNode:duration:")
    public static native SKAction reachTo(@ByVal CGPoint position, SKNode root, double duration);
    @Method(selector = "reachTo:rootNode:velocity:")
    public static native SKAction reachToWithVelocity(@ByVal CGPoint position, SKNode root, @MachineSizedFloat double velocity);
    @Method(selector = "reachToNode:rootNode:duration:")
    public static native SKAction reachToNode(SKNode node, SKNode root, double sec);
    @Method(selector = "reachToNode:rootNode:velocity:")
    public static native SKAction reachToNodeWithVelocity(SKNode node, SKNode root, @MachineSizedFloat double velocity);
    @Method(selector = "strengthTo:duration:")
    public static native SKAction strengthTo(float strength, double duration);
    @Method(selector = "strengthBy:duration:")
    public static native SKAction strengthBy(float strength, double duration);
    @Method(selector = "waitForDuration:")
    public static native SKAction wait(double duration);
    @Method(selector = "waitForDuration:withRange:")
    public static native SKAction wait(double duration, double durationRange);
    @Method(selector = "removeFromParent")
    public static native SKAction removeFromParent();
    @Method(selector = "runBlock:")
    public static native SKAction run(@Block Runnable block);
    @WeaklyLinked
    @Method(selector = "runBlock:queue:")
    public static native SKAction run(@Block Runnable block, DispatchQueue queue);
    @Method(selector = "runAction:onChildWithName:")
    public static native SKAction runAction(SKAction action, String name);
    @Method(selector = "customActionWithDuration:actionBlock:")
    protected static native @Pointer long create(double duration, @Block("(,@MachineSizedFloat)") VoidBlock2<SKNode, Double> block);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "actionNamed:")
    protected static native @Pointer long create(String name);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "actionNamed:duration:")
    protected static native @Pointer long create(String name, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "actionNamed:fromURL:")
    protected static native @Pointer long create(String name, NSURL url);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "actionNamed:fromURL:duration:")
    protected static native @Pointer long create(String name, NSURL url, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeChargeTo:duration:")
    public static native SKAction changeChargeTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeChargeBy:duration:")
    public static native SKAction changeChargeBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeMassTo:duration:")
    public static native SKAction changeMassTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeMassBy:duration:")
    public static native SKAction changeMassBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyForce:duration:")
    public static native SKAction applyForce(@ByVal CGVector force, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyForce:atPoint:duration:")
    public static native SKAction applyForce(@ByVal CGVector force, @ByVal CGPoint point, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyTorque:duration:")
    public static native SKAction applyTorque(@MachineSizedFloat double torque, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyImpulse:duration:")
    public static native SKAction applyImpulse(@ByVal CGVector impulse, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyImpulse:atPoint:duration:")
    public static native SKAction applyImpulse(@ByVal CGVector impulse, @ByVal CGPoint point, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyAngularImpulse:duration:")
    public static native SKAction applyAngularImpulse(@MachineSizedFloat double impulse, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "play")
    public static native SKAction play();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pause")
    public static native SKAction pause();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "stop")
    public static native SKAction stop();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changePlaybackRateTo:duration:")
    public static native SKAction changePlaybackRateTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changePlaybackRateBy:duration:")
    public static native SKAction changePlaybackRateBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeVolumeTo:duration:")
    public static native SKAction changeVolumeTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeVolumeBy:duration:")
    public static native SKAction changeVolumeBy(float v, double duration);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "warpTo:duration:")
    public static native SKAction warp(SKWarpGeometry warp, double duration);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "animateWithWarps:times:")
    public static native SKAction animateWarps(NSArray<SKWarpGeometry> warps, NSArray<NSNumber> times);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "animateWithWarps:times:restore:")
    public static native SKAction animateWarps(NSArray<SKWarpGeometry> warps, NSArray<NSNumber> times, boolean restore);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "stereoPanTo:duration:")
    public static native SKAction stereoPanTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "stereoPanBy:duration:")
    public static native SKAction stereoPanBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeReverbTo:duration:")
    public static native SKAction changeReverbTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeReverbBy:duration:")
    public static native SKAction changeReverbBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeObstructionTo:duration:")
    public static native SKAction changeObstructionTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeObstructionBy:duration:")
    public static native SKAction changeObstructionBy(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeOcclusionTo:duration:")
    public static native SKAction changeOcclusionTo(float v, double duration);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "changeOcclusionBy:duration:")
    public static native SKAction changeOcclusionBy(float v, double duration);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
