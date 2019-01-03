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
package org.robovm.apple.usernotifications;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UserNotifications") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNUserNotificationCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UNUserNotificationCenterPtr extends Ptr<UNUserNotificationCenter, UNUserNotificationCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNUserNotificationCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNUserNotificationCenter() {}
    protected UNUserNotificationCenter(Handle h, long handle) { super(h, handle); }
    protected UNUserNotificationCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UNUserNotificationCenterDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UNUserNotificationCenterDelegate v);
    @Property(selector = "supportsContentExtensions")
    public native boolean supportsContentExtensions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestAuthorizationWithOptions:completionHandler:")
    public native void requestAuthorization(UNAuthorizationOptions options, @Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "setNotificationCategories:")
    public native void setNotificationCategories(NSSet<UNNotificationCategory> categories);
    @Method(selector = "getNotificationCategoriesWithCompletionHandler:")
    public native void getNotificationCategories(@Block VoidBlock1<NSSet<UNNotificationCategory>> completionHandler);
    @Method(selector = "getNotificationSettingsWithCompletionHandler:")
    public native void getNotificationSettings(@Block VoidBlock1<UNNotificationSettings> completionHandler);
    @Method(selector = "addNotificationRequest:withCompletionHandler:")
    public native void addNotificationRequest(UNNotificationRequest request, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "getPendingNotificationRequestsWithCompletionHandler:")
    public native void getPendingNotificationRequests(@Block VoidBlock1<NSArray<UNNotificationRequest>> completionHandler);
    @Method(selector = "removePendingNotificationRequestsWithIdentifiers:")
    public native void removePendingNotificationRequests(NSArray<NSString> identifiers);
    @Method(selector = "removeAllPendingNotificationRequests")
    public native void removeAllPendingNotificationRequests();
    @Method(selector = "getDeliveredNotificationsWithCompletionHandler:")
    public native void getDeliveredNotifications(@Block VoidBlock1<NSArray<UNNotification>> completionHandler);
    @Method(selector = "removeDeliveredNotificationsWithIdentifiers:")
    public native void removeDeliveredNotifications(NSArray<NSString> identifiers);
    @Method(selector = "removeAllDeliveredNotifications")
    public native void removeAllDeliveredNotifications();
    @Method(selector = "currentNotificationCenter")
    public static native UNUserNotificationCenter currentNotificationCenter();
    /*</methods>*/
}
