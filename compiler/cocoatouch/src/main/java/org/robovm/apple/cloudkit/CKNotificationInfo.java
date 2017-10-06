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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKNotificationInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKNotificationInfoPtr extends Ptr<CKNotificationInfo, CKNotificationInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKNotificationInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKNotificationInfo() {}
    protected CKNotificationInfo(Handle h, long handle) { super(h, handle); }
    protected CKNotificationInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CKNotificationInfo(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alertBody")
    public native String getAlertBody();
    @Property(selector = "setAlertBody:")
    public native void setAlertBody(String v);
    @Property(selector = "alertLocalizationKey")
    public native String getAlertLocalizationKey();
    @Property(selector = "setAlertLocalizationKey:")
    public native void setAlertLocalizationKey(String v);
    @Property(selector = "alertLocalizationArgs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAlertLocalizationArgs();
    @Property(selector = "setAlertLocalizationArgs:")
    public native void setAlertLocalizationArgs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "titleLocalizationKey")
    public native String getTitleLocalizationKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTitleLocalizationKey:")
    public native void setTitleLocalizationKey(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "titleLocalizationArgs")
    public native NSArray<NSString> getTitleLocalizationArgs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTitleLocalizationArgs:")
    public native void setTitleLocalizationArgs(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitleLocalizationKey")
    public native String getSubtitleLocalizationKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSubtitleLocalizationKey:")
    public native void setSubtitleLocalizationKey(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "subtitleLocalizationArgs")
    public native NSArray<NSString> getSubtitleLocalizationArgs();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSubtitleLocalizationArgs:")
    public native void setSubtitleLocalizationArgs(NSArray<NSString> v);
    @Property(selector = "alertActionLocalizationKey")
    public native String getAlertActionLocalizationKey();
    @Property(selector = "setAlertActionLocalizationKey:")
    public native void setAlertActionLocalizationKey(String v);
    @Property(selector = "alertLaunchImage")
    public native String getAlertLaunchImage();
    @Property(selector = "setAlertLaunchImage:")
    public native void setAlertLaunchImage(String v);
    @Property(selector = "soundName")
    public native String getSoundName();
    @Property(selector = "setSoundName:")
    public native void setSoundName(String v);
    @Property(selector = "desiredKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getDesiredKeys();
    @Property(selector = "setDesiredKeys:")
    public native void setDesiredKeys(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "shouldBadge")
    public native boolean shouldBadge();
    @Property(selector = "setShouldBadge:")
    public native void setShouldBadge(boolean v);
    @Property(selector = "shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();
    @Property(selector = "setShouldSendContentAvailable:")
    public native void setShouldSendContentAvailable(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "shouldSendMutableContent")
    public native boolean shouldSendMutableContent();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setShouldSendMutableContent:")
    public native void setShouldSendMutableContent(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "category")
    public native String getCategory();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "collapseIDKey")
    public native String getCollapseIDKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setCollapseIDKey:")
    public native void setCollapseIDKey(String v);
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
