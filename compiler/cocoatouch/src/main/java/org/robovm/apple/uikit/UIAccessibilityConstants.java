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
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIAccessibilityConstants.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextWordProcessing", optional=true)
    public static native String TextualContextWordProcessing();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextNarrative", optional=true)
    public static native String TextualContextNarrative();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextMessaging", optional=true)
    public static native String TextualContextMessaging();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextSpreadsheet", optional=true)
    public static native String TextualContextSpreadsheet();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextFileSystem", optional=true)
    public static native String TextualContextFileSystem();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextSourceCode", optional=true)
    public static native String TextualContextSourceCode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextualContextConsole", optional=true)
    public static native String TextualContextConsole();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPriorityHigh", optional=true)
    public static native String PriorityHigh();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPriorityDefault", optional=true)
    public static native String PriorityDefault();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityPriorityLow", optional=true)
    public static native String PriorityLow();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextAttributeHeadingLevel", optional=true)
    public static native NSString TextAttributeHeadingLevel();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextAttributeCustom", optional=true)
    public static native NSString TextAttributeCustom();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTextAttributeContext", optional=true)
    public static native NSString TextAttributeContext();
    /*</methods>*/
}
