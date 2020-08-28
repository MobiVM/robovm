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
package org.robovm.apple.sensorkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SensorKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRVisit/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SRVisitPtr extends Ptr<SRVisit, SRVisitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SRVisit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SRVisit() {}
    protected SRVisit(Handle h, long handle) { super(h, handle); }
    protected SRVisit(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "distanceFromHome")
    public native double getDistanceFromHome();
    @Property(selector = "arrivalDateInterval")
    public native NSDateInterval getArrivalDateInterval();
    @Property(selector = "departureDateInterval")
    public native NSDateInterval getDepartureDateInterval();
    @Property(selector = "locationCategory")
    public native SRLocationCategory getLocationCategory();
    @Property(selector = "identifier")
    public native NSUUID getIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
