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
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIButtonConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIButtonConfigurationPtr extends Ptr<UIButtonConfiguration, UIButtonConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIButtonConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIButtonConfiguration() {}
    protected UIButtonConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIButtonConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIButtonConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "background")
    public native UIBackgroundConfiguration getBackground();
    @Property(selector = "setBackground:")
    public native void setBackground(UIBackgroundConfiguration v);
    @Property(selector = "cornerStyle")
    public native UIButtonConfigurationCornerStyle getCornerStyle();
    @Property(selector = "setCornerStyle:")
    public native void setCornerStyle(UIButtonConfigurationCornerStyle v);
    @Property(selector = "buttonSize")
    public native UIButtonConfigurationSize getButtonSize();
    @Property(selector = "setButtonSize:")
    public native void setButtonSize(UIButtonConfigurationSize v);
    @Property(selector = "macIdiomStyle")
    public native UIButtonConfigurationMacIdiomStyle getMacIdiomStyle();
    @Property(selector = "setMacIdiomStyle:")
    public native void setMacIdiomStyle(UIButtonConfigurationMacIdiomStyle v);
    @Property(selector = "baseForegroundColor")
    public native UIColor getBaseForegroundColor();
    @Property(selector = "setBaseForegroundColor:")
    public native void setBaseForegroundColor(UIColor v);
    @Property(selector = "baseBackgroundColor")
    public native UIColor getBaseBackgroundColor();
    @Property(selector = "setBaseBackgroundColor:")
    public native void setBaseBackgroundColor(UIColor v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "imageColorTransformer")
    public native @Block Block1<UIColor, UIColor> getImageColorTransformer();
    @Property(selector = "setImageColorTransformer:")
    public native void setImageColorTransformer(@Block Block1<UIColor, UIColor> v);
    @Property(selector = "preferredSymbolConfigurationForImage")
    public native UIImageSymbolConfiguration getPreferredSymbolConfigurationForImage();
    @Property(selector = "setPreferredSymbolConfigurationForImage:")
    public native void setPreferredSymbolConfigurationForImage(UIImageSymbolConfiguration v);
    @Property(selector = "showsActivityIndicator")
    public native boolean showsActivityIndicator();
    @Property(selector = "setShowsActivityIndicator:")
    public native void setShowsActivityIndicator(boolean v);
    @Property(selector = "activityIndicatorColorTransformer")
    public native @Block Block1<UIColor, UIColor> getActivityIndicatorColorTransformer();
    @Property(selector = "setActivityIndicatorColorTransformer:")
    public native void setActivityIndicatorColorTransformer(@Block Block1<UIColor, UIColor> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Property(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    @Property(selector = "titleTextAttributesTransformer")
    public native @Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> getTitleTextAttributesTransformer();
    @Property(selector = "setTitleTextAttributesTransformer:")
    public native void setTitleTextAttributesTransformer(@Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> v);
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "attributedSubtitle")
    public native NSAttributedString getAttributedSubtitle();
    @Property(selector = "setAttributedSubtitle:")
    public native void setAttributedSubtitle(NSAttributedString v);
    @Property(selector = "subtitleTextAttributesTransformer")
    public native @Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> getSubtitleTextAttributesTransformer();
    @Property(selector = "setSubtitleTextAttributesTransformer:")
    public native void setSubtitleTextAttributesTransformer(@Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> v);
    @Property(selector = "contentInsets")
    public native @ByVal NSDirectionalEdgeInsets getContentInsets();
    @Property(selector = "setContentInsets:")
    public native void setContentInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "imagePlacement")
    public native NSDirectionalRectEdge getImagePlacement();
    @Property(selector = "setImagePlacement:")
    public native void setImagePlacement(NSDirectionalRectEdge v);
    @Property(selector = "imagePadding")
    public native @MachineSizedFloat double getImagePadding();
    @Property(selector = "setImagePadding:")
    public native void setImagePadding(@MachineSizedFloat double v);
    @Property(selector = "titlePadding")
    public native @MachineSizedFloat double getTitlePadding();
    @Property(selector = "setTitlePadding:")
    public native void setTitlePadding(@MachineSizedFloat double v);
    @Property(selector = "titleAlignment")
    public native UIButtonConfigurationTitleAlignment getTitleAlignment();
    @Property(selector = "setTitleAlignment:")
    public native void setTitleAlignment(UIButtonConfigurationTitleAlignment v);
    @Property(selector = "automaticallyUpdateForSelection")
    public native boolean automaticallyUpdateForSelection();
    @Property(selector = "setAutomaticallyUpdateForSelection:")
    public native void setAutomaticallyUpdateForSelection(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updatedConfigurationForButton:")
    public native UIButtonConfiguration updatedConfigurationForButton(UIButton button);
    @Method(selector = "setDefaultContentInsets")
    public native void setDefaultContentInsets();
    @Method(selector = "plainButtonConfiguration")
    public static native UIButtonConfiguration plainButtonConfiguration();
    @Method(selector = "tintedButtonConfiguration")
    public static native UIButtonConfiguration tintedButtonConfiguration();
    @Method(selector = "grayButtonConfiguration")
    public static native UIButtonConfiguration grayButtonConfiguration();
    @Method(selector = "filledButtonConfiguration")
    public static native UIButtonConfiguration filledButtonConfiguration();
    @Method(selector = "borderlessButtonConfiguration")
    public static native UIButtonConfiguration borderlessButtonConfiguration();
    @Method(selector = "borderedButtonConfiguration")
    public static native UIButtonConfiguration borderedButtonConfiguration();
    @Method(selector = "borderedTintedButtonConfiguration")
    public static native UIButtonConfiguration borderedTintedButtonConfiguration();
    @Method(selector = "borderedProminentButtonConfiguration")
    public static native UIButtonConfiguration borderedProminentButtonConfiguration();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
