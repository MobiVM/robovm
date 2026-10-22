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
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMapPanelItem/*</name>*/ 
    extends /*<extends>*/CPPanelItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPMapPanelItemPtr extends Ptr<CPMapPanelItem, CPMapPanelItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMapPanelItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPMapPanelItem() {}
    protected CPMapPanelItem(Handle h, long handle) { super(h, handle); }
    protected CPMapPanelItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTrip:handler:")
    public CPMapPanelItem(CPTrip trip, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(trip, handler)); }
    @Method(selector = "initWithTravelEstimates:handler:")
    public CPMapPanelItem(CPTravelEstimates travelEstimates, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(travelEstimates, handler)); }
    @Method(selector = "initWithRouteChoice:handler:")
    public CPMapPanelItem(CPRouteChoice routeChoice, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(routeChoice, handler)); }
    @Method(selector = "initWithRouteDetails:handler:")
    public CPMapPanelItem(NSArray<CPRouteDetail> routeDetails, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(routeDetails, handler)); }
    @Method(selector = "initWithChargingStationConnection:handler:")
    public CPMapPanelItem(CPChargingStationConnection chargingStationConnection, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(chargingStationConnection, handler)); }
    @Method(selector = "initWithMapTemplateWaypoint:image:handler:")
    public CPMapPanelItem(CPMapTemplateWaypoint mapTemplateWaypoint, UIImage image, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler) { super((SkipInit) null); initObject(init(mapTemplateWaypoint, image, handler)); }
    @Method(selector = "initWithListItem:")
    public CPMapPanelItem(CPListItem listItem) { super(listItem); }
    @Method(selector = "initWithGridButtons:")
    public CPMapPanelItem(NSArray<CPGridButton> gridButtons) { super(gridButtons); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTrip:handler:")
    protected native @Pointer long init(CPTrip trip, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    @Method(selector = "initWithTravelEstimates:handler:")
    protected native @Pointer long init(CPTravelEstimates travelEstimates, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    @Method(selector = "initWithRouteChoice:handler:")
    protected native @Pointer long init(CPRouteChoice routeChoice, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    @Method(selector = "initWithRouteDetails:handler:")
    protected native @Pointer long init(NSArray<CPRouteDetail> routeDetails, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    @Method(selector = "initWithChargingStationConnection:handler:")
    protected native @Pointer long init(CPChargingStationConnection chargingStationConnection, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    @Method(selector = "initWithMapTemplateWaypoint:image:handler:")
    protected native @Pointer long init(CPMapTemplateWaypoint mapTemplateWaypoint, UIImage image, @Block("(,@Block)") VoidBlock2<CPMapPanelItem, Runnable> handler);
    /*</methods>*/
}
