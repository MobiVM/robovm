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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKVerifiableClinicalRecord/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKVerifiableClinicalRecordPtr extends Ptr<HKVerifiableClinicalRecord, HKVerifiableClinicalRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKVerifiableClinicalRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKVerifiableClinicalRecord() {}
    protected HKVerifiableClinicalRecord(Handle h, long handle) { super(h, handle); }
    protected HKVerifiableClinicalRecord(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recordTypes")
    public native NSArray<NSString> getRecordTypes();
    @Property(selector = "issuerIdentifier")
    public native String getIssuerIdentifier();
    @Property(selector = "subject")
    public native HKVerifiableClinicalRecordSubject getSubject();
    @Property(selector = "issuedDate")
    public native NSDate getIssuedDate();
    @Property(selector = "relevantDate")
    public native NSDate getRelevantDate();
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "itemNames")
    public native NSArray<NSString> getItemNames();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "sourceType")
    public native HKVerifiableClinicalRecordSourceType getSourceType();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "dataRepresentation")
    public native NSData getDataRepresentation();
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 15.4. Use dataRepresentation
     */
    @Deprecated
    @Property(selector = "JWSRepresentation")
    public native NSData getJWSRepresentation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
