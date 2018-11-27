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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNNotificationCategory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UNNotificationCategoryPtr extends Ptr<UNNotificationCategory, UNNotificationCategoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNNotificationCategory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNNotificationCategory() {}
    protected UNNotificationCategory(Handle h, long handle) { super(h, handle); }
    protected UNNotificationCategory(SkipInit skipInit) { super(skipInit); }
    public UNNotificationCategory(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, UNNotificationCategoryOptions options) { super((Handle) null, create(identifier, actions, intentIdentifiers, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public UNNotificationCategory(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, String hiddenPreviewsBodyPlaceholder, UNNotificationCategoryOptions options) { super((Handle) null, create(identifier, actions, intentIdentifiers, hiddenPreviewsBodyPlaceholder, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public UNNotificationCategory(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, String hiddenPreviewsBodyPlaceholder, String categorySummaryFormat, UNNotificationCategoryOptions options) { super((Handle) null, create(identifier, actions, intentIdentifiers, hiddenPreviewsBodyPlaceholder, categorySummaryFormat, options)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public UNNotificationCategory(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "actions")
    public native NSArray<UNNotificationAction> getActions();
    @Property(selector = "intentIdentifiers")
    public native NSArray<NSString> getIntentIdentifiers();
    @Property(selector = "options")
    public native UNNotificationCategoryOptions getOptions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hiddenPreviewsBodyPlaceholder")
    public native String getHiddenPreviewsBodyPlaceholder();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "categorySummaryFormat")
    public native String getCategorySummaryFormat();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "categoryWithIdentifier:actions:intentIdentifiers:options:")
    protected static native @Pointer long create(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, UNNotificationCategoryOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "categoryWithIdentifier:actions:intentIdentifiers:hiddenPreviewsBodyPlaceholder:options:")
    protected static native @Pointer long create(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, String hiddenPreviewsBodyPlaceholder, UNNotificationCategoryOptions options);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "categoryWithIdentifier:actions:intentIdentifiers:hiddenPreviewsBodyPlaceholder:categorySummaryFormat:options:")
    protected static native @Pointer long create(String identifier, NSArray<UNNotificationAction> actions, NSArray<NSString> intentIdentifiers, String hiddenPreviewsBodyPlaceholder, String categorySummaryFormat, UNNotificationCategoryOptions options);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
