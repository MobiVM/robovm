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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIApplicationShortcutItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIApplicationShortcutItemPtr extends Ptr<UIApplicationShortcutItem, UIApplicationShortcutItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIApplicationShortcutItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIApplicationShortcutItem(Handle h, long handle) { super(h, handle); }
    protected UIApplicationShortcutItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithType:localizedTitle:localizedSubtitle:icon:userInfo:")
    public UIApplicationShortcutItem(String type, String localizedTitle, String localizedSubtitle, UIApplicationShortcutIcon icon, NSDictionary<NSString, ?> userInfo) { super((SkipInit) null); initObject(init(type, localizedTitle, localizedSubtitle, icon, userInfo)); }
    @Method(selector = "initWithType:localizedTitle:")
    public UIApplicationShortcutItem(String type, String localizedTitle) { super((SkipInit) null); initObject(init(type, localizedTitle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "localizedSubtitle")
    public native String getLocalizedSubtitle();
    @Property(selector = "icon")
    public native UIApplicationShortcutIcon getIcon();
    @Property(selector = "userInfo")
    public native NSDictionary<NSString, ?> getUserInfo();
    @Property(selector = "targetContentIdentifier")
    public native NSObject getTargetContentIdentifier();
    /*</properties>*/
    public void setType(String v) {
        throw new UnsupportedOperationException("UIApplicationShortcutItem is immutable");
    }

    public void setLocalizedTitle(String v) {
        throw new UnsupportedOperationException("UIApplicationShortcutItem is immutable");
    }

    public void setLocalizedSubtitle(String v) {
        throw new UnsupportedOperationException("UIApplicationShortcutItem is immutable");
    }

    public void setIcon(UIApplicationShortcutIcon v) {
        throw new UnsupportedOperationException("UIApplicationShortcutItem is immutable");
    }

    public void setUserInfo(NSDictionary<NSString, ?> v) {
        throw new UnsupportedOperationException("UIApplicationShortcutItem is immutable");
    }
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithType:localizedTitle:localizedSubtitle:icon:userInfo:")
    protected native @Pointer long init(String type, String localizedTitle, String localizedSubtitle, UIApplicationShortcutIcon icon, NSDictionary<NSString, ?> userInfo);
    @Method(selector = "initWithType:localizedTitle:")
    protected native @Pointer long init(String type, String localizedTitle);
    /*</methods>*/
}
