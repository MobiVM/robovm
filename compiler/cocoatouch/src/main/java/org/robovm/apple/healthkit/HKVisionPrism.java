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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKVisionPrism/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKVisionPrismPtr extends Ptr<HKVisionPrism, HKVisionPrismPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKVisionPrism.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKVisionPrism() {}
    protected HKVisionPrism(Handle h, long handle) { super(h, handle); }
    protected HKVisionPrism(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAmount:angle:eye:")
    public HKVisionPrism(HKQuantity amount, HKQuantity angle, HKVisionEye eye) { super((SkipInit) null); initObject(init(amount, angle, eye)); }
    @Method(selector = "initWithVerticalAmount:verticalBase:horizontalAmount:horizontalBase:eye:")
    public HKVisionPrism(HKQuantity verticalAmount, HKPrismBase verticalBase, HKQuantity horizontalAmount, HKPrismBase horizontalBase, HKVisionEye eye) { super((SkipInit) null); initObject(init(verticalAmount, verticalBase, horizontalAmount, horizontalBase, eye)); }
    @Method(selector = "initWithCoder:")
    public HKVisionPrism(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "amount")
    public native HKQuantity getAmount();
    @Property(selector = "angle")
    public native HKQuantity getAngle();
    @Property(selector = "verticalAmount")
    public native HKQuantity getVerticalAmount();
    @Property(selector = "horizontalAmount")
    public native HKQuantity getHorizontalAmount();
    @Property(selector = "verticalBase")
    public native HKPrismBase getVerticalBase();
    @Property(selector = "horizontalBase")
    public native HKPrismBase getHorizontalBase();
    @Property(selector = "eye")
    public native HKVisionEye getEye();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAmount:angle:eye:")
    protected native @Pointer long init(HKQuantity amount, HKQuantity angle, HKVisionEye eye);
    @Method(selector = "initWithVerticalAmount:verticalBase:horizontalAmount:horizontalBase:eye:")
    protected native @Pointer long init(HKQuantity verticalAmount, HKPrismBase verticalBase, HKQuantity horizontalAmount, HKPrismBase horizontalBase, HKVisionEye eye);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
