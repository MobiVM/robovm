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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPhysicsWorld/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKPhysicsWorldPtr extends Ptr<SKPhysicsWorld, SKPhysicsWorldPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPhysicsWorld.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPhysicsWorld() {}
    protected SKPhysicsWorld(Handle h, long handle) { super(h, handle); }
    protected SKPhysicsWorld(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SKPhysicsWorld(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gravity")
    public native @ByVal CGVector getGravity();
    @Property(selector = "setGravity:")
    public native void setGravity(@ByVal CGVector v);
    @Property(selector = "speed")
    public native @MachineSizedFloat double getSpeed();
    @Property(selector = "setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    @Property(selector = "contactDelegate")
    public native SKPhysicsContactDelegate getContactDelegate();
    @Property(selector = "setContactDelegate:", strongRef = true)
    public native void setContactDelegate(SKPhysicsContactDelegate v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addJoint:")
    public native void addJoint(SKPhysicsJoint joint);
    @Method(selector = "removeJoint:")
    public native void removeJoint(SKPhysicsJoint joint);
    @Method(selector = "removeAllJoints")
    public native void removeAllJoints();
    @Method(selector = "sampleFieldsAt:")
    public native @ByVal VectorFloat3 sampleFieldsAt(@ByVal VectorFloat3 position);
    @Method(selector = "bodyAtPoint:")
    public native SKPhysicsBody getBodyAtPoint(@ByVal CGPoint point);
    @Method(selector = "bodyInRect:")
    public native SKPhysicsBody getBodyInRect(@ByVal CGRect rect);
    @Method(selector = "bodyAlongRayStart:end:")
    public native SKPhysicsBody getBodyAlongRay(@ByVal CGPoint start, @ByVal CGPoint end);
    @Method(selector = "enumerateBodiesAtPoint:usingBlock:")
    public native void enumerateBodiesAtPoint(@ByVal CGPoint point, @Block VoidBlock2<SKPhysicsBody, BooleanPtr> block);
    @Method(selector = "enumerateBodiesInRect:usingBlock:")
    public native void enumerateBodiesInRect(@ByVal CGRect rect, @Block VoidBlock2<SKPhysicsBody, BooleanPtr> block);
    @Method(selector = "enumerateBodiesAlongRayStart:end:usingBlock:")
    public native void enumerateBodiesAlongRay(@ByVal CGPoint start, @ByVal CGPoint end, @Block("(,@ByVal,@ByVal,)") VoidBlock4<SKPhysicsBody, CGPoint, CGVector, BooleanPtr> block);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
