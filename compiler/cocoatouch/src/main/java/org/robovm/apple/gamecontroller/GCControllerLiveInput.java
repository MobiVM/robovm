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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerLiveInput/*</name>*/ 
    extends /*<extends>*/GCControllerInputState/*</extends>*/ 
    /*<implements>*/implements GCDevicePhysicalInput/*</implements>*/ {

    /*<ptr>*/public static class GCControllerLiveInputPtr extends Ptr<GCControllerLiveInput, GCControllerLiveInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerLiveInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerLiveInput() {}
    protected GCControllerLiveInput(Handle h, long handle) { super(h, handle); }
    protected GCControllerLiveInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unmappedInput")
    public native GCControllerLiveInput getUnmappedInput();
    @Property(selector = "device")
    public native GCDevice getDevice();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "queue")
    public native DispatchQueue getQueue();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setQueue:")
    public native void setQueue(DispatchQueue v);
    @Property(selector = "elementValueDidChangeHandler")
    public native @Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> getElementValueDidChangeHandler();
    @Property(selector = "setElementValueDidChangeHandler:")
    public native void setElementValueDidChangeHandler(@Block VoidBlock2<GCDevicePhysicalInput, GCPhysicalInputElement> v);
    @Property(selector = "inputStateAvailableHandler")
    public native @Block VoidBlock1<GCDevicePhysicalInput> getInputStateAvailableHandler();
    @Property(selector = "setInputStateAvailableHandler:")
    public native void setInputStateAvailableHandler(@Block VoidBlock1<GCDevicePhysicalInput> v);
    @Property(selector = "inputStateQueueDepth")
    public native @MachineSizedSInt long getInputStateQueueDepth();
    @Property(selector = "setInputStateQueueDepth:")
    public native void setInputStateQueueDepth(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "capture")
    public native GCControllerInputState capture();
    @Method(selector = "nextInputState")
    public native NSObjectProtocol nextInputState();
    /*</methods>*/
}
