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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIListContentConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIContentConfiguration, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIListContentConfigurationPtr extends Ptr<UIListContentConfiguration, UIListContentConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIListContentConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIListContentConfiguration() {}
    protected UIListContentConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIListContentConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIListContentConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "imageProperties")
    public native UIListContentImageProperties getImageProperties();
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "textProperties")
    public native UIListContentTextProperties getTextProperties();
    @Property(selector = "secondaryText")
    public native String getSecondaryText();
    @Property(selector = "setSecondaryText:")
    public native void setSecondaryText(String v);
    @Property(selector = "secondaryAttributedText")
    public native NSAttributedString getSecondaryAttributedText();
    @Property(selector = "setSecondaryAttributedText:")
    public native void setSecondaryAttributedText(NSAttributedString v);
    @Property(selector = "secondaryTextProperties")
    public native UIListContentTextProperties getSecondaryTextProperties();
    @Property(selector = "axesPreservingSuperviewLayoutMargins")
    public native UIAxis getAxesPreservingSuperviewLayoutMargins();
    @Property(selector = "setAxesPreservingSuperviewLayoutMargins:")
    public native void setAxesPreservingSuperviewLayoutMargins(UIAxis v);
    @Property(selector = "directionalLayoutMargins")
    public native @ByVal NSDirectionalEdgeInsets getDirectionalLayoutMargins();
    @Property(selector = "setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "prefersSideBySideTextAndSecondaryText")
    public native boolean prefersSideBySideTextAndSecondaryText();
    @Property(selector = "setPrefersSideBySideTextAndSecondaryText:")
    public native void setPrefersSideBySideTextAndSecondaryText(boolean v);
    @Property(selector = "imageToTextPadding")
    public native @MachineSizedFloat double getImageToTextPadding();
    @Property(selector = "setImageToTextPadding:")
    public native void setImageToTextPadding(@MachineSizedFloat double v);
    @Property(selector = "textToSecondaryTextHorizontalPadding")
    public native @MachineSizedFloat double getTextToSecondaryTextHorizontalPadding();
    @Property(selector = "setTextToSecondaryTextHorizontalPadding:")
    public native void setTextToSecondaryTextHorizontalPadding(@MachineSizedFloat double v);
    @Property(selector = "textToSecondaryTextVerticalPadding")
    public native @MachineSizedFloat double getTextToSecondaryTextVerticalPadding();
    @Property(selector = "setTextToSecondaryTextVerticalPadding:")
    public native void setTextToSecondaryTextVerticalPadding(@MachineSizedFloat double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cellConfiguration")
    public static native UIListContentConfiguration cellConfiguration();
    @Method(selector = "subtitleCellConfiguration")
    public static native UIListContentConfiguration subtitleCellConfiguration();
    @Method(selector = "valueCellConfiguration")
    public static native UIListContentConfiguration valueCellConfiguration();
    @Method(selector = "plainHeaderConfiguration")
    public static native UIListContentConfiguration plainHeaderConfiguration();
    @Method(selector = "plainFooterConfiguration")
    public static native UIListContentConfiguration plainFooterConfiguration();
    @Method(selector = "groupedHeaderConfiguration")
    public static native UIListContentConfiguration groupedHeaderConfiguration();
    @Method(selector = "groupedFooterConfiguration")
    public static native UIListContentConfiguration groupedFooterConfiguration();
    @Method(selector = "sidebarCellConfiguration")
    public static native UIListContentConfiguration sidebarCellConfiguration();
    @Method(selector = "sidebarSubtitleCellConfiguration")
    public static native UIListContentConfiguration sidebarSubtitleCellConfiguration();
    @Method(selector = "accompaniedSidebarCellConfiguration")
    public static native UIListContentConfiguration accompaniedSidebarCellConfiguration();
    @Method(selector = "accompaniedSidebarSubtitleCellConfiguration")
    public static native UIListContentConfiguration accompaniedSidebarSubtitleCellConfiguration();
    @Method(selector = "sidebarHeaderConfiguration")
    public static native UIListContentConfiguration sidebarHeaderConfiguration();
    @Method(selector = "makeContentView")
    public native UIView makeContentView();
    @Method(selector = "updatedConfigurationForState:")
    public native UIListContentConfiguration updatedConfigurationForState(UIConfigurationState state);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
