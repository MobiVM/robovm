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
package org.robovm.apple.coremotion;

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

/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMOdometerData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CMOdometerDataPtr extends Ptr<CMOdometerData, CMOdometerDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMOdometerData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMOdometerData() {}
    protected CMOdometerData(Handle h, long handle) { super(h, handle); }
    protected CMOdometerData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CMOdometerData(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "deltaDistance")
    public native double getDeltaDistance();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "deltaDistanceAccuracy")
    public native double getDeltaDistanceAccuracy();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "speed")
    public native double getSpeed();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "speedAccuracy")
    public native double getSpeedAccuracy();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "gpsDate")
    public native NSDate getGpsDate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "deltaAltitude")
    public native double getDeltaAltitude();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "verticalAccuracy")
    public native double getVerticalAccuracy();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "originDevice")
    public native CMOdometerOriginDevice getOriginDevice();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "slope")
    public native NSNumber getSlope();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "maxAbsSlope")
    public native NSNumber getMaxAbsSlope();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
