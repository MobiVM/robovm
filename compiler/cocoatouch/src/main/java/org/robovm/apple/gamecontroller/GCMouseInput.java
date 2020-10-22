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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMouseInput/*</name>*/ 
    extends /*<extends>*/GCPhysicalInputProfile/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCMouseInputPtr extends Ptr<GCMouseInput, GCMouseInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCMouseInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMouseInput() {}
    protected GCMouseInput(Handle h, long handle) { super(h, handle); }
    protected GCMouseInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mouseMovedHandler")
    public native @Block VoidBlock3<GCMouseInput, Float, Float> getMouseMovedHandler();
    @Property(selector = "setMouseMovedHandler:")
    public native void setMouseMovedHandler(@Block VoidBlock3<GCMouseInput, Float, Float> v);
    @Property(selector = "scroll")
    public native GCDeviceCursor getScroll();
    @Property(selector = "leftButton")
    public native GCControllerButtonInput getLeftButton();
    @Property(selector = "rightButton")
    public native GCControllerButtonInput getRightButton();
    @Property(selector = "middleButton")
    public native GCControllerButtonInput getMiddleButton();
    @Property(selector = "auxiliaryButtons")
    public native NSArray<GCControllerButtonInput> getAuxiliaryButtons();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
