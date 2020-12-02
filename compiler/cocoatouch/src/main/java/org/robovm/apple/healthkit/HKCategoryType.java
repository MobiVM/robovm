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

/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCategoryType/*</name>*/ 
    extends /*<extends>*/HKSampleType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKCategoryTypePtr extends Ptr<HKCategoryType, HKCategoryTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKCategoryType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKCategoryType() {}
    protected HKCategoryType(Handle h, long handle) { super(h, handle); }
    protected HKCategoryType(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
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
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "audiogramSampleType")
    public static native HKAudiogramSampleType audiogramSampleType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "electrocardiogramType")
    public static native HKElectrocardiogramType electrocardiogramType();
    /*</methods>*/
}
