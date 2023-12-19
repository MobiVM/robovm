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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAccessibility/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("isAccessibilityElement")
    public boolean isAccessibilityElement() { return false; }
    @NotImplemented("setIsAccessibilityElement:")
    public void setAccessibilityElement(boolean v) {}
    @NotImplemented("accessibilityLabel")
    public String getAccessibilityLabel() { return null; }
    @NotImplemented("setAccessibilityLabel:")
    public void setAccessibilityLabel(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedLabel")
    public NSAttributedString getAccessibilityAttributedLabel() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedLabel:")
    public void setAccessibilityAttributedLabel(NSAttributedString v) {}
    @NotImplemented("accessibilityHint")
    public String getAccessibilityHint() { return null; }
    @NotImplemented("setAccessibilityHint:")
    public void setAccessibilityHint(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedHint")
    public NSAttributedString getAccessibilityAttributedHint() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedHint:")
    public void setAccessibilityAttributedHint(NSAttributedString v) {}
    @NotImplemented("accessibilityValue")
    public String getAccessibilityValue() { return null; }
    @NotImplemented("setAccessibilityValue:")
    public void setAccessibilityValue(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedValue")
    public NSAttributedString getAccessibilityAttributedValue() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedValue:")
    public void setAccessibilityAttributedValue(NSAttributedString v) {}
    @NotImplemented("accessibilityTraits")
    public UIAccessibilityTraits getAccessibilityTraits() { return null; }
    @NotImplemented("setAccessibilityTraits:")
    public void setAccessibilityTraits(UIAccessibilityTraits v) {}
    @NotImplemented("accessibilityFrame")
    public @ByVal CGRect getAccessibilityFrame() { return null; }
    @NotImplemented("setAccessibilityFrame:")
    public void setAccessibilityFrame(@ByVal CGRect v) {}
    @NotImplemented("accessibilityPath")
    public UIBezierPath getAccessibilityPath() { return null; }
    @NotImplemented("setAccessibilityPath:")
    public void setAccessibilityPath(UIBezierPath v) {}
    @NotImplemented("accessibilityActivationPoint")
    public @ByVal CGPoint getAccessibilityActivationPoint() { return null; }
    @NotImplemented("setAccessibilityActivationPoint:")
    public void setAccessibilityActivationPoint(@ByVal CGPoint v) {}
    @NotImplemented("accessibilityLanguage")
    public String getAccessibilityLanguage() { return null; }
    @NotImplemented("setAccessibilityLanguage:")
    public void setAccessibilityLanguage(String v) {}
    @NotImplemented("accessibilityElementsHidden")
    public boolean areAccessibilityElementsHidden() { return false; }
    @NotImplemented("setAccessibilityElementsHidden:")
    public void setAccessibilityElementsHidden(boolean v) {}
    @NotImplemented("accessibilityViewIsModal")
    public boolean isAccessibilityViewModal() { return false; }
    @NotImplemented("setAccessibilityViewIsModal:")
    public void setAccessibilityViewModal(boolean v) {}
    @NotImplemented("shouldGroupAccessibilityChildren")
    public boolean shouldGroupAccessibilityChildren() { return false; }
    @NotImplemented("setShouldGroupAccessibilityChildren:")
    public void setShouldGroupAccessibilityChildren(boolean v) {}
    @NotImplemented("accessibilityNavigationStyle")
    public UIAccessibilityNavigationStyle getAccessibilityNavigationStyle() { return null; }
    @NotImplemented("setAccessibilityNavigationStyle:")
    public void setAccessibilityNavigationStyle(UIAccessibilityNavigationStyle v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityRespondsToUserInteraction")
    public boolean isAccessibilityRespondsToUserInteraction() { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityRespondsToUserInteraction:")
    public void setAccessibilityRespondsToUserInteraction(boolean v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityUserInputLabels")
    public NSArray<NSString> getAccessibilityUserInputLabels() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityUserInputLabels:")
    public void setAccessibilityUserInputLabels(NSArray<NSString> v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityAttributedUserInputLabels")
    public NSArray<NSAttributedString> getAccessibilityAttributedUserInputLabels() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedUserInputLabels:")
    public void setAccessibilityAttributedUserInputLabels(NSArray<NSAttributedString> v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityTextualContext")
    public String getAccessibilityTextualContext() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityTextualContext:")
    public void setAccessibilityTextualContext(String v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityDirectTouchOptions")
    public UIAccessibilityDirectTouchOptions getAccessibilityDirectTouchOptions() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityDirectTouchOptions:")
    public void setAccessibilityDirectTouchOptions(UIAccessibilityDirectTouchOptions v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("isAccessibilityElementBlock")
    public @Block BooleanBlock getIsAccessibilityElementBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setIsAccessibilityElementBlock:")
    public void setIsAccessibilityElementBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityLabelBlock")
    public @Block Block0<String> getAccessibilityLabelBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityLabelBlock:")
    public void setAccessibilityLabelBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityValueBlock")
    public @Block Block0<String> getAccessibilityValueBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityValueBlock:")
    public void setAccessibilityValueBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityHintBlock")
    public @Block Block0<String> getAccessibilityHintBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityHintBlock:")
    public void setAccessibilityHintBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityTraitsBlock")
    public @Block Block0<UIAccessibilityTraits> getAccessibilityTraitsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityTraitsBlock:")
    public void setAccessibilityTraitsBlock(@Block Block0<UIAccessibilityTraits> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityIdentifierBlock")
    public @Block Block0<String> getAccessibilityIdentifierBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityIdentifierBlock:")
    public void setAccessibilityIdentifierBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityHeaderElementsBlock")
    public @Block Block0<NSArray<?>> getAccessibilityHeaderElementsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityHeaderElementsBlock:")
    public void setAccessibilityHeaderElementsBlock(@Block Block0<NSArray<?>> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityAttributedLabelBlock")
    public @Block Block0<NSAttributedString> getAccessibilityAttributedLabelBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedLabelBlock:")
    public void setAccessibilityAttributedLabelBlock(@Block Block0<NSAttributedString> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityAttributedHintBlock")
    public @Block Block0<NSAttributedString> getAccessibilityAttributedHintBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedHintBlock:")
    public void setAccessibilityAttributedHintBlock(@Block Block0<NSAttributedString> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityLanguageBlock")
    public @Block Block0<String> getAccessibilityLanguageBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityLanguageBlock:")
    public void setAccessibilityLanguageBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityTextualContextBlock")
    public @Block Block0<String> getAccessibilityTextualContextBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityTextualContextBlock:")
    public void setAccessibilityTextualContextBlock(@Block Block0<String> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityUserInputLabelsBlock")
    public @Block Block0<NSArray<NSString>> getAccessibilityUserInputLabelsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityUserInputLabelsBlock:")
    public void setAccessibilityUserInputLabelsBlock(@Block Block0<NSArray<NSString>> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityAttributedUserInputLabelsBlock")
    public @Block Block0<NSArray<NSAttributedString>> getAccessibilityAttributedUserInputLabelsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedUserInputLabelsBlock:")
    public void setAccessibilityAttributedUserInputLabelsBlock(@Block Block0<NSArray<NSAttributedString>> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityAttributedValueBlock")
    public @Block Block0<NSAttributedString> getAccessibilityAttributedValueBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedValueBlock:")
    public void setAccessibilityAttributedValueBlock(@Block Block0<NSAttributedString> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityElementsHiddenBlock")
    public @Block BooleanBlock getAccessibilityElementsHiddenBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityElementsHiddenBlock:")
    public void setAccessibilityElementsHiddenBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityRespondsToUserInteractionBlock")
    public @Block BooleanBlock getAccessibilityRespondsToUserInteractionBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityRespondsToUserInteractionBlock:")
    public void setAccessibilityRespondsToUserInteractionBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityViewIsModalBlock")
    public @Block BooleanBlock getAccessibilityViewIsModalBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityViewIsModalBlock:")
    public void setAccessibilityViewIsModalBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityShouldGroupAccessibilityChildrenBlock")
    public @Block BooleanBlock getAccessibilityShouldGroupAccessibilityChildrenBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityShouldGroupAccessibilityChildrenBlock:")
    public void setAccessibilityShouldGroupAccessibilityChildrenBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityElementsBlock")
    public @Block Block0<NSArray<?>> getAccessibilityElementsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityElementsBlock:")
    public void setAccessibilityElementsBlock(@Block Block0<NSArray<?>> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("automationElementsBlock")
    public @Block Block0<NSArray<?>> getAutomationElementsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAutomationElementsBlock:")
    public void setAutomationElementsBlock(@Block Block0<NSArray<?>> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityContainerTypeBlock")
    public @Block Block0<UIAccessibilityContainerType> getAccessibilityContainerTypeBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityContainerTypeBlock:")
    public void setAccessibilityContainerTypeBlock(@Block Block0<UIAccessibilityContainerType> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityActivationPointBlock")
    public @Block Block0<CGPoint> getAccessibilityActivationPointBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityActivationPointBlock:")
    public void setAccessibilityActivationPointBlock(@Block Block0<CGPoint> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityFrameBlock")
    public @Block Block0<CGRect> getAccessibilityFrameBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityFrameBlock:")
    public void setAccessibilityFrameBlock(@Block Block0<CGRect> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityNavigationStyleBlock")
    public @Block Block0<UIAccessibilityNavigationStyle> getAccessibilityNavigationStyleBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityNavigationStyleBlock:")
    public void setAccessibilityNavigationStyleBlock(@Block Block0<UIAccessibilityNavigationStyle> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityPathBlock")
    public @Block Block0<UIBezierPath> getAccessibilityPathBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityPathBlock:")
    public void setAccessibilityPathBlock(@Block Block0<UIBezierPath> v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityActivateBlock")
    public @Block BooleanBlock getAccessibilityActivateBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityActivateBlock:")
    public void setAccessibilityActivateBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityIncrementBlock")
    public @Block Runnable getAccessibilityIncrementBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityIncrementBlock:")
    public void setAccessibilityIncrementBlock(@Block Runnable v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityDecrementBlock")
    public @Block Runnable getAccessibilityDecrementBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityDecrementBlock:")
    public void setAccessibilityDecrementBlock(@Block Runnable v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityPerformEscapeBlock")
    public @Block BooleanBlock getAccessibilityPerformEscapeBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityPerformEscapeBlock:")
    public void setAccessibilityPerformEscapeBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityMagicTapBlock")
    public @Block BooleanBlock getAccessibilityMagicTapBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityMagicTapBlock:")
    public void setAccessibilityMagicTapBlock(@Block BooleanBlock v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("accessibilityCustomActionsBlock")
    public @Block Block0<NSArray<UIAccessibilityCustomAction>> getAccessibilityCustomActionsBlock() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setAccessibilityCustomActionsBlock:")
    public void setAccessibilityCustomActionsBlock(@Block Block0<NSArray<UIAccessibilityCustomAction>> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
