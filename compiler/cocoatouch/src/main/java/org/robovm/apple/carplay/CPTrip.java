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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPTrip/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPTripPtr extends Ptr<CPTrip, CPTripPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPTrip.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPTrip() {}
    protected CPTrip(Handle h, long handle) { super(h, handle); }
    protected CPTrip(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithOriginWaypoint:destinationWaypoint:routeChoices:")
    public CPTrip(CPNavigationWaypoint origin, CPNavigationWaypoint destination, NSArray<CPRouteChoice> routeChoices) { super((SkipInit) null); initObject(init(origin, destination, routeChoices)); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 26.4. Use initWithOriginWaypoint:destinationWaypoint:routeChoices:
     */
    @Deprecated
    @Method(selector = "initWithOrigin:destination:routeChoices:")
    public CPTrip(MKMapItem origin, MKMapItem destination, NSArray<CPRouteChoice> routeChoices) { super((SkipInit) null); initObject(init(origin, destination, routeChoices)); }
    @Method(selector = "initWithCoder:")
    public CPTrip(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 26.4. Use originWaypoint
     */
    @Deprecated
    @Property(selector = "origin")
    public native MKMapItem getOrigin();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 26.4. Use destinationWaypoint
     */
    @Deprecated
    @Property(selector = "destination")
    public native MKMapItem getDestination();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "originWaypoint")
    public native CPNavigationWaypoint getOriginWaypoint();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "destinationWaypoint")
    public native CPNavigationWaypoint getDestinationWaypoint();
    @Property(selector = "routeChoices")
    public native NSArray<CPRouteChoice> getRouteChoices();
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use destinationWaypoint.nameVariants
     */
    @Deprecated
    @Property(selector = "destinationNameVariants")
    public native NSArray<NSString> getDestinationNameVariants();
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 27.0. Use destinationWaypoint.nameVariants
     */
    @Deprecated
    @Property(selector = "setDestinationNameVariants:")
    public native void setDestinationNameVariants(NSArray<NSString> v);
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Property(selector = "hasShareableDestination")
    public native boolean hasShareableDestination();
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Property(selector = "setHasShareableDestination:")
    public native void setHasShareableDestination(boolean v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "routeSegmentsAvailableForRegion")
    public native boolean isRouteSegmentsAvailableForRegion();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setRouteSegmentsAvailableForRegion:")
    public native void setRouteSegmentsAvailableForRegion(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithOriginWaypoint:destinationWaypoint:routeChoices:")
    protected native @Pointer long init(CPNavigationWaypoint origin, CPNavigationWaypoint destination, NSArray<CPRouteChoice> routeChoices);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 26.4. Use initWithOriginWaypoint:destinationWaypoint:routeChoices:
     */
    @Deprecated
    @Method(selector = "initWithOrigin:destination:routeChoices:")
    protected native @Pointer long init(MKMapItem origin, MKMapItem destination, NSArray<CPRouteChoice> routeChoices);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
