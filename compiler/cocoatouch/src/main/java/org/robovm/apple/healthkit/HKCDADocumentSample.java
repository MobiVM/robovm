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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCDADocumentSample/*</name>*/ 
    extends /*<extends>*/HKDocumentSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKCDADocumentSamplePtr extends Ptr<HKCDADocumentSample, HKCDADocumentSamplePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKCDADocumentSample.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKCDADocumentSample() {}
    protected HKCDADocumentSample(Handle h, long handle) { super(h, handle); }
    protected HKCDADocumentSample(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "document")
    public native HKCDADocument getDocument();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "CDADocumentSampleWithData:startDate:endDate:metadata:validationError:")
    public static native HKCDADocumentSample create(NSData documentData, NSDate startDate, NSDate endDate, HKMetadata metadata, NSError.NSErrorPtr validationError);
    /*</methods>*/
}
