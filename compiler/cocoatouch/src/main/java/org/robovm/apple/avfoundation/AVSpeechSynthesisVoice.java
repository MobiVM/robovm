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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpeechSynthesisVoice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVSpeechSynthesisVoicePtr extends Ptr<AVSpeechSynthesisVoice, AVSpeechSynthesisVoicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpeechSynthesisVoice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSpeechSynthesisVoice() {}
    protected AVSpeechSynthesisVoice(Handle h, long handle) { super(h, handle); }
    protected AVSpeechSynthesisVoice(SkipInit skipInit) { super(skipInit); }
    public AVSpeechSynthesisVoice(String languageCode) { super((Handle) null, create(languageCode)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public AVSpeechSynthesisVoice(AVSpeechSynthesisVoiceIdentifier identifier) { super((Handle) null, create(identifier)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public AVSpeechSynthesisVoice(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "language")
    public native String getLanguage();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "quality")
    public native AVSpeechSynthesisVoiceQuality getQuality();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "speechVoices")
    public static native NSArray<AVSpeechSynthesisVoice> getSpeechVoices();
    @Method(selector = "currentLanguageCode")
    public static native String getCurrentLanguageCode();
    @Method(selector = "voiceWithLanguage:")
    protected static native @Pointer long create(String languageCode);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "voiceWithIdentifier:")
    protected static native @Pointer long create(AVSpeechSynthesisVoiceIdentifier identifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
