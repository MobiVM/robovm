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

/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCorrelation/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKCorrelationPtr extends Ptr<HKCorrelation, HKCorrelationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKCorrelation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKCorrelation() {}
    protected HKCorrelation(Handle h, long handle) { super(h, handle); }
    protected HKCorrelation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "correlationType")
    public native HKCorrelationType getCorrelationType();
    @Property(selector = "objects")
    public native NSSet<HKSample> getObjects();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "objectsForType:")
    public native NSSet<HKSample> getObjectsForType(HKObjectType objectType);
    @Method(selector = "correlationWithType:startDate:endDate:objects:")
    public static native HKCorrelation create(HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<HKSample> objects);
    @Method(selector = "correlationWithType:startDate:endDate:objects:metadata:")
    public static native HKCorrelation create(HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<HKSample> objects, HKMetadata metadata);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "correlationWithType:startDate:endDate:objects:device:metadata:")
    public static native HKCorrelation create(HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<HKSample> objects, HKDevice device, HKMetadata metadata);
    /*</methods>*/
}
