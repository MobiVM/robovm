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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITab/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIPopoverPresentationControllerSourceItem, UISpringLoadedInteractionSupporting, UIAccessibilityIdentification/*</implements>*/ {

    /*<ptr>*/public static class UITabPtr extends Ptr<UITab, UITabPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITab.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITab() {}
    protected UITab(Handle h, long handle) { super(h, handle); }
    protected UITab(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:image:identifier:viewControllerProvider:")
    public UITab(String title, UIImage image, String identifier, @Block Block1<UITab, UIViewController> viewControllerProvider) { super((SkipInit) null); initObject(init(title, image, identifier, viewControllerProvider)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "badgeValue")
    public native String getBadgeValue();
    @Property(selector = "setBadgeValue:")
    public native void setBadgeValue(String v);
    @Property(selector = "preferredPlacement")
    public native UITabPlacement getPreferredPlacement();
    @Property(selector = "setPreferredPlacement:")
    public native void setPreferredPlacement(UITabPlacement v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "parent")
    public native UITabGroup getParent();
    @Property(selector = "tabBarController")
    public native UITabBarController getTabBarController();
    @Property(selector = "viewController")
    public native UIViewController getViewController();
    @Property(selector = "managingTabGroup")
    public native UITabGroup getManagingTabGroup();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "isHiddenByDefault")
    public native boolean isHiddenByDefault();
    @Property(selector = "setHiddenByDefault:")
    public native void setHiddenByDefault(boolean v);
    @Property(selector = "allowsHiding")
    public native boolean allowsHiding();
    @Property(selector = "setAllowsHiding:")
    public native void setAllowsHiding(boolean v);
    @Property(selector = "hasVisiblePlacement")
    public native boolean hasVisiblePlacement();
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:image:identifier:viewControllerProvider:")
    protected native @Pointer long init(String title, UIImage image, String identifier, @Block Block1<UITab, UIViewController> viewControllerProvider);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "frameInView:")
    public native @ByVal CGRect frameInView(UIView referenceView);
    /*</methods>*/
}
