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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIKit/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIKit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSDirectionalEdgeInsetsZero", optional=true)
    public static native @ByVal NSDirectionalEdgeInsets Value__NSDirectionalEdgeInsetsZero();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIFocusDidUpdateNotification", optional=true)
    public static native String Value__UIFocusDidUpdateNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIFocusMovementDidFailNotification", optional=true)
    public static native String Value__UIFocusMovementDidFailNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIFocusUpdateContextKey", optional=true)
    public static native String Value__UIFocusUpdateContextKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIFocusUpdateAnimationCoordinatorKey", optional=true)
    public static native String Value__UIFocusUpdateAnimationCoordinatorKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextAttributeHeadingLevel", optional=true)
    public static native String Value__UIAccessibilityTextAttributeHeadingLevel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextAttributeCustom", optional=true)
    public static native String Value__UIAccessibilityTextAttributeCustom();
    @GlobalValue(symbol="NSDocumentTypeDocumentOption", optional=true)
    public static native String Value__NSDocumentTypeDocumentOption();
    @GlobalValue(symbol="NSDefaultAttributesDocumentOption", optional=true)
    public static native String Value__NSDefaultAttributesDocumentOption();
    @GlobalValue(symbol="NSCharacterEncodingDocumentOption", optional=true)
    public static native String Value__NSCharacterEncodingDocumentOption();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="UIContentSizeCategoryIsAccessibilityCategory", optional=true)
    public static native boolean function__UIContentSizeCategoryIsAccessibilityCategory(String category);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="UIContentSizeCategoryCompareToCategory", optional=true)
    public static native NSComparisonResult function__UIContentSizeCategoryCompareToCategory(String lhs, String rhs);
    /*</methods>*/
}
