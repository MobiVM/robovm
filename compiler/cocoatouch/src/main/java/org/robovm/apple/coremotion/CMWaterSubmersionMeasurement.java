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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMWaterSubmersionMeasurement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CMWaterSubmersionMeasurementPtr extends Ptr<CMWaterSubmersionMeasurement, CMWaterSubmersionMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMWaterSubmersionMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMWaterSubmersionMeasurement() {}
    protected CMWaterSubmersionMeasurement(Handle h, long handle) { super(h, handle); }
    protected CMWaterSubmersionMeasurement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CMWaterSubmersionMeasurement(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "depth")
    public native NSMeasurement<NSUnitLength> getDepth();
    @Property(selector = "pressure")
    public native NSMeasurement<NSUnitPressure> getPressure();
    @Property(selector = "surfacePressure")
    public native NSMeasurement<NSUnitPressure> getSurfacePressure();
    @Property(selector = "submersionState")
    public native CMWaterSubmersionDepthState getSubmersionState();
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
