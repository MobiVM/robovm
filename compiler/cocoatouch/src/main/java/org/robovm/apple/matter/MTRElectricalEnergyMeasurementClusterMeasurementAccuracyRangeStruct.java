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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStructPtr extends Ptr<MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct, MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct() {}
    protected MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct(Handle h, long handle) { super(h, handle); }
    protected MTRElectricalEnergyMeasurementClusterMeasurementAccuracyRangeStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "rangeMin")
    public native NSNumber getRangeMin();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setRangeMin:")
    public native void setRangeMin(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "rangeMax")
    public native NSNumber getRangeMax();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setRangeMax:")
    public native void setRangeMax(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "percentMax")
    public native NSNumber getPercentMax();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPercentMax:")
    public native void setPercentMax(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "percentMin")
    public native NSNumber getPercentMin();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPercentMin:")
    public native void setPercentMin(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "percentTypical")
    public native NSNumber getPercentTypical();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPercentTypical:")
    public native void setPercentTypical(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "fixedMax")
    public native NSNumber getFixedMax();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setFixedMax:")
    public native void setFixedMax(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "fixedMin")
    public native NSNumber getFixedMin();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setFixedMin:")
    public native void setFixedMin(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "fixedTypical")
    public native NSNumber getFixedTypical();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setFixedTypical:")
    public native void setFixedTypical(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
