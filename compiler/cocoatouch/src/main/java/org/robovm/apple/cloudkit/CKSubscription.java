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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSubscription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKSubscriptionPtr extends Ptr<CKSubscription, CKSubscriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSubscription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSubscription() {}
    protected CKSubscription(Handle h, long handle) { super(h, handle); }
    protected CKSubscription(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Init the appropriate CKSubscription subclass
     */
    @Deprecated
    @Method(selector = "initWithCoder:")
    public CKSubscription(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Method(selector = "initWithRecordType:predicate:options:")
    public CKSubscription(String recordType, NSPredicate predicate, CKSubscriptionOptions subscriptionOptions) { super((SkipInit) null); initObject(init(recordType, predicate, subscriptionOptions)); }
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Method(selector = "initWithRecordType:predicate:subscriptionID:options:")
    public CKSubscription(String recordType, NSPredicate predicate, String subscriptionID, CKSubscriptionOptions subscriptionOptions) { super((SkipInit) null); initObject(init(recordType, predicate, subscriptionID, subscriptionOptions)); }
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Method(selector = "initWithZoneID:options:")
    public CKSubscription(CKRecordZoneID zoneID, CKSubscriptionOptions subscriptionOptions) { super((SkipInit) null); initObject(init(zoneID, subscriptionOptions)); }
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Method(selector = "initWithZoneID:subscriptionID:options:")
    public CKSubscription(CKRecordZoneID zoneID, String subscriptionID, CKSubscriptionOptions subscriptionOptions) { super((SkipInit) null); initObject(init(zoneID, subscriptionID, subscriptionOptions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "subscriptionID")
    public native String getSubscriptionID();
    @Property(selector = "subscriptionType")
    public native CKSubscriptionType getSubscriptionType();
    @Property(selector = "notificationInfo")
    public native CKNotificationInfo getNotificationInfo();
    @Property(selector = "setNotificationInfo:")
    public native void setNotificationInfo(CKNotificationInfo v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Property(selector = "recordType")
    public native String getRecordType();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Property(selector = "predicate")
    public native NSPredicate getPredicate();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscriptionOptions instead
     */
    @Deprecated
    @Property(selector = "subscriptionOptions")
    public native CKSubscriptionOptions getSubscriptionOptions();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Property(selector = "zoneID")
    public native CKRecordZoneID getZoneID();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Property(selector = "setZoneID:")
    public native void setZoneID(CKRecordZoneID v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Init the appropriate CKSubscription subclass
     */
    @Deprecated
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Method(selector = "initWithRecordType:predicate:options:")
    protected native @Pointer long init(String recordType, NSPredicate predicate, CKSubscriptionOptions subscriptionOptions);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKQuerySubscription instead
     */
    @Deprecated
    @Method(selector = "initWithRecordType:predicate:subscriptionID:options:")
    protected native @Pointer long init(String recordType, NSPredicate predicate, String subscriptionID, CKSubscriptionOptions subscriptionOptions);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Method(selector = "initWithZoneID:options:")
    protected native @Pointer long init(CKRecordZoneID zoneID, CKSubscriptionOptions subscriptionOptions);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use CKRecordZoneSubscription instead
     */
    @Deprecated
    @Method(selector = "initWithZoneID:subscriptionID:options:")
    protected native @Pointer long init(CKRecordZoneID zoneID, String subscriptionID, CKSubscriptionOptions subscriptionOptions);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
