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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptionRegion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVCaptionRegionPtr extends Ptr<AVCaptionRegion, AVCaptionRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptionRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptionRegion() {}
    protected AVCaptionRegion(Handle h, long handle) { super(h, handle); }
    protected AVCaptionRegion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public AVCaptionRegion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appleITTTopRegion")
    public static native AVCaptionRegion getAppleITTTopRegion();
    @Property(selector = "appleITTBottomRegion")
    public static native AVCaptionRegion getAppleITTBottomRegion();
    @Property(selector = "appleITTLeftRegion")
    public static native AVCaptionRegion getAppleITTLeftRegion();
    @Property(selector = "appleITTRightRegion")
    public static native AVCaptionRegion getAppleITTRightRegion();
    @Property(selector = "subRipTextBottomRegion")
    public static native AVCaptionRegion getSubRipTextBottomRegion();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "origin")
    public native @ByVal AVCaptionPoint getOrigin();
    @Property(selector = "size")
    public native @ByVal AVCaptionSize getSize();
    @Property(selector = "scroll")
    public native AVCaptionRegionScroll getScroll();
    @Property(selector = "displayAlignment")
    public native AVCaptionRegionDisplayAlignment getDisplayAlignment();
    @Property(selector = "writingMode")
    public native AVCaptionRegionWritingMode getWritingMode();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder encoder);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
