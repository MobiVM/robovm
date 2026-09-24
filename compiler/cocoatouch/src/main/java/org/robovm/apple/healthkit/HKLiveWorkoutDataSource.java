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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKLiveWorkoutDataSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKLiveWorkoutDataSourcePtr extends Ptr<HKLiveWorkoutDataSource, HKLiveWorkoutDataSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKLiveWorkoutDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKLiveWorkoutDataSource() {}
    protected HKLiveWorkoutDataSource(Handle h, long handle) { super(h, handle); }
    protected HKLiveWorkoutDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHealthStore:workoutConfiguration:")
    public HKLiveWorkoutDataSource(HKHealthStore healthStore, HKWorkoutConfiguration configuration) { super((SkipInit) null); initObject(init(healthStore, configuration)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "typesToCollect")
    public native NSSet<HKQuantityType> getTypesToCollect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHealthStore:workoutConfiguration:")
    protected native @Pointer long init(HKHealthStore healthStore, HKWorkoutConfiguration configuration);
    @Method(selector = "enableCollectionForType:predicate:")
    public native void enableCollection(HKQuantityType quantityType, NSPredicate predicate);
    @Method(selector = "disableCollectionForType:")
    public native void disableCollectionForType(HKQuantityType quantityType);
    /*</methods>*/
}
