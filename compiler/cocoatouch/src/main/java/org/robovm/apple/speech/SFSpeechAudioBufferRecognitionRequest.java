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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSpeechAudioBufferRecognitionRequest/*</name>*/ 
    extends /*<extends>*/SFSpeechRecognitionRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSpeechAudioBufferRecognitionRequestPtr extends Ptr<SFSpeechAudioBufferRecognitionRequest, SFSpeechAudioBufferRecognitionRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSpeechAudioBufferRecognitionRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSpeechAudioBufferRecognitionRequest() {}
    protected SFSpeechAudioBufferRecognitionRequest(Handle h, long handle) { super(h, handle); }
    protected SFSpeechAudioBufferRecognitionRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nativeAudioFormat")
    public native AVAudioFormat getNativeAudioFormat();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "appendAudioPCMBuffer:")
    public native void appendAudioPCMBuffer(AVAudioPCMBuffer audioPCMBuffer);
    @Method(selector = "appendAudioSampleBuffer:")
    public native void appendAudioSampleBuffer(CMSampleBuffer sampleBuffer);
    @Method(selector = "endAudio")
    public native void endAudio();
    /*</methods>*/
}
