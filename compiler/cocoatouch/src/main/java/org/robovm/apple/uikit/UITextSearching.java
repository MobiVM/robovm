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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITextSearching/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "selectedTextRange")
    UITextRange getSelectedTextRange();
    @Property(selector = "supportsTextReplacement")
    boolean supportsTextReplacement();
    @Property(selector = "selectedTextSearchDocument")
    NSObject getSelectedTextSearchDocument();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "compareFoundRange:toRange:inDocument:")
    NSComparisonResult compare(UITextRange foundRange, UITextRange toRange, NSObject document);
    @Method(selector = "performTextSearchWithQueryString:usingOptions:resultAggregator:")
    void performTextSearch(String string, UITextSearchOptions options, UITextSearchAggregator aggregator);
    @Method(selector = "decorateFoundTextRange:inDocument:usingStyle:")
    void decorateFoundTextRange(UITextRange range, NSObject document, UITextSearchFoundTextStyle style);
    @Method(selector = "clearAllDecoratedFoundText")
    void clearAllDecoratedFoundText();
    @Method(selector = "shouldReplaceFoundTextInRange:inDocument:withText:")
    boolean shouldReplaceFoundTextInRange(UITextRange range, NSObject document, String replacementText);
    @Method(selector = "replaceFoundTextInRange:inDocument:withText:")
    void replaceFoundTextInRange(UITextRange range, NSObject document, String replacementText);
    @Method(selector = "replaceAllOccurrencesOfQueryString:usingOptions:withText:")
    void replaceAllOccurrencesOfQueryString(String queryString, UITextSearchOptions options, String replacementText);
    @Method(selector = "willHighlightFoundTextRange:inDocument:")
    void willHighlightFoundTextRange(UITextRange range, NSObject document);
    @Method(selector = "scrollRangeToVisible:inDocument:")
    void scrollRangeToVisible(UITextRange range, NSObject document);
    @Method(selector = "compareOrderFromDocument:toDocument:")
    NSComparisonResult compareOrder(NSObject fromDocument, NSObject toDocument);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
