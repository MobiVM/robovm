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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNPhysicsShape/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNPhysicsShapePtr extends Ptr<SCNPhysicsShape, SCNPhysicsShapePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNPhysicsShape.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNPhysicsShape() {}
    protected SCNPhysicsShape(Handle h, long handle) { super(h, handle); }
    protected SCNPhysicsShape(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNPhysicsShape(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "options")
    public native NSDictionary<?, ?> getOptions();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "sourceObject")
    public native NSObject getSourceObject();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "transforms")
    public native NSArray<NSValue> getTransforms();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "shapeWithGeometry:options:")
    public static native SCNPhysicsShape create(SCNGeometry geometry, SCNPhysicsShapeOptions options);
    @Method(selector = "shapeWithNode:options:")
    public static native SCNPhysicsShape create(SCNNode node, SCNPhysicsShapeOptions options);
    @Method(selector = "shapeWithShapes:transforms:")
    public static native SCNPhysicsShape create(NSArray<SCNPhysicsShape> shapes, @org.robovm.rt.bro.annotation.Marshaler(SCNMatrix4.AsListMarshaler.class) List<SCNMatrix4> transforms);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
