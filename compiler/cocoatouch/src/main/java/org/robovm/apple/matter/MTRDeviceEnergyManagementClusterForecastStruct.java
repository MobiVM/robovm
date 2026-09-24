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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceEnergyManagementClusterForecastStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceEnergyManagementClusterForecastStructPtr extends Ptr<MTRDeviceEnergyManagementClusterForecastStruct, MTRDeviceEnergyManagementClusterForecastStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceEnergyManagementClusterForecastStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDeviceEnergyManagementClusterForecastStruct() {}
    protected MTRDeviceEnergyManagementClusterForecastStruct(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceEnergyManagementClusterForecastStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "forecastID")
    public native NSNumber getForecastID();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setForecastID:")
    public native void setForecastID(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "activeSlotNumber")
    public native NSNumber getActiveSlotNumber();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setActiveSlotNumber:")
    public native void setActiveSlotNumber(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "startTime")
    public native NSNumber getStartTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setStartTime:")
    public native void setStartTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "endTime")
    public native NSNumber getEndTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setEndTime:")
    public native void setEndTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "earliestStartTime")
    public native NSNumber getEarliestStartTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setEarliestStartTime:")
    public native void setEarliestStartTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "latestEndTime")
    public native NSNumber getLatestEndTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setLatestEndTime:")
    public native void setLatestEndTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "isPausable")
    public native NSNumber getIsPausable();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setIsPausable:")
    public native void setIsPausable(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "slots")
    public native NSArray<?> getSlots();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSlots:")
    public native void setSlots(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "forecastUpdateReason")
    public native NSNumber getForecastUpdateReason();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setForecastUpdateReason:")
    public native void setForecastUpdateReason(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
