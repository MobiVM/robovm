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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNNotificationContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UNNotificationContentPtr extends Ptr<UNNotificationContent, UNNotificationContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNNotificationContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UNNotificationContent() {}
    protected UNNotificationContent(Handle h, long handle) { super(h, handle); }
    protected UNNotificationContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UNNotificationContent(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attachments")
    public native NSArray<UNNotificationAttachment> getAttachments();
    @Property(selector = "badge")
    public native NSNumber getBadge();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "categoryIdentifier")
    public native String getCategoryIdentifier();
    @Property(selector = "launchImageName")
    public native String getLaunchImageName();
    @Property(selector = "sound")
    public native UNNotificationSound getSound();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "threadIdentifier")
    public native String getThreadIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "summaryArgument")
    public native String getSummaryArgument();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "summaryArgumentCount")
    public native @MachineSizedUInt long getSummaryArgumentCount();
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
