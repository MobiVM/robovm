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
package org.robovm.apple.avrouting;

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
import org.robovm.apple.network.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVRouting") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCustomRoutingController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCustomRoutingControllerPtr extends Ptr<AVCustomRoutingController, AVCustomRoutingControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCustomRoutingController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCustomRoutingController() {}
    protected AVCustomRoutingController(Handle h, long handle) { super(h, handle); }
    protected AVCustomRoutingController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "delegate")
    public native AVCustomRoutingControllerDelegate getDelegate();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVCustomRoutingControllerDelegate v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "authorizedRoutes")
    public native NSArray<AVCustomDeviceRoute> getAuthorizedRoutes();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "customActionItems")
    public native NSArray<AVCustomRoutingActionItem> getCustomActionItems();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setCustomActionItems:")
    public native void setCustomActionItems(NSArray<AVCustomRoutingActionItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AVRouting")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVCustomRoutingControllerAuthorizedRoutesDidChangeNotification", optional=true)
        public static native NSString AuthorizedRoutesDidChange();
    }
    
    @Method(selector = "invalidateAuthorizationForRoute:")
    public native void invalidateAuthorizationForRoute(AVCustomDeviceRoute route);
    @Method(selector = "setActive:forRoute:")
    public native void setActive(boolean active, AVCustomDeviceRoute route);
    @Method(selector = "isRouteActive:")
    public native boolean isRouteActive(AVCustomDeviceRoute route);
    /*</methods>*/
}
