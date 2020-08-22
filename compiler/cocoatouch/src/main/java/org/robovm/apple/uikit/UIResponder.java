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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIResponder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAccessibility/*</implements>*/ {

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
    @Property(selector = "isAccessibilityElement")
    public native boolean isAccessibilityElement();
    @Property(selector = "setIsAccessibilityElement:")
    public native void setAccessibilityElement(boolean v);
    @Property(selector = "accessibilityLabel")
    public native String getAccessibilityLabel();
    @Property(selector = "setAccessibilityLabel:")
    public native void setAccessibilityLabel(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedLabel")
    public native NSAttributedString getAccessibilityAttributedLabel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedLabel:")
    public native void setAccessibilityAttributedLabel(NSAttributedString v);
    @Property(selector = "accessibilityHint")
    public native String getAccessibilityHint();
    @Property(selector = "setAccessibilityHint:")
    public native void setAccessibilityHint(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedHint")
    public native NSAttributedString getAccessibilityAttributedHint();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedHint:")
    public native void setAccessibilityAttributedHint(NSAttributedString v);
    @Property(selector = "accessibilityValue")
    public native String getAccessibilityValue();
    @Property(selector = "setAccessibilityValue:")
    public native void setAccessibilityValue(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedValue")
    public native NSAttributedString getAccessibilityAttributedValue();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedValue:")
    public native void setAccessibilityAttributedValue(NSAttributedString v);
    @Property(selector = "accessibilityTraits")
    public native UIAccessibilityTraits getAccessibilityTraits();
    @Property(selector = "setAccessibilityTraits:")
    public native void setAccessibilityTraits(UIAccessibilityTraits v);
    @Property(selector = "accessibilityFrame")
    public native @ByVal CGRect getAccessibilityFrame();
    @Property(selector = "setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByVal CGRect v);
    @Property(selector = "accessibilityPath")
    public native UIBezierPath getAccessibilityPath();
    @Property(selector = "setAccessibilityPath:")
    public native void setAccessibilityPath(UIBezierPath v);
    @Property(selector = "accessibilityActivationPoint")
    public native @ByVal CGPoint getAccessibilityActivationPoint();
    @Property(selector = "setAccessibilityActivationPoint:")
    public native void setAccessibilityActivationPoint(@ByVal CGPoint v);
    @Property(selector = "accessibilityLanguage")
    public native String getAccessibilityLanguage();
    @Property(selector = "setAccessibilityLanguage:")
    public native void setAccessibilityLanguage(String v);
    @Property(selector = "accessibilityElementsHidden")
    public native boolean areAccessibilityElementsHidden();
    @Property(selector = "setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean v);
    @Property(selector = "accessibilityViewIsModal")
    public native boolean isAccessibilityViewModal();
    @Property(selector = "setAccessibilityViewIsModal:")
    public native void setAccessibilityViewModal(boolean v);
    @Property(selector = "shouldGroupAccessibilityChildren")
    public native boolean shouldGroupAccessibilityChildren();
    @Property(selector = "setShouldGroupAccessibilityChildren:")
    public native void setShouldGroupAccessibilityChildren(boolean v);
    @Property(selector = "accessibilityNavigationStyle")
    public native UIAccessibilityNavigationStyle getAccessibilityNavigationStyle();
    @Property(selector = "setAccessibilityNavigationStyle:")
    public native void setAccessibilityNavigationStyle(UIAccessibilityNavigationStyle v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityRespondsToUserInteraction")
    public native boolean isAccessibilityRespondsToUserInteraction();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityRespondsToUserInteraction:")
    public native void setAccessibilityRespondsToUserInteraction(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityUserInputLabels")
    public native NSArray<NSString> getAccessibilityUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityUserInputLabels:")
    public native void setAccessibilityUserInputLabels(NSArray<NSString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityAttributedUserInputLabels")
    public native NSArray<NSAttributedString> getAccessibilityAttributedUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedUserInputLabels:")
    public native void setAccessibilityAttributedUserInputLabels(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityTextualContext")
    public native String getAccessibilityTextualContext();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityTextualContext:")
    public native void setAccessibilityTextualContext(String v);
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
    /*</methods>*/
}
