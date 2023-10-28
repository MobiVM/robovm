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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextField/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements UITextInput, NSCoding, UIContentSizeCategoryAdjusting, UILetterformAwareAdjusting, UITextDraggable, UITextDroppable, UITextPasteConfigurationSupporting/*</implements>*/ {

    public static class Notifications {
        public static NSObject observeDidBeginEditing(UITextField object, final VoidBlock1<UITextField> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBeginEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextField) a.getObject());
                }
            });
        }
        public static NSObject observeDidEndEditing(UITextField object, final VoidBlock1<UITextField> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidEndEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextField) a.getObject());
                }
            });
        }
        public static NSObject observeTextDidChange(UITextField object, final VoidBlock1<UITextField> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextField) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UITextFieldPtr extends Ptr<UITextField, UITextFieldPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextField.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITextField() {}
    protected UITextField(Handle h, long handle) { super(h, handle); }
    protected UITextField(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UITextField(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UITextField(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UITextField(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSAttributedStringAttributes getDefaultTextAttributes() {
        NSDictionary<NSString, ?> dict = getDefaultTextAttributesDictionary();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getDefaultTextMarkupAttributes() {
        NSDictionary<NSString, ?> dict = getDefaultTextAttributesDictionary();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getDefaultCoreTextAttributes() {
        NSDictionary<NSString, ?> dict = getDefaultTextAttributesDictionary();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void setDefaultTextAttributes(NSAttributedStringAttributes v) {
        if (v == null) {
            setDefaultTextAttributesDictionary(null);
        } else {
            setDefaultTextAttributesDictionary(v.getDictionary());
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setDefaultTextMarkupAttributes(CMTextMarkupAttributes v) {
        if (v == null) {
            setDefaultTextAttributesDictionary(null);
        } else {
            setDefaultTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setDefaultCoreTextAttributes(CTAttributedStringAttributes v) {
        if (v == null) {
            setDefaultTextAttributesDictionary(null);
        } else {
            setDefaultTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
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
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @Property(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @Property(selector = "borderStyle")
    public native UITextBorderStyle getBorderStyle();
    @Property(selector = "setBorderStyle:")
    public native void setBorderStyle(UITextBorderStyle v);
    @Property(selector = "defaultTextAttributes")
    public native NSDictionary<NSString, ?> getDefaultTextAttributesDictionary();
    @Property(selector = "setDefaultTextAttributes:")
    public native void setDefaultTextAttributesDictionary(NSDictionary<NSString, ?> v);
    @Property(selector = "placeholder")
    public native String getPlaceholder();
    @Property(selector = "setPlaceholder:")
    public native void setPlaceholder(String v);
    @Property(selector = "attributedPlaceholder")
    public native NSAttributedString getAttributedPlaceholder();
    @Property(selector = "setAttributedPlaceholder:")
    public native void setAttributedPlaceholder(NSAttributedString v);
    @Property(selector = "clearsOnBeginEditing")
    public native boolean clearsOnBeginEditing();
    @Property(selector = "setClearsOnBeginEditing:")
    public native void setClearsOnBeginEditing(boolean v);
    @Property(selector = "adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();
    @Property(selector = "setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @Property(selector = "minimumFontSize")
    public native @MachineSizedFloat double getMinimumFontSize();
    @Property(selector = "setMinimumFontSize:")
    public native void setMinimumFontSize(@MachineSizedFloat double v);
    @Property(selector = "delegate")
    public native UITextFieldDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITextFieldDelegate v);
    @Property(selector = "background")
    public native UIImage getBackground();
    @Property(selector = "setBackground:")
    public native void setBackground(UIImage v);
    @Property(selector = "disabledBackground")
    public native UIImage getDisabledBackground();
    @Property(selector = "setDisabledBackground:")
    public native void setDisabledBackground(UIImage v);
    @Property(selector = "isEditing")
    public native boolean isEditing();
    @Property(selector = "allowsEditingTextAttributes")
    public native boolean allowsEditingTextAttributes();
    @Property(selector = "setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean v);
    @Property(selector = "typingAttributes")
    public native NSDictionary<NSString, ?> getTypingAttributesDictionary();
    @Property(selector = "setTypingAttributes:")
    public native void setTypingAttributesDictionary(NSDictionary<NSString, ?> v);
    @Property(selector = "clearButtonMode")
    public native UITextFieldViewMode getClearButtonMode();
    @Property(selector = "setClearButtonMode:")
    public native void setClearButtonMode(UITextFieldViewMode v);
    @Property(selector = "leftView")
    public native UIView getLeftView();
    @Property(selector = "setLeftView:")
    public native void setLeftView(UIView v);
    @Property(selector = "leftViewMode")
    public native UITextFieldViewMode getLeftViewMode();
    @Property(selector = "setLeftViewMode:")
    public native void setLeftViewMode(UITextFieldViewMode v);
    @Property(selector = "rightView")
    public native UIView getRightView();
    @Property(selector = "setRightView:")
    public native void setRightView(UIView v);
    @Property(selector = "rightViewMode")
    public native UITextFieldViewMode getRightViewMode();
    @Property(selector = "setRightViewMode:")
    public native void setRightViewMode(UITextFieldViewMode v);
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UITextFieldTextDidBeginEditingNotification", optional=true)
    public static native NSString DidBeginEditingNotification();
    @GlobalValue(symbol="UITextFieldTextDidEndEditingNotification", optional=true)
    public static native NSString DidEndEditingNotification();
    @GlobalValue(symbol="UITextFieldTextDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UITextFieldDidEndEditingReasonKey", optional=true)
    protected static native NSString DidEndEditingReasonKey();
    
    @Method(selector = "borderRectForBounds:")
    public native @ByVal CGRect getBorderRect(@ByVal CGRect bounds);
    @Method(selector = "textRectForBounds:")
    public native @ByVal CGRect getTextRect(@ByVal CGRect bounds);
    @Method(selector = "placeholderRectForBounds:")
    public native @ByVal CGRect getPlaceholderRect(@ByVal CGRect bounds);
    @Method(selector = "editingRectForBounds:")
    public native @ByVal CGRect getEditingRect(@ByVal CGRect bounds);
    @Method(selector = "clearButtonRectForBounds:")
    public native @ByVal CGRect getClearButtonRect(@ByVal CGRect bounds);
    @Method(selector = "leftViewRectForBounds:")
    public native @ByVal CGRect getLeftViewRect(@ByVal CGRect bounds);
    @Method(selector = "rightViewRectForBounds:")
    public native @ByVal CGRect getRightViewRect(@ByVal CGRect bounds);
    /**
     * @deprecated Deprecated in iOS 15.0. This method is no longer called.
     */
    @Deprecated
    @Method(selector = "drawTextInRect:")
    public native void drawText(@ByVal CGRect rect);
    @Method(selector = "drawPlaceholderInRect:")
    public native void drawPlaceholder(@ByVal CGRect rect);
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
    /*</methods>*/
}
