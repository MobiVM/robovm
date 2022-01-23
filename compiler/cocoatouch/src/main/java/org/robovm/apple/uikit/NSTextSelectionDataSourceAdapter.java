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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextSelectionDataSourceAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSTextSelectionDataSource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("documentRange")
    public NSTextRange getDocumentRange() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("enumerateSubstringsFromLocation:options:usingBlock:")
    public void enumerateSubstringsFromLocation(NSTextLocation location, NSStringEnumerationOptions options, @Block VoidBlock4<NSString, NSTextRange, NSTextRange, BooleanPtr> block) {}
    @NotImplemented("textRangeForSelectionGranularity:enclosingLocation:")
    public NSTextRange getTextRangeForSelectionGranularity(NSTextSelectionGranularity selectionGranularity, NSTextLocation location) { return null; }
    @NotImplemented("locationFromLocation:withOffset:")
    public NSTextLocation getLocationFromLocation(NSTextLocation location, @MachineSizedSInt long offset) { return null; }
    @NotImplemented("offsetFromLocation:toLocation:")
    public @MachineSizedSInt long getOffsetFromLocation(NSTextLocation from, NSTextLocation to) { return 0; }
    @NotImplemented("baseWritingDirectionAtLocation:")
    public NSTextSelectionNavigationWritingDirection baseWritingDirectionAtLocation(NSTextLocation location) { return null; }
    @NotImplemented("enumerateCaretOffsetsInLineFragmentAtLocation:usingBlock:")
    public void enumerateCaretOffsetsInLineFragmentAtLocation(NSTextLocation location, @Block("(@MachineSizedFloat,,,)") VoidBlock4<Double, NSTextLocation, Boolean, BooleanPtr> block) {}
    @NotImplemented("lineFragmentRangeForPoint:inContainerAtLocation:")
    public NSTextRange getLineFragmentRangeForPoint(@ByVal CGPoint point, NSTextLocation location) { return null; }
    @NotImplemented("enumerateContainerBoundariesFromLocation:reverse:usingBlock:")
    public void enumerateContainerBoundariesFromLocation(NSTextLocation location, boolean reverse, @Block VoidBlock2<NSTextLocation, BooleanPtr> block) {}
    @NotImplemented("textLayoutOrientationAtLocation:")
    public NSTextSelectionNavigationLayoutOrientation textLayoutOrientationAtLocation(NSTextLocation location) { return null; }
    /*</methods>*/
}
