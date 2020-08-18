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
 * @since Available in iOS 13.5 and later.
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
    @Property(selector = "attenuationDurationThresholds")
    public native NSArray<NSNumber> getAttenuationDurationThresholds();
    @Property(selector = "setAttenuationDurationThresholds:")
    public native void setAttenuationDurationThresholds(NSArray<NSNumber> v);
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
