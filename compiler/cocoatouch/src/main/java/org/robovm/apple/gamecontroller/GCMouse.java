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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMouse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GCDevice/*</implements>*/ {

    /*<ptr>*/public static class GCMousePtr extends Ptr<GCMouse, GCMousePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCMouse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMouse() {}
    protected GCMouse(Handle h, long handle) { super(h, handle); }
    protected GCMouse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mouseInput")
    public native GCMouseInput getMouseInput();
    @Property(selector = "current")
    public static native GCMouse getCurrent();
    @Property(selector = "handlerQueue")
    public native DispatchQueue getHandlerQueue();
    @Property(selector = "setHandlerQueue:")
    public native void setHandlerQueue(DispatchQueue v);
    @Property(selector = "vendorName")
    public native String getVendorName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "productCategory")
    public native String getProductCategory();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use the physicalInputProfile property on GCController instead.  For GCKeyboard, use the keyboardInput property.  For GCMouse, use the mouseInput property.
     */
    @Deprecated
    @Property(selector = "physicalInputProfile")
    public native GCPhysicalInputProfile getPhysicalInputProfile();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("GameController")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCMouseDidConnectNotification", optional=true)
        public static native NSString DidConnect();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCMouseDidDisconnectNotification", optional=true)
        public static native NSString DidDisconnect();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCMouseDidBecomeCurrentNotification", optional=true)
        public static native NSString DidBecomeCurrent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCMouseDidStopBeingCurrentNotification", optional=true)
        public static native NSString DidStopBeingCurrent();
    }
    
    @Method(selector = "mice")
    public static native NSArray<GCMouse> mice();
    /*</methods>*/
}
