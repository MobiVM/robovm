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
package org.robovm.apple.exposurenotification;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ExposureNotification") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ENExposureConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ENExposureConfigurationPtr extends Ptr<ENExposureConfiguration, ENExposureConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ENExposureConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ENExposureConfiguration() {}
    protected ENExposureConfiguration(Handle h, long handle) { super(h, handle); }
    protected ENExposureConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "immediateDurationWeight")
    public native double getImmediateDurationWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setImmediateDurationWeight:")
    public native void setImmediateDurationWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "nearDurationWeight")
    public native double getNearDurationWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setNearDurationWeight:")
    public native void setNearDurationWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "mediumDurationWeight")
    public native double getMediumDurationWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setMediumDurationWeight:")
    public native void setMediumDurationWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "otherDurationWeight")
    public native double getOtherDurationWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setOtherDurationWeight:")
    public native void setOtherDurationWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "infectiousnessForDaysSinceOnsetOfSymptoms")
    public native NSDictionary<NSNumber, NSNumber> getInfectiousnessForDaysSinceOnsetOfSymptoms();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setInfectiousnessForDaysSinceOnsetOfSymptoms:")
    public native void setInfectiousnessForDaysSinceOnsetOfSymptoms(NSDictionary<NSNumber, NSNumber> v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "infectiousnessStandardWeight")
    public native double getInfectiousnessStandardWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setInfectiousnessStandardWeight:")
    public native void setInfectiousnessStandardWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "infectiousnessHighWeight")
    public native double getInfectiousnessHighWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setInfectiousnessHighWeight:")
    public native void setInfectiousnessHighWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "reportTypeConfirmedTestWeight")
    public native double getReportTypeConfirmedTestWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setReportTypeConfirmedTestWeight:")
    public native void setReportTypeConfirmedTestWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "reportTypeConfirmedClinicalDiagnosisWeight")
    public native double getReportTypeConfirmedClinicalDiagnosisWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setReportTypeConfirmedClinicalDiagnosisWeight:")
    public native void setReportTypeConfirmedClinicalDiagnosisWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "reportTypeSelfReportedWeight")
    public native double getReportTypeSelfReportedWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setReportTypeSelfReportedWeight:")
    public native void setReportTypeSelfReportedWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "reportTypeRecursiveWeight")
    public native double getReportTypeRecursiveWeight();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setReportTypeRecursiveWeight:")
    public native void setReportTypeRecursiveWeight(double v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "reportTypeNoneMap")
    public native ENDiagnosisReportType getReportTypeNoneMap();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setReportTypeNoneMap:")
    public native void setReportTypeNoneMap(ENDiagnosisReportType v);
    @Property(selector = "attenuationDurationThresholds")
    public native NSArray<NSNumber> getAttenuationDurationThresholds();
    @Property(selector = "setAttenuationDurationThresholds:")
    public native void setAttenuationDurationThresholds(NSArray<NSNumber> v);
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "daysSinceLastExposureThreshold")
    public native @MachineSizedSInt long getDaysSinceLastExposureThreshold();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "setDaysSinceLastExposureThreshold:")
    public native void setDaysSinceLastExposureThreshold(@MachineSizedSInt long v);
    @Property(selector = "minimumRiskScoreFullRange")
    public native double getMinimumRiskScoreFullRange();
    @Property(selector = "setMinimumRiskScoreFullRange:")
    public native void setMinimumRiskScoreFullRange(double v);
    @Property(selector = "attenuationLevelValues")
    public native NSArray<NSNumber> getAttenuationLevelValues();
    @Property(selector = "setAttenuationLevelValues:")
    public native void setAttenuationLevelValues(NSArray<NSNumber> v);
    @Property(selector = "attenuationWeight")
    public native double getAttenuationWeight();
    @Property(selector = "setAttenuationWeight:")
    public native void setAttenuationWeight(double v);
    @Property(selector = "daysSinceLastExposureLevelValues")
    public native NSArray<NSNumber> getDaysSinceLastExposureLevelValues();
    @Property(selector = "setDaysSinceLastExposureLevelValues:")
    public native void setDaysSinceLastExposureLevelValues(NSArray<NSNumber> v);
    @Property(selector = "daysSinceLastExposureWeight")
    public native double getDaysSinceLastExposureWeight();
    @Property(selector = "setDaysSinceLastExposureWeight:")
    public native void setDaysSinceLastExposureWeight(double v);
    @Property(selector = "durationLevelValues")
    public native NSArray<NSNumber> getDurationLevelValues();
    @Property(selector = "setDurationLevelValues:")
    public native void setDurationLevelValues(NSArray<NSNumber> v);
    @Property(selector = "durationWeight")
    public native double getDurationWeight();
    @Property(selector = "setDurationWeight:")
    public native void setDurationWeight(double v);
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSDictionary<?, ?> v);
    @Property(selector = "minimumRiskScore")
    public native ENRiskScore getMinimumRiskScore();
    @Property(selector = "setMinimumRiskScore:")
    public native void setMinimumRiskScore(ENRiskScore v);
    @Property(selector = "transmissionRiskLevelValues")
    public native NSArray<NSNumber> getTransmissionRiskLevelValues();
    @Property(selector = "setTransmissionRiskLevelValues:")
    public native void setTransmissionRiskLevelValues(NSArray<NSNumber> v);
    @Property(selector = "transmissionRiskWeight")
    public native double getTransmissionRiskWeight();
    @Property(selector = "setTransmissionRiskWeight:")
    public native void setTransmissionRiskWeight(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
