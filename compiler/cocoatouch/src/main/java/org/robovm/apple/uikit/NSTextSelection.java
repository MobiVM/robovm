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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextSelection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextSelectionPtr extends Ptr<NSTextSelection, NSTextSelectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextSelection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextSelection() {}
    protected NSTextSelection(Handle h, long handle) { super(h, handle); }
    protected NSTextSelection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRanges:affinity:granularity:")
    public NSTextSelection(NSArray<NSTextRange> textRanges, NSTextSelectionAffinity affinity, NSTextSelectionGranularity granularity) { super((SkipInit) null); initObject(init(textRanges, affinity, granularity)); }
    @Method(selector = "initWithCoder:")
    public NSTextSelection(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithRange:affinity:granularity:")
    public NSTextSelection(NSTextRange range, NSTextSelectionAffinity affinity, NSTextSelectionGranularity granularity) { super((SkipInit) null); initObject(init(range, affinity, granularity)); }
    @Method(selector = "initWithLocation:affinity:")
    public NSTextSelection(NSTextLocation location, NSTextSelectionAffinity affinity) { super((SkipInit) null); initObject(init(location, affinity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textRanges")
    public native NSArray<NSTextRange> getTextRanges();
    @Property(selector = "granularity")
    public native NSTextSelectionGranularity getGranularity();
    @Property(selector = "affinity")
    public native NSTextSelectionAffinity getAffinity();
    @Property(selector = "isTransient")
    public native boolean isTransient();
    @Property(selector = "anchorPositionOffset")
    public native @MachineSizedFloat double getAnchorPositionOffset();
    @Property(selector = "setAnchorPositionOffset:")
    public native void setAnchorPositionOffset(@MachineSizedFloat double v);
    @Property(selector = "isLogical")
    public native boolean isLogical();
    @Property(selector = "setLogical:")
    public native void setLogical(boolean v);
    @Property(selector = "secondarySelectionLocation")
    public native NSTextLocation getSecondarySelectionLocation();
    @Property(selector = "setSecondarySelectionLocation:")
    public native void setSecondarySelectionLocation(NSTextLocation v);
    @Property(selector = "typingAttributes")
    public native NSDictionary<NSString, ?> getTypingAttributes();
    @Property(selector = "setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary<NSString, ?> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRanges:affinity:granularity:")
    protected native @Pointer long init(NSArray<NSTextRange> textRanges, NSTextSelectionAffinity affinity, NSTextSelectionGranularity granularity);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithRange:affinity:granularity:")
    protected native @Pointer long init(NSTextRange range, NSTextSelectionAffinity affinity, NSTextSelectionGranularity granularity);
    @Method(selector = "initWithLocation:affinity:")
    protected native @Pointer long init(NSTextLocation location, NSTextSelectionAffinity affinity);
    @Method(selector = "textSelectionWithTextRanges:")
    public native NSTextSelection textSelection(NSArray<NSTextRange> textRanges);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
