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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKRegion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKRegionPtr extends Ptr<SKRegion, SKRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKRegion() {}
    protected SKRegion(Handle h, long handle) { super(h, handle); }
    protected SKRegion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRadius:")
    public SKRegion(float radius) { super((SkipInit) null); initObject(init(radius)); }
    @Method(selector = "initWithSize:")
    public SKRegion(@ByVal CGSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithPath:")
    public SKRegion(CGPath path) { super((SkipInit) null); initObject(init(path)); }
    @Method(selector = "initWithCoder:")
    public SKRegion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "path")
    public native CGPath getPath();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRadius:")
    protected native @Pointer long init(float radius);
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(@ByVal CGSize size);
    @Method(selector = "initWithPath:")
    protected native @Pointer long init(CGPath path);
    @Method(selector = "inverseRegion")
    public native SKRegion inverseRegion();
    @Method(selector = "regionByUnionWithRegion:")
    public native SKRegion newRegionByUnionWithRegion(SKRegion region);
    @Method(selector = "regionByDifferenceFromRegion:")
    public native SKRegion newRegionByDifferenceFromRegion(SKRegion region);
    @Method(selector = "regionByIntersectionWithRegion:")
    public native SKRegion newRegionByIntersectionWithRegion(SKRegion region);
    @Method(selector = "containsPoint:")
    public native boolean containsPoint(@ByVal CGPoint point);
    @Method(selector = "infiniteRegion")
    public static native SKRegion createInfiniteRegion();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
