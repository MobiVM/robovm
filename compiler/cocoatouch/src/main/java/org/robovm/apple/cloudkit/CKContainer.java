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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeAccountChanged(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(AccountChangedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class CKContainerPtr extends Ptr<CKContainer, CKContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKContainer() {}
    protected CKContainer(Handle h, long handle) { super(h, handle); }
    protected CKContainer(SkipInit skipInit) { super(skipInit); }
    public CKContainer(String containerIdentifier) { super((Handle) null, create(containerIdentifier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "containerIdentifier")
    public native String getContainerIdentifier();
    @Property(selector = "privateCloudDatabase")
    public native CKDatabase getPrivateCloudDatabase();
    @Property(selector = "publicCloudDatabase")
    public native CKDatabase getPublicCloudDatabase();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "sharedCloudDatabase")
    public native CKDatabase getSharedCloudDatabase();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CKCurrentUserDefaultName", optional=true)
    public static native String getDefaultCurrentUserName();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @GlobalValue(symbol="CKOwnerDefaultName", optional=true)
    public static native String getDefaultOwnerName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CKAccountChangedNotification", optional=true)
    public static native NSString AccountChangedNotification();
    
    @Method(selector = "addOperation:")
    public native void addOperation(CKOperation operation);
    @Method(selector = "defaultContainer")
    public static native CKContainer getDefaultContainer();
    @Method(selector = "containerWithIdentifier:")
    protected static native @Pointer long create(String containerIdentifier);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "databaseWithDatabaseScope:")
    public native CKDatabase getDatanase(CKDatabaseScope databaseScope);
    @Method(selector = "accountStatusWithCompletionHandler:")
    public native void getAccountStatus(@Block VoidBlock2<CKAccountStatus, NSError> completionHandler);
    @Method(selector = "statusForApplicationPermission:completionHandler:")
    public native void getStatusForApplicationPermission(CKApplicationPermissions applicationPermission, @Block VoidBlock2<CKApplicationPermissionStatus, NSError> completionHandler);
    @Method(selector = "requestApplicationPermission:completionHandler:")
    public native void requestApplicationPermission(CKApplicationPermissions applicationPermission, @Block VoidBlock2<CKApplicationPermissionStatus, NSError> completionHandler);
    @Method(selector = "fetchUserRecordIDWithCompletionHandler:")
    public native void fetchUserRecordID(@Block VoidBlock2<CKRecordID, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "discoverAllIdentitiesWithCompletionHandler:")
    public native void discoverAllIdentities(@Block VoidBlock2<NSArray<CKUserIdentity>, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "discoverUserIdentityWithEmailAddress:completionHandler:")
    public native void discoverUserIdentityWithEmailAddress(String email, @Block VoidBlock2<CKUserIdentity, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "discoverUserIdentityWithPhoneNumber:completionHandler:")
    public native void discoverUserIdentityWithPhoneNumber(String phoneNumber, @Block VoidBlock2<CKUserIdentity, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "discoverUserIdentityWithUserRecordID:completionHandler:")
    public native void discoverUserIdentityWithUserRecordID(CKRecordID userRecordID, @Block VoidBlock2<CKUserIdentity, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -[CKContainer discoverAllIdentitiesWithCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "discoverAllContactUserInfosWithCompletionHandler:")
    public native void discoverAllContactUserInfos(@Block VoidBlock2<NSArray<CKDiscoveredUserInfo>, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -[CKContainer discoverUserIdentityWithEmailAddress:completionHandler:]
     */
    @Deprecated
    @Method(selector = "discoverUserInfoWithEmailAddress:completionHandler:")
    public native void discoverUserInfo(String email, @Block VoidBlock2<CKDiscoveredUserInfo, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -[CKContainer discoverUserIdentityWithUserRecordID:completionHandler:]
     */
    @Deprecated
    @Method(selector = "discoverUserInfoWithUserRecordID:completionHandler:")
    public native void discoverUserInfo(CKRecordID userRecordID, @Block VoidBlock2<CKDiscoveredUserInfo, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "fetchShareParticipantWithEmailAddress:completionHandler:")
    public native void fetchShareParticipantWithEmailAddress(String emailAddress, @Block VoidBlock2<CKShareParticipant, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "fetchShareParticipantWithPhoneNumber:completionHandler:")
    public native void fetchShareParticipantWithPhoneNumber(String phoneNumber, @Block VoidBlock2<CKShareParticipant, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "fetchShareParticipantWithUserRecordID:completionHandler:")
    public native void fetchShareParticipantWithUserRecordID(CKRecordID userRecordID, @Block VoidBlock2<CKShareParticipant, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "fetchShareMetadataWithURL:completionHandler:")
    public native void fetchShareMetadata(NSURL url, @Block VoidBlock2<CKShareMetadata, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "acceptShareMetadata:completionHandler:")
    public native void acceptShareMetadata(CKShareMetadata metadata, @Block VoidBlock2<CKShare, NSError> completionHandler);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "fetchAllLongLivedOperationIDsWithCompletionHandler:")
    public native void fetchAllLongLivedOperationIDs(@Block VoidBlock2<NSArray<NSString>, NSError> completionHandler);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "fetchLongLivedOperationWithID:completionHandler:")
    public native void fetchLongLivedOperation(String operationID, @Block VoidBlock2<CKOperation, NSError> completionHandler);
    /*</methods>*/
}
