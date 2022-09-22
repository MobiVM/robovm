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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCRacingWheelInput/*</name>*/ 
    extends /*<extends>*/GCRacingWheelInputState/*</extends>*/ 
    /*<implements>*/implements GCDevicePhysicalInput/*</implements>*/ {

    /*<ptr>*/public static class GCRacingWheelInputPtr extends Ptr<GCRacingWheelInput, GCRacingWheelInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCRacingWheelInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCRacingWheelInput() {}
    protected GCRacingWheelInput(Handle h, long handle) { super(h, handle); }
    protected GCRacingWheelInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native GCDevice getDevice();
    @Property(selector = "elementValueDidChangeHandler")
    public native @Block VoidBlock1<GCPhysicalInputElement> getElementValueDidChangeHandler();
    @Property(selector = "setElementValueDidChangeHandler:")
    public native void setElementValueDidChangeHandler(@Block VoidBlock1<GCPhysicalInputElement> v);
    @Property(selector = "inputStateAvailableHandler")
    public native @Block Runnable getInputStateAvailableHandler();
    @Property(selector = "setInputStateAvailableHandler:")
    public native void setInputStateAvailableHandler(@Block Runnable v);
    @Property(selector = "inputStateQueueDepth")
    public native @MachineSizedSInt long getInputStateQueueDepth();
    @Property(selector = "setInputStateQueueDepth:")
    public native void setInputStateQueueDepth(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "capture")
    public native GCRacingWheelInputState capture();
    @Method(selector = "nextInputState")
    public native GCRacingWheelInputState nextInputState();
    /*</methods>*/
}
