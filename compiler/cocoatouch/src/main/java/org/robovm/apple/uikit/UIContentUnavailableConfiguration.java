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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIContentUnavailableConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIContentConfiguration, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIContentUnavailableConfigurationPtr extends Ptr<UIContentUnavailableConfiguration, UIContentUnavailableConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIContentUnavailableConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIContentUnavailableConfiguration() {}
    protected UIContentUnavailableConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIContentUnavailableConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIContentUnavailableConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "imageProperties")
    public native UIContentUnavailableImageProperties getImageProperties();
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "textProperties")
    public native UIContentUnavailableTextProperties getTextProperties();
    @Property(selector = "secondaryText")
    public native String getSecondaryText();
    @Property(selector = "setSecondaryText:")
    public native void setSecondaryText(String v);
    @Property(selector = "secondaryAttributedText")
    public native NSAttributedString getSecondaryAttributedText();
    @Property(selector = "setSecondaryAttributedText:")
    public native void setSecondaryAttributedText(NSAttributedString v);
    @Property(selector = "secondaryTextProperties")
    public native UIContentUnavailableTextProperties getSecondaryTextProperties();
    @Property(selector = "button")
    public native UIButtonConfiguration getButton();
    @Property(selector = "setButton:")
    public native void setButton(UIButtonConfiguration v);
    @Property(selector = "buttonProperties")
    public native UIContentUnavailableButtonProperties getButtonProperties();
    @Property(selector = "secondaryButton")
    public native UIButtonConfiguration getSecondaryButton();
    @Property(selector = "setSecondaryButton:")
    public native void setSecondaryButton(UIButtonConfiguration v);
    @Property(selector = "secondaryButtonProperties")
    public native UIContentUnavailableButtonProperties getSecondaryButtonProperties();
    @Property(selector = "alignment")
    public native UIContentUnavailableAlignment getAlignment();
    @Property(selector = "setAlignment:")
    public native void setAlignment(UIContentUnavailableAlignment v);
    @Property(selector = "axesPreservingSuperviewLayoutMargins")
    public native UIAxis getAxesPreservingSuperviewLayoutMargins();
    @Property(selector = "setAxesPreservingSuperviewLayoutMargins:")
    public native void setAxesPreservingSuperviewLayoutMargins(UIAxis v);
    @Property(selector = "directionalLayoutMargins")
    public native @ByVal NSDirectionalEdgeInsets getDirectionalLayoutMargins();
    @Property(selector = "setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "imageToTextPadding")
    public native @MachineSizedFloat double getImageToTextPadding();
    @Property(selector = "setImageToTextPadding:")
    public native void setImageToTextPadding(@MachineSizedFloat double v);
    @Property(selector = "textToSecondaryTextPadding")
    public native @MachineSizedFloat double getTextToSecondaryTextPadding();
    @Property(selector = "setTextToSecondaryTextPadding:")
    public native void setTextToSecondaryTextPadding(@MachineSizedFloat double v);
    @Property(selector = "textToButtonPadding")
    public native @MachineSizedFloat double getTextToButtonPadding();
    @Property(selector = "setTextToButtonPadding:")
    public native void setTextToButtonPadding(@MachineSizedFloat double v);
    @Property(selector = "buttonToSecondaryButtonPadding")
    public native @MachineSizedFloat double getButtonToSecondaryButtonPadding();
    @Property(selector = "setButtonToSecondaryButtonPadding:")
    public native void setButtonToSecondaryButtonPadding(@MachineSizedFloat double v);
    @Property(selector = "background")
    public native UIBackgroundConfiguration getBackground();
    @Property(selector = "setBackground:")
    public native void setBackground(UIBackgroundConfiguration v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "emptyConfiguration")
    public static native UIContentUnavailableConfiguration emptyConfiguration();
    @Method(selector = "loadingConfiguration")
    public static native UIContentUnavailableConfiguration loadingConfiguration();
    @Method(selector = "searchConfiguration")
    public static native UIContentUnavailableConfiguration searchConfiguration();
    @Method(selector = "makeContentView")
    public native UIView makeContentView();
    @Method(selector = "updatedConfigurationForState:")
    public native UIContentUnavailableConfiguration updatedConfigurationForState(UIConfigurationState state);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
