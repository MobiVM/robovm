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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BETextInputAdapter/*</name>*/ 
    extends /*<extends>*/UIKeyInputAdapter/*</extends>*/ 
    /*<implements>*/implements BETextInput/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("asyncInputDelegate")
    public BETextInputDelegate getAsyncInputDelegate() { return null; }
    @NotImplemented("setAsyncInputDelegate:")
    public void setAsyncInputDelegate(BETextInputDelegate v) {}
    @NotImplemented("isEditable")
    public boolean isEditable() { return false; }
    @NotImplemented("automaticallyPresentEditMenu")
    public boolean automaticallyPresentEditMenu() { return false; }
    @NotImplemented("extendedTextInputTraits")
    public BEExtendedTextInputTraits getExtendedTextInputTraits() { return null; }
    @NotImplemented("isReplaceAllowed")
    public boolean isReplaceAllowed() { return false; }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("selectionContainerViewBelowText")
    public UIView getSelectionContainerViewBelowText() { return null; }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("selectionContainerViewAboveText")
    public UIView getSelectionContainerViewAboveText() { return null; }
    @NotImplemented("selectedText")
    public String getSelectedText() { return null; }
    @NotImplemented("selectedTextRange")
    public UITextRange getSelectedTextRange() { return null; }
    @NotImplemented("setSelectedTextRange:")
    public void setSelectedTextRange(UITextRange v) {}
    @NotImplemented("isSelectionAtDocumentStart")
    public boolean isSelectionAtDocumentStart() { return false; }
    @NotImplemented("markedText")
    public String getMarkedText() { return null; }
    @NotImplemented("attributedMarkedText")
    public NSAttributedString getAttributedMarkedText() { return null; }
    @NotImplemented("markedTextRange")
    public UITextRange getMarkedTextRange() { return null; }
    @NotImplemented("hasMarkedText")
    public boolean hasMarkedText() { return false; }
    @NotImplemented("textInputView")
    public UIView getTextInputView() { return null; }
    @NotImplemented("textFirstRect")
    public @ByVal CGRect getTextFirstRect() { return null; }
    @NotImplemented("textLastRect")
    public @ByVal CGRect getTextLastRect() { return null; }
    @NotImplemented("unobscuredContentRect")
    public @ByVal CGRect getUnobscuredContentRect() { return null; }
    @NotImplemented("unscaledView")
    public UIView getUnscaledView() { return null; }
    @NotImplemented("selectionClipRect")
    public @ByVal CGRect getSelectionClipRect() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("canPerformAction:withSender:")
    public boolean canPerformAction(Selector action, NSObject sender) { return false; }
    @NotImplemented("handleKeyEntry:withCompletionHandler:")
    public void handleKeyEntry(BEKeyEntry entry, @Block VoidBlock2<BEKeyEntry, Boolean> completionHandler) {}
    @NotImplemented("shiftKeyStateChangedFromState:toState:")
    public void shiftKeyStateChanged(BEKeyModifierFlags oldState, BEKeyModifierFlags newState) {}
    @NotImplemented("textInRange:")
    public String textInRange(UITextRange range) { return null; }
    @NotImplemented("offsetFromPosition:toPosition:")
    public @MachineSizedSInt long offsetFromPosition(UITextPosition from, UITextPosition toPosition) { return 0; }
    @NotImplemented("setBaseWritingDirection:forRange:")
    public void setBaseWritingDirection(NSWritingDirection writingDirection, UITextRange range) {}
    @NotImplemented("deleteInDirection:toGranularity:")
    public void deleteInDirection(UITextStorageDirection direction, UITextGranularity granularity) {}
    @NotImplemented("transposeCharactersAroundSelection")
    public void transposeCharactersAroundSelection() {}
    @NotImplemented("replaceText:withText:options:completionHandler:")
    public void replaceText(String originalText, String replacementText, BETextReplacementOptions options, @Block VoidBlock1<NSArray<UITextSelectionRect>> completionHandler) {}
    @NotImplemented("requestTextContextForAutocorrectionWithCompletionHandler:")
    public void requestTextContextForAutocorrection(@Block VoidBlock1<BETextDocumentContext> completionHandler) {}
    @NotImplemented("requestTextRectsForString:withCompletionHandler:")
    public void requestTextRectsForString(String input, @Block VoidBlock1<NSArray<UITextSelectionRect>> completionHandler) {}
    @NotImplemented("requestPreferredArrowDirectionForEditMenuWithCompletionHandler:")
    public void requestPreferredArrowDirectionForEditMenu(@Block VoidBlock1<UIEditMenuArrowDirection> completionHandler) {}
    @NotImplemented("systemWillPresentEditMenuWithAnimator:")
    public void systemWillPresentEditMenu(UIEditMenuInteractionAnimating animator) {}
    @NotImplemented("systemWillDismissEditMenuWithAnimator:")
    public void systemWillDismissEditMenu(UIEditMenuInteractionAnimating animator) {}
    @NotImplemented("textStylingAtPosition:inDirection:")
    public NSDictionary<NSString, ?> textStylingAtPosition(UITextPosition position, UITextStorageDirection direction) { return null; }
    @NotImplemented("replaceSelectedText:withText:")
    public void replaceSelectedText(String text, String replacementText) {}
    @NotImplemented("updateCurrentSelectionTo:fromGesture:inState:")
    public void updateCurrentSelection(@ByVal CGPoint point, BEGestureType gestureType, UIGestureRecognizerState state) {}
    @NotImplemented("setSelectionFromPoint:toPoint:gesture:state:")
    public void setSelection(@ByVal CGPoint from, @ByVal CGPoint to, BEGestureType gesture, UIGestureRecognizerState state) {}
    @NotImplemented("adjustSelectionBoundaryToPoint:touchPhase:baseIsStart:flags:")
    public void adjustSelectionBoundary(@ByVal CGPoint point, BESelectionTouchPhase touch, boolean boundaryIsStart, BESelectionFlags flags) {}
    @NotImplemented("textInteractionGesture:shouldBeginAtPoint:")
    public boolean textInteractionGesture(BEGestureType gestureType, @ByVal CGPoint point) { return false; }
    @NotImplemented("caretRectForPosition:")
    public @ByVal CGRect caretRectForPosition(UITextPosition position) { return null; }
    @NotImplemented("selectionRectsForRange:")
    public NSArray<UITextSelectionRect> selectionRectsForRange(UITextRange range) { return null; }
    @NotImplemented("selectWordForReplacement")
    public void selectWordForReplacement() {}
    @NotImplemented("updateSelectionWithExtentPoint:boundary:completionHandler:")
    public void updateSelection(@ByVal CGPoint point, UITextGranularity granularity, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("selectTextInGranularity:atPoint:completionHandler:")
    public void selectTextInGranularity(UITextGranularity granularity, @ByVal CGPoint point, @Block Runnable completionHandler) {}
    @NotImplemented("selectPositionAtPoint:completionHandler:")
    public void selectPosition(@ByVal CGPoint point, @Block Runnable completionHandler) {}
    @NotImplemented("selectPositionAtPoint:withContextRequest:completionHandler:")
    public void selectPosition(@ByVal CGPoint point, BETextDocumentRequest request, @Block VoidBlock1<BETextDocumentContext> completionHandler) {}
    @NotImplemented("adjustSelectionByRange:completionHandler:")
    public void adjustSelection(@ByVal BEDirectionalTextRange range, @Block Runnable completionHandler) {}
    @NotImplemented("moveByOffset:")
    public void moveByOffset(@MachineSizedSInt long offset) {}
    @NotImplemented("moveSelectionAtBoundary:inStorageDirection:completionHandler:")
    public void moveSelectionAtBoundary(UITextGranularity granularity, UITextStorageDirection direction, @Block Runnable completionHandler) {}
    @NotImplemented("selectTextForEditMenuWithLocationInView:completionHandler:")
    public void selectTextForEditMenu(@ByVal CGPoint locationInView, @Block("(,,@ByVal)") VoidBlock3<Boolean, NSString, NSRange> completionHandler) {}
    @NotImplemented("setMarkedText:selectedRange:")
    public void setMarkedText(String markedText, @ByVal NSRange selectedRange) {}
    @NotImplemented("setAttributedMarkedText:selectedRange:")
    public void setAttributedMarkedText(NSAttributedString markedText, @ByVal NSRange selectedRange) {}
    @NotImplemented("unmarkText")
    public void unmarkText() {}
    @NotImplemented("isPointNearMarkedText:")
    public boolean isPointNearMarkedText(@ByVal CGPoint point) { return false; }
    @NotImplemented("requestDocumentContext:completionHandler:")
    public void requestDocumentContext(BETextDocumentRequest request, @Block VoidBlock1<BETextDocumentContext> completionHandler) {}
    @NotImplemented("willInsertFinalDictationResult")
    public void willInsertFinalDictationResult() {}
    @NotImplemented("replaceDictatedText:withText:")
    public void replaceDictatedText(String oldText, String newText) {}
    @NotImplemented("didInsertFinalDictationResult")
    public void didInsertFinalDictationResult() {}
    @NotImplemented("alternativesForSelectedText")
    public NSArray<BETextAlternatives> alternativesForSelectedText() { return null; }
    @NotImplemented("addTextAlternatives:")
    public void addTextAlternatives(BETextAlternatives alternatives) {}
    @NotImplemented("insertTextAlternatives:")
    public void insertTextAlternatives(BETextAlternatives alternatives) {}
    /**
     * @since Available in iOS 18.0 and later.
     */
    @NotImplemented("removeTextAlternatives")
    public void removeTextAlternatives() {}
    @NotImplemented("insertTextPlaceholderWithSize:completionHandler:")
    public void insertTextPlaceholder(@ByVal CGSize size, @Block VoidBlock1<UITextPlaceholder> completionHandler) {}
    @NotImplemented("removeTextPlaceholder:willInsertText:completionHandler:")
    public void removeTextPlaceholder(UITextPlaceholder placeholder, boolean willInsertText, @Block Runnable completionHandler) {}
    @NotImplemented("insertTextSuggestion:")
    public void insertTextSuggestion(BETextSuggestion textSuggestion) {}
    @NotImplemented("autoscrollToPoint:")
    public void autoscrollToPoint(@ByVal CGPoint point) {}
    @NotImplemented("cancelAutoscroll")
    public void cancelAutoscroll() {}
    /**
     * @since Available in iOS 18.0 and later.
     */
    @NotImplemented("keyboardWillDismiss")
    public void keyboardWillDismiss() {}
    @NotImplemented("moveInLayoutDirection:")
    public void moveInLayoutDirection(UITextLayoutDirection direction) {}
    @NotImplemented("extendInLayoutDirection:")
    public void extendInLayoutDirection(UITextLayoutDirection direction) {}
    @NotImplemented("moveInStorageDirection:byGranularity:")
    public void moveInStorageDirection(UITextStorageDirection direction, UITextGranularity granularity) {}
    @NotImplemented("extendInStorageDirection:byGranularity:")
    public void extendInStorageDirection(UITextStorageDirection direction, UITextGranularity granularity) {}
    @NotImplemented("share:")
    public void share(NSObject sender) {}
    @NotImplemented("addShortcut:")
    public void addShortcut(NSObject sender) {}
    @NotImplemented("lookup:")
    public void lookup(NSObject sender) {}
    @NotImplemented("findSelected:")
    public void findSelected(NSObject sender) {}
    @NotImplemented("promptForReplace:")
    public void promptForReplace(NSObject sender) {}
    @NotImplemented("replace:")
    public void replace(NSObject sender) {}
    @NotImplemented("translate:")
    public void translate(NSObject sender) {}
    @NotImplemented("transliterateChinese:")
    public void transliterateChinese(NSObject sender) {}
    @NotImplemented("cut:")
    public void cut(NSObject sender) {}
    @NotImplemented("copy:")
    public void copy(NSObject sender) {}
    @NotImplemented("paste:")
    public void paste(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndMatchStyle:")
    public void pasteAndMatchStyle(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndGo:")
    public void pasteAndGo(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndSearch:")
    public void pasteAndSearch(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("newFromPasteboard:")
    public void newFromPasteboard(NSObject sender) {}
    @NotImplemented("select:")
    public void select(NSObject sender) {}
    @NotImplemented("selectAll:")
    public void selectAll(NSObject sender) {}
    @NotImplemented("delete:")
    public void delete(NSObject sender) {}
    @NotImplemented("makeTextWritingDirectionLeftToRight:")
    public void makeTextWritingDirectionLeftToRight(NSObject sender) {}
    @NotImplemented("makeTextWritingDirectionRightToLeft:")
    public void makeTextWritingDirectionRightToLeft(NSObject sender) {}
    @NotImplemented("toggleBoldface:")
    public void toggleBoldface(NSObject sender) {}
    @NotImplemented("toggleItalics:")
    public void toggleItalics(NSObject sender) {}
    @NotImplemented("toggleUnderline:")
    public void toggleUnderline(NSObject sender) {}
    @NotImplemented("increaseSize:")
    public void increaseSize(NSObject sender) {}
    @NotImplemented("decreaseSize:")
    public void decreaseSize(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("alignLeft:")
    public void alignLeft(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("alignCenter:")
    public void alignCenter(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("alignJustified:")
    public void alignJustified(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("alignRight:")
    public void alignRight(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("find:")
    public void find(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findAndReplace:")
    public void findAndReplace(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findNext:")
    public void findNext(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findPrevious:")
    public void findPrevious(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("useSelectionForFind:")
    public void useSelectionForFind(NSObject sender) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateTextAttributesWithConversionHandler:")
    public void updateTextAttributes(@Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> conversionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("print:")
    public void print(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("rename:")
    public void rename(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("duplicate:")
    public void duplicate(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("move:")
    public void move(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("export:")
    public void export(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("toggleSidebar:")
    public void toggleSidebar(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("toggleInspector:")
    public void toggleInspector(NSObject sender) {}
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("performClose:")
    public void performClose(NSObject sender) {}
    /**
     * @since Available in iOS 18.2 and later.
     */
    @NotImplemented("showWritingTools:")
    public void showWritingTools(NSObject sender) {}
    /*</methods>*/
}
