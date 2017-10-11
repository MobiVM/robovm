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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNGeometryTessellator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNGeometryTessellatorPtr extends Ptr<SCNGeometryTessellator, SCNGeometryTessellatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNGeometryTessellator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNGeometryTessellator() {}
    protected SCNGeometryTessellator(Handle h, long handle) { super(h, handle); }
    protected SCNGeometryTessellator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNGeometryTessellator(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tessellationFactorScale")
    public native @MachineSizedFloat double getTessellationFactorScale();
    @Property(selector = "setTessellationFactorScale:")
    public native void setTessellationFactorScale(@MachineSizedFloat double v);
    @Property(selector = "tessellationPartitionMode")
    public native MTLTessellationPartitionMode getTessellationPartitionMode();
    @Property(selector = "setTessellationPartitionMode:")
    public native void setTessellationPartitionMode(MTLTessellationPartitionMode v);
    @Property(selector = "isAdaptive")
    public native boolean isAdaptive();
    @Property(selector = "setAdaptive:")
    public native void setAdaptive(boolean v);
    @Property(selector = "isScreenSpace")
    public native boolean isScreenSpace();
    @Property(selector = "setScreenSpace:")
    public native void setScreenSpace(boolean v);
    @Property(selector = "edgeTessellationFactor")
    public native @MachineSizedFloat double getEdgeTessellationFactor();
    @Property(selector = "setEdgeTessellationFactor:")
    public native void setEdgeTessellationFactor(@MachineSizedFloat double v);
    @Property(selector = "insideTessellationFactor")
    public native @MachineSizedFloat double getInsideTessellationFactor();
    @Property(selector = "setInsideTessellationFactor:")
    public native void setInsideTessellationFactor(@MachineSizedFloat double v);
    @Property(selector = "maximumEdgeLength")
    public native @MachineSizedFloat double getMaximumEdgeLength();
    @Property(selector = "setMaximumEdgeLength:")
    public native void setMaximumEdgeLength(@MachineSizedFloat double v);
    @Property(selector = "smoothingMode")
    public native SCNTessellationSmoothingMode getSmoothingMode();
    @Property(selector = "setSmoothingMode:")
    public native void setSmoothingMode(SCNTessellationSmoothingMode v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
