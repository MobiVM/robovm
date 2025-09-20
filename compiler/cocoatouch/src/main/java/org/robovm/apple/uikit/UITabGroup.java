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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabGroup/*</name>*/ 
    extends /*<extends>*/UITab/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITabGroupPtr extends Ptr<UITabGroup, UITabGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITabGroup() {}
    protected UITabGroup(Handle h, long handle) { super(h, handle); }
    protected UITabGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:image:identifier:children:viewControllerProvider:")
    public UITabGroup(String title, UIImage image, String identifier, NSArray<UITab> children, @Block Block1<UITab, UIViewController> viewControllerProvider) { super((SkipInit) null); initObject(init(title, image, identifier, children, viewControllerProvider)); }
    @Method(selector = "initWithTitle:image:identifier:viewControllerProvider:")
    public UITabGroup(String title, UIImage image, String identifier, @Block Block1<UITab, UIViewController> viewControllerProvider) { super(title, image, identifier, viewControllerProvider); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "selectedChild")
    public native UITab getSelectedChild();
    @Property(selector = "setSelectedChild:")
    public native void setSelectedChild(UITab v);
    @Property(selector = "defaultChildIdentifier")
    public native String getDefaultChildIdentifier();
    @Property(selector = "setDefaultChildIdentifier:")
    public native void setDefaultChildIdentifier(String v);
    @Property(selector = "children")
    public native NSArray<UITab> getChildren();
    @Property(selector = "setChildren:")
    public native void setChildren(NSArray<UITab> v);
    @Property(selector = "displayOrderIdentifiers")
    public native NSArray<NSString> getDisplayOrderIdentifiers();
    @Property(selector = "setDisplayOrderIdentifiers:")
    public native void setDisplayOrderIdentifiers(NSArray<NSString> v);
    @Property(selector = "allowsReordering")
    public native boolean allowsReordering();
    @Property(selector = "setAllowsReordering:")
    public native void setAllowsReordering(boolean v);
    @Property(selector = "displayOrder")
    public native NSArray<UITab> getDisplayOrder();
    @Property(selector = "managingNavigationController")
    public native UINavigationController getManagingNavigationController();
    @Property(selector = "setManagingNavigationController:")
    public native void setManagingNavigationController(UINavigationController v);
    @Property(selector = "sidebarActions")
    public native NSArray<UIAction> getSidebarActions();
    @Property(selector = "setSidebarActions:")
    public native void setSidebarActions(NSArray<UIAction> v);
    @Property(selector = "sidebarAppearance")
    public native UITabGroupSidebarAppearance getSidebarAppearance();
    @Property(selector = "setSidebarAppearance:")
    public native void setSidebarAppearance(UITabGroupSidebarAppearance v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "tabForIdentifier:")
    public native UITab tabForIdentifier(String identifier);
    @Method(selector = "initWithTitle:image:identifier:children:viewControllerProvider:")
    protected native @Pointer long init(String title, UIImage image, String identifier, NSArray<UITab> children, @Block Block1<UITab, UIViewController> viewControllerProvider);
    /*</methods>*/
}
