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
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(NSString.AsStringMarshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityGlobals/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIAccessibilityGlobals.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public static void postNotification(UIAccessibilityNotification notification, NSObject argument) {
        postNotification(notification.value(), argument);
    }
    /*<methods>*/
    @GlobalValue(symbol="UIAccessibilityAnnouncementDidFinishNotification", optional=true)
    public static native NSString AnnouncementDidFinishNotification();
    @GlobalValue(symbol="UIAccessibilityAnnouncementKeyStringValue", optional=true)
    public static native NSString AnnouncementKeyStringValue();
    @GlobalValue(symbol="UIAccessibilityAnnouncementKeyWasSuccessful", optional=true)
    public static native NSString AnnouncementKeyWasSuccessful();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityElementFocusedNotification", optional=true)
    public static native NSString ElementFocusedNotification();
    @GlobalValue(symbol="UIAccessibilityNotificationSwitchControlIdentifier", optional=true)
    public static native String SwitchControlIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityNotificationVoiceOverIdentifier", optional=true)
    public static native String VoiceOverIdentifier();
    /**
     * @deprecated Deprecated in iOS 11.0. Use UIAccessibilityVoiceOverStatusDidChangeNotification
     */
    @Deprecated
    @GlobalValue(symbol="UIAccessibilityVoiceOverStatusChanged", optional=true)
    public static native NSString VoiceOverStatusChangedNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityVoiceOverStatusDidChangeNotification", optional=true)
    public static native NSString VoiceOverStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityMonoAudioStatusDidChangeNotification", optional=true)
    public static native NSString MonoAudioStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityClosedCaptioningStatusDidChangeNotification", optional=true)
    public static native NSString ClosedCaptioningStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityInvertColorsStatusDidChangeNotification", optional=true)
    public static native NSString InvertColorsStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityGuidedAccessStatusDidChangeNotification", optional=true)
    public static native NSString GuidedAccessStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityBoldTextStatusDidChangeNotification", optional=true)
    public static native NSString BoldTextStatusDidChangeNotification();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityButtonShapesEnabledStatusDidChangeNotification", optional=true)
    public static native NSString ButtonShapesEnabledStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityGrayscaleStatusDidChangeNotification", optional=true)
    public static native NSString GrayscaleStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityReduceTransparencyStatusDidChangeNotification", optional=true)
    public static native NSString ReduceTransparencyStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityReduceMotionStatusDidChangeNotification", optional=true)
    public static native NSString ReduceMotionStatusDidChangeNotification();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPrefersCrossFadeTransitionsStatusDidChangeNotification", optional=true)
    public static native NSString PrefersCrossFadeTransitionsStatusDidChangeNotification();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityVideoAutoplayStatusDidChangeNotification", optional=true)
    public static native NSString VideoAutoplayStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilityDarkerSystemColorsStatusDidChangeNotification", optional=true)
    public static native NSString DarkerSystemColorsStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilitySwitchControlStatusDidChangeNotification", optional=true)
    public static native NSString SwitchControlStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilitySpeakSelectionStatusDidChangeNotification", optional=true)
    public static native NSString SpeakSelectionStatusDidChangeNotification();
    @GlobalValue(symbol="UIAccessibilitySpeakScreenStatusDidChangeNotification", optional=true)
    public static native NSString SpeakScreenStatusDidChangeNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityShakeToUndoDidChangeNotification", optional=true)
    public static native NSString ShakeToUndoDidChangeNotification();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityAssistiveTouchStatusDidChangeNotification", optional=true)
    public static native NSString AssistiveTouchStatusDidChangeNotification();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityShouldDifferentiateWithoutColorDidChangeNotification", optional=true)
    public static native NSString ShouldDifferentiateWithoutColorDidChangeNotification();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityOnOffSwitchLabelsDidChangeNotification", optional=true)
    public static native NSString OnOffSwitchLabelsDidChangeNotification();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityHearingDevicePairedEarDidChangeNotification", optional=true)
    public static native NSString HearingDevicePairedEarDidChangeNotification();
    
    @Bridge(symbol="UIAccessibilityZoomFocusChanged", optional=true)
    public static native void zoomFocusChanged(UIAccessibilityZoomType type, @ByVal CGRect frame, UIView view);
    @Bridge(symbol="UIAccessibilityRegisterGestureConflictWithZoom", optional=true)
    public static native void registerGestureConflictWithZoom();
    @Bridge(symbol="UIAccessibilityConvertFrameToScreenCoordinates", optional=true)
    public static native @ByVal CGRect convertFrameToScreenCoordinates(@ByVal CGRect rect, UIView view);
    @Bridge(symbol="UIAccessibilityConvertPathToScreenCoordinates", optional=true)
    public static native UIBezierPath convertPathToScreenCoordinates(UIBezierPath path, UIView view);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="UIAccessibilityFocusedElement", optional=true)
    public static native NSObject getFocusedElement(String assistiveTechnologyIdentifier);
    @Bridge(symbol="UIAccessibilityPostNotification", optional=true)
    public static native void postNotification(int notification, NSObject argument);
    @Bridge(symbol="UIAccessibilityIsVoiceOverRunning", optional=true)
    public static native boolean isVoiceOverRunning();
    @Bridge(symbol="UIAccessibilityIsMonoAudioEnabled", optional=true)
    public static native boolean isMonoAudioEnabled();
    @Bridge(symbol="UIAccessibilityIsClosedCaptioningEnabled", optional=true)
    public static native boolean isClosedCaptioningEnabled();
    @Bridge(symbol="UIAccessibilityIsInvertColorsEnabled", optional=true)
    public static native boolean isInvertColorsEnabled();
    @Bridge(symbol="UIAccessibilityIsGuidedAccessEnabled", optional=true)
    public static native boolean isGuidedAccessEnabled();
    @Bridge(symbol="UIAccessibilityIsBoldTextEnabled", optional=true)
    public static native boolean isBoldTextEnabled();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="UIAccessibilityButtonShapesEnabled", optional=true)
    public static native boolean buttonShapesEnabled();
    @Bridge(symbol="UIAccessibilityIsGrayscaleEnabled", optional=true)
    public static native boolean isGrayscaleEnabled();
    @Bridge(symbol="UIAccessibilityIsReduceTransparencyEnabled", optional=true)
    public static native boolean isReduceTransparencyEnabled();
    @Bridge(symbol="UIAccessibilityIsReduceMotionEnabled", optional=true)
    public static native boolean isReduceMotionEnabled();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="UIAccessibilityPrefersCrossFadeTransitions", optional=true)
    public static native boolean prefersCrossFadeTransitions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="UIAccessibilityIsVideoAutoplayEnabled", optional=true)
    public static native boolean isVideoAutoplayEnabled();
    @Bridge(symbol="UIAccessibilityDarkerSystemColorsEnabled", optional=true)
    public static native boolean areDarkerSystemColorsEnabled();
    @Bridge(symbol="UIAccessibilityIsSwitchControlRunning", optional=true)
    public static native boolean isSwitchControlRunning();
    @Bridge(symbol="UIAccessibilityIsSpeakSelectionEnabled", optional=true)
    public static native boolean isSpeakSelectionEnabled();
    @Bridge(symbol="UIAccessibilityIsSpeakScreenEnabled", optional=true)
    public static native boolean isSpeakScreenEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="UIAccessibilityIsShakeToUndoEnabled", optional=true)
    public static native boolean isShakeToUndoEnabled();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="UIAccessibilityIsAssistiveTouchRunning", optional=true)
    public static native boolean isAssistiveTouchRunning();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="UIAccessibilityShouldDifferentiateWithoutColor", optional=true)
    public static native boolean shouldDifferentiateWithoutColor();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="UIAccessibilityIsOnOffSwitchLabelsEnabled", optional=true)
    public static native boolean isOnOffSwitchLabelsEnabled();
    @Bridge(symbol="UIAccessibilityRequestGuidedAccessSession", optional=true)
    public static native void requestGuidedAccessSession(boolean enable, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="UIAccessibilityHearingDevicePairedEar", optional=true)
    public static native UIAccessibilityHearingDeviceEar getHearingDevicePairingStatus();
    /*</methods>*/
}
