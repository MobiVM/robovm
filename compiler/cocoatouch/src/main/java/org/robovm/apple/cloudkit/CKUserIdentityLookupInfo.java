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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKUserIdentityLookupInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKUserIdentityLookupInfoPtr extends Ptr<CKUserIdentityLookupInfo, CKUserIdentityLookupInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKUserIdentityLookupInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKUserIdentityLookupInfo() {}
    protected CKUserIdentityLookupInfo(Handle h, long handle) { super(h, handle); }
    protected CKUserIdentityLookupInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEmailAddress:")
    public static  CKUserIdentityLookupInfo createWithEmailAddress(String emailAddress) {
       CKUserIdentityLookupInfo res = new CKUserIdentityLookupInfo((SkipInit) null);
       res.initObject(res.initWithEmailAddress(emailAddress));
       return res;
    }
    @Method(selector = "initWithPhoneNumber:")
    public static  CKUserIdentityLookupInfo createWithPhoneNumber(String phoneNumber) {
       CKUserIdentityLookupInfo res = new CKUserIdentityLookupInfo((SkipInit) null);
       res.initObject(res.initWithPhoneNumber(phoneNumber));
       return res;
    }
    @Method(selector = "initWithUserRecordID:")
    public CKUserIdentityLookupInfo(CKRecordID userRecordID) { super((SkipInit) null); initObject(init(userRecordID)); }
    @Method(selector = "initWithCoder:")
    public CKUserIdentityLookupInfo(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "emailAddress")
    public native String getEmailAddress();
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "userRecordID")
    public native CKRecordID getUserRecordID();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEmailAddress:")
    protected native @Pointer long initWithEmailAddress(String emailAddress);
    @Method(selector = "initWithPhoneNumber:")
    protected native @Pointer long initWithPhoneNumber(String phoneNumber);
    @Method(selector = "initWithUserRecordID:")
    protected native @Pointer long init(CKRecordID userRecordID);
    @Method(selector = "lookupInfosWithEmails:")
    public static native NSArray<CKUserIdentityLookupInfo> lookupInfosWithEmails(NSArray<NSString> emails);
    @Method(selector = "lookupInfosWithPhoneNumbers:")
    public static native NSArray<CKUserIdentityLookupInfo> lookupInfosWithPhoneNumbers(NSArray<NSString> phoneNumbers);
    @Method(selector = "lookupInfosWithRecordIDs:")
    public static native NSArray<CKUserIdentityLookupInfo> lookupInfosWithRecordIDs(NSArray<CKRecordID> recordIDs);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
