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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIAccessibility/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObjectProtocol observeElementFocused(final Runnable block) {
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
        public static NSObjectProtocol observeAnnouncementDidFinish(final VoidBlock2<String, Boolean> block) {
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
        public static NSObjectProtocol observeMonoAudioStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeClosedCaptioningStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeInvertColorsStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeGuidedAccessStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeVoiceOverStatusChanged(final Runnable block) {
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
        public static NSObjectProtocol observeBoldTextStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeGrayscaleStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeReduceTransparencyStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeReduceMotionStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeDarkerSystemColorsStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeSwitchControlStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeSpeakSelectionStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeSpeakScreenStatusDidChange(final Runnable block) {
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
        public static NSObjectProtocol observeShakeToUndoDidChange(final Runnable block) {
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
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
