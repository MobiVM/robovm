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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpeechSynthesisProviderVoice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVSpeechSynthesisProviderVoicePtr extends Ptr<AVSpeechSynthesisProviderVoice, AVSpeechSynthesisProviderVoicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpeechSynthesisProviderVoice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVSpeechSynthesisProviderVoice() {}
    protected AVSpeechSynthesisProviderVoice(Handle h, long handle) { super(h, handle); }
    protected AVSpeechSynthesisProviderVoice(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:identifier:primaryLanguages:supportedLanguages:")
    public AVSpeechSynthesisProviderVoice(String name, String identifier, NSArray<NSString> primaryLanguages, NSArray<NSString> supportedLanguages) { super((SkipInit) null); initObject(init(name, identifier, primaryLanguages, supportedLanguages)); }
    @Method(selector = "initWithCoder:")
    public AVSpeechSynthesisProviderVoice(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "primaryLanguages")
    public native NSArray<NSString> getPrimaryLanguages();
    @Property(selector = "supportedLanguages")
    public native NSArray<NSString> getSupportedLanguages();
    @Property(selector = "voiceSize")
    public native long getVoiceSize();
    @Property(selector = "setVoiceSize:")
    public native void setVoiceSize(long v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    @Property(selector = "gender")
    public native AVSpeechSynthesisVoiceGender getGender();
    @Property(selector = "setGender:")
    public native void setGender(AVSpeechSynthesisVoiceGender v);
    @Property(selector = "age")
    public native @MachineSizedSInt long getAge();
    @Property(selector = "setAge:")
    public native void setAge(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:identifier:primaryLanguages:supportedLanguages:")
    protected native @Pointer long init(String name, String identifier, NSArray<NSString> primaryLanguages, NSArray<NSString> supportedLanguages);
    @Method(selector = "updateSpeechVoices")
    public static native void updateSpeechVoices();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
