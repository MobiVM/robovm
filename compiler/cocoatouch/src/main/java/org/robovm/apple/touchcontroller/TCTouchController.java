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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCTouchController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCTouchControllerPtr extends Ptr<TCTouchController, TCTouchControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCTouchController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TCTouchController() {}
    protected TCTouchController(Handle h, long handle) { super(h, handle); }
    protected TCTouchController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDescriptor:")
    public TCTouchController(TCTouchControllerDescriptor descriptor) { super((SkipInit) null); initObject(init(descriptor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "controls")
    public native NSArray<?> getControls();
    @Property(selector = "buttons")
    public native NSArray<TCButton> getButtons();
    @Property(selector = "switches")
    public native NSArray<TCSwitch> getSwitches();
    @Property(selector = "thumbsticks")
    public native NSArray<TCThumbstick> getThumbsticks();
    @Property(selector = "directionPads")
    public native NSArray<TCDirectionPad> getDirectionPads();
    @Property(selector = "throttles")
    public native NSArray<TCThrottle> getThrottles();
    @Property(selector = "touchpads")
    public native NSArray<TCTouchpad> getTouchpads();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "drawableSize")
    public native @ByVal CGSize getDrawableSize();
    @Property(selector = "setDrawableSize:")
    public native void setDrawableSize(@ByVal CGSize v);
    @Property(selector = "isConnected")
    public native boolean isConnected();
    @Property(selector = "controller")
    public native GCController getController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    @GlobalValue(symbol="TCGameControllerProductCategoryTouchController", optional=true)
    public static native NSString getGameControllerProductCategory();
    
    @Method(selector = "initWithDescriptor:")
    protected native @Pointer long init(TCTouchControllerDescriptor descriptor);
    @Method(selector = "automaticallyLayoutControlsForLabels:")
    public native void automaticallyLayoutControlsForLabels(NSArray<TCControlLabel> labels);
    @Method(selector = "addButtonWithDescriptor:")
    public native TCButton addButton(TCButtonDescriptor descriptor);
    @Method(selector = "addSwitchWithDescriptor:")
    public native TCSwitch addSwitch(TCSwitchDescriptor descriptor);
    @Method(selector = "addThumbstickWithDescriptor:")
    public native TCThumbstick addThumbstick(TCThumbstickDescriptor descriptor);
    @Method(selector = "addDirectionPadWithDescriptor:")
    public native TCDirectionPad addDirectionPad(TCDirectionPadDescriptor descriptor);
    @Method(selector = "addThrottleWithDescriptor:")
    public native TCThrottle addThrottle(TCThrottleDescriptor descriptor);
    @Method(selector = "addTouchpadWithDescriptor:")
    public native TCTouchpad addTouchpad(TCTouchpadDescriptor descriptor);
    @Method(selector = "removeAllControls")
    public native void removeAllControls();
    @Method(selector = "removeControl:")
    public native void removeControl(TCControl control);
    @Method(selector = "controlAtPoint:")
    public native TCControl controlAtPoint(@ByVal CGPoint point);
    @Method(selector = "handleTouchBeganAtPoint:index:")
    public native boolean handleTouchBegan(@ByVal CGPoint point, @MachineSizedSInt long index);
    @Method(selector = "handleTouchMovedAtPoint:index:")
    public native boolean handleTouchMoved(@ByVal CGPoint point, @MachineSizedSInt long index);
    @Method(selector = "handleTouchEndedAtPoint:index:")
    public native boolean handleTouchEnded(@ByVal CGPoint point, @MachineSizedSInt long index);
    @Method(selector = "renderUsingRenderCommandEncoder:")
    public native void renderUsingRenderCommandEncoder(MTLRenderCommandEncoder encoder);
    @Method(selector = "connect")
    public native void connect();
    @Method(selector = "disconnect")
    public native void disconnect();
    /*</methods>*/
}
