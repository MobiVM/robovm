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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITextViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, UIScrollViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "textViewShouldBeginEditing:")
    boolean shouldBeginEditing(UITextView textView);
    @Method(selector = "textViewShouldEndEditing:")
    boolean shouldEndEditing(UITextView textView);
    @Method(selector = "textViewDidBeginEditing:")
    void didBeginEditing(UITextView textView);
    @Method(selector = "textViewDidEndEditing:")
    void didEndEditing(UITextView textView);
    @Method(selector = "textView:shouldChangeTextInRange:replacementText:")
    boolean shouldChangeCharacters(UITextView textView, @ByVal NSRange range, String text);
    @Method(selector = "textViewDidChange:")
    void didChange(UITextView textView);
    @Method(selector = "textViewDidChangeSelection:")
    void didChangeSelection(UITextView textView);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textView:editMenuForTextInRange:suggestedActions:")
    UIMenu getEditMenu(UITextView textView, @ByVal NSRange range, NSArray<UIMenuElement> suggestedActions);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textView:willPresentEditMenuWithAnimator:")
    void willPresentEditMenu(UITextView textView, UIEditMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textView:willDismissEditMenuWithAnimator:")
    void willDismissEditMenu(UITextView textView, UIEditMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textView:primaryActionForTextItem:defaultAction:")
    UIAction getPrimaryActionForTextItem(UITextView textView, UITextItem textItem, UIAction defaultAction);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textView:menuConfigurationForTextItem:defaultMenu:")
    UITextItemMenuConfiguration getMenuConfigurationForTextItem(UITextView textView, UITextItem textItem, UIMenu defaultMenu);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textView:textItemMenuWillDisplayForTextItem:animator:")
    void textItemMenuWillDisplayForTextItem(UITextView textView, UITextItem textItem, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textView:textItemMenuWillEndForTextItem:animator:")
    void textItemMenuWillEndForTextItem(UITextView textView, UITextItem textItem, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 17.0. Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional customization options.
     */
    @Deprecated
    @Method(selector = "textView:shouldInteractWithURL:inRange:interaction:")
    boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange, UITextItemInteraction interaction);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 17.0. Replaced by primaryActionForTextItem: and menuConfigurationForTextItem: for additional customization options.
     */
    @Deprecated
    @Method(selector = "textView:shouldInteractWithTextAttachment:inRange:interaction:")
    boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange, UITextItemInteraction interaction);
    /**
     * @deprecated Deprecated in iOS 10.0. Use textView:shouldInteractWithURL:inRange:interaction:
     */
    @Deprecated
    @Method(selector = "textView:shouldInteractWithURL:inRange:")
    boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange);
    /**
     * @deprecated Deprecated in iOS 10.0. Use textView:shouldInteractWithTextAttachment:inRange:interaction:
     */
    @Deprecated
    @Method(selector = "textView:shouldInteractWithTextAttachment:inRange:")
    boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
