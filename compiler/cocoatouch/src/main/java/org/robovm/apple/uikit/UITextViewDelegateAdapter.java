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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/UIScrollViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements UITextViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("textViewShouldBeginEditing:")
    public boolean shouldBeginEditing(UITextView textView) { return false; }
    @NotImplemented("textViewShouldEndEditing:")
    public boolean shouldEndEditing(UITextView textView) { return false; }
    @NotImplemented("textViewDidBeginEditing:")
    public void didBeginEditing(UITextView textView) {}
    @NotImplemented("textViewDidEndEditing:")
    public void didEndEditing(UITextView textView) {}
    @NotImplemented("textView:shouldChangeTextInRange:replacementText:")
    public boolean shouldChangeCharacters(UITextView textView, @ByVal NSRange range, String text) { return false; }
    @NotImplemented("textViewDidChange:")
    public void didChange(UITextView textView) {}
    @NotImplemented("textViewDidChangeSelection:")
    public void didChangeSelection(UITextView textView) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("textView:editMenuForTextInRange:suggestedActions:")
    public UIMenu getEditMenu(UITextView textView, @ByVal NSRange range, NSArray<UIMenuElement> suggestedActions) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("textView:willPresentEditMenuWithAnimator:")
    public void willPresentEditMenu(UITextView textView, UIEditMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("textView:willDismissEditMenuWithAnimator:")
    public void willDismissEditMenu(UITextView textView, UIEditMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("textView:primaryActionForTextItem:defaultAction:")
    public UIAction getPrimaryActionForTextItem(UITextView textView, UITextItem textItem, UIAction defaultAction) { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("textView:menuConfigurationForTextItem:defaultMenu:")
    public UITextItemMenuConfiguration getMenuConfigurationForTextItem(UITextView textView, UITextItem textItem, UIMenu defaultMenu) { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("textView:textItemMenuWillDisplayForTextItem:animator:")
    public void textItemMenuWillDisplayForTextItem(UITextView textView, UITextItem textItem, UIContextMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("textView:textItemMenuWillEndForTextItem:animator:")
    public void textItemMenuWillEndForTextItem(UITextView textView, UITextItem textItem, UIContextMenuInteractionAnimating animator) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 17.0. Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional customization options.
     */
    @Deprecated
    @NotImplemented("textView:shouldInteractWithURL:inRange:interaction:")
    public boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange, UITextItemInteraction interaction) { return false; }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 17.0. Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional customization options.
     */
    @Deprecated
    @NotImplemented("textView:shouldInteractWithTextAttachment:inRange:interaction:")
    public boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange, UITextItemInteraction interaction) { return false; }
    /**
     * @deprecated Deprecated in iOS 10.0. Use textView:shouldInteractWithURL:inRange:interaction:
     */
    @Deprecated
    @NotImplemented("textView:shouldInteractWithURL:inRange:")
    public boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange) { return false; }
    /**
     * @deprecated Deprecated in iOS 10.0. Use textView:shouldInteractWithTextAttachment:inRange:interaction:
     */
    @Deprecated
    @NotImplemented("textView:shouldInteractWithTextAttachment:inRange:")
    public boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange) { return false; }
    /*</methods>*/
}
