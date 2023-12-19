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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIAccessibility/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeElementFocused(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.ElementFocusedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeAnnouncementDidFinish(final VoidBlock2<String, Boolean> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.AnnouncementDidFinishNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    NSString string = (NSString)data.get(UIAccessibilityGlobals.AnnouncementKeyStringValue());
                    NSNumber successful = (NSNumber)data.get(UIAccessibilityGlobals.AnnouncementKeyWasSuccessful());
                    block.invoke(string.toString(), successful.booleanValue());
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeMonoAudioStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.MonoAudioStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeClosedCaptioningStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.ClosedCaptioningStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeInvertColorsStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.InvertColorsStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeGuidedAccessStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.GuidedAccessStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeVoiceOverStatusChanged(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.VoiceOverStatusChangedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeBoldTextStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.BoldTextStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeGrayscaleStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.GrayscaleStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeReduceTransparencyStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.ReduceTransparencyStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeReduceMotionStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.ReduceMotionStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeDarkerSystemColorsStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.DarkerSystemColorsStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeSwitchControlStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.SwitchControlStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeSpeakSelectionStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.SpeakSelectionStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeSpeakScreenStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.SpeakScreenStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeShakeToUndoDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UIAccessibilityGlobals.ShakeToUndoDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "isAccessibilityElement")
    boolean isAccessibilityElement();
    @Property(selector = "setIsAccessibilityElement:")
    void setAccessibilityElement(boolean v);
    @Property(selector = "accessibilityLabel")
    String getAccessibilityLabel();
    @Property(selector = "setAccessibilityLabel:")
    void setAccessibilityLabel(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedLabel")
    NSAttributedString getAccessibilityAttributedLabel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedLabel:")
    void setAccessibilityAttributedLabel(NSAttributedString v);
    @Property(selector = "accessibilityHint")
    String getAccessibilityHint();
    @Property(selector = "setAccessibilityHint:")
    void setAccessibilityHint(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedHint")
    NSAttributedString getAccessibilityAttributedHint();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedHint:")
    void setAccessibilityAttributedHint(NSAttributedString v);
    @Property(selector = "accessibilityValue")
    String getAccessibilityValue();
    @Property(selector = "setAccessibilityValue:")
    void setAccessibilityValue(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityAttributedValue")
    NSAttributedString getAccessibilityAttributedValue();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedValue:")
    void setAccessibilityAttributedValue(NSAttributedString v);
    @Property(selector = "accessibilityTraits")
    UIAccessibilityTraits getAccessibilityTraits();
    @Property(selector = "setAccessibilityTraits:")
    void setAccessibilityTraits(UIAccessibilityTraits v);
    @Property(selector = "accessibilityFrame")
    @ByVal CGRect getAccessibilityFrame();
    @Property(selector = "setAccessibilityFrame:")
    void setAccessibilityFrame(@ByVal CGRect v);
    @Property(selector = "accessibilityPath")
    UIBezierPath getAccessibilityPath();
    @Property(selector = "setAccessibilityPath:")
    void setAccessibilityPath(UIBezierPath v);
    @Property(selector = "accessibilityActivationPoint")
    @ByVal CGPoint getAccessibilityActivationPoint();
    @Property(selector = "setAccessibilityActivationPoint:")
    void setAccessibilityActivationPoint(@ByVal CGPoint v);
    @Property(selector = "accessibilityLanguage")
    String getAccessibilityLanguage();
    @Property(selector = "setAccessibilityLanguage:")
    void setAccessibilityLanguage(String v);
    @Property(selector = "accessibilityElementsHidden")
    boolean areAccessibilityElementsHidden();
    @Property(selector = "setAccessibilityElementsHidden:")
    void setAccessibilityElementsHidden(boolean v);
    @Property(selector = "accessibilityViewIsModal")
    boolean isAccessibilityViewModal();
    @Property(selector = "setAccessibilityViewIsModal:")
    void setAccessibilityViewModal(boolean v);
    @Property(selector = "shouldGroupAccessibilityChildren")
    boolean shouldGroupAccessibilityChildren();
    @Property(selector = "setShouldGroupAccessibilityChildren:")
    void setShouldGroupAccessibilityChildren(boolean v);
    @Property(selector = "accessibilityNavigationStyle")
    UIAccessibilityNavigationStyle getAccessibilityNavigationStyle();
    @Property(selector = "setAccessibilityNavigationStyle:")
    void setAccessibilityNavigationStyle(UIAccessibilityNavigationStyle v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityRespondsToUserInteraction")
    boolean isAccessibilityRespondsToUserInteraction();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityRespondsToUserInteraction:")
    void setAccessibilityRespondsToUserInteraction(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityUserInputLabels")
    NSArray<NSString> getAccessibilityUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityUserInputLabels:")
    void setAccessibilityUserInputLabels(NSArray<NSString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityAttributedUserInputLabels")
    NSArray<NSAttributedString> getAccessibilityAttributedUserInputLabels();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedUserInputLabels:")
    void setAccessibilityAttributedUserInputLabels(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityTextualContext")
    String getAccessibilityTextualContext();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccessibilityTextualContext:")
    void setAccessibilityTextualContext(String v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityDirectTouchOptions")
    UIAccessibilityDirectTouchOptions getAccessibilityDirectTouchOptions();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityDirectTouchOptions:")
    void setAccessibilityDirectTouchOptions(UIAccessibilityDirectTouchOptions v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isAccessibilityElementBlock")
    @Block BooleanBlock getIsAccessibilityElementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setIsAccessibilityElementBlock:")
    void setIsAccessibilityElementBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityLabelBlock")
    @Block Block0<String> getAccessibilityLabelBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityLabelBlock:")
    void setAccessibilityLabelBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityValueBlock")
    @Block Block0<String> getAccessibilityValueBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityValueBlock:")
    void setAccessibilityValueBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityHintBlock")
    @Block Block0<String> getAccessibilityHintBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityHintBlock:")
    void setAccessibilityHintBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityTraitsBlock")
    @Block Block0<UIAccessibilityTraits> getAccessibilityTraitsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityTraitsBlock:")
    void setAccessibilityTraitsBlock(@Block Block0<UIAccessibilityTraits> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityIdentifierBlock")
    @Block Block0<String> getAccessibilityIdentifierBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityIdentifierBlock:")
    void setAccessibilityIdentifierBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityHeaderElementsBlock")
    @Block Block0<NSArray<?>> getAccessibilityHeaderElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityHeaderElementsBlock:")
    void setAccessibilityHeaderElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedLabelBlock")
    @Block Block0<NSAttributedString> getAccessibilityAttributedLabelBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedLabelBlock:")
    void setAccessibilityAttributedLabelBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedHintBlock")
    @Block Block0<NSAttributedString> getAccessibilityAttributedHintBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedHintBlock:")
    void setAccessibilityAttributedHintBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityLanguageBlock")
    @Block Block0<String> getAccessibilityLanguageBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityLanguageBlock:")
    void setAccessibilityLanguageBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityTextualContextBlock")
    @Block Block0<String> getAccessibilityTextualContextBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityTextualContextBlock:")
    void setAccessibilityTextualContextBlock(@Block Block0<String> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityUserInputLabelsBlock")
    @Block Block0<NSArray<NSString>> getAccessibilityUserInputLabelsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityUserInputLabelsBlock:")
    void setAccessibilityUserInputLabelsBlock(@Block Block0<NSArray<NSString>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedUserInputLabelsBlock")
    @Block Block0<NSArray<NSAttributedString>> getAccessibilityAttributedUserInputLabelsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedUserInputLabelsBlock:")
    void setAccessibilityAttributedUserInputLabelsBlock(@Block Block0<NSArray<NSAttributedString>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityAttributedValueBlock")
    @Block Block0<NSAttributedString> getAccessibilityAttributedValueBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityAttributedValueBlock:")
    void setAccessibilityAttributedValueBlock(@Block Block0<NSAttributedString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityElementsHiddenBlock")
    @Block BooleanBlock getAccessibilityElementsHiddenBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityElementsHiddenBlock:")
    void setAccessibilityElementsHiddenBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityRespondsToUserInteractionBlock")
    @Block BooleanBlock getAccessibilityRespondsToUserInteractionBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityRespondsToUserInteractionBlock:")
    void setAccessibilityRespondsToUserInteractionBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityViewIsModalBlock")
    @Block BooleanBlock getAccessibilityViewIsModalBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityViewIsModalBlock:")
    void setAccessibilityViewIsModalBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityShouldGroupAccessibilityChildrenBlock")
    @Block BooleanBlock getAccessibilityShouldGroupAccessibilityChildrenBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityShouldGroupAccessibilityChildrenBlock:")
    void setAccessibilityShouldGroupAccessibilityChildrenBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityElementsBlock")
    @Block Block0<NSArray<?>> getAccessibilityElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityElementsBlock:")
    void setAccessibilityElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "automationElementsBlock")
    @Block Block0<NSArray<?>> getAutomationElementsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAutomationElementsBlock:")
    void setAutomationElementsBlock(@Block Block0<NSArray<?>> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityContainerTypeBlock")
    @Block Block0<UIAccessibilityContainerType> getAccessibilityContainerTypeBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityContainerTypeBlock:")
    void setAccessibilityContainerTypeBlock(@Block Block0<UIAccessibilityContainerType> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityActivationPointBlock")
    @Block Block0<CGPoint> getAccessibilityActivationPointBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityActivationPointBlock:")
    void setAccessibilityActivationPointBlock(@Block Block0<CGPoint> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityFrameBlock")
    @Block Block0<CGRect> getAccessibilityFrameBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityFrameBlock:")
    void setAccessibilityFrameBlock(@Block Block0<CGRect> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityNavigationStyleBlock")
    @Block Block0<UIAccessibilityNavigationStyle> getAccessibilityNavigationStyleBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityNavigationStyleBlock:")
    void setAccessibilityNavigationStyleBlock(@Block Block0<UIAccessibilityNavigationStyle> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityPathBlock")
    @Block Block0<UIBezierPath> getAccessibilityPathBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityPathBlock:")
    void setAccessibilityPathBlock(@Block Block0<UIBezierPath> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityActivateBlock")
    @Block BooleanBlock getAccessibilityActivateBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityActivateBlock:")
    void setAccessibilityActivateBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityIncrementBlock")
    @Block Runnable getAccessibilityIncrementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityIncrementBlock:")
    void setAccessibilityIncrementBlock(@Block Runnable v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityDecrementBlock")
    @Block Runnable getAccessibilityDecrementBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityDecrementBlock:")
    void setAccessibilityDecrementBlock(@Block Runnable v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityPerformEscapeBlock")
    @Block BooleanBlock getAccessibilityPerformEscapeBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityPerformEscapeBlock:")
    void setAccessibilityPerformEscapeBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityMagicTapBlock")
    @Block BooleanBlock getAccessibilityMagicTapBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityMagicTapBlock:")
    void setAccessibilityMagicTapBlock(@Block BooleanBlock v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "accessibilityCustomActionsBlock")
    @Block Block0<NSArray<UIAccessibilityCustomAction>> getAccessibilityCustomActionsBlock();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAccessibilityCustomActionsBlock:")
    void setAccessibilityCustomActionsBlock(@Block Block0<NSArray<UIAccessibilityCustomAction>> v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
