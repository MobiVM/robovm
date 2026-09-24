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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceStorageBehaviorConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceStorageBehaviorConfigurationPtr extends Ptr<MTRDeviceStorageBehaviorConfiguration, MTRDeviceStorageBehaviorConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceStorageBehaviorConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDeviceStorageBehaviorConfiguration() {}
    protected MTRDeviceStorageBehaviorConfiguration(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceStorageBehaviorConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "disableStorageBehaviorOptimization")
    public native boolean isDisableStorageBehaviorOptimization();
    @Property(selector = "setDisableStorageBehaviorOptimization:")
    public native void setDisableStorageBehaviorOptimization(boolean v);
    @Property(selector = "reportToPersistenceDelayTime")
    public native double getReportToPersistenceDelayTime();
    @Property(selector = "setReportToPersistenceDelayTime:")
    public native void setReportToPersistenceDelayTime(double v);
    @Property(selector = "reportToPersistenceDelayTimeMax")
    public native double getReportToPersistenceDelayTimeMax();
    @Property(selector = "setReportToPersistenceDelayTimeMax:")
    public native void setReportToPersistenceDelayTimeMax(double v);
    @Property(selector = "recentReportTimesMaxCount")
    public native @MachineSizedUInt long getRecentReportTimesMaxCount();
    @Property(selector = "setRecentReportTimesMaxCount:")
    public native void setRecentReportTimesMaxCount(@MachineSizedUInt long v);
    @Property(selector = "timeBetweenReportsTooShortThreshold")
    public native double getTimeBetweenReportsTooShortThreshold();
    @Property(selector = "setTimeBetweenReportsTooShortThreshold:")
    public native void setTimeBetweenReportsTooShortThreshold(double v);
    @Property(selector = "timeBetweenReportsTooShortMinThreshold")
    public native double getTimeBetweenReportsTooShortMinThreshold();
    @Property(selector = "setTimeBetweenReportsTooShortMinThreshold:")
    public native void setTimeBetweenReportsTooShortMinThreshold(double v);
    @Property(selector = "reportToPersistenceDelayMaxMultiplier")
    public native double getReportToPersistenceDelayMaxMultiplier();
    @Property(selector = "setReportToPersistenceDelayMaxMultiplier:")
    public native void setReportToPersistenceDelayMaxMultiplier(double v);
    @Property(selector = "deviceReportingExcessivelyIntervalThreshold")
    public native double getDeviceReportingExcessivelyIntervalThreshold();
    @Property(selector = "setDeviceReportingExcessivelyIntervalThreshold:")
    public native void setDeviceReportingExcessivelyIntervalThreshold(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithDefaultStorageBehavior")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithDefaultStorageBehavior();
    @Method(selector = "configurationWithStorageBehaviorOptimizationDisabled")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithStorageBehaviorOptimizationDisabled();
    @Method(selector = "configurationWithReportToPersistenceDelayTime:reportToPersistenceDelayTimeMax:recentReportTimesMaxCount:timeBetweenReportsTooShortThreshold:timeBetweenReportsTooShortMinThreshold:reportToPersistenceDelayMaxMultiplier:deviceReportingExcessivelyIntervalThreshold:")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithReport(double reportToPersistenceDelayTime, double reportToPersistenceDelayTimeMax, @MachineSizedUInt long recentReportTimesMaxCount, double timeBetweenReportsTooShortThreshold, double timeBetweenReportsTooShortMinThreshold, double reportToPersistenceDelayMaxMultiplier, double deviceReportingExcessivelyIntervalThreshold);
    /*</methods>*/
}
