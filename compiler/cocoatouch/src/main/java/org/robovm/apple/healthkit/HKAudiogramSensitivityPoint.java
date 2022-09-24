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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKAudiogramSensitivityPoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKAudiogramSensitivityPointPtr extends Ptr<HKAudiogramSensitivityPoint, HKAudiogramSensitivityPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKAudiogramSensitivityPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKAudiogramSensitivityPoint() {}
    protected HKAudiogramSensitivityPoint(Handle h, long handle) { super(h, handle); }
    protected HKAudiogramSensitivityPoint(SkipInit skipInit) { super(skipInit); }
    public HKAudiogramSensitivityPoint(HKQuantity frequency, HKQuantity leftEarSensitivity, HKQuantity rightEarSensitivity, NSError.NSErrorPtr error) { super((Handle) null, create(frequency, leftEarSensitivity, rightEarSensitivity, error)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frequency")
    public native HKQuantity getFrequency();
    @Property(selector = "leftEarSensitivity")
    public native HKQuantity getLeftEarSensitivity();
    @Property(selector = "rightEarSensitivity")
    public native HKQuantity getRightEarSensitivity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sensitivityPointWithFrequency:leftEarSensitivity:rightEarSensitivity:error:")
    protected static native @Pointer long create(HKQuantity frequency, HKQuantity leftEarSensitivity, HKQuantity rightEarSensitivity, NSError.NSErrorPtr error);
    /*</methods>*/
}
