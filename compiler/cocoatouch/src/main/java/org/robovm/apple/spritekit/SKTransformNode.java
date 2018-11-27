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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKTransformNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKTransformNodePtr extends Ptr<SKTransformNode, SKTransformNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKTransformNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKTransformNode() {}
    protected SKTransformNode(Handle h, long handle) { super(h, handle); }
    protected SKTransformNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SKTransformNode(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "xRotation")
    public native @MachineSizedFloat double getXRotation();
    @Property(selector = "setXRotation:")
    public native void setXRotation(@MachineSizedFloat double v);
    @Property(selector = "yRotation")
    public native @MachineSizedFloat double getYRotation();
    @Property(selector = "setYRotation:")
    public native void setYRotation(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setEulerAngles:")
    public native void setEulerAngles(@ByVal VectorFloat3 euler);
    @Method(selector = "eulerAngles")
    public native @ByVal VectorFloat3 eulerAngles();
    @Method(selector = "setRotationMatrix:")
    public native void setRotationMatrix(@ByVal MatrixFloat3x4 rotationMatrix);
    @Method(selector = "rotationMatrix")
    public native @ByVal MatrixFloat3x4 rotationMatrix();
    @Method(selector = "setQuaternion:")
    public native void setQuaternion(@ByVal VectorFloat4 quaternion);
    @Method(selector = "quaternion")
    public native @ByVal VectorFloat4 quaternion();
    /*</methods>*/
}
