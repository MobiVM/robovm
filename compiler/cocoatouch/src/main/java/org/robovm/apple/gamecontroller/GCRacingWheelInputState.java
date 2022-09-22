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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCRacingWheelInputState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GCDevicePhysicalInputState/*</implements>*/ {

    /*<ptr>*/public static class GCRacingWheelInputStatePtr extends Ptr<GCRacingWheelInputState, GCRacingWheelInputStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCRacingWheelInputState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCRacingWheelInputState() {}
    protected GCRacingWheelInputState(Handle h, long handle) { super(h, handle); }
    protected GCRacingWheelInputState(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "wheel")
    public native GCSteeringWheelElement getWheel();
    @Property(selector = "acceleratorPedal")
    public native GCButtonElement getAcceleratorPedal();
    @Property(selector = "brakePedal")
    public native GCButtonElement getBrakePedal();
    @Property(selector = "clutchPedal")
    public native GCButtonElement getClutchPedal();
    @Property(selector = "shifter")
    public native GCGearShifterElement getShifter();
    @Property(selector = "device")
    public native GCDevice getDevice();
    @Property(selector = "lastEventTimestamp")
    public native double getLastEventTimestamp();
    @Property(selector = "lastEventLatency")
    public native double getLastEventLatency();
    @Property(selector = "elements")
    public native GCPhysicalInputElementCollection getElements();
    @Property(selector = "buttons")
    public native GCPhysicalInputElementCollection getButtons();
    @Property(selector = "axes")
    public native GCPhysicalInputElementCollection getAxes();
    @Property(selector = "switches")
    public native GCPhysicalInputElementCollection getSwitches();
    @Property(selector = "dpads")
    public native GCPhysicalInputElementCollection getDpads();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "objectForKeyedSubscript:")
    public native GCPhysicalInputElement objectForKeyedSubscript(String key);
    /*</methods>*/
}
