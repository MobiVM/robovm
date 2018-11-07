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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNAvoidOccluderConstraint/*</name>*/ 
    extends /*<extends>*/SCNConstraint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNAvoidOccluderConstraintPtr extends Ptr<SCNAvoidOccluderConstraint, SCNAvoidOccluderConstraintPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNAvoidOccluderConstraint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNAvoidOccluderConstraint() {}
    protected SCNAvoidOccluderConstraint(Handle h, long handle) { super(h, handle); }
    protected SCNAvoidOccluderConstraint(SkipInit skipInit) { super(skipInit); }
    public SCNAvoidOccluderConstraint(SCNNode target) { super((Handle) null, create(target)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SCNAvoidOccluderConstraintDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SCNAvoidOccluderConstraintDelegate v);
    @Property(selector = "target")
    public native SCNNode getTarget();
    @Property(selector = "setTarget:")
    public native void setTarget(SCNNode v);
    @Property(selector = "occluderCategoryBitMask")
    public native @MachineSizedUInt long getOccluderCategoryBitMask();
    @Property(selector = "setOccluderCategoryBitMask:")
    public native void setOccluderCategoryBitMask(@MachineSizedUInt long v);
    @Property(selector = "bias")
    public native @MachineSizedFloat double getBias();
    @Property(selector = "setBias:")
    public native void setBias(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "avoidOccluderConstraintWithTarget:")
    protected static native @Pointer long create(SCNNode target);
    /*</methods>*/
}
