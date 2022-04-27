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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKNotification/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKNotificationPtr extends Ptr<CKNotification, CKNotificationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKNotification.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKNotification() {}
    protected CKNotification(Handle h, long handle) { super(h, handle); }
    protected CKNotification(SkipInit skipInit) { super(skipInit); }
    public CKNotification(org.robovm.apple.uikit.UIRemoteNotification notificationDictionary) { super((Handle) null, create(notificationDictionary)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "notificationType")
    public native CKNotificationType getNotificationType();
    @Property(selector = "notificationID")
    public native CKNotificationID getNotificationID();
    @Property(selector = "containerIdentifier")
    public native String getContainerIdentifier();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "subscriptionOwnerUserRecordID")
    public native CKRecordID getSubscriptionOwnerUserRecordID();
    @Property(selector = "isPruned")
    public native boolean isPruned();
    @Property(selector = "alertBody")
    public native String getAlertBody();
    @Property(selector = "alertLocalizationKey")
    public native String getAlertLocalizationKey();
    @Property(selector = "alertLocalizationArgs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAlertLocalizationArgs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "titleLocalizationKey")
    public native String getTitleLocalizationKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "titleLocalizationArgs")
    public native NSArray<NSString> getTitleLocalizationArgs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitleLocalizationKey")
    public native String getSubtitleLocalizationKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitleLocalizationArgs")
    public native NSArray<NSString> getSubtitleLocalizationArgs();
    @Property(selector = "alertActionLocalizationKey")
    public native String getAlertActionLocalizationKey();
    @Property(selector = "alertLaunchImage")
    public native String getAlertLaunchImage();
    @Property(selector = "badge")
    public native NSNumber getBadge();
    @Property(selector = "soundName")
    public native String getSoundName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "subscriptionID")
    public native String getSubscriptionID();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "category")
    public native String getCategory();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "notificationFromRemoteNotificationDictionary:")
    protected static native @Pointer long create(org.robovm.apple.uikit.UIRemoteNotification notificationDictionary);
    /*</methods>*/
}
