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
 * @deprecated Deprecated in iOS 13.0. Use HKCumulativeQuantitySample
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCumulativeQuantitySeriesSample/*</name>*/ 
    extends /*<extends>*/HKCumulativeQuantitySample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKCumulativeQuantitySeriesSamplePtr extends Ptr<HKCumulativeQuantitySeriesSample, HKCumulativeQuantitySeriesSamplePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKCumulativeQuantitySeriesSample.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKCumulativeQuantitySeriesSample() {}
    protected HKCumulativeQuantitySeriesSample(Handle h, long handle) { super(h, handle); }
    protected HKCumulativeQuantitySeriesSample(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sum")
    public native HKQuantity getSum();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "quantitySampleWithType:quantity:startDate:endDate:")
    public static native HKCumulativeQuantitySeriesSample create(HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate);
    @Method(selector = "quantitySampleWithType:quantity:startDate:endDate:metadata:")
    public static native HKCumulativeQuantitySeriesSample create(HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate, HKMetadata metadata);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "quantitySampleWithType:quantity:startDate:endDate:device:metadata:")
    public static native HKCumulativeQuantitySeriesSample create(HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate, HKDevice device, HKMetadata metadata);
    /*</methods>*/
}
