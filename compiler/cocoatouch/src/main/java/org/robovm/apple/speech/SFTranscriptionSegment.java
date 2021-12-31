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
package org.robovm.apple.speech;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Speech") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFTranscriptionSegment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SFTranscriptionSegmentPtr extends Ptr<SFTranscriptionSegment, SFTranscriptionSegmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFTranscriptionSegment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFTranscriptionSegment() {}
    protected SFTranscriptionSegment(Handle h, long handle) { super(h, handle); }
    protected SFTranscriptionSegment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SFTranscriptionSegment(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "substring")
    public native String getSubstring();
    @Property(selector = "substringRange")
    public native @ByVal NSRange getSubstringRange();
    @Property(selector = "timestamp")
    public native double getTimestamp();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "confidence")
    public native float getConfidence();
    @Property(selector = "alternativeSubstrings")
    public native NSArray<NSString> getAlternativeSubstrings();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.5. voiceAnalytics is moved to SFSpeechRecognitionMetadata
     */
    @Deprecated
    @Property(selector = "voiceAnalytics")
    public native SFVoiceAnalytics getVoiceAnalytics();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
