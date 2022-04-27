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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMotion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCMotionPtr extends Ptr<GCMotion, GCMotionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCMotion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMotion() {}
    protected GCMotion(Handle h, long handle) { super(h, handle); }
    protected GCMotion(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controller")
    public native GCController getController();
    @Property(selector = "valueChangedHandler")
    public native @Block VoidBlock2<GCGamepad, GCControllerElement> getValueChangedHandler();
    @Property(selector = "setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCGamepad, GCControllerElement> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sensorsRequireManualActivation")
    public native boolean isSensorsRequireManualActivation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sensorsActive")
    public native boolean isSensorsActive();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSensorsActive:")
    public native void setSensorsActive(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "hasGravityAndUserAcceleration")
    public native boolean hasGravityAndUserAcceleration();
    @Property(selector = "gravity")
    public native @ByVal GCAcceleration getGravity();
    @Property(selector = "setGravity:")
    public native void setGravity(@ByVal GCAcceleration v);
    @Property(selector = "userAcceleration")
    public native @ByVal GCAcceleration getUserAcceleration();
    @Property(selector = "setUserAcceleration:")
    public native void setUserAcceleration(@ByVal GCAcceleration v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "acceleration")
    public native @ByVal GCAcceleration getAcceleration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAcceleration:")
    public native void setAcceleration(@ByVal GCAcceleration v);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. hasAttitudeAndRotationRate has been deprecated, use -hasAttitude and -hasRotationRate instead
     */
    @Deprecated
    @Property(selector = "hasAttitudeAndRotationRate")
    public native boolean hasAttitudeAndRotationRate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "hasAttitude")
    public native boolean hasAttitude();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "hasRotationRate")
    public native boolean hasRotationRate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "attitude")
    public native @ByVal GCQuaternion getAttitude();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAttitude:")
    public native void setAttitude(@ByVal GCQuaternion v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "rotationRate")
    public native @ByVal GCRotationRate getRotationRate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRotationRate:")
    public native void setRotationRate(@ByVal GCRotationRate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setStateFromMotion:")
    public native void setStateFromMotion(GCMotion motion);
    /*</methods>*/
}
