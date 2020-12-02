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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNCone/*</name>*/ 
    extends /*<extends>*/SCNGeometry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNConePtr extends Ptr<SCNCone, SCNConePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNCone.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNCone() {}
    protected SCNCone(Handle h, long handle) { super(h, handle); }
    protected SCNCone(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "topRadius")
    public native @MachineSizedFloat double getTopRadius();
    @Property(selector = "setTopRadius:")
    public native void setTopRadius(@MachineSizedFloat double v);
    @Property(selector = "bottomRadius")
    public native @MachineSizedFloat double getBottomRadius();
    @Property(selector = "setBottomRadius:")
    public native void setBottomRadius(@MachineSizedFloat double v);
    @Property(selector = "height")
    public native @MachineSizedFloat double getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(@MachineSizedFloat double v);
    @Property(selector = "radialSegmentCount")
    public native @MachineSizedSInt long getRadialSegmentCount();
    @Property(selector = "setRadialSegmentCount:")
    public native void setRadialSegmentCount(@MachineSizedSInt long v);
    @Property(selector = "heightSegmentCount")
    public native @MachineSizedSInt long getHeightSegmentCount();
    @Property(selector = "setHeightSegmentCount:")
    public native void setHeightSegmentCount(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "coneWithTopRadius:bottomRadius:height:")
    public static native SCNCone create(@MachineSizedFloat double topRadius, @MachineSizedFloat double bottomRadius, @MachineSizedFloat double height);
    @Method(selector = "geometry")
    public static native SCNCone createGeometry();
    @Method(selector = "geometryWithSources:elements:")
    public static native SCNCone createGeometry(NSArray<SCNGeometrySource> sources, NSArray<SCNGeometryElement> elements);
    /*</methods>*/
}
