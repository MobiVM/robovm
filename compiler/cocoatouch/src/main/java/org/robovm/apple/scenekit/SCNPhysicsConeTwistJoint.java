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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNPhysicsConeTwistJoint/*</name>*/ 
    extends /*<extends>*/SCNPhysicsBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNPhysicsConeTwistJointPtr extends Ptr<SCNPhysicsConeTwistJoint, SCNPhysicsConeTwistJointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNPhysicsConeTwistJoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNPhysicsConeTwistJoint() {}
    protected SCNPhysicsConeTwistJoint(Handle h, long handle) { super(h, handle); }
    protected SCNPhysicsConeTwistJoint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bodyA")
    public native SCNPhysicsBody getBodyA();
    @Property(selector = "frameA")
    public native @ByVal SCNMatrix4 getFrameA();
    @Property(selector = "setFrameA:")
    public native void setFrameA(@ByVal SCNMatrix4 v);
    @Property(selector = "bodyB")
    public native SCNPhysicsBody getBodyB();
    @Property(selector = "frameB")
    public native @ByVal SCNMatrix4 getFrameB();
    @Property(selector = "setFrameB:")
    public native void setFrameB(@ByVal SCNMatrix4 v);
    @Property(selector = "maximumAngularLimit1")
    public native @MachineSizedFloat double getMaximumAngularLimit1();
    @Property(selector = "setMaximumAngularLimit1:")
    public native void setMaximumAngularLimit1(@MachineSizedFloat double v);
    @Property(selector = "maximumAngularLimit2")
    public native @MachineSizedFloat double getMaximumAngularLimit2();
    @Property(selector = "setMaximumAngularLimit2:")
    public native void setMaximumAngularLimit2(@MachineSizedFloat double v);
    @Property(selector = "maximumTwistAngle")
    public native @MachineSizedFloat double getMaximumTwistAngle();
    @Property(selector = "setMaximumTwistAngle:")
    public native void setMaximumTwistAngle(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "jointWithBodyA:frameA:bodyB:frameB:")
    public static native SCNPhysicsConeTwistJoint joint(SCNPhysicsBody bodyA, @ByVal SCNMatrix4 frameA, SCNPhysicsBody bodyB, @ByVal SCNMatrix4 frameB);
    @Method(selector = "jointWithBody:frame:")
    public static native SCNPhysicsConeTwistJoint joint(SCNPhysicsBody body, @ByVal SCNMatrix4 frame);
    /*</methods>*/
}
