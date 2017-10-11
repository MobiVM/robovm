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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCDADocument/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKCDADocumentPtr extends Ptr<HKCDADocument, HKCDADocumentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKCDADocument.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HKCDADocument() {}
    protected HKCDADocument(Handle h, long handle) { super(h, handle); }
    protected HKCDADocument(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "documentData")
    public native NSData getDocumentData();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "patientName")
    public native String getPatientName();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "authorName")
    public native String getAuthorName();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "custodianName")
    public native String getCustodianName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="HKDetailedCDAValidationErrorKey", optional=true)
    public static native String ValidationErrorKey();
    
    
    /*</methods>*/
}
