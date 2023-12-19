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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIResponder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIResponderStandardEditActions, UIUserActivityRestoring, UIPasteConfigurationSupporting, UIActivityItemsConfigurationProviding/*</implements>*/ {

    /*<ptr>*/public static class UIResponderPtr extends Ptr<UIResponder, UIResponderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIResponder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIResponder() {}
    @Deprecated protected UIResponder(long handle) { super(handle); }
    protected UIResponder(Handle h, long handle) { super(h, handle); }
    protected UIResponder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nextResponder")
    public native UIResponder getNextResponder();
    @Property(selector = "canBecomeFirstResponder")
    public native boolean canBecomeFirstResponder();
    @Property(selector = "canResignFirstResponder")
    public native boolean canResignFirstResponder();
    @Property(selector = "isFirstResponder")
    public native boolean isFirstResponder();
    @Property(selector = "undoManager")
    public native NSUndoManager getUndoManager();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "editingInteractionConfiguration")
    public native UIEditingInteractionConfiguration getEditingInteractionConfiguration();
    @Property(selector = "keyCommands")
    public native NSArray<UIKeyCommand> getKeyCommands();
    @Property(selector = "inputView")
    public native UIView getInputView();
    @Property(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "inputAssistantItem")
    public native UITextInputAssistantItem getInputAssistantItem();
    @Property(selector = "inputViewController")
    public native UIInputViewController getInputViewController();
    @Property(selector = "inputAccessoryViewController")
    public native UIInputViewController getInputAccessoryViewController();
    @Property(selector = "textInputMode")
    public native UITextInputMode getTextInputMode();
    @Property(selector = "textInputContextIdentifier")
    public native String getTextInputContextIdentifier();
    @Property(selector = "userActivity")
    public native NSUserActivity getUserActivity();
    @Property(selector = "setUserActivity:")
    public native void setUserActivity(NSUserActivity v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "activityItemsConfiguration")
    public native UIActivityItemsConfigurationReading getActivityItemsConfiguration();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setActivityItemsConfiguration:")
    public native void setActivityItemsConfiguration(UIActivityItemsConfigurationReading v);
    @Property(selector = "pasteConfiguration")
    public native UIPasteConfiguration getPasteConfiguration();
    @Property(selector = "setPasteConfiguration:")
    public native void setPasteConfiguration(UIPasteConfiguration v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "becomeFirstResponder")
    public native boolean becomeFirstResponder();
    @Method(selector = "resignFirstResponder")
    public native boolean resignFirstResponder();
    @Method(selector = "touchesBegan:withEvent:")
    public native void touchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesMoved:withEvent:")
    public native void touchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesEnded:withEvent:")
    public native void touchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesCancelled:withEvent:")
    public native void touchesCancelled(NSSet<UITouch> touches, UIEvent event);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(NSSet<UITouch> touches);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesBegan:withEvent:")
    public native void pressesBegan(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesChanged:withEvent:")
    public native void pressesChanged(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesEnded:withEvent:")
    public native void pressesEnded(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesCancelled:withEvent:")
    public native void pressesCancelled(NSSet<UIPress> presses, UIPressesEvent event);
    @Method(selector = "motionBegan:withEvent:")
    public native void motionBegan(UIEventSubtype motion, UIEvent event);
    @Method(selector = "motionEnded:withEvent:")
    public native void motionEnded(UIEventSubtype motion, UIEvent event);
    @Method(selector = "motionCancelled:withEvent:")
    public native void motionCancelled(UIEventSubtype motion, UIEvent event);
    @Method(selector = "remoteControlReceivedWithEvent:")
    public native void remoteControlReceived(UIEvent event);
    @Method(selector = "canPerformAction:withSender:")
    public native boolean canPerformAction(Selector action, NSObject sender);
    @Method(selector = "targetForAction:withSender:")
    public native NSObject getActionTarget(Selector action, NSObject sender);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "buildMenuWithBuilder:")
    public native void buildMenu(UIMenuBuilder builder);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "validateCommand:")
    public native void validateCommand(UICommand command);
    @Method(selector = "reloadInputViews")
    public native void reloadInputViews();
    @Method(selector = "clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);
    @Method(selector = "updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity activity);
    @Method(selector = "restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity activity);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "captureTextFromCamera:")
    public native void captureTextFromCamera(NSObject sender);
    @Method(selector = "cut:")
    public native void cut(NSObject sender);
    @Method(selector = "copy:")
    public native void copy(NSObject sender);
    @Method(selector = "paste:")
    public native void paste(NSObject sender);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "pasteAndMatchStyle:")
    public native void pasteAndMatchStyle(NSObject sender);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "pasteAndGo:")
    public native void pasteAndGo(NSObject sender);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "pasteAndSearch:")
    public native void pasteAndSearch(NSObject sender);
    @Method(selector = "select:")
    public native void select(NSObject sender);
    @Method(selector = "selectAll:")
    public native void selectAll(NSObject sender);
    @Method(selector = "delete:")
    public native void delete(NSObject sender);
    @Method(selector = "makeTextWritingDirectionLeftToRight:")
    public native void makeTextWritingDirectionLeftToRight(NSObject sender);
    @Method(selector = "makeTextWritingDirectionRightToLeft:")
    public native void makeTextWritingDirectionRightToLeft(NSObject sender);
    @Method(selector = "toggleBoldface:")
    public native void toggleBoldface(NSObject sender);
    @Method(selector = "toggleItalics:")
    public native void toggleItalics(NSObject sender);
    @Method(selector = "toggleUnderline:")
    public native void toggleUnderline(NSObject sender);
    @Method(selector = "increaseSize:")
    public native void increaseSize(NSObject sender);
    @Method(selector = "decreaseSize:")
    public native void decreaseSize(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "find:")
    public native void find(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "findAndReplace:")
    public native void findAndReplace(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "findNext:")
    public native void findNext(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "findPrevious:")
    public native void findPrevious(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "useSelectionForFind:")
    public native void useSelectionForFind(NSObject sender);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "updateTextAttributesWithConversionHandler:")
    public native void updateTextAttributes(@Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> conversionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "print:")
    public native void print(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "rename:")
    public native void rename(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "duplicate:")
    public native void duplicate(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "move:")
    public native void move(NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "export:")
    public native void export(NSObject sender);
    @Method(selector = "pasteItemProviders:")
    public native void pasteItemProviders(NSArray<NSItemProvider> itemProviders);
    @Method(selector = "canPasteItemProviders:")
    public native boolean canPasteItemProviders(NSArray<NSItemProvider> itemProviders);
    /*</methods>*/
}
