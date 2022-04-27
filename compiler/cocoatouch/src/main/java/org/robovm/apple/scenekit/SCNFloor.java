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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNFloor/*</name>*/ 
    extends /*<extends>*/SCNGeometry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNFloorPtr extends Ptr<SCNFloor, SCNFloorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNFloor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNFloor() {}
    protected SCNFloor(Handle h, long handle) { super(h, handle); }
    protected SCNFloor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reflectivity")
    public native @MachineSizedFloat double getReflectivity();
    @Property(selector = "setReflectivity:")
    public native void setReflectivity(@MachineSizedFloat double v);
    @Property(selector = "reflectionFalloffStart")
    public native @MachineSizedFloat double getReflectionFalloffStart();
    @Property(selector = "setReflectionFalloffStart:")
    public native void setReflectionFalloffStart(@MachineSizedFloat double v);
    @Property(selector = "reflectionFalloffEnd")
    public native @MachineSizedFloat double getReflectionFalloffEnd();
    @Property(selector = "setReflectionFalloffEnd:")
    public native void setReflectionFalloffEnd(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "reflectionCategoryBitMask")
    public native @MachineSizedUInt long getReflectionCategoryBitMask();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setReflectionCategoryBitMask:")
    public native void setReflectionCategoryBitMask(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "length")
    public native @MachineSizedFloat double getLength();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setLength:")
    public native void setLength(@MachineSizedFloat double v);
    @Property(selector = "reflectionResolutionScaleFactor")
    public native @MachineSizedFloat double getReflectionResolutionScaleFactor();
    @Property(selector = "setReflectionResolutionScaleFactor:")
    public native void setReflectionResolutionScaleFactor(@MachineSizedFloat double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "floor")
    public static native SCNFloor create();
    @Method(selector = "geometry")
    public static native SCNFloor createGeometry();
    @Method(selector = "geometryWithSources:elements:")
    public static native SCNFloor createGeometry(NSArray<SCNGeometrySource> sources, NSArray<SCNGeometryElement> elements);
    /*</methods>*/
}
