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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextLineFragment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextLineFragmentPtr extends Ptr<NSTextLineFragment, NSTextLineFragmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextLineFragment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextLineFragment() {}
    protected NSTextLineFragment(Handle h, long handle) { super(h, handle); }
    protected NSTextLineFragment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAttributedString:range:")
    public NSTextLineFragment(NSAttributedString attributedString, @ByVal NSRange range) { super((SkipInit) null); initObject(init(attributedString, range)); }
    @Method(selector = "initWithCoder:")
    public NSTextLineFragment(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithString:attributes:range:")
    public NSTextLineFragment(String string, NSDictionary<NSString, ?> attributes, @ByVal NSRange range) { super((SkipInit) null); initObject(init(string, attributes, range)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attributedString")
    public native NSAttributedString getAttributedString();
    @Property(selector = "characterRange")
    public native @ByVal NSRange getCharacterRange();
    @Property(selector = "typographicBounds")
    public native @ByVal CGRect getTypographicBounds();
    @Property(selector = "glyphOrigin")
    public native @ByVal CGPoint getGlyphOrigin();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAttributedString:range:")
    protected native @Pointer long init(NSAttributedString attributedString, @ByVal NSRange range);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithString:attributes:range:")
    protected native @Pointer long init(String string, NSDictionary<NSString, ?> attributes, @ByVal NSRange range);
    @Method(selector = "drawAtPoint:inContext:")
    public native void drawAtPoint(@ByVal CGPoint point, CGContext context);
    @Method(selector = "locationForCharacterAtIndex:")
    public native @ByVal CGPoint locationForCharacterAtIndex(@MachineSizedSInt long index);
    @Method(selector = "characterIndexForPoint:")
    public native @MachineSizedSInt long characterIndexForPoint(@ByVal CGPoint point);
    @Method(selector = "fractionOfDistanceThroughGlyphForPoint:")
    public native @MachineSizedFloat double fractionOfDistanceThroughGlyphForPoint(@ByVal CGPoint point);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
