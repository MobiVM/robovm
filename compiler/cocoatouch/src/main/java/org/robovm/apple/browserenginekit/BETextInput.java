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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/BETextInput/*</name>*/ 
    /*<implements>*/extends UIKeyInput, BETextSelectionDirectionNavigation, BEResponderEditActions/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "asyncInputDelegate")
    BETextInputDelegate getAsyncInputDelegate();
    @Property(selector = "setAsyncInputDelegate:", strongRef = true)
    void setAsyncInputDelegate(BETextInputDelegate v);
    @Property(selector = "isEditable")
    boolean isEditable();
    @Property(selector = "automaticallyPresentEditMenu")
    boolean automaticallyPresentEditMenu();
    @Property(selector = "extendedTextInputTraits")
    BEExtendedTextInputTraits getExtendedTextInputTraits();
    @Property(selector = "isReplaceAllowed")
    boolean isReplaceAllowed();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "selectionContainerViewBelowText")
    UIView getSelectionContainerViewBelowText();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "selectionContainerViewAboveText")
    UIView getSelectionContainerViewAboveText();
    @Property(selector = "selectedText")
    String getSelectedText();
    @Property(selector = "selectedTextRange")
    UITextRange getSelectedTextRange();
    @Property(selector = "setSelectedTextRange:")
    void setSelectedTextRange(UITextRange v);
    @Property(selector = "isSelectionAtDocumentStart")
    boolean isSelectionAtDocumentStart();
    @Property(selector = "markedText")
    String getMarkedText();
    @Property(selector = "attributedMarkedText")
    NSAttributedString getAttributedMarkedText();
    @Property(selector = "markedTextRange")
    UITextRange getMarkedTextRange();
    @Property(selector = "hasMarkedText")
    boolean hasMarkedText();
    @Property(selector = "textInputView")
    UIView getTextInputView();
    @Property(selector = "textFirstRect")
    @ByVal CGRect getTextFirstRect();
    @Property(selector = "textLastRect")
    @ByVal CGRect getTextLastRect();
    @Property(selector = "unobscuredContentRect")
    @ByVal CGRect getUnobscuredContentRect();
    @Property(selector = "unscaledView")
    UIView getUnscaledView();
    @Property(selector = "selectionClipRect")
    @ByVal CGRect getSelectionClipRect();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "canPerformAction:withSender:")
    boolean canPerformAction(Selector action, NSObject sender);
    @Method(selector = "handleKeyEntry:withCompletionHandler:")
    void handleKeyEntry(BEKeyEntry entry, @Block VoidBlock2<BEKeyEntry, Boolean> completionHandler);
    @Method(selector = "shiftKeyStateChangedFromState:toState:")
    void shiftKeyStateChanged(BEKeyModifierFlags oldState, BEKeyModifierFlags newState);
    @Method(selector = "textInRange:")
    String textInRange(UITextRange range);
    @Method(selector = "offsetFromPosition:toPosition:")
    @MachineSizedSInt long offsetFromPosition(UITextPosition from, UITextPosition toPosition);
    @Method(selector = "setBaseWritingDirection:forRange:")
    void setBaseWritingDirection(NSWritingDirection writingDirection, UITextRange range);
    @Method(selector = "deleteInDirection:toGranularity:")
    void deleteInDirection(UITextStorageDirection direction, UITextGranularity granularity);
    @Method(selector = "transposeCharactersAroundSelection")
    void transposeCharactersAroundSelection();
    @Method(selector = "replaceText:withText:options:completionHandler:")
    void replaceText(String originalText, String replacementText, BETextReplacementOptions options, @Block VoidBlock1<NSArray<UITextSelectionRect>> completionHandler);
    @Method(selector = "requestTextContextForAutocorrectionWithCompletionHandler:")
    void requestTextContextForAutocorrection(@Block VoidBlock1<BETextDocumentContext> completionHandler);
    @Method(selector = "requestTextRectsForString:withCompletionHandler:")
    void requestTextRectsForString(String input, @Block VoidBlock1<NSArray<UITextSelectionRect>> completionHandler);
    @Method(selector = "requestPreferredArrowDirectionForEditMenuWithCompletionHandler:")
    void requestPreferredArrowDirectionForEditMenu(@Block VoidBlock1<UIEditMenuArrowDirection> completionHandler);
    @Method(selector = "systemWillPresentEditMenuWithAnimator:")
    void systemWillPresentEditMenu(UIEditMenuInteractionAnimating animator);
    @Method(selector = "systemWillDismissEditMenuWithAnimator:")
    void systemWillDismissEditMenu(UIEditMenuInteractionAnimating animator);
    @Method(selector = "textStylingAtPosition:inDirection:")
    NSDictionary<NSString, ?> textStylingAtPosition(UITextPosition position, UITextStorageDirection direction);
    @Method(selector = "replaceSelectedText:withText:")
    void replaceSelectedText(String text, String replacementText);
    @Method(selector = "updateCurrentSelectionTo:fromGesture:inState:")
    void updateCurrentSelection(@ByVal CGPoint point, BEGestureType gestureType, UIGestureRecognizerState state);
    @Method(selector = "setSelectionFromPoint:toPoint:gesture:state:")
    void setSelection(@ByVal CGPoint from, @ByVal CGPoint to, BEGestureType gesture, UIGestureRecognizerState state);
    @Method(selector = "adjustSelectionBoundaryToPoint:touchPhase:baseIsStart:flags:")
    void adjustSelectionBoundary(@ByVal CGPoint point, BESelectionTouchPhase touch, boolean boundaryIsStart, BESelectionFlags flags);
    @Method(selector = "textInteractionGesture:shouldBeginAtPoint:")
    boolean textInteractionGesture(BEGestureType gestureType, @ByVal CGPoint point);
    @Method(selector = "caretRectForPosition:")
    @ByVal CGRect caretRectForPosition(UITextPosition position);
    @Method(selector = "selectionRectsForRange:")
    NSArray<UITextSelectionRect> selectionRectsForRange(UITextRange range);
    @Method(selector = "selectWordForReplacement")
    void selectWordForReplacement();
    @Method(selector = "updateSelectionWithExtentPoint:boundary:completionHandler:")
    void updateSelection(@ByVal CGPoint point, UITextGranularity granularity, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "selectTextInGranularity:atPoint:completionHandler:")
    void selectTextInGranularity(UITextGranularity granularity, @ByVal CGPoint point, @Block Runnable completionHandler);
    @Method(selector = "selectPositionAtPoint:completionHandler:")
    void selectPosition(@ByVal CGPoint point, @Block Runnable completionHandler);
    @Method(selector = "selectPositionAtPoint:withContextRequest:completionHandler:")
    void selectPosition(@ByVal CGPoint point, BETextDocumentRequest request, @Block VoidBlock1<BETextDocumentContext> completionHandler);
    @Method(selector = "adjustSelectionByRange:completionHandler:")
    void adjustSelection(@ByVal BEDirectionalTextRange range, @Block Runnable completionHandler);
    @Method(selector = "moveByOffset:")
    void moveByOffset(@MachineSizedSInt long offset);
    @Method(selector = "moveSelectionAtBoundary:inStorageDirection:completionHandler:")
    void moveSelectionAtBoundary(UITextGranularity granularity, UITextStorageDirection direction, @Block Runnable completionHandler);
    @Method(selector = "selectTextForEditMenuWithLocationInView:completionHandler:")
    void selectTextForEditMenu(@ByVal CGPoint locationInView, @Block("(,,@ByVal)") VoidBlock3<Boolean, NSString, NSRange> completionHandler);
    @Method(selector = "setMarkedText:selectedRange:")
    void setMarkedText(String markedText, @ByVal NSRange selectedRange);
    @Method(selector = "setAttributedMarkedText:selectedRange:")
    void setAttributedMarkedText(NSAttributedString markedText, @ByVal NSRange selectedRange);
    @Method(selector = "unmarkText")
    void unmarkText();
    @Method(selector = "isPointNearMarkedText:")
    boolean isPointNearMarkedText(@ByVal CGPoint point);
    @Method(selector = "requestDocumentContext:completionHandler:")
    void requestDocumentContext(BETextDocumentRequest request, @Block VoidBlock1<BETextDocumentContext> completionHandler);
    @Method(selector = "willInsertFinalDictationResult")
    void willInsertFinalDictationResult();
    @Method(selector = "replaceDictatedText:withText:")
    void replaceDictatedText(String oldText, String newText);
    @Method(selector = "didInsertFinalDictationResult")
    void didInsertFinalDictationResult();
    @Method(selector = "alternativesForSelectedText")
    NSArray<BETextAlternatives> alternativesForSelectedText();
    @Method(selector = "addTextAlternatives:")
    void addTextAlternatives(BETextAlternatives alternatives);
    @Method(selector = "insertTextAlternatives:")
    void insertTextAlternatives(BETextAlternatives alternatives);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "removeTextAlternatives")
    void removeTextAlternatives();
    @Method(selector = "insertTextPlaceholderWithSize:completionHandler:")
    void insertTextPlaceholder(@ByVal CGSize size, @Block VoidBlock1<UITextPlaceholder> completionHandler);
    @Method(selector = "removeTextPlaceholder:willInsertText:completionHandler:")
    void removeTextPlaceholder(UITextPlaceholder placeholder, boolean willInsertText, @Block Runnable completionHandler);
    @Method(selector = "insertTextSuggestion:")
    void insertTextSuggestion(BETextSuggestion textSuggestion);
    @Method(selector = "autoscrollToPoint:")
    void autoscrollToPoint(@ByVal CGPoint point);
    @Method(selector = "cancelAutoscroll")
    void cancelAutoscroll();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "keyboardWillDismiss")
    void keyboardWillDismiss();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
