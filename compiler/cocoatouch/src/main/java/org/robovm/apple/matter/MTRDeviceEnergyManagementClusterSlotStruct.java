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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceEnergyManagementClusterSlotStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceEnergyManagementClusterSlotStructPtr extends Ptr<MTRDeviceEnergyManagementClusterSlotStruct, MTRDeviceEnergyManagementClusterSlotStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceEnergyManagementClusterSlotStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDeviceEnergyManagementClusterSlotStruct() {}
    protected MTRDeviceEnergyManagementClusterSlotStruct(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceEnergyManagementClusterSlotStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "minDuration")
    public native NSNumber getMinDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMinDuration:")
    public native void setMinDuration(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "maxDuration")
    public native NSNumber getMaxDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaxDuration:")
    public native void setMaxDuration(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "defaultDuration")
    public native NSNumber getDefaultDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setDefaultDuration:")
    public native void setDefaultDuration(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "elapsedSlotTime")
    public native NSNumber getElapsedSlotTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setElapsedSlotTime:")
    public native void setElapsedSlotTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "remainingSlotTime")
    public native NSNumber getRemainingSlotTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setRemainingSlotTime:")
    public native void setRemainingSlotTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "slotIsPausable")
    public native NSNumber getSlotIsPausable();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSlotIsPausable:")
    public native void setSlotIsPausable(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "minPauseDuration")
    public native NSNumber getMinPauseDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMinPauseDuration:")
    public native void setMinPauseDuration(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "maxPauseDuration")
    public native NSNumber getMaxPauseDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaxPauseDuration:")
    public native void setMaxPauseDuration(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "manufacturerESAState")
    public native NSNumber getManufacturerESAState();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setManufacturerESAState:")
    public native void setManufacturerESAState(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "nominalPower")
    public native NSNumber getNominalPower();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setNominalPower:")
    public native void setNominalPower(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "minPower")
    public native NSNumber getMinPower();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMinPower:")
    public native void setMinPower(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "maxPower")
    public native NSNumber getMaxPower();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaxPower:")
    public native void setMaxPower(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "nominalEnergy")
    public native NSNumber getNominalEnergy();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setNominalEnergy:")
    public native void setNominalEnergy(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "costs")
    public native NSArray<?> getCosts();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setCosts:")
    public native void setCosts(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "minPowerAdjustment")
    public native NSNumber getMinPowerAdjustment();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMinPowerAdjustment:")
    public native void setMinPowerAdjustment(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "maxPowerAdjustment")
    public native NSNumber getMaxPowerAdjustment();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaxPowerAdjustment:")
    public native void setMaxPowerAdjustment(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "minDurationAdjustment")
    public native NSNumber getMinDurationAdjustment();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMinDurationAdjustment:")
    public native void setMinDurationAdjustment(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "maxDurationAdjustment")
    public native NSNumber getMaxDurationAdjustment();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaxDurationAdjustment:")
    public native void setMaxDurationAdjustment(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
