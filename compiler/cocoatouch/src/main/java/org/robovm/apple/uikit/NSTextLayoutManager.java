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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextLayoutManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSTextSelectionDataSource/*</implements>*/ {

    /*<ptr>*/public static class NSTextLayoutManagerPtr extends Ptr<NSTextLayoutManager, NSTextLayoutManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextLayoutManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextLayoutManager() {}
    protected NSTextLayoutManager(Handle h, long handle) { super(h, handle); }
    protected NSTextLayoutManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSTextLayoutManager(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSTextLayoutManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextLayoutManagerDelegate v);
    @Property(selector = "usesFontLeading")
    public native boolean usesFontLeading();
    @Property(selector = "setUsesFontLeading:")
    public native void setUsesFontLeading(boolean v);
    @Property(selector = "limitsLayoutForSuspiciousContents")
    public native boolean isLimitsLayoutForSuspiciousContents();
    @Property(selector = "setLimitsLayoutForSuspiciousContents:")
    public native void setLimitsLayoutForSuspiciousContents(boolean v);
    @Property(selector = "usesHyphenation")
    public native boolean usesHyphenation();
    @Property(selector = "setUsesHyphenation:")
    public native void setUsesHyphenation(boolean v);
    @Property(selector = "textContentManager")
    public native NSTextContentManager getTextContentManager();
    @Property(selector = "textContainer")
    public native NSTextContainer getTextContainer();
    @Property(selector = "setTextContainer:")
    public native void setTextContainer(NSTextContainer v);
    @Property(selector = "usageBoundsForTextContainer")
    public native @ByVal CGRect getUsageBoundsForTextContainer();
    @Property(selector = "textViewportLayoutController")
    public native NSTextViewportLayoutController getTextViewportLayoutController();
    @Property(selector = "layoutQueue")
    public native NSOperationQueue getLayoutQueue();
    @Property(selector = "setLayoutQueue:")
    public native void setLayoutQueue(NSOperationQueue v);
    @Property(selector = "textSelections")
    public native NSArray<NSTextSelection> getTextSelections();
    @Property(selector = "setTextSelections:")
    public native void setTextSelections(NSArray<NSTextSelection> v);
    @Property(selector = "textSelectionNavigation")
    public native NSTextSelectionNavigation getTextSelectionNavigation();
    @Property(selector = "setTextSelectionNavigation:")
    public native void setTextSelectionNavigation(NSTextSelectionNavigation v);
    @Property(selector = "renderingAttributesValidator")
    public native @Block VoidBlock2<NSTextLayoutManager, NSTextLayoutFragment> getRenderingAttributesValidator();
    @Property(selector = "setRenderingAttributesValidator:")
    public native void setRenderingAttributesValidator(@Block VoidBlock2<NSTextLayoutManager, NSTextLayoutFragment> v);
    @Property(selector = "linkRenderingAttributes")
    public static native NSDictionary<NSString, ?> getLinkRenderingAttributes();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "documentRange")
    public native NSTextRange getDocumentRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "replaceTextContentManager:")
    public native void replaceTextContentManager(NSTextContentManager textContentManager);
    @Method(selector = "ensureLayoutForRange:")
    public native void ensureLayoutForRange(NSTextRange range);
    @Method(selector = "ensureLayoutForBounds:")
    public native void ensureLayoutForBounds(@ByVal CGRect bounds);
    @Method(selector = "invalidateLayoutForRange:")
    public native void invalidateLayoutForRange(NSTextRange range);
    @Method(selector = "textLayoutFragmentForPosition:")
    public native NSTextLayoutFragment textLayoutFragmentForPosition(@ByVal CGPoint position);
    @Method(selector = "textLayoutFragmentForLocation:")
    public native NSTextLayoutFragment textLayoutFragmentForLocation(NSTextLocation location);
    @Method(selector = "enumerateTextLayoutFragmentsFromLocation:options:usingBlock:")
    public native NSTextLocation enumerateTextLayoutFragments(NSTextLocation location, NSTextLayoutFragmentEnumerationOptions options, @Block Block1<NSTextLayoutFragment, Boolean> block);
    @Method(selector = "enumerateRenderingAttributesFromLocation:reverse:usingBlock:")
    public native void enumerateRenderingAttributes(NSTextLocation location, boolean reverse, @Block Block3<NSTextLayoutManager, NSDictionary<NSString, ?>, NSTextRange, Boolean> block);
    @Method(selector = "setRenderingAttributes:forTextRange:")
    public native void setRenderingAttributes(NSDictionary<NSString, ?> renderingAttributes, NSTextRange textRange);
    @Method(selector = "addRenderingAttribute:value:forTextRange:")
    public native void addRenderingAttribute(NSString renderingAttribute, NSObject value, NSTextRange textRange);
    @Method(selector = "removeRenderingAttribute:forTextRange:")
    public native void removeRenderingAttribute(NSString renderingAttribute, NSTextRange textRange);
    @Method(selector = "invalidateRenderingAttributesForTextRange:")
    public native void invalidateRenderingAttributesForTextRange(NSTextRange textRange);
    @Method(selector = "renderingAttributesForLink:atLocation:")
    public native NSDictionary<NSString, ?> renderingAttributesForLink(NSObject link, NSTextLocation location);
    @Method(selector = "enumerateTextSegmentsInRange:type:options:usingBlock:")
    public native void enumerateTextSegmentsInRange(NSTextRange textRange, NSTextLayoutManagerSegmentType type, NSTextLayoutManagerSegmentOptions options, @Block("(,@ByVal,@MachineSizedFloat,)") Block4<NSTextRange, CGRect, Double, NSTextContainer, Boolean> block);
    @Method(selector = "replaceContentsInRange:withTextElements:")
    public native void replaceContentsInRange(NSTextRange range, NSArray<NSTextElement> textElements);
    @Method(selector = "replaceContentsInRange:withAttributedString:")
    public native void replaceContentsInRange(NSTextRange range, NSAttributedString attributedString);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "enumerateSubstringsFromLocation:options:usingBlock:")
    public native void enumerateSubstringsFromLocation(NSTextLocation location, NSStringEnumerationOptions options, @Block VoidBlock4<NSString, NSTextRange, NSTextRange, BooleanPtr> block);
    @Method(selector = "textRangeForSelectionGranularity:enclosingLocation:")
    public native NSTextRange getTextRangeForSelectionGranularity(NSTextSelectionGranularity selectionGranularity, NSTextLocation location);
    @Method(selector = "locationFromLocation:withOffset:")
    public native NSTextLocation getLocationFromLocation(NSTextLocation location, @MachineSizedSInt long offset);
    @Method(selector = "offsetFromLocation:toLocation:")
    public native @MachineSizedSInt long getOffsetFromLocation(NSTextLocation from, NSTextLocation to);
    @Method(selector = "baseWritingDirectionAtLocation:")
    public native NSTextSelectionNavigationWritingDirection baseWritingDirectionAtLocation(NSTextLocation location);
    @Method(selector = "enumerateCaretOffsetsInLineFragmentAtLocation:usingBlock:")
    public native void enumerateCaretOffsetsInLineFragmentAtLocation(NSTextLocation location, @Block("(@MachineSizedFloat,,,)") VoidBlock4<Double, NSTextLocation, Boolean, BooleanPtr> block);
    @Method(selector = "lineFragmentRangeForPoint:inContainerAtLocation:")
    public native NSTextRange getLineFragmentRangeForPoint(@ByVal CGPoint point, NSTextLocation location);
    @Method(selector = "enumerateContainerBoundariesFromLocation:reverse:usingBlock:")
    public native void enumerateContainerBoundariesFromLocation(NSTextLocation location, boolean reverse, @Block VoidBlock2<NSTextLocation, BooleanPtr> block);
    @Method(selector = "textLayoutOrientationAtLocation:")
    public native NSTextSelectionNavigationLayoutOrientation textLayoutOrientationAtLocation(NSTextLocation location);
    /*</methods>*/
}
