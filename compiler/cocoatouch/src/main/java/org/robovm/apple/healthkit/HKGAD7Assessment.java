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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKGAD7Assessment/*</name>*/ 
    extends /*<extends>*/HKScoredAssessment/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKGAD7AssessmentPtr extends Ptr<HKGAD7Assessment, HKGAD7AssessmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKGAD7Assessment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKGAD7Assessment() {}
    protected HKGAD7Assessment(Handle h, long handle) { super(h, handle); }
    protected HKGAD7Assessment(SkipInit skipInit) { super(skipInit); }
    public HKGAD7Assessment(NSDate date, NSArray<NSNumber> answers) { super((Handle) null, create(date, answers)); retain(getHandle()); }
    public HKGAD7Assessment(NSDate date, NSArray<NSNumber> answers, NSDictionary<NSString, ?> metadata) { super((Handle) null, create(date, answers, metadata)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "answers")
    public native NSArray<NSNumber> getAnswers();
    @Property(selector = "risk")
    public native HKGAD7AssessmentRisk getRisk();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "assessmentWithDate:answers:")
    protected static native @Pointer long create(NSDate date, NSArray<NSNumber> answers);
    @Method(selector = "assessmentWithDate:answers:metadata:")
    protected static native @Pointer long create(NSDate date, NSArray<NSNumber> answers, NSDictionary<NSString, ?> metadata);
    /*</methods>*/
}
