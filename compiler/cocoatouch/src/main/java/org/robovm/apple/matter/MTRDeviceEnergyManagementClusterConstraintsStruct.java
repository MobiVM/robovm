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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceEnergyManagementClusterConstraintsStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceEnergyManagementClusterConstraintsStructPtr extends Ptr<MTRDeviceEnergyManagementClusterConstraintsStruct, MTRDeviceEnergyManagementClusterConstraintsStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceEnergyManagementClusterConstraintsStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDeviceEnergyManagementClusterConstraintsStruct() {}
    protected MTRDeviceEnergyManagementClusterConstraintsStruct(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceEnergyManagementClusterConstraintsStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
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
    @Property(selector = "duration")
    public native NSNumber getDuration();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setDuration:")
    public native void setDuration(NSNumber v);
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
    @Property(selector = "maximumEnergy")
    public native NSNumber getMaximumEnergy();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setMaximumEnergy:")
    public native void setMaximumEnergy(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "loadControl")
    public native NSNumber getLoadControl();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setLoadControl:")
    public native void setLoadControl(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
