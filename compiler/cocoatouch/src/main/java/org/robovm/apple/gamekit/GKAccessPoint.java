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
package org.robovm.apple.gamekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKAccessPoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKAccessPointPtr extends Ptr<GKAccessPoint, GKAccessPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKAccessPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKAccessPoint() {}
    protected GKAccessPoint(Handle h, long handle) { super(h, handle); }
    protected GKAccessPoint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native GKAccessPoint getShared();
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "setActive:")
    public native void setActive(boolean v);
    @Property(selector = "isVisible")
    public native boolean isVisible();
    @Property(selector = "isPresentingGameCenter")
    public native boolean isPresentingGameCenter();
    @Property(selector = "showHighlights")
    public native boolean isShowHighlights();
    @Property(selector = "setShowHighlights:")
    public native void setShowHighlights(boolean v);
    @Property(selector = "location")
    public native GKAccessPointLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(GKAccessPointLocation v);
    @Property(selector = "frameInScreenCoordinates")
    public native @ByVal CGRect getFrameInScreenCoordinates();
    @Property(selector = "parentWindow")
    public native UIWindow getParentWindow();
    @Property(selector = "setParentWindow:", strongRef = true)
    public native void setParentWindow(UIWindow v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "triggerAccessPointWithHandler:")
    public native void triggerAccessPoint(@Block Runnable handler);
    @Method(selector = "triggerAccessPointWithState:handler:")
    public native void triggerAccessPoint(GKGameCenterViewControllerState state, @Block Runnable handler);
    /*</methods>*/
}
