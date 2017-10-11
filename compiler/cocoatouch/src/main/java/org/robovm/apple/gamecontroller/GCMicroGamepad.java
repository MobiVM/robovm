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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMicroGamepad/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCMicroGamepadPtr extends Ptr<GCMicroGamepad, GCMicroGamepadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCMicroGamepad.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMicroGamepad() {}
    protected GCMicroGamepad(Handle h, long handle) { super(h, handle); }
    protected GCMicroGamepad(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controller")
    public native GCController getController();
    @Property(selector = "valueChangedHandler")
    public native @Block VoidBlock2<GCMicroGamepad, GCControllerElement> getValueChangedHandler();
    @Property(selector = "setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCMicroGamepad, GCControllerElement> v);
    @Property(selector = "dpad")
    public native GCControllerDirectionPad getDpad();
    @Property(selector = "buttonA")
    public native GCControllerButtonInput getButtonA();
    @Property(selector = "buttonX")
    public native GCControllerButtonInput getButtonX();
    @Property(selector = "reportsAbsoluteDpadValues")
    public native boolean isReportsAbsoluteDpadValues();
    @Property(selector = "setReportsAbsoluteDpadValues:")
    public native void setReportsAbsoluteDpadValues(boolean v);
    @Property(selector = "allowsRotation")
    public native boolean allowsRotation();
    @Property(selector = "setAllowsRotation:")
    public native void setAllowsRotation(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveSnapshot")
    public native GCMicroGamepadSnapshot saveSnapshot();
    /*</methods>*/
}
