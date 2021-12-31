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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNNotificationAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UNNotificationActionPtr extends Ptr<UNNotificationAction, UNNotificationActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNNotificationAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNNotificationAction() {}
    protected UNNotificationAction(Handle h, long handle) { super(h, handle); }
    protected UNNotificationAction(SkipInit skipInit) { super(skipInit); }
    public UNNotificationAction(String identifier, String title, UNNotificationActionOptions options) { super((Handle) null, create(identifier, title, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    public UNNotificationAction(String identifier, String title, UNNotificationActionOptions options, UNNotificationActionIcon icon) { super((Handle) null, create(identifier, title, options, icon)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public UNNotificationAction(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "options")
    public native UNNotificationActionOptions getOptions();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "icon")
    public native UNNotificationActionIcon getIcon();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "actionWithIdentifier:title:options:")
    protected static native @Pointer long create(String identifier, String title, UNNotificationActionOptions options);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "actionWithIdentifier:title:options:icon:")
    protected static native @Pointer long create(String identifier, String title, UNNotificationActionOptions options, UNNotificationActionIcon icon);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
