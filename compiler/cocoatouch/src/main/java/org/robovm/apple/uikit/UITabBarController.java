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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBarController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITabBarDelegate, NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UITabBarControllerPtr extends Ptr<UITabBarController, UITabBarControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabBarController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITabBarController() {}
    protected UITabBarController(Handle h, long handle) { super(h, handle); }
    protected UITabBarController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithTabs:")
    public UITabBarController(NSArray<UITab> tabs) { super((SkipInit) null); initObject(init(tabs)); }
    @Method(selector = "initWithNibName:bundle:")
    public UITabBarController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public UITabBarController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UITabBarControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITabBarControllerDelegate v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "mode")
    public native UITabBarControllerMode getMode();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setMode:")
    public native void setMode(UITabBarControllerMode v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "sidebar")
    public native UITabBarControllerSidebar getSidebar();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "customizationIdentifier")
    public native String getCustomizationIdentifier();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setCustomizationIdentifier:")
    public native void setCustomizationIdentifier(String v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "compactTabIdentifiers")
    public native NSArray<NSString> getCompactTabIdentifiers();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setCompactTabIdentifiers:")
    public native void setCompactTabIdentifiers(NSArray<NSString> v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "selectedTab")
    public native UITab getSelectedTab();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setSelectedTab:")
    public native void setSelectedTab(UITab v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "tabs")
    public native NSArray<UITab> getTabs();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setTabs:")
    public native void setTabs(NSArray<UITab> v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "tabBarMinimizeBehavior")
    public native UITabBarMinimizeBehavior getTabBarMinimizeBehavior();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setTabBarMinimizeBehavior:")
    public native void setTabBarMinimizeBehavior(UITabBarMinimizeBehavior v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "isTabBarHidden")
    public native boolean isTabBarHidden();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setTabBarHidden:")
    public native void setTabBarHidden(boolean v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "contentLayoutGuide")
    public native UILayoutGuide getContentLayoutGuide();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "bottomAccessory")
    public native UITabAccessory getBottomAccessory();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setBottomAccessory:")
    public native void setBottomAccessory(UITabAccessory v);
    @Property(selector = "viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Property(selector = "setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Property(selector = "selectedViewController")
    public native UIViewController getSelectedViewController();
    @Property(selector = "setSelectedViewController:", strongRef = true)
    public native void setSelectedViewController(UIViewController v);
    @Property(selector = "selectedIndex")
    public native @MachineSizedUInt long getSelectedIndex();
    @Property(selector = "setSelectedIndex:")
    public native void setSelectedIndex(@MachineSizedUInt long v);
    @Property(selector = "moreNavigationController")
    public native UINavigationController getMoreNavigationController();
    @Property(selector = "customizableViewControllers")
    public native NSArray<UIViewController> getCustomizableViewControllers();
    @Property(selector = "setCustomizableViewControllers:")
    public native void setCustomizableViewControllers(NSArray<UIViewController> v);
    @Property(selector = "tabBar")
    public native UITabBar getTabBar();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "setTabs:animated:")
    public native void setTabs(NSArray<UITab> tabs, boolean animated);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "tabForIdentifier:")
    public native UITab tabForIdentifier(String identifier);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithTabs:")
    protected native @Pointer long init(NSArray<UITab> tabs);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "setTabBarHidden:animated:")
    public native void setTabBarHidden(boolean hidden, boolean animated);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "setBottomAccessory:animated:")
    public native void setBottomAccessory(UITabAccessory bottomAccessory, boolean animated);
    @Method(selector = "setViewControllers:animated:")
    public native void setViewControllers(NSArray<UIViewController> viewControllers, boolean animated);
    @Method(selector = "tabBar:didSelectItem:")
    public native void didSelectItem(UITabBar tabBar, UITabBarItem item);
    @Method(selector = "tabBar:willBeginCustomizingItems:")
    public native void willBeginCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items);
    @Method(selector = "tabBar:didBeginCustomizingItems:")
    public native void didBeginCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items);
    @Method(selector = "tabBar:willEndCustomizingItems:changed:")
    public native void willEndCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items, boolean changed);
    @Method(selector = "tabBar:didEndCustomizingItems:changed:")
    public native void didEndCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items, boolean changed);
    /*</methods>*/
}
