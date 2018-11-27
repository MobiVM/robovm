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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNMutableNotificationContent/*</name>*/ 
    extends /*<extends>*/UNNotificationContent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UNMutableNotificationContentPtr extends Ptr<UNMutableNotificationContent, UNMutableNotificationContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNMutableNotificationContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UNMutableNotificationContent() {}
    protected UNMutableNotificationContent(Handle h, long handle) { super(h, handle); }
    protected UNMutableNotificationContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attachments")
    public native NSArray<UNNotificationAttachment> getAttachments();
    @Property(selector = "setAttachments:")
    public native void setAttachments(NSArray<UNNotificationAttachment> v);
    @Property(selector = "badge")
    public native NSNumber getBadge();
    @Property(selector = "setBadge:")
    public native void setBadge(NSNumber v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "categoryIdentifier")
    public native String getCategoryIdentifier();
    @Property(selector = "setCategoryIdentifier:")
    public native void setCategoryIdentifier(String v);
    @Property(selector = "launchImageName")
    public native String getLaunchImageName();
    @Property(selector = "setLaunchImageName:")
    public native void setLaunchImageName(String v);
    @Property(selector = "sound")
    public native UNNotificationSound getSound();
    @Property(selector = "setSound:")
    public native void setSound(UNNotificationSound v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "threadIdentifier")
    public native String getThreadIdentifier();
    @Property(selector = "setThreadIdentifier:")
    public native void setThreadIdentifier(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "summaryArgument")
    public native String getSummaryArgument();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setSummaryArgument:")
    public native void setSummaryArgument(String v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "summaryArgumentCount")
    public native @MachineSizedUInt long getSummaryArgumentCount();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setSummaryArgumentCount:")
    public native void setSummaryArgumentCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
