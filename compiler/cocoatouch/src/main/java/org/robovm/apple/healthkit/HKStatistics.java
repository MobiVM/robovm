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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKStatistics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKStatisticsPtr extends Ptr<HKStatistics, HKStatisticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKStatistics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKStatistics() {}
    protected HKStatistics(Handle h, long handle) { super(h, handle); }
    protected HKStatistics(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKStatistics(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quantityType")
    public native HKQuantityType getQuantityType();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "sources")
    public native NSArray<HKSource> getSources();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "averageQuantityForSource:")
    public native HKQuantity getAverageQuantityForSource(HKSource source);
    @Method(selector = "averageQuantity")
    public native HKQuantity getAverageQuantity();
    @Method(selector = "minimumQuantityForSource:")
    public native HKQuantity getMinimumQuantityForSource(HKSource source);
    @Method(selector = "minimumQuantity")
    public native HKQuantity getMinimumQuantity();
    @Method(selector = "maximumQuantityForSource:")
    public native HKQuantity getMaximumQuantityForSource(HKSource source);
    @Method(selector = "maximumQuantity")
    public native HKQuantity getMaximumQuantity();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "mostRecentQuantityForSource:")
    public native HKQuantity mostRecentQuantityForSource(HKSource source);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "mostRecentQuantity")
    public native HKQuantity mostRecentQuantity();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "mostRecentQuantityDateIntervalForSource:")
    public native NSDateInterval mostRecentQuantityDateIntervalForSource(HKSource source);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "mostRecentQuantityDateInterval")
    public native NSDateInterval mostRecentQuantityDateInterval();
    @Method(selector = "sumQuantityForSource:")
    public native HKQuantity getSumQuantityForSource(HKSource source);
    @Method(selector = "sumQuantity")
    public native HKQuantity getSumQuantity();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
