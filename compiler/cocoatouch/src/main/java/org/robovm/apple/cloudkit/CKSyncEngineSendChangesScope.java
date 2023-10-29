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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngineSendChangesScope/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEngineSendChangesScopePtr extends Ptr<CKSyncEngineSendChangesScope, CKSyncEngineSendChangesScopePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngineSendChangesScope.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKSyncEngineSendChangesScope() {}
    protected CKSyncEngineSendChangesScope(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngineSendChangesScope(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithZoneIDs:")
    public CKSyncEngineSendChangesScope(NSSet<CKRecordZoneID> zoneIDs) { super((SkipInit) null); initObject(init(zoneIDs)); }
    @Method(selector = "initWithExcludedZoneIDs:")
    public static  CKSyncEngineSendChangesScope createWithExcludedZoneIDs(NSSet<CKRecordZoneID> excludedZoneIDs) {
       CKSyncEngineSendChangesScope res = new CKSyncEngineSendChangesScope((SkipInit) null);
       res.initObject(res.initWithExcludedZoneIDs(excludedZoneIDs));
       return res;
    }
    @Method(selector = "initWithRecordIDs:")
    public static  CKSyncEngineSendChangesScope createWithRecordIDs(NSSet<CKRecordID> recordIDs) {
       CKSyncEngineSendChangesScope res = new CKSyncEngineSendChangesScope((SkipInit) null);
       res.initObject(res.initWithRecordIDs(recordIDs));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zoneIDs")
    public native NSSet<CKRecordZoneID> getZoneIDs();
    @Property(selector = "excludedZoneIDs")
    public native NSSet<CKRecordZoneID> getExcludedZoneIDs();
    @Property(selector = "recordIDs")
    public native NSSet<CKRecordID> getRecordIDs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithZoneIDs:")
    protected native @Pointer long init(NSSet<CKRecordZoneID> zoneIDs);
    @Method(selector = "initWithExcludedZoneIDs:")
    protected native @Pointer long initWithExcludedZoneIDs(NSSet<CKRecordZoneID> excludedZoneIDs);
    @Method(selector = "initWithRecordIDs:")
    protected native @Pointer long initWithRecordIDs(NSSet<CKRecordID> recordIDs);
    @Method(selector = "containsRecordID:")
    public native boolean containsRecordID(CKRecordID recordID);
    @Method(selector = "containsPendingRecordZoneChange:")
    public native boolean containsPendingRecordZoneChange(CKSyncEnginePendingRecordZoneChange pendingRecordZoneChange);
    /*</methods>*/
}
