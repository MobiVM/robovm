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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIRegion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIRegionPtr extends Ptr<UIRegion, UIRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIRegion() {}
    protected UIRegion(Handle h, long handle) { super(h, handle); }
    protected UIRegion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRadius:")
    public UIRegion(@MachineSizedFloat double radius) { super((SkipInit) null); initObject(init(radius)); }
    @Method(selector = "initWithSize:")
    public UIRegion(@ByVal CGSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithCoder:")
    public UIRegion(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "infiniteRegion")
    public static native UIRegion getInfiniteRegion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRadius:")
    protected native @Pointer long init(@MachineSizedFloat double radius);
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(@ByVal CGSize size);
    @Method(selector = "inverseRegion")
    public native UIRegion inverse();
    @Method(selector = "regionByUnionWithRegion:")
    public native UIRegion union(UIRegion region);
    @Method(selector = "regionByDifferenceFromRegion:")
    public native UIRegion difference(UIRegion region);
    @Method(selector = "regionByIntersectionWithRegion:")
    public native UIRegion intersection(UIRegion region);
    @Method(selector = "containsPoint:")
    public native boolean containsPoint(@ByVal CGPoint point);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
