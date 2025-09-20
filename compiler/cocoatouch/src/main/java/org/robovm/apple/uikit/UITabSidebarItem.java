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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabSidebarItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITabSidebarItemPtr extends Ptr<UITabSidebarItem, UITabSidebarItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabSidebarItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITabSidebarItem() {}
    protected UITabSidebarItem(Handle h, long handle) { super(h, handle); }
    protected UITabSidebarItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tab")
    public native UITab getTab();
    @Property(selector = "action")
    public native UIAction getAction();
    @Property(selector = "configurationState")
    public native UICellConfigurationState getConfigurationState();
    @Property(selector = "contentConfiguration")
    public native UIContentConfiguration getContentConfiguration();
    @Property(selector = "setContentConfiguration:")
    public native void setContentConfiguration(UIContentConfiguration v);
    @Property(selector = "backgroundConfiguration")
    public native UIBackgroundConfiguration getBackgroundConfiguration();
    @Property(selector = "setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(UIBackgroundConfiguration v);
    @Property(selector = "accessories")
    public native NSArray<UICellAccessory> getAccessories();
    @Property(selector = "setAccessories:")
    public native void setAccessories(NSArray<UICellAccessory> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();
    @Method(selector = "defaultBackgroundConfiguration")
    public native UIBackgroundConfiguration defaultBackgroundConfiguration();
    @Method(selector = "itemFromRequest:")
    public static native UITabSidebarItem itemFromRequest(UITabSidebarItemRequest request);
    /*</methods>*/
}
