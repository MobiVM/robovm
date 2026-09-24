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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPRouteInformation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPRouteInformationPtr extends Ptr<CPRouteInformation, CPRouteInformationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPRouteInformation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPRouteInformation() {}
    protected CPRouteInformation(Handle h, long handle) { super(h, handle); }
    protected CPRouteInformation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManeuvers:laneGuidances:currentManeuvers:currentLaneGuidance:tripTravelEstimates:maneuverTravelEstimates:")
    public CPRouteInformation(NSArray<CPManeuver> maneuvers, NSArray<CPLaneGuidance> laneGuidances, NSArray<CPManeuver> currentManeuvers, CPLaneGuidance currentLaneGuidance, CPTravelEstimates tripTravelEstimates, CPTravelEstimates maneuverTravelEstimates) { super((SkipInit) null); initObject(init(maneuvers, laneGuidances, currentManeuvers, currentLaneGuidance, tripTravelEstimates, maneuverTravelEstimates)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "maneuvers")
    public native NSArray<CPManeuver> getManeuvers();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "laneGuidances")
    public native NSArray<CPLaneGuidance> getLaneGuidances();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "currentManeuvers")
    public native NSArray<CPManeuver> getCurrentManeuvers();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "currentLaneGuidance")
    public native CPLaneGuidance getCurrentLaneGuidance();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "tripTravelEstimates")
    public native CPTravelEstimates getTripTravelEstimates();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "maneuverTravelEstimates")
    public native CPTravelEstimates getManeuverTravelEstimates();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManeuvers:laneGuidances:currentManeuvers:currentLaneGuidance:tripTravelEstimates:maneuverTravelEstimates:")
    protected native @Pointer long init(NSArray<CPManeuver> maneuvers, NSArray<CPLaneGuidance> laneGuidances, NSArray<CPManeuver> currentManeuvers, CPLaneGuidance currentLaneGuidance, CPTravelEstimates tripTravelEstimates, CPTravelEstimates maneuverTravelEstimates);
    /*</methods>*/
}
