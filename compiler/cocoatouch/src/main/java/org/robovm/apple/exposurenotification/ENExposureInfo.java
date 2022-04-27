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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ENExposureInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ENExposureInfoPtr extends Ptr<ENExposureInfo, ENExposureInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ENExposureInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ENExposureInfo() {}
    protected ENExposureInfo(Handle h, long handle) { super(h, handle); }
    protected ENExposureInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attenuationDurations")
    public native NSArray<NSNumber> getAttenuationDurations();
    @Property(selector = "attenuationValue")
    public native ENAttenuation getAttenuationValue();
    @Property(selector = "date")
    public native NSDate getDate();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "daysSinceOnsetOfSymptoms")
    public native @MachineSizedSInt long getDaysSinceOnsetOfSymptoms();
    /**
     * @since Available in iOS 12.5 and later.
     */
    @Property(selector = "diagnosisReportType")
    public native ENDiagnosisReportType getDiagnosisReportType();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    @Property(selector = "totalRiskScore")
    public native ENRiskScore getTotalRiskScore();
    @Property(selector = "totalRiskScoreFullRange")
    public native double getTotalRiskScoreFullRange();
    @Property(selector = "transmissionRiskLevel")
    public native ENRiskLevel getTransmissionRiskLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
