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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRentalCar/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRentalCarPtr extends Ptr<INRentalCar, INRentalCarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRentalCar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRentalCar() {}
    protected INRentalCar(Handle h, long handle) { super(h, handle); }
    protected INRentalCar(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRentalCompanyName:type:make:model:rentalCarDescription:")
    public INRentalCar(String rentalCompanyName, String type, String make, String model, String rentalCarDescription) { super((SkipInit) null); initObject(init(rentalCompanyName, type, make, model, rentalCarDescription)); }
    @Method(selector = "initWithCoder:")
    public INRentalCar(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rentalCompanyName")
    public native String getRentalCompanyName();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "make")
    public native String getMake();
    @Property(selector = "model")
    public native String getModel();
    @Property(selector = "rentalCarDescription")
    public native String getRentalCarDescription();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRentalCompanyName:type:make:model:rentalCarDescription:")
    protected native @Pointer long init(String rentalCompanyName, String type, String make, String model, String rentalCarDescription);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
