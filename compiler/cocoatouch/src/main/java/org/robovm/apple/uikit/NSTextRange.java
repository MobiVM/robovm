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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextRange/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSTextRangePtr extends Ptr<NSTextRange, NSTextRangePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextRange() {}
    protected NSTextRange(Handle h, long handle) { super(h, handle); }
    protected NSTextRange(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocation:endLocation:")
    public NSTextRange(NSTextLocation location, NSTextLocation endLocation) { super((SkipInit) null); initObject(init(location, endLocation)); }
    @Method(selector = "initWithLocation:")
    public NSTextRange(NSTextLocation location) { super((SkipInit) null); initObject(init(location)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEmpty")
    public native boolean isEmpty();
    @Property(selector = "location")
    public native NSTextLocation getLocation();
    @Property(selector = "endLocation")
    public native NSTextLocation getEndLocation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocation:endLocation:")
    protected native @Pointer long init(NSTextLocation location, NSTextLocation endLocation);
    @Method(selector = "initWithLocation:")
    protected native @Pointer long init(NSTextLocation location);
    @Method(selector = "isEqualToTextRange:")
    public native boolean isEqualToTextRange(NSTextRange textRange);
    @Method(selector = "containsLocation:")
    public native boolean containsLocation(NSTextLocation location);
    @Method(selector = "containsRange:")
    public native boolean containsRange(NSTextRange textRange);
    @Method(selector = "intersectsWithTextRange:")
    public native boolean intersects(NSTextRange textRange);
    @Method(selector = "textRangeByIntersectingWithTextRange:")
    public native NSTextRange textRangeByIntersectingWithTextRange(NSTextRange textRange);
    @Method(selector = "textRangeByFormingUnionWithTextRange:")
    public native NSTextRange textRangeByFormingUnionWithTextRange(NSTextRange textRange);
    /*</methods>*/
}
