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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ENExposureDaySummary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ENExposureDaySummaryPtr extends Ptr<ENExposureDaySummary, ENExposureDaySummaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ENExposureDaySummary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ENExposureDaySummary() {}
    protected ENExposureDaySummary(Handle h, long handle) { super(h, handle); }
    protected ENExposureDaySummary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "confirmedTestSummary")
    public native ENExposureSummaryItem getConfirmedTestSummary();
    @Property(selector = "confirmedClinicalDiagnosisSummary")
    public native ENExposureSummaryItem getConfirmedClinicalDiagnosisSummary();
    @Property(selector = "recursiveSummary")
    public native ENExposureSummaryItem getRecursiveSummary();
    @Property(selector = "selfReportedSummary")
    public native ENExposureSummaryItem getSelfReportedSummary();
    @Property(selector = "daySummary")
    public native ENExposureSummaryItem getDaySummary();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
