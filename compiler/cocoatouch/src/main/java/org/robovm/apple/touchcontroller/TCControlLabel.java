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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCControlLabel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCControlLabelPtr extends Ptr<TCControlLabel, TCControlLabelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCControlLabel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCControlLabel() {}
    protected TCControlLabel(Handle h, long handle) { super(h, handle); }
    protected TCControlLabel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:role:")
    public TCControlLabel(String name, TCControlLabelRole role) { super((SkipInit) null); initObject(init(name, role)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "buttonA")
    public static native TCControlLabel getButtonA();
    @Property(selector = "buttonB")
    public static native TCControlLabel getButtonB();
    @Property(selector = "buttonX")
    public static native TCControlLabel getButtonX();
    @Property(selector = "buttonY")
    public static native TCControlLabel getButtonY();
    @Property(selector = "buttonMenu")
    public static native TCControlLabel getButtonMenu();
    @Property(selector = "buttonOptions")
    public static native TCControlLabel getButtonOptions();
    @Property(selector = "buttonLeftShoulder")
    public static native TCControlLabel getButtonLeftShoulder();
    @Property(selector = "buttonLeftTrigger")
    public static native TCControlLabel getButtonLeftTrigger();
    @Property(selector = "buttonRightShoulder")
    public static native TCControlLabel getButtonRightShoulder();
    @Property(selector = "buttonRightTrigger")
    public static native TCControlLabel getButtonRightTrigger();
    @Property(selector = "leftThumbstick")
    public static native TCControlLabel getLeftThumbstick();
    @Property(selector = "leftThumbstickButton")
    public static native TCControlLabel getLeftThumbstickButton();
    @Property(selector = "rightThumbstick")
    public static native TCControlLabel getRightThumbstick();
    @Property(selector = "rightThumbstickButton")
    public static native TCControlLabel getRightThumbstickButton();
    @Property(selector = "directionPad")
    public static native TCControlLabel getDirectionPad();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "role")
    public native TCControlLabelRole getRole();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:role:")
    protected native @Pointer long init(String name, TCControlLabelRole role);
    /*</methods>*/
}
