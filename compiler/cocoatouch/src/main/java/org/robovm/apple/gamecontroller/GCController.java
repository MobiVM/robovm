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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeDidConnect(final VoidBlock1<GCController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidConnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((GCController) a.getObject());
                }
            });
        }
        public static NSObject observeDidDisconnect(final VoidBlock1<GCController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidDisconnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((GCController) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class GCControllerPtr extends Ptr<GCController, GCControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCController() {}
    protected GCController(Handle h, long handle) { super(h, handle); }
    protected GCController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 13.0. controllerPausedHandler has been deprecated. Use the Menu button found on the controller's profile, if it exists.
     */
    @Deprecated
    @Property(selector = "controllerPausedHandler")
    public native @Block VoidBlock1<GCController> getControllerPausedHandler();
    /**
     * @deprecated Deprecated in iOS 13.0. controllerPausedHandler has been deprecated. Use the Menu button found on the controller's profile, if it exists.
     */
    @Deprecated
    @Property(selector = "setControllerPausedHandler:")
    public native void setControllerPausedHandler(@Block VoidBlock1<GCController> v);
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
    @Property(selector = "isAttachedToDevice")
    public native boolean isAttachedToDevice();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isSnapshot")
    public native boolean isSnapshot();
    @Property(selector = "playerIndex")
    public native GCControllerPlayerIndex getPlayerIndex();
    @Property(selector = "setPlayerIndex:")
    public native void setPlayerIndex(GCControllerPlayerIndex v);
    /**
     * @deprecated Deprecated in iOS 10.0. Use -extendedGamepad
     */
    @Deprecated
    @Property(selector = "gamepad")
    public native GCGamepad getGamepad();
    @Property(selector = "microGamepad")
    public native GCMicroGamepad getMicroGamepad();
    @Property(selector = "extendedGamepad")
    public native GCExtendedGamepad getExtendedGamepad();
    @Property(selector = "motion")
    public native GCMotion getMotion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GCControllerDidConnectNotification", optional=true)
    public static native NSString DidConnectNotification();
    @GlobalValue(symbol="GCControllerDidDisconnectNotification", optional=true)
    public static native NSString DidDisconnectNotification();
    
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "capture")
    public native GCController capture();
    @Method(selector = "controllers")
    public static native NSArray<GCController> getControllers();
    @Method(selector = "startWirelessControllerDiscoveryWithCompletionHandler:")
    public static native void startWirelessControllerDiscovery(@Block Runnable completionHandler);
    @Method(selector = "stopWirelessControllerDiscovery")
    public static native void stopWirelessControllerDiscovery();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "controllerWithMicroGamepad")
    public static native GCController controllerWithMicroGamepad();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "controllerWithExtendedGamepad")
    public static native GCController controllerWithExtendedGamepad();
    /*</methods>*/
}
