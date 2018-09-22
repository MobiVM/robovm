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
package org.robovm.apple.healthkit;

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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutRouteBuilder/*</name>*/ 
    extends /*<extends>*/HKSeriesBuilder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutRouteBuilderPtr extends Ptr<HKWorkoutRouteBuilder, HKWorkoutRouteBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkoutRouteBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKWorkoutRouteBuilder() {}
    protected HKWorkoutRouteBuilder(Handle h, long handle) { super(h, handle); }
    protected HKWorkoutRouteBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHealthStore:device:")
    public HKWorkoutRouteBuilder(HKHealthStore healthStore, HKDevice device) { super((SkipInit) null); initObject(init(healthStore, device)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHealthStore:device:")
    protected native @Pointer long init(HKHealthStore healthStore, HKDevice device);
    @Method(selector = "insertRouteData:completion:")
    public native void insertRouteData(NSArray<org.robovm.apple.corelocation.CLLocation> routeData, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "addMetadata:completion:")
    public native void addMetadata(NSDictionary<NSString, ?> metadata, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "finishRouteWithWorkout:metadata:completion:")
    public native void finishRoute(HKWorkout workout, NSDictionary<NSString, ?> metadata, @Block VoidBlock2<HKWorkoutRoute, NSError> completion);
    /*</methods>*/
}
