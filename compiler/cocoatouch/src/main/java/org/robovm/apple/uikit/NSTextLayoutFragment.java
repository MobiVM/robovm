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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextLayoutFragment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextLayoutFragmentPtr extends Ptr<NSTextLayoutFragment, NSTextLayoutFragmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextLayoutFragment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextLayoutFragment() {}
    protected NSTextLayoutFragment(Handle h, long handle) { super(h, handle); }
    protected NSTextLayoutFragment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextElement:range:")
    public NSTextLayoutFragment(NSTextElement textElement, NSTextRange rangeInElement) { super((SkipInit) null); initObject(init(textElement, rangeInElement)); }
    @Method(selector = "initWithCoder:")
    public NSTextLayoutFragment(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textLayoutManager")
    public native NSTextLayoutManager getTextLayoutManager();
    @Property(selector = "textElement")
    public native NSTextElement getTextElement();
    @Property(selector = "rangeInElement")
    public native NSTextRange getRangeInElement();
    @Property(selector = "textLineFragments")
    public native NSArray<NSTextLineFragment> getTextLineFragments();
    @Property(selector = "layoutQueue")
    public native NSOperationQueue getLayoutQueue();
    @Property(selector = "setLayoutQueue:")
    public native void setLayoutQueue(NSOperationQueue v);
    @Property(selector = "state")
    public native NSTextLayoutFragmentState getState();
    @Property(selector = "layoutFragmentFrame")
    public native @ByVal CGRect getLayoutFragmentFrame();
    @Property(selector = "renderingSurfaceBounds")
    public native @ByVal CGRect getRenderingSurfaceBounds();
    @Property(selector = "leadingPadding")
    public native @MachineSizedFloat double getLeadingPadding();
    @Property(selector = "trailingPadding")
    public native @MachineSizedFloat double getTrailingPadding();
    @Property(selector = "topMargin")
    public native @MachineSizedFloat double getTopMargin();
    @Property(selector = "bottomMargin")
    public native @MachineSizedFloat double getBottomMargin();
    @Property(selector = "textAttachmentViewProviders")
    public native NSArray<NSTextAttachmentViewProvider> getTextAttachmentViewProviders();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextElement:range:")
    protected native @Pointer long init(NSTextElement textElement, NSTextRange rangeInElement);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textLineFragmentForVerticalOffset:requiresExactMatch:")
    public native NSTextLineFragment getTextLineFragmentForVerticalOffset(@MachineSizedFloat double verticalOffset, boolean requiresExactMatch);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "textLineFragmentForTextLocation:isUpstreamAffinity:")
    public native NSTextLineFragment getTextLineFragmentForTextLocation(NSTextLocation textLocation, boolean isUpstreamAffinity);
    @Method(selector = "invalidateLayout")
    public native void invalidateLayout();
    @Method(selector = "drawAtPoint:inContext:")
    public native void drawAtPoint(@ByVal CGPoint point, CGContext context);
    @Method(selector = "frameForTextAttachmentAtLocation:")
    public native @ByVal CGRect frameForTextAttachmentAtLocation(NSTextLocation location);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
