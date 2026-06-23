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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTREnergyEVSEClusterChargingTargetStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTREnergyEVSEClusterChargingTargetStructPtr extends Ptr<MTREnergyEVSEClusterChargingTargetStruct, MTREnergyEVSEClusterChargingTargetStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTREnergyEVSEClusterChargingTargetStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTREnergyEVSEClusterChargingTargetStruct() {}
    protected MTREnergyEVSEClusterChargingTargetStruct(Handle h, long handle) { super(h, handle); }
    protected MTREnergyEVSEClusterChargingTargetStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "targetTimeMinutesPastMidnight")
    public native NSNumber getTargetTimeMinutesPastMidnight();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setTargetTimeMinutesPastMidnight:")
    public native void setTargetTimeMinutesPastMidnight(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "targetSoC")
    public native NSNumber getTargetSoC();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setTargetSoC:")
    public native void setTargetSoC(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "addedEnergy")
    public native NSNumber getAddedEnergy();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setAddedEnergy:")
    public native void setAddedEnergy(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
