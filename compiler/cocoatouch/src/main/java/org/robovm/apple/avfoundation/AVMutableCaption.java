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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableCaption/*</name>*/ 
    extends /*<extends>*/AVCaption/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableCaptionPtr extends Ptr<AVMutableCaption, AVMutableCaptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableCaption.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVMutableCaption() {}
    protected AVMutableCaption(Handle h, long handle) { super(h, handle); }
    protected AVMutableCaption(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithText:timeRange:")
    public AVMutableCaption(String text, @ByVal CMTimeRange timeRange) { super(text, timeRange); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "setTimeRange:")
    public native void setTimeRange(@ByVal CMTimeRange v);
    @Property(selector = "region")
    public native AVCaptionRegion getRegion();
    @Property(selector = "setRegion:")
    public native void setRegion(AVCaptionRegion v);
    @Property(selector = "textAlignment")
    public native AVCaptionTextAlignment getTextAlignment();
    @Property(selector = "setTextAlignment:")
    public native void setTextAlignment(AVCaptionTextAlignment v);
    @Property(selector = "animation")
    public native AVCaptionAnimation getAnimation();
    @Property(selector = "setAnimation:")
    public native void setAnimation(AVCaptionAnimation v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setTextColor:inRange:")
    public native void setTextColor(CGColor color, @ByVal NSRange range);
    @Method(selector = "setBackgroundColor:inRange:")
    public native void setBackgroundColor(CGColor color, @ByVal NSRange range);
    @Method(selector = "setFontWeight:inRange:")
    public native void setFontWeight(AVCaptionFontWeight fontWeight, @ByVal NSRange range);
    @Method(selector = "setFontStyle:inRange:")
    public native void setFontStyle(AVCaptionFontStyle fontStyle, @ByVal NSRange range);
    @Method(selector = "setDecoration:inRange:")
    public native void setDecoration(AVCaptionDecoration decoration, @ByVal NSRange range);
    @Method(selector = "setTextCombine:inRange:")
    public native void setTextCombine(AVCaptionTextCombine textCombine, @ByVal NSRange range);
    @Method(selector = "setRuby:inRange:")
    public native void setRuby(AVCaptionRuby ruby, @ByVal NSRange range);
    @Method(selector = "removeTextColorInRange:")
    public native void removeTextColorInRange(@ByVal NSRange range);
    @Method(selector = "removeBackgroundColorInRange:")
    public native void removeBackgroundColorInRange(@ByVal NSRange range);
    @Method(selector = "removeFontWeightInRange:")
    public native void removeFontWeightInRange(@ByVal NSRange range);
    @Method(selector = "removeFontStyleInRange:")
    public native void removeFontStyleInRange(@ByVal NSRange range);
    @Method(selector = "removeDecorationInRange:")
    public native void removeDecorationInRange(@ByVal NSRange range);
    @Method(selector = "removeTextCombineInRange:")
    public native void removeTextCombineInRange(@ByVal NSRange range);
    @Method(selector = "removeRubyInRange:")
    public native void removeRubyInRange(@ByVal NSRange range);
    /*</methods>*/
}
