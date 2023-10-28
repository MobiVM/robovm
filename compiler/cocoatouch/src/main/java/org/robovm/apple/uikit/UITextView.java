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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextView/*</name>*/ 
    extends /*<extends>*/UIScrollView/*</extends>*/ 
    /*<implements>*/implements UITextInput, UIContentSizeCategoryAdjusting, UILetterformAwareAdjusting, UITextDraggable, UITextDroppable, UITextPasteConfigurationSupporting, UIFindInteractionDelegate, UITextSearching/*</implements>*/ {

    public static class Notifications {
        public static NSObject observeDidBeginEditing(UITextView object, final VoidBlock1<UITextView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBeginEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextView) a.getObject());
                }
            });
        }
        public static NSObject observeTextDidChangeEditing(UITextView object, final VoidBlock1<UITextView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextView) a.getObject());
                }
            });
        }
        public static NSObject observeDidEndEditing(UITextView object, final VoidBlock1<UITextView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidEndEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextView) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UITextViewPtr extends Ptr<UITextView, UITextViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITextView() {}
    protected UITextView(Handle h, long handle) { super(h, handle); }
    protected UITextView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:textContainer:")
    public UITextView(@ByVal CGRect frame, NSTextContainer textContainer) { super((SkipInit) null); initObject(init(frame, textContainer)); }
    @Method(selector = "initWithCoder:")
    public UITextView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFrame:")
    public UITextView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/

    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSAttributedStringAttributes getLinkTextAttributes() {
        NSDictionary<NSString, ?> dict = getLinkTextAttributesDictionary();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getLinkTextMarkupAttributes() {
        NSDictionary<NSString, ?> dict = getLinkTextAttributesDictionary();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getLinkCoreTextAttributes() {
        NSDictionary<NSString, ?> dict = getLinkTextAttributesDictionary();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setLinkTextAttributes(NSAttributedStringAttributes v) {
        if (v == null) {
            setLinkTextAttributesDictionary(null);
        } else {
            setLinkTextAttributesDictionary(v.getDictionary());
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setLinkTextMarkupAttributes(CMTextMarkupAttributes v) {
        if (v == null) {
            setLinkTextAttributesDictionary(null);
        } else {
            setLinkTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setLinkCoreTextAttributes(CTAttributedStringAttributes v) {
        if (v == null) {
            setLinkTextAttributesDictionary(null);
        } else {
            setLinkTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    public NSAttributedStringAttributes getTypingAttributes() {
        NSDictionary<NSString, ?> dict = getTypingAttributesDictionary();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getTypingTextMarkupAttributes() {
        NSDictionary<NSString, ?> dict = getTypingAttributesDictionary();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getTypingCoreTextAttributes() {
        NSDictionary<NSString, ?> dict = getTypingAttributesDictionary();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public void setTypingAttributes(NSAttributedStringAttributes v) {
        if (v == null) {
            setTypingAttributesDictionary(null);
        } else {
            setTypingAttributesDictionary(v.getDictionary());
        }
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void setTypingTextMarkupAttributes(CMTextMarkupAttributes v) {
        if (v == null) {
            setTypingAttributesDictionary(null);
        } else {
            setTypingAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void setTypingCoreTextAttributes(CTAttributedStringAttributes v) {
        if (v == null) {
            setTypingAttributesDictionary(null);
        } else {
            setTypingAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /*<properties>*/
    @Property(selector = "delegate")
    public native UITextViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITextViewDelegate v);
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
    @Property(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @Property(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @Property(selector = "selectedRange")
    public native @ByVal NSRange getSelectedRange();
    @Property(selector = "setSelectedRange:")
    public native void setSelectedRange(@ByVal NSRange v);
    @Property(selector = "isEditable")
    public native boolean isEditable();
    @Property(selector = "setEditable:")
    public native void setEditable(boolean v);
    @Property(selector = "isSelectable")
    public native boolean isSelectable();
    @Property(selector = "setSelectable:")
    public native void setSelectable(boolean v);
    @Property(selector = "dataDetectorTypes")
    public native UIDataDetectorTypes getDataDetectorTypes();
    @Property(selector = "setDataDetectorTypes:")
    public native void setDataDetectorTypes(UIDataDetectorTypes v);
    @Property(selector = "allowsEditingTextAttributes")
    public native boolean allowsEditingTextAttributes();
    @Property(selector = "setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean v);
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "typingAttributes")
    public native NSDictionary<NSString, ?> getTypingAttributesDictionary();
    @Property(selector = "setTypingAttributes:")
    public native void setTypingAttributesDictionary(NSDictionary<NSString, ?> v);
    @Property(selector = "inputView")
    public native UIView getInputView();
    @Property(selector = "setInputView:")
    public native void setInputView(UIView v);
    @Property(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    @Property(selector = "setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    @Property(selector = "clearsOnInsertion")
    public native boolean clearsOnInsertion();
    @Property(selector = "setClearsOnInsertion:")
    public native void setClearsOnInsertion(boolean v);
    @Property(selector = "textContainer")
    public native NSTextContainer getTextContainer();
    @Property(selector = "textContainerInset")
    public native @ByVal UIEdgeInsets getTextContainerInset();
    @Property(selector = "setTextContainerInset:")
    public native void setTextContainerInset(@ByVal UIEdgeInsets v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "textLayoutManager")
    public native NSTextLayoutManager getTextLayoutManager();
    @Property(selector = "layoutManager")
    public native NSLayoutManager getLayoutManager();
    @Property(selector = "textStorage")
    public native NSTextStorage getTextStorage();
    @Property(selector = "linkTextAttributes")
    public native NSDictionary<NSString, ?> getLinkTextAttributesDictionary();
    @Property(selector = "setLinkTextAttributes:")
    public native void setLinkTextAttributesDictionary(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "usesStandardTextScaling")
    public native boolean usesStandardTextScaling();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setUsesStandardTextScaling:")
    public native void setUsesStandardTextScaling(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "findInteraction")
    public native UIFindInteraction getFindInteraction();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isFindInteractionEnabled")
    public native boolean isFindInteractionEnabled();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setFindInteractionEnabled:")
    public native void setFindInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "borderStyle")
    public native UITextViewBorderStyle getBorderStyle();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setBorderStyle:")
    public native void setBorderStyle(UITextViewBorderStyle v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "interactionState")
    public native NSObject getInteractionState();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setInteractionState:")
    public native void setInteractionState(NSObject v);
    @Property(selector = "selectedTextRange")
    public native UITextRange getSelectedTextRange();
    @Property(selector = "setSelectedTextRange:")
    public native void setSelectedTextRange(UITextRange v);
    @Property(selector = "markedTextRange")
    public native UITextRange getMarkedTextRange();
    @Property(selector = "markedTextStyle")
    public native UITextInputTextStyle getMarkedTextStyle();
    @Property(selector = "setMarkedTextStyle:")
    public native void setMarkedTextStyle(UITextInputTextStyle v);
    @Property(selector = "beginningOfDocument")
    public native UITextPosition getBeginningOfDocument();
    @Property(selector = "endOfDocument")
    public native UITextPosition getEndOfDocument();
    @Property(selector = "inputDelegate")
    public native UITextInputDelegate getInputDelegate();
    @Property(selector = "setInputDelegate:", strongRef = true)
    public native void setInputDelegate(UITextInputDelegate v);
    @Property(selector = "tokenizer")
    public native UITextInputTokenizer getTokenizer();
    @Property(selector = "textInputView")
    public native UIView getTextInputView();
    @Property(selector = "selectionAffinity")
    public native UITextStorageDirection getSelectionAffinity();
    @Property(selector = "setSelectionAffinity:")
    public native void setSelectionAffinity(UITextStorageDirection v);
    @Property(selector = "insertDictationResultPlaceholder")
    public native NSObject getInsertDictationResultPlaceholder();
    @Property(selector = "hasText")
    public native boolean hasText();
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
    @Property(selector = "adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();
    @Property(selector = "setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean v);
    @Property(selector = "sizingRule")
    public native UILetterformAwareSizingRule getSizingRule();
    @Property(selector = "setSizingRule:")
    public native void setSizingRule(UILetterformAwareSizingRule v);
    @Property(selector = "textDragDelegate")
    public native UITextDragDelegate getTextDragDelegate();
    @Property(selector = "setTextDragDelegate:", strongRef = true)
    public native void setTextDragDelegate(UITextDragDelegate v);
    @Property(selector = "textDragInteraction")
    public native UIDragInteraction getTextDragInteraction();
    @Property(selector = "isTextDragActive")
    public native boolean isTextDragActive();
    @Property(selector = "textDragOptions")
    public native UITextDragOptions getTextDragOptions();
    @Property(selector = "setTextDragOptions:")
    public native void setTextDragOptions(UITextDragOptions v);
    @Property(selector = "textDropDelegate")
    public native UITextDropDelegate getTextDropDelegate();
    @Property(selector = "setTextDropDelegate:", strongRef = true)
    public native void setTextDropDelegate(UITextDropDelegate v);
    @Property(selector = "textDropInteraction")
    public native UIDropInteraction getTextDropInteraction();
    @Property(selector = "isTextDropActive")
    public native boolean isTextDropActive();
    @Property(selector = "pasteDelegate")
    public native UITextPasteDelegate getPasteDelegate();
    @Property(selector = "setPasteDelegate:", strongRef = true)
    public native void setPasteDelegate(UITextPasteDelegate v);
    @Property(selector = "supportsTextReplacement")
    public native boolean supportsTextReplacement();
    @Property(selector = "selectedTextSearchDocument")
    public native NSObject getSelectedTextSearchDocument();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UITextViewTextDidBeginEditingNotification", optional=true)
    public static native NSString DidBeginEditingNotification();
    @GlobalValue(symbol="UITextViewTextDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    @GlobalValue(symbol="UITextViewTextDidEndEditingNotification", optional=true)
    public static native NSString DidEndEditingNotification();
    
    @Method(selector = "scrollRangeToVisible:")
    public native void scrollRangeToVisible(@ByVal NSRange range);
    @Method(selector = "initWithFrame:textContainer:")
    protected native @Pointer long init(@ByVal CGRect frame, NSTextContainer textContainer);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textViewUsingTextLayoutManager:")
    public static native UITextView textViewUsingTextLayoutManager(boolean usingTextLayoutManager);
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
    @Method(selector = "textInRange:")
    public native String getText(UITextRange range);
    @Method(selector = "replaceRange:withText:")
    public native void replaceText(UITextRange range, String text);
    @Method(selector = "setMarkedText:selectedRange:")
    public native void setMarkedText(String markedText, @ByVal NSRange selectedRange);
    @Method(selector = "unmarkText")
    public native void unmarkText();
    @Method(selector = "textRangeFromPosition:toPosition:")
    public native UITextRange getTextRange(UITextPosition fromPosition, UITextPosition toPosition);
    @Method(selector = "positionFromPosition:offset:")
    public native UITextPosition getPosition(UITextPosition position, @MachineSizedSInt long offset);
    @Method(selector = "positionFromPosition:inDirection:offset:")
    public native UITextPosition getPosition(UITextPosition position, UITextLayoutDirection direction, @MachineSizedSInt long offset);
    @Method(selector = "comparePosition:toPosition:")
    public native NSComparisonResult comparePositions(UITextPosition position, UITextPosition other);
    @Method(selector = "offsetFromPosition:toPosition:")
    public native @MachineSizedSInt long getOffset(UITextPosition from, UITextPosition toPosition);
    @Method(selector = "positionWithinRange:farthestInDirection:")
    public native UITextPosition getPosition(UITextRange range, UITextLayoutDirection direction);
    @Method(selector = "characterRangeByExtendingPosition:inDirection:")
    public native UITextRange getCharacterRange(UITextPosition position, UITextLayoutDirection direction);
    @Method(selector = "baseWritingDirectionForPosition:inDirection:")
    public native NSWritingDirection getBaseWritingDirection(UITextPosition position, UITextStorageDirection direction);
    @Method(selector = "setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirection(NSWritingDirection writingDirection, UITextRange range);
    @Method(selector = "firstRectForRange:")
    public native @ByVal CGRect getFirstRect(UITextRange range);
    @Method(selector = "caretRectForPosition:")
    public native @ByVal CGRect getCaretRect(UITextPosition position);
    @Method(selector = "selectionRectsForRange:")
    public native NSArray<UITextSelectionRect> getSelectionRects(UITextRange range);
    @Method(selector = "closestPositionToPoint:")
    public native UITextPosition getClosestPosition(@ByVal CGPoint point);
    @Method(selector = "closestPositionToPoint:withinRange:")
    public native UITextPosition getClosestPosition(@ByVal CGPoint point, UITextRange range);
    @Method(selector = "characterRangeAtPoint:")
    public native UITextRange getCharacterRange(@ByVal CGPoint point);
    @Method(selector = "shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeText(UITextRange range, String text);
    @Method(selector = "textStylingAtPosition:inDirection:")
    public native UITextInputTextStyle getTextStyling(UITextPosition position, UITextStorageDirection direction);
    @Method(selector = "positionWithinRange:atCharacterOffset:")
    public native UITextPosition getPosition(UITextRange range, @MachineSizedSInt long offset);
    @Method(selector = "characterOffsetOfPosition:withinRange:")
    public native @MachineSizedSInt long getCharacterOffset(UITextPosition position, UITextRange range);
    @Method(selector = "insertDictationResult:")
    public native void insertDictationResult(NSArray<UIDictationPhrase> dictationResult);
    @Method(selector = "dictationRecordingDidEnd")
    public native void dictationRecordingDidEnd();
    @Method(selector = "dictationRecognitionFailed")
    public native void dictationRecognitionFailed();
    @Method(selector = "frameForDictationResultPlaceholder:")
    public native @ByVal CGRect getDictationResultPlaceholderFrame(NSObject placeholder);
    @Method(selector = "removeDictationResultPlaceholder:willInsertResult:")
    public native void removeDictationResultPlaceholder(NSObject placeholder, boolean willInsertResult);
    @Method(selector = "insertText:alternatives:style:")
    public native void insertText(String text, NSArray<NSString> alternatives, UITextAlternativeStyle style);
    @Method(selector = "setAttributedMarkedText:selectedRange:")
    public native void setAttributedMarkedText(NSAttributedString markedText, @ByVal NSRange selectedRange);
    @Method(selector = "insertTextPlaceholderWithSize:")
    public native UITextPlaceholder insertTextPlaceholder(@ByVal CGSize size);
    @Method(selector = "removeTextPlaceholder:")
    public native void removeTextPlaceholder(UITextPlaceholder textPlaceholder);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "beginFloatingCursorAtPoint:")
    public native void beginFloatingCursor(@ByVal CGPoint point);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "updateFloatingCursorAtPoint:")
    public native void updateFloatingCursor(@ByVal CGPoint point);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "endFloatingCursor")
    public native void endFloatingCursor();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "editMenuForTextRange:suggestedActions:")
    public native UIMenu getEditMenu(UITextRange textRange, NSArray<UIMenuElement> suggestedActions);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "willPresentEditMenuWithAnimator:")
    public native void willPresentEditMenu(UIEditMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "willDismissEditMenuWithAnimator:")
    public native void willDismissEditMenu(UIEditMenuInteractionAnimating animator);
    @Method(selector = "insertText:")
    public native void insertText(String text);
    @Method(selector = "deleteBackward")
    public native void deleteBackward();
    @Method(selector = "findInteraction:sessionForView:")
    public native UIFindSession getSession(UIFindInteraction interaction, UIView view);
    @Method(selector = "findInteraction:didBeginFindSession:")
    public native void didBeginFindSession(UIFindInteraction interaction, UIFindSession session);
    @Method(selector = "findInteraction:didEndFindSession:")
    public native void didEndFindSession(UIFindInteraction interaction, UIFindSession session);
    @Method(selector = "compareFoundRange:toRange:inDocument:")
    public native NSComparisonResult compare(UITextRange foundRange, UITextRange toRange, NSObject document);
    @Method(selector = "performTextSearchWithQueryString:usingOptions:resultAggregator:")
    public native void performTextSearch(String string, UITextSearchOptions options, UITextSearchAggregator aggregator);
    @Method(selector = "decorateFoundTextRange:inDocument:usingStyle:")
    public native void decorateFoundTextRange(UITextRange range, NSObject document, UITextSearchFoundTextStyle style);
    @Method(selector = "clearAllDecoratedFoundText")
    public native void clearAllDecoratedFoundText();
    @Method(selector = "shouldReplaceFoundTextInRange:inDocument:withText:")
    public native boolean shouldReplaceFoundTextInRange(UITextRange range, NSObject document, String replacementText);
    @Method(selector = "replaceFoundTextInRange:inDocument:withText:")
    public native void replaceFoundTextInRange(UITextRange range, NSObject document, String replacementText);
    @Method(selector = "replaceAllOccurrencesOfQueryString:usingOptions:withText:")
    public native void replaceAllOccurrencesOfQueryString(String queryString, UITextSearchOptions options, String replacementText);
    @Method(selector = "willHighlightFoundTextRange:inDocument:")
    public native void willHighlightFoundTextRange(UITextRange range, NSObject document);
    @Method(selector = "scrollRangeToVisible:inDocument:")
    public native void scrollRangeToVisible(UITextRange range, NSObject document);
    @Method(selector = "compareOrderFromDocument:toDocument:")
    public native NSComparisonResult compareOrder(NSObject fromDocument, NSObject toDocument);
    /*</methods>*/
}
