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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMapTemplateWaypoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPMapTemplateWaypointPtr extends Ptr<CPMapTemplateWaypoint, CPMapTemplateWaypointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMapTemplateWaypoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPMapTemplateWaypoint() {}
    protected CPMapTemplateWaypoint(Handle h, long handle) { super(h, handle); }
    protected CPMapTemplateWaypoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWaypoint:travelEstimates:")
    public CPMapTemplateWaypoint(CPNavigationWaypoint waypoint, CPTravelEstimates travelEstimates) { super((SkipInit) null); initObject(init(waypoint, travelEstimates)); }
    @Method(selector = "initWithCoder:")
    public CPMapTemplateWaypoint(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "waypoint")
    public native CPNavigationWaypoint getWaypoint();
    @Property(selector = "setWaypoint:")
    public native void setWaypoint(CPNavigationWaypoint v);
    @Property(selector = "travelEstimates")
    public native CPTravelEstimates getTravelEstimates();
    @Property(selector = "setTravelEstimates:")
    public native void setTravelEstimates(CPTravelEstimates v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWaypoint:travelEstimates:")
    protected native @Pointer long init(CPNavigationWaypoint waypoint, CPTravelEstimates travelEstimates);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
