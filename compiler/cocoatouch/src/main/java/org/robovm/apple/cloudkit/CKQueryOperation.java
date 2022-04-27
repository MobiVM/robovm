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

/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKQueryOperation/*</name>*/ 
    extends /*<extends>*/CKDatabaseOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKQueryOperationPtr extends Ptr<CKQueryOperation, CKQueryOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKQueryOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKQueryOperation() {}
    protected CKQueryOperation(Handle h, long handle) { super(h, handle); }
    protected CKQueryOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQuery:")
    public CKQueryOperation(CKQuery query) { super((SkipInit) null); initObject(init(query)); }
    @Method(selector = "initWithCursor:")
    public CKQueryOperation(CKQueryCursor cursor) { super((SkipInit) null); initObject(init(cursor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native CKQuery getQuery();
    @Property(selector = "setQuery:")
    public native void setQuery(CKQuery v);
    @Property(selector = "cursor")
    public native CKQueryCursor getCursor();
    @Property(selector = "setCursor:")
    public native void setCursor(CKQueryCursor v);
    @Property(selector = "zoneID")
    public native CKRecordZoneID getZoneID();
    @Property(selector = "setZoneID:")
    public native void setZoneID(CKRecordZoneID v);
    @Property(selector = "resultsLimit")
    public native @MachineSizedUInt long getResultsLimit();
    @Property(selector = "setResultsLimit:")
    public native void setResultsLimit(@MachineSizedUInt long v);
    @Property(selector = "desiredKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getDesiredKeys();
    @Property(selector = "setDesiredKeys:")
    public native void setDesiredKeys(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    /**
     * @deprecated Deprecated in iOS 15.0. Use recordMatchedBlock instead, which surfaces per-record errors
     */
    @Deprecated
    @Property(selector = "recordFetchedBlock")
    public native @Block VoidBlock1<CKRecord> getRecordFetchedBlock();
    /**
     * @deprecated Deprecated in iOS 15.0. Use recordMatchedBlock instead, which surfaces per-record errors
     */
    @Deprecated
    @Property(selector = "setRecordFetchedBlock:")
    public native void setRecordFetchedBlock(@Block VoidBlock1<CKRecord> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "recordMatchedBlock")
    public native @Block VoidBlock3<CKRecordID, CKRecord, NSError> getRecordMatchedBlock();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setRecordMatchedBlock:")
    public native void setRecordMatchedBlock(@Block VoidBlock3<CKRecordID, CKRecord, NSError> v);
    @Property(selector = "queryCompletionBlock")
    public native @Block VoidBlock2<CKQueryCursor, NSError> getQueryCompletionBlock();
    @Property(selector = "setQueryCompletionBlock:")
    public native void setQueryCompletionBlock(@Block VoidBlock2<CKQueryCursor, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CKQueryOperationMaximumResults", optional=true)
    public static native @MachineSizedUInt long getMaximumResults();
    
    @Method(selector = "initWithQuery:")
    protected native @Pointer long init(CKQuery query);
    @Method(selector = "initWithCursor:")
    protected native @Pointer long init(CKQueryCursor cursor);
    /*</methods>*/
}
