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
 * @since Available in iOS 14.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCDualSenseGamepad/*</name>*/ 
    extends /*<extends>*/GCExtendedGamepad/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCDualSenseGamepadPtr extends Ptr<GCDualSenseGamepad, GCDualSenseGamepadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCDualSenseGamepad.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCDualSenseGamepad() {}
    protected GCDualSenseGamepad(Handle h, long handle) { super(h, handle); }
    protected GCDualSenseGamepad(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "touchpadButton")
    public native GCControllerButtonInput getTouchpadButton();
    @Property(selector = "touchpadPrimary")
    public native GCControllerDirectionPad getTouchpadPrimary();
    @Property(selector = "touchpadSecondary")
    public native GCControllerDirectionPad getTouchpadSecondary();
    @Property(selector = "leftTrigger")
    public native GCDualSenseAdaptiveTrigger getLeftTrigger();
    @Property(selector = "rightTrigger")
    public native GCDualSenseAdaptiveTrigger getRightTrigger();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
