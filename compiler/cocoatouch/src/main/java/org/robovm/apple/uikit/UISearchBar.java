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
import org.robovm.apple.corefoundation.CFDictionary;
import org.robovm.apple.coremedia.CMTextMarkupAttributes;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISearchBar/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIBarPositioning, UITextInputTraits, UILookToDictateCapable/*</implements>*/ {

    /*<ptr>*/public static class UISearchBarPtr extends Ptr<UISearchBar, UISearchBarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISearchBar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISearchBar() {}
    protected UISearchBar(Handle h, long handle) { super(h, handle); }
    protected UISearchBar(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UISearchBar(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UISearchBar(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @Property(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @Property(selector = "delegate")
    public native UISearchBarDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISearchBarDelegate v);
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "prompt")
    public native String getPrompt();
    @Property(selector = "setPrompt:")
    public native void setPrompt(String v);
    @Property(selector = "placeholder")
    public native String getPlaceholder();
    @Property(selector = "setPlaceholder:")
    public native void setPlaceholder(String v);
    @Property(selector = "showsBookmarkButton")
    public native boolean showsBookmarkButton();
    @Property(selector = "setShowsBookmarkButton:")
    public native void setShowsBookmarkButton(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "searchTextField")
    public native UISearchTextField getSearchTextField();
    @Property(selector = "showsCancelButton")
    public native boolean showsCancelButton();
    @Property(selector = "setShowsCancelButton:")
    public native void setShowsCancelButton(boolean v);
    @Property(selector = "showsSearchResultsButton")
    public native boolean showsSearchResultsButton();
    @Property(selector = "setShowsSearchResultsButton:")
    public native void setShowsSearchResultsButton(boolean v);
    @Property(selector = "isSearchResultsButtonSelected")
    public native boolean isSearchResultsButtonSelected();
    @Property(selector = "setSearchResultsButtonSelected:")
    public native void setSearchResultsButtonSelected(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "inputAssistantItem")
    public native UITextInputAssistantItem getInputAssistantItem();
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "barTintColor")
    public native UIColor getBarTintColor();
    @Property(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    @Property(selector = "searchBarStyle")
    public native UISearchBarStyle getSearchBarStyle();
    @Property(selector = "setSearchBarStyle:")
    public native void setSearchBarStyle(UISearchBarStyle v);
    @Property(selector = "isTranslucent")
    public native boolean isTranslucent();
    @Property(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @Property(selector = "scopeButtonTitles")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getScopeButtonTitles();
    @Property(selector = "setScopeButtonTitles:")
    public native void setScopeButtonTitles(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "selectedScopeButtonIndex")
    public native @MachineSizedSInt long getSelectedScopeButtonIndex();
    @Property(selector = "setSelectedScopeButtonIndex:")
    public native void setSelectedScopeButtonIndex(@MachineSizedSInt long v);
    @Property(selector = "showsScopeBar")
    public native boolean showsScopeBar();
    @Property(selector = "setShowsScopeBar:")
    public native void setShowsScopeBar(boolean v);
    @Property(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    @Property(selector = "setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    @Property(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    @Property(selector = "scopeBarBackgroundImage")
    public native UIImage getScopeBarBackgroundImage();
    @Property(selector = "setScopeBarBackgroundImage:")
    public native void setScopeBarBackgroundImage(UIImage v);
    @Property(selector = "searchFieldBackgroundPositionAdjustment")
    public native @ByVal UIOffset getSearchFieldBackgroundPositionAdjustment();
    @Property(selector = "setSearchFieldBackgroundPositionAdjustment:")
    public native void setSearchFieldBackgroundPositionAdjustment(@ByVal UIOffset v);
    @Property(selector = "searchTextPositionAdjustment")
    public native @ByVal UIOffset getSearchTextPositionAdjustment();
    @Property(selector = "setSearchTextPositionAdjustment:")
    public native void setSearchTextPositionAdjustment(@ByVal UIOffset v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isLookToDictateEnabled")
    public native boolean isLookToDictateEnabled();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setLookToDictateEnabled:")
    public native void setLookToDictateEnabled(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    @Property(selector = "autocapitalizationType")
    public native UITextAutocapitalizationType getAutocapitalizationType();
    @Property(selector = "setAutocapitalizationType:")
    public native void setAutocapitalizationType(UITextAutocapitalizationType v);
    @Property(selector = "autocorrectionType")
    public native UITextAutocorrectionType getAutocorrectionType();
    @Property(selector = "setAutocorrectionType:")
    public native void setAutocorrectionType(UITextAutocorrectionType v);
    @Property(selector = "spellCheckingType")
    public native UITextSpellCheckingType getSpellCheckingType();
    @Property(selector = "setSpellCheckingType:")
    public native void setSpellCheckingType(UITextSpellCheckingType v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "smartQuotesType")
    public native UITextSmartQuotesType getSmartQuotesType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSmartQuotesType:")
    public native void setSmartQuotesType(UITextSmartQuotesType v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "smartDashesType")
    public native UITextSmartDashesType getSmartDashesType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSmartDashesType:")
    public native void setSmartDashesType(UITextSmartDashesType v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "smartInsertDeleteType")
    public native UITextSmartInsertDeleteType getSmartInsertDeleteType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSmartInsertDeleteType:")
    public native void setSmartInsertDeleteType(UITextSmartInsertDeleteType v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "inlinePredictionType")
    public native UITextInlinePredictionType getInlinePredictionType();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setInlinePredictionType:")
    public native void setInlinePredictionType(UITextInlinePredictionType v);
    @Property(selector = "keyboardType")
    public native UIKeyboardType getKeyboardType();
    @Property(selector = "setKeyboardType:")
    public native void setKeyboardType(UIKeyboardType v);
    @Property(selector = "keyboardAppearance")
    public native UIKeyboardAppearance getKeyboardAppearance();
    @Property(selector = "setKeyboardAppearance:")
    public native void setKeyboardAppearance(UIKeyboardAppearance v);
    @Property(selector = "returnKeyType")
    public native UIReturnKeyType getReturnKeyType();
    @Property(selector = "setReturnKeyType:")
    public native void setReturnKeyType(UIReturnKeyType v);
    @Property(selector = "enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();
    @Property(selector = "setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean v);
    @Property(selector = "isSecureTextEntry")
    public native boolean isSecureTextEntry();
    @Property(selector = "setSecureTextEntry:")
    public native void setSecureTextEntry(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "textContentType")
    public native UITextContentType getTextContentType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTextContentType:")
    public native void setTextContentType(UITextContentType v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "passwordRules")
    public native UITextInputPasswordRules getPasswordRules();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setPasswordRules:")
    public native void setPasswordRules(UITextInputPasswordRules v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public void setScopeBarButtonTitleTextAttributes(NSAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setScopeBarButtonTitleTextAttributesDictionary(null, state);
        } else {
            setScopeBarButtonTitleTextAttributesDictionary(attributes.getDictionary(), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setScopeBarButtonTitleTextMarkupAttributes(CMTextMarkupAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setScopeBarButtonTitleTextAttributesDictionary(null, state);
        } else {
            setScopeBarButtonTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setScopeBarButtonTitleCoreTextAttributes(CTAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setScopeBarButtonTitleTextAttributesDictionary(null, state);
        } else {
            setScopeBarButtonTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public NSAttributedStringAttributes getScopeBarButtonTitleTextAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getScopeBarButtonTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getScopeBarButtonTitleTextMarkupAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getScopeBarButtonTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getScopeBarButtonTitleCoreTextAttributes(UIControlState state) {
        NSDictionary<NSString, ?> dict = getScopeBarButtonTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "setShowsCancelButton:animated:")
    public native void setShowsCancelButton(boolean showsCancelButton, boolean animated);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setShowsScopeBar:animated:")
    public native void setShowsScopeBar(boolean show, boolean animate);
    @Method(selector = "setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIBarPosition barPosition, UIBarMetrics barMetrics);
    @Method(selector = "backgroundImageForBarPosition:barMetrics:")
    public native UIImage getBackgroundImage(UIBarPosition barPosition, UIBarMetrics barMetrics);
    @Method(selector = "setSearchFieldBackgroundImage:forState:")
    public native void setSearchFieldBackgroundImage(UIImage backgroundImage, UIControlState state);
    @Method(selector = "searchFieldBackgroundImageForState:")
    public native UIImage getSearchFieldBackgroundImage(UIControlState state);
    @Method(selector = "setImage:forSearchBarIcon:state:")
    public native void setImageForSearchBarIcon(UIImage iconImage, UISearchBarIcon icon, UIControlState state);
    @Method(selector = "imageForSearchBarIcon:state:")
    public native UIImage getImageForSearchBarIcon(UISearchBarIcon icon, UIControlState state);
    @Method(selector = "setScopeBarButtonBackgroundImage:forState:")
    public native void setScopeBarButtonBackgroundImage(UIImage backgroundImage, UIControlState state);
    @Method(selector = "scopeBarButtonBackgroundImageForState:")
    public native UIImage getScopeBarButtonBackgroundImage(UIControlState state);
    @Method(selector = "setScopeBarButtonDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setScopeBarButtonDividerImage(UIImage dividerImage, UIControlState leftState, UIControlState rightState);
    @Method(selector = "scopeBarButtonDividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage getScopeBarButtonDividerImage(UIControlState leftState, UIControlState rightState);
    @Method(selector = "setScopeBarButtonTitleTextAttributes:forState:")
    public native void setScopeBarButtonTitleTextAttributesDictionary(NSDictionary<NSString, ?> attributes, UIControlState state);
    @Method(selector = "scopeBarButtonTitleTextAttributesForState:")
    public native NSDictionary<NSString, ?> getScopeBarButtonTitleTextAttributesDictionary(UIControlState state);
    @Method(selector = "setPositionAdjustment:forSearchBarIcon:")
    public native void setPositionAdjustmentForSearchBarIcon(@ByVal UIOffset adjustment, UISearchBarIcon icon);
    @Method(selector = "positionAdjustmentForSearchBarIcon:")
    public native @ByVal UIOffset getPositionAdjustmentForSearchBarIcon(UISearchBarIcon icon);
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
