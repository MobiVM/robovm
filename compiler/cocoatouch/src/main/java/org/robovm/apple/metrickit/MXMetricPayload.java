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
package org.robovm.apple.metrickit;

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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXMetricPayload/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MXMetricPayloadPtr extends Ptr<MXMetricPayload, MXMetricPayloadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXMetricPayload.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXMetricPayload() {}
    protected MXMetricPayload(Handle h, long handle) { super(h, handle); }
    protected MXMetricPayload(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MXMetricPayload(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "latestApplicationVersion")
    public native String getLatestApplicationVersion();
    @Property(selector = "includesMultipleApplicationVersions")
    public native boolean includesMultipleApplicationVersions();
    @Property(selector = "timeStampBegin")
    public native NSDate getTimeStampBegin();
    @Property(selector = "timeStampEnd")
    public native NSDate getTimeStampEnd();
    @Property(selector = "cpuMetrics")
    public native MXCPUMetric getCpuMetrics();
    @Property(selector = "gpuMetrics")
    public native MXGPUMetric getGpuMetrics();
    @Property(selector = "cellularConditionMetrics")
    public native MXCellularConditionMetric getCellularConditionMetrics();
    @Property(selector = "applicationTimeMetrics")
    public native MXAppRunTimeMetric getApplicationTimeMetrics();
    @Property(selector = "locationActivityMetrics")
    public native MXLocationActivityMetric getLocationActivityMetrics();
    @Property(selector = "networkTransferMetrics")
    public native MXNetworkTransferMetric getNetworkTransferMetrics();
    @Property(selector = "applicationLaunchMetrics")
    public native MXAppLaunchMetric getApplicationLaunchMetrics();
    @Property(selector = "applicationResponsivenessMetrics")
    public native MXAppResponsivenessMetric getApplicationResponsivenessMetrics();
    @Property(selector = "diskIOMetrics")
    public native MXDiskIOMetric getDiskIOMetrics();
    @Property(selector = "memoryMetrics")
    public native MXMemoryMetric getMemoryMetrics();
    @Property(selector = "displayMetrics")
    public native MXDisplayMetric getDisplayMetrics();
    @Property(selector = "signpostMetrics")
    public native NSArray<MXSignpostMetric> getSignpostMetrics();
    @Property(selector = "metaData")
    public native MXMetaData getMetaData();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "JSONRepresentation")
    public native NSData JSONRepresentation();
    @Method(selector = "DictionaryRepresentation")
    public native NSDictionary<?, ?> DictionaryRepresentation();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
