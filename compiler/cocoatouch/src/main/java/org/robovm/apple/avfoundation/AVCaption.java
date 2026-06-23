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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaption/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVCaptionPtr extends Ptr<AVCaption, AVCaptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaption.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaption() {}
    protected AVCaption(Handle h, long handle) { super(h, handle); }
    protected AVCaption(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithText:timeRange:")
    public AVCaption(String text, @ByVal CMTimeRange timeRange) { super((SkipInit) null); initObject(init(text, timeRange)); }
    @Method(selector = "initWithCoder:")
    public AVCaption(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "region")
    public native AVCaptionRegion getRegion();
    @Property(selector = "textAlignment")
    public native AVCaptionTextAlignment getTextAlignment();
    @Property(selector = "animation")
    public native AVCaptionAnimation getAnimation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithText:timeRange:")
    protected native @Pointer long init(String text, @ByVal CMTimeRange timeRange);
    @Method(selector = "textColorAtIndex:range:")
    public native CGColor getTextColor(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "backgroundColorAtIndex:range:")
    public native CGColor getBackgroundColor(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "fontWeightAtIndex:range:")
    public native AVCaptionFontWeight getFontWeight(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "fontStyleAtIndex:range:")
    public native AVCaptionFontStyle getFontStyle(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "decorationAtIndex:range:")
    public native AVCaptionDecoration getDecoration(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "textCombineAtIndex:range:")
    public native AVCaptionTextCombine getTextCombine(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "rubyAtIndex:range:")
    public native AVCaptionRuby getRuby(@MachineSizedSInt long index, NSRange outRange);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
