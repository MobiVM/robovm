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
/*<annotations>*/@Library("CloudKit") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected CKError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CKError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    private NSErrorUserInfo userInfo;
    
    /* Convenience methods */
    private NSErrorUserInfo getCachedUserInfo() {
        if (userInfo == null) {
            userInfo = getUserInfo();
        }
        return userInfo;
    }
    
    @Override
    public CKErrorCode getErrorCode() {
        CKErrorCode code = null;
        try {
            code = CKErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    
    public NSDictionary<?, ?> getPartialErrors() {
        if (getCachedUserInfo().has(CKErrorUserInfoKey.PartialErrorsByItemID)) {
            NSDictionary<?, ?> val = (NSDictionary<?, ?>) getCachedUserInfo().get(CKErrorUserInfoKey.PartialErrorsByItemID);
            return val;
        }
        return null;
    }
    
    public CKRecord getAncestorRecord() {
        if (getCachedUserInfo().has(CKErrorUserInfoKey.AncestorRecord)) {
            CKRecord val = (CKRecord) getCachedUserInfo().get(CKErrorUserInfoKey.AncestorRecord);
            return val;
        }
        return null;
    }
    public CKRecord getServerRecord() {
        if (getCachedUserInfo().has(CKErrorUserInfoKey.ServerRecord)) {
            CKRecord val = (CKRecord) getCachedUserInfo().get(CKErrorUserInfoKey.ServerRecord);
            return val;
        }
        return null;
    }
    public CKRecord getClientRecord() {
        if (getCachedUserInfo().has(CKErrorUserInfoKey.ClientRecord)) {
            CKRecord val = (CKRecord) getCachedUserInfo().get(CKErrorUserInfoKey.ClientRecord);
            return val;
        }
        return null;
    }
    
    public double retriesAfterTime() {
        if (getCachedUserInfo().has(CKErrorUserInfoKey.RetryAfter)) {
            NSNumber val = (NSNumber) getCachedUserInfo().get(CKErrorUserInfoKey.RetryAfter);
            return val.doubleValue();
        }
        return -1;
    }
    /*<methods>*/
    @GlobalValue(symbol="CKErrorDomain", optional=true)
    public static native String getClassDomain();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="CKErrorUserDidResetEncryptedDataKey", optional=true)
    public static native String getUserDidResetEncryptedDataKey();
    /*</methods>*/
}
