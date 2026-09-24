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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextSearchingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITextSearching/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("selectedTextRange")
    public UITextRange getSelectedTextRange() { return null; }
    @NotImplemented("supportsTextReplacement")
    public boolean supportsTextReplacement() { return false; }
    @NotImplemented("selectedTextSearchDocument")
    public NSObject getSelectedTextSearchDocument() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("compareFoundRange:toRange:inDocument:")
    public NSComparisonResult compare(UITextRange foundRange, UITextRange toRange, NSObject document) { return null; }
    @NotImplemented("performTextSearchWithQueryString:usingOptions:resultAggregator:")
    public void performTextSearch(String string, UITextSearchOptions options, UITextSearchAggregator aggregator) {}
    @NotImplemented("decorateFoundTextRange:inDocument:usingStyle:")
    public void decorateFoundTextRange(UITextRange range, NSObject document, UITextSearchFoundTextStyle style) {}
    @NotImplemented("clearAllDecoratedFoundText")
    public void clearAllDecoratedFoundText() {}
    @NotImplemented("shouldReplaceFoundTextInRange:inDocument:withText:")
    public boolean shouldReplaceFoundTextInRange(UITextRange range, NSObject document, String replacementText) { return false; }
    @NotImplemented("replaceFoundTextInRange:inDocument:withText:")
    public void replaceFoundTextInRange(UITextRange range, NSObject document, String replacementText) {}
    @NotImplemented("replaceAllOccurrencesOfQueryString:usingOptions:withText:")
    public void replaceAllOccurrencesOfQueryString(String queryString, UITextSearchOptions options, String replacementText) {}
    @NotImplemented("willHighlightFoundTextRange:inDocument:")
    public void willHighlightFoundTextRange(UITextRange range, NSObject document) {}
    @NotImplemented("scrollRangeToVisible:inDocument:")
    public void scrollRangeToVisible(UITextRange range, NSObject document) {}
    @NotImplemented("compareOrderFromDocument:toDocument:")
    public NSComparisonResult compareOrder(NSObject fromDocument, NSObject toDocument) { return null; }
    /*</methods>*/
}
