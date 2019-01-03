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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKQuantitySeriesSampleBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKQuantitySeriesSampleBuilderPtr extends Ptr<HKQuantitySeriesSampleBuilder, HKQuantitySeriesSampleBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKQuantitySeriesSampleBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKQuantitySeriesSampleBuilder() {}
    protected HKQuantitySeriesSampleBuilder(Handle h, long handle) { super(h, handle); }
    protected HKQuantitySeriesSampleBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHealthStore:quantityType:startDate:device:")
    public HKQuantitySeriesSampleBuilder(HKHealthStore healthStore, HKQuantityType quantityType, NSDate startDate, HKDevice device) { super((SkipInit) null); initObject(init(healthStore, quantityType, startDate, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quantityType")
    public native HKQuantityType getQuantityType();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "device")
    public native HKDevice getDevice();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHealthStore:quantityType:startDate:device:")
    protected native @Pointer long init(HKHealthStore healthStore, HKQuantityType quantityType, NSDate startDate, HKDevice device);
    @Method(selector = "insertQuantity:date:error:")
    public native boolean insertQuantity(HKQuantity quantity, NSDate date, NSError.NSErrorPtr error);
    @Method(selector = "finishSeriesWithMetadata:completion:")
    public native void finishSeries(NSDictionary<NSString, ?> metadata, @Block VoidBlock2<NSArray<HKQuantitySample>, NSError> completion);
    @Method(selector = "discard")
    public native void discard();
    /*</methods>*/
}
