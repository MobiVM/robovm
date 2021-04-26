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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCDualSenseAdaptiveTrigger/*</name>*/ 
    extends /*<extends>*/GCControllerButtonInput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCDualSenseAdaptiveTriggerPtr extends Ptr<GCDualSenseAdaptiveTrigger, GCDualSenseAdaptiveTriggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCDualSenseAdaptiveTrigger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCDualSenseAdaptiveTrigger() {}
    protected GCDualSenseAdaptiveTrigger(Handle h, long handle) { super(h, handle); }
    protected GCDualSenseAdaptiveTrigger(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mode")
    public native GCDualSenseAdaptiveTriggerMode getMode();
    @Property(selector = "status")
    public native GCDualSenseAdaptiveTriggerStatus getStatus();
    @Property(selector = "armPosition")
    public native float getArmPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setModeFeedbackWithStartPosition:resistiveStrength:")
    public native void setModeFeedback(float startPosition, float resistiveStrength);
    @Method(selector = "setModeWeaponWithStartPosition:endPosition:resistiveStrength:")
    public native void setModeWeapon(float startPosition, float endPosition, float resistiveStrength);
    @Method(selector = "setModeVibrationWithStartPosition:amplitude:frequency:")
    public native void setModeVibration(float startPosition, float amplitude, float frequency);
    @Method(selector = "setModeOff")
    public native void setModeOff();
    /*</methods>*/
}
