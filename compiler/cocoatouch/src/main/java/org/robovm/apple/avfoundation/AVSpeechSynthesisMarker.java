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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpeechSynthesisMarker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVSpeechSynthesisMarkerPtr extends Ptr<AVSpeechSynthesisMarker, AVSpeechSynthesisMarkerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpeechSynthesisMarker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSpeechSynthesisMarker() {}
    protected AVSpeechSynthesisMarker(Handle h, long handle) { super(h, handle); }
    protected AVSpeechSynthesisMarker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMarkerType:forTextRange:atByteSampleOffset:")
    public AVSpeechSynthesisMarker(AVSpeechSynthesisMarkerMark type, @ByVal NSRange range, @MachineSizedUInt long byteSampleOffset) { super((SkipInit) null); initObject(init(type, range, byteSampleOffset)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithWordRange:atByteSampleOffset:")
    public static  AVSpeechSynthesisMarker createWithWordRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset) {
       AVSpeechSynthesisMarker res = new AVSpeechSynthesisMarker((SkipInit) null);
       res.initObject(res.initWithWordRange(range, byteSampleOffset));
       return res;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithSentenceRange:atByteSampleOffset:")
    public static  AVSpeechSynthesisMarker createWithSentenceRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset) {
       AVSpeechSynthesisMarker res = new AVSpeechSynthesisMarker((SkipInit) null);
       res.initObject(res.initWithSentenceRange(range, byteSampleOffset));
       return res;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithParagraphRange:atByteSampleOffset:")
    public static  AVSpeechSynthesisMarker createWithParagraphRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset) {
       AVSpeechSynthesisMarker res = new AVSpeechSynthesisMarker((SkipInit) null);
       res.initObject(res.initWithParagraphRange(range, byteSampleOffset));
       return res;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithPhonemeString:atByteSampleOffset:")
    public static  AVSpeechSynthesisMarker createWithPhonemeString(String phoneme, @MachineSizedSInt long byteSampleOffset) {
       AVSpeechSynthesisMarker res = new AVSpeechSynthesisMarker((SkipInit) null);
       res.initObject(res.initWithPhonemeString(phoneme, byteSampleOffset));
       return res;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithBookmarkName:atByteSampleOffset:")
    public static  AVSpeechSynthesisMarker createWithBookmarkName(String mark, @MachineSizedSInt long byteSampleOffset) {
       AVSpeechSynthesisMarker res = new AVSpeechSynthesisMarker((SkipInit) null);
       res.initObject(res.initWithBookmarkName(mark, byteSampleOffset));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public AVSpeechSynthesisMarker(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mark")
    public native AVSpeechSynthesisMarkerMark getMark();
    @Property(selector = "setMark:")
    public native void setMark(AVSpeechSynthesisMarkerMark v);
    @Property(selector = "byteSampleOffset")
    public native @MachineSizedUInt long getByteSampleOffset();
    @Property(selector = "setByteSampleOffset:")
    public native void setByteSampleOffset(@MachineSizedUInt long v);
    @Property(selector = "textRange")
    public native @ByVal NSRange getTextRange();
    @Property(selector = "setTextRange:")
    public native void setTextRange(@ByVal NSRange v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "bookmarkName")
    public native String getBookmarkName();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setBookmarkName:")
    public native void setBookmarkName(String v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "phoneme")
    public native String getPhoneme();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setPhoneme:")
    public native void setPhoneme(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMarkerType:forTextRange:atByteSampleOffset:")
    protected native @Pointer long init(AVSpeechSynthesisMarkerMark type, @ByVal NSRange range, @MachineSizedUInt long byteSampleOffset);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithWordRange:atByteSampleOffset:")
    protected native @Pointer long initWithWordRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithSentenceRange:atByteSampleOffset:")
    protected native @Pointer long initWithSentenceRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithParagraphRange:atByteSampleOffset:")
    protected native @Pointer long initWithParagraphRange(@ByVal NSRange range, @MachineSizedSInt long byteSampleOffset);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithPhonemeString:atByteSampleOffset:")
    protected native @Pointer long initWithPhonemeString(String phoneme, @MachineSizedSInt long byteSampleOffset);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithBookmarkName:atByteSampleOffset:")
    protected native @Pointer long initWithBookmarkName(String mark, @MachineSizedSInt long byteSampleOffset);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
