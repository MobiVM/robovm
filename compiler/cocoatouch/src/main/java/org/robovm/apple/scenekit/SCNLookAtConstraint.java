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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNLookAtConstraint/*</name>*/ 
    extends /*<extends>*/SCNConstraint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNLookAtConstraintPtr extends Ptr<SCNLookAtConstraint, SCNLookAtConstraintPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNLookAtConstraint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNLookAtConstraint() {}
    protected SCNLookAtConstraint(Handle h, long handle) { super(h, handle); }
    protected SCNLookAtConstraint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "target")
    public native SCNNode getTarget();
    @Property(selector = "setTarget:")
    public native void setTarget(SCNNode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "targetOffset")
    public native @ByVal SCNVector3 getTargetOffset();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTargetOffset:")
    public native void setTargetOffset(@ByVal SCNVector3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "localFront")
    public native @ByVal SCNVector3 getLocalFront();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLocalFront:")
    public native void setLocalFront(@ByVal SCNVector3 v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "worldUp")
    public native @ByVal SCNVector3 getWorldUp();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setWorldUp:")
    public native void setWorldUp(@ByVal SCNVector3 v);
    @Property(selector = "gimbalLockEnabled")
    public native boolean isGimbalLockEnabled();
    @Property(selector = "setGimbalLockEnabled:")
    public native void setGimbalLockEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "lookAtConstraintWithTarget:")
    public static native SCNLookAtConstraint create(SCNNode target);
    /*</methods>*/
}
