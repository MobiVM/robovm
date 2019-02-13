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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKObjectType/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKObjectTypePtr extends Ptr<HKObjectType, HKObjectTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKObjectType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKObjectType() {}
    protected HKObjectType(Handle h, long handle) { super(h, handle); }
    protected HKObjectType(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKObjectType(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native HKTypeIdentifier getIdentifier();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "quantityTypeForIdentifier:")
    public static native HKQuantityType getQuantityType(HKQuantityTypeIdentifier identifier);
    @Method(selector = "categoryTypeForIdentifier:")
    public static native HKCategoryType getCategoryType(HKCategoryTypeIdentifier identifier);
    @Method(selector = "characteristicTypeForIdentifier:")
    public static native HKCharacteristicType getCharacteristicType(HKCharacteristicTypeIdentifier identifier);
    @Method(selector = "correlationTypeForIdentifier:")
    public static native HKCorrelationType getCorrelationType(HKCorrelationTypeIdentifier identifier);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "documentTypeForIdentifier:")
    public static native HKDocumentType documentTypeForIdentifier(String identifier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "seriesTypeForIdentifier:")
    public static native HKSeriesType seriesTypeForIdentifier(String identifier);
    @Method(selector = "workoutType")
    public static native HKWorkoutType getWorkoutType();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "activitySummaryType")
    public static native HKActivitySummaryType activitySummaryType();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "clinicalTypeForIdentifier:")
    public static native HKClinicalType clinicalTypeForIdentifier(HKClinicalTypeIdentifier identifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
