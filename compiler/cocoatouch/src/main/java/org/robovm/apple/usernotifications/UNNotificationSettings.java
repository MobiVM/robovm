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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNNotificationSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UNNotificationSettingsPtr extends Ptr<UNNotificationSettings, UNNotificationSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNNotificationSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNNotificationSettings() {}
    protected UNNotificationSettings(Handle h, long handle) { super(h, handle); }
    protected UNNotificationSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UNNotificationSettings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationStatus")
    public native UNAuthorizationStatus getAuthorizationStatus();
    @Property(selector = "soundSetting")
    public native UNNotificationSetting getSoundSetting();
    @Property(selector = "badgeSetting")
    public native UNNotificationSetting getBadgeSetting();
    @Property(selector = "alertSetting")
    public native UNNotificationSetting getAlertSetting();
    @Property(selector = "notificationCenterSetting")
    public native UNNotificationSetting getNotificationCenterSetting();
    @Property(selector = "lockScreenSetting")
    public native UNNotificationSetting getLockScreenSetting();
    @Property(selector = "carPlaySetting")
    public native UNNotificationSetting getCarPlaySetting();
    @Property(selector = "alertStyle")
    public native UNAlertStyle getAlertStyle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "showPreviewsSetting")
    public native UNShowPreviewsSetting getShowPreviewsSetting();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "criticalAlertSetting")
    public native UNNotificationSetting getCriticalAlertSetting();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "providesAppNotificationSettings")
    public native boolean providesAppNotificationSettings();
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
