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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKAgent3D/*</name>*/ 
    extends /*<extends>*/GKAgent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKAgent3DPtr extends Ptr<GKAgent3D, GKAgent3DPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKAgent3D.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKAgent3D() {}
    protected GKAgent3D(Handle h, long handle) { super(h, handle); }
    protected GKAgent3D(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "position")
    public native @ByVal VectorFloat3 getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal VectorFloat3 v);
    @Property(selector = "velocity")
    public native @ByVal VectorFloat3 getVelocity();
    @Property(selector = "rightHanded")
    public native boolean isRightHanded();
    @Property(selector = "setRightHanded:")
    public native void setRightHanded(boolean v);
    @Property(selector = "rotation")
    public native @ByVal MatrixFloat3x4 getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(@ByVal MatrixFloat3x4 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateWithDeltaTime:")
    public native void update(double seconds);
    /*</methods>*/
}
