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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKStateOfMind/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKStateOfMindPtr extends Ptr<HKStateOfMind, HKStateOfMindPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKStateOfMind.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKStateOfMind() {}
    protected HKStateOfMind(Handle h, long handle) { super(h, handle); }
    protected HKStateOfMind(SkipInit skipInit) { super(skipInit); }
    public HKStateOfMind(NSDate date, HKStateOfMindKind kind, double valence, NSArray<NSNumber> labels, NSArray<NSNumber> associations) { super((Handle) null, create(date, kind, valence, labels, associations)); retain(getHandle()); }
    public HKStateOfMind(NSDate date, HKStateOfMindKind kind, double valence, NSArray<NSNumber> labels, NSArray<NSNumber> associations, NSDictionary<NSString, ?> metadata) { super((Handle) null, create(date, kind, valence, labels, associations, metadata)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kind")
    public native HKStateOfMindKind getKind();
    @Property(selector = "valence")
    public native double getValence();
    @Property(selector = "valenceClassification")
    public native HKStateOfMindValenceClassification getValenceClassification();
    @Property(selector = "labels")
    public native NSArray<NSNumber> getLabels();
    @Property(selector = "associations")
    public native NSArray<NSNumber> getAssociations();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="HKDataTypeIdentifierStateOfMind", optional=true)
    public static native String getDataTypeIdentifier();
    
    @Bridge(symbol="HKStateOfMindValenceClassificationForValence", optional=true)
    public static native NSNumber getValenceClassificationForValence(double valence);
    
    @Method(selector = "stateOfMindWithDate:kind:valence:labels:associations:")
    protected static native @Pointer long create(NSDate date, HKStateOfMindKind kind, double valence, NSArray<NSNumber> labels, NSArray<NSNumber> associations);
    @Method(selector = "stateOfMindWithDate:kind:valence:labels:associations:metadata:")
    protected static native @Pointer long create(NSDate date, HKStateOfMindKind kind, double valence, NSArray<NSNumber> labels, NSArray<NSNumber> associations, NSDictionary<NSString, ?> metadata);
    /*</methods>*/
}
