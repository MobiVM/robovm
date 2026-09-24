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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CPMapTemplateDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Method(selector = "mapTemplateShouldProvideNavigationMetadata:")
    boolean mapTemplateShouldProvideNavigationMetadata(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplate:shouldShowNotificationForManeuver:")
    boolean shouldShowNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver);
    @Method(selector = "mapTemplate:shouldUpdateNotificationForManeuver:withTravelEstimates:")
    boolean shouldUpdateNotificationForManeuver(CPMapTemplate mapTemplate, CPManeuver maneuver, CPTravelEstimates travelEstimates);
    @Method(selector = "mapTemplate:shouldShowNotificationForNavigationAlert:")
    boolean shouldShowNotificationForNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert);
    @Method(selector = "mapTemplateDidShowPanningInterface:")
    void mapTemplateDidShowPanningInterface(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplateWillDismissPanningInterface:")
    void mapTemplateWillDismissPanningInterface(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplateDidDismissPanningInterface:")
    void mapTemplateDidDismissPanningInterface(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplate:panBeganWithDirection:")
    void panBegan(CPMapTemplate mapTemplate, CPPanDirection direction);
    @Method(selector = "mapTemplate:panEndedWithDirection:")
    void panEnded(CPMapTemplate mapTemplate, CPPanDirection direction);
    @Method(selector = "mapTemplate:panWithDirection:")
    void pan(CPMapTemplate mapTemplate, CPPanDirection direction);
    @Method(selector = "mapTemplateDidBeginPanGesture:")
    void mapTemplateDidBeginPanGesture(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplate:didUpdatePanGestureWithTranslation:velocity:")
    void didUpdatePanGesture(CPMapTemplate mapTemplate, @ByVal CGPoint translation, @ByVal CGPoint velocity);
    @Method(selector = "mapTemplate:didEndPanGestureWithVelocity:")
    void didEndPanGesture(CPMapTemplate mapTemplate, @ByVal CGPoint velocity);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplateDidBeginZoomGesture:")
    void mapTemplateDidBeginZoomGesture(CPMapTemplate mapTemplate);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:didUpdateZoomGestureWithCenter:scale:velocity:")
    void didUpdateZoomGesture(CPMapTemplate mapTemplate, @ByVal CGPoint center, @MachineSizedFloat double scale, @MachineSizedFloat double velocity);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:didEndZoomGestureWithVelocity:")
    void didEndZoomGesture(CPMapTemplate mapTemplate, @MachineSizedFloat double velocity);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplateDidBeginRotationGesture:")
    void mapTemplateDidBeginRotationGesture(CPMapTemplate mapTemplate);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:didRotateWithCenter:rotation:velocity:")
    void didRotate(CPMapTemplate mapTemplate, @ByVal CGPoint center, @MachineSizedFloat double rotation, @MachineSizedFloat double velocity);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:rotationDidEndWithVelocity:")
    void rotationDidEnd(CPMapTemplate mapTemplate, @MachineSizedFloat double velocity);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplateDidBeginPitchGesture:")
    void mapTemplateDidBeginPitchGesture(CPMapTemplate mapTemplate);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:pitchWithCenter:")
    void pitch(CPMapTemplate mapTemplate, @ByVal CGPoint center);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "mapTemplate:pitchEndedWithCenter:")
    void pitchEndedWith(CPMapTemplate mapTemplate, @ByVal CGPoint center);
    @Method(selector = "mapTemplate:willShowNavigationAlert:")
    void willShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert);
    @Method(selector = "mapTemplate:didShowNavigationAlert:")
    void didShowNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert);
    @Method(selector = "mapTemplate:willDismissNavigationAlert:dismissalContext:")
    void willDismissNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert, CPNavigationAlertDismissalContext dismissalContext);
    @Method(selector = "mapTemplate:didDismissNavigationAlert:dismissalContext:")
    void didDismissNavigationAlert(CPMapTemplate mapTemplate, CPNavigationAlert navigationAlert, CPNavigationAlertDismissalContext dismissalContext);
    @Method(selector = "mapTemplate:selectedPreviewForTrip:usingRouteChoice:")
    void selectedPreviewForTrip(CPMapTemplate mapTemplate, CPTrip trip, CPRouteChoice routeChoice);
    @Method(selector = "mapTemplate:startedTrip:usingRouteChoice:")
    void startedTrip(CPMapTemplate mapTemplate, CPTrip trip, CPRouteChoice routeChoice);
    @Method(selector = "mapTemplateDidCancelNavigation:")
    void mapTemplateDidCancelNavigation(CPMapTemplate mapTemplate);
    @Method(selector = "mapTemplate:displayStyleForManeuver:")
    CPManeuverDisplayStyle displayStyle(CPMapTemplate mapTemplate, CPManeuver maneuver);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
