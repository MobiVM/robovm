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
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBarItem/*</name>*/ 
    extends /*<extends>*/UIBarItem/*</extends>*/ 
    /*<implements>*/implements UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UITabBarItemPtr extends Ptr<UITabBarItem, UITabBarItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabBarItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITabBarItem() {}
    protected UITabBarItem(Handle h, long handle) { super(h, handle); }
    protected UITabBarItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UITabBarItem(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    @Method(selector = "initWithTitle:image:tag:")
    public UITabBarItem(String title, UIImage image, @MachineSizedSInt long tag) { super((SkipInit) null); initObject(init(title, image, tag)); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithTitle:image:selectedImage:")
    public UITabBarItem(String title, UIImage image, UIImage selectedImage) { super((SkipInit) null); initObject(init(title, image, selectedImage)); }
    @Method(selector = "initWithTabBarSystemItem:tag:")
    public UITabBarItem(UITabBarSystemItem systemItem, @MachineSizedSInt long tag) { super((SkipInit) null); initObject(init(systemItem, tag)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "selectedImage")
    public native UIImage getSelectedImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setSelectedImage:")
    public native void setSelectedImage(UIImage v);
    @Property(selector = "badgeValue")
    public native String getBadgeValue();
    @Property(selector = "setBadgeValue:")
    public native void setBadgeValue(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "titlePositionAdjustment")
    public native @ByVal UIOffset getTitlePositionAdjustment();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByVal UIOffset v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "badgeColor")
    public native UIColor getBadgeColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setBadgeColor:")
    public native void setBadgeColor(UIColor v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "initWithTitle:image:tag:")
    protected native @Pointer long init(String title, UIImage image, @MachineSizedSInt long tag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithTitle:image:selectedImage:")
    protected native @Pointer long init(String title, UIImage image, UIImage selectedImage);
    @Method(selector = "initWithTabBarSystemItem:tag:")
    protected native @Pointer long init(UITabBarSystemItem systemItem, @MachineSizedSInt long tag);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0. Use initWithTitle:image:selectedImage: or the image and selectedImage properties along with UIImageRenderingModeAlwaysOriginal
     */
    @Deprecated
    @Method(selector = "setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedImages(UIImage selectedImage, UIImage unselectedImage);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "finishedSelectedImage")
    public native UIImage getFinishedSelectedImage();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "finishedUnselectedImage")
    public native UIImage getFinishedUnselectedImage();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setBadgeTextAttributes:forState:")
    public native void setBadgeTextAttributes(NSDictionary<NSString, ?> textAttributes, UIControlState state);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "badgeTextAttributesForState:")
    public native NSDictionary<NSString, ?> getBadgeTextAttributes(UIControlState state);
    /*</methods>*/
}
