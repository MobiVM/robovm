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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSTextLayoutOrientationProvider/*</implements>*/ {

    /*<ptr>*/public static class NSTextContainerPtr extends Ptr<NSTextContainer, NSTextContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextContainer() {}
    protected NSTextContainer(Handle h, long handle) { super(h, handle); }
    protected NSTextContainer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSize:")
    public NSTextContainer(@ByVal CGSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithCoder:")
    public NSTextContainer(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layoutManager")
    public native NSLayoutManager getLayoutManager();
    @Property(selector = "setLayoutManager:", strongRef = true)
    public native void setLayoutManager(NSLayoutManager v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "textLayoutManager")
    public native NSTextLayoutManager getTextLayoutManager();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "exclusionPaths")
    public native NSArray<UIBezierPath> getExclusionPaths();
    @Property(selector = "setExclusionPaths:")
    public native void setExclusionPaths(NSArray<UIBezierPath> v);
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @Property(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @Property(selector = "lineFragmentPadding")
    public native @MachineSizedFloat double getLineFragmentPadding();
    @Property(selector = "setLineFragmentPadding:")
    public native void setLineFragmentPadding(@MachineSizedFloat double v);
    @Property(selector = "maximumNumberOfLines")
    public native @MachineSizedUInt long getMaximumNumberOfLines();
    @Property(selector = "setMaximumNumberOfLines:")
    public native void setMaximumNumberOfLines(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isSimpleRectangularTextContainer")
    public native boolean isSimpleRectangularTextContainer();
    @Property(selector = "widthTracksTextView")
    public native boolean widthTracksTextView();
    @Property(selector = "setWidthTracksTextView:")
    public native void setWidthTracksTextView(boolean v);
    @Property(selector = "heightTracksTextView")
    public native boolean heightTracksTextView();
    @Property(selector = "setHeightTracksTextView:")
    public native void setHeightTracksTextView(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "layoutOrientation")
    public native NSTextLayoutOrientation getLayoutOrientation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(@ByVal CGSize size);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "replaceLayoutManager:")
    public native void replaceLayoutManager(NSLayoutManager newLayoutManager);
    @Method(selector = "lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
    public native @ByVal CGRect getLineFragmentRect(@ByVal CGRect proposedRect, @MachineSizedUInt long characterIndex, NSWritingDirection baseWritingDirection, CGRect remainingRect);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
