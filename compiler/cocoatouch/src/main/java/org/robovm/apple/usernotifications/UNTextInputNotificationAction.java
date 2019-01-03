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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNTextInputNotificationAction/*</name>*/ 
    extends /*<extends>*/UNNotificationAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UNTextInputNotificationActionPtr extends Ptr<UNTextInputNotificationAction, UNTextInputNotificationActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNTextInputNotificationAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNTextInputNotificationAction() {}
    protected UNTextInputNotificationAction(Handle h, long handle) { super(h, handle); }
    protected UNTextInputNotificationAction(SkipInit skipInit) { super(skipInit); }
    public UNTextInputNotificationAction(String identifier, String title, UNNotificationActionOptions options, String textInputButtonTitle, String textInputPlaceholder) { super((Handle) null, create(identifier, title, options, textInputButtonTitle, textInputPlaceholder)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textInputButtonTitle")
    public native String getTextInputButtonTitle();
    @Property(selector = "textInputPlaceholder")
    public native String getTextInputPlaceholder();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "actionWithIdentifier:title:options:textInputButtonTitle:textInputPlaceholder:")
    protected static native @Pointer long create(String identifier, String title, UNNotificationActionOptions options, String textInputButtonTitle, String textInputPlaceholder);
    /*</methods>*/
}
