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
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPRouteSegment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPRouteSegmentPtr extends Ptr<CPRouteSegment, CPRouteSegmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPRouteSegment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPRouteSegment() {}
    protected CPRouteSegment(Handle h, long handle) { super(h, handle); }
    protected CPRouteSegment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOrigin:destination:maneuvers:laneGuidances:currentManeuvers:currentLaneGuidance:tripTravelEstimates:maneuverTravelEstimates:coordinates:coordinatesCount:")
    public CPRouteSegment(CPNavigationWaypoint origin, CPNavigationWaypoint destination, NSArray<CPManeuver> maneuvers, NSArray<CPLaneGuidance> laneGuidances, NSArray<CPManeuver> currentManeuvers, CPLaneGuidance currentLaneGuidance, CPTravelEstimates tripTravelEstimates, CPTravelEstimates maneuverTravelEstimates, CPLocationCoordinate3D coordinates, @MachineSizedSInt long coordinatesCount) { super((SkipInit) null); initObject(init(origin, destination, maneuvers, laneGuidances, currentManeuvers, currentLaneGuidance, tripTravelEstimates, maneuverTravelEstimates, coordinates, coordinatesCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    @Property(selector = "origin")
    public native CPNavigationWaypoint getOrigin();
    @Property(selector = "destination")
    public native CPNavigationWaypoint getDestination();
    @Property(selector = "coordinates")
    public native CPLocationCoordinate3D getCoordinates();
    @Property(selector = "coordinatesCount")
    public native @MachineSizedSInt long getCoordinatesCount();
    @Property(selector = "maneuvers")
    public native NSArray<CPManeuver> getManeuvers();
    @Property(selector = "laneGuidances")
    public native NSArray<CPLaneGuidance> getLaneGuidances();
    @Property(selector = "currentManeuvers")
    public native NSArray<CPManeuver> getCurrentManeuvers();
    @Property(selector = "currentLaneGuidance")
    public native CPLaneGuidance getCurrentLaneGuidance();
    @Property(selector = "tripTravelEstimates")
    public native CPTravelEstimates getTripTravelEstimates();
    @Property(selector = "maneuverTravelEstimates")
    public native CPTravelEstimates getManeuverTravelEstimates();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOrigin:destination:maneuvers:laneGuidances:currentManeuvers:currentLaneGuidance:tripTravelEstimates:maneuverTravelEstimates:coordinates:coordinatesCount:")
    protected native @Pointer long init(CPNavigationWaypoint origin, CPNavigationWaypoint destination, NSArray<CPManeuver> maneuvers, NSArray<CPLaneGuidance> laneGuidances, NSArray<CPManeuver> currentManeuvers, CPLaneGuidance currentLaneGuidance, CPTravelEstimates tripTravelEstimates, CPTravelEstimates maneuverTravelEstimates, CPLocationCoordinate3D coordinates, @MachineSizedSInt long coordinatesCount);
    /*</methods>*/
}
