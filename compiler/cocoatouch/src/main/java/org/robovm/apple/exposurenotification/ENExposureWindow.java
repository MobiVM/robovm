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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ENExposureWindow/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ENExposureWindowPtr extends Ptr<ENExposureWindow, ENExposureWindowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ENExposureWindow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ENExposureWindow() {}
    protected ENExposureWindow(Handle h, long handle) { super(h, handle); }
    protected ENExposureWindow(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "calibrationConfidence")
    public native ENCalibrationConfidence getCalibrationConfidence();
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "diagnosisReportType")
    public native ENDiagnosisReportType getDiagnosisReportType();
    @Property(selector = "infectiousness")
    public native ENInfectiousness getInfectiousness();
    @Property(selector = "scanInstances")
    public native NSArray<ENScanInstance> getScanInstances();
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Property(selector = "variantOfConcernType")
    public native ENVariantOfConcernType getVariantOfConcernType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
