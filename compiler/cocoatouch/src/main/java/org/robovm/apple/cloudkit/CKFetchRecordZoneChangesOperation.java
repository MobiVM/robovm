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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKFetchRecordZoneChangesOperation/*</name>*/ 
    extends /*<extends>*/CKDatabaseOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKFetchRecordZoneChangesOperationPtr extends Ptr<CKFetchRecordZoneChangesOperation, CKFetchRecordZoneChangesOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKFetchRecordZoneChangesOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKFetchRecordZoneChangesOperation() {}
    protected CKFetchRecordZoneChangesOperation(Handle h, long handle) { super(h, handle); }
    protected CKFetchRecordZoneChangesOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRecordZoneIDs:configurationsByRecordZoneID:")
    public static  CKFetchRecordZoneChangesOperation create(NSArray<CKRecordZoneID> recordZoneIDs, NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesConfiguration> configurationsByRecordZoneID) {
       CKFetchRecordZoneChangesOperation res = new CKFetchRecordZoneChangesOperation((SkipInit) null);
       res.initObject(res.init0(recordZoneIDs, configurationsByRecordZoneID));
       return res;
    }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithRecordZoneIDs:optionsByRecordZoneID:")
    public CKFetchRecordZoneChangesOperation(NSArray<CKRecordZoneID> recordZoneIDs, NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesOptions> optionsByRecordZoneID) { super((SkipInit) null); initObject(init(recordZoneIDs, optionsByRecordZoneID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recordZoneIDs")
    public native NSArray<CKRecordZoneID> getRecordZoneIDs();
    @Property(selector = "setRecordZoneIDs:")
    public native void setRecordZoneIDs(NSArray<CKRecordZoneID> v);
    @Property(selector = "configurationsByRecordZoneID")
    public native NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesConfiguration> getConfigurationsByRecordZoneID();
    @Property(selector = "setConfigurationsByRecordZoneID:")
    public native void setConfigurationsByRecordZoneID(NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesConfiguration> v);
    @Property(selector = "fetchAllChanges")
    public native boolean isFetchAllChanges();
    @Property(selector = "setFetchAllChanges:")
    public native void setFetchAllChanges(boolean v);
    @Property(selector = "recordChangedBlock")
    public native @Block VoidBlock1<CKRecord> getRecordChangedBlock();
    @Property(selector = "setRecordChangedBlock:")
    public native void setRecordChangedBlock(@Block VoidBlock1<CKRecord> v);
    @Property(selector = "recordWithIDWasDeletedBlock")
    public native @Block VoidBlock2<CKRecordID, String> getRecordWithIDWasDeletedBlock();
    @Property(selector = "setRecordWithIDWasDeletedBlock:")
    public native void setRecordWithIDWasDeletedBlock(@Block VoidBlock2<CKRecordID, String> v);
    @Property(selector = "recordZoneChangeTokensUpdatedBlock")
    public native @Block VoidBlock3<CKRecordZoneID, CKServerChangeToken, NSData> getRecordZoneChangeTokensUpdatedBlock();
    @Property(selector = "setRecordZoneChangeTokensUpdatedBlock:")
    public native void setRecordZoneChangeTokensUpdatedBlock(@Block VoidBlock3<CKRecordZoneID, CKServerChangeToken, NSData> v);
    @Property(selector = "recordZoneFetchCompletionBlock")
    public native @Block VoidBlock5<CKRecordZoneID, CKServerChangeToken, NSData, Boolean, NSError> getRecordZoneFetchCompletionBlock();
    @Property(selector = "setRecordZoneFetchCompletionBlock:")
    public native void setRecordZoneFetchCompletionBlock(@Block VoidBlock5<CKRecordZoneID, CKServerChangeToken, NSData, Boolean, NSError> v);
    @Property(selector = "fetchRecordZoneChangesCompletionBlock")
    public native @Block VoidBlock1<NSError> getFetchRecordZoneChangesCompletionBlock();
    @Property(selector = "setFetchRecordZoneChangesCompletionBlock:")
    public native void setFetchRecordZoneChangesCompletionBlock(@Block VoidBlock1<NSError> v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "optionsByRecordZoneID")
    public native NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesOptions> getOptionsByRecordZoneID();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "setOptionsByRecordZoneID:")
    public native void setOptionsByRecordZoneID(NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesOptions> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRecordZoneIDs:configurationsByRecordZoneID:")
    protected native @Pointer long init0(NSArray<CKRecordZoneID> recordZoneIDs, NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesConfiguration> configurationsByRecordZoneID);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithRecordZoneIDs:optionsByRecordZoneID:")
    protected native @Pointer long init(NSArray<CKRecordZoneID> recordZoneIDs, NSDictionary<CKRecordZoneID, CKFetchRecordZoneChangesOptions> optionsByRecordZoneID);
    /*</methods>*/
}
