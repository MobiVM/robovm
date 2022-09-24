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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKHeartbeatSeriesBuilder/*</name>*/ 
    extends /*<extends>*/HKSeriesBuilder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKHeartbeatSeriesBuilderPtr extends Ptr<HKHeartbeatSeriesBuilder, HKHeartbeatSeriesBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKHeartbeatSeriesBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKHeartbeatSeriesBuilder() {}
    protected HKHeartbeatSeriesBuilder(Handle h, long handle) { super(h, handle); }
    protected HKHeartbeatSeriesBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHealthStore:device:startDate:")
    public HKHeartbeatSeriesBuilder(HKHealthStore healthStore, HKDevice device, NSDate startDate) { super((SkipInit) null); initObject(init(healthStore, device, startDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maximumCount")
    public static native @MachineSizedUInt long getMaximumCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHealthStore:device:startDate:")
    protected native @Pointer long init(HKHealthStore healthStore, HKDevice device, NSDate startDate);
    @Method(selector = "addHeartbeatWithTimeIntervalSinceSeriesStartDate:precededByGap:completion:")
    public native void addHeartbeat(double timeIntervalSinceStart, boolean precededByGap, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "addMetadata:completion:")
    public native void addMetadata(NSDictionary<NSString, ?> metadata, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "finishSeriesWithCompletion:")
    public native void finishSeries(@Block VoidBlock2<HKHeartbeatSeriesSample, NSError> completion);
    /*</methods>*/
}
