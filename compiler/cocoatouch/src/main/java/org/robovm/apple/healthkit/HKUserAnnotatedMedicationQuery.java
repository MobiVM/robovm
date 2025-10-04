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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKUserAnnotatedMedicationQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKUserAnnotatedMedicationQueryPtr extends Ptr<HKUserAnnotatedMedicationQuery, HKUserAnnotatedMedicationQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKUserAnnotatedMedicationQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKUserAnnotatedMedicationQuery() {}
    protected HKUserAnnotatedMedicationQuery(Handle h, long handle) { super(h, handle); }
    protected HKUserAnnotatedMedicationQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPredicate:limit:resultsHandler:")
    public HKUserAnnotatedMedicationQuery(NSPredicate predicate, @MachineSizedUInt long limit, @Block VoidBlock4<HKUserAnnotatedMedicationQuery, HKUserAnnotatedMedication, Boolean, NSError> resultsHandler) { super((SkipInit) null); initObject(init(predicate, limit, resultsHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPredicate:limit:resultsHandler:")
    protected native @Pointer long init(NSPredicate predicate, @MachineSizedUInt long limit, @Block VoidBlock4<HKUserAnnotatedMedicationQuery, HKUserAnnotatedMedication, Boolean, NSError> resultsHandler);
    /*</methods>*/
}
