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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMapTemplateDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CPMapTemplateDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("mapTemplate:shouldShowNotificationForManeuver:")
    public boolean shouldShowNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver) { return false; }
    @NotImplemented("mapTemplate:shouldUpdateNotificationForManeuver:withTravelEstimates:")
    public boolean shouldUpdateNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver, CPTravelEstimates travelEstimates) { return false; }
    @NotImplemented("mapTemplate:shouldShowNotificationForNavigationAlert:")
    public boolean shouldShowNotificationForNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) { return false; }
    @NotImplemented("mapTemplateDidShowPanningInterface:")
    public void mapTemplateDidShowPanningInterface(CPMapTemplate mapTemplate) {}
    @NotImplemented("mapTemplateWillDismissPanningInterface:")
    public void mapTemplateWillDismissPanningInterface(CPMapTemplate mapTemplate) {}
    @NotImplemented("mapTemplateDidDismissPanningInterface:")
    public void mapTemplateDidDismissPanningInterface(CPMapTemplate mapTemplate) {}
    @NotImplemented("mapTemplate:panBeganWithDirection:")
    public void panBegan(CPMapTemplate mapTemplate, CPPanDirection direction) {}
    @NotImplemented("mapTemplate:panEndedWithDirection:")
    public void panEnded(CPMapTemplate mapTemplate, CPPanDirection direction) {}
    @NotImplemented("mapTemplate:panWithDirection:")
    public void pan(CPMapTemplate mapTemplate, CPPanDirection direction) {}
    @NotImplemented("mapTemplateDidBeginPanGesture:")
    public void mapTemplateDidBeginPanGesture(CPMapTemplate mapTemplate) {}
    @NotImplemented("mapTemplate:didUpdatePanGestureWithTranslation:velocity:")
    public void didUpdatePanGesture(CPMapTemplate mapTemplate, @ByVal CGPoint translation, @ByVal CGPoint velocity) {}
    @NotImplemented("mapTemplate:didEndPanGestureWithVelocity:")
    public void didEndPanGesture(CPMapTemplate mapTemplate, @ByVal CGPoint velocity) {}
    @NotImplemented("mapTemplate:willShowNavigationAlert:")
    public void willShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {}
    @NotImplemented("mapTemplate:didShowNavigationAlert:")
    public void didShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert) {}
    @NotImplemented("mapTemplate:willDismissNavigationAlert:dismissalContext:")
    public void willDismissNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert, CPNavigationAlertDismissalContext dismissalContext) {}
    @NotImplemented("mapTemplate:didDismissNavigationAlert:dismissalContext:")
    public void didDismissNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert, CPNavigationAlertDismissalContext dismissalContext) {}
    @NotImplemented("mapTemplate:selectedPreviewForTrip:usingRouteChoice:")
    public void selectedPreviewForTrip(CPMapTemplate mapTemplate, CPTrip trip, CPRouteChoice routeChoice) {}
    @NotImplemented("mapTemplate:startedTrip:usingRouteChoice:")
    public void startedTrip(CPMapTemplate mapTemplate, CPTrip trip, CPRouteChoice routeChoice) {}
    @NotImplemented("mapTemplateDidCancelNavigation:")
    public void mapTemplateDidCancelNavigation(CPMapTemplate mapTemplate) {}
    @NotImplemented("mapTemplate:displayStyleForManeuver:")
    public CPManeuverDisplayStyle displayStyle(CPMapTemplate mapTemplate, CPManeuver maneuver) { return null; }
    /*</methods>*/
}
