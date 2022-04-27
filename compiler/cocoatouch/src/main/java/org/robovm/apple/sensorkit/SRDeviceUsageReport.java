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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRDeviceUsageReport/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SRDeviceUsageReportPtr extends Ptr<SRDeviceUsageReport, SRDeviceUsageReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SRDeviceUsageReport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SRDeviceUsageReport() {}
    protected SRDeviceUsageReport(Handle h, long handle) { super(h, handle); }
    protected SRDeviceUsageReport(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "applicationUsageByCategory")
    public native NSDictionary<?, ?> getApplicationUsageByCategory();
    @Property(selector = "notificationUsageByCategory")
    public native NSDictionary<?, ?> getNotificationUsageByCategory();
    @Property(selector = "webUsageByCategory")
    public native NSDictionary<?, ?> getWebUsageByCategory();
    @Property(selector = "totalScreenWakes")
    public native @MachineSizedSInt long getTotalScreenWakes();
    @Property(selector = "totalUnlocks")
    public native @MachineSizedSInt long getTotalUnlocks();
    @Property(selector = "totalUnlockDuration")
    public native double getTotalUnlockDuration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
