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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCDevicePhysicalInputAdapter/*</name>*/ 
    extends /*<extends>*/GCDevicePhysicalInputStateAdapter/*</extends>*/ 
    /*<implements>*/implements GCDevicePhysicalInput/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public GCDevice getDevice() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("queue")
    public DispatchQueue getQueue() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setQueue:")
    public void setQueue(DispatchQueue v) {}
    @NotImplemented("elementValueDidChangeHandler")
    public @Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> getElementValueDidChangeHandler() { return null; }
    @NotImplemented("setElementValueDidChangeHandler:")
    public void setElementValueDidChangeHandler(@Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> v) {}
    @NotImplemented("inputStateAvailableHandler")
    public @Block VoidBlock1<GCDevicePhysicalInput> getInputStateAvailableHandler() { return null; }
    @NotImplemented("setInputStateAvailableHandler:")
    public void setInputStateAvailableHandler(@Block VoidBlock1<GCDevicePhysicalInput> v) {}
    @NotImplemented("inputStateQueueDepth")
    public @MachineSizedSInt long getInputStateQueueDepth() { return 0; }
    @NotImplemented("setInputStateQueueDepth:")
    public void setInputStateQueueDepth(@MachineSizedSInt long v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("capture")
    public GCDevicePhysicalInputState capture() { return null; }
    @NotImplemented("nextInputState")
    public NSObjectProtocol nextInputState() { return null; }
    /*</methods>*/
}
