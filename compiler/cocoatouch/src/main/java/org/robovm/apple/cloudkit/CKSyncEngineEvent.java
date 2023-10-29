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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngineEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEngineEventPtr extends Ptr<CKSyncEngineEvent, CKSyncEngineEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngineEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSyncEngineEvent() {}
    protected CKSyncEngineEvent(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngineEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native CKSyncEngineEventType getType();
    @Property(selector = "stateUpdateEvent")
    public native CKSyncEngineStateUpdateEvent getStateUpdateEvent();
    @Property(selector = "accountChangeEvent")
    public native CKSyncEngineAccountChangeEvent getAccountChangeEvent();
    @Property(selector = "fetchedDatabaseChangesEvent")
    public native CKSyncEngineFetchedDatabaseChangesEvent getFetchedDatabaseChangesEvent();
    @Property(selector = "fetchedRecordZoneChangesEvent")
    public native CKSyncEngineFetchedRecordZoneChangesEvent getFetchedRecordZoneChangesEvent();
    @Property(selector = "sentDatabaseChangesEvent")
    public native CKSyncEngineSentDatabaseChangesEvent getSentDatabaseChangesEvent();
    @Property(selector = "sentRecordZoneChangesEvent")
    public native CKSyncEngineSentRecordZoneChangesEvent getSentRecordZoneChangesEvent();
    @Property(selector = "willFetchChangesEvent")
    public native CKSyncEngineWillFetchChangesEvent getWillFetchChangesEvent();
    @Property(selector = "willFetchRecordZoneChangesEvent")
    public native CKSyncEngineWillFetchRecordZoneChangesEvent getWillFetchRecordZoneChangesEvent();
    @Property(selector = "didFetchRecordZoneChangesEvent")
    public native CKSyncEngineDidFetchRecordZoneChangesEvent getDidFetchRecordZoneChangesEvent();
    @Property(selector = "didFetchChangesEvent")
    public native CKSyncEngineDidFetchChangesEvent getDidFetchChangesEvent();
    @Property(selector = "willSendChangesEvent")
    public native CKSyncEngineWillSendChangesEvent getWillSendChangesEvent();
    @Property(selector = "didSendChangesEvent")
    public native CKSyncEngineDidSendChangesEvent getDidSendChangesEvent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
