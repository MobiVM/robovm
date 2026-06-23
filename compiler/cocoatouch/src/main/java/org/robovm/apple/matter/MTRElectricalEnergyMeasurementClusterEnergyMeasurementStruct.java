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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRElectricalEnergyMeasurementClusterEnergyMeasurementStructPtr extends Ptr<MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct, MTRElectricalEnergyMeasurementClusterEnergyMeasurementStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct() {}
    protected MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct(Handle h, long handle) { super(h, handle); }
    protected MTRElectricalEnergyMeasurementClusterEnergyMeasurementStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "energy")
    public native NSNumber getEnergy();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setEnergy:")
    public native void setEnergy(NSNumber v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "startTimestamp")
    public native NSNumber getStartTimestamp();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setStartTimestamp:")
    public native void setStartTimestamp(NSNumber v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "endTimestamp")
    public native NSNumber getEndTimestamp();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setEndTimestamp:")
    public native void setEndTimestamp(NSNumber v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "startSystime")
    public native NSNumber getStartSystime();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setStartSystime:")
    public native void setStartSystime(NSNumber v);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "endSystime")
    public native NSNumber getEndSystime();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "setEndSystime:")
    public native void setEndSystime(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
