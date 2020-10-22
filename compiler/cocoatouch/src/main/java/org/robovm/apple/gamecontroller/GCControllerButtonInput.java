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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerButtonInput/*</name>*/ 
    extends /*<extends>*/GCControllerElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerButtonInputPtr extends Ptr<GCControllerButtonInput, GCControllerButtonInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerButtonInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerButtonInput() {}
    protected GCControllerButtonInput(Handle h, long handle) { super(h, handle); }
    protected GCControllerButtonInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "valueChangedHandler")
    public native @Block VoidBlock3<GCControllerButtonInput, Float, Boolean> getValueChangedHandler();
    @Property(selector = "setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    @Property(selector = "pressedChangedHandler")
    public native @Block VoidBlock3<GCControllerButtonInput, Float, Boolean> getPressedChangedHandler();
    @Property(selector = "setPressedChangedHandler:")
    public native void setPressedChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "touchedChangedHandler")
    public native @Block VoidBlock4<GCControllerButtonInput, Float, Boolean, Boolean> getTouchedChangedHandler();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setTouchedChangedHandler:")
    public native void setTouchedChangedHandler(@Block VoidBlock4<GCControllerButtonInput, Float, Boolean, Boolean> v);
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "setValue:")
    public native void setValue(float v);
    @Property(selector = "isPressed")
    public native boolean isPressed();
    @Property(selector = "isTouched")
    public native boolean isTouched();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
