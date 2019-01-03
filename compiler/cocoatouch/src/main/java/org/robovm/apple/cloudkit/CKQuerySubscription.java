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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKQuerySubscription/*</name>*/ 
    extends /*<extends>*/CKSubscription/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKQuerySubscriptionPtr extends Ptr<CKQuerySubscription, CKQuerySubscriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKQuerySubscription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKQuerySubscription() {}
    protected CKQuerySubscription(Handle h, long handle) { super(h, handle); }
    protected CKQuerySubscription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRecordType:predicate:options:")
    public CKQuerySubscription(String recordType, NSPredicate predicate, CKQuerySubscriptionOptions querySubscriptionOptions) { super((SkipInit) null); initObject(init(recordType, predicate, querySubscriptionOptions)); }
    @Method(selector = "initWithRecordType:predicate:subscriptionID:options:")
    public CKQuerySubscription(String recordType, NSPredicate predicate, String subscriptionID, CKQuerySubscriptionOptions querySubscriptionOptions) { super((SkipInit) null); initObject(init(recordType, predicate, subscriptionID, querySubscriptionOptions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recordType")
    public native String getRecordType();
    @Property(selector = "predicate")
    public native NSPredicate getPredicate();
    @Property(selector = "zoneID")
    public native CKRecordZoneID getZoneID();
    @Property(selector = "setZoneID:")
    public native void setZoneID(CKRecordZoneID v);
    @Property(selector = "querySubscriptionOptions")
    public native CKQuerySubscriptionOptions getQuerySubscriptionOptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRecordType:predicate:options:")
    protected native @Pointer long init(String recordType, NSPredicate predicate, CKQuerySubscriptionOptions querySubscriptionOptions);
    @Method(selector = "initWithRecordType:predicate:subscriptionID:options:")
    protected native @Pointer long init(String recordType, NSPredicate predicate, String subscriptionID, CKQuerySubscriptionOptions querySubscriptionOptions);
    /*</methods>*/
}
