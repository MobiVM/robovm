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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNCameraController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNCameraControllerPtr extends Ptr<SCNCameraController, SCNCameraControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNCameraController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNCameraController() {}
    protected SCNCameraController(Handle h, long handle) { super(h, handle); }
    protected SCNCameraController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SCNCameraControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SCNCameraControllerDelegate v);
    @Property(selector = "pointOfView")
    public native SCNNode getPointOfView();
    @Property(selector = "setPointOfView:")
    public native void setPointOfView(SCNNode v);
    @Property(selector = "interactionMode")
    public native SCNInteractionMode getInteractionMode();
    @Property(selector = "setInteractionMode:")
    public native void setInteractionMode(SCNInteractionMode v);
    @Property(selector = "target")
    public native @ByVal SCNVector3 getTarget();
    @Property(selector = "setTarget:")
    public native void setTarget(@ByVal SCNVector3 v);
    @Property(selector = "automaticTarget")
    public native boolean isAutomaticTarget();
    @Property(selector = "setAutomaticTarget:")
    public native void setAutomaticTarget(boolean v);
    @Property(selector = "worldUp")
    public native @ByVal SCNVector3 getWorldUp();
    @Property(selector = "setWorldUp:")
    public native void setWorldUp(@ByVal SCNVector3 v);
    @Property(selector = "inertiaEnabled")
    public native boolean isInertiaEnabled();
    @Property(selector = "setInertiaEnabled:")
    public native void setInertiaEnabled(boolean v);
    @Property(selector = "inertiaFriction")
    public native float getInertiaFriction();
    @Property(selector = "setInertiaFriction:")
    public native void setInertiaFriction(float v);
    @Property(selector = "isInertiaRunning")
    public native boolean isInertiaRunning();
    @Property(selector = "minimumVerticalAngle")
    public native float getMinimumVerticalAngle();
    @Property(selector = "setMinimumVerticalAngle:")
    public native void setMinimumVerticalAngle(float v);
    @Property(selector = "maximumVerticalAngle")
    public native float getMaximumVerticalAngle();
    @Property(selector = "setMaximumVerticalAngle:")
    public native void setMaximumVerticalAngle(float v);
    @Property(selector = "minimumHorizontalAngle")
    public native float getMinimumHorizontalAngle();
    @Property(selector = "setMinimumHorizontalAngle:")
    public native void setMinimumHorizontalAngle(float v);
    @Property(selector = "maximumHorizontalAngle")
    public native float getMaximumHorizontalAngle();
    @Property(selector = "setMaximumHorizontalAngle:")
    public native void setMaximumHorizontalAngle(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "translateInCameraSpaceByX:Y:Z:")
    public native void translateInCameraSpace(float deltaX, float deltaY, float deltaZ);
    @Method(selector = "frameNodes:")
    public native void frameNodes(NSArray<SCNNode> nodes);
    @Method(selector = "rotateByX:Y:")
    public native void rotateByXY(float deltaX, float deltaY);
    @Method(selector = "rollBy:aroundScreenPoint:viewport:")
    public native void roll(float delta, @ByVal CGPoint point, @ByVal CGSize viewport);
    @Method(selector = "dollyBy:onScreenPoint:viewport:")
    public native void dolly(float delta, @ByVal CGPoint point, @ByVal CGSize viewport);
    @Method(selector = "rollAroundTarget:")
    public native void rollAroundTarget(float delta);
    @Method(selector = "dollyToTarget:")
    public native void dollyToTarget(float delta);
    @Method(selector = "clearRoll")
    public native void clearRoll();
    @Method(selector = "stopInertia")
    public native void stopInertia();
    @Method(selector = "beginInteraction:withViewport:")
    public native void beginInteraction(@ByVal CGPoint location, @ByVal CGSize viewport);
    @Method(selector = "continueInteraction:withViewport:sensitivity:")
    public native void continueInteraction(@ByVal CGPoint location, @ByVal CGSize viewport, @MachineSizedFloat double sensitivity);
    @Method(selector = "endInteraction:withViewport:velocity:")
    public native void endInteraction(@ByVal CGPoint location, @ByVal CGSize viewport, @ByVal CGPoint velocity);
    /*</methods>*/
}
