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
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSTextElementProvider/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "documentRange")
    NSTextRange getDocumentRange();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "enumerateTextElementsFromLocation:options:usingBlock:")
    NSTextLocation enumerateTextElements(NSTextLocation textLocation, NSTextContentManagerEnumerationOptions options, @Block Block1<NSTextElement, Boolean> block);
    @Method(selector = "replaceContentsInRange:withTextElements:")
    void replaceContents(NSTextRange range, NSArray<NSTextElement> textElements);
    @Method(selector = "synchronizeToBackingStore:")
    void synchronizeToBackingStore(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "locationFromLocation:withOffset:")
    NSTextLocation getLocationFromLocation(NSTextLocation location, @MachineSizedSInt long offset);
    @Method(selector = "offsetFromLocation:toLocation:")
    @MachineSizedSInt long getOffsetFromLocation(NSTextLocation from, NSTextLocation to);
    @Method(selector = "adjustedRangeFromRange:forEditingTextSelection:")
    NSTextRange adjustedRange(NSTextRange textRange, boolean forEditingTextSelection);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
