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
package org.robovm.apple.accessibility;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXSettings/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AXSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("Accessibility")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AXPrefersHorizontalTextLayoutDidChangeNotification", optional=true)
        public static native String PrefersHorizontalTextLayoutDidChange();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AXAnimatedImagesEnabledDidChangeNotification", optional=true)
        public static native String AnimatedImagesEnabledDidChange();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="AXPrefersNonBlinkingTextInsertionIndicatorDidChangeNotification", optional=true)
        public static native String PrefersNonBlinkingTextInsertionIndicatorDidChange();
        /**
         * @since Available in iOS 26.1 and later.
         */
        @GlobalValue(symbol="AXPrefersActionSliderAlternativeDidChangeNotification", optional=true)
        public static native String PrefersActionSliderAlternativeDidChange();
        /**
         * @since Available in iOS 26.1 and later.
         */
        @GlobalValue(symbol="AXShowBordersEnabledStatusDidChangeNotification", optional=true)
        public static native String ShowBordersEnabledStatusDidChange();
    }
    
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="AXPrefersHorizontalTextLayout", optional=true)
    public static native boolean prefersHorizontalTextLayout();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="AXAnimatedImagesEnabled", optional=true)
    public static native boolean isAnimatedImagesEnabled();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="AXAssistiveAccessEnabled", optional=true)
    public static native boolean isAssistiveAccessEnabled();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="AXPrefersNonBlinkingTextInsertionIndicator", optional=true)
    public static native boolean prefersNonBlinkingTextInsertionIndicator();
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Bridge(symbol="AXPrefersActionSliderAlternative", optional=true)
    public static native boolean prefersActionSliderAlternative();
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Bridge(symbol="AXShowBordersEnabled", optional=true)
    public static native boolean isShowBordersEnabled();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="AXOpenSettingsFeature", optional=true)
    public static native void openSettingsFeature(AXSettingsFeature feature, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
