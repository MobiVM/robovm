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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIToolbar/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIBarPositioning/*</implements>*/ {

    /*<ptr>*/public static class UIToolbarPtr extends Ptr<UIToolbar, UIToolbarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIToolbar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIToolbar() {}
    protected UIToolbar(Handle h, long handle) { super(h, handle); }
    protected UIToolbar(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIToolbar(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIToolbar(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @Property(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @Property(selector = "items")
    public native NSArray<UIBarButtonItem> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "isTranslucent")
    public native boolean isTranslucent();
    @Property(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "barTintColor")
    public native UIColor getBarTintColor();
    @Property(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "standardAppearance")
    public native UIToolbarAppearance getStandardAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setStandardAppearance:")
    public native void setStandardAppearance(UIToolbarAppearance v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "compactAppearance")
    public native UIToolbarAppearance getCompactAppearance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCompactAppearance:")
    public native void setCompactAppearance(UIToolbarAppearance v);
    @Property(selector = "delegate")
    public native UIToolbarDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIToolbarDelegate v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setItems:animated:")
    public native void setItems(NSArray<UIBarButtonItem> items, boolean animated);
    @Method(selector = "setBackgroundImage:forToolbarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIBarPosition topOrBottom, UIBarMetrics barMetrics);
    @Method(selector = "backgroundImageForToolbarPosition:barMetrics:")
    public native UIImage getBackgroundImage(UIBarPosition topOrBottom, UIBarMetrics barMetrics);
    @Method(selector = "setShadowImage:forToolbarPosition:")
    public native void setShadowImage(UIImage shadowImage, UIBarPosition topOrBottom);
    @Method(selector = "shadowImageForToolbarPosition:")
    public native UIImage getShadowImage(UIBarPosition topOrBottom);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
