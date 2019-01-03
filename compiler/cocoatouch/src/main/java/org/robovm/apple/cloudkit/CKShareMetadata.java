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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKShareMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKShareMetadataPtr extends Ptr<CKShareMetadata, CKShareMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKShareMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKShareMetadata() {}
    protected CKShareMetadata(Handle h, long handle) { super(h, handle); }
    protected CKShareMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CKShareMetadata(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "containerIdentifier")
    public native String getContainerIdentifier();
    @Property(selector = "share")
    public native CKShare getShare();
    @Property(selector = "rootRecordID")
    public native CKRecordID getRootRecordID();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "participantRole")
    public native CKShareParticipantRole getParticipantRole();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "participantType")
    public native CKShareParticipantType getParticipantType();
    @Property(selector = "participantStatus")
    public native CKShareParticipantAcceptanceStatus getParticipantStatus();
    @Property(selector = "participantPermission")
    public native CKShareParticipantPermission getParticipantPermission();
    @Property(selector = "ownerIdentity")
    public native CKUserIdentity getOwnerIdentity();
    @Property(selector = "rootRecord")
    public native CKRecord getRootRecord();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
