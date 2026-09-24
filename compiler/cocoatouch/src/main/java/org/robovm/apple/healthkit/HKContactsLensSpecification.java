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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKContactsLensSpecification/*</name>*/ 
    extends /*<extends>*/HKLensSpecification/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKContactsLensSpecificationPtr extends Ptr<HKContactsLensSpecification, HKContactsLensSpecificationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKContactsLensSpecification.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKContactsLensSpecification() {}
    protected HKContactsLensSpecification(Handle h, long handle) { super(h, handle); }
    protected HKContactsLensSpecification(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSphere:cylinder:axis:addPower:baseCurve:diameter:")
    public HKContactsLensSpecification(HKQuantity sphere, HKQuantity cylinder, HKQuantity axis, HKQuantity addPower, HKQuantity baseCurve, HKQuantity diameter) { super((SkipInit) null); initObject(init(sphere, cylinder, axis, addPower, baseCurve, diameter)); }
    @Method(selector = "initWithCoder:")
    public HKContactsLensSpecification(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "baseCurve")
    public native HKQuantity getBaseCurve();
    @Property(selector = "diameter")
    public native HKQuantity getDiameter();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSphere:cylinder:axis:addPower:baseCurve:diameter:")
    protected native @Pointer long init(HKQuantity sphere, HKQuantity cylinder, HKQuantity axis, HKQuantity addPower, HKQuantity baseCurve, HKQuantity diameter);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
