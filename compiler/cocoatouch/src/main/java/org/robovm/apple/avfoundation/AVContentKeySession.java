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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVContentKeySession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVContentKeySessionPtr extends Ptr<AVContentKeySession, AVContentKeySessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVContentKeySession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVContentKeySession() {}
    protected AVContentKeySession(Handle h, long handle) { super(h, handle); }
    protected AVContentKeySession(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public AVContentKeySession(String keySystem) { super((Handle) null, create(keySystem)); retain(getHandle()); }
    public AVContentKeySession(String keySystem, NSURL storageURL) { super((Handle) null, create(keySystem, storageURL)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVContentKeySessionDelegate getDelegate();
    @Property(selector = "delegateQueue")
    public native DispatchQueue getDelegateQueue();
    @Property(selector = "storageURL")
    public native NSURL getStorageURL();
    @Property(selector = "keySystem")
    public native String getKeySystem();
    @Property(selector = "contentProtectionSessionIdentifier")
    public native NSData getContentProtectionSessionIdentifier();
    @Property(selector = "contentKeyRecipients")
    public native NSArray<?> getContentKeyRecipients();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(AVContentKeySessionDelegate delegate, DispatchQueue delegateQueue);
    @Method(selector = "expire")
    public native void expire();
    @Method(selector = "processContentKeyRequestWithIdentifier:initializationData:options:")
    public native void processContentKeyRequestWithIdentifier(NSObject identifier, NSData initializationData, NSDictionary<NSString, ?> options);
    @Method(selector = "renewExpiringResponseDataForContentKeyRequest:")
    public native void renewExpiringResponseDataForContentKeyRequest(AVContentKeyRequest contentKeyRequest);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "makeSecureTokenForExpirationDateOfPersistableContentKey:completionHandler:")
    public native void makeSecureTokenForExpirationDateOfPersistableContentKey(NSData persistableContentKeyData, @Block VoidBlock2<NSData, NSError> handler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "contentKeySessionWithKeySystem:")
    protected static native @Pointer long create(String keySystem);
    @Method(selector = "contentKeySessionWithKeySystem:storageDirectoryAtURL:")
    protected static native @Pointer long create(String keySystem, NSURL storageURL);
    @Method(selector = "addContentKeyRecipient:")
    public native void addContentKeyRecipient(AVContentKeyRecipient recipient);
    @Method(selector = "removeContentKeyRecipient:")
    public native void removeContentKeyRecipient(AVContentKeyRecipient recipient);
    @Method(selector = "pendingExpiredSessionReportsWithAppIdentifier:storageDirectoryAtURL:")
    public static native NSArray<NSData> pendingExpiredSessionReportsWithAppIdentifier(NSData appIdentifier, NSURL storageURL);
    @Method(selector = "removePendingExpiredSessionReports:withAppIdentifier:storageDirectoryAtURL:")
    public static native void removePendingExpiredSessionReports(NSArray<NSData> expiredSessionReports, NSData appIdentifier, NSURL storageURL);
    /*</methods>*/
}
