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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerFormattingDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UITextFormattingViewControllerFormattingDescriptorPtr extends Ptr<UITextFormattingViewControllerFormattingDescriptor, UITextFormattingViewControllerFormattingDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextFormattingViewControllerFormattingDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITextFormattingViewControllerFormattingDescriptor() {}
    protected UITextFormattingViewControllerFormattingDescriptor(Handle h, long handle) { super(h, handle); }
    protected UITextFormattingViewControllerFormattingDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithString:range:")
    public UITextFormattingViewControllerFormattingDescriptor(NSAttributedString string, @ByVal NSRange range) { super((SkipInit) null); initObject(init(string, range)); }
    @Method(selector = "initWithAttributes:")
    public UITextFormattingViewControllerFormattingDescriptor(NSDictionary<NSString, ?> attributes) { super((SkipInit) null); initObject(init(attributes)); }
    @Method(selector = "initWithCoder:")
    public UITextFormattingViewControllerFormattingDescriptor(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fonts")
    public native NSArray<UIFont> getFonts();
    @Property(selector = "setFonts:")
    public native void setFonts(NSArray<UIFont> v);
    @Property(selector = "textColors")
    public native NSArray<UIColor> getTextColors();
    @Property(selector = "setTextColors:")
    public native void setTextColors(NSArray<UIColor> v);
    @Property(selector = "lineHeight")
    public native @MachineSizedFloat double getLineHeight();
    @Property(selector = "setLineHeight:")
    public native void setLineHeight(@MachineSizedFloat double v);
    @Property(selector = "underlinePresent")
    public native boolean isUnderlinePresent();
    @Property(selector = "setUnderlinePresent:")
    public native void setUnderlinePresent(boolean v);
    @Property(selector = "strikethroughPresent")
    public native boolean isStrikethroughPresent();
    @Property(selector = "setStrikethroughPresent:")
    public native void setStrikethroughPresent(boolean v);
    @Property(selector = "textAlignments")
    public native NSSet<NSString> getTextAlignments();
    @Property(selector = "setTextAlignments:")
    public native void setTextAlignments(NSSet<NSString> v);
    @Property(selector = "textLists")
    public native NSSet<NSString> getTextLists();
    @Property(selector = "setTextLists:")
    public native void setTextLists(NSSet<NSString> v);
    @Property(selector = "highlights")
    public native NSSet<NSString> getHighlights();
    @Property(selector = "setHighlights:")
    public native void setHighlights(NSSet<NSString> v);
    @Property(selector = "formattingStyleKey")
    public native String getFormattingStyleKey();
    @Property(selector = "setFormattingStyleKey:")
    public native void setFormattingStyleKey(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithString:range:")
    protected native @Pointer long init(NSAttributedString string, @ByVal NSRange range);
    @Method(selector = "initWithAttributes:")
    protected native @Pointer long init(NSDictionary<NSString, ?> attributes);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
