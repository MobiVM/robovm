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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCDevicePhysicalInputStateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GCDevicePhysicalInputState/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public GCDevice getDevice() { return null; }
    @NotImplemented("lastEventTimestamp")
    public double getLastEventTimestamp() { return 0; }
    @NotImplemented("lastEventLatency")
    public double getLastEventLatency() { return 0; }
    @NotImplemented("elements")
    public GCPhysicalInputElementCollection<NSString, ?> getElements() { return null; }
    @NotImplemented("buttons")
    public GCPhysicalInputElementCollection<NSString, ?> getButtons() { return null; }
    @NotImplemented("axes")
    public GCPhysicalInputElementCollection<NSString, ?> getAxes() { return null; }
    @NotImplemented("switches")
    public GCPhysicalInputElementCollection<NSString, ?> getSwitches() { return null; }
    @NotImplemented("dpads")
    public GCPhysicalInputElementCollection<NSString, ?> getDpads() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("objectForKeyedSubscript:")
    public GCPhysicalInputElement objectForKeyedSubscript(NSString key) { return null; }
    /*</methods>*/
}
