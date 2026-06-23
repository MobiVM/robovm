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
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BETextInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class BETextInteractionPtr extends Ptr<BETextInteraction, BETextInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BETextInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BETextInteraction() {}
    protected BETextInteraction(Handle h, long handle) { super(h, handle); }
    protected BETextInteraction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native BETextInteractionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BETextInteractionDelegate v);
    @Property(selector = "textSelectionDisplayInteraction")
    public native UITextSelectionDisplayInteraction getTextSelectionDisplayInteraction();
    @Property(selector = "contextMenuInteractionDelegate")
    public native UIContextMenuInteractionDelegate getContextMenuInteractionDelegate();
    @Property(selector = "setContextMenuInteractionDelegate:", strongRef = true)
    public native void setContextMenuInteractionDelegate(UIContextMenuInteractionDelegate v);
    @Property(selector = "contextMenuInteraction")
    public native UIContextMenuInteraction getContextMenuInteraction();
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addShortcutForText:fromRect:")
    public native void addShortcut(String text, @ByVal CGRect presentationRect);
    @Method(selector = "shareText:fromRect:")
    public native void shareText(String text, @ByVal CGRect presentationRect);
    @Method(selector = "showDictionaryForTextInContext:definingTextInRange:fromRect:")
    public native void showDictionaryForTextInContext(String textWithContext, @ByVal NSRange range, @ByVal CGRect presentationRect);
    @Method(selector = "translateText:fromRect:")
    public native void translateText(String text, @ByVal CGRect presentationRect);
    @Method(selector = "showReplacementsForText:")
    public native void showReplacementsForText(String text);
    @Method(selector = "transliterateChineseForText:")
    public native void transliterateChineseForText(String text);
    @Method(selector = "presentEditMenuForSelection")
    public native void presentEditMenuForSelection();
    @Method(selector = "dismissEditMenuForSelection")
    public native void dismissEditMenuForSelection();
    @Method(selector = "editabilityChanged")
    public native void editabilityChanged();
    @Method(selector = "refreshKeyboardUI")
    public native void refreshKeyboardUI();
    @Method(selector = "selectionChangedWithGestureAtPoint:gesture:state:flags:")
    public native void selectionChanged(@ByVal CGPoint point, BEGestureType gestureType, UIGestureRecognizerState gestureState, BESelectionFlags flags);
    @Method(selector = "selectionBoundaryAdjustedToPoint:touchPhase:flags:")
    public native void selectionBoundaryAdjusted(@ByVal CGPoint point, BESelectionTouchPhase touch, BESelectionFlags flags);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
