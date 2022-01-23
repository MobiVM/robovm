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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UILabel/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIContentSizeCategoryAdjusting/*</implements>*/ {

    /*<ptr>*/public static class UILabelPtr extends Ptr<UILabel, UILabelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UILabel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UILabel() {}
    protected UILabel(Handle h, long handle) { super(h, handle); }
    protected UILabel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UILabel(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UILabel(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @Property(selector = "shadowColor")
    public native UIColor getShadowColor();
    @Property(selector = "setShadowColor:")
    public native void setShadowColor(UIColor v);
    @Property(selector = "shadowOffset")
    public native @ByVal CGSize getShadowOffset();
    @Property(selector = "setShadowOffset:")
    public native void setShadowOffset(@ByVal CGSize v);
    @Property(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @Property(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @Property(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "highlightedTextColor")
    public native UIColor getHighlightedTextColor();
    @Property(selector = "setHighlightedTextColor:")
    public native void setHighlightedTextColor(UIColor v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "numberOfLines")
    public native @MachineSizedSInt long getNumberOfLines();
    @Property(selector = "setNumberOfLines:")
    public native void setNumberOfLines(@MachineSizedSInt long v);
    @Property(selector = "adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();
    @Property(selector = "setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @Property(selector = "baselineAdjustment")
    public native UIBaselineAdjustment getBaselineAdjustment();
    @Property(selector = "setBaselineAdjustment:")
    public native void setBaselineAdjustment(UIBaselineAdjustment v);
    @Property(selector = "minimumScaleFactor")
    public native @MachineSizedFloat double getMinimumScaleFactor();
    @Property(selector = "setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean v);
    @Property(selector = "lineBreakStrategy")
    public native NSLineBreakStrategy getLineBreakStrategy();
    @Property(selector = "setLineBreakStrategy:")
    public native void setLineBreakStrategy(NSLineBreakStrategy v);
    @Property(selector = "preferredMaxLayoutWidth")
    public native @MachineSizedFloat double getPreferredMaxLayoutWidth();
    @Property(selector = "setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@MachineSizedFloat double v);
    @Property(selector = "showsExpansionTextWhenTruncated")
    public native boolean showsExpansionTextWhenTruncated();
    @Property(selector = "setShowsExpansionTextWhenTruncated:")
    public native void setShowsExpansionTextWhenTruncated(boolean v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "adjustsLetterSpacingToFitWidth")
    public native boolean adjustsLetterSpacingToFitWidth();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setAdjustsLetterSpacingToFitWidth:")
    public native void setAdjustsLetterSpacingToFitWidth(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();
    @Property(selector = "setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "textRectForBounds:limitedToNumberOfLines:")
    public native @ByVal CGRect getTextRect(@ByVal CGRect bounds, @MachineSizedSInt long numberOfLines);
    @Method(selector = "drawTextInRect:")
    public native void drawText(@ByVal CGRect rect);
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
