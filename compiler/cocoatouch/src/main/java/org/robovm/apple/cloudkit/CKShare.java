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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKShare/*</name>*/ 
    extends /*<extends>*/CKRecord/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSharePtr extends Ptr<CKShare, CKSharePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKShare.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKShare() {}
    protected CKShare(Handle h, long handle) { super(h, handle); }
    protected CKShare(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRootRecord:")
    public CKShare(CKRecord rootRecord) { super((SkipInit) null); initObject(init(rootRecord)); }
    @Method(selector = "initWithRootRecord:shareID:")
    public CKShare(CKRecord rootRecord, CKRecordID shareID) { super((SkipInit) null); initObject(init(rootRecord, shareID)); }
    @Method(selector = "initWithCoder:")
    public CKShare(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "publicPermission")
    public native CKShareParticipantPermission getPublicPermission();
    @Property(selector = "setPublicPermission:")
    public native void setPublicPermission(CKShareParticipantPermission v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "participants")
    public native NSArray<CKShareParticipant> getParticipants();
    @Property(selector = "owner")
    public native CKShareParticipant getOwner();
    @Property(selector = "currentUserParticipant")
    public native CKShareParticipant getCurrentUserParticipant();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKShareTitleKey", optional=true)
    public static native String TitleKey();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKShareThumbnailImageDataKey", optional=true)
    public static native String ThumbnailImageDataKey();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKShareTypeKey", optional=true)
    public static native String TypeKey();
    
    @Method(selector = "initWithRootRecord:")
    protected native @Pointer long init(CKRecord rootRecord);
    @Method(selector = "initWithRootRecord:shareID:")
    protected native @Pointer long init(CKRecord rootRecord, CKRecordID shareID);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "addParticipant:")
    public native void addParticipant(CKShareParticipant participant);
    @Method(selector = "removeParticipant:")
    public native void removeParticipant(CKShareParticipant participant);
    /*</methods>*/
}
