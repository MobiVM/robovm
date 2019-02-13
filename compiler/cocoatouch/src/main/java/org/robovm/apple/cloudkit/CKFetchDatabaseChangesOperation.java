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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKFetchDatabaseChangesOperation/*</name>*/ 
    extends /*<extends>*/CKDatabaseOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKFetchDatabaseChangesOperationPtr extends Ptr<CKFetchDatabaseChangesOperation, CKFetchDatabaseChangesOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKFetchDatabaseChangesOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKFetchDatabaseChangesOperation() {}
    protected CKFetchDatabaseChangesOperation(Handle h, long handle) { super(h, handle); }
    protected CKFetchDatabaseChangesOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPreviousServerChangeToken:")
    public CKFetchDatabaseChangesOperation(CKServerChangeToken previousServerChangeToken) { super((SkipInit) null); initObject(init(previousServerChangeToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "previousServerChangeToken")
    public native CKServerChangeToken getPreviousServerChangeToken();
    @Property(selector = "setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(CKServerChangeToken v);
    @Property(selector = "resultsLimit")
    public native @MachineSizedUInt long getResultsLimit();
    @Property(selector = "setResultsLimit:")
    public native void setResultsLimit(@MachineSizedUInt long v);
    @Property(selector = "fetchAllChanges")
    public native boolean isFetchAllChanges();
    @Property(selector = "setFetchAllChanges:")
    public native void setFetchAllChanges(boolean v);
    @Property(selector = "recordZoneWithIDChangedBlock")
    public native @Block VoidBlock1<CKRecordZoneID> getRecordZoneWithIDChangedBlock();
    @Property(selector = "setRecordZoneWithIDChangedBlock:")
    public native void setRecordZoneWithIDChangedBlock(@Block VoidBlock1<CKRecordZoneID> v);
    @Property(selector = "recordZoneWithIDWasDeletedBlock")
    public native @Block VoidBlock1<CKRecordZoneID> getRecordZoneWithIDWasDeletedBlock();
    @Property(selector = "setRecordZoneWithIDWasDeletedBlock:")
    public native void setRecordZoneWithIDWasDeletedBlock(@Block VoidBlock1<CKRecordZoneID> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "recordZoneWithIDWasPurgedBlock")
    public native @Block VoidBlock1<CKRecordZoneID> getRecordZoneWithIDWasPurgedBlock();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRecordZoneWithIDWasPurgedBlock:")
    public native void setRecordZoneWithIDWasPurgedBlock(@Block VoidBlock1<CKRecordZoneID> v);
    @Property(selector = "changeTokenUpdatedBlock")
    public native @Block VoidBlock1<CKServerChangeToken> getChangeTokenUpdatedBlock();
    @Property(selector = "setChangeTokenUpdatedBlock:")
    public native void setChangeTokenUpdatedBlock(@Block VoidBlock1<CKServerChangeToken> v);
    @Property(selector = "fetchDatabaseChangesCompletionBlock")
    public native @Block VoidBlock3<CKServerChangeToken, Boolean, NSError> getFetchDatabaseChangesCompletionBlock();
    @Property(selector = "setFetchDatabaseChangesCompletionBlock:")
    public native void setFetchDatabaseChangesCompletionBlock(@Block VoidBlock3<CKServerChangeToken, Boolean, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPreviousServerChangeToken:")
    protected native @Pointer long init(CKServerChangeToken previousServerChangeToken);
    /*</methods>*/
}
