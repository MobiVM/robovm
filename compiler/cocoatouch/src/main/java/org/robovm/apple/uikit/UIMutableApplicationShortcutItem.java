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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMutableApplicationShortcutItem/*</name>*/ 
    extends /*<extends>*/UIApplicationShortcutItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIMutableApplicationShortcutItemPtr extends Ptr<UIMutableApplicationShortcutItem, UIMutableApplicationShortcutItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMutableApplicationShortcutItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIMutableApplicationShortcutItem(Handle h, long handle) { super(h, handle); }
    protected UIMutableApplicationShortcutItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithType:localizedTitle:localizedSubtitle:icon:userInfo:")
    public UIMutableApplicationShortcutItem(String type, String localizedTitle, String localizedSubtitle, UIApplicationShortcutIcon icon, NSDictionary<?, ?> userInfo) { super(type, localizedTitle, localizedSubtitle, icon, userInfo); }
    @Method(selector = "initWithType:localizedTitle:")
    public UIMutableApplicationShortcutItem(String type, String localizedTitle) { super(type, localizedTitle); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "setLocalizedTitle:")
    public native void setLocalizedTitle(String v);
    @Property(selector = "localizedSubtitle")
    public native String getLocalizedSubtitle();
    @Property(selector = "setLocalizedSubtitle:")
    public native void setLocalizedSubtitle(String v);
    @Property(selector = "icon")
    public native UIApplicationShortcutIcon getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(UIApplicationShortcutIcon v);
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
