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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextSelectionNavigation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSTextSelectionNavigationPtr extends Ptr<NSTextSelectionNavigation, NSTextSelectionNavigationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextSelectionNavigation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextSelectionNavigation() {}
    protected NSTextSelectionNavigation(Handle h, long handle) { super(h, handle); }
    protected NSTextSelectionNavigation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSource:")
    public NSTextSelectionNavigation(NSTextSelectionDataSource dataSource) { super((SkipInit) null); initObject(init(dataSource)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textSelectionDataSource")
    public native NSTextSelectionDataSource getTextSelectionDataSource();
    @Property(selector = "allowsNonContiguousRanges")
    public native boolean allowsNonContiguousRanges();
    @Property(selector = "setAllowsNonContiguousRanges:")
    public native void setAllowsNonContiguousRanges(boolean v);
    @Property(selector = "rotatesCoordinateSystemForLayoutOrientation")
    public native boolean isRotatesCoordinateSystemForLayoutOrientation();
    @Property(selector = "setRotatesCoordinateSystemForLayoutOrientation:")
    public native void setRotatesCoordinateSystemForLayoutOrientation(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSource:")
    protected native @Pointer long init(NSTextSelectionDataSource dataSource);
    @Method(selector = "flushLayoutCache")
    public native void flushLayoutCache();
    @Method(selector = "destinationSelectionForTextSelection:direction:destination:extending:confined:")
    public native NSTextSelection destinationSelectionForTextSelection(NSTextSelection textSelection, NSTextSelectionNavigationDirection direction, NSTextSelectionNavigationDestination destination, boolean extending, boolean confined);
    @Method(selector = "textSelectionsInteractingAtPoint:inContainerAtLocation:anchors:modifiers:selecting:bounds:")
    public native NSArray<NSTextSelection> textSelectionsInteractingAtPoint(@ByVal CGPoint point, NSTextLocation containerLocation, NSArray<NSTextSelection> anchors, NSTextSelectionNavigationModifier modifiers, boolean selecting, @ByVal CGRect bounds);
    @Method(selector = "textSelectionForSelectionGranularity:enclosingTextSelection:")
    public native NSTextSelection textSelectionForSelectionGranularity(NSTextSelectionGranularity selectionGranularity, NSTextSelection textSelection);
    @Method(selector = "textSelectionForSelectionGranularity:enclosingPoint:inContainerAtLocation:")
    public native NSTextSelection textSelectionForSelectionGranularity(NSTextSelectionGranularity selectionGranularity, @ByVal CGPoint point, NSTextLocation location);
    @Method(selector = "resolvedInsertionLocationForTextSelection:writingDirection:")
    public native NSTextLocation resolvedInsertionLocationForTextSelection(NSTextSelection textSelection, NSTextSelectionNavigationWritingDirection writingDirection);
    @Method(selector = "deletionRangesForTextSelection:direction:destination:allowsDecomposition:")
    public native NSArray<NSTextRange> deletionRangesForTextSelection(NSTextSelection textSelection, NSTextSelectionNavigationDirection direction, NSTextSelectionNavigationDestination destination, boolean allowsDecomposition);
    /*</methods>*/
}
