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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GCDevicePhysicalInput/*</name>*/ 
    /*<implements>*/extends GCDevicePhysicalInputState/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    GCDevice getDevice();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "queue")
    DispatchQueue getQueue();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setQueue:")
    void setQueue(DispatchQueue v);
    @Property(selector = "elementValueDidChangeHandler")
    @Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> getElementValueDidChangeHandler();
    @Property(selector = "setElementValueDidChangeHandler:")
    void setElementValueDidChangeHandler(@Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> v);
    @Property(selector = "inputStateAvailableHandler")
    @Block VoidBlock1<GCDevicePhysicalInput> getInputStateAvailableHandler();
    @Property(selector = "setInputStateAvailableHandler:")
    void setInputStateAvailableHandler(@Block VoidBlock1<GCDevicePhysicalInput> v);
    @Property(selector = "inputStateQueueDepth")
    @MachineSizedSInt long getInputStateQueueDepth();
    @Property(selector = "setInputStateQueueDepth:")
    void setInputStateQueueDepth(@MachineSizedSInt long v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "capture")
    GCDevicePhysicalInputState capture();
    @Method(selector = "nextInputState")
    NSObjectProtocol nextInputState();
    /*</methods>*/

    // dkimitsa: manually added wrappers
    default GCDevicePhysicalInputState nextPhysicalInputState() {
        return (GCDevicePhysicalInputState) nextInputState();
    }
    default GCDevicePhysicalInputStateDiff nextPhysicalInputStateDiff() {
        return (GCDevicePhysicalInputStateDiff) nextInputState();
    }

    /*<adapter>*/
    /*</adapter>*/
}
