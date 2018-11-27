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
package org.robovm.apple.gameplaykit;

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
import org.robovm.apple.spritekit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKSphereObstacle/*</name>*/ 
    extends /*<extends>*/GKObstacle/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKSphereObstaclePtr extends Ptr<GKSphereObstacle, GKSphereObstaclePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKSphereObstacle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKSphereObstacle() {}
    protected GKSphereObstacle(Handle h, long handle) { super(h, handle); }
    protected GKSphereObstacle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRadius:")
    public GKSphereObstacle(float radius) { super((SkipInit) null); initObject(init(radius)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "radius")
    public native float getRadius();
    @Property(selector = "setRadius:")
    public native void setRadius(float v);
    @Property(selector = "position")
    public native @ByVal VectorFloat3 getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal VectorFloat3 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRadius:")
    protected native @Pointer long init(float radius);
    /*</methods>*/
}
