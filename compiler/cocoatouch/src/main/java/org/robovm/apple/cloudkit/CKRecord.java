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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKRecord/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKRecordPtr extends Ptr<CKRecord, CKRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKRecord() {}
    protected CKRecord(Handle h, long handle) { super(h, handle); }
    protected CKRecord(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRecordType:")
    public CKRecord(String recordType) { super((SkipInit) null); initObject(init(recordType)); }
    @Method(selector = "initWithRecordType:recordID:")
    public CKRecord(String recordType, CKRecordID recordID) { super((SkipInit) null); initObject(init(recordType, recordID)); }
    @Method(selector = "initWithRecordType:zoneID:")
    public CKRecord(String recordType, CKRecordZoneID zoneID) { super((SkipInit) null); initObject(init(recordType, zoneID)); }
    @Method(selector = "initWithCoder:")
    public CKRecord(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recordType")
    public native String getRecordType();
    @Property(selector = "recordID")
    public native CKRecordID getRecordID();
    @Property(selector = "recordChangeTag")
    public native String getRecordChangeTag();
    @Property(selector = "creatorUserRecordID")
    public native CKRecordID getCreatorUserRecordID();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "lastModifiedUserRecordID")
    public native CKRecordID getLastModifiedUserRecordID();
    @Property(selector = "modificationDate")
    public native NSDate getModificationDate();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "share")
    public native CKReference getShare();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "parent")
    public native CKReference getParent();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setParent:")
    public native void setParent(CKReference v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    public void put(String key, String object) {
        put(key, new NSString(object));
    }
    public void put(String key, NSString object) {
        put(object, key);
    }
    public void put(String key, Number object) {
        put(key, NSNumber.valueOf(object));
    }
    public void put(String key, NSNumber object) {
        put(object, key);
    }
    public void put(String key, NSData object) {
        put(object, key);
    }
    public void put(String key, NSDate object) {
        put(object, key);
    }
    @WeaklyLinked
    public void put(String key, CLLocation object) {
        put(object, key);
    }
    public void put(String key, CKAsset object) {
        put(object, key);
    }
    public void put(String key, CKReference object) {
        put(object, key);
    }
    public void put(String key, NSArray<?> object) {
        put(object, key);
    }
    public void put(String key, List<String> object) {
        put(NSArray.fromStrings(object), key);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKRecordParentKey", optional=true)
    public static native String ParentKey();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKRecordShareKey", optional=true)
    public static native String ShareKey();
    
    @Method(selector = "initWithRecordType:")
    protected native @Pointer long init(String recordType);
    @Method(selector = "initWithRecordType:recordID:")
    protected native @Pointer long init(String recordType, CKRecordID recordID);
    @Method(selector = "initWithRecordType:zoneID:")
    protected native @Pointer long init(String recordType, CKRecordZoneID zoneID);
    @Method(selector = "objectForKey:")
    public native NSObject get(String key);
    @Method(selector = "setObject:forKey:")
    protected native void put(NSObject object, String key);
    @Method(selector = "allKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAllKeys();
    @Method(selector = "allTokens")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAllTokens();
    @Method(selector = "changedKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getChangedKeys();
    @Method(selector = "encodeSystemFieldsWithCoder:")
    public native void encodeSystemFields(NSCoder coder);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setParentReferenceFromRecord:")
    public native void setParentReferenceFromRecord(CKRecord parentRecord);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setParentReferenceFromRecordID:")
    public native void setParentReferenceFromRecordID(CKRecordID parentRecordID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
