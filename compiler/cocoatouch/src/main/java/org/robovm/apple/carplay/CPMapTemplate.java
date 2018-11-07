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
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMapTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*/implements CPBarButtonProviding/*</implements>*/ {

    /*<ptr>*/public static class CPMapTemplatePtr extends Ptr<CPMapTemplate, CPMapTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMapTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPMapTemplate() {}
    protected CPMapTemplate(Handle h, long handle) { super(h, handle); }
    protected CPMapTemplate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "guidanceBackgroundColor")
    public native UIColor getGuidanceBackgroundColor();
    @Property(selector = "setGuidanceBackgroundColor:")
    public native void setGuidanceBackgroundColor(UIColor v);
    @Property(selector = "tripEstimateStyle")
    public native CPTripEstimateStyle getTripEstimateStyle();
    @Property(selector = "setTripEstimateStyle:")
    public native void setTripEstimateStyle(CPTripEstimateStyle v);
    @Property(selector = "mapButtons")
    public native NSArray<CPMapButton> getMapButtons();
    @Property(selector = "setMapButtons:")
    public native void setMapButtons(NSArray<CPMapButton> v);
    @Property(selector = "automaticallyHidesNavigationBar")
    public native boolean automaticallyHidesNavigationBar();
    @Property(selector = "setAutomaticallyHidesNavigationBar:")
    public native void setAutomaticallyHidesNavigationBar(boolean v);
    @Property(selector = "hidesButtonsWithNavigationBar")
    public native boolean hidesButtonsWithNavigationBar();
    @Property(selector = "setHidesButtonsWithNavigationBar:")
    public native void setHidesButtonsWithNavigationBar(boolean v);
    @Property(selector = "mapDelegate")
    public native CPMapTemplateDelegate getMapDelegate();
    @Property(selector = "setMapDelegate:", strongRef = true)
    public native void setMapDelegate(CPMapTemplateDelegate v);
    @Property(selector = "isPanningInterfaceVisible")
    public native boolean isPanningInterfaceVisible();
    @Property(selector = "currentNavigationAlert")
    public native CPNavigationAlert getCurrentNavigationAlert();
    @Property(selector = "leadingNavigationBarButtons")
    public native NSArray<CPBarButton> getLeadingNavigationBarButtons();
    @Property(selector = "setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<CPBarButton> v);
    @Property(selector = "trailingNavigationBarButtons")
    public native NSArray<CPBarButton> getTrailingNavigationBarButtons();
    @Property(selector = "setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(NSArray<CPBarButton> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "showTripPreviews:textConfiguration:")
    public native void showTripPreviews(NSArray<CPTrip> tripPreviews, CPTripPreviewTextConfiguration textConfiguration);
    @Method(selector = "showRouteChoicesPreviewForTrip:textConfiguration:")
    public native void showRouteChoicesPreviewForTrip(CPTrip tripPreview, CPTripPreviewTextConfiguration textConfiguration);
    @Method(selector = "hideTripPreviews")
    public native void hideTripPreviews();
    @Method(selector = "updateTravelEstimates:forTrip:")
    public native void updateTravelEstimates(CPTravelEstimates estimates, CPTrip trip);
    @Method(selector = "updateTravelEstimates:forTrip:withTimeRemainingColor:")
    public native void updateTravelEstimates(CPTravelEstimates estimates, CPTrip trip, CPTimeRemainingColor timeRemainingColor);
    @Method(selector = "startNavigationSessionForTrip:")
    public native CPNavigationSession startNavigationSessionForTrip(CPTrip trip);
    @Method(selector = "showPanningInterfaceAnimated:")
    public native void showPanningInterfaceAnimated(boolean animated);
    @Method(selector = "dismissPanningInterfaceAnimated:")
    public native void dismissPanningInterfaceAnimated(boolean animated);
    @Method(selector = "presentNavigationAlert:animated:")
    public native void presentNavigationAlert(CPNavigationAlert navigationAlert, boolean animated);
    @Method(selector = "dismissNavigationAlertAnimated:completion:")
    public native void dismissNavigationAlertAnimated(boolean animated, @Block VoidBooleanBlock completion);
    /*</methods>*/
}
