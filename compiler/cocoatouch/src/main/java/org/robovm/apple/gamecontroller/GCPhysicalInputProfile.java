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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCPhysicalInputProfile/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCPhysicalInputProfilePtr extends Ptr<GCPhysicalInputProfile, GCPhysicalInputProfilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCPhysicalInputProfile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCPhysicalInputProfile() {}
    protected GCPhysicalInputProfile(Handle h, long handle) { super(h, handle); }
    protected GCPhysicalInputProfile(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "device")
    public native GCDevice getDevice();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "lastEventTimestamp")
    public native double getLastEventTimestamp();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "elements")
    public native NSDictionary<NSString, GCControllerElement> getElements();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "buttons")
    public native NSDictionary<NSString, GCControllerButtonInput> getButtons();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "axes")
    public native NSDictionary<NSString, GCControllerAxisInput> getAxes();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dpads")
    public native NSDictionary<NSString, GCControllerDirectionPad> getDpads();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allElements")
    public native NSSet<GCControllerElement> getAllElements();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allButtons")
    public native NSSet<GCControllerButtonInput> getAllButtons();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allAxes")
    public native NSSet<GCControllerAxisInput> getAllAxes();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allDpads")
    public native NSSet<GCControllerDirectionPad> getAllDpads();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("GameController")
    public static class Common {
        static { Bro.bind(Common.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonA", optional=true)
        public static native String ButtonA();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonB", optional=true)
        public static native String ButtonB();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonX", optional=true)
        public static native String ButtonX();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonY", optional=true)
        public static native String ButtonY();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputDirectionPad", optional=true)
        public static native String DirectionPad();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputLeftThumbstick", optional=true)
        public static native String LeftThumbstick();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputRightThumbstick", optional=true)
        public static native String RightThumbstick();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputLeftShoulder", optional=true)
        public static native String LeftShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputRightShoulder", optional=true)
        public static native String RightShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputLeftTrigger", optional=true)
        public static native String LeftTrigger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputRightTrigger", optional=true)
        public static native String RightTrigger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputLeftThumbstickButton", optional=true)
        public static native String LeftThumbstickButton();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputRightThumbstickButton", optional=true)
        public static native String RightThumbstickButton();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonHome", optional=true)
        public static native String ButtonHome();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonMenu", optional=true)
        public static native String ButtonMenu();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputButtonOptions", optional=true)
        public static native String ButtonOptions();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="GCInputDirectionalDpad", optional=true)
        public static native String DirectionalDpad();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="GCInputDirectionalCardinalDpad", optional=true)
        public static native String DirectionalCardinalDpad();
    }

    @Library("GameController")
    public static class DualShock {
        static { Bro.bind(DualShock.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputDualShockTouchpadOne", optional=true)
        public static native String TouchpadOne();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputDualShockTouchpadTwo", optional=true)
        public static native String TouchpadTwo();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputDualShockTouchpadButton", optional=true)
        public static native String TouchpadButton();
    }

    @Library("GameController")
    public static class Xbox {
        static { Bro.bind(Xbox.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputXboxPaddleOne", optional=true)
        public static native String PaddleOne();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputXboxPaddleTwo", optional=true)
        public static native String PaddleTwo();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputXboxPaddleThree", optional=true)
        public static native String PaddleThree();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCInputXboxPaddleFour", optional=true)
        public static native String PaddleFour();
    }
    
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "objectForKeyedSubscript:")
    public native GCControllerElement objectForKeyedSubscript(String key);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "capture")
    public native GCPhysicalInputProfile capture();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setStateFromPhysicalInput:")
    public native void setStateFromPhysicalInput(GCPhysicalInputProfile physicalInput);
    /*</methods>*/
}
