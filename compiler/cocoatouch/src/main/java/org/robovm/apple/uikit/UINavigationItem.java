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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UINavigationItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UINavigationItemPtr extends Ptr<UINavigationItem, UINavigationItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UINavigationItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UINavigationItem() {}
    protected UINavigationItem(Handle h, long handle) { super(h, handle); }
    protected UINavigationItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:")
    public UINavigationItem(String title) { super((SkipInit) null); initObject(init(title)); }
    @Method(selector = "initWithCoder:")
    public UINavigationItem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "titleView")
    public native UIView getTitleView();
    @Property(selector = "setTitleView:")
    public native void setTitleView(UIView v);
    @Property(selector = "prompt")
    public native String getPrompt();
    @Property(selector = "setPrompt:")
    public native void setPrompt(String v);
    @Property(selector = "backBarButtonItem")
    public native UIBarButtonItem getBackBarButtonItem();
    @Property(selector = "setBackBarButtonItem:")
    public native void setBackBarButtonItem(UIBarButtonItem v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "backButtonTitle")
    public native String getBackButtonTitle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setBackButtonTitle:")
    public native void setBackButtonTitle(String v);
    @Property(selector = "hidesBackButton")
    public native boolean hidesBackButton();
    @Property(selector = "setHidesBackButton:")
    public native void setHidesBackButton(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "backButtonDisplayMode")
    public native UINavigationItemBackButtonDisplayMode getBackButtonDisplayMode();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setBackButtonDisplayMode:")
    public native void setBackButtonDisplayMode(UINavigationItemBackButtonDisplayMode v);
    @Property(selector = "leftBarButtonItems")
    public native NSArray<UIBarButtonItem> getLeftBarButtonItems();
    @Property(selector = "setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "rightBarButtonItems")
    public native NSArray<UIBarButtonItem> getRightBarButtonItems();
    @Property(selector = "setRightBarButtonItems:")
    public native void setRightBarButtonItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "leftItemsSupplementBackButton")
    public native boolean leftItemsSupplementBackButton();
    @Property(selector = "setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean v);
    @Property(selector = "leftBarButtonItem")
    public native UIBarButtonItem getLeftBarButtonItem();
    @Property(selector = "setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(UIBarButtonItem v);
    @Property(selector = "rightBarButtonItem")
    public native UIBarButtonItem getRightBarButtonItem();
    @Property(selector = "setRightBarButtonItem:")
    public native void setRightBarButtonItem(UIBarButtonItem v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "largeTitleDisplayMode")
    public native UINavigationItemLargeTitleDisplayMode getLargeTitleDisplayMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLargeTitleDisplayMode:")
    public native void setLargeTitleDisplayMode(UINavigationItemLargeTitleDisplayMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "searchController")
    public native UISearchController getSearchController();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSearchController:")
    public native void setSearchController(UISearchController v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hidesSearchBarWhenScrolling")
    public native boolean hidesSearchBarWhenScrolling();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setHidesSearchBarWhenScrolling:")
    public native void setHidesSearchBarWhenScrolling(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "standardAppearance")
    public native UINavigationBarAppearance getStandardAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setStandardAppearance:")
    public native void setStandardAppearance(UINavigationBarAppearance v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "compactAppearance")
    public native UINavigationBarAppearance getCompactAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCompactAppearance:")
    public native void setCompactAppearance(UINavigationBarAppearance v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "scrollEdgeAppearance")
    public native UINavigationBarAppearance getScrollEdgeAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UINavigationBarAppearance v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "compactScrollEdgeAppearance")
    public native UINavigationBarAppearance getCompactScrollEdgeAppearance();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setCompactScrollEdgeAppearance:")
    public native void setCompactScrollEdgeAppearance(UINavigationBarAppearance v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:")
    protected native @Pointer long init(String title);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "setHidesBackButton:animated:")
    public native void setHidesBackButton(boolean hidesBackButton, boolean animated);
    @Method(selector = "setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItems(NSArray<UIBarButtonItem> items, boolean animated);
    @Method(selector = "setRightBarButtonItems:animated:")
    public native void setRightBarButtonItems(NSArray<UIBarButtonItem> items, boolean animated);
    @Method(selector = "setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItem(UIBarButtonItem item, boolean animated);
    @Method(selector = "setRightBarButtonItem:animated:")
    public native void setRightBarButtonItem(UIBarButtonItem item, boolean animated);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
