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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngineState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEngineStatePtr extends Ptr<CKSyncEngineState, CKSyncEngineStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngineState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSyncEngineState() {}
    protected CKSyncEngineState(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngineState(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pendingRecordZoneChanges")
    public native NSArray<CKSyncEnginePendingRecordZoneChange> getPendingRecordZoneChanges();
    @Property(selector = "pendingDatabaseChanges")
    public native NSArray<CKSyncEnginePendingDatabaseChange> getPendingDatabaseChanges();
    @Property(selector = "hasPendingUntrackedChanges")
    public native boolean hasPendingUntrackedChanges();
    @Property(selector = "setHasPendingUntrackedChanges:")
    public native void setHasPendingUntrackedChanges(boolean v);
    @Property(selector = "zoneIDsWithUnfetchedServerChanges")
    public native NSArray<CKRecordZoneID> getZoneIDsWithUnfetchedServerChanges();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addPendingRecordZoneChanges:")
    public native void addPendingRecordZoneChanges(NSArray<CKSyncEnginePendingRecordZoneChange> changes);
    @Method(selector = "removePendingRecordZoneChanges:")
    public native void removePendingRecordZoneChanges(NSArray<CKSyncEnginePendingRecordZoneChange> changes);
    @Method(selector = "addPendingDatabaseChanges:")
    public native void addPendingDatabaseChanges(NSArray<CKSyncEnginePendingDatabaseChange> changes);
    @Method(selector = "removePendingDatabaseChanges:")
    public native void removePendingDatabaseChanges(NSArray<CKSyncEnginePendingDatabaseChange> changes);
    /*</methods>*/
}
