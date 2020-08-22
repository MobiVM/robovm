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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIButton/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements NSCoding, UISpringLoadedInteractionSupporting, UIAccessibilityContentSizeCategoryImageAdjusting/*</implements>*/ {

    /*<ptr>*/public static class UIButtonPtr extends Ptr<UIButton, UIButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIButton() {}
    protected UIButton(Handle h, long handle) { super(h, handle); }
    protected UIButton(SkipInit skipInit) { super(skipInit); }
    public UIButton(UIButtonType buttonType) { super((Handle) null, create0(buttonType)); retain(getHandle()); }
    @Method(selector = "initWithFrame:")
    public UIButton(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIButton(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentEdgeInsets")
    public native @ByVal UIEdgeInsets getContentEdgeInsets();
    @Property(selector = "setContentEdgeInsets:")
    public native void setContentEdgeInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "titleEdgeInsets")
    public native @ByVal UIEdgeInsets getTitleEdgeInsets();
    @Property(selector = "setTitleEdgeInsets:")
    public native void setTitleEdgeInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "reversesTitleShadowWhenHighlighted")
    public native boolean reversesTitleShadowWhenHighlighted();
    @Property(selector = "setReversesTitleShadowWhenHighlighted:")
    public native void setReversesTitleShadowWhenHighlighted(boolean v);
    @Property(selector = "imageEdgeInsets")
    public native @ByVal UIEdgeInsets getImageEdgeInsets();
    @Property(selector = "setImageEdgeInsets:")
    public native void setImageEdgeInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "adjustsImageWhenHighlighted")
    public native boolean adjustsImageWhenHighlighted();
    @Property(selector = "setAdjustsImageWhenHighlighted:")
    public native void setAdjustsImageWhenHighlighted(boolean v);
    @Property(selector = "adjustsImageWhenDisabled")
    public native boolean adjustsImageWhenDisabled();
    @Property(selector = "setAdjustsImageWhenDisabled:")
    public native void setAdjustsImageWhenDisabled(boolean v);
    @Property(selector = "showsTouchWhenHighlighted")
    public native boolean showsTouchWhenHighlighted();
    @Property(selector = "setShowsTouchWhenHighlighted:")
    public native void setShowsTouchWhenHighlighted(boolean v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "buttonType")
    public native UIButtonType getButtonType();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "isPointerInteractionEnabled")
    public native boolean isPointerInteractionEnabled();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "setPointerInteractionEnabled:")
    public native void setPointerInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "pointerStyleProvider")
    public native @Block Block3<UIButton, UIPointerEffect, UIPointerShape, UIPointerStyle> getPointerStyleProvider();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "setPointerStyleProvider:")
    public native void setPointerStyleProvider(@Block Block3<UIButton, UIPointerEffect, UIPointerShape, UIPointerStyle> v);
    @Property(selector = "currentTitle")
    public native String getCurrentTitle();
    @Property(selector = "currentTitleColor")
    public native UIColor getCurrentTitleColor();
    @Property(selector = "currentTitleShadowColor")
    public native UIColor getCurrentTitleShadowColor();
    @Property(selector = "currentImage")
    public native UIImage getCurrentImage();
    @Property(selector = "currentBackgroundImage")
    public native UIImage getCurrentBackgroundImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "currentPreferredSymbolConfiguration")
    public native UIImageSymbolConfiguration getCurrentPreferredSymbolConfiguration();
    @Property(selector = "currentAttributedTitle")
    public native NSAttributedString getCurrentAttributedTitle();
    @Property(selector = "titleLabel")
    public native UILabel getTitleLabel();
    @Property(selector = "imageView")
    public native UIImageView getImageView();
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
    @Property(selector = "adjustsImageSizeForAccessibilityContentSizeCategory")
    public native boolean adjustsImageSizeForAccessibilityContentSizeCategory();
    @Property(selector = "setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    public native void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setTitle:forState:")
    public native void setTitle(String title, UIControlState state);
    @Method(selector = "setTitleColor:forState:")
    public native void setTitleColor(UIColor color, UIControlState state);
    @Method(selector = "setTitleShadowColor:forState:")
    public native void setTitleShadowColor(UIColor color, UIControlState state);
    @Method(selector = "setImage:forState:")
    public native void setImage(UIImage image, UIControlState state);
    @Method(selector = "setBackgroundImage:forState:")
    public native void setBackgroundImage(UIImage image, UIControlState state);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setPreferredSymbolConfiguration:forImageInState:")
    public native void setPreferredSymbolConfiguration(UIImageSymbolConfiguration configuration, UIControlState state);
    @Method(selector = "setAttributedTitle:forState:")
    public native void setAttributedTitle(NSAttributedString title, UIControlState state);
    @Method(selector = "titleForState:")
    public native String getTitle(UIControlState state);
    @Method(selector = "titleColorForState:")
    public native UIColor getTitleColor(UIControlState state);
    @Method(selector = "titleShadowColorForState:")
    public native UIColor getTitleShadowColor(UIControlState state);
    @Method(selector = "imageForState:")
    public native UIImage getImage(UIControlState state);
    @Method(selector = "backgroundImageForState:")
    public native UIImage getBackgroundImage(UIControlState state);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "preferredSymbolConfigurationForImageInState:")
    public native UIImageSymbolConfiguration preferredSymbolConfigurationForImageInState(UIControlState state);
    @Method(selector = "attributedTitleForState:")
    public native NSAttributedString getAttributedTitle(UIControlState state);
    @Method(selector = "backgroundRectForBounds:")
    public native @ByVal CGRect getBackgroundRect(@ByVal CGRect bounds);
    @Method(selector = "contentRectForBounds:")
    public native @ByVal CGRect getContentRect(@ByVal CGRect bounds);
    @Method(selector = "titleRectForContentRect:")
    public native @ByVal CGRect getTitleRect(@ByVal CGRect contentRect);
    @Method(selector = "imageRectForContentRect:")
    public native @ByVal CGRect getImageRect(@ByVal CGRect contentRect);
    @Method(selector = "buttonWithType:")
    protected static native @Pointer long create0(UIButtonType buttonType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "systemButtonWithImage:target:action:")
    public static native UIButton getSystemButtonWithImage(UIImage image, NSObject target, Selector action);
    /*</methods>*/
}
