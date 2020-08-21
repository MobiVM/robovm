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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerTouchpad/*</name>*/ 
    extends /*<extends>*/GCControllerElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerTouchpadPtr extends Ptr<GCControllerTouchpad, GCControllerTouchpadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerTouchpad.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerTouchpad() {}
    protected GCControllerTouchpad(Handle h, long handle) { super(h, handle); }
    protected GCControllerTouchpad(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "button")
    public native GCControllerButtonInput getButton();
    @Property(selector = "touchDown")
    public native @Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> getTouchDown();
    @Property(selector = "setTouchDown:")
    public native void setTouchDown(@Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> v);
    @Property(selector = "touchMoved")
    public native @Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> getTouchMoved();
    @Property(selector = "setTouchMoved:")
    public native void setTouchMoved(@Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> v);
    @Property(selector = "touchUp")
    public native @Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> getTouchUp();
    @Property(selector = "setTouchUp:")
    public native void setTouchUp(@Block VoidBlock5<GCControllerTouchpad, Float, Float, Float, Boolean> v);
    @Property(selector = "touchSurface")
    public native GCControllerDirectionPad getTouchSurface();
    @Property(selector = "touchState")
    public native GCTouchState getTouchState();
    @Property(selector = "reportsAbsoluteTouchSurfaceValues")
    public native boolean isReportsAbsoluteTouchSurfaceValues();
    @Property(selector = "setReportsAbsoluteTouchSurfaceValues:")
    public native void setReportsAbsoluteTouchSurfaceValues(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setValueForXAxis:yAxis:touchDown:buttonValue:")
    public native void setValue(float xAxis, float yAxis, boolean touchDown, float buttonValue);
    /*</methods>*/
}
